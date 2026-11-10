package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zq5 {
    public static final String t = iy2.v("WorkContinuationImpl");
    public final kr5 g;
    public rk4 j;
    public boolean l;
    public final List n;
    public final int r;
    public final ArrayList v;
    public final ArrayList x;
    public final String y;

    public zq5(kr5 kr5Var, String str, int i, List list, int i2) {
        this.g = kr5Var;
        this.y = str;
        this.r = i;
        this.n = list;
        this.v = new ArrayList(list.size());
        this.x = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String string = ((qk3) list.get(i3)).g.toString();
            this.v.add(string);
            this.x.add(string);
        }
    }

    public static HashSet y(zq5 zq5Var) {
        HashSet hashSet = new HashSet();
        zq5Var.getClass();
        return hashSet;
    }

    public final rk4 g() {
        if (this.l) {
            iy2.r().x(t, du4.i("Already enqueued work ids (", TextUtils.join(", ", this.v), ")"), new Throwable[0]);
        } else {
            lj1 lj1Var = new lj1(this);
            this.g.n.g(lj1Var);
            this.j = lj1Var.t;
        }
        return this.j;
    }

    public zq5(kr5 kr5Var, List list) {
        this(kr5Var, null, 2, list, 0);
    }

    public zq5(kr5 kr5Var, String str, int i, List list) {
        this(kr5Var, str, i, list, 0);
    }
}
