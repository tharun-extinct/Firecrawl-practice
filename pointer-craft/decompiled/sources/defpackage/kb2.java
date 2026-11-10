package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kb2 extends p41 implements zo0 {
    public float A = 2.0f;
    public float B = 1.0f;
    public boolean C;
    public iv4 D;
    public t45 E;
    public qg F;
    public cn4 G;
    public final qg H;
    public final ia0 I;
    public boolean d;
    public ve2 e;
    public boolean k;

    public kb2(boolean z, boolean z2, ve2 ve2Var, t45 t45Var, cn4 cn4Var) {
        this.k = z;
        this.d = z2;
        this.e = ve2Var;
        this.E = t45Var;
        this.G = cn4Var;
        this.H = new qg(new vb1((this.C && z) ? 2.0f : 1.0f), m50.i, null, 12);
        ia0 ia0Var = new ia0(new ja0(), new h(this, (byte) 25));
        Q0(ia0Var);
        this.I = ia0Var;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        this.D = m50.T(E0(), null, new jb2(this, null, (byte) 2), 3);
        if (this.F == null) {
            t45 t45VarU = this.E;
            if (t45VarU == null) {
                t45VarU = bi6.u((rj0) v70.b(this, tj0.g), (x75) v70.b(this, y75.g));
            }
            long jN = t45VarU.n(this.k, this.d, this.C);
            this.F = new qg(new jj0(jN), new te5(vg.b, new zg(jj0.v(jN), (byte) 3)), null, 12);
        }
    }

    public final void T0() {
        mu0 mu0Var = null;
        m50.T(E0(), null, new jb2(this, mu0Var, (byte) 0), 3);
        m50.T(E0(), null, new jb2(this, mu0Var, (byte) 1), 3);
    }

    public final Object U0(zz4 zz4Var) {
        this.C = false;
        Object objR = this.e.g().r(new kr0(new ArrayList(), this, (byte) 7), zz4Var);
        return objR == px0.j ? objR : og5.g;
    }
}
