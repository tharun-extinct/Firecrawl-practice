package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vc3 {
    public final LinkedHashMap a;
    public final ArrayList b;
    public gu2 c;
    public final ArrayList d;
    public final co4 e;
    public final LinkedHashMap f;
    public final jd3 g;
    public xy1 h;
    public q64 i;
    public final ew4 j;
    public int k;
    public final ew4 l;
    public final LinkedHashMap m;
    public Bundle n;
    public tc3 o;
    public final sc3 p;
    public final LinkedHashMap q;
    public dd3 r;
    public wt2 s;
    public final f34 t;
    public final tf3 u;
    public Bundle[] v;
    public final LinkedHashMap w;
    public final dr x = new dr();
    public final wn y;
    public final LinkedHashMap z;

    public vc3(jd3 jd3Var, wn wnVar) {
        this.g = jd3Var;
        this.y = wnVar;
        pi1 pi1Var = pi1.j;
        this.l = y94.w(pi1Var);
        ew4 ew4VarW = y94.w(pi1Var);
        this.j = ew4VarW;
        this.t = pw5.j(ew4VarW);
        this.a = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.b = new ArrayList();
        this.s = wt2.t;
        this.p = new sc3(this, (byte) 0);
        this.u = new tf3();
        this.z = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = v70.x(0, 2, f70.t);
    }

    public static /* synthetic */ void s(vc3 vc3Var, mc3 mc3Var) {
        vc3Var.b(mc3Var, false, new dr());
    }

    public static ad3 v(int i, ad3 ad3Var, ad3 ad3Var2, boolean z) {
        if (ad3Var.t.g == i && (ad3Var2 == null || (ad3Var.equals(ad3Var2) && yf2.p(ad3Var.a, ad3Var2.a)))) {
            return ad3Var;
        }
        dd3 dd3Var = ad3Var instanceof dd3 ? (dd3) ad3Var : null;
        if (dd3Var == null) {
            dd3Var = ad3Var.a;
            dd3Var.getClass();
        }
        return dd3Var.w.r(i, dd3Var, ad3Var2, z);
    }

    public final wt2 a() {
        return this.c == null ? wt2.a : this.s;
    }

    public final void b(mc3 mc3Var, boolean z, dr drVar) {
        q64 q64Var;
        Set set;
        mc3Var.getClass();
        dr drVar2 = this.x;
        mc3 mc3Var2 = (mc3) drVar2.last();
        if (!yf2.p(mc3Var2, mc3Var)) {
            uo1.q("Attempted to pop ", mc3Var.t, ", which is not the top of the back stack (", mc3Var2.t, ")");
            return;
        }
        hj0.d0(drVar2);
        rc3 rc3Var = (rc3) this.z.get(this.u.y(mc3Var2.t.j));
        boolean z2 = true;
        if ((rc3Var == null || (set = (Set) rc3Var.x.j.getValue()) == null || !set.contains(mc3Var2)) && !this.m.containsKey(mc3Var2)) {
            z2 = false;
        }
        wt2 wt2Var = mc3Var2.p.t;
        wt2 wt2Var2 = wt2.a;
        if (wt2Var.compareTo(wt2Var2) >= 0) {
            if (z) {
                mc3Var2.u = wt2Var2;
                mc3Var2.n();
                drVar.addFirst(new qc3(mc3Var2));
            }
            if (z2) {
                mc3Var2.u = wt2Var2;
                mc3Var2.n();
            } else {
                mc3Var2.u = wt2.j;
                mc3Var2.n();
                z(mc3Var2);
            }
        }
        if (z || z2 || (q64Var = this.i) == null) {
            return;
        }
        q64Var.v(mc3Var2.w);
    }

    public final void c(String str, wd3 wd3Var) {
        str.getClass();
        if (this.r == null) {
            uo1.o("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, ".");
            return;
        }
        dd3 dd3VarM = m();
        zc3 zc3VarX = dd3VarM.x(str, true, dd3VarM);
        if (zc3VarX == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.r);
        }
        ad3 ad3Var = zc3VarX.j;
        Bundle bundleG = ad3Var.g(zc3VarX.t);
        if (bundleG == null) {
            bundleG = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        }
        int i = ad3.q;
        String str2 = (String) ad3Var.t.v;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleG.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        w(ad3Var, bundleG, wd3Var);
    }

    public final void g(ad3 ad3Var, Bundle bundle, mc3 mc3Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        jq jqVar = this.g.r;
        ad3 ad3Var2 = mc3Var.t;
        boolean z = ad3Var2 instanceof cr1;
        dr drVar = this.x;
        if (!z) {
            while (!drVar.isEmpty() && (((mc3) drVar.last()).t instanceof cr1) && i(((mc3) drVar.last()).t.t.g, true, false)) {
            }
        }
        dr<mc3> drVar2 = new dr();
        Object obj = null;
        if (ad3Var instanceof dd3) {
            ad3 ad3Var3 = ad3Var2;
            do {
                ad3Var3.getClass();
                ad3Var3 = ad3Var3.a;
                if (ad3Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!yf2.p(((mc3) objPrevious2).t, ad3Var3));
                    mc3 mc3VarG = (mc3) objPrevious2;
                    if (mc3VarG == null) {
                        mc3VarG = d52.g(jqVar, ad3Var3, bundle, a(), this.i);
                    }
                    drVar2.addFirst(mc3VarG);
                    if (!drVar.isEmpty() && ((mc3) drVar.last()).t == ad3Var3) {
                        s(this, (mc3) drVar.last());
                    }
                }
                if (ad3Var3 == null) {
                    break;
                }
            } while (ad3Var3 != ad3Var);
        }
        ad3 ad3Var4 = drVar2.isEmpty() ? ad3Var2 : ((mc3) drVar2.first()).t;
        while (ad3Var4 != null && n(ad3Var4.t.g, ad3Var4) != ad3Var4) {
            ad3Var4 = ad3Var4.a;
            if (ad3Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!yf2.p(((mc3) objPrevious).t, ad3Var4));
                mc3 mc3VarG2 = (mc3) objPrevious;
                if (mc3VarG2 == null) {
                    mc3VarG2 = d52.g(jqVar, ad3Var4, ad3Var4.g(bundle2), a(), this.i);
                }
                drVar2.addFirst(mc3VarG2);
            }
        }
        if (!drVar2.isEmpty()) {
            ad3Var2 = ((mc3) drVar2.first()).t;
        }
        while (!drVar.isEmpty() && (((mc3) drVar.last()).t instanceof dd3)) {
            ad3 ad3Var5 = ((mc3) drVar.last()).t;
            ad3Var5.getClass();
            if (c93.o(((dd3) ad3Var5).w.y, ad3Var2.t.g) != null) {
                break;
            } else {
                s(this, (mc3) drVar.last());
            }
        }
        mc3 mc3Var2 = (mc3) drVar.x();
        if (mc3Var2 == null) {
            mc3Var2 = (mc3) drVar2.x();
        }
        if (!yf2.p(mc3Var2 != null ? mc3Var2.t : null, this.r)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                ad3 ad3Var6 = ((mc3) objPrevious3).t;
                dd3 dd3Var = this.r;
                dd3Var.getClass();
                if (yf2.p(ad3Var6, dd3Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            mc3 mc3VarG3 = (mc3) obj;
            if (mc3VarG3 == null) {
                dd3 dd3Var2 = this.r;
                dd3Var2.getClass();
                dd3 dd3Var3 = this.r;
                dd3Var3.getClass();
                mc3VarG3 = d52.g(jqVar, dd3Var2, dd3Var3.g(bundle), a(), this.i);
            }
            drVar2.addFirst(mc3VarG3);
        }
        for (mc3 mc3Var3 : drVar2) {
            Object obj2 = this.z.get(this.u.y(mc3Var3.t.j));
            if (obj2 == null) {
                uo1.x(du4.i("NavigatorBackStack for ", ad3Var.j, " should already be created"));
                return;
            }
            ((rc3) obj2).g(mc3Var3);
        }
        drVar.addAll(drVar2);
        drVar.addLast(mc3Var);
        ArrayList arrayListX0 = cj0.x0(drVar2, mc3Var);
        int size = arrayListX0.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListX0.get(i);
            i++;
            mc3 mc3Var4 = (mc3) obj3;
            dd3 dd3Var4 = mc3Var4.t.a;
            if (dd3Var4 != null) {
                q(mc3Var4, x(dd3Var4.t.g));
            }
        }
    }

    public final void h() {
        as asVar;
        Set set;
        ArrayList arrayListG0 = cj0.G0(this.x);
        if (arrayListG0.isEmpty()) {
            return;
        }
        ArrayList arrayListA = pw5.A(((mc3) cj0.r0(arrayListG0)).t);
        ArrayList arrayList = new ArrayList();
        if (cj0.r0(arrayListA) instanceof cr1) {
            Iterator it = cj0.y0(arrayListG0).iterator();
            while (it.hasNext()) {
                ad3 ad3Var = ((mc3) it.next()).t;
                arrayList.add(ad3Var);
                if (!(ad3Var instanceof cr1) && !(ad3Var instanceof dd3)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (mc3 mc3Var : cj0.y0(arrayListG0)) {
            wt2 wt2Var = mc3Var.u;
            ad3 ad3Var2 = mc3Var.t;
            ad3 ad3Var3 = (ad3) cj0.l0(arrayListA);
            wt2 wt2Var2 = wt2.q;
            wt2 wt2Var3 = wt2.m;
            if (ad3Var3 != null && ad3Var3.t.g == ad3Var2.t.g) {
                if (wt2Var != wt2Var2) {
                    rc3 rc3Var = (rc3) this.z.get(this.u.y(mc3Var.t.j));
                    if (yf2.p((rc3Var == null || (set = (Set) rc3Var.x.j.getValue()) == null) ? null : Boolean.valueOf(set.contains(mc3Var)), Boolean.TRUE) || ((asVar = (as) this.m.get(mc3Var)) != null && asVar.g.get() == 0)) {
                        map.put(mc3Var, wt2Var3);
                    } else {
                        map.put(mc3Var, wt2Var2);
                    }
                }
                ad3 ad3Var4 = (ad3) cj0.l0(arrayList);
                if (ad3Var4 != null && ad3Var4.t.g == ad3Var2.t.g) {
                    hj0.c0(arrayList);
                }
                hj0.c0(arrayListA);
                dd3 dd3Var = ad3Var2.a;
                if (dd3Var != null) {
                    arrayListA.add(dd3Var);
                }
            } else if (arrayList.isEmpty() || ad3Var2.t.g != ((ad3) cj0.j0(arrayList)).t.g) {
                mc3Var.u = wt2.a;
                mc3Var.n();
            } else {
                ad3 ad3Var5 = (ad3) hj0.c0(arrayList);
                if (wt2Var == wt2Var2) {
                    mc3Var.u = wt2Var3;
                    mc3Var.n();
                } else if (wt2Var != wt2Var3) {
                    map.put(mc3Var, wt2Var3);
                }
                dd3 dd3Var2 = ad3Var5.a;
                if (dd3Var2 != null && !arrayList.contains(dd3Var2)) {
                    arrayList.add(dd3Var2);
                }
            }
        }
        int size = arrayListG0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListG0.get(i);
            i++;
            mc3 mc3Var2 = (mc3) obj;
            wt2 wt2Var4 = (wt2) map.get(mc3Var2);
            if (wt2Var4 != null) {
                mc3Var2.getClass();
                mc3Var2.u = wt2Var4;
                mc3Var2.n();
            } else {
                mc3Var2.n();
            }
        }
    }

    public final boolean i(int i, boolean z, boolean z2) {
        ad3 ad3Var;
        al alVar;
        dr drVar = this.x;
        if (drVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = cj0.y0(drVar).iterator();
        do {
            if (!it.hasNext()) {
                ad3Var = null;
                break;
            }
            ad3Var = ((mc3) it.next()).t;
            String str = ad3Var.j;
            alVar = ad3Var.t;
            sf3 sf3VarY = this.u.y(str);
            if (z || alVar.g != i) {
                arrayList.add(sf3VarY);
            }
        } while (alVar.g != i);
        if (ad3Var != null) {
            return r(arrayList, ad3Var, z, z2);
        }
        int i2 = ad3.q;
        oz5.y("Ignoring popBackStack to destination " + mq2.x(this.g.r, i) + " as it was not found on the current back stack");
        return false;
    }

    public final ad3 j() {
        mc3 mc3VarL = l();
        if (mc3VarL != null) {
            return mc3VarL.t;
        }
        return null;
    }

    public final mc3 l() {
        return (mc3) this.x.j();
    }

    public final dd3 m() {
        ad3 ad3Var;
        mc3 mc3Var = (mc3) this.x.j();
        if (mc3Var == null || (ad3Var = mc3Var.t) == null) {
            ad3Var = this.r;
            ad3Var.getClass();
        }
        dd3 dd3Var = ad3Var instanceof dd3 ? (dd3) ad3Var : null;
        if (dd3Var != null) {
            return dd3Var;
        }
        dd3 dd3Var2 = ad3Var.a;
        dd3Var2.getClass();
        return dd3Var2;
    }

    public final ad3 n(int i, ad3 ad3Var) {
        ad3 ad3Var2;
        dd3 dd3Var = this.r;
        if (dd3Var == null) {
            return null;
        }
        if (dd3Var.t.g == i) {
            if (ad3Var == null) {
                return dd3Var;
            }
            if (yf2.p(dd3Var, ad3Var) && ad3Var.a == null) {
                return this.r;
            }
        }
        mc3 mc3Var = (mc3) this.x.j();
        if (mc3Var == null || (ad3Var2 = mc3Var.t) == null) {
            ad3Var2 = this.r;
            ad3Var2.getClass();
        }
        return v(i, ad3Var2, ad3Var, false);
    }

    public final ArrayList p() {
        wt2 wt2Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.z.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            wt2Var = wt2.m;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((rc3) it.next()).x.j.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                mc3 mc3Var = (mc3) obj;
                if (!arrayList.contains(mc3Var) && mc3Var.u.compareTo(wt2Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            hj0.a0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.x) {
            mc3 mc3Var2 = (mc3) obj2;
            if (!arrayList.contains(mc3Var2) && mc3Var2.u.compareTo(wt2Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        hj0.a0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((mc3) obj3).t instanceof dd3)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void q(mc3 mc3Var, mc3 mc3Var2) {
        this.a.put(mc3Var, mc3Var2);
        LinkedHashMap linkedHashMap = this.m;
        if (linkedHashMap.get(mc3Var2) == null) {
            linkedHashMap.put(mc3Var2, new as());
        }
        Object obj = linkedHashMap.get(mc3Var2);
        obj.getClass();
        ((as) obj).g.incrementAndGet();
    }

    public final boolean r(ArrayList arrayList, ad3 ad3Var, boolean z, boolean z2) {
        boolean z3;
        q54 q54Var = new q54();
        dr drVar = new dr();
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (true) {
            if (i >= size) {
                z3 = z2;
                break;
            }
            int i2 = i + 1;
            sf3 sf3Var = (sf3) arrayList.get(i);
            q54 q54Var2 = new q54();
            mc3 mc3Var = (mc3) this.x.last();
            z3 = z2;
            tc3 tc3Var = new tc3(q54Var2, q54Var, this, z3, drVar);
            sf3Var.getClass();
            mc3Var.getClass();
            this.o = tc3Var;
            sf3Var.v(mc3Var, z3);
            this.o = null;
            if (!q54Var2.j) {
                break;
            }
            i = i2;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.q;
            if (!z) {
                Iterator it = new h25(dk4.L(ad3Var, new pc3((byte) 2)), new xy1(this) { // from class: uc3
                    public final /* synthetic */ vc3 t;

                    {
                        this.t = this;
                    }

                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        boolean zContainsKey;
                        byte b2 = b;
                        vc3 vc3Var = this.t;
                        ad3 ad3Var2 = (ad3) obj;
                        switch (b2) {
                            case 0:
                                ad3Var2.getClass();
                                zContainsKey = vc3Var.q.containsKey(Integer.valueOf(ad3Var2.t.g));
                                break;
                            default:
                                ad3Var2.getClass();
                                zContainsKey = vc3Var.q.containsKey(Integer.valueOf(ad3Var2.t.g));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, (byte) 0).iterator();
                while (true) {
                    ko1 ko1Var = (ko1) it;
                    if (!ko1Var.hasNext()) {
                        break;
                    }
                    Integer numValueOf = Integer.valueOf(((ad3) ko1Var.next()).t.g);
                    qc3 qc3Var = (qc3) drVar.x();
                    linkedHashMap.put(numValueOf, qc3Var != null ? (String) qc3Var.g.y : null);
                }
            }
            if (!drVar.isEmpty()) {
                cd cdVar = ((qc3) drVar.first()).g;
                String str = (String) cdVar.y;
                final byte b2 = 1;
                Iterator it2 = new h25(dk4.L(n(cdVar.g, null), new pc3((byte) 3)), new xy1(this) { // from class: uc3
                    public final /* synthetic */ vc3 t;

                    {
                        this.t = this;
                    }

                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        boolean zContainsKey;
                        byte b3 = b2;
                        vc3 vc3Var = this.t;
                        ad3 ad3Var2 = (ad3) obj;
                        switch (b3) {
                            case 0:
                                ad3Var2.getClass();
                                zContainsKey = vc3Var.q.containsKey(Integer.valueOf(ad3Var2.t.g));
                                break;
                            default:
                                ad3Var2.getClass();
                                zContainsKey = vc3Var.q.containsKey(Integer.valueOf(ad3Var2.t.g));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, (byte) 0).iterator();
                while (true) {
                    ko1 ko1Var2 = (ko1) it2;
                    if (!ko1Var2.hasNext()) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((ad3) ko1Var2.next()).t.g), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.w.put(str, drVar);
                }
            }
        }
        this.y.g();
        return q54Var.j;
    }

    public final dd3 t() {
        dd3 dd3Var = this.r;
        if (dd3Var != null) {
            dd3Var.getClass();
            return dd3Var;
        }
        l0.z("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final boolean u(int i, Bundle bundle, wd3 wd3Var) {
        ad3 ad3VarT;
        mc3 mc3Var;
        ad3 ad3Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.q;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (yf2.p((String) it.next(), str)) {
                it.remove();
            }
        }
        dr<qc3> drVar = (dr) ue5.o(this.w).remove(str);
        jq jqVar = this.g.r;
        ArrayList arrayList = new ArrayList();
        mc3 mc3Var2 = (mc3) this.x.j();
        if (mc3Var2 == null || (ad3VarT = mc3Var2.t) == null) {
            ad3VarT = t();
        }
        if (drVar != null) {
            for (qc3 qc3Var : drVar) {
                cd cdVar = qc3Var.g;
                cd cdVar2 = qc3Var.g;
                ad3 ad3VarV = v(cdVar.g, ad3VarT, null, true);
                if (ad3VarV == null) {
                    int i3 = ad3.q;
                    uo1.A("Restore State failed: destination ", mq2.x(jqVar, cdVar2.g), " cannot be found from the current destination ", ad3VarT);
                    return false;
                }
                wt2 wt2VarA = a();
                q64 q64Var = this.i;
                jqVar.getClass();
                wt2VarA.getClass();
                Bundle bundle3 = (Bundle) cdVar2.r;
                if (bundle3 != null) {
                    Context context = jqVar.j;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new mc3(jqVar, ad3VarV, bundle2, wt2VarA, q64Var, (String) cdVar2.y, (Bundle) cdVar2.n));
                ad3VarT = ad3VarV;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((mc3) obj).t instanceof dd3)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            mc3 mc3Var3 = (mc3) obj2;
            List list = (List) cj0.s0(arrayList2);
            if (yf2.p((list == null || (mc3Var = (mc3) cj0.r0(list)) == null || (ad3Var = mc3Var.t) == null) ? null : ad3Var.j, mc3Var3.t.j)) {
                list.add(mc3Var3);
            } else {
                arrayList2.add(pw5.A(mc3Var3));
            }
        }
        q54 q54Var = new q54();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            sf3 sf3VarY = this.u.y(((mc3) cj0.j0(list2)).t.j);
            ArrayList arrayList4 = arrayList;
            this.h = new qc(q54Var, arrayList4, new s54(), this, bundle, (byte) 7);
            sf3VarY.n(list2, wd3Var);
            this.h = null;
            arrayList = arrayList4;
        }
        return q54Var.j;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0290  */
    /* JADX WARN: Code duplicated, block: B:124:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[LOOP:7: B:94:0x0262->B:143:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5 A[LOOP:4: B:72:0x019d->B:74:0x01a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0204  */
    /* JADX WARN: Code duplicated, block: B:85:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0234  */
    /* JADX WARN: Code duplicated, block: B:96:0x0268 A[Catch: all -> 0x027d, TryCatch #0 {all -> 0x027d, blocks: (B:93:0x024c, B:94:0x0262, B:96:0x0268, B:98:0x0278, B:102:0x0280), top: B:124:0x024c }] */
    public final void w(ad3 ad3Var, Bundle bundle, wd3 wd3Var) {
        boolean z;
        boolean z2;
        int iNextIndex;
        ad3 ad3Var2;
        dr<mc3> drVar;
        sf3 sf3VarY;
        ad3 ad3Var3;
        rc3 rc3VarY;
        ListIterator listIterator;
        int iNextIndex2;
        dd3 dd3Var;
        boolean zI;
        Object objPrevious;
        boolean zY;
        ad3Var.getClass();
        Iterator it = this.z.values().iterator();
        while (it.hasNext()) {
            ((rc3) it.next()).n = true;
        }
        q54 q54Var = new q54();
        if (wd3Var == null) {
            z = false;
        } else {
            if (wd3Var.y() != null) {
                String strY = wd3Var.y();
                strY.getClass();
                boolean zR = wd3Var.r();
                boolean zV = wd3Var.v();
                dr drVar2 = this.x;
                if (drVar2.isEmpty()) {
                    zI = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator2 = drVar2.listIterator(drVar2.g());
                    do {
                        if (!listIterator2.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator2.previous();
                        mc3 mc3Var = (mc3) objPrevious;
                        zY = mc3Var.t.y(strY, mc3Var.g());
                        if (zR || !zY) {
                            arrayList.add(this.u.y(mc3Var.t.j));
                        }
                    } while (!zY);
                    mc3 mc3Var2 = (mc3) objPrevious;
                    ad3 ad3Var4 = mc3Var2 != null ? mc3Var2.t : null;
                    if (ad3Var4 == null) {
                        oz5.y("Ignoring popBackStack to route " + strY + " as it was not found on the current back stack");
                        zI = false;
                    } else {
                        zI = r(arrayList, ad3Var4, zR, zV);
                    }
                }
            } else if (wd3Var.g() != -1) {
                zI = i(wd3Var.g(), wd3Var.r(), wd3Var.v());
            } else {
                z = false;
            }
            z = zI;
        }
        Bundle bundleG = ad3Var.g(bundle);
        if (wd3Var != null && wd3Var.x() && this.q.containsKey(Integer.valueOf(ad3Var.t.g))) {
            q54Var.j = u(ad3Var.t.g, bundleG, wd3Var);
            z2 = false;
        } else {
            if (wd3Var == null || !wd3Var.n()) {
                z2 = false;
            } else {
                mc3 mc3VarL = l();
                dr drVar3 = this.x;
                ListIterator listIterator3 = drVar3.listIterator(drVar3.g());
                while (true) {
                    if (listIterator3.hasPrevious()) {
                        if (((mc3) listIterator3.previous()).t == ad3Var) {
                            iNextIndex = listIterator3.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z2 = false;
                } else if (ad3Var instanceof dd3) {
                    int i = dd3.c;
                    List listO = dk4.O(new h25(dk4.L((dd3) ad3Var, new m92((byte) 20)), new m92((byte) 18), (byte) 1));
                    if (this.x.a - iNextIndex == listO.size()) {
                        dr drVar4 = this.x;
                        List listSubList = drVar4.subList(iNextIndex, drVar4.a);
                        ArrayList arrayList2 = new ArrayList(dj0.Y(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf(((mc3) it2.next()).t.t.g));
                        }
                        if (arrayList2.equals(listO)) {
                            drVar = new dr();
                            while (pw5.u(this.x) >= iNextIndex) {
                                mc3 mc3Var3 = (mc3) hj0.d0(this.x);
                                z(mc3Var3);
                                mc3 mc3Var4 = new mc3(mc3Var3.j, mc3Var3.t, mc3Var3.t.g(bundle), mc3Var3.m, mc3Var3.q, mc3Var3.w, mc3Var3.c);
                                wt2 wt2Var = mc3Var3.m;
                                wt2Var.getClass();
                                mc3Var4.m = wt2Var;
                                wt2 wt2Var2 = mc3Var3.u;
                                wt2Var2.getClass();
                                mc3Var4.u = wt2Var2;
                                mc3Var4.n();
                                drVar.addFirst(mc3Var4);
                            }
                            for (mc3 mc3Var5 : drVar) {
                                dd3Var = mc3Var5.t.a;
                                if (dd3Var != null) {
                                    q(mc3Var5, x(dd3Var.t.g));
                                }
                                this.x.addLast(mc3Var5);
                            }
                            for (mc3 mc3Var6 : drVar) {
                                sf3VarY = this.u.y(mc3Var6.t.j);
                                ad3Var3 = mc3Var6.t;
                                if (ad3Var3 == null) {
                                    ad3Var3 = null;
                                }
                                if (ad3Var3 == null) {
                                    gb6.y(new m92((byte) 24));
                                    sf3VarY.r(ad3Var3);
                                    rc3VarY = sf3VarY.y();
                                    synchronized (rc3VarY.g) {
                                        try {
                                            ArrayList arrayListG0 = cj0.G0((Collection) rc3VarY.v.j.getValue());
                                            listIterator = arrayListG0.listIterator(arrayListG0.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (((mc3) listIterator.previous()).w.equals(mc3Var6.w)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListG0.set(iNextIndex2, mc3Var6);
                                            rc3VarY.y.m(null, arrayListG0);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else if (mc3VarL == null || (ad3Var2 = mc3VarL.t) == null || ad3Var.t.g != ad3Var2.t.g) {
                    z2 = false;
                } else {
                    drVar = new dr();
                    while (pw5.u(this.x) >= iNextIndex) {
                        mc3 mc3Var7 = (mc3) hj0.d0(this.x);
                        z(mc3Var7);
                        mc3 mc3Var8 = new mc3(mc3Var7.j, mc3Var7.t, mc3Var7.t.g(bundle), mc3Var7.m, mc3Var7.q, mc3Var7.w, mc3Var7.c);
                        wt2 wt2Var3 = mc3Var7.m;
                        wt2Var3.getClass();
                        mc3Var8.m = wt2Var3;
                        wt2 wt2Var4 = mc3Var7.u;
                        wt2Var4.getClass();
                        mc3Var8.u = wt2Var4;
                        mc3Var8.n();
                        drVar.addFirst(mc3Var8);
                    }
                    while (r0.hasNext()) {
                        dd3Var = mc3Var5.t.a;
                        if (dd3Var != null) {
                            q(mc3Var5, x(dd3Var.t.g));
                        }
                        this.x.addLast(mc3Var5);
                    }
                    while (r0.hasNext()) {
                        sf3VarY = this.u.y(mc3Var6.t.j);
                        ad3Var3 = mc3Var6.t;
                        if (ad3Var3 == null) {
                            ad3Var3 = null;
                        }
                        if (ad3Var3 == null) {
                            gb6.y(new m92((byte) 24));
                            sf3VarY.r(ad3Var3);
                            rc3VarY = sf3VarY.y();
                            synchronized (rc3VarY.g) {
                                ArrayList arrayListG1 = cj0.G0((Collection) rc3VarY.v.j.getValue());
                                listIterator = arrayListG1.listIterator(arrayListG1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (((mc3) listIterator.previous()).w.equals(mc3Var6.w)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListG1.set(iNextIndex2, mc3Var6);
                                rc3VarY.y.m(null, arrayListG1);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                mc3 mc3VarG = d52.g(this.g.r, ad3Var, bundleG, a(), this.i);
                sf3 sf3VarY2 = this.u.y(ad3Var.j);
                List listK = pw5.k(mc3VarG);
                this.h = new cc2(q54Var, this, ad3Var, bundleG, (byte) 2);
                sf3VarY2.n(listK, wd3Var);
                this.h = null;
            }
        }
        this.y.g();
        Iterator it3 = this.z.values().iterator();
        while (it3.hasNext()) {
            ((rc3) it3.next()).n = false;
        }
        if (z || q54Var.j || z2) {
            y();
        } else {
            h();
        }
    }

    public final mc3 x(int i) {
        Object objPrevious;
        dr drVar = this.x;
        ListIterator<E> listIterator = drVar.listIterator(drVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((mc3) objPrevious).t.t.g != i);
        mc3 mc3Var = (mc3) objPrevious;
        if (mc3Var != null) {
            return mc3Var;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + j()).toString());
    }

    public final boolean y() {
        dr drVar;
        while (true) {
            drVar = this.x;
            if (drVar.isEmpty() || !(((mc3) drVar.last()).t instanceof dd3)) {
                break;
            }
            s(this, (mc3) drVar.last());
        }
        mc3 mc3Var = (mc3) drVar.j();
        ArrayList arrayList = this.d;
        if (mc3Var != null) {
            arrayList.add(mc3Var);
        }
        this.k++;
        h();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            ArrayList arrayListG0 = cj0.G0(arrayList);
            arrayList.clear();
            int size = arrayListG0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListG0.get(i2);
                i2++;
                mc3 mc3Var2 = (mc3) obj;
                Iterator it = cj0.F0(this.b).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        uo1.B();
                        return false;
                    }
                    ad3 ad3Var = mc3Var2.t;
                    mc3Var2.g();
                    throw null;
                }
                this.e.p(mc3Var2);
            }
            ArrayList arrayList2 = new ArrayList(drVar);
            ew4 ew4Var = this.l;
            ew4Var.getClass();
            ew4Var.m(null, arrayList2);
            ArrayList arrayListP = p();
            ew4 ew4Var2 = this.j;
            ew4Var2.getClass();
            ew4Var2.m(null, arrayListP);
        }
        return mc3Var != null;
    }

    public final void z(mc3 mc3Var) {
        mc3Var.getClass();
        mc3 mc3Var2 = (mc3) this.a.remove(mc3Var);
        if (mc3Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.m;
        as asVar = (as) linkedHashMap.get(mc3Var2);
        Integer numValueOf = asVar != null ? Integer.valueOf(asVar.g.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            rc3 rc3Var = (rc3) this.z.get(this.u.y(mc3Var2.t.j));
            if (rc3Var != null) {
                rc3Var.r(mc3Var2);
            }
            linkedHashMap.remove(mc3Var2);
        }
    }
}
