package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ol4 extends k0 {
    public final boolean a(Object obj) {
        if (obj == null) {
            obj = k0.c;
        }
        if (!k0.w.y(this, null, obj)) {
            return false;
        }
        k0.n(this);
        return true;
    }

    public final boolean m(Throwable th) {
        if (!k0.w.y(this, null, new e0(th))) {
            return false;
        }
        k0.n(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean q(vw2 vw2Var) {
        e0 e0Var;
        vw2Var.getClass();
        Object obj = this.j;
        if (obj != null) {
            if (obj instanceof c0) {
                vw2Var.cancel(((c0) obj).g);
            }
        } else if (vw2Var.isDone()) {
            if (k0.w.y(this, null, k0.l(vw2Var))) {
                k0.n(this);
                return true;
            }
        } else {
            h0 h0Var = new h0(this, vw2Var);
            if (k0.w.y(this, null, h0Var)) {
                try {
                    vw2Var.g(h0Var, z91.j);
                    return true;
                } catch (Throwable th) {
                    try {
                        e0Var = new e0(th);
                    } catch (Throwable unused) {
                        e0Var = e0.y;
                    }
                    k0.w.y(this, h0Var, e0Var);
                    return true;
                }
            }
            obj = this.j;
            if (obj instanceof c0) {
                vw2Var.cancel(((c0) obj).g);
            }
        }
        return false;
    }
}
