package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ry3 extends uy3 {
    public final float g;

    public ry3(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry3) && Float.compare(this.g, ((ry3) obj).g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "Running(progress=" + this.g + ")";
    }
}
