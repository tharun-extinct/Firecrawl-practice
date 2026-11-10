package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ga3 {
    public int[] g;
    public int y;

    public ga3(int i) {
        this.g = i == 0 ? pe2.g : new int[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ga3) {
            ga3 ga3Var = (ga3) obj;
            int i = ga3Var.y;
            int i2 = this.y;
            if (i == i2) {
                int[] iArr = this.g;
                int[] iArr2 = ga3Var.g;
                me2 me2VarK = xs2.K(0, i2);
                int i3 = me2VarK.j;
                int i4 = me2VarK.t;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void g(int i) {
        y(this.y + 1);
        int[] iArr = this.g;
        int i2 = this.y;
        iArr[i2] = i;
        this.y = i2 + 1;
    }

    public final int hashCode() {
        int[] iArr = this.g;
        int i = this.y;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final int n() {
        int i = this.y;
        if (i != 0) {
            return this.g[i - 1];
        }
        cf6.a("IntList is empty.");
        throw null;
    }

    public final int r(int i) {
        if (i >= 0 && i < this.y) {
            return this.g[i];
        }
        cf6.t("Index must be between 0 and size");
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.g;
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void v(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.y)) {
            cf6.t("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.g;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            pr.M(i, i + 1, i2, iArr, iArr);
        }
        this.y--;
    }

    public final void x(int i, int i2) {
        if (i < 0 || i >= this.y) {
            cf6.t("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.g;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final void y(int i) {
        int[] iArr = this.g;
        if (iArr.length < i) {
            this.g = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public /* synthetic */ ga3() {
        this(16);
    }
}
