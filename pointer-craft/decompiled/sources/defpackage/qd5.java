package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qd5 extends pd5 {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 2;
        Object[] objArr = this.j;
        return new j13(objArr[i], objArr[i + 1]);
    }
}
