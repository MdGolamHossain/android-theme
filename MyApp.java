// This is a class extends application.. this class will be call first time when you app will be open 

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ThemeManager.applyTheme(this);
    }
}
