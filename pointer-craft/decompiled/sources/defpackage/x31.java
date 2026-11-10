package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x31 {
    public static final wv3 g;

    static {
        g = new wv3((30 & 1) == 0, ch4.j, true, 0);
    }

    public static final void g(xy xyVar, v35 v35Var, h02 h02Var, int i) {
        h02 h02Var2;
        Context context;
        h02Var.Z(1904307118);
        int i2 = (h02Var.x(xyVar) ? 4 : 2) | i | (h02Var.j(v35Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                h02Var.X(-1009482584);
                context = (Context) h02Var.a(sa.y);
                h02Var.b(false);
            } else {
                h02Var.X(-1009433480);
                h02Var.b(false);
                context = null;
            }
            boolean zJ = h02Var.j(v35Var) | ((i2 & 14) == 4) | h02Var.j(context);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new q2(v35Var, context, xyVar, (byte) 8);
                h02Var.i0(objK);
            }
            h02Var2 = h02Var;
            ju0.y(null, null, (xy1) objK, h02Var2, 0, 3);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ta((byte) 13, i, xyVar, v35Var);
        }
    }

    public static final void n(j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(1392105195);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            az5.g(j73Var, f45.g, nm0Var, h02Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new df(j73Var, nm0Var, i, b);
        }
    }

    public static final void r(xy xyVar, w35 w35Var, my1 my1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(xyVar) : h02Var.j(xyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? h02Var.x(w35Var) : h02Var.j(w35Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var) ? 256 : 128;
        }
        boolean z = false;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && h02Var.x(w35Var));
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z2 || objK == l76Var) {
                objK = new w03(new fa4(new p2(w35Var, my1Var, (byte) 20), (byte) 9));
                h02Var.i0(objK);
            }
            w03 w03Var = (w03) objK;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && h02Var.j(xyVar))) {
                z = true;
            }
            Object objK2 = h02Var.K();
            if (z || objK2 == l76Var) {
                objK2 = new qd(xyVar, (byte) 15);
                h02Var.i0(objK2);
            }
            de.g(w03Var, (my1) objK2, g, ue5.m0(1315155414, new ta(w35Var, xyVar, (byte) 12), h02Var), h02Var, 3456, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(xyVar, w35Var, my1Var, i, (byte) 5);
        }
    }

    public static final void y(final int i, final long j, h02 h02Var, final int i2) {
        final int i3;
        int i4;
        u34 u34VarP;
        bz1 bz1Var;
        h02Var.Z(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (h02Var.n(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.v(j) ? 32 : 16;
        }
        if (h02Var.N(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) h02Var.a(sa.y);
            boolean zX = ((i4 & 14) == 4) | h02Var.x(context);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zX || objK == obj) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                h02Var.i0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                u34VarP = h02Var.p();
                if (u34VarP == null) {
                    return;
                }
                final byte b = 1;
                bz1Var = new bz1() { // from class: v31
                    @Override // defpackage.bz1
                    public final Object l(Object obj2, Object obj3) {
                        byte b2 = b;
                        og5 og5Var = og5.g;
                        int i5 = i2;
                        long j2 = j;
                        int i6 = i3;
                        h02 h02Var2 = (h02) obj2;
                        ((Integer) obj3).getClass();
                        switch (b2) {
                            case 0:
                                x31.y(i6, j2, h02Var2, aq2.J(i5 | 1));
                                break;
                            default:
                                x31.y(i6, j2, h02Var2, aq2.J(i5 | 1));
                                break;
                        }
                        return og5Var;
                    }
                };
            } else {
                cp3 cp3VarK = aq2.k(iIntValue, h02Var);
                boolean z = (i4 & 112) == 32;
                Object objK2 = h02Var.K();
                if (z || objK2 == obj) {
                    objK2 = j == 16 ? null : new m30(5, j);
                    h02Var.i0(objK2);
                }
                z50.g(pw5.D(mq4.j(g73.g, iu0.v), cp3VarK, wt0.g, 0.0f, (m30) objK2, 22), h02Var, 0);
            }
            u34VarP.n = bz1Var;
        }
        h02Var.Q();
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            final byte b2 = 0;
            bz1Var = new bz1() { // from class: v31
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    byte b3 = b2;
                    og5 og5Var = og5.g;
                    int i5 = i2;
                    long j2 = j;
                    int i6 = i;
                    h02 h02Var2 = (h02) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            x31.y(i6, j2, h02Var2, aq2.J(i5 | 1));
                            break;
                        default:
                            x31.y(i6, j2, h02Var2, aq2.J(i5 | 1));
                            break;
                    }
                    return og5Var;
                }
            };
            u34VarP.n = bz1Var;
        }
    }
}
