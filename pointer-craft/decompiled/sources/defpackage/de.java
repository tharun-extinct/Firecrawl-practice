package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class de {
    public static final vf1 g = new vf1(new y4((byte) 7), (byte) 0);
    public static final vf1 y = new vf1(new cp0((byte) 2), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01da  */
    /* JADX WARN: Code duplicated, block: B:99:0x0200  */
    public static final void g(vv3 vv3Var, my1 my1Var, final wv3 wv3Var, final nm0 nm0Var, h02 h02Var, final int i, final int i2) {
        int i3;
        my1 my1Var2;
        wv3 wv3Var2;
        int i4;
        boolean z;
        final my1 my1Var3;
        u34 u34VarP;
        my1 my1Var4;
        View view;
        j51 j51Var;
        String str;
        fl2 fl2Var;
        f02 f02VarH;
        ob3 ob3VarQ;
        Object objK;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objK2;
        byte b;
        String str2;
        sv3 sv3Var;
        int i5;
        byte b2;
        int i6;
        byte b3;
        boolean z2;
        Object objK3;
        sv3 sv3Var2;
        byte b4;
        byte b5;
        boolean z3;
        Object objK4;
        byte b6;
        byte b7;
        int i7;
        Object obj3;
        boolean zJ;
        Object obj4;
        boolean zJ2;
        Object obj5;
        boolean zJ3;
        Object obj6;
        int i8;
        int i9;
        final vv3 vv3Var2 = vv3Var;
        h02Var.Z(-1772091631);
        if ((i & 6) == 0) {
            i3 = (h02Var.x(vv3Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                my1Var2 = my1Var;
                i3 |= h02Var.j(my1Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                wv3Var2 = wv3Var;
                if (h02Var.x(wv3Var2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            } else {
                wv3Var2 = wv3Var;
            }
            if ((i & 3072) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i4 & 1, z)) {
                if (i10 != 0) {
                    my1Var4 = null;
                } else {
                    my1Var4 = my1Var2;
                }
                view = (View) h02Var.a(sa.x);
                j51Var = (j51) h02Var.a(hp0.j);
                str = (String) h02Var.a(g);
                fl2Var = (fl2) h02Var.a(hp0.c);
                f02VarH = pw5.H(h02Var);
                ob3VarQ = kq2.Q(nm0Var, h02Var);
                Object[] objArr = new Object[0];
                objK = h02Var.K();
                obj = oo0.g;
                obj2 = objK;
                if (objK == obj) {
                    Object h6Var = new h6((byte) 2);
                    h02Var.i0(h6Var);
                    obj2 = h6Var;
                }
                uuid = (UUID) xq2.f(objArr, (my1) obj2, h02Var);
                zBooleanValue = ((Boolean) h02Var.a(y)).booleanValue();
                objK2 = h02Var.K();
                if (objK2 == obj) {
                    b = 0;
                    str2 = str;
                    sv3 sv3Var3 = new sv3(my1Var4, wv3Var2, str2, view, j51Var, vv3Var2, uuid, zBooleanValue);
                    vv3Var2 = vv3Var2;
                    sv3Var3.c(f02VarH, new nm0(-297523940, true, new wd(sv3Var3, ob3VarQ, b)));
                    h02Var.i0(sv3Var3);
                    objK2 = sv3Var3;
                } else {
                    b = 0;
                    str2 = str;
                }
                sv3Var = (sv3) objK2;
                boolean zJ4 = h02Var.j(sv3Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    b2 = 1;
                } else {
                    b2 = b;
                }
                int i11 = (zJ4 ? 1 : 0) | b2;
                i6 = i4 & 896;
                if (i6 == 256) {
                    b3 = 1;
                } else {
                    b3 = b;
                }
                z2 = (((i11 | b3) | (h02Var.x(str2) ? 1 : 0)) == true ? 1 : 0) | (h02Var.n(fl2Var.ordinal()) ? 1 : 0);
                objK3 = h02Var.K();
                if (z2 == 0 || objK3 == obj) {
                    sv3Var2 = sv3Var;
                    Object qcVar = new qc(sv3Var2, my1Var4, wv3Var, str2, fl2Var, (byte) 1);
                    h02Var.i0(qcVar);
                    objK3 = qcVar;
                } else {
                    sv3Var2 = sv3Var;
                }
                k33.j(sv3Var2, (xy1) objK3, h02Var);
                boolean zJ5 = h02Var.j(sv3Var2);
                if (i5 == 32) {
                    b4 = 1;
                } else {
                    b4 = b;
                }
                int i12 = (zJ5 ? 1 : 0) | b4;
                if (i6 == 256) {
                    b5 = 1;
                } else {
                    b5 = b;
                }
                z3 = (((i12 | b5) | (h02Var.x(str2) ? 1 : 0)) == true ? 1 : 0) | (h02Var.n(fl2Var.ordinal()) ? 1 : 0);
                objK4 = h02Var.K();
                if (z3 == 0 || objK4 == obj) {
                    Object xdVar = new xd(sv3Var2, my1Var4, wv3Var, str2, fl2Var, (byte) 0);
                    h02Var.i0(xdVar);
                    objK4 = xdVar;
                }
                k33.z((my1) objK4, h02Var);
                boolean zJ6 = h02Var.j(sv3Var2);
                b6 = 4;
                if ((i4 & 14) == 4) {
                    b7 = 1;
                } else {
                    b7 = b;
                }
                i7 = (zJ6 ? 1 : 0) | b7;
                Object objK5 = h02Var.K();
                obj3 = objK5;
                if (i7 == 0 || objK5 == obj) {
                    Object mVar = new m(sv3Var2, vv3Var2, b6);
                    h02Var.i0(mVar);
                    obj3 = mVar;
                }
                k33.j(vv3Var2, (xy1) obj3, h02Var);
                zJ = h02Var.j(sv3Var2);
                Object objK6 = h02Var.K();
                obj4 = objK6;
                if (zJ || objK6 == obj) {
                    Object qVar = new q(sv3Var2, null, (byte) 3);
                    h02Var.i0(qVar);
                    obj4 = qVar;
                }
                k33.b((bz1) obj4, h02Var, sv3Var2);
                zJ2 = h02Var.j(sv3Var2);
                Object objK7 = h02Var.K();
                obj5 = objK7;
                if (zJ2 || objK7 == obj) {
                    Object vdVar = new vd(sv3Var2, (byte) 1);
                    h02Var.i0(vdVar);
                    obj5 = vdVar;
                }
                j73 j73VarN = k33.N(g73.g, (xy1) obj5);
                zJ3 = h02Var.j(sv3Var2) | h02Var.n(fl2Var.ordinal());
                Object objK8 = h02Var.K();
                obj6 = objK8;
                if (zJ3 || objK8 == obj) {
                    Object zdVar = new zd(sv3Var2, fl2Var, b);
                    h02Var.i0(zdVar);
                    obj6 = zdVar;
                }
                t33 t33Var = (t33) obj6;
                int iHashCode = Long.hashCode(h02Var.T);
                tr3 tr3VarQ = h02Var.q();
                j73 j73VarW = m50.W(h02Var, j73VarN);
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, t33Var);
                xs2.E(tg1.q, h02Var, tr3VarQ);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW);
                h02Var.b(true);
                my1Var3 = my1Var4;
            } else {
                h02Var.Q();
                my1Var3 = my1Var2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: yd
                    @Override // defpackage.bz1
                    public final Object l(Object obj7, Object obj8) {
                        ((Integer) obj8).getClass();
                        de.g(vv3Var2, my1Var3, wv3Var, nm0Var, (h02) obj7, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 48;
        my1Var2 = my1Var;
        if ((i & 384) == 0) {
            wv3Var2 = wv3Var;
            if (h02Var.x(wv3Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            wv3Var2 = wv3Var;
        }
        if ((i & 3072) == 0) {
            if (h02Var.j(nm0Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i4 & 1, z)) {
            if (i10 != 0) {
                my1Var4 = null;
            } else {
                my1Var4 = my1Var2;
            }
            view = (View) h02Var.a(sa.x);
            j51Var = (j51) h02Var.a(hp0.j);
            str = (String) h02Var.a(g);
            fl2Var = (fl2) h02Var.a(hp0.c);
            f02VarH = pw5.H(h02Var);
            ob3VarQ = kq2.Q(nm0Var, h02Var);
            Object[] objArr2 = new Object[0];
            objK = h02Var.K();
            obj = oo0.g;
            obj2 = objK;
            if (objK == obj) {
                Object h6Var2 = new h6((byte) 2);
                h02Var.i0(h6Var2);
                obj2 = h6Var2;
            }
            uuid = (UUID) xq2.f(objArr2, (my1) obj2, h02Var);
            zBooleanValue = ((Boolean) h02Var.a(y)).booleanValue();
            objK2 = h02Var.K();
            if (objK2 == obj) {
                b = 0;
                str2 = str;
                sv3 sv3Var4 = new sv3(my1Var4, wv3Var2, str2, view, j51Var, vv3Var2, uuid, zBooleanValue);
                vv3Var2 = vv3Var2;
                sv3Var4.c(f02VarH, new nm0(-297523940, true, new wd(sv3Var4, ob3VarQ, b)));
                h02Var.i0(sv3Var4);
                objK2 = sv3Var4;
            } else {
                b = 0;
                str2 = str;
            }
            sv3Var = (sv3) objK2;
            boolean zJ7 = h02Var.j(sv3Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                b2 = 1;
            } else {
                b2 = b;
            }
            int i13 = (zJ7 ? 1 : 0) | b2;
            i6 = i4 & 896;
            if (i6 == 256) {
                b3 = 1;
            } else {
                b3 = b;
            }
            z2 = (((i13 | b3) | (h02Var.x(str2) ? 1 : 0)) == true ? 1 : 0) | (h02Var.n(fl2Var.ordinal()) ? 1 : 0);
            objK3 = h02Var.K();
            if (z2 == 0) {
                sv3Var2 = sv3Var;
                Object qcVar2 = new qc(sv3Var2, my1Var4, wv3Var, str2, fl2Var, (byte) 1);
                h02Var.i0(qcVar2);
                objK3 = qcVar2;
            } else {
                sv3Var2 = sv3Var;
                Object qcVar3 = new qc(sv3Var2, my1Var4, wv3Var, str2, fl2Var, (byte) 1);
                h02Var.i0(qcVar3);
                objK3 = qcVar3;
            }
            k33.j(sv3Var2, (xy1) objK3, h02Var);
            boolean zJ8 = h02Var.j(sv3Var2);
            if (i5 == 32) {
                b4 = 1;
            } else {
                b4 = b;
            }
            int i14 = (zJ8 ? 1 : 0) | b4;
            if (i6 == 256) {
                b5 = 1;
            } else {
                b5 = b;
            }
            z3 = (((i14 | b5) | (h02Var.x(str2) ? 1 : 0)) == true ? 1 : 0) | (h02Var.n(fl2Var.ordinal()) ? 1 : 0);
            objK4 = h02Var.K();
            if (z3 == 0) {
                Object xdVar2 = new xd(sv3Var2, my1Var4, wv3Var, str2, fl2Var, (byte) 0);
                h02Var.i0(xdVar2);
                objK4 = xdVar2;
            } else {
                Object xdVar3 = new xd(sv3Var2, my1Var4, wv3Var, str2, fl2Var, (byte) 0);
                h02Var.i0(xdVar3);
                objK4 = xdVar3;
            }
            k33.z((my1) objK4, h02Var);
            boolean zJ9 = h02Var.j(sv3Var2);
            b6 = 4;
            if ((i4 & 14) == 4) {
                b7 = 1;
            } else {
                b7 = b;
            }
            i7 = (zJ9 ? 1 : 0) | b7;
            Object objK9 = h02Var.K();
            obj3 = objK9;
            if (i7 == 0) {
                Object mVar2 = new m(sv3Var2, vv3Var2, b6);
                h02Var.i0(mVar2);
                obj3 = mVar2;
            } else {
                Object mVar3 = new m(sv3Var2, vv3Var2, b6);
                h02Var.i0(mVar3);
                obj3 = mVar3;
            }
            k33.j(vv3Var2, (xy1) obj3, h02Var);
            zJ = h02Var.j(sv3Var2);
            Object objK10 = h02Var.K();
            obj4 = objK10;
            if (zJ) {
                Object qVar2 = new q(sv3Var2, null, (byte) 3);
                h02Var.i0(qVar2);
                obj4 = qVar2;
            } else {
                Object qVar3 = new q(sv3Var2, null, (byte) 3);
                h02Var.i0(qVar3);
                obj4 = qVar3;
            }
            k33.b((bz1) obj4, h02Var, sv3Var2);
            zJ2 = h02Var.j(sv3Var2);
            Object objK11 = h02Var.K();
            obj5 = objK11;
            if (zJ2) {
                Object vdVar2 = new vd(sv3Var2, (byte) 1);
                h02Var.i0(vdVar2);
                obj5 = vdVar2;
            } else {
                Object vdVar3 = new vd(sv3Var2, (byte) 1);
                h02Var.i0(vdVar3);
                obj5 = vdVar3;
            }
            j73 j73VarN2 = k33.N(g73.g, (xy1) obj5);
            zJ3 = h02Var.j(sv3Var2) | h02Var.n(fl2Var.ordinal());
            Object objK12 = h02Var.K();
            obj6 = objK12;
            if (zJ3) {
                Object zdVar2 = new zd(sv3Var2, fl2Var, b);
                h02Var.i0(zdVar2);
                obj6 = zdVar2;
            } else {
                Object zdVar3 = new zd(sv3Var2, fl2Var, b);
                h02Var.i0(zdVar3);
                obj6 = zdVar3;
            }
            t33 t33Var2 = (t33) obj6;
            int iHashCode2 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarN2);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33Var2);
            xs2.E(tg1.q, h02Var, tr3VarQ2);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode2));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW2);
            h02Var.b(true);
            my1Var3 = my1Var4;
        } else {
            h02Var.Q();
            my1Var3 = my1Var2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: yd
                @Override // defpackage.bz1
                public final Object l(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    de.g(vv3Var2, my1Var3, wv3Var, nm0Var, (h02) obj7, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final boolean y(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
