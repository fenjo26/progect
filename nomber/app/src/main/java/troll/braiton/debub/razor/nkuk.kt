package funt.buyata.hrome.dkfertty

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class nkuk : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.uaavkt)

        if (juxr(this) and hcdalm(this)) {
            supportFragmentManager.beginTransaction().add(R.id.btcv, rpwup()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.btcv, vsnuu()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.btcv) as rpwup
        if (fragment.canGoBack()) {
            fragment.goBack()
        } else {
            super.onBackPressed()
        }
        } catch(e: ClassCastException){
            super.onBackPressed()
        }
    }
}