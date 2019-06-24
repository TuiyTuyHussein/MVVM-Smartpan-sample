package smartpan.sa.mvvmsmartpansample.repository.bestlist;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import smartpan.sa.mvvmsmartpansample.model.pojo.bestlist.BestListResponse;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConstants;

public interface ApiInterfaceBestList {



    @GET(ApiConstants.METHOD_GET_BEST_LIST)
    Observable<Response<BestListResponse>> getBestList();



}
