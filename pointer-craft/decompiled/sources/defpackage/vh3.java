package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class vh3 {
    public final Bundle g;
    public final int n;
    public final boolean r;
    public final CharSequence v;
    public final PendingIntent x;
    public IconCompat y;

    public vh3(int i, PendingIntent pendingIntent, String str) {
        IconCompat iconCompatN = i != 0 ? IconCompat.n(null, "", i) : null;
        Bundle bundle = new Bundle();
        this.r = true;
        this.y = iconCompatN;
        if (iconCompatN != null && iconCompatN.l() == 2) {
            this.n = iconCompatN.x();
        }
        this.v = xh3.r(str);
        this.x = pendingIntent;
        this.g = bundle;
        this.r = true;
    }
}
