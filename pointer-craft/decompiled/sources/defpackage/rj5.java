package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rj5 implements lj5 {
    public final byte j;

    /* JADX WARN: Multi-variable type inference failed */
    public rj5(int i) {
        this.j = i;
    }

    @Override // defpackage.jj5
    public final vi l(long j, vi viVar, vi viVar2, vi viVar3) {
        return j < ((long) this.j) * 1000000 ? viVar : viVar2;
    }

    @Override // defpackage.lj5
    public final int n() {
        return this.j;
    }

    @Override // defpackage.lj5
    public final int x() {
        return 0;
    }

    @Override // defpackage.jj5
    public final vi v(long j, vi viVar, vi viVar2, vi viVar3) {
        return viVar3;
    }
}
