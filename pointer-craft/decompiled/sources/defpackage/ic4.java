package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ic4 implements Map.Entry {
    public ic4 a;
    public final Object j;
    public ic4 m;
    public final ex2 t;

    public ic4(Object obj, ex2 ex2Var) {
        this.j = obj;
        this.t = ex2Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ic4) {
            ic4 ic4Var = (ic4) obj;
            return this.j.equals(ic4Var.j) && this.t == ic4Var.t;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.t.hashCode() ^ this.j.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.j + "=" + this.t;
    }
}
