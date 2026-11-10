package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o91 {
    public final boolean g;
    public final ch4 r;
    public final boolean y;

    public o91(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.g = z;
        this.y = z2;
        this.r = ch4.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o91)) {
            return false;
        }
        o91 o91Var = (o91) obj;
        return this.g == o91Var.g && this.y == o91Var.y && this.r == o91Var.r;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) + xi3.l((this.r.hashCode() + xi3.l(Boolean.hashCode(this.g) * 31, 31, this.y)) * 31, 31, true)) * 31) + 2) * 31;
    }
}
