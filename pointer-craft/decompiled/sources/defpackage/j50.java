package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j50 {
    public static final j50 g = new j50();
    public static final float y = 640.0f;
    public static final float r = 56.0f;
    public static final float n = 125.0f;

    public final void g(j73 j73Var, float f, float f2, cn4 cn4Var, long j, h02 h02Var, final int i) {
        final j73 j73Var2;
        final float f3;
        final float f4;
        final cn4 cn4Var2;
        final long j2;
        j73 j73Var3;
        float f5;
        long j3;
        cn4 cn4Var3;
        float f6;
        h02Var.Z(-1364277227);
        int i2 = i | 9654;
        if (h02Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                zw0 zw0Var = ((un4) h02Var.a(vn4.g)).v;
                long jV = tj0.v(ne6.r, h02Var);
                j73Var3 = g73.g;
                f5 = ne6.v;
                j3 = jV;
                cn4Var3 = zw0Var;
                f6 = ne6.n;
            } else {
                h02Var.Q();
                j73Var3 = j73Var;
                f5 = f;
                f6 = f2;
                cn4Var3 = cn4Var;
                j3 = j;
            }
            h02Var.s();
            String strB = aq2.b(R.string.m3c_bottom_sheet_drag_handle_description, h02Var);
            qe5 qe5Var = wo4.g;
            j73 j73VarG0 = ue5.g0(j73Var3, 0.0f, 22.0f, 1);
            boolean zX = h02Var.x(strB);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new oz(strB, (byte) 2);
                h02Var.i0(objK);
            }
            long j4 = j3;
            uz4.g(dj4.g(j73VarG0, false, (xy1) objK), cn4Var3, j4, 0L, 0.0f, 0.0f, null, ue5.m0(-1039573072, new i50(f5, f6), h02Var), h02Var, 12582912, 120);
            cn4Var2 = cn4Var3;
            j2 = j4;
            j73Var2 = j73Var3;
            f3 = f5;
            f4 = f6;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            f3 = f;
            f4 = f2;
            cn4Var2 = cn4Var;
            j2 = j;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j73Var2, f3, f4, cn4Var2, j2, i) { // from class: h50
                public final /* synthetic */ float a;
                public final /* synthetic */ float m;
                public final /* synthetic */ cn4 q;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ long w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(196609);
                    this.j.g(this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }
}
