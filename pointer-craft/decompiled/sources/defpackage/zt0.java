package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zt0 {
    public final ek1 g;
    public final sq4 n;
    public final pp3 r;
    public final dm1 y;

    public zt0(ek1 ek1Var, dm1 dm1Var, float f, sq4 sq4Var) {
        this.g = ek1Var;
        this.y = dm1Var;
        this.r = new pp3(f);
        this.n = sq4Var;
    }

    public zt0(ek1 ek1Var, dm1 dm1Var, sq4 sq4Var, int i) {
        this(ek1Var, dm1Var, 0.0f, (i & 8) != 0 ? new sq4(eh.a) : sq4Var);
    }
}
