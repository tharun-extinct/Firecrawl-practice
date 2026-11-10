package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rm3 implements n14 {
    public f41 g;
    public volatile n14 y;
    public static final uo1 r = new uo1((byte) 19);
    public static final jm0 n = new jm0(5);

    public rm3(uo1 uo1Var, n14 n14Var) {
        this.g = uo1Var;
        this.y = n14Var;
    }

    @Override // defpackage.n14
    public final Object get() {
        return this.y.get();
    }
}
