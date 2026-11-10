package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r53 implements me4 {
    public final t0 g;
    public final zm1 r;
    public final sg5 y;

    public r53(sg5 sg5Var, zm1 zm1Var, t0 t0Var) {
        this.y = sg5Var;
        zm1Var.getClass();
        this.r = zm1Var;
        this.g = t0Var;
    }

    public static r53 a(sg5 sg5Var, zm1 zm1Var, t0 t0Var) {
        return new r53(sg5Var, zm1Var, t0Var);
    }

    @Override // defpackage.me4
    public final void g(Object obj, Object obj2) {
        qe4.m(this.y, obj, obj2);
    }

    @Override // defpackage.me4
    public final boolean j(c12 c12Var, c12 c12Var2) {
        this.y.getClass();
        return c12Var.unknownFields.equals(c12Var2.unknownFields);
    }

    @Override // defpackage.me4
    public final void l(Object obj, q64 q64Var) {
        this.r.getClass();
        fj.w(obj);
        throw null;
    }

    @Override // defpackage.me4
    public final c12 n() {
        t0 t0Var = this.g;
        return t0Var instanceof c12 ? ((c12) t0Var).t() : ((y02) ((c12) t0Var).r(5)).y();
    }

    @Override // defpackage.me4
    public final boolean r(Object obj) {
        this.r.getClass();
        fj.w(obj);
        throw null;
    }

    @Override // defpackage.me4
    public final void t(Object obj, ti0 ti0Var, xm1 xm1Var) {
        this.y.getClass();
        sg5.g(obj);
        this.r.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.me4
    public final int v(c12 c12Var) {
        this.y.getClass();
        return c12Var.unknownFields.hashCode();
    }

    @Override // defpackage.me4
    public final int x(c12 c12Var) {
        this.y.getClass();
        qg5 qg5Var = c12Var.unknownFields;
        int i = qg5Var.n;
        if (i != -1) {
            return i;
        }
        int iX = 0;
        for (int i2 = 0; i2 < qg5Var.g; i2++) {
            int i3 = qg5Var.y[i2] >>> 3;
            iX += xi0.x(3, (da0) qg5Var.r[i2]) + xi0.t(i3) + xi0.j(2) + (xi0.j(1) * 2);
        }
        qg5Var.n = iX;
        return iX;
    }

    @Override // defpackage.me4
    public final void y(Object obj) {
        this.y.getClass();
        qg5 qg5Var = ((c12) obj).unknownFields;
        if (qg5Var.v) {
            qg5Var.v = false;
        }
        this.r.getClass();
        fj.w(obj);
        throw null;
    }
}
