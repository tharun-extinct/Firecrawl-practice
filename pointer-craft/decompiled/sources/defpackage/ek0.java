package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements t33, fb4 {
    public final ar g;
    public final i00 y;

    public ek0(ar arVar, i00 i00Var) {
        this.g = arVar;
        this.y = i00Var;
    }

    @Override // defpackage.fb4
    public final u33 a(us3[] us3VarArr, v33 v33Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return v33Var.k0(i2, i, qi1.j, new dk0(us3VarArr, this, i2, v33Var, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek0)) {
            return false;
        }
        ek0 ek0Var = (ek0) obj;
        return this.g.equals(ek0Var.g) && this.y.equals(ek0Var.y);
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        return mu5.v(list, i, rf2Var.V(this.g.g()));
    }

    public final int hashCode() {
        return Float.hashCode(this.y.g) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.fb4
    public final int j(us3 us3Var) {
        return us3Var.j;
    }

    @Override // defpackage.fb4
    public final long l(int i, int i2, int i3, boolean z) {
        return !z ? zs0.g(0, i3, i, i2) : y94.e(0, i3, i, i2);
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        return mu5.l(list, i, rf2Var.V(this.g.g()));
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        return mq2.i(this, ws0.a(j), ws0.m(j), ws0.j(j), ws0.t(j), v33Var.V(this.g.g()), v33Var, list, new us3[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.fb4
    public final int t(us3 us3Var) {
        return us3Var.t;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.g + ", horizontalAlignment=" + this.y + ")";
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        return mu5.j(list, i, rf2Var.V(this.g.g()));
    }

    @Override // defpackage.fb4
    public final void x(int i, int[] iArr, int[] iArr2, v33 v33Var) {
        this.g.m(v33Var, i, iArr, iArr2);
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        return mu5.x(list, i, rf2Var.V(this.g.g()));
    }
}
