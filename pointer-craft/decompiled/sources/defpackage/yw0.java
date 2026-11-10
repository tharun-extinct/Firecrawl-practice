package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes2.dex */
public final class yw0 extends p41 implements ej4 {
    public boolean A;
    public boolean B;
    public aj3 C;
    public b65 D;
    public ma2 E;
    public rt1 F;
    public k65 d;
    public mt2 e;
    public wb5 k;

    public static void T0(mt2 mt2Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        y65 y65Var = mt2Var.v;
        kw0 kw0Var = mt2Var.o;
        if (y65Var == null) {
            int length = str.length();
            kw0Var.a(new k65(str, sp2.y(length, length), 4));
        } else {
            k65 k65VarW = mt2Var.n.w(pw5.d(new d51(), new rk0(str, 1)));
            y65Var.g(null, k65VarW);
            kw0Var.a(k65VarW);
        }
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        cj cjVar = this.d.g;
        ci2[] ci2VarArr = lj4.g;
        mj4 mj4Var = kj4.F;
        ci2[] ci2VarArr2 = lj4.g;
        ci2 ci2Var = ci2VarArr2[18];
        mj4Var.getClass();
        nj4Var.g(mj4Var, cjVar);
        cj cjVar2 = this.k.g;
        mj4 mj4Var2 = kj4.G;
        ci2 ci2Var2 = ci2VarArr2[19];
        mj4Var2.getClass();
        nj4Var.g(mj4Var2, cjVar2);
        long j = this.d.y;
        mj4 mj4Var3 = kj4.H;
        ci2 ci2Var3 = ci2VarArr2[20];
        u75 u75Var = new u75(j);
        mj4Var3.getClass();
        nj4Var.g(mj4Var3, u75Var);
        lj4.r(nj4Var, cm1.a);
        wb wbVar = Build.VERSION.SDK_INT >= 26 ? new wb(AutofillValue.forText(py5.y(this.d.g))) : null;
        if (wbVar != null) {
            lj4.x(nj4Var, wbVar);
        }
        boolean z = false;
        lj4.y(nj4Var, new xw0(this, (byte) 0));
        int i = this.E.n;
        if (i == 6) {
            bu0.g.getClass();
            lj4.v(nj4Var, au0.r);
        } else if (i == 7 || i == 8) {
            bu0.g.getClass();
            lj4.v(nj4Var, au0.y);
        } else if (i == 4) {
            bu0.g.getClass();
            lj4.v(nj4Var, au0.n);
        }
        if (!this.B) {
            nj4Var.g(kj4.a, og5.g);
        }
        if (this.B && !this.A) {
            z = true;
        }
        mj4 mj4Var4 = kj4.Q;
        ci2 ci2Var4 = ci2VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        mj4Var4.getClass();
        nj4Var.g(mj4Var4, boolValueOf);
        lj4.g(nj4Var, new xw0(this, (byte) 1));
        if (z) {
            nj4Var.g(yi4.m, new p1(null, new xw0(this, (byte) 2)));
            nj4Var.g(yi4.i, new p1(null, new xw0(this, nj4Var)));
        }
        nj4Var.g(yi4.a, new p1(null, new tn(this, (byte) 2)));
        int i2 = this.E.v;
        ww0 ww0Var = new ww0(this, (byte) 6);
        nj4Var.g(kj4.J, new la2(i2));
        nj4Var.g(yi4.b, new p1(null, ww0Var));
        nj4Var.g(yi4.y, new p1(null, new ww0(this, (byte) 7)));
        nj4Var.g(yi4.r, new p1(null, new ww0(this, (byte) 1)));
        if (!u75.r(this.d.y)) {
            nj4Var.g(yi4.s, new p1(null, new ww0(this, (byte) 2)));
            if (this.B && !this.A) {
                nj4Var.g(yi4.p, new p1(null, new ww0(this, (byte) 3)));
            }
        }
        if (!this.B || this.A) {
            return;
        }
        nj4Var.g(yi4.u, new p1(null, new ww0(this, (byte) 5)));
    }

    @Override // defpackage.ej4
    public final boolean p0() {
        return true;
    }
}
