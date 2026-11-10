package defpackage;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class s10 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q = 0;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object u;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(mt3 mt3Var, String str, long j, u75 u75Var, b65 b65Var, aj3 aj3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = mt3Var;
        this.p = str;
        this.c = j;
        this.b = u75Var;
        this.s = b65Var;
        this.u = aj3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.u;
        Object obj3 = this.s;
        Object obj4 = this.b;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                return new s10((f24) this.i, (w10) obj4, (UUID) obj3, (String) obj5, this.c, (String) obj2, mu0Var);
            case 1:
                s10 s10Var = new s10((oh5) obj4, (qt0) obj3, (s60) obj5, this.c, (dh2) obj2, mu0Var);
                s10Var.i = obj;
                return s10Var;
            default:
                return new s10((mt3) this.i, (String) obj5, this.c, (u75) obj4, (b65) obj3, (aj3) obj2, mu0Var);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((s10) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((s10) b((mu0) obj2, (lg4) obj)).u(og5Var);
            default:
                return ((s10) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        String str;
        Object objF0;
        byte b = this.q;
        byte b2 = 3;
        long j = this.c;
        Object obj2 = this.b;
        px0 px0Var = px0.j;
        Object obj3 = this.s;
        Object obj4 = this.p;
        Object obj5 = this.u;
        og5 og5Var = og5.g;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                f24 f24Var = (f24) this.i;
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    String strJ = f24Var != null ? xi3.j("&err=", f24Var.g) : null;
                    if (strJ == null) {
                        strJ = "";
                    }
                    String strT = (f24Var == null || (str = f24Var.y) == null) ? null : xi3.t("&msg=", Uri.encode(str));
                    if (strT == null) {
                        strT = "";
                    }
                    String str2 = ((w10) obj2).z;
                    String strT2 = str2 != null ? xi3.t("&cc=", Uri.encode(str2)) : null;
                    String str3 = strT2 != null ? strT2 : "";
                    String strEncode = Uri.encode((String) obj5);
                    String strEncode2 = Uri.encode("dialog_v1");
                    StringBuilder sb = new StringBuilder("https://anleitung-backend.appspot.com/api/report?paywall=empty&vid=");
                    sb.append((UUID) obj3);
                    sb.append("&avail=");
                    sb.append((String) obj4);
                    sb.append("&ms=");
                    sb.append(j);
                    sb.append("&origin=");
                    sb.append(strEncode);
                    du4.B(sb, "&variant=", strEncode2, strJ, strT);
                    sb.append(str3);
                    String string = sb.toString();
                    this.w = true;
                    x21 x21Var = na1.g;
                    if (m50.f0(c21.a, new o40(string, mu0Var, (byte) 3), this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 1:
                s60 s60Var = (s60) obj4;
                qt0 qt0Var = (qt0) obj3;
                oh5 oh5Var = (oh5) obj2;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    lg4 lg4Var = (lg4) this.i;
                    oh5Var.v = qt0Var.Q0(s60Var, j);
                    q2 q2Var = new q2(qt0Var, oh5Var, (dh2) obj5, lg4Var);
                    lt ltVar = new lt(qt0Var, oh5Var, s60Var, b2);
                    this.w = true;
                    if (oh5Var.g(q2Var, ltVar, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                aj3 aj3Var = (aj3) obj5;
                String str4 = (String) obj4;
                b65 b65Var = (b65) obj3;
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    mt3 mt3Var = (mt3) this.i;
                    this.w = true;
                    rt3 rt3Var = (rt3) mt3Var;
                    rt3Var.getClass();
                    if (str4.length() == 0) {
                        objF0 = null;
                    } else {
                        long j2 = this.c;
                        if (u75.r(j2)) {
                            objF0 = null;
                        } else {
                            objF0 = m50.f0(rt3Var.g, new n10(rt3Var, new qt3(j2, null, rt3Var, str4), (mu0) null), this);
                        }
                    }
                    if (objF0 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    objF0 = obj;
                    str4 = str4;
                }
                u75 u75Var = (u75) objF0;
                if (u75Var != null) {
                    long j3 = u75Var.g;
                    long jY = sp2.y(aj3Var.n((int) (j3 >> 32)), aj3Var.n((int) (j3 & 4294967295L)));
                    if (!u75.g(jY, (u75) obj2) && yf2.p(b65Var.q().g.t, str4) && aj3Var == b65Var.y) {
                        b65Var.r.a(b65.y(b65Var.q().g, jY));
                        b65Var.o = new u75(jY);
                    }
                }
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(f24 f24Var, w10 w10Var, UUID uuid, String str, long j, String str2, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = f24Var;
        this.b = w10Var;
        this.s = uuid;
        this.p = str;
        this.c = j;
        this.u = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(oh5 oh5Var, qt0 qt0Var, s60 s60Var, long j, dh2 dh2Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = oh5Var;
        this.s = qt0Var;
        this.p = s60Var;
        this.c = j;
        this.u = dh2Var;
    }
}
