package harry.keine.britan.gsdwe


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.eqvs.*
import kotlinx.android.synthetic.main.eqvs.view.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64


class vjns : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.eqvs, container, false)

        view.nbsvh.webViewClient = WebViewClient()
        view.nbsvh.settings.javaScriptEnabled = true
        view.nbsvh.settings.loadsImagesAutomatically = true
        view.nbsvh.settings.domStorageEnabled = true
        view.nbsvh.loadUrl("https://pnpcss.com/mmfy46t2/")
        return view
    }


    fun canGoBack(): Boolean {
        return nbsvh.canGoBack()
    }

    fun goBack() {
        nbsvh.goBack()
    }
}
