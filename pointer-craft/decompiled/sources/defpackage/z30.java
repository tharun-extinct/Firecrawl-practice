package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z30 {
    public final byte[] g;
    public final boolean y;

    public z30(byte[] bArr) {
        this.g = bArr;
        this.y = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z30)) {
            return false;
        }
        z30 z30Var = (z30) obj;
        return yf2.p(this.g, z30Var.g) && this.y == z30Var.y;
    }

    public final byte[] g() {
        return this.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + (Arrays.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "QueuedReport(bytes=" + Arrays.toString(this.g) + ", completesKeystroke=" + this.y + ")";
    }

    public final boolean y() {
        return this.y;
    }

    public z30(byte[] bArr, boolean z) {
        this.g = bArr;
        this.y = z;
    }
}
