package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x10 {
    public final f24 a;
    public final String b;
    public final c84 c;
    public final fu3 g;
    public final boolean i;
    public final f24 j;
    public final boolean l;
    public final List m;
    public final int n;
    public final Long q;
    public final boolean r;
    public final f24 t;
    public final fz3 v;
    public final o20 w;
    public final boolean x;
    public final boolean y;

    public x10(fu3 fu3Var, boolean z, boolean z2, int i, fz3 fz3Var, boolean z3, boolean z4, f24 f24Var, f24 f24Var2, f24 f24Var3, List list, Long l, o20 o20Var, c84 c84Var, boolean z5, String str) {
        fu3Var.getClass();
        fz3Var.getClass();
        list.getClass();
        this.g = fu3Var;
        this.y = z;
        this.r = z2;
        this.n = i;
        this.v = fz3Var;
        this.x = z3;
        this.l = z4;
        this.j = f24Var;
        this.t = f24Var2;
        this.a = f24Var3;
        this.m = list;
        this.q = l;
        this.w = o20Var;
        this.c = c84Var;
        this.i = z5;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x10)) {
            return false;
        }
        x10 x10Var = (x10) obj;
        return this.g == x10Var.g && this.y == x10Var.y && this.r == x10Var.r && this.n == x10Var.n && this.v == x10Var.v && this.x == x10Var.x && this.l == x10Var.l && yf2.p(this.j, x10Var.j) && this.t.equals(x10Var.t) && this.a.equals(x10Var.a) && yf2.p(this.m, x10Var.m) && yf2.p(this.q, x10Var.q) && this.w.equals(x10Var.w) && this.c == x10Var.c && this.i == x10Var.i && yf2.p(this.b, x10Var.b);
    }

    public final int hashCode() {
        int iL = xi3.l(xi3.l((this.v.hashCode() + du4.r(this.n, xi3.l(xi3.l(this.g.hashCode() * 31, 31, this.y), 31, this.r), 31)) * 31, 31, this.x), 31, this.l);
        f24 f24Var = this.j;
        int iHashCode = (this.m.hashCode() + ((this.a.hashCode() + ((this.t.hashCode() + ((iL + (f24Var == null ? 0 : f24Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        Long l = this.q;
        int iL2 = xi3.l((this.c.hashCode() + ((this.w.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31, 31, this.i);
        String str = this.b;
        return iL2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BillingDiagnostics(playStoreState=" + this.g + ", playStoreUpdatedRecently=" + this.y + ", installedFromPlay=" + this.r + ", connectionState=" + this.n + ", productAvailability=" + this.v + ", productDetailsSupported=" + this.x + ", subscriptionsSupported=" + this.l + ", productError=" + this.j + ", inapp=" + this.t + ", subs=" + this.a + ", purchasesFound=" + this.m + ", previouslyConfirmedAt=" + this.q + ", outcomeKind=" + this.w + ", restoreResult=" + this.c + ", isPremium=" + this.i + ", countryCode=" + this.b + ")";
    }
}
