package defpackage;

import android.graphics.PathMeasure;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dh6 {
    public static final long g(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final md r() {
        return new md(new PathMeasure());
    }

    public static f25 v(tb4 tb4Var, String str) {
        long j;
        Map mapY;
        jl4 jl4Var;
        tb4Var.getClass();
        cc4 cc4VarO = tb4Var.O("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (cc4VarO.H()) {
                int iP = lr2.p(cc4VarO, "name");
                int iP2 = lr2.p(cc4VarO, "type");
                int iP3 = lr2.p(cc4VarO, "notnull");
                int iP4 = lr2.p(cc4VarO, "pk");
                int iP5 = lr2.p(cc4VarO, "dflt_value");
                f13 f13Var = new f13();
                while (true) {
                    String strQ = cc4VarO.q(iP);
                    j = j2;
                    f13Var.put(strQ, new c25(strQ, cc4VarO.q(iP2), cc4VarO.getLong(iP3) != j2, (int) cc4VarO.getLong(iP4), cc4VarO.isNull(iP5) ? null : cc4VarO.q(iP5), 2));
                    if (!cc4VarO.H()) {
                        break;
                    }
                    j2 = j;
                }
                mapY = f13Var.y();
                c93.h(cc4VarO, null);
            } else {
                mapY = qi1.j;
                c93.h(cc4VarO, null);
                j = 0;
            }
            cc4 cc4VarO2 = tb4Var.O("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iP6 = lr2.p(cc4VarO2, "id");
                int iP7 = lr2.p(cc4VarO2, "seq");
                int iP8 = lr2.p(cc4VarO2, "table");
                int iP9 = lr2.p(cc4VarO2, "on_delete");
                int iP10 = lr2.p(cc4VarO2, "on_update");
                List listJ = hf6.j(cc4VarO2);
                cc4VarO2.reset();
                jl4 jl4Var2 = new jl4();
                while (cc4VarO2.H()) {
                    if (cc4VarO2.getLong(iP7) == j) {
                        int i = (int) cc4VarO2.getLong(iP6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iP6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listJ) {
                            int i3 = iP7;
                            List list = listJ;
                            if (((aw1) obj).j == i) {
                                arrayList3.add(obj);
                            }
                            iP7 = i3;
                            listJ = list;
                        }
                        int i4 = iP7;
                        List list2 = listJ;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            aw1 aw1Var = (aw1) obj2;
                            arrayList.add(aw1Var.a);
                            arrayList2.add(aw1Var.m);
                            arrayList3 = arrayList3;
                        }
                        jl4Var2.add(new d25(cc4VarO2.q(iP8), cc4VarO2.q(iP9), cc4VarO2.q(iP10), arrayList, arrayList2));
                        iP6 = i2;
                        iP7 = i4;
                        listJ = list2;
                    }
                }
                jl4 jl4VarR = js2.r(jl4Var2);
                c93.h(cc4VarO2, null);
                cc4 cc4VarO3 = tb4Var.O("PRAGMA index_list(`" + str + "`)");
                try {
                    int iP11 = lr2.p(cc4VarO3, "name");
                    int iP12 = lr2.p(cc4VarO3, "origin");
                    int iP13 = lr2.p(cc4VarO3, "unique");
                    if (iP11 == -1 || iP12 == -1 || iP13 == -1) {
                        c93.h(cc4VarO3, null);
                        jl4Var = null;
                    } else {
                        jl4 jl4Var3 = new jl4();
                        while (cc4VarO3.H()) {
                            if ("c".equals(cc4VarO3.q(iP12))) {
                                e25 e25VarT = hf6.t(tb4Var, cc4VarO3.q(iP11), cc4VarO3.getLong(iP13) == 1);
                                if (e25VarT == null) {
                                    c93.h(cc4VarO3, null);
                                    jl4Var = null;
                                } else {
                                    jl4Var3.add(e25VarT);
                                }
                            }
                        }
                        jl4 jl4VarR2 = js2.r(jl4Var3);
                        c93.h(cc4VarO3, null);
                        jl4Var = jl4VarR2;
                    }
                    return new f25(str, mapY, jl4VarR, jl4Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c93.h(cc4VarO3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    c93.h(cc4VarO2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                c93.h(cc4VarO, th5);
                throw th6;
            }
        }
    }
}
