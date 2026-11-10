package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yq implements xq, ar {
    public final zq a;
    public final float j;
    public final float m;
    public final boolean t;

    public yq(float f, boolean z, zq zqVar) {
        this.j = f;
        this.t = z;
        this.a = zqVar;
        this.m = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        return vb1.y(this.j, yqVar.j) && this.t == yqVar.t && yf2.p(this.a, yqVar.a);
    }

    @Override // defpackage.xq, defpackage.ar
    public final float g() {
        return this.m;
    }

    public final int hashCode() {
        int iL = xi3.l(Float.hashCode(this.j) * 31, 31, this.t);
        zq zqVar = this.a;
        return iL + (zqVar == null ? 0 : zqVar.hashCode());
    }

    @Override // defpackage.xq
    public final void j(j51 j51Var, int i, int[] iArr, fl2 fl2Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iV = j51Var.V(this.j);
        boolean z = this.t && fl2Var == fl2.t;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iV, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iV, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        zq zqVar = this.a;
        if (zqVar == null || i2 <= 0) {
            return;
        }
        int iV2 = zqVar.v(i2, fl2Var);
        if (z) {
            iV2 -= i2;
        }
        if (iV2 != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iV2;
            }
        }
    }

    @Override // defpackage.ar
    public final void m(j51 j51Var, int i, int[] iArr, int[] iArr2) {
        j(j51Var, i, iArr, fl2.j, iArr2);
    }

    public final String toString() {
        return (this.t ? "" : "Absolute") + "Arrangement#spacedAligned(" + vb1.r(this.j) + ", " + this.a + ")";
    }
}
