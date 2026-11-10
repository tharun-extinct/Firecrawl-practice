package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rc3 {
    public final f73 g;
    public final /* synthetic */ jd3 j;
    public final sf3 l;
    public boolean n;
    public final ew4 r;
    public final f34 v;
    public final f34 x;
    public final ew4 y;

    public rc3(jd3 jd3Var, sf3 sf3Var) {
        sf3Var.getClass();
        this.j = jd3Var;
        this.g = new f73((byte) 16);
        ew4 ew4VarW = y94.w(pi1.j);
        this.y = ew4VarW;
        ew4 ew4VarW2 = y94.w(vi1.j);
        this.r = ew4VarW2;
        this.v = pw5.j(ew4VarW);
        this.x = pw5.j(ew4VarW2);
        this.l = sf3Var;
    }

    public final void g(mc3 mc3Var) {
        mc3Var.getClass();
        synchronized (this.g) {
            ew4 ew4Var = this.y;
            ew4Var.m(null, cj0.x0((Collection) ew4Var.getValue(), mc3Var));
        }
    }

    public final void n(mc3 mc3Var, boolean z) {
        mc3Var.getClass();
        vc3 vc3Var = this.j.y;
        rg rgVar = new rg(this, mc3Var, z);
        vc3Var.getClass();
        sf3 sf3VarY = vc3Var.u.y(mc3Var.t.j);
        vc3Var.f.put(mc3Var, Boolean.valueOf(z));
        if (!sf3VarY.equals(this.l)) {
            Object obj = vc3Var.z.get(sf3VarY);
            obj.getClass();
            ((rc3) obj).n(mc3Var, z);
            return;
        }
        tc3 tc3Var = vc3Var.o;
        if (tc3Var != null) {
            tc3Var.a(mc3Var);
            rgVar.g();
            return;
        }
        dr drVar = vc3Var.x;
        int iIndexOf = drVar.indexOf(mc3Var);
        if (iIndexOf < 0) {
            oz5.y("Ignoring pop of " + mc3Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != drVar.a) {
            vc3Var.i(((mc3) drVar.get(i)).t.t.g, true, false);
        }
        vc3.s(vc3Var, mc3Var);
        rgVar.g();
        vc3Var.y.g();
        vc3Var.y();
    }

    public final void r(mc3 mc3Var) {
        q64 q64Var;
        mc3Var.getClass();
        vc3 vc3Var = this.j.y;
        ew4 ew4Var = vc3Var.j;
        String str = mc3Var.w;
        LinkedHashMap linkedHashMap = vc3Var.f;
        boolean zP = yf2.p(linkedHashMap.get(mc3Var), Boolean.TRUE);
        ew4 ew4Var2 = this.r;
        ew4Var2.m(null, nl4.C((Set) ew4Var2.getValue(), mc3Var));
        linkedHashMap.remove(mc3Var);
        dr drVar = vc3Var.x;
        if (drVar.contains(mc3Var)) {
            if (this.n) {
                return;
            }
            vc3Var.h();
            ew4 ew4Var3 = vc3Var.l;
            ArrayList arrayList = new ArrayList(drVar);
            ew4Var3.getClass();
            ew4Var3.m(null, arrayList);
            ArrayList arrayListP = vc3Var.p();
            ew4Var.getClass();
            ew4Var.m(null, arrayListP);
            return;
        }
        vc3Var.z(mc3Var);
        if (mc3Var.p.t.compareTo(wt2.a) >= 0) {
            mc3Var.u = wt2.j;
            mc3Var.n();
        }
        if (!drVar.isEmpty()) {
            Iterator it = drVar.iterator();
            while (it.hasNext()) {
                if (((mc3) it.next()).w.equals(str)) {
                }
            }
            if (!zP) {
                q64Var.v(str);
            }
        } else if (!zP && (q64Var = vc3Var.i) != null) {
            q64Var.v(str);
        }
        vc3Var.h();
        ArrayList arrayListP2 = vc3Var.p();
        ew4Var.getClass();
        ew4Var.m(null, arrayListP2);
    }

    public final void v(mc3 mc3Var, boolean z) {
        Object objPrevious;
        mc3Var.getClass();
        cw4 cw4Var = this.v.j;
        ew4 ew4Var = this.r;
        Iterable iterable = (Iterable) ew4Var.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((mc3) it.next()) == mc3Var) {
                    Iterable iterable2 = (Iterable) cw4Var.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((mc3) it2.next()) == mc3Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        ew4Var.m(null, nl4.D((Set) ew4Var.getValue(), mc3Var));
        List list = (List) cw4Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            mc3 mc3Var2 = (mc3) objPrevious;
            if (!yf2.p(mc3Var2, mc3Var) && ((List) cw4Var.getValue()).lastIndexOf(mc3Var2) < ((List) cw4Var.getValue()).lastIndexOf(mc3Var)) {
                break;
            }
        }
        mc3 mc3Var3 = (mc3) objPrevious;
        if (mc3Var3 != null) {
            ew4Var.m(null, nl4.D((Set) ew4Var.getValue(), mc3Var3));
        }
        n(mc3Var, z);
    }

    public final void x(mc3 mc3Var) {
        mc3Var.getClass();
        vc3 vc3Var = this.j.y;
        vc3Var.getClass();
        sf3 sf3VarY = vc3Var.u.y(mc3Var.t.j);
        if (!sf3VarY.equals(this.l)) {
            Object obj = vc3Var.z.get(sf3VarY);
            if (obj != null) {
                ((rc3) obj).x(mc3Var);
                return;
            } else {
                uo1.x(du4.i("NavigatorBackStack for ", mc3Var.t.j, " should already be created"));
                return;
            }
        }
        xy1 xy1Var = vc3Var.h;
        if (xy1Var != null) {
            xy1Var.a(mc3Var);
            g(mc3Var);
            return;
        }
        oz5.y("Ignoring add of destination " + mc3Var.t + " outside of the call to navigate(). ");
    }

    public final mc3 y(ad3 ad3Var, Bundle bundle) {
        vc3 vc3Var = this.j.y;
        vc3Var.getClass();
        return d52.g(vc3Var.g.r, ad3Var, bundle, vc3Var.a(), vc3Var.i);
    }
}
