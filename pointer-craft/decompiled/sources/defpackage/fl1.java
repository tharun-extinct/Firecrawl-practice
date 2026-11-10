package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends hl1 {
    public final ib0 a;
    public final /* synthetic */ jl1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(jl1 jl1Var, long j, ib0 ib0Var) {
        super(j);
        this.m = jl1Var;
        this.a = ib0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws ha1 {
        this.a.E(this.m);
    }

    @Override // defpackage.hl1
    public final String toString() {
        return super.toString() + this.a;
    }
}
