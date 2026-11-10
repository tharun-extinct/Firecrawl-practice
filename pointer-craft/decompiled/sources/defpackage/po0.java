package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class po0 {
    public final h02 g;
    public int l;
    public int q;
    public boolean r;
    public int x;
    public vc0 y;
    public final re2 n = new re2();
    public boolean v = true;
    public final ArrayList j = new ArrayList();
    public int t = -1;
    public int a = -1;
    public int m = -1;

    public po0(h02 h02Var, vc0 vc0Var) {
        this.g = h02Var;
        this.y = vc0Var;
    }

    public final void g() {
        r();
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            this.l++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void n(boolean z) {
        lr4 lr4Var = this.g.G;
        int i = z ? lr4Var.t : lr4Var.l;
        int i2 = i - this.x;
        if (i2 < 0) {
            qo0.g("Tried to seek backward");
        }
        if (i2 > 0) {
            em3 em3Var = this.y.C;
            em3Var.N(sk3.r);
            em3Var.n[em3Var.v - em3Var.y[em3Var.r - 1].g] = i2;
            this.x = i;
        }
    }

    public final void r() {
        int i = this.q;
        if (i > 0) {
            int i2 = this.t;
            if (i2 >= 0) {
                y();
                em3 em3Var = this.y.C;
                em3Var.N(ol3.r);
                int i3 = em3Var.v - em3Var.y[em3Var.r - 1].g;
                int[] iArr = em3Var.n;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.t = -1;
            } else {
                int i4 = this.m;
                int i5 = this.a;
                y();
                em3 em3Var2 = this.y.C;
                em3Var2.N(kl3.r);
                int i6 = em3Var2.v - em3Var2.y[em3Var2.r - 1].g;
                int[] iArr2 = em3Var2.n;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.a = -1;
                this.m = -1;
            }
            this.q = 0;
        }
    }

    public final void v(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                qo0.g("Invalid remove index " + i);
            }
            if (this.t == i) {
                this.q += i2;
                return;
            }
            r();
            this.t = i;
            this.q = i2;
        }
    }

    public final void y() {
        int i = this.l;
        if (i > 0) {
            em3 em3Var = this.y.C;
            em3Var.N(zl3.r);
            em3Var.n[em3Var.v - em3Var.y[em3Var.r - 1].g] = i;
            this.l = 0;
        }
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return;
        }
        vc0 vc0Var = this.y;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        vc0Var.getClass();
        if (size != 0) {
            em3 em3Var2 = vc0Var.C;
            em3Var2.N(zk3.r);
            xq2.H(em3Var2, 0, objArr);
        }
        arrayList.clear();
    }
}
