package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ua4 implements dz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ ua4(jd3 jd3Var, qr0 qr0Var, wm4 wm4Var, byte b) {
        this.j = b;
        this.t = jd3Var;
        this.a = qr0Var;
        this.m = wm4Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue;
        mc3 mc3VarG;
        int[] intArray;
        xl2 xl2Var;
        int[] iArr;
        String string;
        Object jbVar;
        String str;
        jd3 jd3Var;
        h02 h02Var;
        r04 r04Var;
        p04 p04VarZ;
        byte b = this.j;
        wt2 wt2Var = wt2.j;
        og5 og5Var = og5.g;
        l76 l76Var = oo0.g;
        Object obj5 = this.a;
        Object obj6 = this.t;
        Object obj7 = this.m;
        byte b2 = 0;
        switch (b) {
            case 0:
                wm4 wm4Var = (wm4) obj7;
                jd3 jd3Var2 = (jd3) obj6;
                qr0 qr0Var = (qr0) obj5;
                mc3 mc3Var = (mc3) obj2;
                h02 h02Var2 = (h02) obj3;
                ((Integer) obj4).getClass();
                ((hh) obj).getClass();
                mc3Var.getClass();
                boolean zX = h02Var2.x(mc3Var);
                Object objK = h02Var2.K();
                if (zX || objK == l76Var) {
                    Bundle bundleG = mc3Var.g();
                    Integer numValueOf = bundleG != null ? Integer.valueOf(bundleG.getInt("layoutId")) : null;
                    if (numValueOf == null || numValueOf.intValue() < 0) {
                        Bundle bundleG2 = mc3Var.g();
                        if (bundleG2 != null) {
                            SharedPreferences sharedPreferences = d52.b;
                            sharedPreferences.getClass();
                            bundleG2.putInt("layoutId", sharedPreferences.getInt("start_custom_control", -1));
                        }
                        SharedPreferences sharedPreferences2 = d52.b;
                        sharedPreferences2.getClass();
                        iIntValue = sharedPreferences2.getInt("start_custom_control", -1);
                    } else {
                        iIntValue = numValueOf.intValue();
                    }
                    objK = Integer.valueOf(iIntValue);
                    h02Var2.i0(objK);
                }
                int iIntValue2 = ((Number) objK).intValue();
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                boolean zN = h02Var2.n(iIntValue2) | h02Var2.j(wm4Var);
                Object objK2 = h02Var2.K();
                if (zN || objK2 == l76Var) {
                    objK2 = new rs2(iIntValue2, wm4Var, (mu0) null);
                    h02Var2.i0(objK2);
                }
                k33.b((bz1) objK2, h02Var2, numValueOf2);
                boolean zJ = h02Var2.j(jd3Var2);
                Object objK3 = h02Var2.K();
                if (zJ || objK3 == l76Var) {
                    objK3 = new wa4(jd3Var2, (byte) 0);
                    h02Var2.i0(objK3);
                }
                wa6.g(iIntValue2, (my1) objK3, qr0Var, jd3Var2, wm4Var, h02Var2, 33280);
                return og5Var;
            case 1:
                jd3 jd3Var3 = (jd3) obj6;
                qr0 qr0Var2 = (qr0) obj5;
                wm4 wm4Var2 = (wm4) obj7;
                mc3 mc3Var2 = (mc3) obj2;
                h02 h02Var3 = (h02) obj3;
                ((Integer) obj4).getClass();
                ((hh) obj).getClass();
                mc3Var2.getClass();
                boolean zX2 = h02Var3.x(mc3Var2);
                Object objK4 = h02Var3.K();
                if (zX2 || objK4 == l76Var) {
                    try {
                        mc3VarG = jd3Var3.g("custom?layoutId={layoutId}");
                    } catch (IllegalArgumentException unused) {
                        mc3VarG = jd3Var3.g("layoutedit?layoutId={layoutId}");
                    }
                    objK4 = mc3VarG;
                    h02Var3.i0(objK4);
                    break;
                }
                mc3 mc3Var3 = (mc3) objK4;
                if (v13.a(mc3Var3.p, h02Var3).getValue() == wt2Var) {
                    return og5Var;
                }
                xl2 xl2Var2 = (xl2) js2.A(v54.g(xl2.class), mc3Var3, gp4.N(xs2.d(mc3Var3), h02Var3), xs2.k(mc3Var3), h02Var3);
                wl5 wl5VarG = rx2.g(h02Var3);
                if (wl5VarG != null) {
                    b90 b90Var = (b90) js2.A(v54.g(b90.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var3), xs2.k(wl5VarG), h02Var3);
                    f34 f34VarX = xl2Var2.x();
                    ob3 ob3VarL = v13.l(f34VarX, f34VarX.getValue(), h02Var3, 0, 0);
                    Bundle bundleG3 = mc3Var2.g();
                    if (bundleG3 != null && (intArray = bundleG3.getIntArray("index")) != null) {
                        boolean zJ2 = h02Var3.j(xl2Var2) | h02Var3.j(intArray) | h02Var3.j(b90Var);
                        Object objK5 = h02Var3.K();
                        mu0 mu0Var = null;
                        if (zJ2 || objK5 == l76Var) {
                            objK5 = new mo(xl2Var2, intArray, b90Var, mu0Var, (byte) 7);
                            xl2Var = xl2Var2;
                            iArr = intArray;
                            h02Var3.i0(objK5);
                        } else {
                            xl2Var = xl2Var2;
                            iArr = intArray;
                        }
                        bz1 bz1Var = (bz1) objK5;
                        fx0 fx0Var = h02Var3.R;
                        boolean zX3 = h02Var3.x(xl2Var) | h02Var3.x(b90Var) | h02Var3.x(iArr);
                        Object objK6 = h02Var3.K();
                        if (zX3 || objK6 == l76Var) {
                            objK6 = new pk2(fx0Var, bz1Var);
                            h02Var3.i0(objK6);
                        }
                        w75 w75Var = new w75(0, R.string.control_layout_key_edit);
                        w75 w75VarV = rp2.v(((vl2) ob3VarL.getValue()).g());
                        String strI = xs2.I(R.string.menu_save_changes, h02Var3);
                        boolean zJ3 = h02Var3.j(jd3Var3) | h02Var3.j(b90Var) | h02Var3.j(iArr) | h02Var3.j(xl2Var);
                        Object objK7 = h02Var3.K();
                        if (zJ3 || objK7 == l76Var) {
                            jb jbVar2 = new jb((Object) jd3Var3, (Object) b90Var, (Object) iArr, (Object) xl2Var, (byte) 6);
                            h02Var3.i0(jbVar2);
                            objK7 = jbVar2;
                        }
                        nk nkVar = new nk(w75Var, w75VarV, true, false, pw5.k(new hk(strI, (my1) objK7)));
                        Object objK8 = h02Var3.K();
                        if (objK8 == l76Var) {
                            objK8 = new cb4(qr0Var2);
                            h02Var3.i0(objK8);
                        }
                        c93.n(nkVar, false, qr0Var2, ue5.m0(554939798, new dv0(nkVar, jd3Var3, wm4Var2, (byte) 2), h02Var3), ue5.m0(-827066483, new ya4((Object) b90Var, (Object) qr0Var2, objK8, (byte) 7), h02Var3), h02Var3, 28216);
                        return og5Var;
                    }
                    l0.z("index is null");
                } else {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                return null;
            case 2:
                jd3 jd3Var4 = (jd3) obj6;
                qr0 qr0Var3 = (qr0) obj5;
                wm4 wm4Var3 = (wm4) obj7;
                mc3 mc3Var4 = (mc3) obj2;
                h02 h02Var4 = (h02) obj3;
                ((Integer) obj4).getClass();
                ((hh) obj).getClass();
                mc3Var4.getClass();
                Bundle bundleG4 = mc3Var4.g();
                if (bundleG4 == null || (string = bundleG4.getString("sharedLayoutId")) == null) {
                    l0.z("shared ID is null");
                } else {
                    gx3 gx3Var = (gx3) h02Var4.a(gp0.y);
                    wl5 wl5VarG2 = rx2.g(h02Var4);
                    if (wl5VarG2 != null) {
                        yv0 yv0Var = (yv0) js2.A(v54.g(yv0.class), wl5VarG2, gp4.N(xs2.d(wl5VarG2), h02Var4), xs2.k(wl5VarG2), h02Var4);
                        f34 f34VarV = yv0Var.v();
                        ob3 ob3VarL2 = v13.l(f34VarV, f34VarV.getValue(), h02Var4, 0, 0);
                        q04 q04VarR = ((tv0) ob3VarL2.getValue()).r();
                        boolean zJ4 = h02Var4.j(yv0Var) | h02Var4.x(string);
                        Object objK9 = h02Var4.K();
                        byte b3 = 11;
                        if (zJ4 || objK9 == l76Var) {
                            objK9 = new kn2(yv0Var, string, (byte) 11);
                            h02Var4.i0(objK9);
                        }
                        k33.t(yv0Var, string, (xy1) objK9, h02Var4);
                        if (((tv0) ob3VarL2.getValue()).y() == null || ((tv0) ob3VarL2.getValue()).n() == null) {
                            h02Var4.X(1105000256);
                            h02Var4.b(false);
                        } else {
                            h02Var4.X(1104695619);
                            Boolean bool = Boolean.TRUE;
                            boolean zJ5 = h02Var4.j(jd3Var4) | h02Var4.x(ob3VarL2);
                            Object objK10 = h02Var4.K();
                            if (zJ5 || objK10 == l76Var) {
                                objK10 = new mt(jd3Var4, ob3VarL2, (mu0) null, (byte) 15);
                                h02Var4.i0(objK10);
                            }
                            k33.b((bz1) objK10, h02Var4, bool);
                            h02Var4.b(false);
                        }
                        w75 w75VarV2 = rp2.v(q04VarR);
                        boolean zX4 = h02Var4.x(w75VarV2);
                        Object objK11 = h02Var4.K();
                        if (zX4 || objK11 == l76Var) {
                            objK11 = new nk(w75VarV2, null, true, true, pw5.k(new dk(ff6.g(), new o82(gx3Var, yv0Var, b3))));
                            h02Var4.i0(objK11);
                        }
                        nk nkVar2 = (nk) objK11;
                        c93.n(nkVar2, false, qr0Var3, ue5.m0(210350243, new dv0(nkVar2, jd3Var4, wm4Var3, (byte) 3), h02Var4), ue5.m0(-752791334, new tn((Object) q04VarR, (byte) 13), h02Var4), h02Var4, 28216);
                        return og5Var;
                    }
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                return null;
            case 3:
                jd3 jd3Var5 = (jd3) obj6;
                qr0 qr0Var4 = (qr0) obj5;
                wm4 wm4Var4 = (wm4) obj7;
                mc3 mc3VarG2 = (mc3) obj2;
                h02 h02Var5 = (h02) obj3;
                ((Integer) obj4).getClass();
                ((hh) obj).getClass();
                mc3VarG2.getClass();
                Bundle bundleG5 = mc3VarG2.g();
                if (bundleG5 == null) {
                    l0.z("layoutId is null");
                    return null;
                }
                int i = bundleG5.getInt("layoutId");
                boolean zX5 = h02Var5.x(mc3VarG2);
                Object objK12 = h02Var5.K();
                if (zX5 || objK12 == l76Var) {
                    try {
                        mc3VarG2 = jd3Var5.g("custom?layoutId={layoutId}");
                        break;
                    } catch (IllegalArgumentException unused2) {
                    }
                    h02Var5.i0(mc3VarG2);
                    objK12 = mc3VarG2;
                }
                mc3 mc3Var5 = (mc3) objK12;
                if (v13.a(mc3Var5.p, h02Var5).getValue() == wt2Var) {
                    return og5Var;
                }
                xl2 xl2Var3 = (xl2) js2.A(v54.g(xl2.class), mc3Var5, gp4.N(xs2.d(mc3Var5), h02Var5), xs2.k(mc3Var5), h02Var5);
                Object objK13 = h02Var5.K();
                if (objK13 == l76Var) {
                    objK13 = new qp3(-1);
                    h02Var5.i0(objK13);
                }
                qp3 qp3Var = (qp3) objK13;
                Integer numValueOf3 = Integer.valueOf(i);
                boolean zJ6 = h02Var5.j(xl2Var3) | h02Var5.n(i);
                Object objK14 = h02Var5.K();
                byte b4 = 4;
                if (zJ6 || objK14 == l76Var) {
                    objK14 = new v2(xl2Var3, i, b4);
                    h02Var5.i0(objK14);
                }
                k33.j(numValueOf3, (xy1) objK14, h02Var5);
                Object objK15 = h02Var5.K();
                if (objK15 == l76Var) {
                    objK15 = k33.E(h02Var5);
                    h02Var5.i0(objK15);
                }
                ox0 ox0Var = (ox0) objK15;
                Object objK16 = h02Var5.K();
                if (objK16 == l76Var) {
                    objK16 = kq2.M(Boolean.FALSE);
                    h02Var5.i0(objK16);
                }
                ob3 ob3Var = (ob3) objK16;
                f34 f34VarX2 = xl2Var3.x();
                ob3 ob3VarL3 = v13.l(f34VarX2, f34VarX2.getValue(), h02Var5, 0, 0);
                my1 my1Var = (my1) h02Var5.a(gp0.v);
                w75 w75Var2 = new w75(null, R.string.title_edit_layout);
                w75 w75VarV3 = rp2.v(((vl2) ob3VarL3.getValue()).g());
                String strI2 = xs2.I(R.string.menu_save_changes, h02Var5);
                boolean zJ7 = h02Var5.j(jd3Var5) | h02Var5.j(ox0Var) | h02Var5.j(xl2Var3) | h02Var5.x(my1Var);
                Object objK17 = h02Var5.K();
                if (zJ7 || objK17 == l76Var) {
                    str = strI2;
                    jd3Var = jd3Var5;
                    jbVar = new jb((Object) jd3Var, ox0Var, (Object) xl2Var3, my1Var, (byte) 7);
                    h02Var5.i0(jbVar);
                } else {
                    str = strI2;
                    jbVar = objK17;
                    jd3Var = jd3Var5;
                }
                nk nkVar3 = new nk(w75Var2, w75VarV3, true, false, pw5.k(new hk(str, (my1) jbVar)));
                if (qp3Var.d() >= 0) {
                    h02Var5.X(-1325291480);
                    q04 q04VarG = ((vl2) ob3VarL3.getValue()).g();
                    r04[] r04VarArr = (q04VarG == null || (p04VarZ = q04VarG.z()) == null) ? null : p04VarZ.a;
                    if (r04VarArr != null) {
                        int length = r04VarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                r04 r04Var2 = r04VarArr[i2];
                                if (r04Var2.m == qp3Var.d()) {
                                    r04Var = r04Var2;
                                } else {
                                    i2++;
                                }
                            } else {
                                r04Var = null;
                            }
                        }
                    } else {
                        r04Var = null;
                    }
                    if (r04Var != null) {
                        h02Var5.X(-1325123615);
                        Object objK18 = h02Var5.K();
                        if (objK18 == l76Var) {
                            objK18 = new ln2(qp3Var, (byte) 2);
                            h02Var5.i0(objK18);
                        }
                        b73.g((my1) objK18, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ue5.m0(2085338152, new ev0(r04Var, xl2Var3, (byte) 12), h02Var5), h02Var5, 6, 3072, 8190);
                        h02Var = h02Var5;
                        h02Var.b(false);
                    } else {
                        h02Var = h02Var5;
                        h02Var.X(-1324873755);
                        h02Var.b(false);
                    }
                    h02Var.b(false);
                } else {
                    h02Var = h02Var5;
                    h02Var.X(-1324863835);
                    h02Var.b(false);
                }
                boolean zJ8 = h02Var.j(xl2Var3) | h02Var.j(jd3Var);
                Object objK19 = h02Var.K();
                if (zJ8 || objK19 == l76Var) {
                    objK19 = new lt((Object) xl2Var3, (Object) jd3Var, (Object) ob3Var, (byte) 14);
                    h02Var.i0(objK19);
                }
                wy5.g(false, (my1) objK19, h02Var, 0, 1);
                if (((Boolean) ob3Var.getValue()).booleanValue()) {
                    h02Var.X(-1324613262);
                    Object objK20 = h02Var.K();
                    if (objK20 == l76Var) {
                        objK20 = new ef(ob3Var, (byte) 29);
                        h02Var.i0(objK20);
                    }
                    yd6.y((my1) objK20, ue5.m0(521506018, new hb(ob3Var, (byte) 7), h02Var), null, ue5.m0(-164261600, new ta(xl2Var3, jd3Var, (byte) 26), h02Var), null, gp4.a, null, null, 0L, 0L, 0L, 0L, null, null, h02Var, 199734, 32724);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1323887707);
                    h02Var.b(false);
                }
                c93.n(nkVar3, false, qr0Var4, ue5.m0(1421633694, new dv0(nkVar3, jd3Var, wm4Var4, (byte) 4), h02Var), ue5.m0(39627413, new ya4(xl2Var3, jd3Var, qp3Var, b2), h02Var), h02Var, 28216);
                return og5Var;
            default:
                my1 my1Var2 = (my1) obj7;
                ox0 ox0Var2 = (ox0) obj6;
                u21 u21Var = (u21) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h02 h02Var6 = (h02) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= h02Var6.l(zBooleanValue) ? 32 : 16;
                }
                if (!h02Var6.N(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    h02Var6.Q();
                } else if (zBooleanValue) {
                    h02Var6.X(-618492965);
                    c93.x(my1Var2, null, false, null, null, null, null, null, y94.v, h02Var6, 805306368, 510);
                    h02Var6.b(false);
                } else {
                    h02Var6.X(-618289574);
                    boolean zJ9 = h02Var6.j(ox0Var2) | h02Var6.x(u21Var);
                    Object objK21 = h02Var6.K();
                    if (zJ9 || objK21 == l76Var) {
                        objK21 = new mk3(ox0Var2, u21Var);
                        h02Var6.i0(objK21);
                    }
                    c93.x((my1) objK21, null, false, null, null, null, null, null, y94.x, h02Var6, 805306368, 510);
                    h02Var6.b(false);
                }
                return og5Var;
        }
    }

    public /* synthetic */ ua4(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.m = obj;
        this.t = obj2;
        this.a = obj3;
    }
}
