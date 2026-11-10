package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jb implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ jb(my1 my1Var, ya5 ya5Var, ox0 ox0Var, ob3 ob3Var) {
        this.j = (byte) 1;
        this.t = my1Var;
        this.a = ya5Var;
        this.m = ox0Var;
        this.q = ob3Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    @Override // defpackage.my1
    public final Object g() {
        String language;
        ad3 ad3Var;
        ad3 ad3Var2;
        byte b = this.j;
        byte b2 = 2;
        mu0 mu0Var = null;
        og5 og5Var = og5.g;
        Object obj = this.t;
        Object obj2 = this.q;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                ((p91) obj4).j((my1) obj, (o91) obj3, (fl2) obj2);
                return og5Var;
            case 1:
                my1 my1Var = (my1) obj;
                ya5 ya5Var = (ya5) obj4;
                ox0 ox0Var = (ox0) obj3;
                ob3 ob3Var = (ob3) obj2;
                if (my1Var != null) {
                    my1Var.g();
                } else if (ya5Var.isVisible()) {
                    m50.T(ox0Var, null, new qx(ya5Var, mu0Var, b2), 3);
                    ob3Var.setValue(Boolean.FALSE);
                }
                return og5Var;
            case 2:
                m50.T((ox0) obj4, null, new n10((b90) obj, (g90) obj3, (ob3) obj2, null, (byte) 1), 3);
                return og5Var;
            case 3:
                Locale locale = (Locale) obj4;
                xy1 xy1Var = (xy1) obj;
                ((ob3) obj3).setValue(locale);
                ((ob3) obj2).setValue(Boolean.FALSE);
                if (locale == null || (language = locale.getLanguage()) == null) {
                    language = "";
                }
                xy1Var.a(language);
                return og5Var;
            case 4:
                xo4 xo4Var = (xo4) obj4;
                xo4Var.v = (zu4) obj;
                xo4Var.x = (zu4) obj3;
                xo4Var.r = (zu4) obj2;
                return og5Var;
            case 5:
                xo4 xo4Var2 = (xo4) obj4;
                ox0 ox0Var2 = (ox0) obj3;
                qg qgVar = (qg) obj2;
                my1 my1Var2 = (my1) obj;
                if (((yo4) ((tp3) xo4Var2.n.l).getValue()) == yo4.t) {
                    if (xo4Var2.n.n().g.containsKey(yo4.a)) {
                        m50.T(ox0Var2, null, new dy(qgVar, (mu0) null, (byte) 20), 3);
                        m50.T(ox0Var2, null, new v63(xo4Var2, null, (byte) 0), 3);
                    } else {
                        m50.T(ox0Var2, null, new v63(xo4Var2, null, (byte) 1), 3).A(new tz2(my1Var2, (byte) 1));
                    }
                } else {
                    m50.T(ox0Var2, null, new v63(xo4Var2, null, (byte) 1), 3).A(new tz2(my1Var2, (byte) 1));
                }
                return og5Var;
            case 6:
                jd3 jd3Var = (jd3) obj4;
                b90 b90Var = (b90) obj;
                int[] iArr = (int[]) obj3;
                xl2 xl2Var = (xl2) obj2;
                mc3 mc3VarL = jd3Var.y.l();
                if (yf2.p((mc3VarL == null || (ad3Var = mc3VarL.t) == null) ? null : (String) ad3Var.t.v, "buttonedit?index={index}")) {
                    sz5.r(b90Var.n, b90Var.v().g, b90Var.v().y);
                    if (iArr.length == 0) {
                        l0.s("Array is empty.");
                        return null;
                    }
                    if (iArr[iArr.length - 1] < 0) {
                        o04 o04Var = b90Var.n;
                        int i = rp2.g;
                        r04 r04Var = new r04();
                        s04 s04Var = new s04();
                        s04Var.m = 2;
                        r04Var.q = s04Var;
                        r04Var.t = (byte) 2;
                        r04Var.a = o04Var;
                        xl2Var.v(r04Var);
                    }
                    jd3Var.x();
                }
                return og5Var;
            default:
                jd3 jd3Var2 = (jd3) obj4;
                ox0 ox0Var3 = (ox0) obj3;
                xl2 xl2Var2 = (xl2) obj2;
                my1 my1Var3 = (my1) obj;
                mc3 mc3VarL2 = jd3Var2.y.l();
                if (yf2.p((mc3VarL2 == null || (ad3Var2 = mc3VarL2.t) == null) ? null : (String) ad3Var2.t.v, "layoutedit?layoutId={layoutId}")) {
                    m50.T(ox0Var3, null, new u03(xl2Var2, jd3Var2, my1Var3, (mu0) null, (byte) 2), 3);
                }
                return og5Var;
        }
    }

    public /* synthetic */ jb(Object obj, ox0 ox0Var, Object obj2, my1 my1Var, byte b) {
        this.j = b;
        this.a = obj;
        this.m = ox0Var;
        this.q = obj2;
        this.t = my1Var;
    }

    public /* synthetic */ jb(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.a = obj;
        this.t = obj2;
        this.m = obj3;
        this.q = obj4;
    }
}
