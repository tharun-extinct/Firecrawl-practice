package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sl3 extends bm3 {
    public static final sl3 r = new sl3(0, 1, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        u34 u34Var = (u34) ti0Var.r(0);
        hb3 hb3Var = (hb3) i64Var.a;
        jr3 jr3Var = hb3Var != null ? (jr3) hb3Var.l(u34Var) : null;
        if (jr3Var != null) {
            ArrayList arrayList = (ArrayList) i64Var.m;
            if (arrayList == null) {
                arrayList = new ArrayList();
                i64Var.m = arrayList;
            }
            arrayList.add((rb3) i64Var.n);
            i64Var.n = jr3Var.t;
        }
    }
}
