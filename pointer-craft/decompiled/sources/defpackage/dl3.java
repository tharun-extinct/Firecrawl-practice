package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dl3 extends bm3 {
    public static final dl3 r = new dl3(0, 1, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        rb3 rb3Var;
        u34 u34Var = (u34) ti0Var.r(0);
        hb3 hb3Var = (hb3) i64Var.a;
        if (hb3Var == null || ((jr3) hb3Var.l(u34Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) i64Var.m;
        if (arrayList != null && (rb3Var = (rb3) arrayList.remove(arrayList.size() - 1)) != null) {
            i64Var.n = rb3Var;
        }
        hb3Var.q(u34Var);
    }
}
