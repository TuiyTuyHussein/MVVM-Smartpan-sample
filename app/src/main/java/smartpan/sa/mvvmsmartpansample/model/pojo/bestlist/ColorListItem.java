package smartpan.sa.mvvmsmartpansample.model.pojo.bestlist;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ColorListItem implements Serializable {

    @SerializedName("ColorId")
    private int colorId;

    @SerializedName("ArabicName")
    private String arabicName;

    @SerializedName("EnglishName")
    private String englishName;

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
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
                "ColorListItem{" +
                        "colorId = '" + colorId + '\'' +
                        ",arabicName = '" + arabicName + '\'' +
                        ",englishName = '" + englishName + '\'' +
                        "}";
    }
}