package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cv {
    public final String g;
    public final xx3 r;
    public final byte[] y;

    public cv(String str, byte[] bArr, xx3 xx3Var) {
        this.g = str;
        this.y = bArr;
        this.r = xx3Var;
    }

    public static ro g() {
        ro roVar = new ro((byte) 5, false);
        roVar.m = xx3.j;
        return roVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cv) {
            cv cvVar = (cv) obj;
            if (this.g.equals(cvVar.g)) {
                if (Arrays.equals(this.y, cvVar instanceof cv ? cvVar.y : cvVar.y) && this.r.equals(cvVar.r)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() ^ ((((this.g.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.y)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.y;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        return du4.b(sb, strEncodeToString, ")");
    }
}
