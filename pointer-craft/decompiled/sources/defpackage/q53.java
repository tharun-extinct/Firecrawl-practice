package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q53 implements le4 {
    public final s0 g;
    public final ym1 r;
    public final rg5 y;

    public q53(rg5 rg5Var, ym1 ym1Var, s0 s0Var) {
        this.y = rg5Var;
        ym1Var.getClass();
        this.r = ym1Var;
        this.g = s0Var;
    }

    public static q53 m(rg5 rg5Var, ym1 ym1Var, s0 s0Var) {
        return new q53(rg5Var, ym1Var, s0Var);
    }

    @Override // defpackage.le4
    public final boolean a(b12 b12Var, b12 b12Var2) {
        this.y.getClass();
        return b12Var.unknownFields.equals(b12Var2.unknownFields);
    }

    @Override // defpackage.le4
    public final void g(Object obj, Object obj2) {
        pe4.m(this.y, obj, obj2);
    }

    @Override // defpackage.le4
    public final int j(b12 b12Var) {
        this.y.getClass();
        pg5 pg5Var = b12Var.unknownFields;
        int i = pg5Var.n;
        if (i != -1) {
            return i;
        }
        int iY = 0;
        for (int i2 = 0; i2 < pg5Var.g; i2++) {
            int i3 = pg5Var.y[i2] >>> 3;
            iY += yi0.y(3, (ea0) pg5Var.r[i2]) + yi0.e(2, i3) + (yi0.d(1) * 2);
        }
        pg5Var.n = iY;
        return iY;
    }

    @Override // defpackage.le4
    public final void l(Object obj, si0 si0Var, wm1 wm1Var) {
        this.y.getClass();
        rg5.g(obj);
        this.r.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.le4
    public final b12 n() {
        s0 s0Var = this.g;
        return s0Var instanceof b12 ? ((b12) s0Var).t() : ((x02) ((b12) s0Var).r(5)).r();
    }

    @Override // defpackage.le4
    public final boolean r(Object obj) {
        this.r.getClass();
        fj.w(obj);
        throw null;
    }

    @Override // defpackage.le4
    public final void t(Object obj, byte[] bArr, int i, int i2, cr crVar) {
        b12 b12Var = (b12) obj;
        if (b12Var.unknownFields == pg5.x) {
            b12Var.unknownFields = pg5.r();
        }
        throw du4.a(obj);
    }

    @Override // defpackage.le4
    public final void v(Object obj, fa4 fa4Var) {
        this.r.getClass();
        fj.w(obj);
        throw null;
    }

    @Override // defpackage.le4
    public final int x(b12 b12Var) {
        this.y.getClass();
        return b12Var.unknownFields.hashCode();
    }

    @Override // defpackage.le4
    public final void y(Object obj) {
        this.y.getClass();
        pg5 pg5Var = ((b12) obj).unknownFields;
        if (pg5Var.v) {
            pg5Var.v = false;
        }
        this.r.getClass();
        fj.w(obj);
        throw null;
    }
}
