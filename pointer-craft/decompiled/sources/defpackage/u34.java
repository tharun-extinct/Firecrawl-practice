package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u34 {
    public yo0 g;
    public hb3 l;
    public bz1 n;
    public c02 r;
    public int v;
    public ta3 x;
    public int y;

    public u34(yo0 yo0Var) {
        this.g = yo0Var;
    }

    public final boolean g() {
        if (this.g != null) {
            c02 c02Var = this.r;
            if (c02Var != null ? c02Var.g() : false) {
                return true;
            }
        }
        return false;
    }

    public final void n(boolean z) {
        int i = this.y;
        this.y = z ? i | 32 : i & (-33);
    }

    public final void r() {
        yo0 yo0Var = this.g;
        if (yo0Var != null) {
            yo0Var.o = true;
            yo0Var.A.c();
        }
        this.g = null;
        this.x = null;
        this.l = null;
        this.n = null;
    }

    public final ng2 y(Object obj) {
        ng2 ng2VarU;
        yo0 yo0Var = this.g;
        return (yo0Var == null || (ng2VarU = yo0Var.u(this, obj)) == null) ? ng2.j : ng2VarU;
    }
}
