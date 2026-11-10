package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hj5 extends cp3 {
    public m30 a;
    public final tp3 j;
    public final ti5 l;
    public float t;
    public final tp3 v = kq2.M(new cq4(0));
    public final tp3 x = kq2.M(Boolean.FALSE);

    public hj5(j42 j42Var) {
        ti5 ti5Var = new ti5(j42Var);
        ti5Var.x = new gd4(this, (byte) 12);
        this.l = ti5Var;
        this.j = new tp3(og5.g, hi0.B);
        this.t = 1.0f;
    }

    @Override // defpackage.cp3
    public final void g(float f) {
        this.t = f;
    }

    @Override // defpackage.cp3
    public final long n() {
        return ((cq4) this.v.getValue()).g;
    }

    @Override // defpackage.cp3
    public final void v(wm2 wm2Var) {
        pb0 pb0Var = wm2Var.j;
        m30 m30Var = this.a;
        ti5 ti5Var = this.l;
        if (m30Var == null) {
            m30Var = (m30) ti5Var.l.getValue();
        }
        if (((Boolean) this.x.getValue()).booleanValue() && wm2Var.getLayoutDirection() == fl2.t) {
            long jE0 = pb0Var.e0();
            ro roVar = pb0Var.t;
            long jG = roVar.G();
            roVar.b().q();
            try {
                ((y22) roVar.t).A(-1.0f, 1.0f, jE0);
                ti5Var.v(wm2Var, this.t, m30Var);
                du4.d(roVar, jG);
            } catch (Throwable th) {
                du4.d(roVar, jG);
                throw th;
            }
        } else {
            ti5Var.v(wm2Var, this.t, m30Var);
        }
        this.j.getValue();
    }

    @Override // defpackage.cp3
    public final void y(m30 m30Var) {
        this.a = m30Var;
    }
}
