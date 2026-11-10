package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class oo3 {
    public boolean g;
    public final Object n;
    public final Object r;
    public Object v;
    public final Object x;
    public final Object y;

    public oo3(int i, float f, xo3 xo3Var) {
        this.y = xo3Var;
        this.r = new qp3(i);
        this.n = new pp3(f);
        this.x = new er2(i);
    }

    public oo3(Context context, w10 w10Var, wh4 wh4Var) {
        this.y = context;
        this.r = w10Var;
        this.n = wh4Var;
        this.v = new mw5(this, true);
        this.x = new mw5(this, false);
    }
}
