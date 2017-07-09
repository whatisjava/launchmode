package com.showtoyou.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by xtang on 2017/7/9.
 */

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(22.0f);
        textView.setText("Third Activity");

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, FourthActivity.class));
            }
        });

        setContentView(textView);
    }
}
