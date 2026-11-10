package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p96 {
    public final v46 g;
    public final int n;
    public final Object[] r;
    public final String y;

    public p96(v46 v46Var, String str, Object[] objArr) {
        this.g = v46Var;
        this.y = str;
        this.r = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.n = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.n = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    public final int g() {
        int i = this.n;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
