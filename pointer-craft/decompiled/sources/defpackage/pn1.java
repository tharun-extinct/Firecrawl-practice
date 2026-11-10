package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pn1 implements Map.Entry, vh2 {
    public pn1 a;
    public final fu2 j;
    public pn1 m;
    public boolean q;
    public final iu2 t;

    public pn1(fu2 fu2Var, iu2 iu2Var) {
        this.j = fu2Var;
        this.t = iu2Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pn1) {
            pn1 pn1Var = (pn1) obj;
            return this.j.equals(pn1Var.j) && this.t == pn1Var.t;
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
        return this.t.hashCode() + (this.j.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.j + ", value=" + this.t + ")";
    }
}
