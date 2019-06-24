package smartpan.sa.mvvmsmartpansample.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import smartpan.sa.mvvmsmartpansample.R;
import smartpan.sa.mvvmsmartpansample.databinding.ActivityMainBinding;
import smartpan.sa.mvvmsmartpansample.model.pojo.bestlist.BestOfferListItem;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoryListItem;
import smartpan.sa.mvvmsmartpansample.model.pojo.siteslider.SiteSliderListItem;
import smartpan.sa.mvvmsmartpansample.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    private ItemsAdapter<CategoryListItem> categoriesAdapter;
    private ItemsAdapter<BestOfferListItem> bestOfferListItemItemsAdapter;
    private ItemsAdapter<SiteSliderListItem> siteSliderListItemItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        initRecyclerView();

        observeRequests();
    }

    private void initRecyclerView() {
        categoriesAdapter = new ItemsAdapter<>();
        bestOfferListItemItemsAdapter = new ItemsAdapter<>();
        siteSliderListItemItemsAdapter = new ItemsAdapter<>();
        binding.rvCategories.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        binding.rvBestList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        binding.rvSiteSlider.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        binding.rvCategories.setAdapter(categoriesAdapter);
        binding.rvBestList.setAdapter(bestOfferListItemItemsAdapter);
        binding.rvSiteSlider.setAdapter(siteSliderListItemItemsAdapter);
    }

    private void observeRequests() {
        mainViewModel.getCategoriesMutableLiveData()
                .observe(this, response -> categoriesAdapter.setArray(response.getCategoryList()));


        mainViewModel.getBestListMutableLiveData()
                .observe(this, response -> bestOfferListItemItemsAdapter.setArray(response.getData().getBestOfferList()));


        mainViewModel.getSiteSliderMutableLiveData()
                .observe(this, response -> siteSliderListItemItemsAdapter.setArray(response.getSiteSliderList()));
    }


    private void initDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.setContext(this);
        binding.setMainViewModel(mainViewModel);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainViewModel.unbind();
    }
}
