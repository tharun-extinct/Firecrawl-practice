package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class cu0 {
    public final Uri g;
    public final boolean y;

    public cu0(boolean z, Uri uri) {
        this.g = uri;
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cu0.class == obj.getClass()) {
            cu0 cu0Var = (cu0) obj;
            if (this.y == cu0Var.y && this.g.equals(cu0Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final Uri g() {
        return this.g;
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + (this.y ? 1 : 0);
    }

    public final boolean y() {
        return this.y;
    }
}
