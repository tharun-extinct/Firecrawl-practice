package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class h61 {
    public final Date a;
    public final String g;
    public final String j;
    public final int l;
    public final int n;
    public final int r;
    public final Date t;
    public final String v;
    public final int x;
    public final int y;

    public h61(String str, int i, int i2, int i3, String str2, int i4, int i5, String str3, Date date, Date date2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.g = str;
        this.y = i;
        this.r = i2;
        this.n = i3;
        this.v = str2;
        this.x = i4;
        this.l = i5;
        this.j = str3;
        this.t = date;
        this.a = date2;
    }

    public static h61 g(h61 h61Var, int i, int i2, int i3, String str, int i4, int i5, String str2, int i6) {
        String str3 = h61Var.g;
        if ((i6 & 2) != 0) {
            i = h61Var.y;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            i2 = h61Var.r;
        }
        int i8 = i2;
        if ((i6 & 8) != 0) {
            i3 = h61Var.n;
        }
        int i9 = i3;
        String str4 = (i6 & 16) != 0 ? h61Var.v : str;
        int i10 = (i6 & 32) != 0 ? h61Var.x : i4;
        int i11 = (i6 & 64) != 0 ? h61Var.l : i5;
        String str5 = (i6 & 128) != 0 ? h61Var.j : str2;
        Date date = h61Var.t;
        Date date2 = h61Var.a;
        h61Var.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new h61(str3, i7, i8, i9, str4, i10, i11, str5, date, date2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h61)) {
            return false;
        }
        h61 h61Var = (h61) obj;
        return yf2.p(this.g, h61Var.g) && this.y == h61Var.y && this.r == h61Var.r && this.n == h61Var.n && yf2.p(this.v, h61Var.v) && this.x == h61Var.x && this.l == h61Var.l && yf2.p(this.j, h61Var.j) && this.t.equals(h61Var.t) && this.a.equals(h61Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.t.hashCode() + xi3.x(du4.r(this.l, du4.r(this.x, xi3.x(du4.r(this.n, du4.r(this.r, du4.r(this.y, this.g.hashCode() * 31, 31), 31), 31), 31, this.v), 31), 31), 31, this.j)) * 31);
    }

    public final String toString() {
        return "DeviceConfig(macAddress=" + this.g + ", mousePointerSpeed=" + this.y + ", airMouseSpeed=" + this.r + ", scrollSpeed=" + this.n + ", mouseJiggleMode=" + this.v + ", layoutScreen=" + this.x + ", layoutScreenLayoutId=" + this.l + ", keyboardLanguageLayout=" + this.j + ", lastUsedDate=" + this.t + ", addedDate=" + this.a + ")";
    }

    public final String y() {
        return this.j;
    }
}
