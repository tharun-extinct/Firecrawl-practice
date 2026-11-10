package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kk4 implements jk4, na0 {
    public final jk4 g;
    public final Set r;
    public final String y;

    public kk4(jk4 jk4Var) {
        Set setV;
        jk4Var.getClass();
        this.g = jk4Var;
        this.y = jk4Var.g() + '?';
        jk4Var.getClass();
        if (jk4Var instanceof na0) {
            setV = ((na0) jk4Var).v();
        } else {
            HashSet hashSet = new HashSet(jk4Var.r());
            int iR = jk4Var.r();
            for (int i = 0; i < iR; i++) {
                hashSet.add(jk4Var.n(i));
            }
            setV = hashSet;
        }
        this.r = setV;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kk4) {
            return yf2.p(this.g, ((kk4) obj).g);
        }
        return false;
    }

    @Override // defpackage.jk4
    public final String g() {
        return this.y;
    }

    public final int hashCode() {
        return this.g.hashCode() * 31;
    }

    @Override // defpackage.jk4
    public final String n(int i) {
        return this.g.n(i);
    }

    @Override // defpackage.jk4
    public final int r() {
        return this.g.r();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append('?');
        return sb.toString();
    }

    @Override // defpackage.na0
    public final Set v() {
        return this.r;
    }

    @Override // defpackage.jk4
    public final jk4 x(int i) {
        return this.g.x(i);
    }

    @Override // defpackage.jk4
    public final tx3 y() {
        return this.g.y();
    }
}
