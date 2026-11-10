package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yw2 extends zw2 {
    public final qz0 g;

    public yw2(qz0 qz0Var) {
        this.g = qz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yw2.class != obj.getClass()) {
            return false;
        }
        return this.g.equals(((yw2) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode() + (yw2.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.g + '}';
    }
}
