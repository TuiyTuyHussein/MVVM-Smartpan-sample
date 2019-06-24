package smartpan.sa.mvvmsmartpansample.model.webservices.methods;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConstants;

public interface ApiInterface {


    @GET(ApiConstants.METHOD_GET_CATEGORIES)
    Observable<Response<ApiResponse>> getCategories();

    @GET(ApiConstants.METHOD_GET_BEST_LIST)
    Observable<Response<ApiResponse>> getBestList();

    @GET(ApiConstants.METHOD_GET_SITE_SLIDER)
    Observable<Response<ApiResponse>> getSiteSlider();


}
