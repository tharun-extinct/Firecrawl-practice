package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b93 implements t33 {
    public final a93 g;

    public b93(a93 a93Var) {
        this.g = a93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b93) && yf2.p(this.g, ((b93) obj).g);
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        return this.g.g(rf2Var, aq2.i(rf2Var), i);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        return this.g.n(rf2Var, aq2.i(rf2Var), i);
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        return this.g.r(v33Var, aq2.i(v33Var), j);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.g + ")";
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        return this.g.v(rf2Var, aq2.i(rf2Var), i);
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        return this.g.y(rf2Var, aq2.i(rf2Var), i);
    }
}
