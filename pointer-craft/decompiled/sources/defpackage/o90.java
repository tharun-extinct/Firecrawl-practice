package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o90 extends uz5 {
    public final int y;

    public o90(int i) {
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o90) && this.y == ((o90) obj).y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y);
    }

    public final String toString() {
        return du4.w(this.y, "FunctionType(functionKeyCode=", ")");
    }
}
