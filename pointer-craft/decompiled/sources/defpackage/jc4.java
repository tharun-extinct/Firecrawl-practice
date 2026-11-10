package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jc4 extends kc4 implements Iterator {
    public final /* synthetic */ lc4 a;
    public ic4 j;
    public boolean t = true;

    public jc4(lc4 lc4Var) {
        this.a = lc4Var;
    }

    @Override // defpackage.kc4
    public final void g(ic4 ic4Var) {
        ic4 ic4Var2 = this.j;
        if (ic4Var == ic4Var2) {
            ic4 ic4Var3 = ic4Var2.m;
            this.j = ic4Var3;
            this.t = ic4Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.t) {
            return this.a.j != null;
        }
        ic4 ic4Var = this.j;
        return (ic4Var == null || ic4Var.a == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.t) {
            this.t = false;
            ic4 ic4Var = this.a.j;
            this.j = ic4Var;
            return ic4Var;
        }
        ic4 ic4Var2 = this.j;
        ic4 ic4Var3 = ic4Var2 != null ? ic4Var2.a : null;
        this.j = ic4Var3;
        return ic4Var3;
    }
}
