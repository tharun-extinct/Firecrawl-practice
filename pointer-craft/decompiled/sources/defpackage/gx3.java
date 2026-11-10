package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class gx3 {
    public final boolean g;
    public final bz1 n;
    public final my1 r;
    public final boolean y;

    public gx3(boolean z, boolean z2, my1 my1Var, bz1 bz1Var) {
        this.g = z;
        this.y = z2;
        this.r = my1Var;
        this.n = bz1Var;
    }

    public static void g(gx3 gx3Var, String str, boolean z, my1 my1Var, int i) {
        Integer numValueOf = Integer.valueOf(R.string.premium_feature_fullscreen_mode);
        if ((i & 2) != 0) {
            numValueOf = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        gx3Var.getClass();
        if (!z || gx3Var.g) {
            my1Var.g();
        } else {
            gx3Var.n.l(str, numValueOf);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx3)) {
            return false;
        }
        gx3 gx3Var = (gx3) obj;
        return this.g == gx3Var.g && this.y == gx3Var.y && this.r.equals(gx3Var.r) && this.n.equals(gx3Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + xi3.l(Boolean.hashCode(this.g) * 31, 31, this.y)) * 31);
    }

    public final String toString() {
        return "PremiumStatus(isPremium=" + this.g + ", isSubscribed=" + this.y + ", showPurchaseDiagnostics=" + this.r + ", showPremiumMessage=" + this.n + ")";
    }
}
