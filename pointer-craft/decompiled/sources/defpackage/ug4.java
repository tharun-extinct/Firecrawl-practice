package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ug4 {
    public static final ug4 g = new ug4();
    public static final float y = be6.y;

    public final void g(final String str, final xy1 xy1Var, final xy1 xy1Var2, final boolean z, final xy1 xy1Var3, final j73 j73Var, final boolean z2, final bz1 bz1Var, final bz1 bz1Var2, final bz1 bz1Var3, final t45 t45Var, h02 h02Var, final int i) {
        boolean z3;
        String str2;
        h02 h02Var2 = h02Var;
        h02Var2.Z(748018311);
        int i2 = i | (h02Var2.x(str) ? 4 : 2) | (h02Var2.j(xy1Var) ? 32 : 16) | (h02Var2.j(xy1Var2) ? 256 : 128) | (h02Var2.l(z) ? 2048 : 1024) | (h02Var2.j(xy1Var3) ? 16384 : 8192) | (h02Var2.l(z2) ? 1048576 : 524288) | (h02Var2.j(bz1Var) ? 8388608 : 4194304) | (h02Var2.j(bz1Var2) ? 67108864 : 33554432) | (h02Var2.j(bz1Var3) ? 536870912 : 268435456);
        if (h02Var2.N(i2 & 1, ((i2 & 306783379) == 306783378 && (((384 | (h02Var2.x(t45Var) ? (char) 4 : (char) 2)) | (h02Var2.x(null) ? 32 : 16)) & 147) == 146) ? false : true)) {
            h02Var2.S();
            if ((i & 1) != 0 && !h02Var2.k()) {
                h02Var2.Q();
            }
            h02Var2.s();
            h02Var2.X(1923851092);
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = du4.n(h02Var2);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var2.b(false);
            boolean zBooleanValue = ((Boolean) xf6.g(ja3Var, h02Var2, 0).getValue()).booleanValue();
            Object objK2 = h02Var2.K();
            if (objK2 == l76Var) {
                objK2 = new rt1();
                h02Var2.i0(objK2);
            }
            rt1 rt1Var = (rt1) objK2;
            lt1 lt1Var = (lt1) h02Var2.a(hp0.t);
            String strB = aq2.b(R.string.m3c_search_bar_search, h02Var2);
            String strB2 = aq2.b(R.string.m3c_suggestions_available, h02Var2);
            vf1 vf1Var = g75.g;
            long jY = ((k85) h02Var2.a(vf1Var)).y();
            if (jY == 16) {
                jY = t45Var.v(z2, false, zBooleanValue);
            }
            long j = jY;
            j73 j73VarG = qb6.g(mq4.m(j73Var, ah4.y, y, ah4.r, 8), rt1Var);
            boolean z4 = (57344 & i2) == 16384;
            Object objK3 = h02Var2.K();
            if (z4 || objK3 == l76Var) {
                objK3 = new tf(xy1Var3, (byte) 6);
                h02Var2.i0(objK3);
            }
            j73 j73VarY = lb6.y(j73VarG, (xy1) objK3);
            boolean zX = h02Var2.x(strB) | ((i2 & 7168) == 2048) | h02Var2.x(strB2);
            Object objK4 = h02Var2.K();
            if (zX || objK4 == l76Var) {
                z3 = false;
                objK4 = new qg4((byte) 0, strB, strB2, z);
                h02Var2.i0(objK4);
            } else {
                z3 = false;
            }
            j73 j73VarG2 = dj4.g(j73VarY, z3, (xy1) objK4);
            k85 k85VarN = ((k85) h02Var2.a(vf1Var)).n(new k85(j, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214));
            cu4 cu4Var = new cu4(t45Var.t);
            vj2 vj2Var = new vj2(119);
            int i3 = i2 & 14;
            boolean z5 = ((i2 & 896) == 256 ? true : z3) | (i3 == 4 ? true : z3);
            Object objK5 = h02Var2.K();
            if (z5 || objK5 == l76Var) {
                str2 = str;
                objK5 = new kn2(xy1Var2, str2, (byte) 13);
                h02Var2.i0(objK5);
            } else {
                str2 = str;
            }
            boolean z6 = z3;
            bz.g(str, xy1Var, j73VarG2, z2, false, k85VarN, vj2Var, new si2((xy1) objK5, 47), true, 0, 0, null, null, ja3Var, cu4Var, ue5.m0(-813926844, new tg4(str2, z2, ja3Var, bz1Var, bz1Var2, bz1Var3, t45Var, zBooleanValue), h02Var2), h02Var, i3 | 102236160 | (i2 & 112) | ((i2 >> 9) & 7168), 196608, 7696);
            h02Var2 = h02Var;
            boolean z7 = (z || !zBooleanValue) ? z6 : true;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zL = h02Var2.l(z7) | h02Var2.j(lt1Var);
            Object objK6 = h02Var2.K();
            if (zL || objK6 == l76Var) {
                objK6 = new lr0(z7, (Object) lt1Var, (mu0) null, (byte) 2);
                h02Var2.i0(objK6);
            }
            k33.b((bz1) objK6, h02Var2, boolValueOf);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, xy1Var, xy1Var2, z, xy1Var3, j73Var, z2, bz1Var, bz1Var2, bz1Var3, t45Var, i) { // from class: rg4
                public final /* synthetic */ xy1 a;
                public final /* synthetic */ bz1 b;
                public final /* synthetic */ j73 c;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ xy1 m;
                public final /* synthetic */ bz1 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ bz1 s;
                public final /* synthetic */ String t;
                public final /* synthetic */ t45 u;
                public final /* synthetic */ xy1 w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(196609);
                    this.j.g(this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, this.p, this.u, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }
}
