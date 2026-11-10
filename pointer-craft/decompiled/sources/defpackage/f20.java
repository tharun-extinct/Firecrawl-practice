package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class f20 implements o14 {
    public final o14 g;
    public final o14 r;
    public final o14 y;

    public f20(kq kqVar, o14 o14Var, o14 o14Var2) {
        this.g = kqVar;
        this.y = o14Var;
        this.r = o14Var2;
    }

    @Override // defpackage.p14
    public final Object get() {
        Application application = (Application) this.g.get();
        ox0 ox0Var = (ox0) this.y.get();
        d20 d20Var = (d20) this.r.get();
        application.getClass();
        ox0Var.getClass();
        d20Var.getClass();
        return new w10(application, ox0Var, d20Var, v20.n, v20.v, v20.x);
    }
}
