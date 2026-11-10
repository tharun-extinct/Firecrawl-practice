package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class n44 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ RecyclerView t;

    public /* synthetic */ n44(RecyclerView recyclerView, byte b) {
        this.j = b;
        this.t = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.j;
        RecyclerView recyclerView = this.t;
        switch (b) {
            case 0:
                if (recyclerView.B && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.e) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.E) {
                        recyclerView.b();
                    } else {
                        recyclerView.D = true;
                    }
                    break;
                }
                break;
            default:
                v44 v44Var = recyclerView.T;
                if (v44Var != null) {
                    j21 j21Var = (j21) v44Var;
                    long j = j21Var.n;
                    ArrayList arrayList = j21Var.j;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = j21Var.a;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = j21Var.m;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = j21Var.t;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            n54 n54Var = (n54) obj;
                            View view = n54Var.g;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            j21Var.s.add(n54Var);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new e21(j21Var, n54Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList5;
                            zIsEmpty = zIsEmpty;
                            zIsEmpty2 = zIsEmpty2;
                        }
                        boolean z2 = zIsEmpty;
                        boolean z3 = zIsEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            j21Var.w.add(arrayList6);
                            arrayList2.clear();
                            d21 d21Var = new d21(j21Var, arrayList6, (byte) 0);
                            if (z2) {
                                d21Var.run();
                            } else {
                                View view2 = ((i21) arrayList6.get(0)).g.g;
                                WeakHashMap weakHashMap = xk5.g;
                                view2.postOnAnimationDelayed(d21Var, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            j21Var.c.add(arrayList7);
                            arrayList3.clear();
                            d21 d21Var2 = new d21(j21Var, arrayList7, (byte) 1);
                            if (z2) {
                                d21Var2.run();
                            } else {
                                View view3 = ((h21) arrayList7.get(0)).g.g;
                                WeakHashMap weakHashMap2 = xk5.g;
                                view3.postOnAnimationDelayed(d21Var2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            j21Var.q.add(arrayList8);
                            arrayList4.clear();
                            d21 d21Var3 = new d21(j21Var, arrayList8, (byte) 2);
                            if (z2 && z3 && zIsEmpty3) {
                                d21Var3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!z3 ? j21Var.v : 0L, zIsEmpty3 ? 0L : j21Var.x) + j;
                                z = false;
                                View view4 = ((n54) arrayList8.get(0)).g;
                                WeakHashMap weakHashMap3 = xk5.g;
                                view4.postOnAnimationDelayed(d21Var3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.u0 = z;
                break;
        }
    }
}
