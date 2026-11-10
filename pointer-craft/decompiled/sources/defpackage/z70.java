package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z70 {
    public final qj0 g;
    public final qj0 y;

    public z70(qj0 qj0Var, qj0 qj0Var2) {
        this.g = qj0Var;
        this.y = qj0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z70.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        z70 z70Var = (z70) obj;
        return this.g.equals(z70Var.g) && this.y.equals(z70Var.y);
    }

    public final qj0 g() {
        return this.g;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final qj0 y() {
        return this.y;
    }
}
