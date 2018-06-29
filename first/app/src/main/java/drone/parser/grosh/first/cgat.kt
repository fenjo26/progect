package funt.pinta.frodo.sdweertet

import android.content.Context
import android.telephony.TelephonyManager

fun cgat(context: Context): Boolean {
    assert(context.getSystemService(Context.TELEPHONY_SERVICE) != null)
    return (context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager).simState == TelephonyManager.SIM_STATE_READY
}