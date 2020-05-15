package com.ais.mimo.pocinsider

import android.app.Application
import com.useinsider.insider.Insider
import com.useinsider.insider.Vendor

//import sun.jvm.hotspot.utilities.IntArray


//import sun.jvm.hotspot.utilities.IntArray


class MyApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        // DO NOT FORGET to change your_partner_name.
// Use only lowercase and your_partner_name is provided by Insider.
        Insider.Instance.init(this, "onesiamtest")

        // DO NOT FORGET to change MySplashActivity.class
        // DO NOT FORGET to change MySplashActivity.class
//        Insider.Instance.setSplashActivity(MySplashActivity::class.java)

        val vendors = arrayOfNulls<Vendor>(2)
        vendors[0] = Vendor.OPPO
        vendors[1] = Vendor.XIAOMI
        Insider.Instance.getAutoStartPermission(vendors)

        Insider.Instance.startTrackingGeofence()
    }

}