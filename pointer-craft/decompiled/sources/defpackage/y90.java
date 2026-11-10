package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class y90 implements Iterator {
    public final int a;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte j = 0;
    public int t = 0;

    public y90(l56 l56Var) {
        this.m = l56Var;
        this.a = l56Var.v();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.j) {
            case 0:
                return this.t < this.a;
            case 1:
                return this.t < this.a;
            default:
                return this.t < this.a;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte bL;
        byte b = this.j;
        Object obj = this.m;
        int i = this.a;
        switch (b) {
            case 0:
                int i2 = this.t;
                if (i2 < i) {
                    this.t = i2 + 1;
                    return Byte.valueOf(((ca0) obj).l(i2));
                }
                uo1.b();
                return null;
            case 1:
                int i3 = this.t;
                if (i3 < i) {
                    this.t = i3 + 1;
                    bL = ((da0) obj).l(i3);
                } else {
                    uo1.b();
                    bL = 0;
                }
                return Byte.valueOf(bL);
            default:
                int i4 = this.t;
                if (i4 < i) {
                    this.t = i4 + 1;
                    return Byte.valueOf(((l56) obj).y(i4));
                }
                uo1.b();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public y90(ca0 ca0Var) {
        this.m = ca0Var;
        this.a = ca0Var.size();
    }

    public y90(da0 da0Var) {
        this.m = da0Var;
        this.a = da0Var.size();
    }
}
