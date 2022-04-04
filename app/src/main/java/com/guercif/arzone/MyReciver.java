package com.guercif.arzone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String status = InternetUtil.getConnectivityStatusString(context);
        if(status.isEmpty()){
            status="No Internet Connection ";
        }
        Toast.makeText(context,status,Toast.LENGTH_LONG).show();
    }
}
