package funt.troy.parker.idder

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class figrw : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.haingg)

        if (bwnkl(this) and dirzc(this)) {
            supportFragmentManager.beginTransaction().add(R.id.rxdls, wozca()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.rxdls, owhlw()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.rxdls) as wozca
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