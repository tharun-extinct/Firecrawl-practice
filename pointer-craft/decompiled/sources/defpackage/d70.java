package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d70 extends q0 {
    public final /* synthetic */ byte a = 1;
    public final Object m;

    public d70(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.m = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.m;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    uo1.b();
                    return null;
                }
                int i = this.j;
                this.j = i + 1;
                return ((Object[]) obj)[i];
            default:
                if (hasNext()) {
                    this.j++;
                    return obj;
                }
                uo1.b();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.a;
        Object obj = this.m;
        switch (b) {
            case 0:
                if (!hasPrevious()) {
                    uo1.b();
                    return null;
                }
                int i = this.j - 1;
                this.j = i;
                return ((Object[]) obj)[i];
            default:
                if (hasPrevious()) {
                    this.j--;
                    return obj;
                }
                uo1.b();
                return null;
        }
    }

    public d70(int i, Object obj) {
        super(i, 1);
        this.m = obj;
    }
}
