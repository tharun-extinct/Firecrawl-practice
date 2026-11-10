package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class du {
    public final Iterable g;
    public final byte[] y;

    public du(ArrayList arrayList, byte[] bArr) {
        this.g = arrayList;
        this.y = bArr;
    }

    public static rk4 g() {
        return new rk4((byte) 4, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof du) {
            du duVar = (du) obj;
            if (this.g.equals(duVar.g) && Arrays.equals(this.y, duVar.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }

    public final byte[] r() {
        return this.y;
    }

    public final String toString() {
        return "BackendRequest{events=" + this.g + ", extras=" + Arrays.toString(this.y) + "}";
    }

    public final Iterable y() {
        return this.g;
    }
}
