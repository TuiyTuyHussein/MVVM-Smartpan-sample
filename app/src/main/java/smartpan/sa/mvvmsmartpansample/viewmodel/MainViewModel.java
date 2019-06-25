package smartpan.sa.mvvmsmartpansample.viewmodel;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;
import smartpan.sa.mvvmsmartpansample.model.pojo.bestlist.BestListResponse;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoriesResponse;
import smartpan.sa.mvvmsmartpansample.model.pojo.siteslider.SiteSliderResponse;
import smartpan.sa.mvvmsmartpansample.repository.bestlist.ApiServicesBestList;
import smartpan.sa.mvvmsmartpansample.repository.categories.ApiServicesCategories;
import smartpan.sa.mvvmsmartpansample.repository.siteslider.ApiServicesSiteSlider;

public class MainViewModel extends PermissionsViewModel {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<CategoriesResponse> categoriesMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<BestListResponse> bestListMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<SiteSliderResponse> siteSliderMutableLiveData = new MutableLiveData<>();
    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public MutableLiveData<BestListResponse> getBestListMutableLiveData() {
        loadBestList();
        return bestListMutableLiveData;
    }

    public MutableLiveData<CategoriesResponse> getCategoriesMutableLiveData() {
        loadCategories();
        return categoriesMutableLiveData;
    }

    public MutableLiveData<SiteSliderResponse> getSiteSliderMutableLiveData() {
        loadSiteSlide();
        return siteSliderMutableLiveData;
    }

    private void loadCategories() {
        compositeDisposable.add(ApiServicesCategories
                .open(context).getCategoriesObservable()
                .subscribe(((response, throwable) -> {
                    if (response.isSuccessful())
                        categoriesMutableLiveData.setValue(response.body());
                })));

    }


    private void loadBestList() {
        compositeDisposable.add(ApiServicesBestList
                .open(context).getBestListObservable()
                .subscribe(((response, throwable) -> {
                    if (response.isSuccessful())
                        bestListMutableLiveData.setValue(response.body());
                })));

    }


    private void loadSiteSlide() {
        compositeDisposable.add(ApiServicesSiteSlider
                .open(context).getSiteSliderObservable()
                .subscribe(((response, throwable) -> {
                    if (response.isSuccessful())
                        siteSliderMutableLiveData.setValue(response.body());
                })));

    }


    public void unbind() {
        compositeDisposable.clear();
    }

    @Override
    public void onPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }
}
