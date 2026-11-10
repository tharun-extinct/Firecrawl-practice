package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yw implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;

    public /* synthetic */ yw(zf5 zf5Var, j73 j73Var, boolean z, xy1 xy1Var, int i) {
        this.j = (byte) 3;
        this.a = zf5Var;
        this.m = j73Var;
        this.t = z;
        this.q = xy1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        boolean z = this.t;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        Object obj3 = this.q;
        Object obj4 = this.m;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                px5.g((ql4) obj5, this.t, (bz1) obj4, (bz1) obj3, (h02) obj, aq2.J(9));
                break;
            case 1:
                String str = (String) obj5;
                xy1 xy1Var = (xy1) obj4;
                ob3 ob3Var = (ob3) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    gp4.t(xs2.I(R.string.connection_option_c, h02Var), xs2.I(R.string.connect_hidden_title, h02Var), xs2.I(R.string.connect_hidden_subtitle, h02Var), 0L, ue5.m0(-1088945043, new gx(str, xy1Var, ob3Var, z), h02Var), h02Var, 24576, 8);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                lf6.g(this.t, (xy1) obj5, (j73) obj4, (nm0) obj3, (h02) obj, aq2.J(3121));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hc6.v((zf5) obj5, (j73) obj4, this.t, (xy1) obj3, (h02) obj, aq2.J(1));
                break;
            case 4:
                xy1 xy1Var2 = (xy1) obj5;
                ob3 ob3Var2 = (ob3) obj4;
                ob3 ob3Var3 = (ob3) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    boolean zL = h02Var2.l(z) | h02Var2.x(xy1Var2);
                    Object objK = h02Var2.K();
                    if (zL || objK == l76Var) {
                        objK = new sn2(z, xy1Var2, ob3Var2, ob3Var3);
                        h02Var2.i0(objK);
                    }
                    c93.s((my1) objK, null, false, null, null, null, mz5.x, h02Var2, 805306368, 510);
                }
                break;
            case 5:
                ob3 ob3Var4 = (ob3) obj5;
                ob3 ob3Var5 = (ob3) obj4;
                ob3 ob3Var6 = (ob3) obj3;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    rf4 rf4VarO = gp4.O(h02Var3);
                    g73 g73Var = g73.g;
                    j73 j73VarP = gp4.P(g73Var, rf4VarO, true);
                    ek0 ek0VarG = ck0.g(new yq(8.0f, true, new l0((byte) 2)), hi0.h, h02Var3, 6);
                    int iHashCode = Long.hashCode(h02Var3.T);
                    tr3 tr3VarQ = h02Var3.q();
                    j73 j73VarW = m50.W(h02Var3, j73VarP);
                    jo0.n.getClass();
                    h02Var3.b0();
                    boolean z2 = h02Var3.S;
                    sx1 sx1Var = um2.Z;
                    if (z2) {
                        h02Var3.m(sx1Var);
                    } else {
                        h02Var3.l0();
                    }
                    on0 on0Var = tg1.w;
                    xs2.E(on0Var, h02Var3, ek0VarG);
                    on0 on0Var2 = tg1.q;
                    xs2.E(on0Var2, h02Var3, tr3VarQ);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    on0 on0Var3 = tg1.c;
                    xs2.E(on0Var3, h02Var3, numValueOf);
                    xs2.D(h02Var3);
                    on0 on0Var4 = tg1.m;
                    xs2.E(on0Var4, h02Var3, j73VarW);
                    g75.y(xs2.I(R.string.layout_share_description, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    Object objK2 = h02Var3.K();
                    if (objK2 == l76Var) {
                        objK2 = new ef(ob3Var4, (byte) 24);
                        h02Var3.i0(objK2);
                    }
                    j73 j73VarI = ue5.I(j73VarR, false, null, null, (my1) objK2, 15);
                    kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var3, 48);
                    int iHashCode2 = Long.hashCode(h02Var3.T);
                    tr3 tr3VarQ2 = h02Var3.q();
                    j73 j73VarW2 = m50.W(h02Var3, j73VarI);
                    h02Var3.b0();
                    if (h02Var3.S) {
                        h02Var3.m(sx1Var);
                    } else {
                        h02Var3.l0();
                    }
                    xs2.E(on0Var, h02Var3, kb4VarG);
                    xs2.E(on0Var2, h02Var3, tr3VarQ2);
                    du4.k(iHashCode2, h02Var3, on0Var3, h02Var3);
                    xs2.E(on0Var4, h02Var3, j73VarW2);
                    Object objK3 = h02Var3.K();
                    if (objK3 == l76Var) {
                        objK3 = new ff(ob3Var4, (byte) 12);
                        h02Var3.i0(objK3);
                    }
                    boolean z3 = this.t;
                    cc6.g(z3, (xy1) objK3, null, false, null, h02Var3, 48);
                    g75.y(xs2.I(R.string.share_dialog_public_sharing, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                    h02 h02Var4 = h02Var3;
                    h02Var4.b(true);
                    if (z3) {
                        h02Var4.X(248596704);
                        String str2 = ((wn4) ob3Var5.getValue()).y;
                        Object objK4 = h02Var4.K();
                        if (objK4 == l76Var) {
                            objK4 = new ff(ob3Var5, (byte) 13);
                            h02Var4.i0(objK4);
                        }
                        ec6.g(str2, (xy1) objK4, null, false, null, mz5.a, ((Boolean) ob3Var6.getValue()).booleanValue() && ((wn4) ob3Var5.getValue()).y.length() == 0, null, null, null, false, 0, 0, null, null, h02Var4, 1572912, 0, 8380348);
                        String str3 = ((wn4) ob3Var5.getValue()).g;
                        Object objK5 = h02Var4.K();
                        if (objK5 == l76Var) {
                            objK5 = new ff(ob3Var5, (byte) 14);
                            h02Var4.i0(objK5);
                        }
                        ec6.g(str3, (xy1) objK5, null, false, null, mz5.m, ((Boolean) ob3Var6.getValue()).booleanValue() && ((wn4) ob3Var5.getValue()).g.length() == 0, null, null, null, false, 0, 0, null, null, h02Var4, 1572912, 0, 8380348);
                        h02Var4 = h02Var4;
                        Object objK6 = h02Var4.K();
                        if (objK6 == l76Var) {
                            objK6 = new ff(ob3Var5, (byte) 15);
                            h02Var4.i0(objK6);
                        }
                        nc6.g((xy1) objK6, h02Var4, 6);
                        h02Var4.b(false);
                    } else {
                        h02Var4.X(249902703);
                        h02Var4.b(false);
                    }
                    h02Var4.b(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kp4.y((zf5) obj5, this.t, (j73) obj4, (my1) obj3, (h02) obj, aq2.J(1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ yw(Object obj, boolean z, Object obj2, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = z;
        this.m = obj2;
        this.q = jz1Var;
    }

    public /* synthetic */ yw(String str, xy1 xy1Var, ob3 ob3Var, boolean z) {
        this.j = (byte) 1;
        this.a = str;
        this.m = xy1Var;
        this.q = ob3Var;
        this.t = z;
    }

    public /* synthetic */ yw(boolean z, xy1 xy1Var, j73 j73Var, nm0 nm0Var, int i) {
        this.j = (byte) 2;
        this.t = z;
        this.a = xy1Var;
        this.m = j73Var;
        this.q = nm0Var;
    }

    public /* synthetic */ yw(boolean z, Object obj, ob3 ob3Var, ob3 ob3Var2, byte b) {
        this.j = b;
        this.t = z;
        this.a = obj;
        this.m = ob3Var;
        this.q = ob3Var2;
    }
}
