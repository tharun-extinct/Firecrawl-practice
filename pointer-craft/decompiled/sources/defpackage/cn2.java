package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cn2 implements qy4 {
    public float a;
    public fl2 j = fl2.t;
    public final /* synthetic */ in2 m;
    public float t;

    public cn2(in2 in2Var) {
        this.m = in2Var;
    }

    @Override // defpackage.qy4
    public final List J(bz1 bz1Var, Object obj) {
        in2 in2Var = this.m;
        in2Var.t();
        um2 um2Var = in2Var.j;
        qm2 qm2Var = um2Var.N.n;
        qm2 qm2Var2 = qm2.a;
        qm2 qm2Var3 = qm2.j;
        if (qm2Var != qm2Var3 && qm2Var != qm2Var2 && qm2Var != qm2.t && qm2Var != qm2.m) {
            mc2.y("subcompose can only be used inside the measure or layout blocks");
        }
        hb3 hb3Var = in2Var.c;
        Object objL = hb3Var.l(obj);
        if (objL == null) {
            objL = (um2) in2Var.s.q(obj);
            if (objL != null) {
                if (in2Var.o <= 0) {
                    mc2.y("Check failed.");
                }
                in2Var.o--;
            } else {
                objL = in2Var.i(obj);
                if (objL == null) {
                    int i = in2Var.m;
                    um2 um2Var2 = new um2(2);
                    um2Var.k = true;
                    um2Var.D(i, um2Var2);
                    um2Var.k = false;
                    objL = um2Var2;
                }
            }
            hb3Var.c(obj, objL);
        }
        um2 um2Var3 = (um2) objL;
        if (cj0.m0(in2Var.m, um2Var.b()) != um2Var3) {
            int iM = ((qb3) um2Var.b()).j.m(um2Var3);
            if (iM < in2Var.m) {
                mc2.g("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = in2Var.m;
            if (i2 != iM) {
                in2Var.m(iM, i2);
            }
        }
        in2Var.m++;
        in2Var.c(um2Var3, obj, false, bz1Var);
        return (qm2Var == qm2Var3 || qm2Var == qm2Var2) ? um2Var3.c() : um2Var3.w();
    }

    @Override // defpackage.v33
    public final u33 U(int i, int i2, Map map, xy1 xy1Var, xy1 xy1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mc2.y("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new bn2(i, i2, map, xy1Var, this, this.m, xy1Var2);
    }

    @Override // defpackage.rf2
    public final fl2 getLayoutDirection() {
        return this.j;
    }

    @Override // defpackage.rf2
    public final boolean u() {
        qm2 qm2Var = this.m.j.N.n;
        return qm2Var == qm2.m || qm2Var == qm2.t;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.a;
    }

    @Override // defpackage.j51
    public final float y() {
        return this.t;
    }
}
