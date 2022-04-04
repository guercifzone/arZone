package com.guercif.arzone;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class InternetUtil {
public static  String getConnectivityStatusString(Context context){
 String status = null;
 ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
 NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
 if (activeNetwork != null){
  if(activeNetwork.getType()== ConnectivityManager.TYPE_WIFI){
   status = "Wifi Enabled";
   return status;
  }else if (activeNetwork.getType()== ConnectivityManager.TYPE_MOBILE){
   status = "Mobile Data Enabled";
   return status;
  }
 }else {
  status = "No  internet is Available";
  return status;
 }

 return status;
}
}
