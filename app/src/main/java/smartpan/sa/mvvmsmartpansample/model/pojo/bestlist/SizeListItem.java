package smartpan.sa.mvvmsmartpansample.model.pojo.bestlist;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SizeListItem implements Serializable {

    @SerializedName("ItemSizeEnglishName")
    private String itemSizeEnglishName;

    @SerializedName("ItemSizeArabicName")
    private String itemSizeArabicName;

    @SerializedName("SizeId")
    private int sizeId;

    public String getItemSizeEnglishName() {
        return itemSizeEnglishName;
    }

    public void setItemSizeEnglishName(String itemSizeEnglishName) {
        this.itemSizeEnglishName = itemSizeEnglishName;
    }

    public String getItemSizeArabicName() {
        return itemSizeArabicName;
    }

    public void setItemSizeArabicName(String itemSizeArabicName) {
        this.itemSizeArabicName = itemSizeArabicName;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public String toString() {
        return
                "SizeListItem{" +
                        "itemSizeEnglishName = '" + itemSizeEnglishName + '\'' +
                        ",itemSizeArabicName = '" + itemSizeArabicName + '\'' +
                        ",sizeId = '" + sizeId + '\'' +
                        "}";
    }
}