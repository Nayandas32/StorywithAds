package com.example.storyad;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class story6 extends AppCompatActivity {
    private Button btn;
    private TextView tv;
    AdView adView1;
    AdView adView2;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story6);
        btn =(Button)findViewById(R.id.read);
        tv =(TextView) findViewById(R.id.text1);
        adView1 = (AdView)findViewById(R.id.adB1);
        adView2 = (AdView)findViewById(R.id.adB2);


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        adView1 = findViewById(R.id.adB1);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);

        adView2 = findViewById(R.id.adB2);

        adView2.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory1();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory1();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
    }
    public void openStory1(){
        tv.setMovementMethod(new ScrollingMovementMethod());
        String data = "";
        StringBuffer sbuffer = new StringBuffer();
        InputStream is = this.getResources().openRawResource(R.raw.t6);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if (is != null){
            try {
                while ((data=reader.readLine())!=null){
                    sbuffer.append(data + "n");
                }
                tv.setText(sbuffer);
                is.close();

            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}