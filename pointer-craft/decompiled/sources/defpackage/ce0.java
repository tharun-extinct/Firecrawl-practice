package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 extends ih2 implements be0 {
    public final nh2 q;

    public ce0(nh2 nh2Var) {
        this.q = nh2Var;
    }

    @Override // defpackage.ih2
    public final void c(Throwable th) {
        this.q.J(q());
    }

    @Override // defpackage.be0
    public final dh2 getParent() {
        return q();
    }

    @Override // defpackage.be0
    public final boolean r(Throwable th) {
        return q().P(th);
    }

    @Override // defpackage.ih2
    public final boolean w() {
        return true;
    }
}
