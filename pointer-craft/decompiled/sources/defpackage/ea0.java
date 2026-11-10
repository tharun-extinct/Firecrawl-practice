package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ea0 implements Iterable, Serializable {
    public static final t32 a;
    public static final ca0 t = new ca0(ff2.y);
    public int j;

    static {
        a = v8.g() ? new t32((byte) 15) : new t32((byte) 14);
    }

    public static ca0 n(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        y(i, i + i2, bArr.length);
        switch (a.j) {
            case 14:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new ca0(bArrCopyOfRange);
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

    public abstract byte g(int i);

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int size = size();
        ca0 ca0Var = (ca0) this;
        int iX = ca0Var.x();
        int i2 = size;
        for (int i3 = iX; i3 < iX + size; i3++) {
            i2 = (i2 * 31) + ca0Var.m[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.j = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = rs5.y(this);
        } else {
            ca0 ca0Var = (ca0) this;
            int iY = y(0, 47, ca0Var.size());
            strConcat = rs5.y(iY == 0 ? t : new z90(ca0Var.m, ca0Var.x(), iY)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return du4.b(sb, strConcat, "\">");
    }

    public abstract void v(int i, byte[] bArr);
}
