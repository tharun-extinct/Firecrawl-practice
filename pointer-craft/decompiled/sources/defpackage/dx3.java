package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dx3 implements or2 {
    public Object a;
    public long b;
    public long c;
    public final int g;
    public long i;
    public boolean j;
    public boolean l;
    public boolean m;
    public final ws0 n;
    public final /* synthetic */ ok2 p;
    public cx3 q;
    public final xy1 r;
    public boolean s;
    public boolean t;
    public oy4 v;
    public boolean w;
    public ny4 x;
    public final ro y;

    public dx3(ok2 ok2Var, int i, ro roVar, xy1 xy1Var) {
        this.p = ok2Var;
        this.g = i;
        this.y = roVar;
        this.r = xy1Var;
        this.b = t73.g();
    }

    @Override // defpackage.or2
    public final void cancel() {
        if (this.j) {
            return;
        }
        this.j = true;
        y();
    }

    @Override // defpackage.or2
    public final void g() {
        this.w = true;
    }

    public final void j() {
        long jX;
        long jG = t73.g();
        long j = this.b;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jX = (1 | (jG - 1)) == Long.MAX_VALUE ? pz5.x(jG) : pz5.j(jG, j);
        } else if (jG == j) {
            aj6 aj6Var = mf1.j;
            jX = 0;
        } else {
            jX = mf1.a(pz5.x(j));
        }
        long j3 = jX >> 1;
        aj6 aj6Var2 = mf1.j;
        if ((((int) jX) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.i = j2;
        long j4 = this.c - j2;
        this.c = j4;
        this.b = jG;
        pw5.V("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final boolean l(long j, long j2) {
        if (this.w) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01db  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public final boolean n(fe feVar) {
        ws0 ws0Var;
        ?? r10;
        int i = this.g;
        long j = i;
        pw5.V("compose:lazy:prefetch:execute:item", j);
        yq2 yq2Var = (yq2) ((wq2) this.p.y).y.g();
        if (!this.j) {
            int iG = yq2Var.g();
            if (i >= 0 && i < iG) {
                Object objY = yq2Var.y(i);
                Object obj = this.a;
                if (obj != null && !objY.equals(obj)) {
                    y();
                    return false;
                }
                Object objR = yq2Var.r(i);
                ro roVar = this.y;
                jv jvVar = (jv) roVar.m;
                if (roVar.a != objR || jvVar == null) {
                    hb3 hb3Var = (hb3) roVar.t;
                    Object objL = hb3Var.l(objR);
                    Object obj2 = objL;
                    if (objL == null) {
                        jv jvVar2 = new jv();
                        jvVar2.v = -1;
                        hb3Var.c(objR, jvVar2);
                        obj2 = jvVar2;
                    }
                    jvVar = (jv) obj2;
                    roVar.a = objR;
                    roVar.m = jvVar;
                }
                v();
                long jG = feVar.g();
                this.c = jG;
                this.b = t73.g();
                this.i = 0L;
                pw5.V("compose:lazy:prefetch:available_time_nanos", jG);
                if (!v()) {
                    if (l(this.c, jvVar.g + jvVar.y)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            x(objY, objR, jvVar);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!v()) {
                        return true;
                    }
                }
                if (this.x != null) {
                    if (!l(this.c, jvVar.r)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        ny4 ny4Var = this.x;
                        if (ny4Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.v = ny4Var.apply();
                        this.x = null;
                        this.t = true;
                        Trace.endSection();
                        j();
                        jvVar.r = jv.g(this.i, jvVar.r);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                byte b = 4;
                if (!this.m) {
                    if (this.c <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        oy4 oy4Var = this.v;
                        if (oy4Var != null) {
                            u54 u54Var = new u54();
                            oy4Var.y(new j9(u54Var, b));
                            List list = (List) u54Var.j;
                            cx3 cx3Var = list != null ? new cx3(this, list) : null;
                            this.q = cx3Var;
                            this.m = true;
                            Trace.endSection();
                        } else {
                            pc2.y("Should precompose before resolving nested prefetch states");
                            up.q();
                        }
                        this.q = cx3Var;
                        this.m = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                cx3 cx3Var2 = this.q;
                if (cx3Var2 != null) {
                    int i2 = jvVar.v;
                    boolean z = this.w;
                    List[] listArr = cx3Var2.y;
                    int i3 = cx3Var2.r;
                    List list2 = cx3Var2.g;
                    if (i3 < list2.size()) {
                        if (cx3Var2.x.j) {
                            pc2.r("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((pr2) list2.get(i4)).n = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (cx3Var2.r < list2.size()) {
                                try {
                                    if (listArr[cx3Var2.r] == null) {
                                        if (feVar.g() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = cx3Var2.r;
                                        pr2 pr2Var = (pr2) list2.get(i5);
                                        xy1 xy1Var = pr2Var.g;
                                        nr2 nr2Var = new nr2(pr2Var, pr2Var.n);
                                        xy1Var.a(nr2Var);
                                        ArrayList arrayList = nr2Var.y;
                                        pr2Var.x = arrayList.size();
                                        listArr[i5] = arrayList;
                                    }
                                    List list3 = listArr[cx3Var2.r];
                                    list3.getClass();
                                    while (cx3Var2.n < list3.size()) {
                                        dx3 dx3Var = (dx3) list3.get(cx3Var2.n);
                                        if (z) {
                                            dx3 dx3Var2 = dx3Var != null ? dx3Var : null;
                                            if (dx3Var2 != null) {
                                                r10 = 1;
                                                dx3Var2.w = true;
                                            } else {
                                                r10 = 1;
                                            }
                                        } else {
                                            r10 = 1;
                                        }
                                        cx3Var2.v = r10;
                                        if (dx3Var.r(feVar)) {
                                            Trace.endSection();
                                            return r10;
                                        }
                                        cx3Var2.n += r10;
                                    }
                                    cx3Var2.n = 0;
                                    cx3Var2.r++;
                                    b = b;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                cx3 cx3Var3 = this.q;
                if (cx3Var3 != null && cx3Var3.v) {
                    j();
                    pw5.V("compose:lazy:prefetch:execute:item", j);
                    cx3 cx3Var4 = this.q;
                    if (cx3Var4 != null) {
                        cx3Var4.v = false;
                    }
                }
                if (!this.l && (ws0Var = this.n) != null) {
                    if (!l(this.c, jvVar.n)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = ws0Var.g;
                        if (this.j) {
                            pc2.g("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.l) {
                            pc2.g("Request was already measured!");
                        }
                        this.l = true;
                        oy4 oy4Var2 = this.v;
                        if (oy4Var2 != null) {
                            int iR = oy4Var2.r();
                            for (int i6 = 0; i6 < iR; i6++) {
                                oy4Var2.n(i6, j2);
                            }
                        } else {
                            pc2.y("performComposition() must be called before performMeasure()");
                            up.q();
                        }
                        Trace.endSection();
                        j();
                        jvVar.n = jv.g(this.i, jvVar.n);
                        xy1 xy1Var2 = this.r;
                        if (xy1Var2 != null) {
                            xy1Var2.a(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                cx3 cx3Var5 = this.q;
                if (this.l && this.m && cx3Var5 != null) {
                    List list4 = cx3Var5.g;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((pr2) list4.get(i7)).v);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = jvVar.v;
                    jvVar.v = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((pr2) list4.get(i9)).x);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        jvVar.n = 0L;
                    }
                }
                return false;
            }
        }
        y();
        return false;
    }

    public final boolean r(fe feVar) {
        boolean zN;
        if (!this.p.g) {
            return false;
        }
        if (this.w) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zN = n(feVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zN = n(feVar);
        }
        pw5.V("compose:lazy:prefetch:execute:item", -1L);
        return zN;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.g + ", constraints = " + this.n + ", isComposed = " + v() + ", isMeasured = " + this.l + ", isCanceled = " + this.j + " }";
    }

    public final boolean v() {
        ny4 ny4Var;
        return this.t || ((ny4Var = this.x) != null && ny4Var.x());
    }

    public final void x(Object obj, Object obj2, jv jvVar) {
        ny4 cd2Var;
        ny4 ny4Var = this.x;
        byte b = 1;
        if (ny4Var == null) {
            ok2 ok2Var = this.p;
            bz1 bz1VarG = ((wq2) ok2Var.y).g(this.g, obj, obj2);
            in2 in2VarG = ((py4) ok2Var.r).g();
            if (in2VarG.j.J()) {
                in2VarG.q(obj, bz1VarG, true);
                cd2Var = new cd2((byte) 15, in2VarG, obj, false);
            } else {
                cd2Var = new rk4((Object) in2VarG, obj, (byte) 16);
            }
            ny4Var = cd2Var;
            this.x = ny4Var;
            this.a = obj;
        }
        this.s = false;
        while (!ny4Var.x() && !this.s) {
            ny4Var.j(new qm3(this, jvVar, b));
        }
        j();
        boolean z = this.s;
        long j = this.i;
        if (z) {
            jvVar.y = jv.g(j, jvVar.y);
        } else {
            jvVar.g = jv.g(j, jvVar.g);
        }
    }

    public final void y() {
        ny4 ny4Var = this.x;
        if (ny4Var != null) {
            ny4Var.cancel();
        }
        this.x = null;
        oy4 oy4Var = this.v;
        if (oy4Var != null) {
            oy4Var.g();
        }
        this.v = null;
        this.q = null;
    }

    public dx3(ok2 ok2Var, int i, long j, ro roVar, xy1 xy1Var) {
        this(ok2Var, i, roVar, xy1Var);
        this.n = new ws0(j);
    }
}
