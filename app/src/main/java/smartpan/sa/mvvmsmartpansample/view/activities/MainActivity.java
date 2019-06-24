package smartpan.sa.mvvmsmartpansample.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import smartpan.sa.mvvmsmartpansample.R;
import smartpan.sa.mvvmsmartpansample.databinding.ActivityMainBinding;
import smartpan.sa.mvvmsmartpansample.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    private CategoriesAdapter categoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        initRecyclerView();

        getCategories();
    }

    private void initRecyclerView() {
        categoriesAdapter = new CategoriesAdapter();
        binding.rvCategories.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        binding.rvCategories.setAdapter(categoriesAdapter);
    }

    private void getCategories() {
        mainViewModel.getCategoriesMutableLiveData()
                .observe(this, categoriesResponse -> {
                    categoriesAdapter.setCategoriesList(categoriesResponse.getCategoryList());
                });


    }


    private void initDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.setContext(this);
        binding.setMainViewModel(mainViewModel);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
