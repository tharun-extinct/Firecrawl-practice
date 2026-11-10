package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd5 extends pd5 {
    public final yr3 m;

    public sd5(yr3 yr3Var) {
        this.m = yr3Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 2;
        Object[] objArr = this.j;
        return new oa3(this.m, objArr[i], objArr[i + 1]);
    }
}
