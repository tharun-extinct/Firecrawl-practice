package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class hd4 {
    public final id4 g;
    public boolean j;
    public boolean l;
    public final hb3 n;
    public final d93 r = new d93((byte) 16);
    public boolean v;
    public Bundle x;
    public final gd4 y;

    public hd4(id4 id4Var, gd4 gd4Var) {
        this.g = id4Var;
        this.y = gd4Var;
        long[] jArr = ee4.g;
        this.n = new hb3();
        this.j = true;
    }

    public final void g() {
        id4 id4Var = this.g;
        if (id4Var.a().t != wt2.t) {
            l0.z("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.v) {
                l0.z("SavedStateRegistry was already attached.");
                return;
            }
            this.y.g();
            id4Var.a().g(new sc3(this, (byte) 1));
            this.v = true;
        }
    }
}
