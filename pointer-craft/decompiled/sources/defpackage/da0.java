package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class da0 implements Iterable, Serializable {
    public static final da0 a = new da0(gf2.y);
    public static final ba0 m;
    public int j = 0;
    public final byte[] t;

    static {
        m = w8.g() ? new l76((byte) 8) : new bi6((byte) 14);
    }

    public da0(byte[] bArr) {
        bArr.getClass();
        this.t = bArr;
    }

    public static da0 n(byte[] bArr, int i, int i2) {
        y(i, i + i2, bArr.length);
        return new da0(m.n(bArr, i, i2));
    }

    public static int y(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            l0.p(du4.w(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            l0.p(du4.m(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        l0.p(du4.m(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da0) || size() != ((da0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return obj.equals(this);
        }
        da0 da0Var = (da0) obj;
        int i = this.j;
        int i2 = da0Var.j;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > da0Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > da0Var.size()) {
            StringBuilder sbP = du4.p(size, "Ran off end of other: 0, ", ", ");
            sbP.append(da0Var.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        byte[] bArr = da0Var.t;
        int iX = x() + size;
        int iX2 = x();
        int iX3 = da0Var.x();
        while (iX2 < iX) {
            if (this.t[iX2] != bArr[iX3]) {
                return false;
            }
            iX2++;
            iX3++;
        }
        return true;
    }

    public byte g(int i) {
        return this.t[i];
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iX = x();
        int i2 = size;
        for (int i3 = iX; i3 < iX + size; i3++) {
            i2 = (i2 * 31) + this.t[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.j = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y90(this);
    }

    public byte l(int i) {
        return this.t[i];
    }

    public int size() {
        return this.t.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = dt5.g(this);
        } else {
            int iY = y(0, 47, size());
            strConcat = dt5.g(iY == 0 ? a : new aa0(this.t, x(), iY)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return du4.b(sb, strConcat, "\">");
    }

    public void v(int i, byte[] bArr) {
        System.arraycopy(this.t, 0, bArr, 0, i);
    }

    public int x() {
        return 0;
    }
}
