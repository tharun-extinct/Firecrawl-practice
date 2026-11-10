package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jk5 {
    public int g;
    public int n;
    public int r;
    public int v;
    public int y;

    public final boolean g() {
        int i;
        int i2;
        int i3;
        int i4 = this.g;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.n;
            int i7 = this.y;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.n;
            int i9 = this.r;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.v;
            int i11 = this.y;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.v;
            int i13 = this.r;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }
}
