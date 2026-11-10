package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i84 extends ih2 {
    public final jh2 q;

    public i84(jh2 jh2Var) {
        this.q = jh2Var;
    }

    @Override // defpackage.ih2
    public final void c(Throwable th) {
        Object objY = q().Y();
        boolean z = objY instanceof hl0;
        jh2 jh2Var = this.q;
        if (z) {
            jh2Var.j(js2.j(((hl0) objY).g));
        } else {
            jh2Var.j(gp4.V(objY));
        }
    }

    @Override // defpackage.ih2
    public final boolean w() {
        return false;
    }
}
