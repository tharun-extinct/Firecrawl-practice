package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class me2 extends ke2 {
    public static final me2 m = new me2(1, 0, 1);

    @Override // defpackage.ke2
    public final boolean equals(Object obj) {
        if (!(obj instanceof me2)) {
            return false;
        }
        if (isEmpty() && ((me2) obj).isEmpty()) {
            return true;
        }
        me2 me2Var = (me2) obj;
        return this.j == me2Var.j && this.t == me2Var.t;
    }

    @Override // defpackage.ke2
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.j * 31) + this.t;
    }

    @Override // defpackage.ke2
    public final boolean isEmpty() {
        return this.j > this.t;
    }

    @Override // defpackage.ke2
    public final String toString() {
        return this.j + ".." + this.t;
    }
}
