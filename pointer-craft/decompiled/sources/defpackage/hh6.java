package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hh6 {
    public static ha2 g;
    public static ha2 y;

    public static final void g(j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(2064964257);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            y(j73Var, nm0Var, h02Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new df(j73Var, nm0Var, i, b);
        }
    }

    public static final cf n(my1 my1Var, h02 h02Var, int i) {
        View view = (View) h02Var.a(sa.x);
        boolean zX = h02Var.x(view);
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (zX || objK == obj) {
            objK = new cf(view, null, my1Var);
            h02Var.i0(objK);
        }
        cf cfVar = (cf) objK;
        boolean zJ = h02Var.j(cfVar);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == obj) {
            objK2 = new ve(cfVar, (byte) 3);
            h02Var.i0(objK2);
        }
        k33.j(cfVar, (xy1) objK2, h02Var);
        return cfVar;
    }

    public static final Object r(nj6 nj6Var, ou0 ou0Var) throws Exception {
        if (!nj6Var.j()) {
            ib0 ib0Var = new ib0(1, pw5.o(ou0Var));
            ib0Var.o();
            nj6Var.y(aa1.t, new s25(ib0Var));
            return ib0Var.z();
        }
        Exception excX = nj6Var.x();
        if (excX != null) {
            throw excX;
        }
        if (!nj6Var.n) {
            return nj6Var.l();
        }
        throw new CancellationException("Task " + nj6Var + " was cancelled normally.");
    }

    public static final void y(j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(771959668);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(nm0Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                tp3 tp3Var = new tp3(null, hi0.B);
                h02Var.i0(tp3Var);
                objK = tp3Var;
            }
            ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new ef(ob3Var, (byte) 0);
                h02Var.i0(objK2);
            }
            og0.y(f45.y.g(n((my1) objK2, h02Var, 0)), ue5.m0(-291176396, new r2((Object) j73Var, (Object) ob3Var, (Object) nm0Var, b), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new df(j73Var, nm0Var, i, b2);
        }
    }
}
