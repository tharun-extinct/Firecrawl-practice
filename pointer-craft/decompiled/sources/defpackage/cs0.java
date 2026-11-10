package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class cs0 {
    public final ArrayList g = new ArrayList();
    public yq5 n;
    public final ss0 r;
    public Object y;

    public cs0(ss0 ss0Var) {
        this.r = ss0Var;
    }

    public boolean g(sr5 sr5Var) {
        return sr5Var.a.y() == 5;
    }

    public final void n(yq5 yq5Var, Object obj) {
        if (this.g.isEmpty() || yq5Var == null) {
            return;
        }
        if (obj == null || y(obj)) {
            ArrayList arrayList = this.g;
            synchronized (yq5Var.r) {
                try {
                    xq5 xq5Var = yq5Var.g;
                    if (xq5Var != null) {
                        xq5Var.r(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ArrayList arrayList2 = this.g;
        synchronized (yq5Var.r) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (yq5Var.g(str)) {
                        iy2.r().g(yq5.n, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                xq5 xq5Var2 = yq5Var.g;
                if (xq5Var2 != null) {
                    xq5Var2.v(arrayList3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(Iterable iterable) {
        this.g.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sr5 sr5Var = (sr5) it.next();
            if (g(sr5Var)) {
                this.g.add(sr5Var.g);
            }
        }
        boolean zIsEmpty = this.g.isEmpty();
        ss0 ss0Var = this.r;
        if (zIsEmpty) {
            ss0Var.y(this);
        } else {
            synchronized (ss0Var.r) {
                try {
                    if (ss0Var.n.add(this)) {
                        if (ss0Var.n.size() == 1) {
                            ss0Var.v = ss0Var.g();
                            iy2.r().g(ss0.x, String.format("%s: initial state = %s", ss0Var.getClass().getSimpleName(), ss0Var.v), new Throwable[0]);
                            ss0Var.n();
                        }
                        Object obj = ss0Var.v;
                        this.y = obj;
                        n(this.n, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        n(this.n, this.y);
    }

    public boolean y(Object obj) {
        pg3 pg3Var = (pg3) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (pg3Var.g() && pg3Var.y()) ? false : true;
        }
        iy2.r().g(ng3.v, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !pg3Var.g();
    }
}
