package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ti extends vi {
    public float g;
    public float r;
    public float y;

    public ti(float f, float f2, float f3) {
        this.g = f;
        this.y = f2;
        this.r = f3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ti)) {
            return false;
        }
        ti tiVar = (ti) obj;
        return tiVar.g == this.g && tiVar.y == this.y && tiVar.r == this.r;
    }

    @Override // defpackage.vi
    public final float g(int i) {
        if (i == 0) {
            return this.g;
        }
        if (i == 1) {
            return this.y;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.r;
    }

    public final int hashCode() {
        return Float.hashCode(this.r) + fj.y(this.y, Float.hashCode(this.g) * 31, 31);
    }

    @Override // defpackage.vi
    public final void n() {
        this.g = 0.0f;
        this.y = 0.0f;
        this.r = 0.0f;
    }

    @Override // defpackage.vi
    public final vi r() {
        return new ti(0.0f, 0.0f, 0.0f);
    }

    public final String toString() {
        float f = this.g;
        float f2 = this.y;
        float f3 = this.r;
        StringBuilder sbU = du4.u("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbU.append(f3);
        return sbU.toString();
    }

    @Override // defpackage.vi
    public final void v(int i, float f) {
        if (i == 0) {
            this.g = f;
        } else if (i == 1) {
            this.y = f;
        } else {
            if (i != 2) {
                return;
            }
            this.r = f;
        }
    }

    @Override // defpackage.vi
    public final int y() {
        return 3;
    }
}
