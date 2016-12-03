package com.finepointmobile.recyclerviewlist;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by danielmalone on 12/2/16.
 */

public class Utility {

    Context mContext;

    public Utility(Context mContext) {
        this.mContext = mContext;
    }

    public boolean isFirstTimeLaunchingApp() {
        SharedPreferences sharedPref = mContext.getSharedPreferences("settings", Context.MODE_PRIVATE);
        boolean hasOpened = sharedPref.getBoolean("hasOpenedAppBefore", false);

        return !hasOpened;
    }

    public void setHasOpened() {
        SharedPreferences sharedPref = mContext.getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("hasOpenedAppBefore", true);
        editor.commit();
    }

}
