package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zg4 implements oj0, kz1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ e04 y;

    public /* synthetic */ zg4(e04 e04Var, byte b) {
        this.g = b;
        this.y = e04Var;
    }

    public final boolean equals(Object obj) {
        byte b = this.g;
        e04 e04Var = this.y;
        switch (b) {
            case 0:
                if ((obj instanceof oj0) && (obj instanceof kz1)) {
                    return ((xx2) e04Var).equals(((kz1) obj).y());
                }
                return false;
            default:
                if ((obj instanceof oj0) && (obj instanceof kz1)) {
                    return e04Var.equals(((kz1) obj).y());
                }
                return false;
        }
    }

    @Override // defpackage.oj0
    public final long g() {
        byte b = this.g;
        e04 e04Var = this.y;
        switch (b) {
            case 0:
                return ((jj0) ((xx2) e04Var).get()).g;
            default:
                return ((jj0) e04Var.get()).g;
        }
    }

    public final int hashCode() {
        byte b = this.g;
        e04 e04Var = this.y;
        switch (b) {
            case 0:
                return ((xx2) e04Var).hashCode();
            default:
                return e04Var.hashCode();
        }
    }

    @Override // defpackage.kz1
    public final jz1 y() {
        byte b = this.g;
        e04 e04Var = this.y;
        switch (b) {
            case 0:
                return (xx2) e04Var;
            default:
                return e04Var;
        }
    }
}
