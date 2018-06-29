package funt.mark.twen.yydfer

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class scejac : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otnhqx)

        if (deshh(this) and njpzvx(this)) {
            supportFragmentManager.beginTransaction().add(R.id.ifdz, hhpabm()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.ifdz, qanf()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.ifdz) as hhpabm
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