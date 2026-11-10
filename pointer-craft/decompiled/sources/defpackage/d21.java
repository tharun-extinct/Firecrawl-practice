package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d21 implements Runnable {
    public final /* synthetic */ j21 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ ArrayList t;

    public /* synthetic */ d21(j21 j21Var, ArrayList arrayList, byte b) {
        this.j = b;
        this.a = j21Var;
        this.t = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        byte b = this.j;
        int i = 0;
        ArrayList arrayList = this.t;
        switch (b) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    j21 j21Var = this.a;
                    if (i >= size) {
                        arrayList.clear();
                        j21Var.w.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        i21 i21Var = (i21) obj;
                        n54 n54Var = i21Var.g;
                        int i2 = i21Var.y;
                        int i3 = i21Var.r;
                        int i4 = i21Var.n;
                        int i5 = i21Var.v;
                        j21Var.getClass();
                        View view = n54Var.g;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        j21Var.b.add(n54Var);
                        viewPropertyAnimatorAnimate.setDuration(j21Var.v).setListener(new f21(j21Var, n54Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    j21 j21Var2 = this.a;
                    if (i >= size2) {
                        arrayList.clear();
                        j21Var2.c.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i);
                        i++;
                        h21 h21Var = (h21) obj2;
                        ArrayList arrayList2 = j21Var2.p;
                        long j = j21Var2.x;
                        n54 n54Var2 = h21Var.g;
                        View view2 = n54Var2 == null ? null : n54Var2.g;
                        n54 n54Var3 = h21Var.y;
                        View view3 = n54Var3 != null ? n54Var3.g : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(h21Var.g);
                            duration.translationX(h21Var.v - h21Var.r);
                            duration.translationY(h21Var.x - h21Var.n);
                            duration.alpha(0.0f).setListener(new g21(j21Var2, h21Var, duration, view2, (byte) 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(h21Var.y);
                            c = 0;
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new g21(j21Var2, h21Var, viewPropertyAnimatorAnimate2, view3, (byte) 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
                break;
            default:
                int size3 = arrayList.size();
                while (true) {
                    j21 j21Var3 = this.a;
                    if (i >= size3) {
                        arrayList.clear();
                        j21Var3.q.remove(arrayList);
                    } else {
                        Object obj3 = arrayList.get(i);
                        i++;
                        n54 n54Var4 = (n54) obj3;
                        j21Var3.getClass();
                        View view4 = n54Var4.g;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        j21Var3.i.add(n54Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(j21Var3.r).setListener(new e21(j21Var3, n54Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
