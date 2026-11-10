package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ls0 {
    public int[] a;
    public int[] g;
    public String[] j;
    public int[] l;
    public boolean[] m;
    public int[] n;
    public int q;
    public int r;
    public int t;
    public float[] v;
    public int x;
    public int[] y;

    public final void g(int i, float f) {
        int i2 = this.x;
        int[] iArr = this.n;
        if (i2 >= iArr.length) {
            this.n = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.v;
            this.v = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.n;
        int i3 = this.x;
        iArr2[i3] = i;
        float[] fArr2 = this.v;
        this.x = i3 + 1;
        fArr2[i3] = f;
    }

    public final void n(String str, int i) {
        int i2 = this.t;
        int[] iArr = this.l;
        if (i2 >= iArr.length) {
            this.l = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.j;
            this.j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.l;
        int i3 = this.t;
        iArr2[i3] = i;
        String[] strArr2 = this.j;
        this.t = i3 + 1;
        strArr2[i3] = str;
    }

    public final void r(int i, boolean z) {
        int i2 = this.q;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.m;
            this.m = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.q;
        iArr2[i3] = i;
        boolean[] zArr2 = this.m;
        this.q = i3 + 1;
        zArr2[i3] = z;
    }

    public final void y(int i, int i2) {
        int i3 = this.r;
        int[] iArr = this.g;
        if (i3 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.y;
            this.y = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.g;
        int i4 = this.r;
        iArr3[i4] = i;
        int[] iArr4 = this.y;
        this.r = i4 + 1;
        iArr4[i4] = i2;
    }
}
