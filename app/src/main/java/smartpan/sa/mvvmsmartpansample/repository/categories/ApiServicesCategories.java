package smartpan.sa.mvvmsmartpansample.repository.categories;

import android.content.Context;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoriesResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConfig;

public class ApiServicesCategories {


    private static ApiServicesCategories apiServices;

    private static Retrofit retrofit;

    public static synchronized ApiServicesCategories open(Context context) {
        if (retrofit == null)
            retrofit = ApiConfig.getRetrofit(context);
        if (apiServices == null) {
            apiServices = new ApiServicesCategories();
        }
        return apiServices;
    }


    /**
     * generate observable to get categories
     */
    public Single<Response<CategoriesResponse>> getCategoriesObservable() {

        ApiInterfaceCategories method = retrofit.create(ApiInterfaceCategories.class);

        return method
                .getCategories()
                .singleOrError()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }


}
