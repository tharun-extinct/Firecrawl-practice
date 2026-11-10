package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class le2 extends fe2 {
    public boolean a;
    public final int j;
    public int m;
    public final int t;

    public le2(int i, int i2, int i3) {
        this.j = i3;
        this.t = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.a = z;
        this.m = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // defpackage.fe2
    public final int nextInt() {
        int i = this.m;
        if (i != this.t) {
            this.m = this.j + i;
            return i;
        }
        if (this.a) {
            this.a = false;
            return i;
        }
        uo1.b();
        return 0;
    }
}
