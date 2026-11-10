package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb4 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ bb4(qr0 qr0Var, jd3 jd3Var) {
        this.j = (byte) 6;
        this.a = qr0Var;
        this.t = jd3Var;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        h02 h02Var;
        Typeface typefaceF;
        byte b = this.j;
        float f = 0.0f;
        Object obj4 = oo0.g;
        og5 og5Var = og5.g;
        Object obj5 = this.t;
        Object obj6 = this.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                wm4 wm4Var = (wm4) obj5;
                qr0 qr0Var = (qr0) obj6;
                h02 h02Var2 = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                ob3 ob3VarJ = v13.j(wm4Var.l, h02Var2);
                ob3 ob3VarJ2 = v13.j(qr0Var.m, h02Var2);
                ho1 ho1Var = mq4.r;
                t33 t33VarR = z50.r(hi0.t, false);
                int iHashCode = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ = h02Var2.q();
                j73 j73VarW = m50.W(h02Var2, ho1Var);
                jo0.n.getClass();
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(um2.Z);
                } else {
                    h02Var2.l0();
                }
                xs2.E(tg1.w, h02Var2, t33VarR);
                xs2.E(tg1.q, h02Var2, tr3VarQ);
                xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                xs2.D(h02Var2);
                xs2.E(tg1.m, h02Var2, j73VarW);
                ql4 ql4Var = (ql4) ob3VarJ.getValue();
                if (ql4Var == null) {
                    h02Var2.X(-1975914266);
                    h02Var2.b(false);
                    h02Var = h02Var2;
                } else {
                    h02Var2.X(-1975914265);
                    g61 g61Var = (g61) ob3VarJ2.getValue();
                    boolean z = g61Var != null && g61Var.l();
                    boolean zJ = h02Var2.j(wm4Var);
                    Object objK = h02Var2.K();
                    if (zJ || objK == obj4) {
                        objK = new w30(wm4Var, (byte) 2);
                        h02Var2.i0(objK);
                    }
                    bz1 bz1Var = (bz1) ((nz1) objK);
                    boolean zJ2 = h02Var2.j(qr0Var);
                    Object objK2 = h02Var2.K();
                    if (zJ2 || objK2 == obj4) {
                        objK2 = new w30(qr0Var, (byte) 3);
                        h02Var2.i0(objK2);
                    }
                    px5.g(ql4Var, z, bz1Var, (bz1) ((nz1) objK2), h02Var2, 8);
                    h02Var = h02Var2;
                    h02Var.b(false);
                }
                h02Var.b(true);
                return og5Var;
            case 1:
                nm0 nm0Var = (nm0) obj6;
                h02 h02Var3 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    y94.l(this.t, null, null, "Fade", ue5.m0(1509400324, new qh(nm0Var, b2), h02Var3), h02Var3, 27648, 6);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            case 2:
                my1 my1Var = (my1) obj5;
                my1 my1Var2 = (my1) obj6;
                h02 h02Var4 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var4.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uz4.g(mq4.r(ue5.g0(g73.g, 8.0f, 0.0f, 2), 1.0f), na4.y(16.0f), ((rj0) h02Var4.a(tj0.g)).p, 0L, 8.0f, 0.0f, null, ue5.m0(625188092, new yn(my1Var, my1Var2, false ? (byte) 1 : (byte) 0), h02Var4), h02Var4, 12804102, 72);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 3:
                my1 my1Var3 = (my1) obj5;
                nm0 nm0Var2 = (nm0) obj6;
                h02 h02Var5 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var5.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    WeakHashMap weakHashMap = yp5.k;
                    wd2 wd2Var = new wd2(v13.t(h02Var5).w, (j51) h02Var5.a(hp0.j));
                    fl2 fl2Var = (fl2) h02Var5.a(hp0.c);
                    boolean zX = h02Var5.x(wd2Var) | h02Var5.n(fl2Var.ordinal());
                    Object objK3 = h02Var5.K();
                    if (zX || objK3 == obj4) {
                        float fMax = Math.max(16.0f, ue5.A(wd2Var, fl2Var));
                        float fMax2 = Math.max(16.0f, ue5.e(wd2Var, fl2Var));
                        Object bo3Var = new bo3(Math.max(fMax, fMax2), Math.max(16.0f, wd2Var.n()), Math.max(fMax, fMax2), Math.max(16.0f, wd2Var.r()));
                        h02Var5.i0(bo3Var);
                        objK3 = bo3Var;
                    }
                    v70.l(my1Var3, 0.0f, ue5.m0(412883784, new ev0((zn3) objK3, nm0Var2), h02Var5), h02Var5, 384);
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 4:
                nm0 nm0Var3 = (nm0) obj5;
                Object obj7 = (mc3) obj6;
                h02 h02Var6 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var6.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nm0Var3.x(obj7, h02Var6, 0);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case 5:
                u21 u21Var = (u21) obj5;
                fl2 fl2Var2 = (fl2) obj6;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zO = sp2.o(u21Var, fFloatValue);
                if (u21Var.q().v != um3.j && fl2Var2 != fl2.j) {
                    zO = !zO;
                }
                int i = u21Var.q().y;
                float fQ = i == 0 ? 0.0f : sp2.q(u21Var) / i;
                float f2 = fQ - ((int) fQ);
                int iR = az5.r(u21Var.c, fFloatValue);
                if (ui4.y(iR, 0)) {
                    if (Math.abs(f2) <= 0.5f) {
                        float fAbs = Math.abs(fQ);
                        j51 j51Var = u21Var.c;
                        yo3 yo3Var = zo3.g;
                        if (fAbs < Math.abs(Math.min(j51Var.e(56.0f), u21Var.c() / 2.0f) / u21Var.c()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zO) {
                            f = fFloatValue3;
                        } else {
                            f = fFloatValue2;
                        }
                    } else if (zO) {
                        f = fFloatValue3;
                    } else {
                        f = fFloatValue2;
                    }
                } else if (ui4.y(iR, 1)) {
                    f = fFloatValue3;
                } else if (ui4.y(iR, 2)) {
                    f = fFloatValue2;
                }
                return Float.valueOf(f);
            case 6:
                qr0 qr0Var2 = (qr0) obj6;
                jd3 jd3Var = (jd3) obj5;
                h02 h02Var7 = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                boolean zJ3 = h02Var7.j(jd3Var);
                Object objK4 = h02Var7.K();
                if (zJ3 || objK4 == obj4) {
                    objK4 = new lx2(jd3Var, (byte) 1);
                    h02Var7.i0(objK4);
                }
                xy1 xy1Var = (xy1) objK4;
                boolean zJ4 = h02Var7.j(jd3Var);
                Object objK5 = h02Var7.K();
                if (zJ4 || objK5 == obj4) {
                    objK5 = new wn(jd3Var, (byte) 4);
                    h02Var7.i0(objK5);
                }
                ue5.w(qr0Var2, xy1Var, (my1) objK5, h02Var7, 8);
                return og5Var;
            default:
                Spannable spannable = (Spannable) obj5;
                jd jdVar = (jd) obj6;
                ju4 ju4Var = (ju4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int iIntValue6 = ((Integer) obj3).intValue();
                lu1 lu1Var = ju4Var.x;
                qv1 qv1Var = ju4Var.r;
                if (qv1Var == null) {
                    qv1Var = qv1.z;
                }
                lv1 lv1Var = ju4Var.n;
                int i2 = lv1Var != null ? lv1Var.g : 0;
                mv1 mv1Var = ju4Var.v;
                int i3 = mv1Var != null ? mv1Var.g : 65535;
                kd kdVar = (kd) jdVar.t;
                kf5 kf5VarY = ((mu1) kdVar.q).y(lu1Var, qv1Var, i2, i3);
                if (kf5VarY instanceof jf5) {
                    Object obj8 = ((jf5) kf5VarY).j;
                    obj8.getClass();
                    typefaceF = (Typeface) obj8;
                } else {
                    q70 q70Var = new q70(kf5VarY, kdVar.s);
                    kdVar.s = q70Var;
                    typefaceF = q70Var.f();
                }
                spannable.setSpan(new pu1(typefaceF, (byte) 1), iIntValue5, iIntValue6, 33);
                return og5Var;
        }
    }

    public /* synthetic */ bb4(my1 my1Var, nm0 nm0Var) {
        this.j = (byte) 3;
        this.t = my1Var;
        this.a = nm0Var;
    }

    public /* synthetic */ bb4(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
