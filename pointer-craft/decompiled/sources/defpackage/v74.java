package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v74 {
    public final Resources g;
    public final Resources.Theme y;

    public v74(Resources resources, Resources.Theme theme) {
        this.g = resources;
        this.y = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v74.class == obj.getClass()) {
            v74 v74Var = (v74) obj;
            if (this.g.equals(v74Var.g) && Objects.equals(this.y, v74Var.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.g, this.y);
    }
}
