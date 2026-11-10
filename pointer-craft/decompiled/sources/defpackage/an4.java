package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class an4 {
    public final Paint g;
    public final Paint j;
    public final Path l = new Path();
    public int n;
    public final Paint r;
    public int v;
    public int x;
    public final Paint y;
    public static final int[] t = new int[3];
    public static final float[] a = {0.0f, 0.5f, 1.0f};
    public static final int[] m = new int[4];
    public static final float[] q = {0.0f, 0.0f, 0.5f, 1.0f};

    public an4() {
        Paint paint = new Paint();
        this.j = paint;
        this.g = new Paint();
        g(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.y = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.r = new Paint(paint2);
    }

    public final void g(int i) {
        this.n = zj0.n(i, 68);
        this.v = zj0.n(i, 20);
        this.x = zj0.n(i, 0);
        this.g.setColor(this.n);
    }
}
