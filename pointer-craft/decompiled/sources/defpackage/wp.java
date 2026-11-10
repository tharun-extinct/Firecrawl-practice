package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wp {
    public final String g;

    public wp(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof wp) && yf2.p(((wp) obj).g, this.g);
        }
        return true;
    }
}
