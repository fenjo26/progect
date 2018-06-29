package funt.pinta.frodo.sdweertet

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class wulku : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pzemf)

        if (mruiqn(this) and cgat(this)) {
            supportFragmentManager.beginTransaction().add(R.id.csau, dhmnke()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.csau, dsvd()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.csau) as dhmnke
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