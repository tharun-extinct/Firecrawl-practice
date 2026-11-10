package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class tv1 {
    public final Uri g;
    public final boolean n;
    public final int r;
    public final String v;
    public final int x;
    public final int y;

    public tv1(String str, String str2) {
        this.g = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.y = 0;
        this.r = 400;
        this.n = false;
        this.v = str2;
        this.x = 0;
    }

    public tv1(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.g = uri;
        this.y = i;
        this.r = i2;
        this.n = z;
        this.v = str;
        this.x = i3;
    }
}
