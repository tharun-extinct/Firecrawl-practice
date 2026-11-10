package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class cb3 implements or3 {
    public final String g;
    public final tp3 n;
    public final Activity r;
    public final Context y;

    public cb3(String str, Context context, Activity activity) {
        str.getClass();
        this.g = str;
        this.y = context;
        this.r = activity;
        this.n = kq2.M(r());
    }

    @Override // defpackage.or3
    public final rr3 g() {
        return (rr3) this.n.getValue();
    }

    public final rr3 r() {
        boolean zV;
        String str = this.g;
        str.getClass();
        if (ue5.D(this.y, str) == 0) {
            return qr3.g;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            Activity activity = this.r;
            zV = (i < 32 && i == 31) ? fg6.v(activity, str) : activity.shouldShowRequestPermissionRationale(str);
        } else {
            zV = false;
        }
        return new pr3(zV);
    }

    @Override // defpackage.or3
    public final String y() {
        return this.g;
    }
}
