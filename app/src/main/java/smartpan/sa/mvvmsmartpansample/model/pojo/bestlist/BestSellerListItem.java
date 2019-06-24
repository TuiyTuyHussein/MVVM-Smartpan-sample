package smartpan.sa.mvvmsmartpansample.model.pojo.bestlist;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BestSellerListItem implements Serializable {

    @SerializedName("CategoryId")
    private int categoryId;

    @SerializedName("ColorList")
    private List<ColorListItem> colorList;

    @SerializedName("ItemCode")
    private String itemCode;

    @SerializedName("CategoryImage")
    private String categoryImage;

    @SerializedName("ReviewStars")
    private int reviewStars;

    @SerializedName("IsActive")
    private boolean isActive;

    @SerializedName("ArabicDetails")
    private String arabicDetails;

    @SerializedName("BrandId")
    private int brandId;

    @SerializedName("SizeList")
    private List<SizeListItem> sizeList;

    @SerializedName("DescEN")
    private Object descEN;

    @SerializedName("CategoryArabicName")
    private String categoryArabicName;

    @SerializedName("PromotionUnitPrice")
    private int promotionUnitPrice;

    @SerializedName("EnglishDetails")
    private Object englishDetails;

    @SerializedName("BrandArabicName")
    private String brandArabicName;

    @SerializedName("RefNumber")
    private String refNumber;

    @SerializedName("ItemOrder")
    private int itemOrder;

    @SerializedName("DescAR")
    private String descAR;

    @SerializedName("RecieveDetails")
    private List<Object> recieveDetails;

    @SerializedName("ArabicName")
    private String arabicName;

    @SerializedName("UnitPrice")
    private int unitPrice;

    @SerializedName("CategoryVideo")
    private String categoryVideo;

    @SerializedName("IsNewItem")
    private boolean isNewItem;

    @SerializedName("CategoryEnglishName")
    private String categoryEnglishName;

    @SerializedName("IsPromotion")
    private boolean isPromotion;

    @SerializedName("Id")
    private int id;

    @SerializedName("BrandEnglishName")
    private String brandEnglishName;

    @SerializedName("EnglishName")
    private String englishName;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List<ColorListItem> getColorList() {
        return colorList;
    }

    public void setColorList(List<ColorListItem> colorList) {
        this.colorList = colorList;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public int getReviewStars() {
        return reviewStars;
    }

    public void setReviewStars(int reviewStars) {
        this.reviewStars = reviewStars;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getArabicDetails() {
        return arabicDetails;
    }

    public void setArabicDetails(String arabicDetails) {
        this.arabicDetails = arabicDetails;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public List<SizeListItem> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<SizeListItem> sizeList) {
        this.sizeList = sizeList;
    }

    public Object getDescEN() {
        return descEN;
    }

    public void setDescEN(Object descEN) {
        this.descEN = descEN;
    }

    public String getCategoryArabicName() {
        return categoryArabicName;
    }

    public void setCategoryArabicName(String categoryArabicName) {
        this.categoryArabicName = categoryArabicName;
    }

    public int getPromotionUnitPrice() {
        return promotionUnitPrice;
    }

    public void setPromotionUnitPrice(int promotionUnitPrice) {
        this.promotionUnitPrice = promotionUnitPrice;
    }

    public Object getEnglishDetails() {
        return englishDetails;
    }

    public void setEnglishDetails(Object englishDetails) {
        this.englishDetails = englishDetails;
    }

    public String getBrandArabicName() {
        return brandArabicName;
    }

    public void setBrandArabicName(String brandArabicName) {
        this.brandArabicName = brandArabicName;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public int getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(int itemOrder) {
        this.itemOrder = itemOrder;
    }

    public String getDescAR() {
        return descAR;
    }

    public void setDescAR(String descAR) {
        this.descAR = descAR;
    }

    public List<Object> getRecieveDetails() {
        return recieveDetails;
    }

    public void setRecieveDetails(List<Object> recieveDetails) {
        this.recieveDetails = recieveDetails;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategoryVideo() {
        return categoryVideo;
    }

    public void setCategoryVideo(String categoryVideo) {
        this.categoryVideo = categoryVideo;
    }

    public boolean isIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem(boolean isNewItem) {
        this.isNewItem = isNewItem;
    }

    public String getCategoryEnglishName() {
        return categoryEnglishName;
    }

    public void setCategoryEnglishName(String categoryEnglishName) {
        this.categoryEnglishName = categoryEnglishName;
    }

    public boolean isIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandEnglishName() {
        return brandEnglishName;
    }

    public void setBrandEnglishName(String brandEnglishName) {
        this.brandEnglishName = brandEnglishName;
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
                "BestSellerListItem{" +
                        "categoryId = '" + categoryId + '\'' +
                        ",colorList = '" + colorList + '\'' +
                        ",itemCode = '" + itemCode + '\'' +
                        ",categoryImage = '" + categoryImage + '\'' +
                        ",reviewStars = '" + reviewStars + '\'' +
                        ",isActive = '" + isActive + '\'' +
                        ",arabicDetails = '" + arabicDetails + '\'' +
                        ",brandId = '" + brandId + '\'' +
                        ",sizeList = '" + sizeList + '\'' +
                        ",descEN = '" + descEN + '\'' +
                        ",categoryArabicName = '" + categoryArabicName + '\'' +
                        ",promotionUnitPrice = '" + promotionUnitPrice + '\'' +
                        ",englishDetails = '" + englishDetails + '\'' +
                        ",brandArabicName = '" + brandArabicName + '\'' +
                        ",refNumber = '" + refNumber + '\'' +
                        ",itemOrder = '" + itemOrder + '\'' +
                        ",descAR = '" + descAR + '\'' +
                        ",recieveDetails = '" + recieveDetails + '\'' +
                        ",arabicName = '" + arabicName + '\'' +
                        ",unitPrice = '" + unitPrice + '\'' +
                        ",categoryVideo = '" + categoryVideo + '\'' +
                        ",isNewItem = '" + isNewItem + '\'' +
                        ",categoryEnglishName = '" + categoryEnglishName + '\'' +
                        ",isPromotion = '" + isPromotion + '\'' +
                        ",id = '" + id + '\'' +
                        ",brandEnglishName = '" + brandEnglishName + '\'' +
                        ",englishName = '" + englishName + '\'' +
                        "}";
    }
}