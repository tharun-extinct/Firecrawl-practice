package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hc4 extends kc4 implements Iterator {
    public ic4 j;
    public ic4 t;

    public hc4(ic4 ic4Var, ic4 ic4Var2) {
        this.j = ic4Var2;
        this.t = ic4Var;
    }

    @Override // defpackage.kc4
    public final void g(ic4 ic4Var) {
        ic4 ic4Var2 = this.j;
        ic4 ic4Var3 = null;
        if (ic4Var2 == ic4Var && ic4Var == this.t) {
            this.t = null;
            this.j = null;
            ic4Var2 = null;
        }
        ic4 ic4Var4 = ic4Var2;
        if (ic4Var2 == ic4Var) {
            ic4Var4 = ic4Var2.m;
            this.j = ic4Var4;
        }
        ic4 ic4Var5 = this.t;
        if (ic4Var5 == ic4Var) {
            if (ic4Var5 != ic4Var4 && ic4Var4 != null) {
                ic4Var3 = ic4Var5.a;
            }
            this.t = ic4Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ic4 ic4Var = this.t;
        ic4 ic4Var2 = this.j;
        this.t = (ic4Var == ic4Var2 || ic4Var2 == null) ? null : ic4Var.a;
        return ic4Var;
    }
}
