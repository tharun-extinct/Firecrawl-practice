package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class l56 implements Iterable, Serializable {
    public static final n56 t = new n56(m76.y);
    public int j = 0;

    static {
        int i = z46.g;
    }

    public static int a(int i, int i2, int i3) {
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

    public static n56 m(byte[] bArr, int i, int i2) {
        try {
            a(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new n56(bArr2);
        } catch (q76 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        a(i, i4, bArr.length);
        a(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l56)) {
            return false;
        }
        l56 l56Var = (l56) obj;
        int iV = v();
        if (iV != l56Var.v()) {
            return false;
        }
        if (iV == 0) {
            return true;
        }
        int i = this.j;
        int i2 = l56Var.j;
        if (i == 0 || i2 == 0 || i == i2) {
            return j(l56Var);
        }
        return false;
    }

    public abstract byte g(int i);

    public final int hashCode() {
        int iN = this.j;
        if (iN == 0) {
            int iV = v();
            iN = n(iV, iV);
            if (iN == 0) {
                iN = 1;
            }
            this.j = iN;
        }
        return iN;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new y90(this);
    }

    public abstract boolean j(l56 l56Var);

    public abstract void l(u56 u56Var);

    public abstract int n(int i, int i2);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iV = v();
        String strR = v() <= 50 ? dd6.r(this) : dd6.r(x(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iV);
        sb.append(" contents=\"");
        return du4.b(sb, strR, "\">");
    }

    public abstract int v();

    public abstract l56 x(int i, int i2);

    public abstract byte y(int i);
}
