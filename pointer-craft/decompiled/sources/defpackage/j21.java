package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j21 extends v44 {
    public static TimeInterpolator u;
    public ArrayList a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList i;
    public ArrayList j;
    public boolean l;
    public ArrayList m;
    public ArrayList p;
    public ArrayList q;
    public ArrayList s;
    public ArrayList t;
    public ArrayList w;

    public static void j(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((n54) arrayList.get(size)).g.animate().cancel();
        }
    }

    public final void a(ArrayList arrayList, n54 n54Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h21 h21Var = (h21) arrayList.get(size);
            if (m(h21Var, n54Var) && h21Var.g == null && h21Var.y == null) {
                arrayList.remove(h21Var);
            }
        }
    }

    @Override // defpackage.v44
    public final boolean g(n54 n54Var, n54 n54Var2, u44 u44Var, u44 u44Var2) {
        int i;
        int i2;
        int i3 = u44Var.j;
        int i4 = u44Var.t;
        if (n54Var2.s()) {
            int i5 = u44Var.j;
            i2 = u44Var.t;
            i = i5;
        } else {
            i = u44Var2.j;
            i2 = u44Var2.t;
        }
        if (n54Var == n54Var2) {
            return l(n54Var, i3, i4, i, i2);
        }
        View view = n54Var.g;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        q(n54Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = n54Var2.g;
        q(n54Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.m;
        h21 h21Var = new h21();
        h21Var.g = n54Var;
        h21Var.y = n54Var2;
        h21Var.r = i3;
        h21Var.n = i4;
        h21Var.v = i;
        h21Var.x = i2;
        arrayList.add(h21Var);
        return true;
    }

    public final boolean l(n54 n54Var, int i, int i2, int i3, int i4) {
        View view = n54Var.g;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) n54Var.g.getTranslationY());
        q(n54Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            r(n54Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.a;
        i21 i21Var = new i21();
        i21Var.g = n54Var;
        i21Var.y = translationX;
        i21Var.r = translationY;
        i21Var.n = i3;
        i21Var.v = i4;
        arrayList.add(i21Var);
        return true;
    }

    public final boolean m(h21 h21Var, n54 n54Var) {
        if (h21Var.y == n54Var) {
            h21Var.y = null;
        } else {
            if (h21Var.g != n54Var) {
                return false;
            }
            h21Var.g = null;
        }
        View view = n54Var.g;
        View view2 = n54Var.g;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        r(n54Var);
        return true;
    }

    @Override // defpackage.v44
    public final void n(n54 n54Var) {
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = this.w;
        ArrayList arrayList3 = this.c;
        View view = n54Var.g;
        view.animate().cancel();
        ArrayList arrayList4 = this.a;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((i21) arrayList4.get(size)).g == n54Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                r(n54Var);
                arrayList4.remove(size);
            }
        }
        a(this.m, n54Var);
        if (this.j.remove(n54Var)) {
            view.setAlpha(1.0f);
            r(n54Var);
        }
        if (this.t.remove(n54Var)) {
            view.setAlpha(1.0f);
            r(n54Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            a(arrayList5, n54Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((i21) arrayList6.get(size4)).g == n54Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    r(n54Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(n54Var)) {
                view.setAlpha(1.0f);
                r(n54Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.s.remove(n54Var);
        this.i.remove(n54Var);
        this.p.remove(n54Var);
        this.b.remove(n54Var);
        t();
    }

    public final void q(n54 n54Var) {
        if (u == null) {
            u = new ValueAnimator().getInterpolator();
        }
        n54Var.g.animate().setInterpolator(u);
        n(n54Var);
    }

    public final void t() {
        if (x()) {
            return;
        }
        ArrayList arrayList = this.y;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            uo1.B();
        }
    }

    @Override // defpackage.v44
    public final void v() {
        ArrayList arrayList = this.m;
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = this.q;
        ArrayList arrayList4 = this.w;
        ArrayList arrayList5 = this.t;
        ArrayList arrayList6 = this.j;
        ArrayList arrayList7 = this.a;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i21 i21Var = (i21) arrayList7.get(size);
            View view = i21Var.g.g;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            r(i21Var.g);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            r((n54) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            n54 n54Var = (n54) arrayList5.get(size3);
            n54Var.g.setAlpha(1.0f);
            r(n54Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            h21 h21Var = (h21) arrayList.get(size4);
            n54 n54Var2 = h21Var.g;
            if (n54Var2 != null) {
                m(h21Var, n54Var2);
            }
            n54 n54Var3 = h21Var.y;
            if (n54Var3 != null) {
                m(h21Var, n54Var3);
            }
        }
        arrayList.clear();
        if (x()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    i21 i21Var2 = (i21) arrayList8.get(size6);
                    View view2 = i21Var2.g.g;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    r(i21Var2.g);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    n54 n54Var4 = (n54) arrayList9.get(size8);
                    n54Var4.g.setAlpha(1.0f);
                    r(n54Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    h21 h21Var2 = (h21) arrayList10.get(size10);
                    n54 n54Var5 = h21Var2.g;
                    if (n54Var5 != null) {
                        m(h21Var2, n54Var5);
                    }
                    n54 n54Var6 = h21Var2.y;
                    if (n54Var6 != null) {
                        m(h21Var2, n54Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            j(this.s);
            j(this.b);
            j(this.i);
            j(this.p);
            ArrayList arrayList11 = this.y;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                uo1.B();
            }
        }
    }

    @Override // defpackage.v44
    public final boolean x() {
        return (this.t.isEmpty() && this.m.isEmpty() && this.a.isEmpty() && this.j.isEmpty() && this.b.isEmpty() && this.s.isEmpty() && this.i.isEmpty() && this.p.isEmpty() && this.w.isEmpty() && this.q.isEmpty() && this.c.isEmpty()) ? false : true;
    }
}
