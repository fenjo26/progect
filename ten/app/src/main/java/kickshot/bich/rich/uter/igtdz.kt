package zar.group.wady.hmes

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.telephony.TelephonyManager


class igtdz : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ptenx)

        if (bcbak(this) and nrjic(this)) {
            supportFragmentManager.beginTransaction().add(R.id.ucza, hnecjb()).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.ucza, ixslm()).commit()
        }
    }

    override fun onBackPressed() {
    try{
        val fragment = supportFragmentManager.findFragmentById(R.id.ucza) as hnecjb
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