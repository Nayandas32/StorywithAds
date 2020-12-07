package com.example.storyad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    private TextView tv;
    private InterstitialAd mInterstitialAd;
    AdView adView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =(Button)findViewById(R.id.btn1);
        btn2 =(Button)findViewById(R.id.btn2);
        btn3 =(Button)findViewById(R.id.btn3);
        btn4 =(Button)findViewById(R.id.btn4);
        btn5 =(Button)findViewById(R.id.btn5);
        btn6 =(Button)findViewById(R.id.btn6);
        btn7 =(Button)findViewById(R.id.btn7);
        btn8 =(Button)findViewById(R.id.btn8);
        btn9 =(Button)findViewById(R.id.btn9);
        btn10 =(Button)findViewById(R.id.btn10);

        //baner ad
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        //intersritialad
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        //banner ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        adView1 = findViewById(R.id.adB1);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);



        btn1.setOnClickListener(new View.OnClickListener() {
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
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory2();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory2();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory3();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory3();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory4();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory4();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory5();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory5();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory6();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory6();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory7();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory7();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory8();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory8();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory9();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory9();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openStory10();
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        openStory10();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });




    }
    public void openStory1(){

        Intent intent = new Intent(this,story1.class);
        startActivity(intent);
    }
    public void openStory2(){

        Intent intent = new Intent(this,story2.class);
        startActivity(intent);
    }
    public void openStory3(){

        Intent intent = new Intent(this,story3.class);
        startActivity(intent);
    }
    public void openStory4(){

        Intent intent = new Intent(this,story4.class);
        startActivity(intent);
    }
    public void openStory5(){

        Intent intent = new Intent(this,story5.class);
        startActivity(intent);
    }
    public void openStory6(){

        Intent intent = new Intent(this,story6.class);
        startActivity(intent);
    }
    public void openStory7(){

        Intent intent = new Intent(this,story7.class);
        startActivity(intent);
    }
    public void openStory8(){

        Intent intent = new Intent(this,story8.class);
        startActivity(intent);
    }
    public void openStory9(){

        Intent intent = new Intent(this,story9.class);
        startActivity(intent);
    }
    public void openStory10(){

        Intent intent = new Intent(this,story10.class);
        startActivity(intent);
    }

}