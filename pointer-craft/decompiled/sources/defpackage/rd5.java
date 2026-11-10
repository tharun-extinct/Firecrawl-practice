package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rd5 extends pd5 {
    public final /* synthetic */ byte m;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                int i = this.a;
                this.a = i + 2;
                return this.j[i];
            default:
                int i2 = this.a;
                this.a = i2 + 2;
                return this.j[i2 + 1];
        }
    }
}
