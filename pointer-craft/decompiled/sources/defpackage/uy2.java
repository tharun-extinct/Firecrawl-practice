package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uy2 implements Cloneable {
    public /* synthetic */ Object[] a;
    public /* synthetic */ boolean j;
    public /* synthetic */ int m;
    public /* synthetic */ long[] t;

    public uy2(int i) {
        if (i == 0) {
            this.t = og0.s;
            this.a = og0.p;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.t = new long[i5];
        this.a = new Object[i5];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        uy2 uy2Var = (uy2) objClone;
        uy2Var.t = (long[]) this.t.clone();
        uy2Var.a = (Object[]) this.a.clone();
        return uy2Var;
    }

    public final void g() {
        int i = this.m;
        Object[] objArr = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.m = 0;
        this.j = false;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.m)) {
            cf6.l("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.j) {
            long[] jArr = this.t;
            Object[] objArr = this.a;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != pc6.g) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.j = false;
            this.m = i3;
        }
        return this.a[i];
    }

    public final int l() {
        if (this.j) {
            int i = this.m;
            long[] jArr = this.t;
            Object[] objArr = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != pc6.g) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.j = false;
            this.m = i2;
        }
        return this.m;
    }

    public final long n(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.m)) {
            cf6.l("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.j) {
            long[] jArr = this.t;
            Object[] objArr = this.a;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != pc6.g) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.j = false;
            this.m = i3;
        }
        return this.t[i];
    }

    public final int r(long j) {
        if (this.j) {
            int i = this.m;
            long[] jArr = this.t;
            Object[] objArr = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != pc6.g) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.j = false;
            this.m = i2;
        }
        return og0.q(this.t, this.m, j);
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.m * 28);
        sb.append('{');
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(n(i2));
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void v(long j, Object obj) {
        int iQ = og0.q(this.t, this.m, j);
        if (iQ >= 0) {
            this.a[iQ] = obj;
            return;
        }
        int i = ~iQ;
        int i2 = this.m;
        Object obj2 = pc6.g;
        if (i < i2) {
            Object[] objArr = this.a;
            if (objArr[i] == obj2) {
                this.t[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.j) {
            long[] jArr = this.t;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.a;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.j = false;
                this.m = i3;
                i = ~og0.q(this.t, i3, j);
            }
        }
        int i5 = this.m;
        if (i5 >= this.t.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.t = Arrays.copyOf(this.t, i9);
            this.a = Arrays.copyOf(this.a, i9);
        }
        int i10 = this.m;
        if (i10 - i != 0) {
            long[] jArr2 = this.t;
            int i11 = i + 1;
            pr.N(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.a;
            pr.O(objArr3, objArr3, i11, i, this.m);
        }
        this.t[i] = j;
        this.a[i] = obj;
        this.m++;
    }

    public final void x(long j) {
        int iQ = og0.q(this.t, this.m, j);
        if (iQ >= 0) {
            Object[] objArr = this.a;
            Object obj = objArr[iQ];
            Object obj2 = pc6.g;
            if (obj != obj2) {
                objArr[iQ] = obj2;
                this.j = true;
            }
        }
    }

    public final Object y(long j) {
        Object obj;
        int iQ = og0.q(this.t, this.m, j);
        if (iQ < 0 || (obj = this.a[iQ]) == pc6.g) {
            return null;
        }
        return obj;
    }

    public /* synthetic */ uy2(Object obj) {
        this(10);
    }
}
