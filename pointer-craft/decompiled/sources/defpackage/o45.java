package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o45 {
    public rv a;
    public final cj g;
    public final ku1 j;
    public final j51 l;
    public fl2 m;
    public final List t;
    public final boolean v;
    public final k85 y;
    public final int r = Integer.MAX_VALUE;
    public final boolean n = true;
    public final boolean x = true;

    public o45(cj cjVar, j51 j51Var, ku1 ku1Var, k85 k85Var, List list, boolean z) {
        this.g = cjVar;
        this.y = k85Var;
        this.v = z;
        this.l = j51Var;
        this.j = ku1Var;
        this.t = list;
    }

    public final void g(fl2 fl2Var) {
        rv rvVar = this.a;
        if (rvVar == null || fl2Var != this.m || rvVar.y()) {
            this.m = fl2Var;
            rvVar = new rv(this.g, this.l, this.j, v13.D(this.y, fl2Var), this.t, this.v);
        }
        this.a = rvVar;
    }
}
