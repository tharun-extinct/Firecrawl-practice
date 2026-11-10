package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class jk1 extends p0 implements ik1, RandomAccess, Serializable {
    public final Enum[] j;

    public jk1(Enum[] enumArr) {
        this.j = enumArr;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) pr.a0(r2.ordinal(), this.j)) == r2;
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.j;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        l0.p(du4.m(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.p0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) pr.a0(iOrdinal, this.j)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.p0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) pr.a0(iOrdinal, this.j)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
