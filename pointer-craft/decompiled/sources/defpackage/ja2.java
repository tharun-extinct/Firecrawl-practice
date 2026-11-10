package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class ja2 {
    public final Resources.Theme g;
    public final int y;

    public ja2(Resources.Theme theme, int i) {
        this.g = theme;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja2)) {
            return false;
        }
        ja2 ja2Var = (ja2) obj;
        return yf2.p(this.g, ja2Var.g) && this.y == ja2Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.g + ", id=" + this.y + ")";
    }
}
