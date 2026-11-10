package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ml3 extends bm3 {
    public static final ml3 r = new ml3(0, 1, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        u34 u34Var = (u34) ti0Var.r(0);
        Set set = (Set) i64Var.g;
        if (set == null) {
            return;
        }
        jr3 jr3Var = new jr3(set);
        hb3 hb3Var = (hb3) i64Var.a;
        if (hb3Var == null) {
            long[] jArr = ee4.g;
            hb3Var = new hb3();
            i64Var.a = hb3Var;
        }
        hb3Var.c(u34Var, jr3Var);
        ((rb3) i64Var.n).y(new l02(jr3Var, -1));
    }
}
