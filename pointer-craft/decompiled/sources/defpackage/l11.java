package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l11 {
    public final List g;
    public final int r;
    public final float[] y;

    public l11(List list, float[] fArr) {
        this.g = list;
        this.y = fArr;
        if (list.size() != fArr.length) {
            pc2.g("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + pr.h0(fArr));
        }
        this.r = fArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l11)) {
            return false;
        }
        l11 l11Var = (l11) obj;
        return this.g.equals(l11Var.g) && Arrays.equals(this.y, l11Var.y) && this.r == l11Var.r;
    }

    public final Object g(float f) {
        float[] fArr = this.y;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.g.get(i2);
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.y) + (this.g.hashCode() * 31)) * 31) + this.r;
    }

    public final float r(Object obj) {
        int iIndexOf = this.g.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.y;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.r;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            Object objM0 = cj0.m0(i, this.g);
            if (i >= 0) {
                float[] fArr = this.y;
                if (i < fArr.length) {
                    f = fArr[i];
                } else {
                    f = Float.NaN;
                }
            } else {
                f = Float.NaN;
            }
            sb.append(objM0 + "=" + f);
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public final Object y(float f, boolean z) {
        float[] fArr = this.y;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.g.get(i2);
    }
}
