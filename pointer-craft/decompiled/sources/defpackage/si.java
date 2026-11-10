package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si extends vi {
    public float g;
    public float y;

    public si(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        return siVar.g == this.g && siVar.y == this.y;
    }

    @Override // defpackage.vi
    public final float g(int i) {
        if (i == 0) {
            return this.g;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.y;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.g) * 31);
    }

    @Override // defpackage.vi
    public final void n() {
        this.g = 0.0f;
        this.y = 0.0f;
    }

    @Override // defpackage.vi
    public final vi r() {
        return new si(0.0f, 0.0f);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.g + ", v2 = " + this.y;
    }

    @Override // defpackage.vi
    public final void v(int i, float f) {
        if (i == 0) {
            this.g = f;
        } else {
            if (i != 1) {
                return;
            }
            this.y = f;
        }
    }

    @Override // defpackage.vi
    public final int y() {
        return 2;
    }
}
