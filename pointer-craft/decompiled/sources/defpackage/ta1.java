package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends i73 implements wd1 {
    public uq2 o;

    @Override // defpackage.i73
    public final void I0() {
        this.o.a = this;
    }

    @Override // defpackage.i73
    public final void J0() {
        uq2 uq2Var = this.o;
        uq2Var.n();
        uq2Var.y = null;
        uq2Var.r = -1;
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        pb0 pb0Var = wm2Var.j;
        ArrayList arrayList = this.o.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qq2 qq2Var = (qq2) arrayList.get(i);
            x32 x32Var = qq2Var.i;
            if (x32Var != null) {
                long j = qq2Var.w;
                long j2 = x32Var.z;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((y22) pb0Var.t.t).D(f, f2);
                try {
                    yf2.A(wm2Var, x32Var);
                    ((y22) pb0Var.t.t).D(-f, -f2);
                } catch (Throwable th) {
                    ((y22) pb0Var.t.t).D(-f, -f2);
                    throw th;
                }
            }
        }
        wm2Var.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta1) && yf2.p(this.o, ((ta1) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.o + ")";
    }
}
