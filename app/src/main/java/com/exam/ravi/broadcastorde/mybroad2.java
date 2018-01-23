package com.exam.ravi.broadcastorde;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Ravi on 1/29/2016.
 */
public class mybroad2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int code = getResultCode();
        String data = getResultData();
        Bundle ex=getResultExtras(true);
        String extra = ex.getString("extra");
        Toast.makeText(context, "code = " + code + "data = " + data + "bundle data" + extra, Toast.LENGTH_LONG).show();

    }
}
