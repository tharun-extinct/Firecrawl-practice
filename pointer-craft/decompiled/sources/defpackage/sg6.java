package defpackage;

import android.content.res.Resources;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sg6 {
    public static ha2 g;

    public static final boolean a(gj4 gj4Var, aj4 aj4Var) {
        Iterator it = aj4Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aj4 aj4VarM = gj4Var.m();
            if (!aj4VarM.j.r((mj4) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final cj b(gj4 gj4Var) {
        Object objL = gj4Var.n.j.l(kj4.G);
        if (objL == null) {
            objL = null;
        }
        cj cjVar = (cj) objL;
        Object objL2 = gj4Var.n.j.l(kj4.C);
        if (objL2 == null) {
            objL2 = null;
        }
        List list = (List) objL2;
        return cjVar == null ? list != null ? (cj) cj0.l0(list) : null : cjVar;
    }

    public static final boolean c(gj4 gj4Var) {
        Object objL = gj4Var.n.j.l(kj4.L);
        if (objL == null) {
            objL = null;
        }
        ca5 ca5Var = (ca5) objL;
        hb3 hb3Var = gj4Var.n.j;
        Object objL2 = hb3Var.l(kj4.e);
        if (objL2 == null) {
            objL2 = null;
        }
        o94 o94Var = (o94) objL2;
        boolean z = ca5Var != null;
        Object objL3 = hb3Var.l(kj4.K);
        if (((Boolean) (objL3 != null ? objL3 : null)) == null || (o94Var != null && o94Var.g == 4)) {
            return z;
        }
        return true;
    }

    public static final boolean g(p1 p1Var, Object obj) {
        if (p1Var == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        String str = p1Var.g;
        p1 p1Var2 = (p1) obj;
        jz1 jz1Var = p1Var2.y;
        if (!yf2.p(str, p1Var2.g)) {
            return false;
        }
        jz1 jz1Var2 = p1Var.y;
        if (jz1Var2 != null || jz1Var == null) {
            return jz1Var2 == null || jz1Var != null;
        }
        return false;
    }

    public static final String i(gj4 gj4Var, Resources resources) {
        int iW;
        aj4 aj4Var = gj4Var.n;
        aj4 aj4Var2 = gj4Var.n;
        Object objL = aj4Var.j.l(kj4.y);
        String string = null;
        if (objL == null) {
            objL = null;
        }
        hb3 hb3Var = aj4Var2.j;
        Object objL2 = hb3Var.l(kj4.L);
        if (objL2 == null) {
            objL2 = null;
        }
        ca5 ca5Var = (ca5) objL2;
        Object objL3 = hb3Var.l(kj4.e);
        if (objL3 == null) {
            objL3 = null;
        }
        o94 o94Var = (o94) objL3;
        if (ca5Var != null) {
            int iOrdinal = ca5Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        up.y();
                        return null;
                    }
                    if (objL == null) {
                        objL = resources.getString(R.string.indeterminate);
                    }
                } else if (o94Var != null && o94Var.g == 2 && objL == null) {
                    objL = resources.getString(R.string.state_off);
                }
            } else if (o94Var != null && o94Var.g == 2 && objL == null) {
                objL = resources.getString(R.string.state_on);
            }
        }
        Object objL4 = hb3Var.l(kj4.K);
        if (objL4 == null) {
            objL4 = null;
        }
        Boolean bool = (Boolean) objL4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((o94Var == null || o94Var.g != 4) && objL == null) {
                objL = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objL5 = hb3Var.l(kj4.r);
        if (objL5 == null) {
            objL5 = null;
        }
        rz3 rz3Var = (rz3) objL5;
        if (rz3Var != null) {
            if (rz3Var != rz3.r) {
                if (objL == null) {
                    ki0 ki0Var = rz3Var.y;
                    float f = ki0Var.y;
                    float f2 = ki0Var.g;
                    float f3 = f - f2 == 0.0f ? 0.0f : (rz3Var.g - f2) / (ki0Var.y - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iW = 0;
                    } else {
                        iW = f3 == 1.0f ? 100 : xs2.w(Math.round(f3 * 100.0f), 1, 99);
                    }
                    objL = resources.getString(R.string.template_percent, Integer.valueOf(iW));
                }
            } else if (objL == null) {
                objL = resources.getString(R.string.in_progress);
            }
        }
        mj4 mj4Var = kj4.G;
        if (hb3Var.r(mj4Var)) {
            hb3 hb3Var2 = new gj4(gj4Var.g, true, gj4Var.r, aj4Var2).m().j;
            Object objL6 = hb3Var2.l(kj4.g);
            if (objL6 == null) {
                objL6 = null;
            }
            Collection collection = (Collection) objL6;
            if (collection == null || collection.isEmpty()) {
                Object objL7 = hb3Var2.l(kj4.C);
                if (objL7 == null) {
                    objL7 = null;
                }
                Collection collection2 = (Collection) objL7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objL8 = hb3Var2.l(mj4Var);
                    if (objL8 == null) {
                        objL8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objL8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objL = string;
        }
        return (String) objL;
    }

    public static final boolean l(gj4 gj4Var) {
        return gj4Var.r.G == fl2.t;
    }

    public static final void m(he2 he2Var, fa3 fa3Var, fa3 fa3Var2, Resources resources) {
        fa3Var.g();
        fa3Var2.g();
        ij4 ij4Var = (ij4) he2Var.y(-1);
        gj4 gj4Var = ij4Var != null ? ij4Var.g : null;
        gj4Var.getClass();
        ArrayList arrayListY = pj4.y(gj4Var, new h((Object) he2Var, (byte) 5), new h((Object) resources, (byte) 6), pw5.k(gj4Var));
        int i = 1;
        int size = arrayListY.size() - 1;
        if (1 > size) {
            return;
        }
        while (true) {
            int i2 = ((gj4) arrayListY.get(i - 1)).x;
            int i3 = ((gj4) arrayListY.get(i)).x;
            fa3Var.x(i2, i3);
            fa3Var2.x(i3, i2);
            if (i == size) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean p(gj4 gj4Var) {
        if (!gj4Var.c()) {
            List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
            int size = listT.size();
            for (int i = 0; i < size; i++) {
                if (rf6.n((gj4) listT.get(i))) {
                }
            }
            um2 um2VarO = gj4Var.r.o();
            while (true) {
                if (um2VarO == null) {
                    um2VarO = null;
                    break;
                }
                aj4 aj4VarK = um2VarO.k();
                if (aj4VarK != null && aj4VarK.a) {
                    break;
                }
                um2VarO = um2VarO.o();
            }
            return !(um2VarO != null);
        }
        return false;
    }

    public static final void q(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0044 A[SYNTHETIC] */
    public static final boolean r(gj4 gj4Var) {
        um2 um2VarO;
        aj4 aj4VarK;
        boolean zP;
        aj4 aj4VarK2;
        aj4 aj4Var = gj4Var.n;
        if (!aj4Var.j.r(kj4.G)) {
            um2VarO = gj4Var.r.o();
            while (true) {
                if (um2VarO == null) {
                    um2VarO = null;
                    break;
                }
                aj4VarK2 = um2VarO.k();
                if (aj4VarK2 == null) {
                }
                um2VarO = um2VarO.o();
            }
            if (um2VarO != null) {
                aj4VarK = um2VarO.k();
                if (aj4VarK != null) {
                    Object objL = aj4VarK.j.l(kj4.q);
                    zP = yf2.p(objL != null ? objL : null, Boolean.TRUE);
                } else {
                    zP = false;
                }
                if (!zP) {
                }
            }
            return false;
        }
        Object objL2 = aj4Var.j.l(kj4.q);
        if (objL2 == null) {
            objL2 = null;
        }
        if (yf2.p(objL2, Boolean.TRUE)) {
            um2VarO = gj4Var.r.o();
            while (true) {
                if (um2VarO == null) {
                    um2VarO = null;
                    break;
                }
                aj4VarK2 = um2VarO.k();
                if (aj4VarK2 == null && aj4VarK2.a) {
                    if (aj4VarK2.j.r(kj4.G)) {
                        break;
                    }
                }
                um2VarO = um2VarO.o();
            }
            if (um2VarO != null) {
                aj4VarK = um2VarO.k();
                if (aj4VarK != null) {
                    Object objL3 = aj4VarK.j.l(kj4.q);
                    zP = yf2.p(objL3 != null ? objL3 : null, Boolean.TRUE);
                } else {
                    zP = false;
                }
                if (!zP) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean s(gj4 gj4Var, Resources resources) {
        if (fe6.l(gj4Var)) {
            return false;
        }
        aj4 aj4Var = gj4Var.n;
        if (aj4Var.a) {
            return true;
        }
        Object objL = aj4Var.j.l(kj4.g);
        if (objL == null) {
            objL = null;
        }
        List list = (List) objL;
        return !((list != null ? (String) cj0.l0(list) : null) == null && b(gj4Var) == null && i(gj4Var, resources) == null && !c(gj4Var)) && p(gj4Var);
    }

    public static final StringBuilder u() {
        return new StringBuilder();
    }

    public static final ha2 w() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Headphones", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3VarJ = du4.j(12.0f, 3.0f);
        kq3VarJ.r(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        kq3VarJ.w(7.0f);
        kq3VarJ.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kq3VarJ.v(4.0f);
        kq3VarJ.w(-8.0f);
        kq3VarJ.n(5.0f);
        kq3VarJ.w(-1.0f);
        kq3VarJ.r(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        kq3VarJ.m(7.0f, 3.13f, 7.0f, 7.0f);
        kq3VarJ.w(1.0f);
        kq3VarJ.v(-4.0f);
        kq3VarJ.w(8.0f);
        kq3VarJ.v(4.0f);
        kq3VarJ.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3VarJ.w(-7.0f);
        kq3VarJ.y(21.0f, 7.03f, 16.97f, 3.0f, 12.0f, 3.0f);
        kq3VarJ.g();
        kq3VarJ.j(7.0f, 15.0f);
        kq3VarJ.w(4.0f);
        kq3VarJ.n(5.0f);
        kq3VarJ.w(-4.0f);
        kq3VarJ.n(7.0f);
        kq3VarJ.g();
        kq3VarJ.j(19.0f, 19.0f);
        kq3VarJ.v(-2.0f);
        kq3VarJ.w(-4.0f);
        kq3VarJ.v(2.0f);
        kq3VarJ.q(19.0f);
        kq3VarJ.g();
        ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final boolean y(gj4 gj4Var) {
        return !gj4Var.m().j.r(kj4.a);
    }
}
