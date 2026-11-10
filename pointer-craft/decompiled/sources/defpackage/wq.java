package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq implements xq {
    public final /* synthetic */ byte j;

    public /* synthetic */ wq(byte b) {
        this.j = b;
    }

    @Override // defpackage.xq
    public final void j(j51 j51Var, int i, int[] iArr, fl2 fl2Var, int[] iArr2) {
        byte b = this.j;
        fl2 fl2Var2 = fl2.j;
        int i2 = 0;
        switch (b) {
            case 0:
                if (fl2Var == fl2Var2) {
                    int i3 = 0;
                    for (int i4 : iArr) {
                        i3 += i4;
                    }
                    int i5 = i - i3;
                    int length = iArr.length;
                    int i6 = 0;
                    while (i2 < length) {
                        int i7 = iArr[i2];
                        iArr2[i6] = i5;
                        i5 += i7;
                        i2++;
                        i6++;
                    }
                } else {
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i8 = iArr[length2];
                        iArr2[length2] = i2;
                        i2 += i8;
                    }
                }
                break;
            default:
                if (fl2Var == fl2Var2) {
                    int length3 = iArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    while (i2 < length3) {
                        int i11 = iArr[i2];
                        iArr2[i9] = i10;
                        i10 += i11;
                        i2++;
                        i9++;
                    }
                } else {
                    int length4 = iArr.length;
                    int i12 = 0;
                    while (i2 < length4) {
                        i12 += iArr[i2];
                        i2++;
                    }
                    int i13 = i - i12;
                    for (int length5 = iArr.length - 1; -1 < length5; length5--) {
                        int i14 = iArr[length5];
                        iArr2[length5] = i13;
                        i13 += i14;
                    }
                }
                break;
        }
    }

    public final String toString() {
        switch (this.j) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
