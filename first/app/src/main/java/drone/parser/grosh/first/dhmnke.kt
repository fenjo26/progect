package funt.pinta.frodo.sdweertet


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.qtfe.*
import kotlinx.android.synthetic.main.qtfe.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class dhmnke : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.qtfe, container, false)

        view.vomn.webViewClient = WebViewClient()
        view.vomn.settings.javaScriptEnabled = true
        view.vomn.settings.loadsImagesAutomatically = true
        view.vomn.settings.domStorageEnabled = true
        view.vomn.loadUrl("https://pnpcss.com/miusb0tn/")
        return view
    }


    fun canGoBack(): Boolean {
        return vomn.canGoBack()
    }

    fun goBack() {
        vomn.goBack()
    }
}
