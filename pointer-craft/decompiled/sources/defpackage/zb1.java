package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zb1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb1) && vb1.y(10.0f, 10.0f) && vb1.y(40.0f, 40.0f) && vb1.y(10.0f, 10.0f) && vb1.y(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fj.y(40.0f, fj.y(10.0f, fj.y(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strR = vb1.r(10.0f);
        String strR2 = vb1.r(40.0f);
        String strR3 = vb1.r(10.0f);
        String strR4 = vb1.r(40.0f);
        StringBuilder sbZ = du4.z("DpTouchBoundsExpansion(start=", strR, ", top=", strR2, ", end=");
        sbZ.append(strR3);
        sbZ.append(", bottom=");
        sbZ.append(strR4);
        sbZ.append(", isLayoutDirectionAware=true)");
        return sbZ.toString();
    }
}
