package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud implements ou3 {
    public final short y;

    /* JADX WARN: Multi-variable type inference failed */
    public ud(int i) {
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ud.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.y == ((ud) obj).y;
    }

    public final int hashCode() {
        return this.y;
    }

    public final String toString() {
        return du4.w(this.y, "AndroidPointerIcon(type=", ")");
    }
}
