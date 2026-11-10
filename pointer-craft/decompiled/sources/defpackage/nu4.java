package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nu4 implements Cloneable {
    public /* synthetic */ Object[] a;
    public /* synthetic */ boolean j;
    public /* synthetic */ int m;
    public /* synthetic */ int[] t;

    public nu4(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.t = new int[i5];
        this.a = new Object[i5];
    }

    public final void g(int i, ColorStateList colorStateList) {
        int i2 = this.m;
        if (i2 != 0 && i <= this.t[i2 - 1]) {
            n(i, colorStateList);
            return;
        }
        if (this.j && i2 >= this.t.length) {
            c93.e(this);
        }
        int i3 = this.m;
        if (i3 >= this.t.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.t = Arrays.copyOf(this.t, i7);
            this.a = Arrays.copyOf(this.a, i7);
        }
        this.t[i3] = i;
        this.a[i3] = colorStateList;
        this.m = i3 + 1;
    }

    public final void n(int i, Object obj) {
        int iM = og0.m(this.m, i, this.t);
        if (iM >= 0) {
            this.a[iM] = obj;
            return;
        }
        int i2 = ~iM;
        int i3 = this.m;
        if (i2 < i3) {
            Object[] objArr = this.a;
            if (objArr[i2] == c93.f) {
                this.t[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.j && i3 >= this.t.length) {
            c93.e(this);
            i2 = ~og0.m(this.m, i, this.t);
        }
        int i4 = this.m;
        if (i4 >= this.t.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.t = Arrays.copyOf(this.t, i8);
            this.a = Arrays.copyOf(this.a, i8);
        }
        int i9 = this.m;
        if (i9 - i2 != 0) {
            int[] iArr = this.t;
            int i10 = i2 + 1;
            pr.M(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.a;
            pr.O(objArr2, objArr2, i10, i2, this.m);
        }
        this.t[i2] = i;
        this.a[i2] = obj;
        this.m++;
    }

    public final int r(int i) {
        if (this.j) {
            c93.e(this);
        }
        if (i >= this.m || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.t[i];
    }

    public final String toString() {
        if (v() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.m * 28);
        sb.append('{');
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(r(i2));
            sb.append('=');
            Object objX = x(i2);
            if (objX != this) {
                sb.append(objX);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int v() {
        if (this.j) {
            c93.e(this);
        }
        return this.m;
    }

    public final Object x(int i) {
        if (this.j) {
            c93.e(this);
        }
        if (i >= this.m || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[i];
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final nu4 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        nu4 nu4Var = (nu4) objClone;
        nu4Var.t = (int[]) this.t.clone();
        nu4Var.a = (Object[]) this.a.clone();
        return nu4Var;
    }
}
