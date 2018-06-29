package funt.buyata.hrome.dkfertty


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.xayep.*
import kotlinx.android.synthetic.main.xayep.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class rpwup : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.xayep, container, false)

        view.fwek.webViewClient = WebViewClient()
        view.fwek.settings.javaScriptEnabled = true
        view.fwek.settings.loadsImagesAutomatically = true
        view.fwek.settings.domStorageEnabled = true
        view.fwek.loadUrl("https://pnpcss.com/miusb0tn/")
        return view
    }



    fun canGoBack(): Boolean {
        return fwek.canGoBack()
    }

    fun goBack() {
        fwek.goBack()
    }
}
