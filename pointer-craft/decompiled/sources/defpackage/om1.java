package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class om1 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ om1(boolean z, qp3 qp3Var, qp3 qp3Var2) {
        this.j = (byte) 0;
        this.t = z;
        this.a = qp3Var;
        this.m = qp3Var2;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        Object obj4 = this.m;
        boolean z = this.t;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                v33 v33Var = (v33) obj;
                p33 p33Var = (p33) obj2;
                ws0 ws0Var = (ws0) obj3;
                int iL = zs0.l(((qp3) obj5).d(), ws0Var.g);
                long j = ws0Var.g;
                int iX = zs0.x(((qp3) obj4).d(), j);
                int iM = z ? iL : ws0.m(j);
                if (!z) {
                    iL = ws0.t(j);
                }
                us3 us3VarV = p33Var.v(ws0.y(ws0Var.g, iM, iL, 0, iX, 4));
                return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 1));
            case 1:
                s55 s55Var = (s55) obj5;
                tp3 tp3Var = s55Var.x;
                ja3 ja3Var = (ja3) obj4;
                h02 h02Var = (h02) obj2;
                ((Integer) obj3).getClass();
                h02Var.X(-2137546592);
                boolean z2 = ((um3) tp3Var.getValue()) == um3.j || !(h02Var.a(hp0.c) == fl2.t);
                boolean zX = h02Var.x(s55Var);
                Object objK = h02Var.K();
                l76 l76Var = oo0.g;
                if (zX || objK == l76Var) {
                    objK = new ll2(s55Var, (byte) 24);
                    h02Var.i0(objK);
                }
                ob3 ob3VarQ = kq2.Q((xy1) objK, h02Var);
                Object objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    b31 b31Var = new b31(new ff(ob3VarQ, (byte) 18));
                    h02Var.i0(b31Var);
                    objK2 = b31Var;
                }
                gg4 gg4Var = (gg4) objK2;
                boolean zX2 = h02Var.x(gg4Var) | h02Var.x(s55Var);
                Object objK3 = h02Var.K();
                if (zX2 || objK3 == l76Var) {
                    objK3 = new r55(gg4Var, s55Var);
                    h02Var.i0(objK3);
                }
                j73 j73VarG = yf4.g((r55) objK3, (um3) tp3Var.getValue(), z && s55Var.y.d() != 0.0f, z2, ja3Var);
                h02Var.b(false);
                return j73VarG;
            default:
                my1 my1Var = (my1) obj5;
                ob3 ob3Var = (ob3) obj4;
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j00 j00Var = hi0.u;
                    j73 j73VarI0 = ue5.i0(g73.g, 16.0f, 8.0f, 0.0f, 8.0f, 4);
                    kb4 kb4VarG = jb4.g(v70.y, j00Var, h02Var2, 48);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarI0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    boolean z3 = h02Var2.S;
                    sx1 sx1Var = um2.Z;
                    if (z3) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    on0 on0Var = tg1.w;
                    xs2.E(on0Var, h02Var2, kb4VarG);
                    on0 on0Var2 = tg1.q;
                    xs2.E(on0Var2, h02Var2, tr3VarQ);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    on0 on0Var3 = tg1.c;
                    xs2.E(on0Var3, h02Var2, numValueOf);
                    xs2.D(h02Var2);
                    on0 on0Var4 = tg1.m;
                    xs2.E(on0Var4, h02Var2, j73VarW);
                    yq yqVar = new yq(8.0f, true, new l0((byte) 2));
                    tp2 tp2Var = new tp2(1.0f, true);
                    ek0 ek0VarG = ck0.g(yqVar, hi0.h, h02Var2, 6);
                    int iHashCode2 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, tp2Var);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var, h02Var2, ek0VarG);
                    xs2.E(on0Var2, h02Var2, tr3VarQ2);
                    du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
                    xs2.E(on0Var4, h02Var2, j73VarW2);
                    e85 e85Var = (e85) ob3Var.getValue();
                    if (e85Var instanceof c85) {
                        h02Var2.X(-569124274);
                        aq2.l((c85) e85Var, z, h02Var2, 0);
                        h02Var2.b(false);
                    } else {
                        if (!yf2.p(e85Var, d85.g) && e85Var != null) {
                            h02Var2.X(-569127077);
                            h02Var2.b(false);
                            up.y();
                            return null;
                        }
                        h02Var2.X(-569120872);
                        aq2.m(0, h02Var2);
                        h02Var2.b(false);
                    }
                    h02Var2.b(true);
                    c93.s(my1Var, null, false, null, null, null, ai5.y, h02Var2, 805306368, 510);
                    h02Var2.b(true);
                } else {
                    h02Var2.Q();
                }
                return og5.g;
        }
    }

    public /* synthetic */ om1(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.a = obj;
        this.t = z;
        this.m = obj2;
    }
}
