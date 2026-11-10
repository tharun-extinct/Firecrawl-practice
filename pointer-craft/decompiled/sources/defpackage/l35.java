package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l35 {
    public final cj g;
    public cj y;
    public boolean r = false;
    public j93 n = null;

    public l35(cj cjVar, cj cjVar2) {
        this.g = cjVar;
        this.y = cjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l35)) {
            return false;
        }
        l35 l35Var = (l35) obj;
        return yf2.p(this.g, l35Var.g) && yf2.p(this.y, l35Var.y) && this.r == l35Var.r && yf2.p(this.n, l35Var.n);
    }

    public final j93 g() {
        return this.n;
    }

    public final int hashCode() {
        int iL = xi3.l((this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31, this.r);
        j93 j93Var = this.n;
        return iL + (j93Var == null ? 0 : j93Var.hashCode());
    }

    public final void l(cj cjVar) {
        this.y = cjVar;
    }

    public final boolean n() {
        return this.r;
    }

    public final cj r() {
        return this.y;
    }

    public final String toString() {
        cj cjVar = this.y;
        return "TextSubstitutionValue(original=" + ((Object) this.g) + ", substitution=" + ((Object) cjVar) + ", isShowingSubstitution=" + this.r + ", layoutCache=" + this.n + ")";
    }

    public final void v(j93 j93Var) {
        this.n = j93Var;
    }

    public final void x(boolean z) {
        this.r = z;
    }

    public final cj y() {
        return this.g;
    }
}
