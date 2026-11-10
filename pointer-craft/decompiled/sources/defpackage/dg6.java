package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dg6 {
    public static final void g(j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(-1854833411);
        int i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = mb.v;
                h02Var.i0(objK);
            }
            t33 t33Var = (t33) objK;
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73Var);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33Var);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.h(6, nm0Var, h02Var, true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new jp4(b, i, j73Var, nm0Var);
        }
    }

    public static final void n(p41 p41Var, xy1 xy1Var) {
        sp2.k(p41Var, i12.f, new tf(xy1Var, (byte) 3));
    }

    public static final ba3 r(g4... g4VarArr) {
        ArrayList arrayList = new ArrayList(g4VarArr.length);
        if (g4VarArr.length > 0) {
            g4 g4Var = g4VarArr[0];
            throw null;
        }
        fp3[] fp3VarArr = (fp3[]) arrayList.toArray(new fp3[0]);
        fp3[] fp3VarArr2 = (fp3[]) Arrays.copyOf(fp3VarArr, fp3VarArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(v13.h(fp3VarArr2.length));
        v13.B(linkedHashMap, fp3VarArr2);
        return new ba3(linkedHashMap);
    }

    public static final i12 y(h12 h12Var) {
        return new i12(h12Var);
    }
}
