package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d13 {
    public int a;
    public int j;
    public Object m;
    public int t;

    public d13() {
        if (d93.b == null) {
            d93.b = new d93((byte) 17);
        }
    }

    public int g(int i) {
        if (i < this.a) {
            return ((ByteBuffer) this.m).getShort(this.t + i);
        }
        return 0;
    }

    public boolean hasNext() {
        return this.j < ((f13) this.m).w;
    }

    public void r() {
        while (true) {
            int i = this.j;
            f13 f13Var = (f13) this.m;
            if (i >= f13Var.w || f13Var.a[i] >= 0) {
                return;
            } else {
                this.j = i + 1;
            }
        }
    }

    public void remove() {
        f13 f13Var = (f13) this.m;
        y();
        if (this.t == -1) {
            l0.z("Call next() before removing element from the iterator.");
            return;
        }
        f13Var.r();
        f13Var.m(this.t);
        this.t = -1;
        this.a = f13Var.i;
    }

    public void y() {
        if (((f13) this.m).i != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    public d13(f13 f13Var) {
        this.m = f13Var;
        this.t = -1;
        this.a = f13Var.i;
        r();
    }
}
