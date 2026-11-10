package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class m5 implements lz1, Serializable {
    public final String a;
    public final int c;
    public final Object j;
    public final String m;
    public final boolean q;
    public final Class t;
    public final byte w;

    /* JADX WARN: Multi-variable type inference failed */
    public m5(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.j = obj;
        this.t = cls;
        this.a = str;
        this.m = str2;
        this.q = (i2 & 1) == 1;
        this.w = i;
        this.c = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return this.q == m5Var.q && this.w == m5Var.w && this.c == m5Var.c && this.j.equals(m5Var.j) && this.t.equals(m5Var.t) && this.a.equals(m5Var.a) && this.m.equals(m5Var.m);
    }

    public final int hashCode() {
        return ((((xi3.x(xi3.x((this.t.hashCode() + (this.j.hashCode() * 31)) * 31, 31, this.a), 31, this.m) + (this.q ? 1231 : 1237)) * 31) + this.w) * 31) + this.c;
    }

    @Override // defpackage.lz1
    public final int r() {
        return this.w;
    }

    public final String toString() {
        v54.g.getClass();
        return w54.g(this);
    }
}
