package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ff1 implements bk4, gf1 {
    public final bk4 g;
    public final int y;

    public ff1(bk4 bk4Var, int i) {
        bk4Var.getClass();
        this.g = bk4Var;
        this.y = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.gf1
    public final bk4 g(int i) {
        int i2 = this.y + i;
        return i2 < 0 ? new ff1(this, i) : new ff1(this.g, i2);
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        return new er(this);
    }
}
