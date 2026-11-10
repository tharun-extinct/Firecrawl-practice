package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends p0 implements RandomAccess {
    public final int a;
    public final p0 j;
    public final int t;

    public o0(p0 p0Var, int i, int i2) {
        this.j = p0Var;
        this.t = i;
        y94.z(i, i2, p0Var.g());
        this.a = i2 - i;
    }

    @Override // defpackage.o
    public final int g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.j.get(this.t + i);
    }

    @Override // defpackage.p0, java.util.List
    public final List subList(int i, int i2) {
        y94.z(i, i2, this.a);
        int i3 = this.t;
        return new o0(this.j, i + i3, i3 + i2);
    }
}
