package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class lc5 implements Cloneable {
    public static final Animator[] F = new Animator[0];
    public static final int[] G = {2, 1, 3, 4};
    public static final d52 H = new d52(17);
    public static final ThreadLocal I = new ThreadLocal();
    public long D;
    public long E;
    public ArrayList p;
    public ArrayList u;
    public ic5[] z;
    public final String j = getClass().getName();
    public long t = -1;
    public long a = -1;
    public TimeInterpolator m = null;
    public final ArrayList q = new ArrayList();
    public final ArrayList w = new ArrayList();
    public kb5 c = new kb5((byte) 7);
    public kb5 i = new kb5((byte) 7);
    public au b = null;
    public final int[] s = G;
    public final ArrayList h = new ArrayList();
    public Animator[] o = F;
    public int f = 0;
    public boolean k = false;
    public boolean d = false;
    public lc5 e = null;
    public ArrayList A = null;
    public ArrayList B = new ArrayList();
    public d52 C = H;

    public static mr b() {
        ThreadLocal threadLocal = I;
        mr mrVar = (mr) threadLocal.get();
        if (mrVar != null) {
            return mrVar;
        }
        mr mrVar2 = new mr(0);
        threadLocal.set(mrVar2);
        return mrVar2;
    }

    public static boolean o(zc5 zc5Var, zc5 zc5Var2, String str) {
        Object obj = zc5Var.g.get(str);
        Object obj2 = zc5Var2.g.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void y(kb5 kb5Var, View view, zc5 zc5Var) {
        mr mrVar = (mr) kb5Var.j;
        mr mrVar2 = (mr) kb5Var.m;
        SparseArray sparseArray = (SparseArray) kb5Var.t;
        uy2 uy2Var = (uy2) kb5Var.a;
        mrVar.put(view, zc5Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = xk5.g;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (mrVar2.containsKey(transitionName)) {
                mrVar2.put(transitionName, null);
            } else {
                mrVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (uy2Var.r(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    uy2Var.v(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) uy2Var.y(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    uy2Var.v(itemIdAtPosition, null);
                }
            }
        }
    }

    public void A(View view) {
        if (this.k) {
            if (!this.d) {
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = F;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                f(this, up.w, false);
            }
            this.k = false;
        }
    }

    public void B() {
        J();
        mr mrVarB = b();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (mrVarB.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new p62(this, mrVarB, (byte) 2));
                    long j = this.a;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.t;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.m;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new m3((Object) this, (byte) 4));
                    animator.start();
                }
            }
        }
        this.B.clear();
        w();
    }

    public void C(long j, long j2) {
        long j3 = this.D;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.d = false;
            f(this, up.t, z);
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = F;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            dc5.y(animator, Math.min(Math.max(0L, j), dc5.g(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.o = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.d = true;
        }
        f(this, up.a, z);
    }

    public void D(long j) {
        this.a = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.m = timeInterpolator;
    }

    public void G(d52 d52Var) {
        if (d52Var == null) {
            this.C = H;
        } else {
            this.C = d52Var;
        }
    }

    public void I(long j) {
        this.t = j;
    }

    public final void J() {
        if (this.f == 0) {
            f(this, up.t, false);
            this.d = false;
        }
        this.f++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.a != -1) {
            sb.append("dur(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.t != -1) {
            sb.append("dly(");
            sb.append(this.t);
            sb.append(") ");
        }
        if (this.m != null) {
            sb.append("interp(");
            sb.append(this.m);
            sb.append(") ");
        }
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.w;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lc5 clone() {
        try {
            lc5 lc5Var = (lc5) super.clone();
            lc5Var.B = new ArrayList();
            lc5Var.c = new kb5((byte) 7);
            lc5Var.i = new kb5((byte) 7);
            lc5Var.p = null;
            lc5Var.u = null;
            lc5Var.e = this;
            lc5Var.A = null;
            return lc5Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final zc5 c(View view, boolean z) {
        au auVar = this.b;
        if (auVar != null) {
            return auVar.c(view, z);
        }
        ArrayList arrayList = z ? this.p : this.u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            zc5 zc5Var = (zc5) arrayList.get(i);
            if (zc5Var == null) {
                return null;
            }
            if (zc5Var.y == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (zc5) (z ? this.u : this.p).get(i);
        }
        return null;
    }

    public void d() {
        mr mrVarB = b();
        this.D = 0L;
        int i = 0;
        while (true) {
            int size = this.B.size();
            ArrayList arrayList = this.B;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            ac5 ac5Var = (ac5) mrVarB.get(animator);
            if (animator != null && ac5Var != null) {
                Animator animator2 = ac5Var.x;
                long j = this.a;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.t;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.m;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.h.add(animator);
                this.D = Math.max(this.D, dc5.g(animator));
            }
            i++;
        }
    }

    public lc5 e(ic5 ic5Var) {
        lc5 lc5Var;
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            if (!arrayList.remove(ic5Var) && (lc5Var = this.e) != null) {
                lc5Var.e(ic5Var);
            }
            if (this.A.size() == 0) {
                this.A = null;
            }
        }
        return this;
    }

    public final void f(lc5 lc5Var, up upVar, boolean z) {
        lc5 lc5Var2 = this.e;
        if (lc5Var2 != null) {
            lc5Var2.f(lc5Var, upVar, z);
        }
        ArrayList arrayList = this.A;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.A.size();
        ic5[] ic5VarArr = this.z;
        if (ic5VarArr == null) {
            ic5VarArr = new ic5[size];
        }
        this.z = null;
        ic5[] ic5VarArr2 = (ic5[]) this.A.toArray(ic5VarArr);
        for (int i = 0; i < size; i++) {
            upVar.w(ic5VarArr2[i], lc5Var, z);
            ic5VarArr2[i] = null;
        }
        this.z = ic5VarArr2;
    }

    public void g(ic5 ic5Var) {
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A = arrayList;
        }
        arrayList.add(ic5Var);
    }

    public final boolean h(View view) {
        int id = view.getId();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.w;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final lc5 i() {
        au auVar = this.b;
        return auVar != null ? auVar.i() : this;
    }

    public final void j(ViewGroup viewGroup, boolean z) {
        t(z);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.w;
        if (size <= 0 && arrayList2.size() <= 0) {
            v(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                zc5 zc5Var = new zc5(viewFindViewById);
                if (z) {
                    l(zc5Var);
                } else {
                    n(zc5Var);
                }
                zc5Var.r.add(this);
                x(zc5Var);
                if (z) {
                    y(this.c, viewFindViewById, zc5Var);
                } else {
                    y(this.i, viewFindViewById, zc5Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            zc5 zc5Var2 = new zc5(view);
            if (z) {
                l(zc5Var2);
            } else {
                n(zc5Var2);
            }
            zc5Var2.r.add(this);
            x(zc5Var2);
            if (z) {
                y(this.c, view, zc5Var2);
            } else {
                y(this.i, view, zc5Var2);
            }
        }
    }

    public void k(ViewGroup viewGroup) {
        if (this.d) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = F;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        f(this, up.q, false);
        this.k = true;
    }

    public void l(zc5 zc5Var) {
        uc0.L(zc5Var);
    }

    public Animator m(ViewGroup viewGroup, zc5 zc5Var, zc5 zc5Var2) {
        return null;
    }

    public void n(zc5 zc5Var) {
        uc0.L(zc5Var);
    }

    public final zc5 p(View view, boolean z) {
        au auVar = this.b;
        if (auVar != null) {
            return auVar.p(view, z);
        }
        return (zc5) ((mr) (z ? this.c : this.i).j).get(view);
    }

    public void q(ViewGroup viewGroup, kb5 kb5Var, kb5 kb5Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        zc5 zc5Var;
        zc5 zc5Var2;
        lc5 lc5Var = this;
        mr mrVarB = b();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        lc5Var.i().getClass();
        for (int i = 0; i < size; i++) {
            zc5 zc5Var3 = (zc5) arrayList.get(i);
            zc5 zc5Var4 = (zc5) arrayList2.get(i);
            if (zc5Var3 != null && !zc5Var3.r.contains(lc5Var)) {
                zc5Var3 = null;
            }
            if (zc5Var4 != null && !zc5Var4.r.contains(lc5Var)) {
                zc5Var4 = null;
            }
            if ((zc5Var3 != null || zc5Var4 != null) && (zc5Var3 == null || zc5Var4 == null || lc5Var.z(zc5Var3, zc5Var4))) {
                Animator animatorM = lc5Var.m(viewGroup, zc5Var3, zc5Var4);
                if (animatorM != null) {
                    String str = lc5Var.j;
                    if (zc5Var4 != null) {
                        view = zc5Var4.y;
                        String[] strArrS = lc5Var.s();
                        if (strArrS != null && strArrS.length > 0) {
                            zc5Var2 = new zc5(view);
                            zc5 zc5Var5 = (zc5) ((mr) kb5Var2.j).get(view);
                            if (zc5Var5 != null) {
                                int i2 = 0;
                                while (i2 < strArrS.length) {
                                    String str2 = strArrS[i2];
                                    zc5Var2.g.put(str2, zc5Var5.g.get(str2));
                                    i2++;
                                    strArrS = strArrS;
                                    animatorM = animatorM;
                                }
                            }
                            animator = animatorM;
                            int i3 = mrVarB.a;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ac5 ac5Var = (ac5) mrVarB.get((Animator) mrVarB.x(i4));
                                if (ac5Var.r != null && ac5Var.g == view && ac5Var.y.equals(str) && ac5Var.r.equals(zc5Var2)) {
                                    animator = null;
                                    break;
                                }
                            }
                        } else {
                            animator = animatorM;
                            zc5Var2 = null;
                        }
                        zc5Var = zc5Var2;
                    } else {
                        animator = animatorM;
                        view = zc5Var3.y;
                        zc5Var = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        lc5Var = this;
                        mrVarB.put(animator2, new ac5(view2, str, lc5Var, viewGroup.getWindowId(), zc5Var, animator2));
                        lc5Var.B.add(animator2);
                    } else {
                        lc5Var = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                ac5 ac5Var2 = (ac5) mrVarB.get((Animator) lc5Var.B.get(sparseIntArray.keyAt(i5)));
                ac5Var2.x.setStartDelay(ac5Var2.x.getStartDelay() + (((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE));
            }
        }
    }

    public void r() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = F;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        f(this, up.m, false);
    }

    public String[] s() {
        return null;
    }

    public final void t(boolean z) {
        if (z) {
            ((mr) this.c.j).clear();
            ((SparseArray) this.c.t).clear();
            ((uy2) this.c.a).g();
        } else {
            ((mr) this.i.j).clear();
            ((SparseArray) this.i.t).clear();
            ((uy2) this.i.a).g();
        }
    }

    public final String toString() {
        return K("");
    }

    public boolean u() {
        return !this.h.isEmpty();
    }

    public final void v(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            zc5 zc5Var = new zc5(view);
            if (z) {
                l(zc5Var);
            } else {
                n(zc5Var);
            }
            zc5Var.r.add(this);
            x(zc5Var);
            if (z) {
                y(this.c, view, zc5Var);
            } else {
                y(this.i, view, zc5Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                v(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final void w() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            f(this, up.a, false);
            for (int i2 = 0; i2 < ((uy2) this.c.a).l(); i2++) {
                View view = (View) ((uy2) this.c.a).j(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((uy2) this.i.a).l(); i3++) {
                View view2 = (View) ((uy2) this.i.a).j(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.d = true;
        }
    }

    public boolean z(zc5 zc5Var, zc5 zc5Var2) {
        if (zc5Var != null && zc5Var2 != null) {
            String[] strArrS = s();
            if (strArrS != null) {
                for (String str : strArrS) {
                    if (o(zc5Var, zc5Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zc5Var.g.keySet().iterator();
                while (it.hasNext()) {
                    if (o(zc5Var, zc5Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void H() {
    }

    public void E(fz5 fz5Var) {
    }

    public void x(zc5 zc5Var) {
    }
}
