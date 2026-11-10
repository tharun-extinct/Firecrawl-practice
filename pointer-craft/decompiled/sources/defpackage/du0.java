package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class du0 {
    public final HashSet g = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || du0.class != obj.getClass()) {
            return false;
        }
        return this.g.equals(((du0) obj).g);
    }

    public final HashSet g() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
