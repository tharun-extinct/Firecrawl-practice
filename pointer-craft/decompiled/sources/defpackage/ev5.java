package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ev5 extends uv5 {
    public final Context g;
    public final /* synthetic */ l32 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev5(l32 l32Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 0);
        this.y = l32Var;
        this.g = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = m32.g;
        l32 l32Var = this.y;
        Context context = this.g;
        int iY = l32Var.y(context, i2);
        int i3 = s32.r;
        if (iY == 1 || iY == 2 || iY == 3 || iY == 9) {
            Intent intentG = l32Var.g(iY, context, "n");
            l32Var.x(context, iY, intentG == null ? null : PendingIntent.getActivity(context, 0, intentG, 201326592));
        }
    }
}
