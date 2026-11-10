package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ga2 {
    public final fa2 a;
    public final String g;
    public final boolean j;
    public final int l;
    public boolean m;
    public final float n;
    public final float r;
    public final ArrayList t;
    public final float v;
    public final long x;
    public final float y;

    public ga2(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? jj0.j : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.g = str;
        this.y = f;
        this.r = f2;
        this.n = f3;
        this.v = f4;
        this.x = j2;
        this.l = i3;
        this.j = z2;
        ArrayList arrayList = new ArrayList();
        this.t = arrayList;
        fa2 fa2Var = new fa2(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.a = fa2Var;
        arrayList.add(fa2Var);
    }

    public static void g(ga2 ga2Var, ArrayList arrayList, int i, cu4 cu4Var) {
        if (ga2Var.m) {
            mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = ga2Var.t;
        ((fa2) arrayList2.get(arrayList2.size() - 1)).a.add(new ij5("", arrayList, i, cu4Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final ha2 y() {
        if (this.m) {
            mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.t;
            if (arrayList.size() <= 1) {
                fa2 fa2Var = this.a;
                ha2 ha2Var = new ha2(this.g, this.y, this.r, this.n, this.v, new ej5(fa2Var.g, fa2Var.y, fa2Var.r, fa2Var.n, fa2Var.v, fa2Var.x, fa2Var.l, fa2Var.j, fa2Var.t, fa2Var.a), this.x, this.l, this.j);
                this.m = true;
                return ha2Var;
            }
            if (this.m) {
                mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            fa2 fa2Var2 = (fa2) arrayList.remove(arrayList.size() - 1);
            ((fa2) arrayList.get(arrayList.size() - 1)).a.add(new ej5(fa2Var2.g, fa2Var2.y, fa2Var2.r, fa2Var2.n, fa2Var2.v, fa2Var2.x, fa2Var2.l, fa2Var2.j, fa2Var2.t, fa2Var2.a));
        }
    }
}
