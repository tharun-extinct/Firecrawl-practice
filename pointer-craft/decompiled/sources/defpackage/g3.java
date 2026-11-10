package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g3 {
    public final String g;
    public final String y;

    public g3(String str) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.g = str;
        this.y = null;
    }

    public String g() {
        return this.g;
    }

    public String y() {
        return this.y;
    }

    public g3(String str, String str2) {
        this.g = str;
        this.y = str2;
    }
}
