package smartpan.sa.mvvmsmartpansample.repository.bestlist;

import android.content.Context;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import smartpan.sa.mvvmsmartpansample.model.pojo.bestlist.BestListResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConfig;

public class ApiServicesBestList {


    private static ApiServicesBestList apiServices;

    private static Retrofit retrofit;

    public static synchronized ApiServicesBestList open(Context context) {
        if (retrofit == null)
            retrofit = ApiConfig.getRetrofit(context);
        if (apiServices == null) {
            apiServices = new ApiServicesBestList();
        }
        return apiServices;
    }


    /**
     * generate observable to get best list
     */
    public Single<Response<BestListResponse>> getBestListObservable() {

        ApiInterfaceBestList method = retrofit.create(ApiInterfaceBestList.class);

        return method
                .getBestList()
                .singleOrError()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }


}
