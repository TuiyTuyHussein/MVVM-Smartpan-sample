package smartpan.sa.mvvmsmartpansample.model.pojo.bestlist;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Data implements Serializable {

    @SerializedName("BestSellerList")
    private List<BestSellerListItem> bestSellerList;

    @SerializedName("BestOfferList")
    private List<BestOfferListItem> bestOfferList;

    public List<BestSellerListItem> getBestSellerList() {
        return bestSellerList;
    }

    public void setBestSellerList(List<BestSellerListItem> bestSellerList) {
        this.bestSellerList = bestSellerList;
    }

    public List<BestOfferListItem> getBestOfferList() {
        return bestOfferList;
    }

    public void setBestOfferList(List<BestOfferListItem> bestOfferList) {
        this.bestOfferList = bestOfferList;
    }

    @Override
    public String toString() {
        return
                "Data{" +
                        "bestSellerList = '" + bestSellerList + '\'' +
                        ",bestOfferList = '" + bestOfferList + '\'' +
                        "}";
    }
}