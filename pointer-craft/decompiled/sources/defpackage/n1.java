package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {
    public int a;
    public o1[] j;
    public uy4 m;
    public int t;

    public final uy4 j() {
        uy4 uy4Var;
        synchronized (this) {
            uy4Var = this.m;
            if (uy4Var == null) {
                int i = this.t;
                uy4Var = new uy4(1, Integer.MAX_VALUE, f70.t);
                uy4Var.p(Integer.valueOf(i));
                this.m = uy4Var;
            }
        }
        return uy4Var;
    }

    public final void l(o1 o1Var) {
        uy4 uy4Var;
        int i;
        mu0[] mu0VarArrY;
        synchronized (this) {
            try {
                int i2 = this.t - 1;
                this.t = i2;
                uy4Var = this.m;
                if (i2 == 0) {
                    this.a = 0;
                }
                o1Var.getClass();
                mu0VarArrY = o1Var.y(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (mu0 mu0Var : mu0VarArrY) {
            if (mu0Var != null) {
                mu0Var.j(og5.g);
            }
        }
        if (uy4Var != null) {
            uy4Var.k(-1);
        }
    }

    public final o1 n() {
        o1 o1VarV;
        uy4 uy4Var;
        synchronized (this) {
            try {
                o1[] o1VarArrX = this.j;
                if (o1VarArrX == null) {
                    o1VarArrX = x();
                    this.j = o1VarArrX;
                } else if (this.t >= o1VarArrX.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(o1VarArrX, o1VarArrX.length * 2);
                    this.j = (o1[]) objArrCopyOf;
                    o1VarArrX = (o1[]) objArrCopyOf;
                }
                int i = this.a;
                do {
                    o1VarV = o1VarArrX[i];
                    if (o1VarV == null) {
                        o1VarV = v();
                        o1VarArrX[i] = o1VarV;
                    }
                    i++;
                    if (i >= o1VarArrX.length) {
                        i = 0;
                    }
                } while (!o1VarV.g(this));
                this.a = i;
                this.t++;
                uy4Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (uy4Var != null) {
            uy4Var.k(1);
        }
        return o1VarV;
    }

    public o1 v() {
        do4 do4Var = new do4();
        do4Var.g = -1L;
        return do4Var;
    }

    public o1[] x() {
        return new do4[2];
    }
}
