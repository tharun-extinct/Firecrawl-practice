package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 implements iv1 {
    public final float g;

    public cv2(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv2) && Float.compare(this.g, ((cv2) obj).g) == 0;
    }

    @Override // defpackage.iv1
    public final float g(float f) {
        return f / this.g;
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.g + ")";
    }

    @Override // defpackage.iv1
    public final float y(float f) {
        return f * this.g;
    }
}
