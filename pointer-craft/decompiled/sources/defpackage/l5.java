package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l5 implements o14 {
    public final /* synthetic */ byte g;

    public /* synthetic */ l5(byte b) {
        this.g = b;
    }

    @Override // defpackage.p14
    public final Object get() {
        switch (this.g) {
            case 0:
                return hg6.y();
            default:
                x21 x21Var = na1.g;
                if (x21Var != null) {
                    return k33.x(a11.k(v13.v(), x21Var));
                }
                l0.q("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
