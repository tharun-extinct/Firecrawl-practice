package androidx.work.impl;

import android.content.Context;
import defpackage.aa4;
import defpackage.cd2;
import defpackage.iz4;
import defpackage.ji;
import defpackage.jy3;
import defpackage.og2;
import defpackage.ok2;
import defpackage.q01;
import defpackage.rk4;
import defpackage.ro;
import defpackage.uh5;
import defpackage.zl5;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile cd2 b;
    public volatile rk4 c;
    public volatile ro i;
    public volatile ji p;
    public volatile uh5 q;
    public volatile zl5 s;
    public volatile rk4 w;

    @Override // androidx.work.impl.WorkDatabase
    public final rk4 d() {
        rk4 rk4Var;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new rk4(this, (byte) 25);
                }
                rk4Var = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rk4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final zl5 f() {
        zl5 zl5Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new zl5(this);
                }
                zl5Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zl5Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ro h() {
        ro roVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            try {
                if (this.i == null) {
                    this.i = new ro(this);
                }
                roVar = this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return roVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final uh5 k() {
        uh5 uh5Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new uh5(this);
                }
                uh5Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uh5Var;
    }

    @Override // defpackage.x94
    public final iz4 l(q01 q01Var) {
        aa4 aa4Var = new aa4(q01Var, new jy3(this));
        Context context = q01Var.g;
        context.getClass();
        return q01Var.r.a(new ok2(context, q01Var.y, aa4Var, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cd2 o() {
        cd2 cd2Var;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new cd2(this);
                }
                cd2Var = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cd2Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final rk4 u() {
        rk4 rk4Var;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new rk4(this, (byte) 9);
                }
                rk4Var = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rk4Var;
    }

    @Override // defpackage.x94
    public final og2 v() {
        return new og2(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ji z() {
        ji jiVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new ji(this);
                }
                jiVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jiVar;
    }
}
