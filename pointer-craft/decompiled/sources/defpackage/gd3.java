package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gd3 {
    public final dd3 g;
    public String n;
    public int r;
    public String v;
    public final nu4 y = new nu4(0);

    public gd3(dd3 dd3Var) {
        this.g = dd3Var;
    }

    public final ad3 g(int i) {
        return r(i, this.g, null, false);
    }

    public final zc3 n(zc3 zc3Var, ro roVar, boolean z, ad3 ad3Var) {
        zc3 zc3VarV;
        ArrayList arrayList = new ArrayList();
        dd3 dd3Var = this.g;
        Iterator it = dd3Var.iterator();
        while (true) {
            fd3 fd3Var = (fd3) it;
            zc3VarV = null;
            if (!fd3Var.hasNext()) {
                break;
            }
            ad3 ad3Var2 = (ad3) fd3Var.next();
            zc3VarV = yf2.p(ad3Var2, ad3Var) ? null : ad3Var2.n(roVar);
            if (zc3VarV != null) {
                arrayList.add(zc3VarV);
            }
        }
        zc3 zc3Var2 = (zc3) cj0.t0(arrayList);
        dd3 dd3Var2 = dd3Var.a;
        if (dd3Var2 != null && z && !dd3Var2.equals(ad3Var)) {
            zc3VarV = dd3Var2.v(roVar, dd3Var);
        }
        return (zc3) cj0.t0(pr.W(new zc3[]{zc3Var, zc3Var2, zc3VarV}));
    }

    public final ad3 r(int i, ad3 ad3Var, ad3 ad3Var2, boolean z) {
        nu4 nu4Var = this.y;
        ad3 ad3VarR = (ad3) c93.o(nu4Var, i);
        if (ad3Var2 != null) {
            if (yf2.p(ad3VarR, ad3Var2) && yf2.p(ad3VarR.a, ad3Var2.a)) {
                return ad3VarR;
            }
            ad3VarR = null;
        } else if (ad3VarR != null) {
            return ad3VarR;
        }
        dd3 dd3Var = this.g;
        if (z) {
            Iterator it = ((zr0) dk4.K(new m0(nu4Var, (byte) 1))).iterator();
            do {
                if (!it.hasNext()) {
                    ad3VarR = null;
                    break;
                }
                ad3 ad3Var3 = (ad3) it.next();
                ad3VarR = (!(ad3Var3 instanceof dd3) || ad3Var3.equals(ad3Var)) ? null : ((dd3) ad3Var3).w.r(i, dd3Var, ad3Var2, true);
            } while (ad3VarR == null);
        }
        if (ad3VarR != null) {
            return ad3VarR;
        }
        dd3 dd3Var2 = dd3Var.a;
        if (dd3Var2 == null || dd3Var2.equals(ad3Var)) {
            return null;
        }
        dd3 dd3Var3 = dd3Var.a;
        dd3Var3.getClass();
        return dd3Var3.w.r(i, dd3Var, ad3Var2, z);
    }

    public final ad3 y(String str, boolean z) {
        Object next;
        dd3 dd3Var;
        ad3 ad3Var;
        str.getClass();
        Iterator it = ((zr0) dk4.K(new m0(this.y, (byte) 1))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ad3Var = (ad3) next;
            if (ay4.J((String) ad3Var.t.v, str, false)) {
                break;
            }
        } while (ad3Var.t.v(str) == null);
        ad3 ad3Var2 = (ad3) next;
        if (ad3Var2 != null) {
            return ad3Var2;
        }
        if (!z || (dd3Var = this.g.a) == null) {
            return null;
        }
        gd3 gd3Var = dd3Var.w;
        gd3Var.getClass();
        if (tx4.Y(str)) {
            return null;
        }
        return gd3Var.y(str, true);
    }
}
