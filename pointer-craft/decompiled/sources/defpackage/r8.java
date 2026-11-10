package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r8 extends ig6 {
    public final int t;

    public r8(int i) {
        this.t = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r8) && ((r8) obj).t == this.t;
    }

    public final int hashCode() {
        return this.t * 31;
    }
}
