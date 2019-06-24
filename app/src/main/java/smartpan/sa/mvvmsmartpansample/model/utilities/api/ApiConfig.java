package smartpan.sa.mvvmsmartpansample.model.utilities.api;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class ApiConfig {

    private final static int CACHE_SIZE_BYTES = 1024 * 1024 * 2;
    private static Retrofit retrofit;
    private static OkHttpClient client;

    public static Retrofit getRetrofit(Context context) {
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .client(getClient(context))
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        return retrofit;

    }

    private static OkHttpClient getClient(Context context) {
        if (client == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            client = new OkHttpClient.Builder()
                    .cache(getCacheDir(context))
                    .addInterceptor(interceptor)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .build();
        }

        return client;
    }


    private static Cache getCacheDir(Context context) {
        if (context == null) return null;
        return new Cache(context.getCacheDir(), CACHE_SIZE_BYTES);
    }


}
