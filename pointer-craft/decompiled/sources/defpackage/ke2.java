package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ke2 implements Iterable, vh2 {
    public final int a;
    public final int j;
    public final int t;

    public ke2(int i, int i2, int i3) {
        if (i3 == 0) {
            l0.u("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            l0.u("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.j = i;
        this.t = br2.h(i, i2, i3);
        this.a = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ke2)) {
            return false;
        }
        if (isEmpty() && ((ke2) obj).isEmpty()) {
            return true;
        }
        ke2 ke2Var = (ke2) obj;
        return this.j == ke2Var.j && this.t == ke2Var.t && this.a == ke2Var.a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.j * 31) + this.t) * 31) + this.a;
    }

    public boolean isEmpty() {
        int i = this.t;
        int i2 = this.a;
        int i3 = this.j;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new le2(this.j, this.t, this.a);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.t;
        int i2 = this.a;
        int i3 = this.j;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
