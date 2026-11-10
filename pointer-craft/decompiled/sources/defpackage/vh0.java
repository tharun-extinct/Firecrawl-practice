package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vh0 extends z {
    public qu3 R;
    public ob2 S;

    @Override // defpackage.wb2
    public final void C() {
        g1(true);
    }

    @Override // defpackage.z, defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        super.L(ju3Var, ku3Var, j);
        if (ku3Var != ku3.t) {
            if (ku3Var == ku3.a) {
                if (this.R != null) {
                    List list = ju3Var.g;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        qu3 qu3Var = (qu3) list.get(i);
                        if (qu3Var.q() && qu3Var != this.R) {
                            g1(false);
                            break;
                        }
                    }
                }
                if (yf2.p(this.H, "recognized")) {
                    this.H = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.R == null) {
            if (r25.v(ju3Var, true)) {
                qu3 qu3Var2 = (qu3) ju3Var.g.get(0);
                qu3Var2.g();
                this.R = qu3Var2;
                if (this.C) {
                    this.H = "waiting";
                    Z0(qu3Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = ju3Var.g;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!fd6.r((qu3) list2.get(i2))) {
                long jV0 = V0(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    qu3 qu3Var3 = (qu3) list2.get(i3);
                    if (qu3Var3.q() || fd6.x(qu3Var3, j, jV0)) {
                        g1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((qu3) list2.get(0)).g();
        if (this.C) {
            this.H = "recognized";
            qu3 qu3Var4 = this.R;
            qu3Var4.getClass();
            X0(qu3Var4.v(), false);
            e1();
        }
        this.R = null;
    }

    public final void g1(boolean z) {
        if (z) {
            this.S = null;
        } else {
            this.R = null;
        }
        W0(z);
        this.H = "idle";
    }

    @Override // defpackage.wb2
    public final void h(ld1 ld1Var, ku3 ku3Var) {
        a1();
        if (this.C && this.G == null) {
            i12 i12VarY = dg6.y(this);
            Q0(i12VarY);
            this.G = i12VarY;
        }
        if (ku3Var != ku3.t) {
            if (ku3Var == ku3.a) {
                if (this.S != null) {
                    ArrayList arrayList = (ArrayList) ld1Var.n();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ob2 ob2Var = (ob2) arrayList.get(i);
                        if (ob2Var.v() && ob2Var != this.S) {
                            g1(true);
                            break;
                        }
                    }
                }
                if (yf2.p(this.H, "recognized")) {
                    this.H = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.S == null) {
            ArrayList arrayList2 = (ArrayList) ld1Var.n();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ai6.y((ob2) arrayList2.get(i2))) {
                    ob2 ob2Var2 = (ob2) ((ArrayList) ld1Var.n()).get(0);
                    ob2Var2.g();
                    this.S = ob2Var2;
                    if (this.C) {
                        this.H = "waiting";
                        Y0(ob2Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ArrayList arrayList3 = (ArrayList) ld1Var.n();
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ob2 ob2Var3 = (ob2) arrayList3.get(i3);
            if (ob2Var3.v() || !ob2Var3.n() || ob2Var3.r()) {
                float fN = ((bl5) v70.b(this, hp0.z)).n();
                ArrayList arrayList4 = (ArrayList) ld1Var.n();
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ob2 ob2Var4 = (ob2) arrayList4.get(i4);
                    long jY = ob2Var4.y();
                    ob2 ob2Var5 = this.S;
                    ob2Var5.getClass();
                    boolean z = Math.abs(wi3.r(wi3.n(jY, ob2Var5.y()))) > fN;
                    if (ob2Var4.v() || z) {
                        g1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((ob2) ((ArrayList) ld1Var.n()).get(0)).g();
        if (this.C) {
            this.H = "recognized";
            ob2 ob2Var6 = this.S;
            ob2Var6.getClass();
            X0(ob2Var6.y(), true);
            e1();
        }
        this.S = null;
    }

    @Override // defpackage.tu3
    public final void m0() {
        p72 p72Var;
        ja3 ja3Var = this.k;
        if (ja3Var != null && (p72Var = this.K) != null) {
            ja3Var.r(new q72(p72Var));
        }
        this.K = null;
        g1(false);
    }
}
