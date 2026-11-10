package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class y32 extends o73 {
    public final float a;
    public final int b;
    public final long c;
    public final float g;
    public final long i;
    public final float j;
    public final float l;
    public final long m;
    public final float n;
    public final m30 p;
    public final cn4 q;
    public final float r;
    public final int s;
    public final float t;
    public final qk2 u;
    public final float v;
    public final boolean w;
    public final float x;
    public final float y;

    public y32(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, cn4 cn4Var, boolean z, long j2, long j3, int i, int i2, m30 m30Var, qk2 qk2Var) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = f5;
        this.x = f6;
        this.l = f7;
        this.j = f8;
        this.t = f9;
        this.a = f10;
        this.m = j;
        this.q = cn4Var;
        this.w = z;
        this.c = j2;
        this.i = j3;
        this.b = i;
        this.s = i2;
        this.p = m30Var;
        this.u = qk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y32)) {
            return false;
        }
        y32 y32Var = (y32) obj;
        if (Float.compare(this.g, y32Var.g) != 0 || Float.compare(this.y, y32Var.y) != 0 || Float.compare(this.r, y32Var.r) != 0 || Float.compare(this.n, y32Var.n) != 0 || Float.compare(this.v, y32Var.v) != 0 || Float.compare(this.x, y32Var.x) != 0 || Float.compare(this.l, y32Var.l) != 0 || Float.compare(this.j, y32Var.j) != 0 || Float.compare(this.t, y32Var.t) != 0 || Float.compare(this.a, y32Var.a) != 0 || !vb5.g(this.m, y32Var.m) || !yf2.p(this.q, y32Var.q) || this.w != y32Var.w) {
            return false;
        }
        long j = y32Var.c;
        int i = jj0.t;
        return tf5.g(this.c, j) && tf5.g(this.i, y32Var.i) && this.b == y32Var.b && this.s == y32Var.s && yf2.p(this.p, y32Var.p) && yf2.p(this.u, y32Var.u);
    }

    public final int hashCode() {
        int iY = fj.y(this.a, fj.y(this.t, fj.y(this.j, fj.y(this.l, fj.y(this.x, fj.y(this.v, fj.y(this.n, fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = vb5.r;
        int iL = xi3.l((this.q.hashCode() + xi3.v(iY, 31, this.m)) * 31, 961, this.w);
        int i2 = jj0.t;
        int iR = du4.r(this.s, du4.r(this.b, xi3.v(xi3.v(iL, 31, this.c), 31, this.i), 31), 31);
        m30 m30Var = this.p;
        return this.u.hashCode() + ((iR + (m30Var == null ? 0 : m30Var.hashCode())) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        gh3 gh3Var;
        tp4 tp4Var = (tp4) i73Var;
        tp4Var.o = this.g;
        tp4Var.f = this.y;
        tp4Var.k = this.r;
        tp4Var.d = this.n;
        tp4Var.e = this.v;
        tp4Var.A = this.x;
        tp4Var.B = this.l;
        tp4Var.C = this.j;
        tp4Var.D = this.t;
        tp4Var.E = this.a;
        tp4Var.F = this.m;
        tp4Var.G = this.q;
        tp4Var.H = this.w;
        tp4Var.I = this.c;
        tp4Var.J = this.i;
        tp4Var.K = this.b;
        tp4Var.L = this.s;
        tp4Var.M = this.p;
        tp4Var.N = this.u;
        s94 s94Var = tp4Var.O;
        if (tp4Var.j.h && (gh3Var = k33.T(tp4Var, 2).C) != null) {
            gh3Var.y1(s94Var, true);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        tp4 tp4Var = new tp4();
        tp4Var.o = this.g;
        tp4Var.f = this.y;
        tp4Var.k = this.r;
        tp4Var.d = this.n;
        tp4Var.e = this.v;
        tp4Var.A = this.x;
        tp4Var.B = this.l;
        tp4Var.C = this.j;
        tp4Var.D = this.t;
        tp4Var.E = this.a;
        tp4Var.F = this.m;
        tp4Var.G = this.q;
        tp4Var.H = this.w;
        tp4Var.I = this.c;
        tp4Var.J = this.i;
        tp4Var.K = this.b;
        tp4Var.L = this.s;
        tp4Var.M = this.p;
        tp4Var.N = this.u;
        tp4Var.O = new s94(tp4Var, (byte) 7);
        return tp4Var;
    }

    public final String toString() {
        String strY = vb5.y(this.m);
        String strJ = jj0.j(this.c);
        String strJ2 = jj0.j(this.i);
        String strW = du4.w(this.b, "CompositingStrategy(value=", ")");
        String strG = a11.G(this.s);
        StringBuilder sbU = du4.u("GraphicsLayerElement(scaleX=", this.g, ", scaleY=", this.y, ", alpha=");
        sbU.append(this.r);
        sbU.append(", translationX=");
        sbU.append(this.n);
        sbU.append(", translationY=");
        sbU.append(this.v);
        sbU.append(", shadowElevation=");
        sbU.append(this.x);
        sbU.append(", rotationX=");
        sbU.append(this.l);
        sbU.append(", rotationY=");
        sbU.append(this.j);
        sbU.append(", rotationZ=");
        sbU.append(this.t);
        sbU.append(", cameraDistance=");
        sbU.append(this.a);
        sbU.append(", transformOrigin=");
        sbU.append(strY);
        sbU.append(", shape=");
        sbU.append(this.q);
        sbU.append(", clip=");
        sbU.append(this.w);
        sbU.append(", renderEffect=null, ambientShadowColor=");
        sbU.append(strJ);
        sbU.append(", spotShadowColor=");
        du4.B(sbU, strJ2, ", compositingStrategy=", strW, ", blendMode=");
        sbU.append(strG);
        sbU.append(", colorFilter=");
        sbU.append(this.p);
        sbU.append(", outsets=");
        sbU.append(this.u);
        sbU.append(")");
        return sbU.toString();
    }
}
