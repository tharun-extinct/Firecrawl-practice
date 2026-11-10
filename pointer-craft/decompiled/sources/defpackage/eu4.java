package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eu4 implements Comparable {
    public boolean j;
    public float q;
    public int u;
    public int t = -1;
    public int a = -1;
    public int m = 0;
    public boolean w = false;
    public final float[] c = new float[9];
    public final float[] i = new float[9];
    public nr[] b = new nr[16];
    public int s = 0;
    public int p = 0;

    public eu4(int i) {
        this.u = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.t - ((eu4) obj).t;
    }

    public final void g(nr nrVar) {
        int i = 0;
        while (true) {
            int i2 = this.s;
            nr[] nrVarArr = this.b;
            if (i >= i2) {
                if (i2 >= nrVarArr.length) {
                    nrVarArr = (nr[]) Arrays.copyOf(nrVarArr, nrVarArr.length * 2);
                    this.b = nrVarArr;
                }
                int i3 = this.s;
                nrVarArr[i3] = nrVar;
                this.s = i3 + 1;
                return;
            }
            if (nrVarArr[i] == nrVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void n(kv2 kv2Var, float f) {
        this.q = f;
        this.w = true;
        int i = this.s;
        this.a = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2].j(kv2Var, this, false);
        }
        this.s = 0;
    }

    public final void r() {
        this.u = 5;
        this.m = 0;
        this.t = -1;
        this.a = -1;
        this.q = 0.0f;
        this.w = false;
        int i = this.s;
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = null;
        }
        this.s = 0;
        this.p = 0;
        this.j = false;
        Arrays.fill(this.i, 0.0f);
    }

    public final String toString() {
        return "" + this.t;
    }

    public final void v(kv2 kv2Var, nr nrVar) {
        int i = this.s;
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2].t(kv2Var, nrVar, false);
        }
        this.s = 0;
    }

    public final void y(nr nrVar) {
        int i = this.s;
        int i2 = 0;
        while (i2 < i) {
            if (this.b[i2] == nrVar) {
                while (i2 < i - 1) {
                    nr[] nrVarArr = this.b;
                    int i3 = i2 + 1;
                    nrVarArr[i2] = nrVarArr[i3];
                    i2 = i3;
                }
                this.s--;
                return;
            }
            i2++;
        }
    }
}
