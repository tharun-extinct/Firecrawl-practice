package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pa2 extends p0 {
    public final int a;
    public final y0 j;
    public final int t;

    public pa2(y0 y0Var, int i, int i2) {
        this.j = y0Var;
        this.t = i;
        br2.a(i, i2, y0Var.g());
        this.a = i2 - i;
    }

    @Override // defpackage.o
    public final int g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        br2.j(i, this.a);
        return this.j.get(this.t + i);
    }

    @Override // defpackage.p0, java.util.List
    public final List subList(int i, int i2) {
        br2.a(i, i2, this.a);
        int i3 = this.t;
        return new pa2(this.j, i + i3, i3 + i2);
    }
}
