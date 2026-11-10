package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc3 extends lr2 {
    public final mc3 v;

    public nc3(mc3 mc3Var) {
        this.v = mc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nc3.class != obj.getClass()) {
            return false;
        }
        return yf2.p(this.v, ((nc3) obj).v);
    }

    public final int hashCode() {
        mc3 mc3Var = this.v;
        if (mc3Var != null) {
            return mc3Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "NavBackStackEntryInfo(visibleEntry=" + this.v + ")";
    }
}
