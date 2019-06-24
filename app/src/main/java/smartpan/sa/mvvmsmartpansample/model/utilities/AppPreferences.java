package smartpan.sa.mvvmsmartpansample.model.utilities;

import android.content.Context;

import java.util.Locale;

public class AppPreferences {

    public static final String VALUE_ARABIC_LANGUAGE_CODE = "ar";
    public static final String VALUE_ENGLISH_LANGUAGE_CODE = "en";


    private static final String KEY_LANGUAGE_CODE = "default_language_code";

    private static net.grandcentrix.tray.AppPreferences pref;
    private static AppPreferences appPreferences;

    public static synchronized AppPreferences open(Context context) {
        if (pref == null) {
            pref = new net.grandcentrix.tray.AppPreferences(context);
        }
        if (appPreferences == null) {
            appPreferences = new AppPreferences();
        }
        return appPreferences;
    }

    public void clearPref() {
        pref.clear();
    }


    /**
     * getter for default language
     *
     * @see #KEY_LANGUAGE_CODE
     */
    public String getDefaultLanguage() {
        return pref.getString(KEY_LANGUAGE_CODE, new Locale(VALUE_ARABIC_LANGUAGE_CODE)
                .equals(Locale.getDefault())
                ? VALUE_ARABIC_LANGUAGE_CODE : VALUE_ENGLISH_LANGUAGE_CODE);
    }

    /**
     * setter for default language
     *
     * @param language default language code
     * @see #KEY_LANGUAGE_CODE
     */
    public void setDefaultLanguage(String language) {
        pref.put(KEY_LANGUAGE_CODE, language);
    }


}
