package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pl4 {
    public int g;
    public final int[] y = new int[10];

    public final int g() {
        if ((this.g & 16) != 0) {
            return this.y[4];
        }
        return 65535;
    }

    public final void y(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.y;
            if (i >= iArr.length) {
                return;
            }
            this.g = (1 << i) | this.g;
            iArr[i] = i2;
        }
    }
}
