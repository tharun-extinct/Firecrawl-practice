package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h04 extends ta0 implements ci2 {
    public final boolean c;

    public h04(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h04) {
            h04 h04Var = (h04) obj;
            return v().equals(h04Var.v()) && this.m.equals(h04Var.m) && this.q.equals(h04Var.q) && yf2.p(this.t, h04Var.t);
        }
        if (obj instanceof ci2) {
            return obj.equals(j());
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode() + xi3.x(v().hashCode() * 31, 31, this.m);
    }

    public final uh2 j() {
        if (this.c) {
            return this;
        }
        uh2 uh2Var = this.j;
        if (uh2Var != null) {
            return uh2Var;
        }
        uh2 uh2VarN = n();
        this.j = uh2VarN;
        return uh2VarN;
    }

    public final ci2 m() {
        if (this.c) {
            uo1.u("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        uh2 uh2VarJ = j();
        if (uh2VarJ != this) {
            return (ci2) uh2VarJ;
        }
        throw new gk2();
    }

    public final String toString() {
        uh2 uh2VarJ = j();
        return uh2VarJ != this ? uh2VarJ.toString() : du4.b(new StringBuilder("property "), this.m, " (Kotlin reflection is not available)");
    }
}
