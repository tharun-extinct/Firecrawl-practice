package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ov4 implements jj5 {
    public final jj5 j;
    public final long t;

    public ov4(jj5 jj5Var, long j) {
        this.j = jj5Var;
        this.t = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ov4)) {
            return false;
        }
        ov4 ov4Var = (ov4) obj;
        return ov4Var.t == this.t && yf2.p(ov4Var.j, this.j);
    }

    @Override // defpackage.jj5
    public final boolean g() {
        return this.j.g();
    }

    public final int hashCode() {
        return Long.hashCode(this.t) + (this.j.hashCode() * 31);
    }

    @Override // defpackage.jj5
    public final vi l(long j, vi viVar, vi viVar2, vi viVar3) {
        long j2 = this.t;
        return j < j2 ? viVar : this.j.l(j - j2, viVar, viVar2, viVar3);
    }

    @Override // defpackage.jj5
    public final vi v(long j, vi viVar, vi viVar2, vi viVar3) {
        long j2 = this.t;
        return j < j2 ? viVar3 : this.j.v(j - j2, viVar, viVar2, viVar3);
    }

    @Override // defpackage.jj5
    public final long y(vi viVar, vi viVar2, vi viVar3) {
        return this.j.y(viVar, viVar2, viVar3) + this.t;
    }
}
