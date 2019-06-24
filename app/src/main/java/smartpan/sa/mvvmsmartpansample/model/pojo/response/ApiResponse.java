package smartpan.sa.mvvmsmartpansample.model.pojo.response;

public class ApiResponse<T> {
    private T data;
    private String message;
    private ApiError error;


    public ApiError getError() {
        return error;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
