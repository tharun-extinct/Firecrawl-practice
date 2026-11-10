package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ui extends vi {
    public float g;
    public float n;
    public float r;
    public float y;

    public ui(float f, float f2, float f3, float f4) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ui)) {
            return false;
        }
        ui uiVar = (ui) obj;
        return uiVar.g == this.g && uiVar.y == this.y && uiVar.r == this.r && uiVar.n == this.n;
    }

    @Override // defpackage.vi
    public final float g(int i) {
        if (i == 0) {
            return this.g;
        }
        if (i == 1) {
            return this.y;
        }
        if (i == 2) {
            return this.r;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.n;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31);
    }

    @Override // defpackage.vi
    public final void n() {
        this.g = 0.0f;
        this.y = 0.0f;
        this.r = 0.0f;
        this.n = 0.0f;
    }

    @Override // defpackage.vi
    public final vi r() {
        return new ui(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final String toString() {
        float f = this.g;
        float f2 = this.y;
        float f3 = this.r;
        float f4 = this.n;
        StringBuilder sbU = du4.u("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbU.append(f3);
        sbU.append(", v4 = ");
        sbU.append(f4);
        return sbU.toString();
    }

    @Override // defpackage.vi
    public final void v(int i, float f) {
        if (i == 0) {
            this.g = f;
            return;
        }
        if (i == 1) {
            this.y = f;
        } else if (i == 2) {
            this.r = f;
        } else {
            if (i != 3) {
                return;
            }
            this.n = f;
        }
    }

    @Override // defpackage.vi
    public final int y() {
        return 4;
    }
}
