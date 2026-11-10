package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ug6 {
    public final String g;
    public final boolean y;

    public ug6(String str, boolean z) {
        jr2.t(str);
        this.g = str;
        jr2.t("com.google.android.gms");
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug6)) {
            return false;
        }
        ug6 ug6Var = (ug6) obj;
        return lb6.g(this.g, ug6Var.g) && lb6.g("com.google.android.gms", "com.google.android.gms") && lb6.g(null, null) && this.y == ug6Var.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, "com.google.android.gms", null, 4225, Boolean.valueOf(this.y)});
    }

    public final String toString() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        jr2.m(null);
        throw null;
    }
}
