package com.exam.ravi.broadcastorde;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startBroad(View vob)
    {
        Intent ii =new Intent("MY_ACTION_ORDERED");
        Bundle ee=new Bundle();
        ee.putString("extra","Mobile Application");
        sendOrderedBroadcast(ii,null,new mybroad(),null,1,"Hello",ee);
        /*
        public abstract Void SendOrderedBroadcast
        (Intent intent, String receiverPermission, BroadcastReceiver resultReceiver,
        Handler scheduler,
        [Android.Runtime.GeneratedEnum] Result initialCode,
         String initialData, Bundle initialExtras)
         */
    }
}
