package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class la3 {
    public long[] g;
    public int y;

    public la3(int i) {
        this.g = i == 0 ? ty2.g : new long[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof la3) {
            la3 la3Var = (la3) obj;
            int i = la3Var.y;
            int i2 = this.y;
            if (i == i2) {
                long[] jArr = this.g;
                long[] jArr2 = la3Var.g;
                me2 me2VarK = xs2.K(0, i2);
                int i3 = me2VarK.j;
                int i4 = me2VarK.t;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void g(long j) {
        int i = this.y + 1;
        long[] jArrCopyOf = this.g;
        if (jArrCopyOf.length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
            this.g = jArrCopyOf;
        }
        int i2 = this.y;
        jArrCopyOf[i2] = j;
        this.y = i2 + 1;
    }

    public final int hashCode() {
        long[] jArr = this.g;
        int i = this.y;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.g;
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ la3() {
        this(16);
    }
}
