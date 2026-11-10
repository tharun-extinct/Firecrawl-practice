package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i75 {
    public final long a;
    public final cj g;
    public final fl2 j;
    public final j51 l;
    public final int n;
    public final List r;
    public final ku1 t;
    public final boolean v;
    public final int x;
    public final k85 y;

    public i75(cj cjVar, k85 k85Var, List list, int i, boolean z, int i2, j51 j51Var, fl2 fl2Var, ku1 ku1Var, long j) {
        this.g = cjVar;
        this.y = k85Var;
        this.r = list;
        this.n = i;
        this.v = z;
        this.x = i2;
        this.l = j51Var;
        this.j = fl2Var;
        this.t = ku1Var;
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i75)) {
            return false;
        }
        i75 i75Var = (i75) obj;
        return yf2.p(this.g, i75Var.g) && yf2.p(this.y, i75Var.y) && yf2.p(this.r, i75Var.r) && this.n == i75Var.n && this.v == i75Var.v && this.x == i75Var.x && yf2.p(this.l, i75Var.l) && this.j == i75Var.j && yf2.p(this.t, i75Var.t) && ws0.r(this.a, i75Var.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + ((this.t.hashCode() + ((this.j.hashCode() + ((this.l.hashCode() + du4.r(this.x, xi3.l((((this.r.hashCode() + ei3.r(this.y, this.g.hashCode() * 31, 31)) * 31) + this.n) * 31, 31, this.v), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int i = this.x;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        return "TextLayoutInput(text=" + ((Object) this.g) + ", style=" + this.y + ", placeholders=" + this.r + ", maxLines=" + this.n + ", softWrap=" + this.v + ", overflow=" + str + ", density=" + this.l + ", layoutDirection=" + this.j + ", fontFamilyResolver=" + this.t + ", constraints=" + ws0.q(this.a) + ")";
    }
}
