package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gk extends ik {
    public final List g;

    public gk(List list) {
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk) && this.g.equals(((gk) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "Settings(settingsCategories=" + this.g + ")";
    }
}
