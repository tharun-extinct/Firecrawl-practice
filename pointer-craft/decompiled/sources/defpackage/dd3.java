package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class dd3 extends ad3 implements Iterable, vh2 {
    public static final /* synthetic */ int c = 0;
    public final gd3 w;

    public dd3(id3 id3Var) {
        super(id3Var);
        this.w = new gd3(this);
    }

    @Override // defpackage.ad3
    public final boolean equals(Object obj) {
        byte b = 1;
        if (this != obj) {
            if (obj == null || !(obj instanceof dd3) || !super.equals(obj)) {
                return false;
            }
            gd3 gd3Var = this.w;
            int iV = gd3Var.y.v();
            gd3 gd3Var2 = ((dd3) obj).w;
            if (iV != gd3Var2.y.v() || gd3Var.r != gd3Var2.r) {
                return false;
            }
            for (ad3 ad3Var : (zr0) dk4.K(new m0(gd3Var.y, b))) {
                if (!ad3Var.equals(c93.o(gd3Var2.y, ad3Var.t.g))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ad3
    public final int hashCode() {
        gd3 gd3Var = this.w;
        int iR = gd3Var.r;
        nu4 nu4Var = gd3Var.y;
        int iV = nu4Var.v();
        for (int i = 0; i < iV; i++) {
            iR = (((iR * 31) + nu4Var.r(i)) * 31) + ((ad3) nu4Var.x(i)).hashCode();
        }
        return iR;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        gd3 gd3Var = this.w;
        gd3Var.getClass();
        return new fd3(gd3Var);
    }

    @Override // defpackage.ad3
    public final zc3 n(ro roVar) {
        zc3 zc3VarN = super.n(roVar);
        gd3 gd3Var = this.w;
        gd3Var.getClass();
        return gd3Var.n(zc3VarN, roVar, false, gd3Var.g);
    }

    @Override // defpackage.ad3
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        gd3 gd3Var = this.w;
        String str = gd3Var.v;
        gd3Var.getClass();
        ad3 ad3VarY = (str == null || tx4.Y(str)) ? null : gd3Var.y(str, true);
        if (ad3VarY == null) {
            ad3VarY = gd3Var.g(gd3Var.r);
        }
        sb.append(" startDestination=");
        if (ad3VarY == null) {
            String str2 = gd3Var.v;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = gd3Var.n;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(gd3Var.r));
                }
            }
        } else {
            sb.append("{");
            sb.append(ad3VarY.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    public final zc3 v(ro roVar, ad3 ad3Var) {
        return this.w.n(super.n(roVar), roVar, true, ad3Var);
    }

    public final zc3 x(String str, boolean z, ad3 ad3Var) {
        zc3 zc3VarX;
        str.getClass();
        gd3 gd3Var = this.w;
        gd3Var.getClass();
        dd3 dd3Var = gd3Var.g;
        zc3 zc3VarV = dd3Var.t.v(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = dd3Var.iterator();
        while (true) {
            fd3 fd3Var = (fd3) it;
            zc3VarX = null;
            if (!fd3Var.hasNext()) {
                break;
            }
            ad3 ad3Var2 = (ad3) fd3Var.next();
            if (!yf2.p(ad3Var2, ad3Var)) {
                if (ad3Var2 instanceof dd3) {
                    zc3VarX = ((dd3) ad3Var2).x(str, false, dd3Var);
                } else {
                    ad3Var2.getClass();
                    zc3VarX = ad3Var2.t.v(str);
                }
            }
            if (zc3VarX != null) {
                arrayList.add(zc3VarX);
            }
        }
        zc3 zc3Var = (zc3) cj0.t0(arrayList);
        dd3 dd3Var2 = dd3Var.a;
        if (dd3Var2 != null && z && !dd3Var2.equals(ad3Var)) {
            zc3VarX = dd3Var2.x(str, true, dd3Var);
        }
        return (zc3) cj0.t0(pr.W(new zc3[]{zc3VarV, zc3Var, zc3VarX}));
    }
}
