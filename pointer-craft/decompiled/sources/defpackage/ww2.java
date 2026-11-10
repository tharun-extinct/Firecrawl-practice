package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ww2 extends zw2 {
    public final qz0 g = qz0.r;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ww2.class != obj.getClass()) {
            return false;
        }
        return this.g.equals(((ww2) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode() + (ww2.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.g + '}';
    }
}
