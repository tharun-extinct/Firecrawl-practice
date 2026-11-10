package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u25 {
    public final String g;
    public long n;
    public a35 r;
    public final boolean y;

    public u25(String str, boolean z) {
        str.getClass();
        this.g = str;
        this.y = z;
        this.n = -1L;
    }

    public final long g() {
        return this.n;
    }

    public final void n() {
        this.n = -1L;
    }

    public abstract long r();

    public final String toString() {
        return this.g;
    }

    public final a35 y() {
        return this.r;
    }
}
