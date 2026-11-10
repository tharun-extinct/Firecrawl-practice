package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends pl5 {
    public final sv1 r;
    public final lz0 y;

    public i5(lz0 lz0Var, sv1 sv1Var) {
        this.y = lz0Var;
        this.r = sv1Var;
    }

    @Override // defpackage.pl5
    public final void n() {
        k84 k84Var = (k84) ((lz0) ((j5) a11.u(j5.class, this.y))).r.get();
        k84Var.getClass();
        hy5.r();
        Iterator it = k84Var.g.iterator();
        if (it.hasNext()) {
            fj.w(it.next());
            throw null;
        }
    }
}
