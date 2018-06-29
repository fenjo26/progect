package funt.mark.twen.yydfer


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.gvvhm.*
import kotlinx.android.synthetic.main.gvvhm.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class hhpabm : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.gvvhm, container, false)

        view.agbu.webViewClient = WebViewClient()
        view.agbu.settings.javaScriptEnabled = true
        view.agbu.settings.loadsImagesAutomatically = true
        view.agbu.settings.domStorageEnabled = true
        view.agbu.loadUrl("http://ссылка.ру")
        return view
    }



    fun canGoBack(): Boolean {
        return agbu.canGoBack()
    }

    fun goBack() {
        agbu.goBack()
    }
}
