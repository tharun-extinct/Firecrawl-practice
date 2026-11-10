package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad0 implements b02 {
    public final f70 a;
    public final fx0 j;
    public final int t;

    public ad0(fx0 fx0Var, int i, f70 f70Var) {
        this.j = fx0Var;
        this.t = i;
        this.a = f70Var;
    }

    public yc0 j(ox0 ox0Var) throws Throwable {
        int i = this.t;
        if (i == -3) {
            i = -2;
        }
        bz1 opVar = new op((Object) this, (mu0) null, (byte) 2);
        ez3 ez3Var = new ez3(yf2.R(ox0Var, this.j), v70.y(i, 4, this.a));
        ez3Var.t0(rx0.a, ez3Var, opVar);
        return ez3Var;
    }

    public er1 l() {
        return null;
    }

    public String n() {
        return null;
    }

    @Override // defpackage.er1
    public Object r(gr1 gr1Var, mu0 mu0Var) {
        Object objB = k33.B(new zh(gr1Var, this, null, (byte) 3), mu0Var);
        return objB == px0.j ? objB : og5.g;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strN = n();
        if (strN != null) {
            arrayList.add(strN);
        }
        ni1 ni1Var = ni1.j;
        fx0 fx0Var = this.j;
        if (fx0Var != ni1Var) {
            arrayList.add("context=" + fx0Var);
        }
        int i = this.t;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        f70 f70Var = f70.j;
        f70 f70Var2 = this.a;
        if (f70Var2 != f70Var) {
            arrayList.add("onBufferOverflow=" + f70Var2);
        }
        return getClass().getSimpleName() + '[' + cj0.q0(arrayList, ", ", null, null, null, 62) + ']';
    }

    public abstract Object v(ez3 ez3Var, mu0 mu0Var);

    public abstract ad0 x(fx0 fx0Var, int i, f70 f70Var);

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.b02
    public final er1 y(fx0 fx0Var, int i, f70 f70Var) {
        fx0 fx0Var2 = this.j;
        fx0 fx0VarB = fx0Var.b(fx0Var2);
        f70 f70Var2 = f70.j;
        f70 f70Var3 = this.a;
        int i2 = this.t;
        if (f70Var == f70Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            f70Var = f70Var3;
        }
        return (yf2.p(fx0VarB, fx0Var2) && i == i2 && f70Var == f70Var3) ? this : x(fx0VarB, i, f70Var);
    }
}
