package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qx4 implements yi {
    public final String g;

    public /* synthetic */ qx4(String str) {
        this.g = str;
    }

    public static final /* synthetic */ qx4 g(String str) {
        return new qx4(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qx4) {
            return this.g.equals(((qx4) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return du4.i("StringAnnotation(value=", this.g, ")");
    }

    public final /* synthetic */ String y() {
        return this.g;
    }
}
