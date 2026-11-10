package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kv2 {
    public static boolean s = false;
    public nr b;
    public final yx3 n;
    public final ro w;
    public int g = 1000;
    public boolean y = false;
    public int r = 0;
    public int v = 32;
    public int x = 32;
    public boolean j = false;
    public boolean[] t = new boolean[32];
    public int a = 1;
    public int m = 0;
    public int q = 32;
    public eu4[] c = new eu4[1000];
    public int i = 0;
    public nr[] l = new nr[32];

    public kv2() {
        u();
        ro roVar = new ro((byte) 7, false);
        roVar.t = new ra2();
        roVar.a = new ra2();
        roVar.m = new eu4[32];
        this.w = roVar;
        yx3 yx3Var = new yx3(roVar);
        yx3Var.x = new eu4[128];
        yx3Var.l = 0;
        yx3Var.j = new ji((Object) yx3Var, (byte) 24);
        this.n = yx3Var;
        this.b = new nr(roVar);
    }

    public static int c(Object obj) {
        eu4 eu4Var = ((as0) obj).t;
        if (eu4Var != null) {
            return (int) (eu4Var.q + 0.5f);
        }
        return 0;
    }

    public final eu4 a(int i) {
        if (this.a + 1 >= this.x) {
            i();
        }
        eu4 eu4VarG = g(4);
        float[] fArr = eu4VarG.i;
        int i2 = this.r + 1;
        this.r = i2;
        this.a++;
        eu4VarG.t = i2;
        eu4VarG.m = i;
        ((eu4[]) this.w.m)[i2] = eu4VarG;
        yx3 yx3Var = this.n;
        yx3Var.j.t = eu4VarG;
        Arrays.fill(fArr, 0.0f);
        fArr[eu4VarG.m] = 1.0f;
        yx3Var.a(eu4VarG);
        return eu4VarG;
    }

    public final void b() {
        yx3 yx3Var = this.n;
        if (yx3Var.v()) {
            t();
            return;
        }
        if (!this.j) {
            s(yx3Var);
            return;
        }
        for (int i = 0; i < this.m; i++) {
            if (!this.l[i].v) {
                s(yx3Var);
                return;
            }
        }
        t();
    }

    public final eu4 g(int i) {
        ra2 ra2Var = (ra2) this.w.a;
        int i2 = ra2Var.g;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = (Object[]) ra2Var.y;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            ra2Var.g = i3;
            obj = obj2;
        }
        eu4 eu4Var = (eu4) obj;
        if (eu4Var == null) {
            eu4Var = new eu4(i);
            eu4Var.u = i;
        } else {
            eu4Var.r();
            eu4Var.u = i;
        }
        int i4 = this.i;
        int i5 = this.g;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.g = i6;
            this.c = (eu4[]) Arrays.copyOf(this.c, i6);
        }
        eu4[] eu4VarArr = this.c;
        int i7 = this.i;
        this.i = i7 + 1;
        eu4VarArr[i7] = eu4Var;
        return eu4Var;
    }

    public final void i() {
        int i = this.v * 2;
        this.v = i;
        this.l = (nr[]) Arrays.copyOf(this.l, i);
        ro roVar = this.w;
        roVar.m = (eu4[]) Arrays.copyOf((eu4[]) roVar.m, this.v);
        int i2 = this.v;
        this.t = new boolean[i2];
        this.x = i2;
        this.q = i2;
    }

    public final void j(nr nrVar) {
        int i;
        if (nrVar.v) {
            nrVar.g.n(this, nrVar.y);
        } else {
            nr[] nrVarArr = this.l;
            int i2 = this.m;
            nrVarArr[i2] = nrVar;
            eu4 eu4Var = nrVar.g;
            eu4Var.a = i2;
            this.m = i2 + 1;
            eu4Var.v(this, nrVar);
        }
        if (this.y) {
            int i3 = 0;
            while (i3 < this.m) {
                if (this.l[i3] == null) {
                    System.out.println("WTF");
                }
                nr nrVar2 = this.l[i3];
                if (nrVar2 != null && nrVar2.v) {
                    nrVar2.g.n(this, nrVar2.y);
                    ((ra2) this.w.t).g(nrVar2);
                    this.l[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.m;
                        if (i4 >= i) {
                            break;
                        }
                        nr[] nrVarArr2 = this.l;
                        int i6 = i4 - 1;
                        nr nrVar3 = nrVarArr2[i4];
                        nrVarArr2[i6] = nrVar3;
                        eu4 eu4Var2 = nrVar3.g;
                        if (eu4Var2.a == i4) {
                            eu4Var2.a = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.l[i5] = null;
                    }
                    this.m = i - 1;
                    i3--;
                }
                i3++;
            }
            this.y = false;
        }
    }

    public final void l(eu4 eu4Var, eu4 eu4Var2, int i, int i2) {
        nr nrVarQ = q();
        eu4 eu4VarW = w();
        eu4VarW.m = 0;
        nrVarQ.r(eu4Var, eu4Var2, eu4VarW, i);
        if (i2 != 8) {
            nrVarQ.n.l(a(i2), (int) (nrVarQ.n.r(eu4VarW) * (-1.0f)));
        }
        r(nrVarQ);
    }

    public final eu4 m(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.a + 1 >= this.x) {
            i();
        }
        if (!(obj instanceof as0)) {
            return null;
        }
        as0 as0Var = (as0) obj;
        eu4 eu4Var = as0Var.t;
        if (eu4Var == null) {
            as0Var.m();
            eu4Var = as0Var.t;
        }
        int i = eu4Var.t;
        ro roVar = this.w;
        if (i != -1 && i <= this.r && ((eu4[]) roVar.m)[i] != null) {
            return eu4Var;
        }
        if (i != -1) {
            eu4Var.r();
        }
        int i2 = this.r + 1;
        this.r = i2;
        this.a++;
        eu4Var.t = i2;
        eu4Var.u = 1;
        ((eu4[]) roVar.m)[i2] = eu4Var;
        return eu4Var;
    }

    public final void n(eu4 eu4Var, int i) {
        int i2 = eu4Var.a;
        if (i2 == -1) {
            eu4Var.n(this, i);
            for (int i3 = 0; i3 < this.r + 1; i3++) {
                eu4 eu4Var2 = ((eu4[]) this.w.m)[i3];
            }
            return;
        }
        if (i2 == -1) {
            nr nrVarQ = q();
            nrVarQ.g = eu4Var;
            float f = i;
            eu4Var.q = f;
            nrVarQ.y = f;
            nrVarQ.v = true;
            r(nrVarQ);
            return;
        }
        nr nrVar = this.l[i2];
        if (nrVar.v) {
            nrVar.y = i;
            return;
        }
        if (nrVar.n.n() == 0) {
            nrVar.v = true;
            nrVar.y = i;
            return;
        }
        nr nrVarQ2 = q();
        if (i < 0) {
            nrVarQ2.y = i * (-1);
            nrVarQ2.n.l(eu4Var, 1.0f);
        } else {
            nrVarQ2.y = i;
            nrVarQ2.n.l(eu4Var, -1.0f);
        }
        r(nrVarQ2);
    }

    public final void p(nr nrVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            this.t[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.a * 2) {
                return;
            }
            eu4 eu4Var = nrVar.g;
            if (eu4Var != null) {
                this.t[eu4Var.t] = true;
            }
            eu4 eu4VarN = nrVar.n(this.t);
            if (eu4VarN != null) {
                boolean[] zArr = this.t;
                int i4 = eu4VarN.t;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (eu4VarN != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.m) {
                    nr nrVar2 = this.l[i5];
                    if (nrVar2.g.u != 1 && !nrVar2.v) {
                        fr frVar = nrVar2.n;
                        int i7 = frVar.j;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= frVar.g) {
                                z = false;
                                break;
                            } else if (frVar.v[i7] == eu4VarN.t) {
                                z = true;
                                break;
                            } else {
                                i7 = frVar.x[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fR = nrVar2.n.r(eu4VarN);
                            if (fR < 0.0f) {
                                float f2 = (-nrVar2.y) / fR;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    nr nrVar3 = this.l[i6];
                    nrVar3.g.a = -1;
                    nrVar3.l(eu4VarN);
                    eu4 eu4Var2 = nrVar3.g;
                    eu4Var2.a = i6;
                    eu4Var2.v(this, nrVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final nr q() {
        Object obj;
        ro roVar = this.w;
        ra2 ra2Var = (ra2) roVar.t;
        int i = ra2Var.g;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = (Object[]) ra2Var.y;
            obj = objArr[i2];
            objArr[i2] = null;
            ra2Var.g = i2;
        } else {
            obj = null;
        }
        nr nrVar = (nr) obj;
        if (nrVar == null) {
            return new nr(roVar);
        }
        nrVar.g = null;
        nrVar.n.y();
        nrVar.y = 0.0f;
        nrVar.v = false;
        return nrVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void r(nr nrVar) {
        boolean z;
        boolean z2;
        eu4 eu4VarX;
        if (this.m + 1 >= this.q || this.a + 1 >= this.x) {
            i();
        }
        if (nrVar.v) {
            z = false;
        } else {
            ArrayList arrayList = nrVar.r;
            if (this.l.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iN = nrVar.n.n();
                    for (int i = 0; i < iN; i++) {
                        eu4 eu4VarV = nrVar.n.v(i);
                        if (eu4VarV.a != -1 || eu4VarV.w) {
                            arrayList.add(eu4VarV);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            eu4 eu4Var = (eu4) arrayList.get(i2);
                            if (eu4Var.w) {
                                nrVar.j(this, eu4Var, true);
                            } else {
                                nrVar.t(this, this.l[eu4Var.a], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (nrVar.g != null && nrVar.n.n() == 0) {
                    nrVar.v = true;
                    this.y = true;
                }
            }
            if (nrVar.v()) {
                return;
            }
            float f = nrVar.y;
            float f2 = 0.0f;
            if (f < 0.0f) {
                nrVar.y = f * (-1.0f);
                fr frVar = nrVar.n;
                int i3 = frVar.j;
                for (int i4 = 0; i3 != -1 && i4 < frVar.g; i4++) {
                    float[] fArr = frVar.l;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = frVar.x[i3];
                }
            }
            int iN2 = nrVar.n.n();
            float f3 = 0.0f;
            float f4 = 0.0f;
            eu4 eu4Var2 = null;
            eu4 eu4Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iN2) {
                float fX = nrVar.n.x(i5);
                eu4 eu4VarV2 = nrVar.n.v(i5);
                float f5 = f2;
                if (eu4VarV2.u == 1) {
                    if (eu4Var2 == null) {
                        if (eu4VarV2.p <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        eu4Var2 = eu4VarV2;
                        f3 = fX;
                    } else {
                        if (f3 > fX) {
                            if (eu4VarV2.p > 1) {
                                z4 = false;
                            }
                            eu4Var2 = eu4VarV2;
                            f3 = fX;
                        } else if (z4 || eu4VarV2.p > 1) {
                        }
                        z4 = true;
                        eu4Var2 = eu4VarV2;
                        f3 = fX;
                    }
                } else if (eu4Var2 == null && fX < f5) {
                    if (eu4Var3 == null) {
                        if (eu4VarV2.p <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        eu4Var3 = eu4VarV2;
                        f4 = fX;
                    } else {
                        if (f4 > fX) {
                            if (eu4VarV2.p > 1) {
                                z5 = false;
                            }
                            eu4Var3 = eu4VarV2;
                            f4 = fX;
                        } else if (z5 || eu4VarV2.p > 1) {
                        }
                        z5 = true;
                        eu4Var3 = eu4VarV2;
                        f4 = fX;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (eu4Var2 == null) {
                eu4Var2 = eu4Var3;
            }
            if (eu4Var2 == null) {
                z2 = true;
            } else {
                nrVar.l(eu4Var2);
                z2 = false;
            }
            if (nrVar.n.n() == 0) {
                nrVar.v = true;
            }
            if (z2) {
                if (this.a + 1 >= this.x) {
                    i();
                }
                eu4 eu4VarG = g(3);
                int i6 = this.r + 1;
                this.r = i6;
                this.a++;
                eu4VarG.t = i6;
                ro roVar = this.w;
                ((eu4[]) roVar.m)[i6] = eu4VarG;
                nrVar.g = eu4VarG;
                int i7 = this.m;
                j(nrVar);
                if (this.m == i7 + 1) {
                    nr nrVar2 = this.b;
                    nrVar2.g = null;
                    nrVar2.n.y();
                    for (int i8 = 0; i8 < nrVar.n.n(); i8++) {
                        nrVar2.n.g(nrVar.n.v(i8), nrVar.n.x(i8), true);
                    }
                    p(this.b);
                    if (eu4VarG.a == -1) {
                        if (nrVar.g == eu4VarG && (eu4VarX = nrVar.x(null, eu4VarG)) != null) {
                            nrVar.l(eu4VarX);
                        }
                        if (!nrVar.v) {
                            nrVar.g.v(this, nrVar);
                        }
                        ((ra2) roVar.t).g(nrVar);
                        this.m--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            eu4 eu4Var4 = nrVar.g;
            if (eu4Var4 == null) {
                return;
            }
            if (eu4Var4.u != 1 && nrVar.y < f6) {
                return;
            }
        }
        if (z) {
            return;
        }
        j(nrVar);
    }

    public final void s(yx3 yx3Var) {
        for (int i = 0; i < this.m; i++) {
            nr nrVar = this.l[i];
            int i2 = 1;
            if (nrVar.g.u != 1) {
                float f = 0.0f;
                if (nrVar.y < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.m) {
                            nr nrVar2 = this.l[i6];
                            if (nrVar2.g.u != i2 && !nrVar2.v && nrVar2.y < f) {
                                int iN = nrVar2.n.n();
                                int i8 = 0;
                                while (i8 < iN) {
                                    eu4 eu4VarV = nrVar2.n.v(i8);
                                    float fR = nrVar2.n.r(eu4VarV);
                                    if (fR > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = eu4VarV.c[i9] / fR;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = eu4VarV.t;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            nr nrVar3 = this.l[i4];
                            nrVar3.g.a = -1;
                            nrVar3.l(((eu4[]) this.w.m)[i5]);
                            eu4 eu4Var = nrVar3.g;
                            eu4Var.a = i4;
                            eu4Var.v(this, nrVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.a / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        p(yx3Var);
        t();
    }

    public final void t() {
        for (int i = 0; i < this.m; i++) {
            nr nrVar = this.l[i];
            nrVar.g.q = nrVar.y;
        }
    }

    public final void u() {
        for (int i = 0; i < this.m; i++) {
            nr nrVar = this.l[i];
            if (nrVar != null) {
                ((ra2) this.w.t).g(nrVar);
            }
            this.l[i] = null;
        }
    }

    public final void v(eu4 eu4Var, eu4 eu4Var2, int i, int i2) {
        if (i2 == 8 && eu4Var2.w && eu4Var.a == -1) {
            eu4Var.n(this, eu4Var2.q + i);
            return;
        }
        nr nrVarQ = q();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            nrVarQ.y = i;
        }
        fr frVar = nrVarQ.n;
        if (z) {
            frVar.l(eu4Var, 1.0f);
            nrVarQ.n.l(eu4Var2, -1.0f);
        } else {
            frVar.l(eu4Var, -1.0f);
            nrVarQ.n.l(eu4Var2, 1.0f);
        }
        if (i2 != 8) {
            nrVarQ.g(this, i2);
        }
        r(nrVarQ);
    }

    public final eu4 w() {
        if (this.a + 1 >= this.x) {
            i();
        }
        eu4 eu4VarG = g(3);
        int i = this.r + 1;
        this.r = i;
        this.a++;
        eu4VarG.t = i;
        ((eu4[]) this.w.m)[i] = eu4VarG;
        return eu4VarG;
    }

    public final void x(eu4 eu4Var, eu4 eu4Var2, int i, int i2) {
        nr nrVarQ = q();
        eu4 eu4VarW = w();
        eu4VarW.m = 0;
        nrVarQ.y(eu4Var, eu4Var2, eu4VarW, i);
        if (i2 != 8) {
            nrVarQ.n.l(a(i2), (int) (nrVarQ.n.r(eu4VarW) * (-1.0f)));
        }
        r(nrVarQ);
    }

    public final void y(eu4 eu4Var, eu4 eu4Var2, int i, float f, eu4 eu4Var3, eu4 eu4Var4, int i2, int i3) {
        nr nrVarQ = q();
        if (eu4Var2 == eu4Var3) {
            nrVarQ.n.l(eu4Var, 1.0f);
            nrVarQ.n.l(eu4Var4, 1.0f);
            nrVarQ.n.l(eu4Var2, -2.0f);
        } else {
            fr frVar = nrVarQ.n;
            if (f == 0.5f) {
                frVar.l(eu4Var, 1.0f);
                nrVarQ.n.l(eu4Var2, -1.0f);
                nrVarQ.n.l(eu4Var3, -1.0f);
                nrVarQ.n.l(eu4Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    nrVarQ.y = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                frVar.l(eu4Var, -1.0f);
                nrVarQ.n.l(eu4Var2, 1.0f);
                nrVarQ.y = i;
            } else if (f >= 1.0f) {
                frVar.l(eu4Var4, -1.0f);
                nrVarQ.n.l(eu4Var3, 1.0f);
                nrVarQ.y = -i2;
            } else {
                float f2 = 1.0f - f;
                frVar.l(eu4Var, f2 * 1.0f);
                nrVarQ.n.l(eu4Var2, f2 * (-1.0f));
                nrVarQ.n.l(eu4Var3, (-1.0f) * f);
                nrVarQ.n.l(eu4Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    nrVarQ.y = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            nrVarQ.g(this, i3);
        }
        r(nrVarQ);
    }

    public final void z() {
        ro roVar;
        int i = 0;
        while (true) {
            roVar = this.w;
            eu4[] eu4VarArr = (eu4[]) roVar.m;
            if (i >= eu4VarArr.length) {
                break;
            }
            eu4 eu4Var = eu4VarArr[i];
            if (eu4Var != null) {
                eu4Var.r();
            }
            i++;
        }
        ra2 ra2Var = (ra2) roVar.a;
        eu4[] eu4VarArr2 = this.c;
        int length = this.i;
        ra2Var.getClass();
        if (length > eu4VarArr2.length) {
            length = eu4VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            eu4 eu4Var2 = eu4VarArr2[i2];
            int i3 = ra2Var.g;
            Object[] objArr = (Object[]) ra2Var.y;
            if (i3 < objArr.length) {
                objArr[i3] = eu4Var2;
                ra2Var.g = i3 + 1;
            }
        }
        this.i = 0;
        Arrays.fill((eu4[]) roVar.m, (Object) null);
        this.r = 0;
        yx3 yx3Var = this.n;
        yx3Var.l = 0;
        yx3Var.y = 0.0f;
        this.a = 1;
        for (int i4 = 0; i4 < this.m; i4++) {
            nr nrVar = this.l[i4];
        }
        u();
        this.m = 0;
        this.b = new nr(roVar);
    }
}
