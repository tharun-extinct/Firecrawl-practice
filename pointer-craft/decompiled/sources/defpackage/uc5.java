package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uc5 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public lc5 j;
    public ViewGroup t;

    /* JADX WARN: Code duplicated, block: B:101:0x0216  */
    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e0 A[EDGE_INSN: B:133:0x01e0->B:89:0x01e0 BREAK  A[LOOP:1: B:18:0x0084->B:88:0x01d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0208  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        kb5 kb5Var;
        kb5 kb5Var2;
        mr mrVar;
        mr mrVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        mr mrVarB;
        int i5;
        Animator animator;
        ac5 ac5Var;
        zc5 zc5Var;
        zc5 zc5Var2;
        int i6;
        boolean z2;
        int i7;
        View view;
        zc5 zc5Var3;
        mr mrVar3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        uy2 uy2Var;
        int iL;
        int i11;
        View view6;
        boolean z3;
        int size2;
        int i12;
        lc5 lc5Var = this.j;
        ViewGroup viewGroup = this.t;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!vc5.r.remove(viewGroup)) {
            return true;
        }
        mr mrVarY = vc5.y();
        ArrayList arrayList2 = (ArrayList) mrVarY.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(lc5Var);
            lc5Var.g(new tc5(this, mrVarY));
            i = 0;
            lc5Var.j(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((lc5) obj).A(viewGroup);
                }
            }
            lc5Var.p = new ArrayList();
            lc5Var.u = new ArrayList();
            kb5Var = lc5Var.c;
            kb5Var2 = lc5Var.i;
            mrVar = new mr((mr) kb5Var.j);
            mrVar2 = new mr((mr) kb5Var2.j);
            i2 = 0;
            while (true) {
                iArr = lc5Var.s;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = mrVar.a - 1; i7 >= 0; i7--) {
                        view = (View) mrVar.x(i7);
                        if (view == null && lc5Var.h(view) && (zc5Var3 = (zc5) mrVar2.remove(view)) != null && lc5Var.h(zc5Var3.y)) {
                            lc5Var.p.add((zc5) mrVar.l(i7));
                            lc5Var.u.add(zc5Var3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    mrVar3 = (mr) kb5Var.m;
                    mr mrVar4 = (mr) kb5Var2.m;
                    i8 = mrVar3.a;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) mrVar3.t(i9);
                        if (view2 == null && lc5Var.h(view2) && (view3 = (View) mrVar4.get(mrVar3.x(i9))) != null && lc5Var.h(view3)) {
                            zc5 zc5Var4 = (zc5) mrVar.get(view2);
                            zc5 zc5Var5 = (zc5) mrVar2.get(view3);
                            if (zc5Var4 != null && zc5Var5 != null) {
                                lc5Var.p.add(zc5Var4);
                                lc5Var.u.add(zc5Var5);
                                mrVar.remove(view2);
                                mrVar2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        uy2Var = (uy2) kb5Var.a;
                        uy2 uy2Var2 = (uy2) kb5Var2.a;
                        iL = uy2Var.l();
                        i11 = i;
                        while (i11 < iL) {
                            view6 = (View) uy2Var.j(i11);
                            if (view6 == null && lc5Var.h(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) uy2Var2.y(uy2Var.n(i11));
                                if (view7 == null || !lc5Var.h(view7)) {
                                    z3 = z5;
                                } else {
                                    zc5 zc5Var6 = (zc5) mrVar.get(view6);
                                    zc5 zc5Var7 = (zc5) mrVar2.get(view7);
                                    if (zc5Var6 == null || zc5Var7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        lc5Var.p.add(zc5Var6);
                                        lc5Var.u.add(zc5Var7);
                                        mrVar.remove(view6);
                                        mrVar2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) kb5Var.t;
                    SparseArray sparseArray2 = (SparseArray) kb5Var2.t;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && lc5Var.h(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && lc5Var.h(view5)) {
                            zc5 zc5Var8 = (zc5) mrVar.get(view4);
                            zc5 zc5Var9 = (zc5) mrVar2.get(view5);
                            if (zc5Var8 != null && zc5Var9 != null) {
                                lc5Var.p.add(zc5Var8);
                                lc5Var.u.add(zc5Var9);
                                mrVar.remove(view4);
                                mrVar2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < mrVar.a; i3++) {
                zc5Var2 = (zc5) mrVar.t(i3);
                if (lc5Var.h(zc5Var2.y)) {
                    lc5Var.p.add(zc5Var2);
                    lc5Var.u.add(null);
                }
            }
            for (i4 = 0; i4 < mrVar2.a; i4++) {
                zc5Var = (zc5) mrVar2.t(i4);
                if (lc5Var.h(zc5Var.y)) {
                    lc5Var.u.add(zc5Var);
                    lc5Var.p.add(null);
                }
            }
            mrVarB = lc5.b();
            int i13 = mrVarB.a;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) mrVarB.x(i5);
                if (animator == null && (ac5Var = (ac5) mrVarB.get(animator)) != null) {
                    lc5 lc5Var2 = ac5Var.v;
                    View view8 = ac5Var.g;
                    if (view8 != null && windowId.equals(ac5Var.n)) {
                        zc5 zc5Var10 = ac5Var.r;
                        boolean z6 = z;
                        zc5 zc5VarP = lc5Var.p(view8, z6);
                        zc5 zc5VarC = lc5Var.c(view8, z6);
                        if (zc5VarP == null && zc5VarC == null) {
                            zc5VarC = (zc5) ((mr) lc5Var.i.j).get(view8);
                        }
                        if ((zc5VarP != null || zc5VarC != null) && lc5Var2.z(zc5Var10, zc5VarC)) {
                            lc5Var2.i().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                mrVarB.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            lc5Var.q(viewGroup, lc5Var.c, lc5Var.i, lc5Var.p, lc5Var.u);
            lc5Var.B();
            return true;
        }
        arrayList2 = new ArrayList();
        mrVarY.put(viewGroup, arrayList2);
        arrayList2.add(lc5Var);
        lc5Var.g(new tc5(this, mrVarY));
        i = 0;
        lc5Var.j(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                ((lc5) obj2).A(viewGroup);
            }
        }
        lc5Var.p = new ArrayList();
        lc5Var.u = new ArrayList();
        kb5Var = lc5Var.c;
        kb5Var2 = lc5Var.i;
        mrVar = new mr((mr) kb5Var.j);
        mrVar2 = new mr((mr) kb5Var2.j);
        i2 = 0;
        while (true) {
            iArr = lc5Var.s;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) mrVar.x(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                mrVar3 = (mr) kb5Var.m;
                mr mrVar5 = (mr) kb5Var2.m;
                i8 = mrVar3.a;
                while (i9 < i8) {
                    view2 = (View) mrVar3.t(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    uy2Var = (uy2) kb5Var.a;
                    uy2 uy2Var3 = (uy2) kb5Var2.a;
                    iL = uy2Var.l();
                    i11 = i;
                    while (i11 < iL) {
                        view6 = (View) uy2Var.j(i11);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) kb5Var.t;
                SparseArray sparseArray3 = (SparseArray) kb5Var2.t;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < mrVar.a) {
            zc5Var2 = (zc5) mrVar.t(i3);
            if (lc5Var.h(zc5Var2.y)) {
                lc5Var.p.add(zc5Var2);
                lc5Var.u.add(null);
            }
        }
        while (i4 < mrVar2.a) {
            zc5Var = (zc5) mrVar2.t(i4);
            if (lc5Var.h(zc5Var.y)) {
                lc5Var.u.add(zc5Var);
                lc5Var.p.add(null);
            }
        }
        mrVarB = lc5.b();
        int i14 = mrVarB.a;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) mrVarB.x(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        lc5Var.q(viewGroup, lc5Var.c, lc5Var.i, lc5Var.p, lc5Var.u);
        lc5Var.B();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.t;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        vc5.r.remove(viewGroup);
        ArrayList arrayList = (ArrayList) vc5.y().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((lc5) obj).A(viewGroup);
            }
        }
        this.j.t(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
