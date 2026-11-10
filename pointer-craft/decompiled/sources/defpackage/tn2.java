package defpackage;

import io.appground.blek.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tn2 implements cz1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ ob3 m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ qa2 t;

    public /* synthetic */ tn2(qa2 qa2Var, xy1 xy1Var, ob3 ob3Var, ob3 ob3Var2) {
        this.t = qa2Var;
        this.a = xy1Var;
        this.m = ob3Var;
        this.q = ob3Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        l76 l76Var = oo0.g;
        qa2<Locale> qa2Var = this.t;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                pm1 pm1Var = (pm1) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pm1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? h02Var.x(pm1Var) : h02Var.j(pm1Var) ? 4 : 2;
                }
                int i = iIntValue;
                if (h02Var.N(i & 1, (i & 19) != 18)) {
                    rt1 rt1Var = pm1Var.g;
                    g73 g73Var = g73.g;
                    j73 j73VarG = qb6.g(g73Var, rt1Var);
                    ob3 ob3Var = pm1Var.j;
                    j73 j73VarN = j73VarG.n(new fm1(new ef(ob3Var, (byte) 17)));
                    boolean z = pm1Var.y;
                    nm1 nm1Var = new nm1(ob3Var, pm1Var.t, z);
                    j73 j73VarN2 = j73VarN.n(dj4.g(ic6.n(b05.g(g73Var, nm1Var, new qm1(nm1Var, objArr == true ? 1 : 0)), new sd(nm1Var, z, pm1Var.r)), false, new m(z, pm1Var.n, pm1Var.v, pm1Var.x, nm1Var, pm1Var.l)));
                    ob3 ob3Var2 = this.m;
                    Locale locale = (Locale) ob3Var2.getValue();
                    String displayLanguage = locale != null ? locale.getDisplayLanguage() : null;
                    if (displayLanguage == null) {
                        h02Var.X(-552222240);
                        displayLanguage = xs2.I(R.string.share_dialog_only_symbols, h02Var);
                    } else {
                        h02Var.X(-552223449);
                    }
                    h02Var.b(false);
                    String str = displayLanguage;
                    km1 km1Var = km1.g;
                    long jV = tj0.v(fb6.o, h02Var);
                    long jV2 = tj0.v(fb6.e, h02Var);
                    long jY = jj0.y(fb6.l, tj0.v(fb6.x, h02Var));
                    long jV3 = tj0.v(fb6.s, h02Var);
                    sj0 sj0Var = fb6.r;
                    long jV4 = tj0.v(sj0Var, h02Var);
                    long jV5 = tj0.v(sj0Var, h02Var);
                    long jV6 = tj0.v(sj0Var, h02Var);
                    long jV7 = tj0.v(sj0Var, h02Var);
                    long jV8 = tj0.v(fb6.y, h02Var);
                    long jV9 = tj0.v(fb6.b, h02Var);
                    x75 x75Var = (x75) h02Var.a(y75.g);
                    long jV10 = tj0.v(fb6.h, h02Var);
                    long jV11 = tj0.v(fb6.g, h02Var);
                    long jY2 = jj0.y(fb6.v, tj0.v(fb6.n, h02Var));
                    long jV12 = tj0.v(fb6.i, h02Var);
                    long jV13 = tj0.v(fb6.k, h02Var);
                    long jV14 = tj0.v(fb6.B, h02Var);
                    long jY3 = jj0.y(fb6.a, tj0.v(fb6.t, h02Var));
                    long jV15 = tj0.v(fb6.u, h02Var);
                    long jV16 = tj0.v(fb6.d, h02Var);
                    long jV17 = tj0.v(fb6.D, h02Var);
                    long jY4 = jj0.y(fb6.c, tj0.v(fb6.w, h02Var));
                    long jV18 = tj0.v(fb6.z, h02Var);
                    long jV19 = tj0.v(fb6.f, h02Var);
                    long jV20 = tj0.v(fb6.A, h02Var);
                    long jV21 = tj0.v(fb6.j, h02Var);
                    long jV22 = tj0.v(fb6.p, h02Var);
                    sj0 sj0Var2 = fb6.C;
                    long jV23 = tj0.v(sj0Var2, h02Var);
                    long jV24 = tj0.v(sj0Var2, h02Var);
                    sj0 sj0Var3 = fb6.m;
                    long jV25 = tj0.v(sj0Var3, h02Var);
                    float f = fb6.q;
                    byte b2 = 4;
                    t45 t45VarI = bi6.i(jV, jV2, jY, jV3, jV4, jV5, jV6, jV7, jV8, jV9, x75Var, jV10, jV11, jY2, jV12, jV13, jV14, jY3, jV15, jV16, jV17, jY4, jV18, jV19, jV20, jV21, jV22, jV23, jV24, jj0.y(f, jV25), tj0.v(sj0Var2, h02Var), tj0.v(sj0Var2, h02Var), tj0.v(sj0Var2, h02Var), jj0.y(f, tj0.v(sj0Var3, h02Var)), tj0.v(sj0Var2, h02Var), tj0.v(sj0Var2, h02Var), tj0.v(sj0Var2, h02Var), jj0.y(f, tj0.v(sj0Var3, h02Var)), tj0.v(sj0Var2, h02Var), h02Var, 0, 15);
                    Object objK = h02Var.K();
                    if (objK == l76Var) {
                        objK = new m92(b2);
                        h02Var.i0(objK);
                    }
                    ob3 ob3Var3 = this.q;
                    oy0.y(str, (xy1) objK, j73VarN2, false, true, null, mz5.q, ue5.m0(-591251307, new hb(ob3Var3, (byte) 5), h02Var), null, null, null, 0, 0, null, t45VarI, h02Var, 806903856);
                    boolean zBooleanValue = ((Boolean) ob3Var3.getValue()).booleanValue();
                    Object objK2 = h02Var.K();
                    if (objK2 == l76Var) {
                        objK2 = new ef(ob3Var3, (byte) 26);
                        h02Var.i0(objK2);
                    }
                    pm1Var.g(zBooleanValue, (my1) objK2, null, null, false, null, 0L, 0.0f, ue5.m0(1144821488, new tn2(qa2Var, this.a, ob3Var2, ob3Var3), h02Var), h02Var, 48, 6 | ((i << 3) & 112));
                } else {
                    h02Var.Q();
                }
                break;
            default:
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (Locale locale2 : qa2Var) {
                        nm0 nm0VarM0 = ue5.m0(-1801998329, new ed(locale2, (byte) 15), h02Var2);
                        boolean zX = h02Var2.x(locale2);
                        xy1 xy1Var = this.a;
                        boolean zX2 = zX | h02Var2.x(xy1Var);
                        Object objK3 = h02Var2.K();
                        if (zX2 || objK3 == l76Var) {
                            jb jbVar = new jb((Object) locale2, (Object) xy1Var, (Object) this.m, (Object) this.q, (byte) 3);
                            h02Var2.i0(jbVar);
                            objK3 = jbVar;
                        }
                        ad.y(nm0VarM0, (my1) objK3, null, null, null, false, null, km1.y, h02Var2, 6, 380);
                    }
                } else {
                    h02Var2.Q();
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ tn2(ob3 ob3Var, ob3 ob3Var2, qa2 qa2Var, xy1 xy1Var) {
        this.m = ob3Var;
        this.q = ob3Var2;
        this.t = qa2Var;
        this.a = xy1Var;
    }
}
