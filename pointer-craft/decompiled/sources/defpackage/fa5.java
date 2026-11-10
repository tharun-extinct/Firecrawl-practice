package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fa5 {
    public final int g;
    public final int y;

    public fa5(int i) {
        this.g = i;
        this.y = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa5)) {
            return false;
        }
        fa5 fa5Var = (fa5) obj;
        return this.g == fa5Var.g && this.y == fa5Var.y;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.g), Integer.valueOf(this.y));
    }

    public final String toString() {
        return String.valueOf(this.g) + "," + String.valueOf(this.y);
    }

    public fa5(int i, int i2) {
        this.g = i;
        this.y = i2;
    }
}
