package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends u1 {
    public static x1 r;

    @Override // defpackage.u1
    public final int[] m(int i) {
        int length = j().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && j().charAt(i - 1) == '\n' && !w(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (j().charAt(i2) == '\n' || (i2 != 0 && j().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return l(i2, i);
    }

    @Override // defpackage.u1
    public final int[] v(int i) {
        int length = j().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && j().charAt(i) == '\n' && (j().charAt(i) == '\n' || (i != 0 && j().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !w(i2)) {
            i2++;
        }
        return l(i, i2);
    }

    public final boolean w(int i) {
        if (i <= 0 || j().charAt(i - 1) == '\n') {
            return false;
        }
        return i == j().length() || j().charAt(i) == '\n';
    }
}
