package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class r10 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(l22 l22Var, Context context, int i, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 1;
        this.i = l22Var;
        this.b = context;
        this.c = i;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        int i = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new r10((String) this.i, this.c, (String) obj2, mu0Var, (byte) 0);
            case 1:
                return new r10((l22) this.i, (Context) obj2, i, mu0Var);
            case 2:
                r10 r10Var = new r10((xl2) obj2, i, mu0Var);
                r10Var.i = obj;
                return r10Var;
            default:
                return new r10((qg) this.i, this.c, (sh4) obj2, mu0Var, (byte) 3);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((r10) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        int i = this.c;
        px0 px0Var = px0.j;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                String str = (String) this.i;
                String strT = str != null ? xi3.t("&msg=", Uri.encode(str)) : null;
                if (strT == null) {
                    strT = "";
                }
                String str2 = "https://anleitung-backend.appspot.com/api/report?err=" + i + "&src=" + ((String) obj2) + strT;
                this.w = true;
                x21 x21Var = na1.g;
                return m50.f0(c21.a, new o40(str2, mu0Var, (byte) 3), this) == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return w12.x(((l22) this.i).v(), (Context) obj2, i, this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                xl2 xl2Var = (xl2) obj2;
                ox0 ox0Var = (ox0) this.i;
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    Integer num = xl2Var.t;
                    if (num != null && num.intValue() == i) {
                        return og5Var;
                    }
                    xl2Var.t = new Integer(i);
                    el2 el2Var = xl2Var.y;
                    this.i = ox0Var;
                    this.w = true;
                    obj = pw5.F(this, new i30(i, (byte) 9), el2Var.g, true, false);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                sk2 sk2Var = (sk2) obj;
                if (sk2Var == null) {
                    return og5Var;
                }
                xl2Var.r.getClass();
                xl2Var.j(tg1.v(sk2Var));
                return og5Var;
            default:
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar = (qg) this.i;
                Integer num2 = new Integer(i);
                zu4 zu4Var = ((sh4) obj2).y;
                this.w = true;
                return qg.g(qgVar, num2, zu4Var, null, this, 12) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(xl2 xl2Var, int i, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 2;
        this.b = xl2Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r10(Object obj, int i, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = i;
        this.b = obj2;
    }
}
