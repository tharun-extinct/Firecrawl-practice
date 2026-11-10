package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh2 extends ih2 {
    public final ce0 c;
    public final Object i;
    public final nh2 q;
    public final lh2 w;

    public kh2(nh2 nh2Var, lh2 lh2Var, ce0 ce0Var, Object obj) {
        this.q = nh2Var;
        this.w = lh2Var;
        this.c = ce0Var;
        this.i = obj;
    }

    @Override // defpackage.ih2
    public final void c(Throwable th) {
        ce0 ce0Var = this.c;
        ce0 ce0VarI0 = nh2.i0(ce0Var);
        nh2 nh2Var = this.q;
        lh2 lh2Var = this.w;
        Object obj = this.i;
        if (ce0VarI0 == null || !nh2Var.q0(lh2Var, ce0VarI0, obj)) {
            lh2Var.j.v(new vv2(2), 2);
            ce0 ce0VarI1 = nh2.i0(ce0Var);
            if (ce0VarI1 == null || !nh2Var.q0(lh2Var, ce0VarI1, obj)) {
                nh2Var.B(nh2Var.S(lh2Var, obj));
            }
        }
    }

    @Override // defpackage.ih2
    public final boolean w() {
        return false;
    }
}
