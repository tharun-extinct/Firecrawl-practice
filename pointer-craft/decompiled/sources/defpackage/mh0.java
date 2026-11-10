package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mh0 extends o73 implements cj4 {
    public final xy1 g;

    public mh0(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mh0) {
            return this.g == ((mh0) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((hw0) i73Var).k = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new hw0(false, true, this.g);
    }

    @Override // defpackage.cj4
    public final aj4 x() {
        aj4 aj4Var = new aj4();
        aj4Var.a = false;
        aj4Var.m = true;
        this.g.a(aj4Var);
        return aj4Var;
    }
}
