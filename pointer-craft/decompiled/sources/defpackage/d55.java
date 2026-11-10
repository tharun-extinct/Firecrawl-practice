package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d55 {
    public final xy1 a;
    public final mt2 g;
    public final hg5 j;
    public final aj3 l;
    public final int m;
    public final boolean n;
    public final k65 r;
    public final y01 t;
    public final boolean v;
    public final t75 x;
    public final b65 y;

    public d55(mt2 mt2Var, b65 b65Var, k65 k65Var, boolean z, boolean z2, t75 t75Var, aj3 aj3Var, hg5 hg5Var, y01 y01Var, xy1 xy1Var, int i) {
        this.g = mt2Var;
        this.y = b65Var;
        this.r = k65Var;
        this.n = z;
        this.v = z2;
        this.x = t75Var;
        this.l = aj3Var;
        this.j = hg5Var;
        this.t = y01Var;
        this.a = xy1Var;
        this.m = i;
    }

    public final void g(List list) {
        rk4 rk4Var = this.g.n;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new mo1());
        this.a.a(rk4Var.w(arrayList));
    }
}
