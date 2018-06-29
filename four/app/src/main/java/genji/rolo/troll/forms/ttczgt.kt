package funt.hukamasi.jagon.erwe

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class ttczgt : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpcdue)

        if (tygsmq(this) and qfpr(this)) {
            supportFragmentManager.beginTransaction().add(R.id.oqrhj, gozj()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.oqrhj, aagoy()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.oqrhj) as gozj
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