package smartpan.sa.mvvmsmartpansample.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.Serializable;
import java.util.List;

public abstract class PermissionsViewModel extends ViewModel {
    private MutableLiveData<PermissionsModel> permissionsRequest;


    public MutableLiveData<PermissionsModel> getPermissionsRequest() {
        if (permissionsRequest == null)
            permissionsRequest = new MutableLiveData<>();
        return permissionsRequest;
    }

    public abstract void onPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);


    public class PermissionsModel implements Serializable {
        int requestCode;
        List<String> permissions;

        public PermissionsModel(int requestCode, List<String> permissions) {
            this.requestCode = requestCode;
            this.permissions = permissions;
        }
    }
}
