packge here


public class SettingActivity extends AppCompatActivity {

    ActivitySettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeManager.applyTheme(this); // Apply theme before setContentView
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.switchTheme.setChecked(ThemeManager.isNightMode(this));
        binding.switchTheme.setOnCheckedChangeListener((buttonView, isChecked) -> {
            ThemeManager.saveTheme(this, isChecked);
            recreate();
        });




    }//OnCrete bungle end here
}
