package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum i14 {
    a("http/1.0"),
    m("http/1.1"),
    q("spdy/3.1"),
    w("h2"),
    c("h2_prior_knowledge"),
    i("quic"),
    b("h3");

    public static final t32 t = new t32((byte) 26);
    public final String j;

    i14(String str) {
        this.j = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.j;
    }
}
