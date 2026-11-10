package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ry5 {
    public static final nm0 g = new nm0(1217379926, false, new sm0(7));
    public static ha2 y;

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(ArrayList arrayList, zz4 zz4Var) {
        if (arrayList.isEmpty()) {
            return pi1.j;
        }
        g41[] g41VarArr = (g41[]) arrayList.toArray(new g41[0]);
        mv mvVar = new mv(g41VarArr);
        ib0 ib0Var = new ib0(1, pw5.o(zz4Var));
        ib0Var.o();
        int length = g41VarArr.length;
        kv[] kvVarArr = new kv[length];
        for (int i = 0; i < length; i++) {
            ja1 ja1Var = g41VarArr[i];
            ja1Var.start();
            kv kvVar = new kv(mvVar, ib0Var);
            kvVar.w = v70.A(ja1Var, kvVar);
            kvVarArr[i] = kvVar;
        }
        lv lvVar = new lv(kvVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            kv kvVar2 = kvVarArr[i2];
            kvVar2.getClass();
            qr.g.putObjectVolatile(kvVar2, kv.i, lvVar);
        }
        if (ib0Var.h() instanceof th3) {
            ib0Var.d(lvVar);
        } else {
            lvVar.g();
        }
        return ib0Var.z();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(up upVar, u03 u03Var, ou0 ou0Var) {
        t95 t95Var;
        if (ou0Var instanceof t95) {
            t95Var = (t95) ou0Var;
            int i = t95Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                t95Var.w = i - Integer.MIN_VALUE;
            } else {
                t95Var = new t95(ou0Var);
            }
        } else {
            t95Var = new t95(ou0Var);
        }
        Object obj = t95Var.q;
        int i2 = t95Var.w;
        mu0 mu0Var = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u03 u03Var2 = t95Var.m;
                js2.o(obj);
                return obj;
            }
            js2.o(obj);
            t95Var.m = u03Var;
            t95Var.w = 1;
            Object objB = k33.B(new u03(u03Var, upVar, mu0Var, (byte) 9), t95Var);
            px0 px0Var = px0.j;
            return objB == px0Var ? px0Var : objB;
        } catch (o95 e) {
            if (e.t == u03Var.hashCode()) {
                return null;
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(List list, ou0 ou0Var) {
        pv pvVar;
        Iterator it;
        int i;
        if (ou0Var instanceof pv) {
            pvVar = (pv) ou0Var;
            int i2 = pvVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pvVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pvVar = new pv(ou0Var);
            }
        } else {
            pvVar = new pv(ou0Var);
        }
        Object obj = pvVar.w;
        int i3 = pvVar.c;
        if (i3 == 0) {
            js2.o(obj);
            it = list.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = pvVar.q;
            it = pvVar.m;
            js2.o(obj);
        }
        while (it.hasNext()) {
            dh2 dh2Var = (dh2) it.next();
            pvVar.m = it;
            pvVar.q = i;
            pvVar.c = 1;
            Object objM = dh2Var.M(pvVar);
            px0 px0Var = px0.j;
            if (objM == px0Var) {
                return px0Var;
            }
        }
        return og5.g;
    }
}
