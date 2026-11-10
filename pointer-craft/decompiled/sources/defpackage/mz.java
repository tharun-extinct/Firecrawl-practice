package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mz implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ mz(nm0 nm0Var, nm0 nm0Var2, nm0 nm0Var3, bz1 bz1Var, boolean z, my1 my1Var, my1 my1Var2, int i) {
        this.b = nm0Var;
        this.q = nm0Var2;
        this.w = nm0Var3;
        this.c = bz1Var;
        this.a = z;
        this.t = my1Var;
        this.i = my1Var2;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        Object obj3 = this.i;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.t;
        Object obj7 = this.w;
        Object obj8 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                cz5.y((vv3) obj8, (ya5) obj7, (my1) obj6, (ox0) obj5, this.a, (ob3) obj3, (nm0) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cc6.r((ca5) obj8, (my1) obj6, (by4) obj7, (by4) obj5, (j73) obj3, this.a, (td0) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                sy0 sy0Var = (sy0) obj8;
                yy0 yy0Var = (yy0) obj7;
                String str = (String) obj6;
                Context context = (Context) obj5;
                yi2 yi2Var = (yi2) obj3;
                l62 l62Var = (l62) obj4;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    ob3 ob3VarL = v13.l(sy0Var, yy0Var, h02Var, 0, 2);
                    p04 p04Var = ((yy0) ob3VarL.getValue()).g;
                    String str2 = ((yy0) ob3VarL.getValue()).y;
                    if (!this.a) {
                        h02Var.X(-448778645);
                        lr2.v(str, h02Var, 0);
                        h02Var.b(false);
                    } else if (p04Var != null) {
                        h02Var.X(-448592738);
                        xn5 xn5Var = ((yy0) ob3VarL.getValue()).r;
                        String str3 = ((yy0) ob3VarL.getValue()).n;
                        String str4 = str3 == null ? str : str3;
                        boolean zJ = h02Var.j(context) | h02Var.j(yi2Var) | h02Var.j(l62Var) | h02Var.x(str2) | h02Var.x(ob3VarL);
                        Object objK = h02Var.K();
                        if (zJ || objK == oo0.g) {
                            qc qcVar = new qc(context, yi2Var, l62Var, str2, ob3VarL, (byte) 3);
                            h02Var.i0(qcVar);
                            objK = qcVar;
                        }
                        lr2.t(p04Var, str2, xn5Var, str4, null, (xy1) objK, h02Var, 0, 16);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-448678639);
                        de6.g(i, 0, h02Var);
                        h02Var.b(false);
                    }
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                oe3.r((nm0) obj4, (nm0) obj8, (nm0) obj7, (bz1) obj5, this.a, (my1) obj6, (my1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ah4.g((nm0) obj4, this.a, (xy1) obj8, (j73) obj7, (cn4) obj6, (pg4) obj5, (nm0) obj3, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jr4.y((kr4) obj8, (j73) obj7, this.a, (wq4) obj6, (ja3) obj5, (nm0) obj4, (cz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ mz(nm0 nm0Var, boolean z, xy1 xy1Var, j73 j73Var, cn4 cn4Var, pg4 pg4Var, nm0 nm0Var2, int i) {
        this.b = nm0Var;
        this.a = z;
        this.q = xy1Var;
        this.w = j73Var;
        this.t = cn4Var;
        this.c = pg4Var;
        this.i = nm0Var2;
        this.m = i;
    }

    public /* synthetic */ mz(sy0 sy0Var, yy0 yy0Var, boolean z, String str, int i, Context context, yi2 yi2Var, l62 l62Var) {
        this.q = sy0Var;
        this.w = yy0Var;
        this.a = z;
        this.t = str;
        this.m = i;
        this.c = context;
        this.i = yi2Var;
        this.b = l62Var;
    }

    public /* synthetic */ mz(vv3 vv3Var, ya5 ya5Var, my1 my1Var, ox0 ox0Var, boolean z, ob3 ob3Var, nm0 nm0Var, int i) {
        this.q = vv3Var;
        this.w = ya5Var;
        this.t = my1Var;
        this.c = ox0Var;
        this.a = z;
        this.i = ob3Var;
        this.b = nm0Var;
        this.m = i;
    }

    public /* synthetic */ mz(kr4 kr4Var, j73 j73Var, boolean z, wq4 wq4Var, ja3 ja3Var, nm0 nm0Var, cz1 cz1Var, int i) {
        this.q = kr4Var;
        this.w = j73Var;
        this.a = z;
        this.t = wq4Var;
        this.c = ja3Var;
        this.b = nm0Var;
        this.i = cz1Var;
        this.m = i;
    }

    public /* synthetic */ mz(ca5 ca5Var, my1 my1Var, by4 by4Var, by4 by4Var2, j73 j73Var, boolean z, td0 td0Var, int i) {
        this.q = ca5Var;
        this.t = my1Var;
        this.w = by4Var;
        this.c = by4Var2;
        this.i = j73Var;
        this.a = z;
        this.b = td0Var;
        this.m = i;
    }
}
