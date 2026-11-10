package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aj1 {
    public final dj1 g;
    public final byte[] y;

    public aj1(dj1 dj1Var, byte[] bArr) {
        if (dj1Var == null) {
            l0.q("encoding is null");
            throw null;
        }
        if (bArr == null) {
            l0.q("bytes is null");
            throw null;
        }
        this.g = dj1Var;
        this.y = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        if (this.g.equals(aj1Var.g)) {
            return Arrays.equals(this.y, aj1Var.y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.g + ", bytes=[...]}";
    }
}
