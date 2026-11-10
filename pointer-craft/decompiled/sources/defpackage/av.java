package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class av {
    public String g;
    public byte n;
    public int r;
    public long y;

    public final bv g() {
        if (this.n == 1) {
            return new bv(this.g, this.y, this.r);
        }
        l0.z("Missing required properties: tokenExpirationTimestamp");
        return null;
    }

    public final void n(long j) {
        this.y = j;
        this.n = (byte) (this.n | 1);
    }

    public final void r(String str) {
        this.g = str;
    }

    public final void y(int i) {
        this.r = i;
    }
}
