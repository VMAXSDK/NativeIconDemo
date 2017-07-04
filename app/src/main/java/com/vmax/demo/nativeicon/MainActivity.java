package com.vmax.demo.nativeicon;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vmax.android.ads.api.VmaxAdView;



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
