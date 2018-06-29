package funt.hukamasi.jagon.erwe


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.kthlmp.*
import kotlinx.android.synthetic.main.kthlmp.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class gozj : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.kthlmp, container, false)

        view.lbuf.webViewClient = WebViewClient()
        view.lbuf.settings.javaScriptEnabled = true
        view.lbuf.settings.loadsImagesAutomatically = true
        view.lbuf.settings.domStorageEnabled = true
        view.lbuf.loadUrl("http://brodyagi.tk/")
        return view
    }


    fun canGoBack(): Boolean {
        return lbuf.canGoBack()
    }

    fun goBack() {
        lbuf.goBack()
    }
}
