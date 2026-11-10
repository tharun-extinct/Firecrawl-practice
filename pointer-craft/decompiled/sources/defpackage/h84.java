package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h84 implements Serializable {
    public final Object j;

    public static final Throwable g(Object obj) {
        if (obj instanceof g84) {
            return ((g84) obj).j;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h84) {
            return yf2.p(this.j, ((h84) obj).j);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.j;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.j;
        if (obj instanceof g84) {
            return ((g84) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
