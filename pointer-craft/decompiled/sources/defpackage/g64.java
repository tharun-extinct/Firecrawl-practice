package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g64 {
    public final long g;
    public final nv l;
    public final long n;
    public final long r;
    public final long v;
    public final float[] x;
    public final long y;

    public g64(long j, long j2, long j3, long j4, long j5, nv nvVar, float[] fArr) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = j5;
        this.x = fArr;
        this.l = nvVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && g64.class == obj.getClass()) {
            g64 g64Var = (g64) obj;
            if (this.g == g64Var.g && this.y == g64Var.y && this.v == g64Var.v && je2.y(this.r, g64Var.r) && je2.y(this.n, g64Var.n)) {
                float[] fArr = g64Var.x;
                float[] fArr2 = this.x;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.l == g64Var.l;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iV = xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.v), 31, this.r), 31, this.n);
        float[] fArr = this.x;
        return this.l.hashCode() + ((iV + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
