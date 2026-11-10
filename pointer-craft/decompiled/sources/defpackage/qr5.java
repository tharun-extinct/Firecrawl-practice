package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qr5 {
    public String g;
    public hr5 y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr5)) {
            return false;
        }
        qr5 qr5Var = (qr5) obj;
        if (this.y != qr5Var.y) {
            return false;
        }
        return this.g.equals(qr5Var.g);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }
}
