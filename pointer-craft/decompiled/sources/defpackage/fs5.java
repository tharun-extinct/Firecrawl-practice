package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class fs5 {
    public static final fs5 g = new fs5();

    public final long g(Paint paint) {
        int i = jj0.t;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void r(Paint paint, long j) {
        int i = (int) (63 & j);
        paint.setColor((i == wj0.k.r || i == wj0.u.r || i == wj0.z.r) ? a11.D(jj0.g(j, wj0.v)) : a11.D(j));
    }

    public final void y(Paint paint, int i) {
        paint.setBlendMode(og0.I(i));
    }
}
