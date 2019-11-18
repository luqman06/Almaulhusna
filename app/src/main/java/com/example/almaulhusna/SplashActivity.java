 package com.example.almaulhusna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.facebook.shimmer.ShimmerFrameLayout;

 public class  SplashActivity extends AppCompatActivity {

    private static int spalashInternal = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ShimmerFrameLayout coutainer = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_contair);
        coutainer.startShimmer();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, spalashInternal);

    }
}
