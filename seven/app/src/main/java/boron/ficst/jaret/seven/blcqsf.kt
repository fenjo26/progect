package funt.erodfk.dddrfeh.grom

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class blcqsf : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gpax)

        if (msbg(this) and ehsp(this)) {
            supportFragmentManager.beginTransaction().add(R.id.nbcgpw, itzfo()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.nbcgpw, eotee()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.nbcgpw) as itzfo
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