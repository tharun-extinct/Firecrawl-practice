package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class r31 {
    public final ViewGroup g;
    public boolean n;
    public final ArrayList r;
    public boolean v;
    public boolean x;
    public final ArrayList y;

    public r31(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.g = viewGroup;
        this.y = new ArrayList();
        this.r = new ArrayList();
    }

    public static boolean a(ArrayList arrayList) {
        boolean z;
        Object obj;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (true) {
                if (i >= size) {
                    break loop0;
                }
                Object obj2 = arrayList.get(i);
                i++;
                qu4 qu4Var = (qu4) obj2;
                if (!qu4Var.m.isEmpty()) {
                    ArrayList arrayList2 = qu4Var.m;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        do {
                            if (i2 >= size2) {
                                break;
                            }
                            obj = arrayList2.get(i2);
                            i2++;
                        } while (((pu4) obj).y());
                    } else {
                        break;
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                hj0.a0(arrayList3, ((qu4) obj3).m);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final r31 t(ViewGroup viewGroup, kx1 kx1Var) {
        viewGroup.getClass();
        kx1Var.getClass();
        kx1Var.L().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof r31) {
            return (r31) tag;
        }
        r31 r31Var = new r31(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, r31Var);
        return r31Var;
    }

    public final void g(qu4 qu4Var) {
        qu4Var.getClass();
        if (qu4Var.t) {
            qu4Var.g.g(qu4Var.r.O(), this.g);
            qu4Var.t = false;
        }
    }

    public final void j() {
        String str;
        String str2;
        if (kx1.N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.g.isAttachedToWindow();
        synchronized (this.y) {
            try {
                q();
                m(this.y);
                ArrayList arrayList = new ArrayList(this.r);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((qu4) obj).l = false;
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    qu4 qu4Var = (qu4) obj2;
                    if (kx1.N(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.g + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + qu4Var);
                    }
                    qu4Var.g(this.g);
                }
                ArrayList arrayList2 = new ArrayList(this.y);
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    ((qu4) obj3).l = false;
                }
                int size4 = arrayList2.size();
                while (i < size4) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    qu4 qu4Var2 = (qu4) obj4;
                    if (kx1.N(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.g + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + qu4Var2);
                    }
                    qu4Var2.g(this.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qu4 l(pw1 pw1Var) {
        Object obj;
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            qu4 qu4Var = (qu4) obj;
            if (qu4Var.r.equals(pw1Var) && !qu4Var.v) {
                return (qu4) obj;
            }
        }
        obj = null;
        return (qu4) obj;
    }

    public final void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qu4 qu4Var = (qu4) arrayList.get(i);
            tx1 tx1Var = qu4Var.q;
            pw1 pw1Var = tx1Var.r;
            if (!qu4Var.j) {
                qu4Var.j = true;
                ru4 ru4Var = qu4Var.y;
                if (ru4Var == ru4.t) {
                    View viewFindFocus = pw1Var.O.findFocus();
                    if (viewFindFocus != null) {
                        pw1Var.v().m = viewFindFocus;
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + pw1Var);
                        }
                    }
                    View viewO = qu4Var.r.O();
                    if (viewO.getParent() == null) {
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "Adding fragment " + pw1Var + " view " + viewO + " to container in onStart");
                        }
                        tx1Var.y();
                        viewO.setAlpha(0.0f);
                    }
                    if (viewO.getAlpha() == 0.0f && viewO.getVisibility() == 0) {
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "Making view " + viewO + " INVISIBLE in onStart");
                        }
                        viewO.setVisibility(4);
                    }
                    mw1 mw1Var = pw1Var.R;
                    viewO.setAlpha(mw1Var == null ? 1.0f : mw1Var.a);
                    if (kx1.N(2)) {
                        mw1 mw1Var2 = pw1Var.R;
                        Log.v("FragmentManager", "Setting view alpha to " + (mw1Var2 != null ? mw1Var2.a : 1.0f) + " in onStart");
                    }
                } else if (ru4Var == ru4.a) {
                    View viewO2 = pw1Var.O();
                    if (kx1.N(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewO2.findFocus() + " on view " + viewO2 + " for Fragment " + pw1Var);
                    }
                    viewO2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            hj0.a0(arrayList2, ((qu4) obj).m);
        }
        List listF0 = cj0.F0(cj0.J0(arrayList2));
        int size3 = listF0.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((pu4) listF0.get(i3)).l(this.g);
        }
    }

    public final void n(su4 su4Var, ru4 ru4Var, tx1 tx1Var) {
        synchronized (this.y) {
            try {
                qu4 qu4VarX = x(tx1Var.r);
                if (qu4VarX == null) {
                    pw1 pw1Var = tx1Var.r;
                    qu4VarX = (pw1Var.z || pw1Var.u) ? l(pw1Var) : null;
                }
                if (qu4VarX != null) {
                    qu4VarX.n(su4Var, ru4Var);
                    return;
                }
                qu4 qu4Var = new qu4(su4Var, ru4Var, tx1Var);
                this.y.add(qu4Var);
                qu4Var.n.add(new k31(this, qu4Var, (byte) 1));
                qu4Var.n.add(new k31(this, qu4Var, (byte) 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qu4 qu4Var = (qu4) obj;
            if (qu4Var.y == ru4.t) {
                int visibility = qu4Var.r.O().getVisibility();
                su4.j.getClass();
                qu4Var.n(d93.p(visibility), ru4.j);
            }
        }
    }

    public final void r(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hj0.a0(arrayList2, ((qu4) obj).m);
        }
        List listF0 = cj0.F0(cj0.J0(arrayList2));
        int size2 = listF0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((pu4) listF0.get(i2)).n(this.g);
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            g((qu4) arrayList.get(i3));
        }
        List listF1 = cj0.F0(arrayList);
        int size4 = listF1.size();
        for (int i4 = 0; i4 < size4; i4++) {
            qu4 qu4Var = (qu4) listF1.get(i4);
            if (qu4Var.m.isEmpty()) {
                qu4Var.y();
            }
        }
    }

    public final void v() {
        boolean z;
        if (this.x) {
            return;
        }
        if (!this.g.isAttachedToWindow()) {
            j();
            this.v = false;
            return;
        }
        synchronized (this.y) {
            try {
                ArrayList arrayList = new ArrayList(this.r);
                this.r.clear();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    qu4 qu4Var = (qu4) obj;
                    if (this.y.isEmpty() || !qu4Var.r.z) {
                        z = false;
                    }
                    qu4Var.l = z;
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    qu4 qu4Var2 = (qu4) obj2;
                    if (this.n) {
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + qu4Var2);
                        }
                        qu4Var2.y();
                    } else {
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + qu4Var2);
                        }
                        qu4Var2.g(this.g);
                    }
                    this.n = false;
                    if (!qu4Var2.x) {
                        this.r.add(qu4Var2);
                    }
                }
                if (!this.y.isEmpty()) {
                    q();
                    ArrayList arrayList2 = new ArrayList(this.y);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.y.clear();
                    this.r.addAll(arrayList2);
                    if (kx1.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    y(arrayList2, this.v);
                    boolean zA = a(arrayList2);
                    int size3 = arrayList2.size();
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < size3) {
                        Object obj3 = arrayList2.get(i3);
                        i3++;
                        if (!((qu4) obj3).r.z) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zA) {
                        z = false;
                    }
                    this.n = z;
                    if (kx1.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zA + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        m(arrayList2);
                        r(arrayList2);
                    } else if (zA) {
                        m(arrayList2);
                        int size4 = arrayList2.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            g((qu4) arrayList2.get(i4));
                        }
                    }
                    this.v = false;
                    if (kx1.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qu4 x(pw1 pw1Var) {
        Object obj;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            qu4 qu4Var = (qu4) obj;
            if (qu4Var.r.equals(pw1Var) && !qu4Var.v) {
                return (qu4) obj;
            }
        }
        obj = null;
        return (qu4) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(ArrayList arrayList, boolean z) {
        su4 su4Var;
        d93 d93Var;
        Object obj;
        Object obj2;
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size = arrayList.size();
        int i = 0;
        Object[] objArr = 0;
        int i2 = 0;
        while (true) {
            su4Var = su4.a;
            d93Var = su4.j;
            obj = null;
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i2);
            i2++;
            qu4 qu4Var = (qu4) obj2;
            View view = qu4Var.r.O;
            view.getClass();
            d93Var.getClass();
            if (d93.s(view) == su4Var && qu4Var.g != su4Var) {
                break;
            }
        }
        qu4 qu4Var2 = (qu4) obj2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            qu4 qu4Var3 = (qu4) objPrevious;
            View view2 = qu4Var3.r.O;
            view2.getClass();
            d93Var.getClass();
            if (d93.s(view2) != su4Var && qu4Var3.g == su4Var) {
                obj = objPrevious;
                break;
            }
        }
        qu4 qu4Var4 = (qu4) obj;
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Executing operations from " + qu4Var2 + " to " + qu4Var4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        pw1 pw1Var = ((qu4) cj0.r0(arrayList)).r;
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList.get(i3);
            i3++;
            mw1 mw1Var = ((qu4) obj3).r.R;
            mw1 mw1Var2 = pw1Var.R;
            mw1Var.y = mw1Var2.y;
            mw1Var.r = mw1Var2.r;
            mw1Var.n = mw1Var2.n;
            mw1Var.v = mw1Var2.v;
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj4 = arrayList.get(i4);
            i4++;
            qu4 qu4Var5 = (qu4) obj4;
            arrayList2.add(new n31(qu4Var5, z));
            arrayList3.add(new q31(qu4Var5));
            qu4Var5.n.add(new k31(this, qu4Var5, objArr == true ? 1 : 0));
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj5 = arrayList3.get(i5);
            i5++;
            if (!((q31) obj5).x()) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj6 = arrayList4.get(i6);
            i6++;
            ((q31) obj6).getClass();
        }
        int size6 = arrayList5.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj7 = arrayList5.get(i7);
            i7++;
            ((q31) obj7).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int size7 = arrayList2.size();
        int i8 = 0;
        while (i8 < size7) {
            Object obj8 = arrayList2.get(i8);
            i8++;
            hj0.a0(arrayList7, ((qu4) ((n31) obj8).g).m);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        int size8 = arrayList2.size();
        boolean z2 = false;
        int i9 = 0;
        while (i9 < size8) {
            Object obj9 = arrayList2.get(i9);
            i9++;
            n31 n31Var = (n31) obj9;
            Context context = this.g.getContext();
            qu4 qu4Var6 = (qu4) n31Var.g;
            context.getClass();
            rk4 rk4VarU = n31Var.u(context);
            if (rk4VarU != null) {
                if (((AnimatorSet) rk4VarU.a) == null) {
                    arrayList6.add(n31Var);
                } else {
                    pw1 pw1Var2 = qu4Var6.r;
                    if (qu4Var6.m.isEmpty()) {
                        if (qu4Var6.g == su4.m) {
                            qu4Var6.t = false;
                        }
                        qu4Var6.a.add(new p31(n31Var));
                        z2 = true;
                    } else if (kx1.N(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + pw1Var2 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size9 = arrayList6.size();
        while (i < size9) {
            Object obj10 = arrayList6.get(i);
            i++;
            n31 n31Var2 = (n31) obj10;
            qu4 qu4Var7 = (qu4) n31Var2.g;
            pw1 pw1Var3 = qu4Var7.r;
            if (zIsEmpty) {
                if (!z2) {
                    qu4Var7.a.add(new m31(n31Var2));
                } else if (kx1.N(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + pw1Var3 + " as Animations cannot run alongside Animators.");
                }
            } else if (kx1.N(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + pw1Var3 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
