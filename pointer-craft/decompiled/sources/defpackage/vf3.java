package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class vf3 extends nb3 {
    public boolean b;
    public final nb3 i;

    public vf3(long j, gt4 gt4Var, xy1 xy1Var, xy1 xy1Var2, nb3 nb3Var) {
        super(j, gt4Var, xy1Var, xy1Var2);
        this.i = nb3Var;
        nb3Var.m();
    }

    @Override // defpackage.nb3
    public final xs2 f() {
        vf3 vf3Var;
        nb3 nb3Var = this.i;
        if (nb3Var.w || nb3Var.r) {
            return new ct4(this);
        }
        ib3 ib3Var = this.j;
        long j = this.y;
        HashMap mapW = ib3Var != null ? it4.w(nb3Var.l(), this, this.i.n()) : null;
        Object obj = it4.r;
        synchronized (obj) {
            try {
                it4.o(this);
                if (ib3Var == null || ib3Var.n == 0) {
                    vf3Var = this;
                    vf3Var.g();
                } else {
                    vf3Var = this;
                    xs2 xs2VarE = vf3Var.e(this.i.l(), ib3Var, mapW, this.i.n());
                    if (!xs2VarE.equals(dt4.r)) {
                        return xs2VarE;
                    }
                    ib3 ib3VarK = vf3Var.i.k();
                    if (ib3VarK != null) {
                        ib3VarK.a(ib3Var);
                    } else {
                        vf3Var.i.B(ib3Var);
                        vf3Var.j = null;
                    }
                }
                if (yf2.k(vf3Var.i.l(), j) < 0) {
                    vf3Var.i.o();
                }
                nb3 nb3Var2 = vf3Var.i;
                nb3Var2.p(nb3Var2.n().y(j).g(vf3Var.a));
                vf3Var.i.A(j);
                nb3 nb3Var3 = vf3Var.i;
                int i = vf3Var.n;
                vf3Var.n = -1;
                if (i >= 0) {
                    int[] iArr = nb3Var3.m;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    nb3Var3.m = iArrCopyOf;
                } else {
                    nb3Var3.getClass();
                }
                nb3 nb3Var4 = vf3Var.i;
                gt4 gt4Var = vf3Var.a;
                nb3Var4.getClass();
                synchronized (obj) {
                    nb3Var4.a = nb3Var4.a.v(gt4Var);
                    nb3 nb3Var5 = vf3Var.i;
                    int[] iArr2 = vf3Var.m;
                    nb3Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = nb3Var5.m;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        nb3Var5.m = iArr2;
                    }
                }
                vf3Var.w = true;
                if (!vf3Var.b) {
                    vf3Var.b = true;
                    vf3Var.i.q();
                }
                return dt4.r;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void r() {
        if (this.r) {
            return;
        }
        super.r();
        if (this.b) {
            return;
        }
        this.b = true;
        this.i.q();
    }
}
