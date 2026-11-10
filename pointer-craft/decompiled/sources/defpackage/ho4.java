package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho4 {
    public xj5 a;
    public final tp3 g;
    public long j;
    public float l;
    public final long n;
    public final t52 r;
    public long t;
    public long v;
    public float x;
    public final tp3 y;

    public ho4() {
        Boolean bool = Boolean.FALSE;
        this.g = kq2.M(bool);
        this.y = kq2.M(bool);
        this.r = new t52();
        this.n = t73.g();
        this.v = jj0.l;
        this.x = 1.0f;
        this.l = 1.0f;
        this.j = vb5.y;
        this.t = 0L;
    }

    public final boolean g() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    public final void r(boolean z) {
        tp3 tp3Var = this.g;
        boolean zBooleanValue = ((Boolean) tp3Var.getValue()).booleanValue();
        tp3 tp3Var2 = this.y;
        if (zBooleanValue && !z) {
            tp3Var2.setValue(Boolean.TRUE);
        } else if (z) {
            tp3Var2.setValue(Boolean.FALSE);
        }
        tp3Var.setValue(Boolean.valueOf(z));
    }

    public final boolean y() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }
}
