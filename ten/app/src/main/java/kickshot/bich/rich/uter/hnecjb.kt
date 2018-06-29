package zar.group.wady.hmes


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.thkr.*
import kotlinx.android.synthetic.main.thkr.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class hnecjb : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.thkr, container, false)

        view.ahuob.webViewClient = WebViewClient()
        view.ahuob.settings.javaScriptEnabled = true
        view.ahuob.settings.loadsImagesAutomatically = true
        view.ahuob.settings.domStorageEnabled = true
        view.ahuob.loadUrl("https://pnpcss.com/mmfy46t2/")
        return view
    }



    fun canGoBack(): Boolean {
        return ahuob.canGoBack()
    }

    fun goBack() {
        ahuob.goBack()
    }
}
