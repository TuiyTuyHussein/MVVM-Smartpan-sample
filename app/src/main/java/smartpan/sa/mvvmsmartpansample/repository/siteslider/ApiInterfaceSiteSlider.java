package smartpan.sa.mvvmsmartpansample.repository.siteslider;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.pojo.siteslider.SiteSliderResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConstants;

public interface ApiInterfaceSiteSlider {


    @GET(ApiConstants.METHOD_GET_SITE_SLIDER)
    Observable<Response<SiteSliderResponse>> getSiteSlider();


}
