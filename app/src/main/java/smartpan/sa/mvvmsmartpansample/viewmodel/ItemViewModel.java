package smartpan.sa.mvvmsmartpansample.viewmodel;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

import com.squareup.picasso.Picasso;

import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoriesResponse;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoryListItem;

public class ItemViewModel extends ViewModel {
    CategoryListItem item;

    public ItemViewModel(CategoryListItem item) {
        this.item = item;
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }

    public void setItem(CategoryListItem item) {
        this.item = item;
    }

    public String getName() {
        return item.getEnglishName();
    }

    public String getImageUrl() {
        return item.getCategoryImage();
    }


}
