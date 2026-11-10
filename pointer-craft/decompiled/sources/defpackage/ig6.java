package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ig6 implements oh4 {
    public static ha2 j;

    public abstract int g(int i);

    @Override // defpackage.oh4
    public int l(int i) {
        int iG = g(i);
        if (iG == -1 || g(iG) == -1) {
            return -1;
        }
        return iG;
    }

    @Override // defpackage.oh4
    public int m(int i) {
        int iR = r(i);
        if (iR == -1 || r(iR) == -1) {
            return -1;
        }
        return iR;
    }

    @Override // defpackage.oh4
    public int n(int i) {
        return g(i);
    }

    public abstract int r(int i);

    @Override // defpackage.oh4
    public int y(int i) {
        return r(i);
    }
}
