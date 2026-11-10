package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p90 extends uz5 {
    public final List y;

    public p90(List list) {
        this.y = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p90) && this.y.equals(((p90) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return "ShortcutType(shortcuts=" + this.y + ")";
    }
}
