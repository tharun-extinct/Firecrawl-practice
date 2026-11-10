package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wt3 {
    public static final vf1 g = new vf1(new yj2((byte) 5), (byte) 1);

    public static final void g(ad2 ad2Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1892278287);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(ad2Var) : h02Var.j(ad2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            j14 j14Var = g;
            pc0 pc0Var = (pc0) h02Var.a(j14Var);
            boolean zX = h02Var.x(pc0Var);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new pc0(ad2Var, pc0Var);
                h02Var.i0(objK);
            }
            pc0 pc0Var2 = (pc0) objK;
            pc0Var2.y.setValue(ad2Var);
            og0.y(j14Var.g(pc0Var2), nm0Var, h02Var, (i2 & 112) | 8);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ej((byte) 5, i, (Object) ad2Var, (Object) nm0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void r(pn3 pn3Var, pc0 pc0Var, bz1 bz1Var, ou0 ou0Var) {
        vt3 vt3Var;
        if (ou0Var instanceof vt3) {
            vt3Var = (vt3) ou0Var;
            int i = vt3Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                vt3Var.q = i - Integer.MIN_VALUE;
            } else {
                vt3Var = new vt3(ou0Var);
            }
        } else {
            vt3Var = new vt3(ou0Var);
        }
        Object obj = vt3Var.m;
        int i2 = vt3Var.q;
        if (i2 == 0) {
            js2.o(obj);
            if (pc0Var == null) {
                vt3Var.q = 1;
                ((ba) pn3Var).Q(bz1Var, vt3Var);
                return;
            } else {
                vt3Var.q = 2;
                pc0Var.g(pn3Var, bz1Var, vt3Var);
                return;
            }
        }
        if (i2 == 1) {
            js2.o(obj);
            up.q();
        } else if (i2 != 2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
        } else {
            js2.o(obj);
            up.q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void y(gt2 gt2Var, s3 s3Var, ou0 ou0Var) {
        ut3 ut3Var;
        if (ou0Var instanceof ut3) {
            ut3Var = (ut3) ou0Var;
            int i = ut3Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ut3Var.q = i - Integer.MIN_VALUE;
            } else {
                ut3Var = new ut3(ou0Var);
            }
        } else {
            ut3Var = new ut3(ou0Var);
        }
        Object obj = ut3Var.m;
        int i2 = ut3Var.q;
        if (i2 != 0) {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                js2.o(obj);
                up.q();
                return;
            }
        }
        js2.o(obj);
        if (!gt2Var.j.h) {
            l0.u("establishTextInputSession called from an unattached node");
            return;
        }
        pn3 pn3VarW = k33.W(gt2Var);
        tr3 tr3Var = (tr3) k33.V(gt2Var).I;
        tr3Var.getClass();
        pc0 pc0Var = (pc0) a11.e(tr3Var, g);
        ut3Var.q = 1;
        r(pn3VarW, pc0Var, s3Var, ut3Var);
    }
}
