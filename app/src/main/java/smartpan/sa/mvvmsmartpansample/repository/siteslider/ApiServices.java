package smartpan.sa.mvvmsmartpansample.repository.siteslider;

import android.content.Context;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConfig;

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
     * generate observable to get site slider
     */
    public Single<Response<ApiResponse>> getSiteSliderObservable() {

        ApiInterface method = retrofit.create(ApiInterface.class);

        return method
                .getSiteSlider()
                .singleOrError()
                .subscribeOn(Schedulers.io());
    }


}
