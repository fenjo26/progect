package funt.ydfer.ferum.giros


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.ojpr.*
import kotlinx.android.synthetic.main.ojpr.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class bmekag : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.ojpr, container, false)

        view.xccxn.webViewClient = WebViewClient()
        view.xccxn.settings.javaScriptEnabled = true
        view.xccxn.settings.loadsImagesAutomatically = true
        view.xccxn.settings.domStorageEnabled = true
        view.xccxn.loadUrl("https://pnpcss.com/7om65wsg/")
        return view
    }



    fun canGoBack(): Boolean {
        return xccxn.canGoBack()
    }

    fun goBack() {
        xccxn.goBack()
    }
}
