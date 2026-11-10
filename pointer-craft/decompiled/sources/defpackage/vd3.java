package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vd3 {
    public boolean g;
    public String n;
    public boolean v;
    public boolean x;
    public boolean y;
    public int r = -1;
    public int l = -1;
    public int j = -1;

    public static void n(vd3 vd3Var, int i) {
        vd3Var.r = i;
        vd3Var.n = null;
        vd3Var.v = true;
        vd3Var.x = false;
    }

    public final wd3 g() {
        String str = this.n;
        boolean z = this.g;
        if (str == null) {
            return new wd3(z, this.y, this.r, this.v, this.x, this.l, this.j);
        }
        boolean z2 = this.y;
        boolean z3 = this.v;
        boolean z4 = this.x;
        int i = this.l;
        int i2 = this.j;
        int i3 = ad3.q;
        wd3 wd3Var = new wd3(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2);
        wd3Var.j = str;
        return wd3Var;
    }

    public final void r() {
        this.j = 0;
    }

    public final void y() {
        this.l = 0;
    }
}
