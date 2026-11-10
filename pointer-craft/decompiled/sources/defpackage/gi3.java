package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gi3 implements di2 {
    public final kk4 g;

    public gi3() {
        rx4 rx4Var = rx4.g;
        this.g = new kk4(rx4.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gi3.class != obj.getClass()) {
            return false;
        }
        rx4 rx4Var = rx4.g;
        return true;
    }

    public final int hashCode() {
        return rx4.g.hashCode();
    }

    @Override // defpackage.di2
    public final jk4 r() {
        return this.g;
    }

    @Override // defpackage.di2
    public final Object y(d04 d04Var) {
        if (cj0.s0(d04Var.g) == null) {
            return null;
        }
        return d04Var.n(rx4.g);
    }
}
