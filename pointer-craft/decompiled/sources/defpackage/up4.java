package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class up4 extends r0 {
    public final Object a;

    public up4(int i, Object obj) {
        super(i, 1);
        this.a = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.j++;
            return this.a;
        }
        uo1.b();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.j--;
            return this.a;
        }
        uo1.b();
        return null;
    }
}
