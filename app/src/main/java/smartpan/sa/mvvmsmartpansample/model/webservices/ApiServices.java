package smartpan.sa.mvvmsmartpansample.model.webservices;

import android.content.Context;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConfig;
import smartpan.sa.mvvmsmartpansample.model.webservices.methods.ApiInterface;

public class ApiServices {


    private static ApiServices apiServices;

    private static Retrofit retrofit;

    public static synchronized ApiServices open(Context context) {
        if (retrofit == null)
            retrofit = ApiConfig.getRetrofit(context);
        if (apiServices == null) {
            apiServices = new ApiServices();
        }
        return apiServices;
    }


    /**
     * generate observable to get info for user
     */
    public Single<Response<ApiResponse>> getCategoriesObservable() {

        ApiInterface method = retrofit.create(ApiInterface.class);

        return method
                .getCategories()
                .singleOrError()
                .subscribeOn(Schedulers.io());
    }


}
