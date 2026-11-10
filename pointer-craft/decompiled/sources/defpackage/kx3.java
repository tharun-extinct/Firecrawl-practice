package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kx3 implements j51 {
    public boolean a;
    public final /* synthetic */ j51 j;
    public final ec3 m = new ec3();
    public boolean t;

    public kx3(j51 j51Var) {
        this.j = j51Var;
    }

    @Override // defpackage.j51
    public final float B0(float f) {
        return this.j.B0(f);
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

    @Override // defpackage.j51
    public final long d(long j) {
        return this.j.d(j);
    }

    @Override // defpackage.j51
    public final float e(float f) {
        return this.j.e(f);
    }

    @Override // defpackage.j51
    public final long f(float f) {
        return this.j.f(f);
    }

    public final void g() {
        this.a = true;
        ec3 ec3Var = this.m;
        if (ec3Var.n()) {
            ec3Var.x(null);
        }
    }

    @Override // defpackage.j51
    public final long h0(long j) {
        return this.j.h0(j);
    }

    @Override // defpackage.j51
    public final float j0(long j) {
        return this.j.j0(j);
    }

    public final void r() {
        this.t = true;
        ec3 ec3Var = this.m;
        if (ec3Var.n()) {
            ec3Var.x(null);
        }
    }

    @Override // defpackage.j51
    public final long s0(float f) {
        return this.j.s0(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(ou0 ou0Var) {
        ix3 ix3Var;
        if (ou0Var instanceof ix3) {
            ix3Var = (ix3) ou0Var;
            int i = ix3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix3Var.w = i - Integer.MIN_VALUE;
            } else {
                ix3Var = new ix3(this, ou0Var);
            }
        } else {
            ix3Var = new ix3(this, ou0Var);
        }
        Object obj = ix3Var.m;
        int i2 = ix3Var.w;
        if (i2 == 0) {
            js2.o(obj);
            ix3Var.w = 1;
            Object objY = this.m.y(ix3Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        this.t = false;
        this.a = false;
        return og5.g;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.j.w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(ou0 ou0Var) {
        jx3 jx3Var;
        if (ou0Var instanceof jx3) {
            jx3Var = (jx3) ou0Var;
            int i = jx3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx3Var.w = i - Integer.MIN_VALUE;
            } else {
                jx3Var = new jx3(this, ou0Var);
            }
        } else {
            jx3Var = new jx3(this, ou0Var);
        }
        Object obj = jx3Var.m;
        int i2 = jx3Var.w;
        ec3 ec3Var = this.m;
        if (i2 == 0) {
            js2.o(obj);
            if (!this.t && !this.a) {
                jx3Var.w = 1;
                Object objY = ec3Var.y(jx3Var);
                px0 px0Var = px0.j;
                if (objY == px0Var) {
                    return px0Var;
                }
            }
            return Boolean.valueOf(this.t);
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        ec3Var.x(null);
        return Boolean.valueOf(this.t);
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
