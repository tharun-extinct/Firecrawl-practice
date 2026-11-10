package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i32 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof i32) && this.g == ((i32) obj).g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Boolean.FALSE, Boolean.TRUE});
    }
}
