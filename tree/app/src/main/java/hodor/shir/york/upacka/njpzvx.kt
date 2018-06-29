package funt.mark.twen.yydfer

import android.content.Context
import android.telephony.TelephonyManager

fun njpzvx(context: Context): Boolean {
    assert(context.getSystemService(Context.TELEPHONY_SERVICE) != null)
    return (context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager).simState == TelephonyManager.SIM_STATE_READY
}