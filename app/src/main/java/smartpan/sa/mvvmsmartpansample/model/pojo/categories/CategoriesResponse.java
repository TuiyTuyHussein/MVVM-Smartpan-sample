package smartpan.sa.mvvmsmartpansample.model.pojo.categories;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CategoriesResponse implements Serializable {

    @SerializedName("CategoryList")
    private List<CategoryListItem> categoryList;

    @SerializedName("success")
    private String success;

    public List<CategoryListItem> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryListItem> categoryList) {
        this.categoryList = categoryList;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return
                "CategoriesResponse{" +
                        "categoryList = '" + categoryList + '\'' +
                        ",success = '" + success + '\'' +
                        "}";
    }
}