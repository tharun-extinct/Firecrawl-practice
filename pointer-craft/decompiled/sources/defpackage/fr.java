package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fr {
    public final ro r;
    public final nr y;
    public int g = 0;
    public int n = 8;
    public int[] v = new int[8];
    public int[] x = new int[8];
    public float[] l = new float[8];
    public int j = -1;
    public int t = -1;
    public boolean a = false;

    public fr(nr nrVar, ro roVar) {
        this.y = nrVar;
        this.r = roVar;
    }

    public final void g(eu4 eu4Var, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.j;
            nr nrVar = this.y;
            if (i == -1) {
                this.j = 0;
                this.l[0] = f;
                this.v[0] = eu4Var.t;
                this.x[0] = -1;
                eu4Var.p++;
                eu4Var.g(nrVar);
                this.g++;
                if (this.a) {
                    return;
                }
                int i2 = this.t + 1;
                this.t = i2;
                int[] iArr2 = this.v;
                if (i2 >= iArr2.length) {
                    this.a = true;
                    this.t = iArr2.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.g; i4++) {
                int i5 = this.v[i];
                int i6 = eu4Var.t;
                if (i5 == i6) {
                    float[] fArr = this.l;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.j;
                        int[] iArr3 = this.x;
                        if (i == i7) {
                            this.j = iArr3[i];
                        } else {
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            eu4Var.y(nrVar);
                        }
                        if (this.a) {
                            this.t = i;
                        }
                        eu4Var.p--;
                        this.g--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.x[i];
            }
            int length = this.t;
            int i8 = length + 1;
            if (this.a) {
                int[] iArr4 = this.v;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i8;
            }
            int[] iArr5 = this.v;
            if (length < iArr5.length || this.g >= iArr5.length) {
                iArr = iArr5;
                break;
            }
            int i9 = 0;
            while (true) {
                iArr = this.v;
                if (i9 >= iArr.length) {
                    iArr5 = iArr;
                    iArr = iArr5;
                    break;
                } else {
                    if (iArr[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            if (length >= iArr.length) {
                length = iArr.length;
                int i10 = this.n * 2;
                this.n = i10;
                this.a = false;
                this.t = length - 1;
                this.l = Arrays.copyOf(this.l, i10);
                this.v = Arrays.copyOf(this.v, this.n);
                this.x = Arrays.copyOf(this.x, this.n);
            }
            this.v[length] = eu4Var.t;
            this.l[length] = f;
            int[] iArr6 = this.x;
            if (i3 != -1) {
                iArr6[length] = iArr6[i3];
                iArr6[i3] = length;
            } else {
                iArr6[length] = this.j;
                this.j = length;
            }
            eu4Var.p++;
            eu4Var.g(nrVar);
            this.g++;
            if (!this.a) {
                this.t++;
            }
            int i11 = this.t;
            int[] iArr7 = this.v;
            if (i11 >= iArr7.length) {
                this.a = true;
                this.t = iArr7.length - 1;
            }
        }
    }

    public final float j(eu4 eu4Var, boolean z) {
        int i = this.j;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.g) {
            if (this.v[i] == eu4Var.t) {
                int i4 = this.j;
                int[] iArr = this.x;
                if (i == i4) {
                    this.j = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    eu4Var.y(this.y);
                }
                eu4Var.p--;
                this.g--;
                this.v[i] = -1;
                if (this.a) {
                    this.t = i;
                }
                return this.l[i];
            }
            i2++;
            i3 = i;
            i = this.x[i];
        }
        return 0.0f;
    }

    public final void l(eu4 eu4Var, float f) {
        int[] iArr;
        if (f == 0.0f) {
            j(eu4Var, true);
            return;
        }
        int i = this.j;
        nr nrVar = this.y;
        if (i == -1) {
            this.j = 0;
            this.l[0] = f;
            this.v[0] = eu4Var.t;
            this.x[0] = -1;
            eu4Var.p++;
            eu4Var.g(nrVar);
            this.g++;
            if (this.a) {
                return;
            }
            int i2 = this.t + 1;
            this.t = i2;
            int[] iArr2 = this.v;
            if (i2 >= iArr2.length) {
                this.a = true;
                this.t = iArr2.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.g; i4++) {
            int i5 = this.v[i];
            int i6 = eu4Var.t;
            if (i5 == i6) {
                this.l[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.x[i];
        }
        int length = this.t;
        int i7 = length + 1;
        if (this.a) {
            int[] iArr3 = this.v;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.v;
        if (length < iArr4.length || this.g >= iArr4.length) {
            iArr = iArr4;
            break;
        }
        int i8 = 0;
        while (true) {
            iArr = this.v;
            if (i8 >= iArr.length) {
                iArr4 = iArr;
                iArr = iArr4;
                break;
            } else {
                if (iArr[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        if (length >= iArr.length) {
            length = iArr.length;
            int i9 = this.n * 2;
            this.n = i9;
            this.a = false;
            this.t = length - 1;
            this.l = Arrays.copyOf(this.l, i9);
            this.v = Arrays.copyOf(this.v, this.n);
            this.x = Arrays.copyOf(this.x, this.n);
        }
        this.v[length] = eu4Var.t;
        this.l[length] = f;
        int[] iArr5 = this.x;
        if (i3 != -1) {
            iArr5[length] = iArr5[i3];
            iArr5[i3] = length;
        } else {
            iArr5[length] = this.j;
            this.j = length;
        }
        eu4Var.p++;
        eu4Var.g(nrVar);
        int i10 = this.g + 1;
        this.g = i10;
        if (!this.a) {
            this.t++;
        }
        int[] iArr6 = this.v;
        if (i10 >= iArr6.length) {
            this.a = true;
        }
        if (this.t >= iArr6.length) {
            this.a = true;
            this.t = iArr6.length - 1;
        }
    }

    public final int n() {
        return this.g;
    }

    public final float r(eu4 eu4Var) {
        int i = this.j;
        for (int i2 = 0; i != -1 && i2 < this.g; i2++) {
            if (this.v[i] == eu4Var.t) {
                return this.l[i];
            }
            i = this.x[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.j;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.g; i2++) {
            StringBuilder sb = new StringBuilder(string.concat(" -> ") + this.l[i] + " : ");
            sb.append(((eu4[]) this.r.m)[this.v[i]]);
            string = sb.toString();
            i = this.x[i];
        }
        return string;
    }

    public final eu4 v(int i) {
        int i2 = this.j;
        for (int i3 = 0; i2 != -1 && i3 < this.g; i3++) {
            if (i3 == i) {
                return ((eu4[]) this.r.m)[this.v[i2]];
            }
            i2 = this.x[i2];
        }
        return null;
    }

    public final float x(int i) {
        int i2 = this.j;
        for (int i3 = 0; i2 != -1 && i3 < this.g; i3++) {
            if (i3 == i) {
                return this.l[i2];
            }
            i2 = this.x[i2];
        }
        return 0.0f;
    }

    public final void y() {
        int i = this.j;
        for (int i2 = 0; i != -1 && i2 < this.g; i2++) {
            eu4 eu4Var = ((eu4[]) this.r.m)[this.v[i]];
            if (eu4Var != null) {
                eu4Var.y(this.y);
            }
            i = this.x[i];
        }
        this.j = -1;
        this.t = -1;
        this.a = false;
        this.g = 0;
    }
}
