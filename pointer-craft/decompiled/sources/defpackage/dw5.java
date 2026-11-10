package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class dw5 extends s84 {
    public final PendingIntent j;
    public final boolean t;

    public dw5(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            l0.q("Null pendingIntent");
            throw null;
        }
        this.j = pendingIntent;
        this.t = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s84) {
            dw5 dw5Var = (dw5) ((s84) obj);
            if (this.j.equals(dw5Var.j) && this.t == dw5Var.t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.t ? 1237 : 1231) ^ ((this.j.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.j.toString() + ", isNoOp=" + this.t + "}";
    }
}
