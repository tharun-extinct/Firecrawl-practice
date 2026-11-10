package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i02 implements vo0 {
    public final so0 j;

    public i02(so0 so0Var) {
        this.j = so0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i02) {
            return this.j.equals(((i02) obj).j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() * 31;
    }
}
