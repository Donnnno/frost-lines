package com.donnnno.arcticons.activities;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.donnnno.arcticons.R;
import com.donnnno.arcticons.utils.IntentUtils;
import com.donnnno.arcticons.views.CenterButton;

public class LicenseActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createLayout();
    }

    private void createLayout() {
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT));
        baseLayout.setGravity(Gravity.START);
        baseLayout.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        setContentView(baseLayout);

        CenterButton code = new CenterButton(this);
        code.setForeground(R.color.textColor);
        code.setBackground(R.color.backgroundColor);
        code.setText(R.string.description_code);
        code.disableIcon();
        code.setOnClickListener((v) -> IntentUtils.openUrl(this, R.string.url_gplv3));
        baseLayout.addView(code);

        CenterButton images = new CenterButton(this);
        images.setForeground(R.color.textColor);
        images.setBackground(R.color.backgroundColor);
        images.setText(R.string.description_images);
        images.disableIcon();
        images.setOnClickListener((v) -> IntentUtils.openUrl(this, R.string.url_ccbysa4));
        baseLayout.addView(images);
    }
}
