package smartpan.sa.mvvmsmartpansample.model.pojo.siteslider;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SiteSliderListItem implements Serializable {

    @SerializedName("ContentAR")
    private Object contentAR;

    @SerializedName("HeaderEN")
    private String headerEN;

    @SerializedName("ArabicTitle")
    private Object arabicTitle;

    @SerializedName("EnglishTitle")
    private Object englishTitle;

    @SerializedName("StoryImage")
    private String storyImage;

    @SerializedName("BackGroundImage")
    private String backGroundImage;

    @SerializedName("Id")
    private int id;

    @SerializedName("Sequence")
    private int sequence;

    @SerializedName("ContentEN")
    private Object contentEN;

    @SerializedName("HeaderAR")
    private String headerAR;

    public Object getContentAR() {
        return contentAR;
    }

    public void setContentAR(Object contentAR) {
        this.contentAR = contentAR;
    }

    public String getHeaderEN() {
        return headerEN;
    }

    public void setHeaderEN(String headerEN) {
        this.headerEN = headerEN;
    }

    public Object getArabicTitle() {
        return arabicTitle;
    }

    public void setArabicTitle(Object arabicTitle) {
        this.arabicTitle = arabicTitle;
    }

    public Object getEnglishTitle() {
        return englishTitle;
    }

    public void setEnglishTitle(Object englishTitle) {
        this.englishTitle = englishTitle;
    }

    public String getStoryImage() {
        return storyImage;
    }

    public void setStoryImage(String storyImage) {
        this.storyImage = storyImage;
    }

    public String getBackGroundImage() {
        return backGroundImage;
    }

    public void setBackGroundImage(String backGroundImage) {
        this.backGroundImage = backGroundImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public Object getContentEN() {
        return contentEN;
    }

    public void setContentEN(Object contentEN) {
        this.contentEN = contentEN;
    }

    public String getHeaderAR() {
        return headerAR;
    }

    public void setHeaderAR(String headerAR) {
        this.headerAR = headerAR;
    }

    @Override
    public String toString() {
        return
                "SiteSliderListItem{" +
                        "contentAR = '" + contentAR + '\'' +
                        ",headerEN = '" + headerEN + '\'' +
                        ",arabicTitle = '" + arabicTitle + '\'' +
                        ",englishTitle = '" + englishTitle + '\'' +
                        ",storyImage = '" + storyImage + '\'' +
                        ",backGroundImage = '" + backGroundImage + '\'' +
                        ",id = '" + id + '\'' +
                        ",sequence = '" + sequence + '\'' +
                        ",contentEN = '" + contentEN + '\'' +
                        ",headerAR = '" + headerAR + '\'' +
                        "}";
    }
}