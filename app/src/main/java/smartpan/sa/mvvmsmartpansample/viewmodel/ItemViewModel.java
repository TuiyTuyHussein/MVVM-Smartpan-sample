package smartpan.sa.mvvmsmartpansample.viewmodel;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

import com.squareup.picasso.Picasso;

import smartpan.sa.mvvmsmartpansample.model.pojo.bestlist.BestOfferListItem;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoryListItem;
import smartpan.sa.mvvmsmartpansample.model.pojo.siteslider.SiteSliderListItem;

public class ItemViewModel<T> extends ViewModel {
    T item;

    public ItemViewModel(T item) {
        this.item = item;
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getName() {
        if (item instanceof CategoryListItem)
            return ((CategoryListItem) item).getEnglishName();
        else if (item instanceof BestOfferListItem)
            return ((BestOfferListItem) item).getEnglishName();
        else if (item instanceof SiteSliderListItem)
            return ((SiteSliderListItem) item).getHeaderEN();
        return null;
    }

    public String getImageUrl() {
        if (item instanceof CategoryListItem)
            return ((CategoryListItem) item).getCategoryImage();
        else if (item instanceof BestOfferListItem)
            return ((BestOfferListItem) item).getCategoryImage();
        else if (item instanceof SiteSliderListItem)
            return ((SiteSliderListItem) item).getStoryImage();
        return null;
    }


    public void onClick(View view) {
        Toast.makeText(view.getContext(), "It's All Right \n" + getName(), Toast.LENGTH_LONG).show();
    }

}
