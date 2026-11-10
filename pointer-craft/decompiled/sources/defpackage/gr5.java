package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class gr5 {
    public final zl5 g;
    public final uh5 r;
    public final az3 y;

    static {
        iy2.v("WMFgUpdater");
    }

    public gr5(WorkDatabase workDatabase, az3 az3Var, zl5 zl5Var) {
        this.y = az3Var;
        this.g = zl5Var;
        this.r = workDatabase.k();
    }
}
