/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.vitinhvominh.vominh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * This contain the main activity. <br>
 * Such as: Showing list, Add and Edit buttons, etc.
 *
 * @author TienNguyen
 */
public class MainActivity extends AppCompatActivity {
    private ImageView banner;
    private TextView copyright;
    private TextView companyName;

    /**
     * Starting point of main activity.
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial view(s)
        initView();

        // Initial function(s)
        initFunction();
    }

    /**
     * Initial view(s) inside of main activity
     */
    private void initView() {
        banner = (ImageView) findViewById(R.id.banner);
        copyright = (TextView) findViewById(R.id.copyright);
        companyName = (TextView) findViewById(R.id.name_value);
    }

    /**
     * Initial function(s) inside of main activity
     */
    private void initFunction() {
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeb();
            }
        });

        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeb();
            }
        });

        companyName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeb();
            }
        });
    }

    private void openWeb() {
        String url = getResources().getString(R.string.copyright_website);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://" + url.toLowerCase()));
        startActivity(i);
    }
}
