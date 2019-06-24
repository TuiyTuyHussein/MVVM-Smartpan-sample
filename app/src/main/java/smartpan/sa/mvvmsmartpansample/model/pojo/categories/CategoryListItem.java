package smartpan.sa.mvvmsmartpansample.model.pojo.categories;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CategoryListItem implements Serializable {

    @SerializedName("CategoryImage")
    private String categoryImage;

    @SerializedName("Id")
    private int id;

    @SerializedName("ArabicName")
    private String arabicName;

    @SerializedName("EnglishName")
    private String englishName;

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public String toString() {
        return
                "CategoryListItem{" +
                        "categoryImage = '" + categoryImage + '\'' +
                        ",id = '" + id + '\'' +
                        ",arabicName = '" + arabicName + '\'' +
                        ",englishName = '" + englishName + '\'' +
                        "}";
    }
}