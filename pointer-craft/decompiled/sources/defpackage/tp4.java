package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tp4 extends i73 implements lm2, ej4 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public long F;
    public cn4 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public m30 M;
    public qk2 N;
    public s94 O;
    public float d;
    public float e;
    public float f;
    public float k;
    public float o;

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        if (this.H) {
            lj4.a(nj4Var, this.G);
        }
    }

    @Override // defpackage.ej4
    public final boolean t() {
        return false;
    }

    public final String toString() {
        float f = this.o;
        float f2 = this.f;
        float f3 = this.k;
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.A;
        float f7 = this.B;
        float f8 = this.C;
        float f9 = this.D;
        float f10 = this.E;
        String strY = vb5.y(this.F);
        cn4 cn4Var = this.G;
        boolean z = this.H;
        String strJ = jj0.j(this.I);
        String strJ2 = jj0.j(this.J);
        String strW = du4.w(this.K, "CompositingStrategy(value=", ")");
        String strG = a11.G(this.L);
        m30 m30Var = this.M;
        qk2 qk2Var = this.N;
        StringBuilder sbU = du4.u("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbU.append(f3);
        sbU.append(", translationX=");
        sbU.append(f4);
        sbU.append(", translationY=");
        sbU.append(f5);
        sbU.append(", shadowElevation=");
        sbU.append(f6);
        sbU.append(", rotationX=");
        sbU.append(f7);
        sbU.append(", rotationY=");
        sbU.append(f8);
        sbU.append(", rotationZ=");
        sbU.append(f9);
        sbU.append(", cameraDistance=");
        sbU.append(f10);
        sbU.append(", transformOrigin=");
        sbU.append(strY);
        sbU.append(", shape=");
        sbU.append(cn4Var);
        sbU.append(", clip=");
        sbU.append(z);
        sbU.append(", renderEffect=null, ambientShadowColor=");
        sbU.append(strJ);
        sbU.append(", spotShadowColor=");
        du4.B(sbU, strJ2, ", compositingStrategy=", strW, ", blendMode=");
        sbU.append(strG);
        sbU.append(", colorFilter=");
        sbU.append(m30Var);
        sbU.append("outsets=");
        sbU.append(qk2Var);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV = p33Var.v(j);
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new xf(us3VarV, this, (byte) 26));
    }
}
