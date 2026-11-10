package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ha0 {
    public static final /* synthetic */ int c = 0;
    public final boolean a;
    public final boolean g;
    public final int j;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final boolean q;
    public final int r;
    public final int t;
    public final boolean v;
    public String w;
    public final boolean x;
    public final boolean y;

    static {
        aj6 aj6Var = mf1.j;
        long j = mf1.j(ye6.x(Integer.MAX_VALUE), pf1.SECONDS);
        if (j >= 0) {
            return;
        }
        up.t("maxStale < 0: ", j);
    }

    public ha0(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.g = z;
        this.y = z2;
        this.r = i;
        this.n = i2;
        this.v = z3;
        this.x = z4;
        this.l = z5;
        this.j = i3;
        this.t = i4;
        this.a = z6;
        this.m = z7;
        this.q = z8;
        this.w = str;
    }

    public final String toString() {
        String str = this.w;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("no-cache, ");
        }
        if (this.y) {
            sb.append("no-store, ");
        }
        int i = this.r;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.n;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.v) {
            sb.append("private, ");
        }
        if (this.x) {
            sb.append("public, ");
        }
        if (this.l) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.j;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.t;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.a) {
            sb.append("only-if-cached, ");
        }
        if (this.m) {
            sb.append("no-transform, ");
        }
        if (this.q) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.w = string;
        return string;
    }
}
