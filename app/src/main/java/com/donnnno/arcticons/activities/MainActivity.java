package com.donnnno.arcticons.activities;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.donnnno.arcticons.R;
import com.donnnno.arcticons.utils.ImageUtils;
import com.donnnno.arcticons.utils.IntentUtils;
import com.donnnno.arcticons.utils.ScreenUtils;
import com.donnnno.arcticons.views.CenterButton;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createLayout();
    }

    private void createLayout() {

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        baseLayout.setGravity(Gravity.CENTER);
        baseLayout.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
        setContentView(baseLayout);

        //Icons
        CenterButton icons = new CenterButton(this);
        icons.setForeground(R.color.textColor);
        icons.setBackground(R.color.backgroundColor);
        icons.setText(R.string.icons);
        icons.setIcon(R.drawable.ic_icon_button);
        icons.setOnClickListener((v) -> IntentUtils.openActivity(this, IconActivity.class));
        baseLayout.addView(icons);

        //Source
        CenterButton source = new CenterButton(this);
        source.setForeground(R.color.textColor);
        source.setBackground(R.color.backgroundColor);
        source.setText(R.string.source);
        source.setIcon(R.drawable.ic_source_button);
        source.setOnClickListener((v) -> IntentUtils.openActivity(this, SourceActivity.class));
        baseLayout.addView(source);

        //Support
        CenterButton support = new CenterButton(this);
        support.setForeground(R.color.textColor);
        support.setBackground(R.color.backgroundColor);
        support.setText(R.string.support);
        support.setIcon(R.drawable.ic_support_button);
        support.setOnClickListener((v) -> IntentUtils.openUrl(this, R.string.url_support));
        baseLayout.addView(support);

        //Color mode
        CenterButton colormode = new CenterButton(this);
        colormode.setForeground(R.color.textColor);
        colormode.setBackground(R.color.backgroundColor);
        colormode.setText(R.string.colorMode);
        colormode.setIcon(R.drawable.ic_support_button);
        colormode.setOnClickListener((v) -> IntentUtils.openActivity(this, ColorActivity.class));
        baseLayout.addView(colormode);

    }
}