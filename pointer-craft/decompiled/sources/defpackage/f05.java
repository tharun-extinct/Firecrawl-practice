package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f05 implements j51, mu0 {
    public ib0 a;
    public final /* synthetic */ g05 j;
    public ku3 m = ku3.t;
    public final /* synthetic */ g05 q;
    public final ib0 t;

    public f05(g05 g05Var, ib0 ib0Var) {
        this.q = g05Var;
        this.j = g05Var;
        this.t = ib0Var;
    }

    @Override // defpackage.j51
    public final float B0(float f) {
        return f / this.j.y();
    }

    @Override // defpackage.j51
    public final int K(long j) {
        return this.j.K(j);
    }

    @Override // defpackage.j51
    public final float M(long j) {
        return this.j.M(j);
    }

    @Override // defpackage.j51
    public final int V(float f) {
        return this.j.V(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, bz1 bz1Var, ou0 ou0Var) {
        e05 e05Var;
        if (ou0Var instanceof e05) {
            e05Var = (e05) ou0Var;
            int i = e05Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                e05Var.w = i - Integer.MIN_VALUE;
            } else {
                e05Var = new e05(this, ou0Var);
            }
        } else {
            e05Var = new e05(this, ou0Var);
        }
        Object obj = e05Var.m;
        int i2 = e05Var.w;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    js2.o(obj);
                    return obj;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
            e05Var.w = 1;
            Object objT = t(j, bz1Var, e05Var);
            Object obj2 = px0.j;
            return objT == obj2 ? obj2 : objT;
        } catch (lu3 unused) {
            return null;
        }
    }

    @Override // defpackage.j51
    public final long d(long j) {
        return this.j.d(j);
    }

    @Override // defpackage.j51
    public final float e(float f) {
        return this.j.y() * f;
    }

    @Override // defpackage.j51
    public final long f(float f) {
        return this.j.f(f);
    }

    public final Object g(ku3 ku3Var, ix ixVar) {
        ib0 ib0Var = new ib0(1, pw5.o(ixVar));
        ib0Var.o();
        this.m = ku3Var;
        this.a = ib0Var;
        return ib0Var.z();
    }

    @Override // defpackage.j51
    public final long h0(long j) {
        return this.j.h0(j);
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        g05 g05Var = this.q;
        synchronized (g05Var.B) {
            g05Var.A.q(this);
        }
        this.t.j(obj);
    }

    @Override // defpackage.j51
    public final float j0(long j) {
        return this.j.j0(j);
    }

    public final long r() {
        g05 g05Var = this.q;
        long jH0 = g05Var.h0(k33.V(g05Var).H.l());
        long j = g05Var.E;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.j51
    public final long s0(float f) {
        return this.j.s0(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(long j, bz1 bz1Var, ix ixVar) throws Throwable {
        c05 c05Var;
        Throwable th;
        iv4 iv4Var;
        ib0 ib0Var;
        if (ixVar instanceof c05) {
            c05Var = (c05) ixVar;
            int i = c05Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05Var.c = i - Integer.MIN_VALUE;
            } else {
                c05Var = new c05(this, ixVar);
            }
        } else {
            c05Var = new c05(this, ixVar);
        }
        Object objL = c05Var.q;
        int i2 = c05Var.c;
        if (i2 != 0) {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iv4Var = c05Var.m;
            try {
                js2.o(objL);
                iv4Var.x(eb0.t);
                return objL;
            } catch (Throwable th2) {
                th = th2;
                iv4Var.x(eb0.t);
                throw th;
            }
        }
        js2.o(objL);
        if (j <= 0 && (ib0Var = this.a) != null) {
            ib0Var.j(new g84(new lu3(j)));
        }
        iv4 iv4VarT = m50.T(this.q.E0(), null, new d05(j, this, null), 3);
        try {
            c05Var.m = iv4VarT;
            c05Var.c = 1;
            objL = bz1Var.l(this, c05Var);
            Object obj = px0.j;
            if (objL == obj) {
                return obj;
            }
            iv4Var = iv4VarT;
            iv4Var.x(eb0.t);
            return objL;
        } catch (Throwable th3) {
            th = th3;
            iv4Var = iv4VarT;
            iv4Var.x(eb0.t);
            throw th;
        }
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return ni1.j;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.j.w();
    }

    public final bl5 x() {
        return k33.V(this.q).H;
    }

    @Override // defpackage.j51
    public final float y() {
        return this.j.y();
    }

    @Override // defpackage.j51
    public final float y0(int i) {
        return this.j.y0(i);
    }
}
