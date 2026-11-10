package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qk2 {
    public static final qk2 g;

    static {
        qk2 qk2Var = new qk2();
        if (vb1.g(0.0f, 0.0f) < 0 || vb1.g(0.0f, 0.0f) < 0 || vb1.g(0.0f, 0.0f) < 0 || vb1.g(0.0f, 0.0f) < 0) {
            lc2.g("Layer outsets must be non-negative");
        }
        g = qk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk2) && vb1.y(0.0f, 0.0f) && vb1.y(0.0f, 0.0f) && vb1.y(0.0f, 0.0f) && vb1.y(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + fj.y(0.0f, fj.y(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String strR = vb1.r(0.0f);
        String strR2 = vb1.r(0.0f);
        String strR3 = vb1.r(0.0f);
        String strR4 = vb1.r(0.0f);
        StringBuilder sbZ = du4.z("LayerOutsets(left=", strR, ", top=", strR2, ", right=");
        sbZ.append(strR3);
        sbZ.append(", bottom=");
        sbZ.append(strR4);
        sbZ.append(")");
        return sbZ.toString();
    }
}
