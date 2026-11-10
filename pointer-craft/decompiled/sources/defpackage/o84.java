package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o84 implements j51 {
    public j51 A;
    public fl2 B;
    public m30 C;
    public int D;
    public br2 E;
    public long b;
    public float c;
    public long d;
    public qk2 e;
    public boolean f;
    public long h;
    public long i;
    public int j;
    public int k;
    public cn4 o;
    public float p;
    public float q;
    public float s;
    public float u;
    public float w;
    public float z;
    public float t = 1.0f;
    public float a = 1.0f;
    public float m = 1.0f;

    public o84() {
        long j = b42.g;
        this.i = j;
        this.b = j;
        this.z = 8.0f;
        this.h = vb5.y;
        this.o = yf2.b;
        this.k = 0;
        this.d = 9205357640488583168L;
        this.e = qk2.g;
        this.A = y94.j();
        this.B = fl2.j;
        this.D = 3;
    }

    public final void a(float f) {
        if (this.c == f) {
            return;
        }
        this.j |= 32;
        this.c = f;
    }

    public final void c(long j) {
        if (vb5.g(this.h, j)) {
            return;
        }
        this.j |= 4096;
        this.h = j;
    }

    public final void g() {
        j(1.0f);
        t(1.0f);
        r(1.0f);
        if (this.q != 0.0f) {
            this.j |= 8;
            this.q = 0.0f;
        }
        i(0.0f);
        a(0.0f);
        long j = b42.g;
        v(j);
        q(j);
        if (this.s != 0.0f) {
            this.j |= 256;
            this.s = 0.0f;
        }
        if (this.p != 0.0f) {
            this.j |= 512;
            this.p = 0.0f;
        }
        if (this.u != 0.0f) {
            this.j |= 1024;
            this.u = 0.0f;
        }
        if (this.z != 8.0f) {
            this.j |= 2048;
            this.z = 8.0f;
        }
        c(vb5.y);
        m(yf2.b);
        x(false);
        if (!yf2.p(this.C, null)) {
            this.j |= 262144;
            this.C = null;
        }
        if (this.D != 3) {
            this.j |= 524288;
            this.D = 3;
        }
        if (this.k != 0) {
            this.j |= 32768;
            this.k = 0;
        }
        qk2 qk2Var = qk2.g;
        if (!yf2.p(this.e, qk2Var)) {
            this.j |= 1048576;
            this.e = qk2Var;
        }
        this.d = 9205357640488583168L;
        this.E = null;
        this.j = 0;
    }

    public final void i(float f) {
        if (this.w == f) {
            return;
        }
        this.j |= 16;
        this.w = f;
    }

    public final void j(float f) {
        if (this.t == f) {
            return;
        }
        this.j |= 1;
        this.t = f;
    }

    public final void m(cn4 cn4Var) {
        if (yf2.p(this.o, cn4Var)) {
            return;
        }
        this.j |= 8192;
        this.o = cn4Var;
    }

    public final void q(long j) {
        long j2 = this.b;
        int i = jj0.t;
        if (tf5.g(j2, j)) {
            return;
        }
        this.j |= 128;
        this.b = j;
    }

    public final void r(float f) {
        if (this.m == f) {
            return;
        }
        this.j |= 4;
        this.m = f;
    }

    public final void t(float f) {
        if (this.a == f) {
            return;
        }
        this.j |= 2;
        this.a = f;
    }

    public final void v(long j) {
        long j2 = this.i;
        int i = jj0.t;
        if (tf5.g(j2, j)) {
            return;
        }
        this.j |= 64;
        this.i = j;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.A.w();
    }

    public final void x(boolean z) {
        if (this.f != z) {
            this.j |= 16384;
            this.f = z;
        }
    }

    @Override // defpackage.j51
    public final float y() {
        return this.A.y();
    }
}
