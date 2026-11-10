package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class go4 {
    public static final fo4 Companion = new fo4();
    public final byte[] g;
    public final String y;

    public /* synthetic */ go4(int i, String str, byte[] bArr) {
        if (3 != (i & 3)) {
            dd6.y(i, 3, eo4.g.r());
            throw null;
        }
        this.g = bArr;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go4)) {
            return false;
        }
        go4 go4Var = (go4) obj;
        return yf2.p(this.g, go4Var.g) && yf2.p(this.y, go4Var.y);
    }

    public final byte[] g() {
        return this.g;
    }

    public final int hashCode() {
        return this.y.hashCode() + (Arrays.hashCode(this.g) * 31);
    }

    public final String toString() {
        return xi3.a("SharedLayout(data=", Arrays.toString(this.g), ", name=", this.y, ")");
    }

    public go4(byte[] bArr, String str) {
        this.g = bArr;
        this.y = str;
    }
}
