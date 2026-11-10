package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hs2 extends g90 {
    public final /* synthetic */ j00 a;
    public final /* synthetic */ ss2 c;
    public final /* synthetic */ int j;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final long n;
    public final /* synthetic */ int q;
    public final dr2 r;
    public final /* synthetic */ r6 t;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ long w;
    public final /* synthetic */ dr2 x;
    public final fs2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs2(long j, boolean z, fs2 fs2Var, dr2 dr2Var, int i, int i2, r6 r6Var, j00 j00Var, int i3, int i4, long j2, ss2 ss2Var) {
        super((byte) 2);
        this.v = z;
        this.x = dr2Var;
        this.l = i;
        this.j = i2;
        this.t = r6Var;
        this.a = j00Var;
        this.m = i3;
        this.q = i4;
        this.w = j2;
        this.c = ss2Var;
        this.y = fs2Var;
        this.r = dr2Var;
        this.n = zs0.y(0, z ? ws0.t(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : ws0.j(j), 5);
    }

    public final ms2 u(int i, long j) {
        List list;
        fs2 fs2Var = this.y;
        Object objY = fs2Var.y(i);
        Object objR = fs2Var.r(i);
        ha3 ha3Var = (ha3) this.g;
        List list2 = (List) ha3Var.y(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listG = this.r.g(i);
            int size = listG.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((p33) listG.get(i2)).v(j));
            }
            ha3Var.t(i, arrayList);
            list = arrayList;
        }
        return new ms2(i, list, this.v, this.t, this.a, this.x.t.getLayoutDirection(), this.m, this.q, i != this.l + (-1) ? this.j : 0, this.w, objY, objR, this.c.i, j);
    }
}
