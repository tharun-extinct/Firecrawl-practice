package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si6 {
    public Object g;
    public boolean n;
    public mj6 r;
    public ij6 y;

    public final void finalize() {
        mj6 mj6Var;
        ij6 ij6Var = this.y;
        if (ij6Var != null && !ij6Var.t.isDone()) {
            ij6Var.r(new d0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.g)), (byte) 3));
        }
        if (this.n || (mj6Var = this.r) == null) {
            return;
        }
        mj6Var.t(null);
    }

    public final void g(Object obj) {
        this.n = true;
        ij6 ij6Var = this.y;
        if (ij6Var != null) {
            dj6 dj6Var = ij6Var.t;
            dj6Var.getClass();
            if (obj == null) {
                obj = wh6.c;
            }
            if (wh6.w.E(dj6Var, null, obj)) {
                wh6.n(dj6Var);
                this.g = null;
                this.y = null;
                this.r = null;
            }
        }
    }
}
