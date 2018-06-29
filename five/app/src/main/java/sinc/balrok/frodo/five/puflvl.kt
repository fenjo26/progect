package funt.troll.gendalf.fdfer


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.yrhhfv.*
import kotlinx.android.synthetic.main.yrhhfv.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class puflvl : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.yrhhfv, container, false)

        view.luojg.webViewClient = WebViewClient()
        view.luojg.settings.javaScriptEnabled = true
        view.luojg.settings.loadsImagesAutomatically = true
        view.luojg.settings.domStorageEnabled = true
        view.luojg.loadUrl("https://pnpcss.com/ch90imbh/")
        return view
    }


    fun canGoBack(): Boolean {
        return luojg.canGoBack()
    }

    fun goBack() {
        luojg.goBack()
    }
}
