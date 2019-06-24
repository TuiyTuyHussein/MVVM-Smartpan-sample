package smartpan.sa.mvvmsmartpansample.repository.bestlist;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConstants;

public interface ApiInterface {



    @GET(ApiConstants.METHOD_GET_BEST_LIST)
    Observable<Response<ApiResponse>> getBestList();



}
