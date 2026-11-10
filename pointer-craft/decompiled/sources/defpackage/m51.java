package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m51 implements j51 {
    public final float j;
    public final float t;

    public m51(float f, float f2) {
        this.j = f;
        this.t = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m51)) {
            return false;
        }
        m51 m51Var = (m51) obj;
        return Float.compare(this.j, m51Var.j) == 0 && Float.compare(this.t, m51Var.t) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.t) + (Float.hashCode(this.j) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.j + ", fontScale=" + this.t + ")";
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
