package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kb4 implements t33, fb4 {
    public final xq g;
    public final j00 y;

    public kb4(xq xqVar, j00 j00Var) {
        this.g = xqVar;
        this.y = j00Var;
    }

    @Override // defpackage.fb4
    public final u33 a(us3[] us3VarArr, v33 v33Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return v33Var.k0(i, i2, qi1.j, new x51(us3VarArr, this, i2, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb4)) {
            return false;
        }
        kb4 kb4Var = (kb4) obj;
        return this.g.equals(kb4Var.g) && yf2.p(this.y, kb4Var.y);
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        return mu5.g(list, i, rf2Var.V(this.g.g()));
    }

    public final int hashCode() {
        return Float.hashCode(this.y.g) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.fb4
    public final int j(us3 us3Var) {
        return us3Var.t;
    }

    @Override // defpackage.fb4
    public final long l(int i, int i2, int i3, boolean z) {
        return !z ? zs0.g(i, i2, 0, i3) : y94.A(i, i2, 0, i3);
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        return mu5.r(list, i, rf2Var.V(this.g.g()));
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        return mq2.i(this, ws0.m(j), ws0.a(j), ws0.t(j), ws0.j(j), v33Var.V(this.g.g()), v33Var, list, new us3[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.fb4
    public final int t(us3 us3Var) {
        return us3Var.j;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.g + ", verticalAlignment=" + this.y + ")";
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        return mu5.n(list, i, rf2Var.V(this.g.g()));
    }

    @Override // defpackage.fb4
    public final void x(int i, int[] iArr, int[] iArr2, v33 v33Var) {
        this.g.j(v33Var, i, iArr, v33Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        return mu5.y(list, i, rf2Var.V(this.g.g()));
    }
}
