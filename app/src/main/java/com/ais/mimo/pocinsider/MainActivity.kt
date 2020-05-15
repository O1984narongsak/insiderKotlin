package com.ais.mimo.pocinsider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.useinsider.insider.Insider
import com.useinsider.insider.Vendor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vendors = arrayOfNulls<Vendor>(2)
        vendors[0] = Vendor.OPPO
        vendors[1] = Vendor.XIAOMI
        Insider.Instance.getAutoStartPermission(vendors)

        val permissions = arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION)
        ActivityCompat.requestPermissions(this, permissions,0)

        Insider.Instance.startTrackingGeofence()
    }
}
