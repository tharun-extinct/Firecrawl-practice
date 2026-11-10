package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd implements dz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ jd(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = 0;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                kd kdVar = (kd) obj5;
                kf5 kf5VarY = ((mu1) kdVar.q).y((lu1) obj, (qv1) obj2, ((lv1) obj3).g, ((mv1) obj4).g);
                if (kf5VarY instanceof jf5) {
                    Object obj6 = ((jf5) kf5VarY).j;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                q70 q70Var = new q70(kf5VarY, kdVar.s);
                kdVar.s = q70Var;
                return q70Var.f();
            case 1:
                my1 my1Var = (my1) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h02 h02Var = (h02) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= h02Var.l(zBooleanValue) ? 32 : 16;
                }
                if (h02Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    vj3 vj3VarG = ox2.g(h02Var);
                    vj3VarG.getClass();
                    tj3 tj3VarY = vj3VarG.y();
                    if (zBooleanValue) {
                        h02Var.X(987375976);
                        boolean zJ = h02Var.j(tj3VarY);
                        Object objK = h02Var.K();
                        if (zJ || objK == oo0.g) {
                            objK = new yo(tj3VarY, b2);
                            h02Var.i0(objK);
                        }
                        k33.w(kq2.R((my1) objK, h02Var), null, false, null, null, m50.n, h02Var, 1572864, 62);
                        h02Var.b(false);
                    } else {
                        h02Var.X(987672088);
                        k33.w(my1Var, null, false, null, null, m50.v, h02Var, 1572864, 62);
                        h02Var.b(false);
                    }
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 2:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((kz4) obj5).t(new fy1(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 3:
                nm0 nm0Var = (nm0) obj5;
                bq2 bq2Var = (bq2) obj;
                ((Integer) obj2).getClass();
                h02 h02Var2 = (h02) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var2.x(bq2Var) ? 4 : 2;
                }
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    nm0Var.x(bq2Var, h02Var2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            default:
                List list = (List) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                h02 h02Var3 = (h02) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((no3) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= h02Var3.n(iIntValue3) ? 32 : 16;
                }
                if (h02Var3.N(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    c93.w((kk3) list.get(iIntValue3), h02Var3, 0);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
        }
    }
}
