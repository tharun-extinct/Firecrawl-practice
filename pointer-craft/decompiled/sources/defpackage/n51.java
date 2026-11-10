package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n51 implements j51 {
    public final iv1 a;
    public final float j;
    public final float t;

    public n51(float f, float f2, iv1 iv1Var) {
        this.j = f;
        this.t = f2;
        this.a = iv1Var;
    }

    @Override // defpackage.j51
    public final float M(long j) {
        if (o85.g(n85.y(j), 4294967296L)) {
            return this.a.y(n85.r(j));
        }
        l0.z("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n51)) {
            return false;
        }
        n51 n51Var = (n51) obj;
        return Float.compare(this.j, n51Var.j) == 0 && Float.compare(this.t, n51Var.t) == 0 && this.a.equals(n51Var.a);
    }

    @Override // defpackage.j51
    public final long f(float f) {
        return kq2.O(this.a.g(f), 4294967296L);
    }

    public final int hashCode() {
        return this.a.hashCode() + fj.y(this.t, Float.hashCode(this.j) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("DensityWithConverter(density=", this.j, ", fontScale=", this.t, ", converter=");
        sbU.append(this.a);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // defpackage.j51
    public final float w() {
        return this.t;
    }

    @Override // defpackage.j51
    public final float y() {
        return this.j;
    }
}
