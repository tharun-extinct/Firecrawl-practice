package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou4 extends fe2 {
    public int j;
    public final /* synthetic */ nu4 t;

    public ou4(nu4 nu4Var) {
        this.t = nu4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.t.v();
    }

    @Override // defpackage.fe2
    public final int nextInt() {
        int i = this.j;
        this.j = i + 1;
        return this.t.r(i);
    }
}
