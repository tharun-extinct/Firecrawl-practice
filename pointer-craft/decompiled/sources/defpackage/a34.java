package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a34 {
    public final t0 g;
    public final int n;
    public final Object[] r;
    public final String y;

    public a34(c12 c12Var, String str, Object[] objArr) {
        this.g = c12Var;
        this.y = str;
        this.r = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.n = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.n = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
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
