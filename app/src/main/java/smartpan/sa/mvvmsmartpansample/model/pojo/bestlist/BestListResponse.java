package smartpan.sa.mvvmsmartpansample.model.pojo.bestlist;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BestListResponse implements Serializable {

    @SerializedName("success")
    private String success;

    @SerializedName("Data")
    private Data data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return
                "BestListResponse{" +
                        "success = '" + success + '\'' +
                        ",data = '" + data + '\'' +
                        "}";
    }
}