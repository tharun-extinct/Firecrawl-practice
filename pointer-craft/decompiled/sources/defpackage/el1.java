package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class el1 extends hx0 {
    public static final /* synthetic */ int w = 0;
    public long a;
    public boolean m;
    public dr q;

    public final void S(boolean z) {
        long j = this.a - (z ? 4294967296L : 1L);
        this.a = j;
        if (j <= 0 && this.m) {
            shutdown();
        }
    }

    public final void T(ka1 ka1Var) {
        dr drVar = this.q;
        if (drVar == null) {
            drVar = new dr();
            this.q = drVar;
        }
        drVar.addLast(ka1Var);
    }

    public final void U(boolean z) {
        this.a = (z ? 4294967296L : 1L) + this.a;
        if (z) {
            return;
        }
        this.m = true;
    }

    public abstract long V();

    public final boolean W() {
        dr drVar = this.q;
        if (drVar == null) {
            return false;
        }
        ka1 ka1Var = (ka1) (drVar.isEmpty() ? null : drVar.removeFirst());
        if (ka1Var == null) {
            return false;
        }
        ka1Var.run();
        return true;
    }

    public abstract void shutdown();
}
