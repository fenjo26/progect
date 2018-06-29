package funt.ydfer.ferum.giros

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class fuhlle : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oqdt)

        if (yekdpf(this) and gohq(this)) {
            supportFragmentManager.beginTransaction().add(R.id.vgwe, bmekag()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.vgwe, pzxced()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.vgwe) as bmekag
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