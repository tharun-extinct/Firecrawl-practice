package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class nz1 extends ta0 implements lz1, uh2, jz1 {
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public nz1(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nz1) {
            nz1 nz1Var = (nz1) obj;
            return this.m.equals(nz1Var.m) && this.q.equals(nz1Var.q) && yf2.p(this.t, nz1Var.t) && v().equals(nz1Var.v());
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        uh2 uh2Var = this.j;
        if (uh2Var == null) {
            n();
            this.j = this;
            this = this;
        } else {
            r2 = uh2Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        v();
        return this.q.hashCode() + xi3.x(v().hashCode() * 31, 31, this.m);
    }

    @Override // defpackage.lz1
    public final int r() {
        return this.c;
    }

    public final String toString() {
        uh2 uh2Var = this.j;
        if (uh2Var == null) {
            n();
            this.j = this;
            uh2Var = this;
        }
        if (uh2Var != this) {
            return uh2Var.toString();
        }
        String str = this.m;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : du4.i("function ", str, " (Kotlin reflection is not available)");
    }

    public nz1(int i, Class cls, String str, String str2, int i2) {
        this(i, sa0.j, cls, str, str2, i2);
    }
}
