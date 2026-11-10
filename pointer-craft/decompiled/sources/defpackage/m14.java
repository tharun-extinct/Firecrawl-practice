package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m14 {
    public final j14 g;
    public boolean l = true;
    public final xy1 n;
    public final ot4 r;
    public final boolean v;
    public final Object x;
    public final boolean y;

    public m14(j14 j14Var, Object obj, boolean z, ot4 ot4Var, xy1 xy1Var, boolean z2) {
        this.g = j14Var;
        this.y = z;
        this.r = ot4Var;
        this.n = xy1Var;
        this.v = z2;
        this.x = obj;
    }

    public final Object g() {
        if (this.y) {
            return null;
        }
        Object obj = this.x;
        if (obj != null) {
            return obj;
        }
        qo0.y("Unexpected form of a provided value");
        l0.x();
        return null;
    }
}
