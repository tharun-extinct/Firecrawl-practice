package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nr4 implements vo0, Iterable, vh2 {
    public final int a;
    public final mr4 j;
    public final int t;

    public nr4(mr4 mr4Var, int i, int i2) {
        this.j = mr4Var;
        this.t = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nr4)) {
            return false;
        }
        nr4 nr4Var = (nr4) obj;
        return nr4Var.t == this.t && nr4Var.a == this.a && nr4Var.j == this.j;
    }

    public final int hashCode() {
        return (this.j.hashCode() * 31) + this.t;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        mr4 mr4Var = this.j;
        if (mr4Var.i != this.a) {
            or4.v();
        }
        int i = this.t;
        mr4Var.l(i);
        return new l42(mr4Var, i + 1, mr4Var.j[(i * 5) + 3] + i);
    }
}
