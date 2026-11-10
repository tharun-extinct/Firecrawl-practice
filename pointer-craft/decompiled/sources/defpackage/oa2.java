package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oa2 extends p0 implements qa2 {
    public final int a;
    public final x0 j;
    public final int t;

    public oa2(x0 x0Var, int i, int i2) {
        this.j = x0Var;
        this.t = i;
        fz5.r(i, i2, x0Var.g());
        this.a = i2 - i;
    }

    @Override // defpackage.o
    public final int g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fz5.g(i, this.a);
        return this.j.get(this.t + i);
    }

    @Override // defpackage.p0, java.util.List
    public final List subList(int i, int i2) {
        fz5.r(i, i2, this.a);
        int i3 = this.t;
        return new oa2(this.j, i + i3, i3 + i2);
    }
}
