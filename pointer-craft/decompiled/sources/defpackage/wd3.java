package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wd3 {
    public final boolean g;
    public String j;
    public final int l;
    public final boolean n;
    public final int r;
    public final boolean v;
    public final int x;
    public final boolean y;

    public wd3(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.g = z;
        this.y = z2;
        this.r = i;
        this.n = z3;
        this.v = z4;
        this.x = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wd3)) {
            return false;
        }
        wd3 wd3Var = (wd3) obj;
        return this.g == wd3Var.g && this.y == wd3Var.y && this.r == wd3Var.r && yf2.p(this.j, wd3Var.j) && this.n == wd3Var.n && this.v == wd3Var.v && this.x == wd3Var.x && this.l == wd3Var.l;
    }

    public final int g() {
        return this.r;
    }

    public final int hashCode() {
        int i = (((((this.g ? 1 : 0) * 31) + (this.y ? 1 : 0)) * 31) + this.r) * 31;
        String str = this.j;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 29791) + (this.n ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + this.x) * 31) + this.l) * 31) - 1) * 31) - 1;
    }

    public final boolean n() {
        return this.g;
    }

    public final boolean r() {
        return this.n;
    }

    public final String toString() {
        String str = this.j;
        StringBuilder sb = new StringBuilder(wd3.class.getSimpleName());
        sb.append("(");
        if (this.g) {
            sb.append("launchSingleTop ");
        }
        if (this.y) {
            sb.append("restoreState ");
        }
        if ((str != null || this.r != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.n) {
                sb.append(" inclusive");
            }
            if (this.v) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.l;
        int i2 = this.x;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }

    public final boolean v() {
        return this.v;
    }

    public final boolean x() {
        return this.y;
    }

    public final String y() {
        return this.j;
    }
}
