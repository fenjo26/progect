package funt.troll.gendalf.fdfer

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class oblvk : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.yoaag)

        if (oozdk(this) and cikq(this)) {
            supportFragmentManager.beginTransaction().add(R.id.cayar, puflvl()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.cayar, xqgpx()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.cayar) as puflvl
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