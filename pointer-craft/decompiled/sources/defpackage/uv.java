package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uv extends oj3 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv(Object obj, byte b) {
        super(false);
        this.n = b;
        this.v = obj;
    }

    @Override // defpackage.oj3
    public void g() {
        byte b = this.n;
        Object obj = this.v;
        switch (b) {
            case 0:
                ((vv) obj).v();
                break;
            case 1:
                kx1 kx1Var = (kx1) obj;
                if (kx1.N(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + kx1Var);
                }
                kx1Var.n();
                break;
        }
    }

    @Override // defpackage.oj3
    public void n(sv svVar) {
        byte b = this.n;
        Object obj = this.v;
        switch (b) {
            case 0:
                ((vv) obj).j();
                break;
            case 1:
                kx1 kx1Var = (kx1) obj;
                if (kx1.N(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + kx1Var);
                }
                kx1Var.k();
                kx1Var.d(new jx1(kx1Var), false);
                break;
        }
    }

    @Override // defpackage.oj3
    public void r(sv svVar) {
        byte b = this.n;
        Object obj = this.v;
        switch (b) {
            case 0:
                ((vv) obj).l(svVar);
                return;
            case 1:
                kx1 kx1Var = (kx1) obj;
                if (kx1.N(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + kx1Var);
                }
                if (kx1Var.j != null) {
                    for (r31 r31Var : kx1Var.l(new ArrayList(Collections.singletonList(kx1Var.j)), 0, 1)) {
                        r31Var.getClass();
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + svVar.g());
                        }
                        ArrayList arrayList = r31Var.r;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            hj0.a0(arrayList2, ((qu4) obj2).m);
                        }
                        List listF0 = cj0.F0(cj0.J0(arrayList2));
                        int size2 = listF0.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((pu4) listF0.get(i2)).v(svVar, r31Var.g);
                        }
                    }
                    Iterator it = kx1Var.c.iterator();
                    if (it.hasNext()) {
                        fj.w(it.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.oj3
    public final void y() {
        byte b = this.n;
        Object obj = this.v;
        switch (b) {
            case 0:
                ((vv) obj).x();
                return;
            case 1:
                kx1 kx1Var = (kx1) obj;
                if (kx1.N(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + kx1Var);
                }
                uv uvVar = kx1Var.a;
                ArrayList arrayList = kx1Var.c;
                kx1Var.t = true;
                kx1Var.A(true);
                int i = 0;
                kx1Var.t = false;
                if (kx1Var.j == null) {
                    if (uvVar.y) {
                        if (kx1.N(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        kx1Var.W();
                        return;
                    } else {
                        if (kx1.N(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        kx1Var.l.y().g();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(kx1.I(kx1Var.j));
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        fj.w(obj2);
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = kx1Var.j.g;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    pw1 pw1Var = ((wx1) obj3).y;
                    if (pw1Var != null) {
                        pw1Var.z = false;
                    }
                }
                for (r31 r31Var : kx1Var.l(new ArrayList(Collections.singletonList(kx1Var.j)), 0, 1)) {
                    ArrayList arrayList3 = r31Var.r;
                    if (kx1.N(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    r31Var.m(arrayList3);
                    r31Var.r(arrayList3);
                }
                ArrayList arrayList4 = kx1Var.j.g;
                int size3 = arrayList4.size();
                while (i < size3) {
                    Object obj4 = arrayList4.get(i);
                    i++;
                    pw1 pw1Var2 = ((wx1) obj4).y;
                    if (pw1Var2 != null && pw1Var2.N == null) {
                        kx1Var.j(pw1Var2).m();
                    }
                }
                kx1Var.j = null;
                kx1Var.l0();
                if (kx1.N(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + uvVar.y + " for  FragmentManager " + kx1Var);
                    return;
                }
                return;
            default:
                ((jd3) obj).x();
                return;
        }
    }
}
