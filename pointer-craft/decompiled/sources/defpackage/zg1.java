package defpackage;

import android.content.Context;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 {
    public static final int x = (int) Math.round(5.1000000000000005d);
    public final boolean g;
    public final int n;
    public final int r;
    public final float v;
    public final int y;

    public zg1(Context context) {
        boolean z = mq2.z(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int i = xq2.i(context, R.attr.elevationOverlayColor, 0);
        int i2 = xq2.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i3 = xq2.i(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.g = z;
        this.y = i;
        this.r = i2;
        this.n = i3;
        this.v = f;
    }
}
