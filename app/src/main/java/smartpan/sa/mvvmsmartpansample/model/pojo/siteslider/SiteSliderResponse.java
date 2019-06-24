package smartpan.sa.mvvmsmartpansample.model.pojo.siteslider;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SiteSliderResponse implements Serializable {

    @SerializedName("success")
    private String success;

    @SerializedName("SiteSliderList")
    private List<SiteSliderListItem> siteSliderList;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<SiteSliderListItem> getSiteSliderList() {
        return siteSliderList;
    }

    public void setSiteSliderList(List<SiteSliderListItem> siteSliderList) {
        this.siteSliderList = siteSliderList;
    }

    @Override
    public String toString() {
        return
                "SiteSliderResponse{" +
                        "success = '" + success + '\'' +
                        ",siteSliderList = '" + siteSliderList + '\'' +
                        "}";
    }
}