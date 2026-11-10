package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bq5 implements aq5 {
    public final tc2 n;
    public final tc2 r;
    public final String y;

    public bq5(String str) {
        this.y = str;
        this.r = new tc2(str);
        this.n = new tc2(str.concat(" maximum"));
    }

    public final String toString() {
        return this.y;
    }
}
