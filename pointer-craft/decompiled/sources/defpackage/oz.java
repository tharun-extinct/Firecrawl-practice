package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oz implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ String t;

    public /* synthetic */ oz(g52 g52Var, String str) {
        this.j = (byte) 5;
        this.t = str;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) throws Exception {
        byte b = this.j;
        h61 h61Var = null;
        Long lValueOf = null;
        og5 og5Var = og5.g;
        String str = this.t;
        switch (b) {
            case 0:
                nj4 nj4Var = (nj4) obj;
                ci2[] ci2VarArr = lj4.g;
                mj4 mj4Var = kj4.m;
                ci2 ci2Var = lj4.g[3];
                fx2 fx2VarG = fx2.g(1);
                mj4Var.getClass();
                nj4Var.g(mj4Var, fx2VarG);
                lj4.l(nj4Var, str);
                return og5Var;
            case 1:
                return g61.r((g61) obj, this.t, 0, 0, 0, 0, false, 0, 0, 0L, 0L, false, false, false, 131070);
            case 2:
                lj4.n((nj4) obj, str);
                return og5Var;
            case 3:
                lj4.l((nj4) obj, str);
                return og5Var;
            case 4:
                tb4 tb4Var = (tb4) obj;
                tb4Var.getClass();
                cc4 cc4VarO = tb4Var.O("SELECT * FROM DeviceConfig WHERE macAddress = ?");
                try {
                    cc4VarO.m(str, 1);
                    int iZ = jr2.z(cc4VarO, "macAddress");
                    int iZ2 = jr2.z(cc4VarO, "mousePointerSpeed");
                    int iZ3 = jr2.z(cc4VarO, "airMouseSpeed");
                    int iZ4 = jr2.z(cc4VarO, "scrollSpeed");
                    int iZ5 = jr2.z(cc4VarO, "mouseJiggleMode");
                    int iZ6 = jr2.z(cc4VarO, "layoutScreen");
                    int iZ7 = jr2.z(cc4VarO, "layoutScreenLayoutId");
                    int iZ8 = jr2.z(cc4VarO, "keyboardLanguageLayout");
                    int iZ9 = jr2.z(cc4VarO, "lastUsedDate");
                    int iZ10 = jr2.z(cc4VarO, "addedDate");
                    if (cc4VarO.H()) {
                        String strQ = cc4VarO.q(iZ);
                        int i = (int) cc4VarO.getLong(iZ2);
                        int i2 = (int) cc4VarO.getLong(iZ3);
                        int i3 = (int) cc4VarO.getLong(iZ4);
                        String strQ2 = cc4VarO.q(iZ5);
                        int i4 = (int) cc4VarO.getLong(iZ6);
                        int i5 = (int) cc4VarO.getLong(iZ7);
                        String strQ3 = cc4VarO.q(iZ8);
                        Date dateE = bi6.e(cc4VarO.isNull(iZ9) ? null : Long.valueOf(cc4VarO.getLong(iZ9)));
                        if (dateE == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        if (!cc4VarO.isNull(iZ10)) {
                            lValueOf = Long.valueOf(cc4VarO.getLong(iZ10));
                        }
                        Date dateE2 = bi6.e(lValueOf);
                        if (dateE2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        h61Var = new h61(strQ, i, i2, i3, strQ2, i4, i5, strQ3, dateE, dateE2);
                    }
                    cc4VarO.close();
                    return h61Var;
                } catch (Throwable th) {
                    cc4VarO.close();
                    throw th;
                }
            case 5:
                db3 db3Var = (db3) obj;
                db3Var.v(g52.n, str);
                g52.n(db3Var, str);
                return null;
            case 6:
                nj4 nj4Var2 = (nj4) obj;
                lj4.l(nj4Var2, str);
                lj4.w(nj4Var2, 0.0f);
                return og5Var;
            case 7:
                xd3 xd3Var = (xd3) obj;
                xd3Var.getClass();
                if (str != null) {
                    if (tx4.Y(str)) {
                        l0.u("Cannot pop up to an empty route");
                        return null;
                    }
                    xd3Var.v = str;
                    xd3Var.x = false;
                    xd3Var.g(-1);
                    xd3Var.x = true;
                    xd3Var.l = false;
                }
                xd3Var.y = true;
                xd3Var.r = false;
                return og5Var;
            case 8:
                xd3 xd3Var2 = (xd3) obj;
                xd3Var2.getClass();
                str.getClass();
                if (tx4.Y(str)) {
                    l0.u("Cannot pop up to an empty route");
                    return null;
                }
                xd3Var2.v = str;
                xd3Var2.x = false;
                xd3Var2.g(-1);
                xd3Var2.x = true;
                xd3Var2.l = false;
                return og5Var;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                if (tx4.Y(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            default:
                ci2[] ci2VarArr2 = lj4.g;
                ((nj4) obj).g(kj4.O, str);
                return og5Var;
        }
    }

    public /* synthetic */ oz(String str, byte b) {
        this.j = b;
        this.t = str;
    }

    public /* synthetic */ oz(String str, k61 k61Var) {
        this.j = (byte) 4;
        this.t = str;
    }
}
