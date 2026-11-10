package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ri extends vi {
    public float g;

    public ri(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ri) && ((ri) obj).g == this.g;
    }

    @Override // defpackage.vi
    public final float g(int i) {
        if (i == 0) {
            return this.g;
        }
        return 0.0f;
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    @Override // defpackage.vi
    public final void n() {
        this.g = 0.0f;
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.g;
    }

    @Override // defpackage.vi
    public final void v(int i, float f) {
        if (i == 0) {
            this.g = f;
        }
    }
}
