package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class mb1 {
    public final String g;
    public final int y;

    public mb1(String str, int i) throws EOFException {
        String strY = ss5.y(str);
        if (strY == null) {
            l0.u("unexpected hostname: ".concat(str));
            throw null;
        }
        this.g = strY;
        if (i == -1) {
            i = 443;
        } else if (1 > i || i >= 65536) {
            l0.u(xi3.j("unexpected port: ", i));
            throw null;
        }
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mb1)) {
            return false;
        }
        mb1 mb1Var = (mb1) obj;
        return mb1Var.g.equals(this.g) && mb1Var.y == this.y;
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.y;
    }

    public final String toString() {
        int i = this.y;
        String str = this.g;
        if (i == 443) {
            return str;
        }
        return str + ':' + i;
    }
}
