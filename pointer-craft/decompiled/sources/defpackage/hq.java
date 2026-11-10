package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hq extends o73 implements cj4 {
    public final boolean g;
    public final xy1 y;

    public hq(xy1 xy1Var, boolean z) {
        this.g = z;
        this.y = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq)) {
            return false;
        }
        hq hqVar = (hq) obj;
        return this.g == hqVar.g && this.y == hqVar.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (Boolean.hashCode(this.g) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        hw0 hw0Var = (hw0) i73Var;
        hw0Var.o = this.g;
        hw0Var.k = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new hw0(this.g, false, this.y);
    }

    @Override // defpackage.cj4
    public final aj4 x() {
        aj4 aj4Var = new aj4();
        aj4Var.a = this.g;
        this.y.a(aj4Var);
        return aj4Var;
    }
}
