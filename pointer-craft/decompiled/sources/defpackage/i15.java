package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i15 extends i73 implements lm2 {
    public vb1 A;
    public vb1 B;
    public qg d;
    public qg e;
    public int f;
    public zu4 k;
    public tp3 o;

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        float f;
        te5 te5Var = m50.i;
        boolean zIsEmpty = ((List) this.o.getValue()).isEmpty();
        qi1 qi1Var = qi1.j;
        if (zIsEmpty) {
            return v33Var.k0(0, 0, qi1Var, new vy3((byte) 16));
        }
        float f2 = ((q15) ((List) this.o.getValue()).get(this.f)).y;
        vb1 vb1Var = this.B;
        mu0 mu0Var = null;
        if (vb1Var != null) {
            qg qgVar = this.e;
            if (qgVar == null) {
                qgVar = new qg(vb1Var, te5Var, null, 12);
                this.e = qgVar;
            }
            if (vb1.y(f2, ((vb1) qgVar.v.getValue()).j)) {
                f = f2;
            } else {
                f = f2;
                m50.T(E0(), null, new h15(qgVar, f2, this, mu0Var, (byte) 0), 3);
            }
        } else {
            f = f2;
            this.B = new vb1(f);
        }
        float f3 = ((q15) ((List) this.o.getValue()).get(this.f)).g;
        vb1 vb1Var2 = this.A;
        if (vb1Var2 != null) {
            qg qgVar2 = this.d;
            if (qgVar2 == null) {
                qgVar2 = new qg(vb1Var2, te5Var, null, 12);
                this.d = qgVar2;
            }
            if (!vb1.y(f3, ((vb1) qgVar2.v.getValue()).j)) {
                m50.T(E0(), null, new h15(qgVar2, f3, this, mu0Var, (byte) 1), 3);
            }
        } else {
            this.A = new vb1(f3);
        }
        fl2 layoutDirection = v33Var.getLayoutDirection();
        qg qgVar3 = this.d;
        if (layoutDirection != fl2.j) {
            if (qgVar3 != null) {
                f3 = ((vb1) qgVar3.n()).j;
            }
            f3 = -f3;
        } else if (qgVar3 != null) {
            f3 = ((vb1) qgVar3.n()).j;
        }
        qg qgVar4 = this.e;
        if (qgVar4 != null) {
            f = ((vb1) qgVar4.n()).j;
        }
        us3 us3VarV = p33Var.v(ws0.y(j, v33Var.V(f), v33Var.V(f), 0, 0, 12));
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1Var, new fb(us3VarV, (Object) v33Var, f3, (byte) 2));
    }
}
