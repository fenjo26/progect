package funt.troy.parker.idder


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.anpmc.*
import kotlinx.android.synthetic.main.anpmc.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class wozca : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.anpmc, container, false)

        view.cnberg.webViewClient = WebViewClient()
        view.cnberg.settings.javaScriptEnabled = true
        view.cnberg.settings.loadsImagesAutomatically = true
        view.cnberg.settings.domStorageEnabled = true
        view.cnberg.loadUrl("http://ывыо.ру")
        return view
    }



    fun canGoBack(): Boolean {
        return cnberg.canGoBack()
    }

    fun goBack() {
        cnberg.goBack()
    }
}
