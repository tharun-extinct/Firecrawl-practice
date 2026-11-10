package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f35 implements pj {
    public static final f35 r = new f35(null);
    public final String y;

    public /* synthetic */ f35(String str) {
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f35) {
            return lb6.g(this.y, ((f35) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.y});
    }
}
