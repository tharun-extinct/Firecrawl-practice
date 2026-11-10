package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class iu4 implements vo0, Iterable, vh2 {
    public final f64 a;
    public final mr4 j;
    public final int t;

    public iu4(mr4 mr4Var, int i, j02 j02Var, f64 f64Var) {
        this.j = mr4Var;
        this.t = i;
        this.a = f64Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iu4)) {
            return false;
        }
        iu4 iu4Var = (iu4) obj;
        return iu4Var.t == this.t && iu4Var.j == this.j && iu4Var.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.j.hashCode() + (this.t * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g51(this.j, this.t, null, this.a);
    }
}
