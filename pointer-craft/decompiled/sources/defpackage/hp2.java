package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hp2 {
    public final int g;
    public final zf5[][] y;

    public hp2(int i, zf5[][] zf5VarArr) {
        this.g = i;
        this.y = zf5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp2)) {
            return false;
        }
        hp2 hp2Var = (hp2) obj;
        return this.g == hp2Var.g && this.y.equals(hp2Var.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "LayoutSection(title=" + this.g + ", keys=" + Arrays.toString(this.y) + ")";
    }
}
