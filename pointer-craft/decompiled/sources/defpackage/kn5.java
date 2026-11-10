package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kn5 implements cz1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ bw4 t;

    public /* synthetic */ kn5(byte b, xy1 xy1Var, ob3 ob3Var) {
        this.j = b;
        this.t = ob3Var;
        this.a = xy1Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        l76 l76Var = oo0.g;
        sx1 sx1Var = um2.Z;
        final xy1 xy1Var = this.a;
        final bw4 bw4Var = this.t;
        final byte b2 = 0;
        switch (b) {
            case 0:
                on0 on0Var = tg1.m;
                on0 on0Var2 = tg1.c;
                on0 on0Var3 = tg1.q;
                on0 on0Var4 = tg1.w;
                zn3 zn3Var = (zn3) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                k00 k00Var = hi0.w;
                zn3Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= h02Var.x(zn3Var) ? 4 : 2;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    h02Var.Q();
                } else if (!((List) bw4Var.getValue()).isEmpty()) {
                    h02Var.X(379184217);
                    j73 j73VarD0 = ue5.d0(mq4.r, zn3Var);
                    t33 t33VarR = z50.r(k00Var, false);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarD0);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var4, h02Var, t33VarR);
                    xs2.E(on0Var3, h02Var, tr3VarQ);
                    xs2.E(on0Var2, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(on0Var, h02Var, j73VarW);
                    i00 i00Var = hi0.o;
                    j73 j73VarE0 = ue5.e0(g73.g, 16.0f);
                    boolean zX = h02Var.x(bw4Var) | h02Var.x(xy1Var);
                    Object objK = h02Var.K();
                    if (zX || objK == l76Var) {
                        final byte b3 = 1;
                        objK = new xy1() { // from class: mn5
                            @Override // defpackage.xy1
                            public final Object a(Object obj4) {
                                byte b4 = b3;
                                og5 og5Var2 = og5.g;
                                xy1 xy1Var2 = xy1Var;
                                bw4 bw4Var2 = bw4Var;
                                es2 es2Var = (es2) obj4;
                                switch (b4) {
                                    case 0:
                                        es2Var.getClass();
                                        List list = (List) bw4Var2.getValue();
                                        es2Var.H(list.size(), null, new wk0(list, (byte) 11), new nm0(802480018, true, new xk0(list, xy1Var2, (byte) 2)));
                                        break;
                                    default:
                                        es2Var.getClass();
                                        es2.G(es2Var, null, d06.n, 3);
                                        List list2 = (List) bw4Var2.getValue();
                                        es2Var.H(list2.size(), null, new wk0(list2, (byte) 10), new nm0(802480018, true, new xk0(list2, xy1Var2, (byte) 1)));
                                        break;
                                }
                                return og5Var2;
                            }
                        };
                        h02Var.i0(objK);
                    }
                    aq2.g(j73VarE0, null, null, null, i00Var, null, false, null, (xy1) objK, h02Var, 196614, 478);
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    h02Var.X(378728672);
                    j73 j73VarE1 = ue5.e0(ue5.d0(mq4.r, zn3Var), 24.0f);
                    t33 t33VarR2 = z50.r(k00Var, false);
                    int iHashCode2 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ2 = h02Var.q();
                    j73 j73VarW2 = m50.W(h02Var, j73VarE1);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var4, h02Var, t33VarR2);
                    xs2.E(on0Var3, h02Var, tr3VarQ2);
                    xs2.E(on0Var2, h02Var, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var);
                    xs2.E(on0Var, h02Var, j73VarW2);
                    g75.y(xs2.I(R.string.widget_no_devices, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).a, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    h02Var.b(false);
                }
                break;
            default:
                zn3 zn3Var2 = (zn3) obj;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zn3Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var2.x(zn3Var2) ? 4 : 2;
                }
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    h02Var2.Q();
                } else if (!((List) bw4Var.getValue()).isEmpty()) {
                    h02Var2.X(-1224123595);
                    j73 j73VarD1 = ue5.d0(mq4.r, zn3Var2);
                    boolean zX2 = h02Var2.x(bw4Var) | h02Var2.x(xy1Var);
                    Object objK2 = h02Var2.K();
                    if (zX2 || objK2 == l76Var) {
                        objK2 = new xy1() { // from class: mn5
                            @Override // defpackage.xy1
                            public final Object a(Object obj4) {
                                byte b4 = b2;
                                og5 og5Var2 = og5.g;
                                xy1 xy1Var2 = xy1Var;
                                bw4 bw4Var2 = bw4Var;
                                es2 es2Var = (es2) obj4;
                                switch (b4) {
                                    case 0:
                                        es2Var.getClass();
                                        List list = (List) bw4Var2.getValue();
                                        es2Var.H(list.size(), null, new wk0(list, (byte) 11), new nm0(802480018, true, new xk0(list, xy1Var2, (byte) 2)));
                                        break;
                                    default:
                                        es2Var.getClass();
                                        es2.G(es2Var, null, d06.n, 3);
                                        List list2 = (List) bw4Var2.getValue();
                                        es2Var.H(list2.size(), null, new wk0(list2, (byte) 10), new nm0(802480018, true, new xk0(list2, xy1Var2, (byte) 1)));
                                        break;
                                }
                                return og5Var2;
                            }
                        };
                        h02Var2.i0(objK2);
                    }
                    aq2.g(j73VarD1, null, null, null, null, null, false, null, (xy1) objK2, h02Var2, 0, 510);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(-1224560664);
                    j73 j73VarE2 = ue5.e0(ue5.d0(mq4.r, zn3Var2), 24.0f);
                    t33 t33VarR3 = z50.r(hi0.w, false);
                    int iHashCode3 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ3 = h02Var2.q();
                    j73 j73VarW3 = m50.W(h02Var2, j73VarE2);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, t33VarR3);
                    xs2.E(tg1.q, h02Var2, tr3VarQ3);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode3));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW3);
                    g75.y(xs2.I(R.string.widget_no_layouts, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).a, h02Var2, 0, 0, 131070);
                    h02Var2.b(true);
                    h02Var2.b(false);
                }
                break;
        }
        return og5Var;
    }
}
