package smartpan.sa.mvvmsmartpansample.repository.siteslider;

import android.content.Context;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import smartpan.sa.mvvmsmartpansample.model.pojo.siteslider.SiteSliderResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConfig;

public class ApiServicesSiteSlider {


    private static ApiServicesSiteSlider apiServices;

    private static Retrofit retrofit;

    public static synchronized ApiServicesSiteSlider open(Context context) {
        if (retrofit == null)
            retrofit = ApiConfig.getRetrofit(context);
        if (apiServices == null) {
            apiServices = new ApiServicesSiteSlider();
        }
        return apiServices;
    }


    /**
     * generate observable to get site slider
     */
    public Single<Response<SiteSliderResponse>> getSiteSliderObservable() {

        ApiInterfaceSiteSlider method = retrofit.create(ApiInterfaceSiteSlider.class);

        return method
                .getSiteSlider()
                .singleOrError()
                .subscribeOn(Schedulers.io());
    }


}
