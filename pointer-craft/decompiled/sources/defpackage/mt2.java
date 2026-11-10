package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mt2 {
    public final tp3 A;
    public final tp3 B;
    public cj a;
    public boolean b;
    public final tp3 c;
    public final cd d;
    public long e;
    public final kw0 f;
    public o45 g;
    public xy1 h;
    public final tp3 i;
    public bl2 j;
    public final kw0 k;
    public final tp3 l;
    public final tp3 m;
    public final rk4 n;
    public final kw0 o;
    public final ri2 p;
    public final tp3 q;
    public final yt4 r;
    public final tp3 s;
    public final tp3 t;
    public final tp3 u;
    public y65 v;
    public final tp3 w;
    public final tp3 x;
    public final u34 y;
    public final tp3 z;

    public mt2(o45 o45Var, u34 u34Var, yt4 yt4Var) {
        this.g = o45Var;
        this.y = u34Var;
        this.r = yt4Var;
        rk4 rk4Var = new rk4((byte) 10, false);
        cj cjVar = dj.g;
        long j = u75.y;
        k65 k65Var = new k65(cjVar, j, (u75) null);
        rk4Var.t = k65Var;
        rk4Var.a = new vg1(cjVar, k65Var.y);
        this.n = rk4Var;
        Boolean bool = Boolean.FALSE;
        this.x = kq2.M(bool);
        this.l = kq2.M(new vb1(0.0f));
        this.t = kq2.M(null);
        this.m = kq2.M(r42.j);
        this.q = kq2.M(bool);
        this.w = kq2.M(bool);
        this.c = kq2.M(bool);
        this.i = kq2.M(bool);
        this.b = true;
        this.s = kq2.M(Boolean.TRUE);
        this.p = new ri2(yt4Var);
        this.u = kq2.M(bool);
        this.z = kq2.M(bool);
        this.h = new m92((byte) 6);
        this.o = new kw0(this, (byte) 1);
        this.f = new kw0(this, (byte) 2);
        this.k = new kw0(this, (byte) 3);
        this.d = ue5.p();
        this.e = jj0.j;
        this.A = kq2.M(new u75(j));
        this.B = kq2.M(new u75(j));
    }

    public final r42 g() {
        return (r42) this.m.getValue();
    }

    public final k75 n() {
        return (k75) this.t.getValue();
    }

    public final bl2 r() {
        bl2 bl2Var = this.j;
        if (bl2Var == null || !bl2Var.W()) {
            return null;
        }
        return bl2Var;
    }

    public final void v(long j) {
        this.B.setValue(new u75(j));
    }

    public final void x(long j) {
        this.A.setValue(new u75(j));
    }

    public final boolean y() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }
}
