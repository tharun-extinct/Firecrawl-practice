package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kr4 implements qd1 {
    public final pp3 a;
    public boolean b;
    public final ac3 d;
    public final pp3 f;
    public my1 j;
    public final o8 k;
    public xy1 m;
    public final pp3 o;
    public final ki0 t;
    public final boolean q = true;
    public final float[] w = new float[0];
    public final qp3 c = new qp3(0);
    public final qp3 i = new qp3(0);
    public final qp3 s = new qp3(0);
    public final qp3 p = new qp3(0);
    public final um3 u = um3.t;
    public final tp3 z = kq2.M(Boolean.FALSE);
    public final m63 h = new m63(this, (byte) 5);

    public kr4(float f, my1 my1Var, ki0 ki0Var) {
        this.j = my1Var;
        this.t = ki0Var;
        this.a = new pp3(f);
        float f2 = ki0Var.g;
        float f3 = ki0Var.y - f2;
        this.o = new pp3(lr2.e(0.0f, 0.0f, xs2.q(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.f = new pp3(0.0f);
        this.k = new o8(this, (byte) 1);
        this.d = new ac3();
    }

    public final void g(float f) {
        float fMax;
        float fMin;
        if (this.u == um3.j) {
            float fD = this.i.d();
            qp3 qp3Var = this.p;
            fMax = Math.max(fD - (qp3Var.d() / 2.0f), 0.0f);
            fMin = Math.min(qp3Var.d() / 2.0f, fMax);
        } else {
            float fD2 = this.c.d();
            qp3 qp3Var2 = this.s;
            fMax = Math.max(fD2 - (qp3Var2.d() / 2.0f), 0.0f);
            fMin = Math.min(qp3Var2.d() / 2.0f, fMax);
        }
        pp3 pp3Var = this.o;
        float fD3 = pp3Var.d() + f;
        pp3 pp3Var2 = this.f;
        pp3Var.e(pp3Var2.d() + fD3);
        pp3Var2.e(0.0f);
        float fN = jr4.n(pp3Var.d(), this.w, fMin, fMax);
        ki0 ki0Var = this.t;
        float f2 = fMax - fMin;
        float fE = lr2.e(ki0Var.g, ki0Var.y, xs2.q(f2 == 0.0f ? 0.0f : (fN - fMin) / f2, 0.0f, 1.0f));
        if (fE == this.a.d()) {
            return;
        }
        xy1 xy1Var = this.m;
        if (xy1Var != null) {
            xy1Var.a(Float.valueOf(fE));
        } else {
            r(fE);
        }
    }

    public final void r(float f) {
        if (this.q) {
            ki0 ki0Var = this.t;
            float f2 = ki0Var.g;
            float f3 = ki0Var.y;
            f = jr4.n(xs2.q(f, f2, f3), this.w, ki0Var.g, f3);
        }
        this.a.e(f);
    }

    @Override // defpackage.qd1
    public final Object v(s3 s3Var, n10 n10Var) {
        Object objB = k33.B(new s12(this, s3Var, null, (byte) 18), n10Var);
        return objB == px0.j ? objB : og5.g;
    }

    public final float y() {
        ki0 ki0Var = this.t;
        float f = ki0Var.g;
        float f2 = ki0Var.y;
        float fQ = xs2.q(this.a.d(), ki0Var.g, f2);
        float f3 = f2 - f;
        return xs2.q(f3 == 0.0f ? 0.0f : (fQ - f) / f3, 0.0f, 1.0f);
    }
}
