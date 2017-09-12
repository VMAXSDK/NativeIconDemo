package com.vmax.demo.nativeicon;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vmax.android.ads.api.VmaxAdView;
import com.vmax.android.ads.common.VmaxAdListener;
import com.vmax.android.ads.exception.VmaxAdError;


/** Its Recommended To Use VMAX plugin For Android Studio To Add Your Dependencies
 and Manage Changes in AndroidManifest as Well as Proguard,
 However You Can Manually Do This By Referring To Our Documentation Or following this Demo Project  */


public class MainActivity extends AppCompatActivity {



    public   VmaxAdView vmaxAdView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vmaxAdView =(VmaxAdView) findViewById(R.id.xml_container);
        vmaxAdView.setAdListener(new VmaxAdListener() {
            @Override
            public void onAdReady(VmaxAdView vmaxAdView) {

            }

            @Override
            public void onAdError(VmaxAdError vmaxAdError) {

            }

            @Override
            public void onAdClose() {

            }

            @Override
            public void onAdMediaEnd(boolean b, long l) {

            }

            @Override
            public void onAdClick() {
                super.onAdClick();
            }

            @Override
            public void onAdMediaStart() {
                super.onAdMediaStart();
            }

            @Override
            public void onAdView(int i) {
                super.onAdView(i);
            }

            @Override
            public void onAdMediaCollapse() {
                super.onAdMediaCollapse();
            }

            @Override
            public void onAdMediaExpand() {
                super.onAdMediaExpand();
            }

            @Override
            public void onAdSkippable() {
                super.onAdSkippable();
            }

            @Override
            public void onAdRefresh() {
                super.onAdRefresh();
            }
        });



    }







    /** Handle vmaxAdView object for Activity Lifecycle changes */

    @Override
    protected void onDestroy() {
        if (vmaxAdView != null) {
            /** To Destroy vmaxAdView when Activity Is No Longer Available  */
            vmaxAdView.onDestroy();
        }
        super.onDestroy();
    }





}
