// ThemeManager Class 
public class ThemeManager {

    private static final String PREFS_NAME = "theme_prefs";
    private static final String KEY_IS_NIGHT = "is_night";

    // Call this in Application class or BaseActivity to apply theme on startup
    public static void applyTheme(Context context) {

        boolean isNight = isNightMode(context);
        AppCompatDelegate.setDefaultNightMode(
                isNight ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO
        );
    }

    // Save theme preference
    public static void saveTheme(Context context, boolean isNight) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        prefs.edit().putBoolean(KEY_IS_NIGHT, isNight).apply();

        AppCompatDelegate.setDefaultNightMode(
                isNight ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO
        );
    }

    // Get current theme preference
    public static boolean isNightMode(Context context) {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .getBoolean(KEY_IS_NIGHT, false);
    }
}
