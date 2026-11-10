package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ca0 extends ea0 {
    public final byte[] m;

    public ca0(byte[] bArr) {
        this.j = 0;
        bArr.getClass();
        this.m = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea0) || size() != ((ea0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return obj.equals(this);
        }
        ca0 ca0Var = (ca0) obj;
        int i = this.j;
        int i2 = ca0Var.j;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > ca0Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > ca0Var.size()) {
            StringBuilder sbP = du4.p(size, "Ran off end of other: 0, ", ", ");
            sbP.append(ca0Var.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        byte[] bArr = ca0Var.m;
        int iX = x() + size;
        int iX2 = x();
        int iX3 = ca0Var.x();
        while (iX2 < iX) {
            if (this.m[iX2] != bArr[iX3]) {
                return false;
            }
            iX2++;
            iX3++;
        }
        return true;
    }

    @Override // defpackage.ea0
    public byte g(int i) {
        return this.m[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y90(this);
    }

    public byte l(int i) {
        return this.m[i];
    }

    @Override // defpackage.ea0
    public int size() {
        return this.m.length;
    }

    @Override // defpackage.ea0
    public void v(int i, byte[] bArr) {
        System.arraycopy(this.m, 0, bArr, 0, i);
    }

    public int x() {
        return 0;
    }
}
