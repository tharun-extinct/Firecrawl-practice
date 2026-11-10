package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aw1 implements Comparable {
    public final String a;
    public final int j;
    public final String m;
    public final int t;

    public aw1(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.j = i;
        this.t = i2;
        this.a = str;
        this.m = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        aw1 aw1Var = (aw1) obj;
        aw1Var.getClass();
        int i = this.j - aw1Var.j;
        return i == 0 ? this.t - aw1Var.t : i;
    }
}
