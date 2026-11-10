package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class of4 implements qn3 {
    public final int j;
    public final List t;
    public Float a = null;
    public Float m = null;
    public cf4 q = null;
    public cf4 w = null;

    public of4(int i, ArrayList arrayList) {
        this.j = i;
        this.t = arrayList;
    }

    @Override // defpackage.qn3
    public final boolean A() {
        return this.t.contains(this);
    }

    public final void g(cf4 cf4Var) {
        this.q = cf4Var;
    }

    public final void y(cf4 cf4Var) {
        this.w = cf4Var;
    }
}
