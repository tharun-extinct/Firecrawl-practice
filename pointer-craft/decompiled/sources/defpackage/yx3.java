package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yx3 extends nr {
    public ji j;
    public int l;
    public eu4[] x;

    public final void a(eu4 eu4Var) {
        int i = this.l + 1;
        eu4[] eu4VarArr = this.x;
        if (i > eu4VarArr.length) {
            eu4[] eu4VarArr2 = (eu4[]) Arrays.copyOf(eu4VarArr, eu4VarArr.length * 2);
            this.x = eu4VarArr2;
        }
        eu4[] eu4VarArr3 = this.x;
        int i2 = this.l;
        eu4VarArr3[i2] = eu4Var;
        int i3 = i2 + 1;
        this.l = i3;
        if (i3 > 1) {
            int i4 = eu4Var.t;
        }
        eu4Var.j = true;
        eu4Var.g(this);
    }

    public final void m(eu4 eu4Var) {
        int i = 0;
        while (i < this.l) {
            if (this.x[i] == eu4Var) {
                while (true) {
                    int i2 = this.l;
                    if (i >= i2 - 1) {
                        this.l = i2 - 1;
                        eu4Var.j = false;
                        return;
                    } else {
                        eu4[] eu4VarArr = this.x;
                        int i3 = i + 1;
                        eu4VarArr[i] = eu4VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.nr
    public final eu4 n(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.l; i2++) {
            eu4[] eu4VarArr = this.x;
            eu4 eu4Var = eu4VarArr[i2];
            if (!zArr[eu4Var.t]) {
                ji jiVar = this.j;
                jiVar.t = eu4Var;
                int i3 = 8;
                if (i != -1) {
                    eu4 eu4Var2 = eu4VarArr[i];
                    while (i3 >= 0) {
                        float f = eu4Var2.i[i3];
                        float f2 = ((eu4) jiVar.t).i[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((eu4) jiVar.t).i[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.x[i];
    }

    @Override // defpackage.nr
    public final void t(kv2 kv2Var, nr nrVar, boolean z) {
        eu4 eu4Var = nrVar.g;
        if (eu4Var == null) {
            return;
        }
        float[] fArr = eu4Var.i;
        fr frVar = nrVar.n;
        int iN = frVar.n();
        for (int i = 0; i < iN; i++) {
            eu4 eu4VarV = frVar.v(i);
            float fX = frVar.x(i);
            ji jiVar = this.j;
            jiVar.t = eu4VarV;
            if (eu4VarV.j) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((eu4) jiVar.t).i;
                    float f = (fArr[i2] * fX) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((eu4) jiVar.t).i[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((yx3) jiVar.a).m((eu4) jiVar.t);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fX;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((eu4) jiVar.t).i[i3] = f3;
                    } else {
                        ((eu4) jiVar.t).i[i3] = 0.0f;
                    }
                }
                a(eu4VarV);
            }
            this.y = (nrVar.y * fX) + this.y;
        }
        m(eu4Var);
    }

    @Override // defpackage.nr
    public final String toString() {
        ji jiVar = this.j;
        String str = " goal -> (" + this.y + ") : ";
        for (int i = 0; i < this.l; i++) {
            jiVar.t = this.x[i];
            str = str + jiVar + " ";
        }
        return str;
    }

    @Override // defpackage.nr
    public final boolean v() {
        return this.l == 0;
    }
}
