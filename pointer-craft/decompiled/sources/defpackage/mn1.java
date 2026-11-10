package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mn1 extends u25 {
    public final /* synthetic */ ra4 v;
    public final /* synthetic */ nn1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn1(String str, ra4 ra4Var, nn1 nn1Var) {
        super(str, true);
        this.v = ra4Var;
        this.x = nn1Var;
    }

    @Override // defpackage.u25
    public final long r() throws InterruptedException {
        qa4 qa4Var;
        ra4 ra4Var = this.v;
        try {
            qa4Var = ra4Var.l();
        } catch (Throwable th) {
            qa4Var = new qa4(ra4Var, th, 2);
        }
        nn1 nn1Var = this.x;
        if (!nn1Var.m.contains(ra4Var)) {
            return -1L;
        }
        nn1Var.q.put(qa4Var);
        return -1L;
    }
}
