package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h42 implements he4, xq5, zl1 {
    public static final String b = iy2.v("GreedyScheduler");
    public final yq5 a;
    public Boolean i;
    public final Context j;
    public final n41 q;
    public final kr5 t;
    public boolean w;
    public final HashSet m = new HashSet();
    public final Object c = new Object();

    public h42(Context context, pp0 pp0Var, zl5 zl5Var, kr5 kr5Var) {
        this.j = context;
        this.t = kr5Var;
        this.a = new yq5(context, zl5Var, this);
        this.q = new n41(this, pp0Var.v);
    }

    @Override // defpackage.zl1
    public final void g(String str, boolean z) {
        synchronized (this.c) {
            try {
                for (sr5 sr5Var : this.m) {
                    if (sr5Var.g.equals(str)) {
                        iy2.r().g(b, "Stopping tracking for " + str, new Throwable[0]);
                        this.m.remove(sr5Var);
                        this.a.y(this.m);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.he4
    public final void n(sr5... sr5VarArr) {
        Boolean boolValueOf = this.i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(zy3.g(this.j, this.t.y));
            this.i = boolValueOf;
        }
        boolean z = false;
        if (!boolValueOf.booleanValue()) {
            iy2.r().n(b, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.w) {
            this.t.x.y(this);
            this.w = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (sr5 sr5Var : sr5VarArr) {
            long jG = sr5Var.g();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (sr5Var.y == hr5.j) {
                if (jCurrentTimeMillis < jG) {
                    n41 n41Var = this.q;
                    if (n41Var != null) {
                        q64 q64Var = n41Var.y;
                        HashMap map = n41Var.r;
                        Runnable runnable = (Runnable) map.remove(sr5Var.g);
                        if (runnable != null) {
                            ((Handler) q64Var.t).removeCallbacks(runnable);
                        }
                        i26 i26Var = new i26((byte) 8, n41Var, sr5Var, z);
                        map.put(sr5Var.g, i26Var);
                        ((Handler) q64Var.t).postDelayed(i26Var, sr5Var.g() - System.currentTimeMillis());
                    }
                } else if (!sr5Var.y()) {
                    iy2.r().g(b, xi3.t("Starting work for ", sr5Var.g), new Throwable[0]);
                    kr5 kr5Var = this.t;
                    kr5Var.n.g(new ks0(kr5Var, sr5Var.g, null, (byte) 5));
                } else if (sr5Var.a.j()) {
                    iy2.r().g(b, "Ignoring WorkSpec " + sr5Var + ", Requires device idle.", new Throwable[0]);
                } else if (sr5Var.a.v()) {
                    iy2.r().g(b, "Ignoring WorkSpec " + sr5Var + ", Requires ContentUri triggers.", new Throwable[0]);
                } else {
                    hashSet.add(sr5Var);
                    hashSet2.add(sr5Var.g);
                }
            }
        }
        synchronized (this.c) {
            try {
                if (!hashSet.isEmpty()) {
                    iy2.r().g(b, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.m.addAll(hashSet);
                    this.a.y(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xq5
    public final void r(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            iy2.r().g(b, xi3.t("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            kr5 kr5Var = this.t;
            kr5Var.n.g(new jx4(kr5Var, str, false));
        }
    }

    @Override // defpackage.xq5
    public final void v(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            iy2.r().g(b, xi3.t("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            kr5 kr5Var = this.t;
            kr5Var.n.g(new ks0(kr5Var, str, null, (byte) 5));
        }
    }

    @Override // defpackage.he4
    public final boolean x() {
        return false;
    }

    @Override // defpackage.he4
    public final void y(String str) {
        Runnable runnable;
        Boolean boolValueOf = this.i;
        kr5 kr5Var = this.t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(zy3.g(this.j, kr5Var.y));
            this.i = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        String str2 = b;
        if (!zBooleanValue) {
            iy2.r().n(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.w) {
            kr5Var.x.y(this);
            this.w = true;
        }
        iy2.r().g(str2, xi3.t("Cancelling work ID ", str), new Throwable[0]);
        n41 n41Var = this.q;
        if (n41Var != null && (runnable = (Runnable) n41Var.r.remove(str)) != null) {
            ((Handler) n41Var.y.t).removeCallbacks(runnable);
        }
        kr5Var.n.g(new jx4(kr5Var, str, false));
    }
}
