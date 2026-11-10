package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i30 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ i30(int i, byte b) {
        this.j = b;
        this.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xy1
    public final Object a(Object obj) throws Exception {
        byte b = this.j;
        Object sk2Var = null;
        boolean z = false;
        int i = this.t;
        switch (b) {
            case 0:
                return g61.r((g61) obj, null, this.t, 0, 0, 0, false, 0, 0, 0L, 0L, false, false, false, 131063);
            case 1:
                return g61.t((g61) obj, 0, i, 1);
            case 2:
                return g61.r((g61) obj, null, 0, 0, 0, 0, true, this.t, 0, 0L, 0L, false, false, false, 130687);
            case 3:
                g61 g61Var = (g61) obj;
                int i2 = this.t;
                if (i2 == 12) {
                    g61Var.getClass();
                } else {
                    z = g61Var.k;
                }
                return g61.r(g61Var, null, i2, 0, 0, 0, false, 0, 0, 0L, 0L, false, false, z, 65527);
            case 4:
                return g61.r((g61) obj, null, 0, 0, this.t, 0, false, 0, 0, 0L, 0L, false, false, false, 131039);
            case 5:
                return Boolean.valueOf(((cu1) obj).Y0(i));
            case 6:
                return Boolean.valueOf(((cu1) obj).Y0(i));
            case 7:
                return Boolean.valueOf(((cu1) obj).Q0(i));
            case 8:
                tb4 tb4Var = (tb4) obj;
                tb4Var.getClass();
                cc4 cc4VarO = tb4Var.O("SELECT * FROM layout WHERE uid = ?");
                try {
                    cc4VarO.n(1, i);
                    int iZ = jr2.z(cc4VarO, "uid");
                    int iZ2 = jr2.z(cc4VarO, "name");
                    int iZ3 = jr2.z(cc4VarO, "starred");
                    int iZ4 = jr2.z(cc4VarO, "shareId");
                    int iZ5 = jr2.z(cc4VarO, "parentId");
                    int iZ6 = jr2.z(cc4VarO, "shareLink");
                    int iZ7 = jr2.z(cc4VarO, "uploadKey");
                    int iZ8 = jr2.z(cc4VarO, "data");
                    if (cc4VarO.H()) {
                        sk2Var = new sk2((int) cc4VarO.getLong(iZ), cc4VarO.isNull(iZ2) ? null : cc4VarO.q(iZ2), ((int) cc4VarO.getLong(iZ3)) != 0, cc4VarO.isNull(iZ4) ? null : cc4VarO.q(iZ4), cc4VarO.isNull(iZ5) ? null : cc4VarO.q(iZ5), cc4VarO.isNull(iZ6) ? null : cc4VarO.q(iZ6), cc4VarO.isNull(iZ7) ? null : cc4VarO.q(iZ7), cc4VarO.isNull(iZ8) ? null : cc4VarO.getBlob(iZ8));
                    }
                    return sk2Var;
                } finally {
                    cc4VarO.close();
                }
            default:
                tb4 tb4Var2 = (tb4) obj;
                tb4Var2.getClass();
                cc4 cc4VarO2 = tb4Var2.O("SELECT * FROM layout WHERE uid = ?");
                try {
                    cc4VarO2.n(1, i);
                    int iZ9 = jr2.z(cc4VarO2, "uid");
                    int iZ10 = jr2.z(cc4VarO2, "name");
                    int iZ11 = jr2.z(cc4VarO2, "starred");
                    int iZ12 = jr2.z(cc4VarO2, "shareId");
                    int iZ13 = jr2.z(cc4VarO2, "parentId");
                    int iZ14 = jr2.z(cc4VarO2, "shareLink");
                    int iZ15 = jr2.z(cc4VarO2, "uploadKey");
                    int iZ16 = jr2.z(cc4VarO2, "data");
                    if (cc4VarO2.H()) {
                        sk2Var = new sk2((int) cc4VarO2.getLong(iZ9), cc4VarO2.isNull(iZ10) ? null : cc4VarO2.q(iZ10), ((int) cc4VarO2.getLong(iZ11)) != 0, cc4VarO2.isNull(iZ12) ? null : cc4VarO2.q(iZ12), cc4VarO2.isNull(iZ13) ? null : cc4VarO2.q(iZ13), cc4VarO2.isNull(iZ14) ? null : cc4VarO2.q(iZ14), cc4VarO2.isNull(iZ15) ? null : cc4VarO2.q(iZ15), cc4VarO2.isNull(iZ16) ? null : cc4VarO2.getBlob(iZ16));
                    }
                    return sk2Var;
                } finally {
                    cc4VarO2.close();
                }
        }
    }
}
