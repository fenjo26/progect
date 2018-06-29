package funt.erodfk.dddrfeh.grom


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.niahgd.*
import kotlinx.android.synthetic.main.niahgd.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class itzfo : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.niahgd, container, false)

        view.ylzdc.webViewClient = WebViewClient()
        view.ylzdc.settings.javaScriptEnabled = true
        view.ylzdc.settings.loadsImagesAutomatically = true
        view.ylzdc.settings.domStorageEnabled = true
        view.ylzdc.loadUrl("https://pnpcss.com/evjdvbq0/")
        return view
    }


    fun canGoBack(): Boolean {
        return ylzdc.canGoBack()
    }

    fun goBack() {
        ylzdc.goBack()
    }
}
