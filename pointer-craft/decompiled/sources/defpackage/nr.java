package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class nr {
    public final fr n;
    public eu4 g = null;
    public float y = 0.0f;
    public final ArrayList r = new ArrayList();
    public boolean v = false;

    public nr(ro roVar) {
        this.n = new fr(this, roVar);
    }

    public final void g(kv2 kv2Var, int i) {
        eu4 eu4VarA = kv2Var.a(i);
        fr frVar = this.n;
        frVar.l(eu4VarA, 1.0f);
        frVar.l(kv2Var.a(i), -1.0f);
    }

    public final void j(kv2 kv2Var, eu4 eu4Var, boolean z) {
        if (eu4Var.w) {
            fr frVar = this.n;
            float fR = frVar.r(eu4Var);
            this.y = (eu4Var.q * fR) + this.y;
            frVar.j(eu4Var, z);
            if (z) {
                eu4Var.y(this);
            }
            if (frVar.n() == 0) {
                this.v = true;
                kv2Var.y = true;
            }
        }
    }

    public final void l(eu4 eu4Var) {
        eu4 eu4Var2 = this.g;
        fr frVar = this.n;
        if (eu4Var2 != null) {
            frVar.l(eu4Var2, -1.0f);
            this.g.a = -1;
            this.g = null;
        }
        float fJ = frVar.j(eu4Var, true) * (-1.0f);
        this.g = eu4Var;
        if (fJ == 1.0f) {
            return;
        }
        this.y /= fJ;
        int i = frVar.j;
        for (int i2 = 0; i != -1 && i2 < frVar.g; i2++) {
            float[] fArr = frVar.l;
            fArr[i] = fArr[i] / fJ;
            i = frVar.x[i];
        }
    }

    public eu4 n(boolean[] zArr) {
        return x(zArr, null);
    }

    public final void r(eu4 eu4Var, eu4 eu4Var2, eu4 eu4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.y = i;
        }
        fr frVar = this.n;
        if (z) {
            frVar.l(eu4Var, 1.0f);
            frVar.l(eu4Var2, -1.0f);
            frVar.l(eu4Var3, 1.0f);
        } else {
            frVar.l(eu4Var, -1.0f);
            frVar.l(eu4Var2, 1.0f);
            frVar.l(eu4Var3, -1.0f);
        }
    }

    public void t(kv2 kv2Var, nr nrVar, boolean z) {
        fr frVar = this.n;
        frVar.getClass();
        float fR = frVar.r(nrVar.g);
        frVar.j(nrVar.g, z);
        fr frVar2 = nrVar.n;
        int iN = frVar2.n();
        for (int i = 0; i < iN; i++) {
            eu4 eu4VarV = frVar2.v(i);
            frVar.g(eu4VarV, frVar2.r(eu4VarV) * fR, z);
        }
        this.y = (nrVar.y * fR) + this.y;
        if (z) {
            nrVar.g.y(this);
        }
        if (this.g == null || frVar.n() != 0) {
            return;
        }
        this.v = true;
        kv2Var.y = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.g == null ? "0" : "" + this.g).concat(" = ");
        if (this.y != 0.0f) {
            strConcat = strConcat + this.y;
            z = true;
        } else {
            z = false;
        }
        fr frVar = this.n;
        int iN = frVar.n();
        for (int i = 0; i < iN; i++) {
            eu4 eu4VarV = frVar.v(i);
            if (eu4VarV != null) {
                float fX = frVar.x(i);
                if (fX != 0.0f) {
                    String string = eu4VarV.toString();
                    if (z) {
                        if (fX > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fX *= -1.0f;
                        }
                    } else if (fX < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fX *= -1.0f;
                    }
                    strConcat = fX == 1.0f ? strConcat.concat(string) : strConcat + fX + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    public boolean v() {
        return this.g == null && this.y == 0.0f && this.n.n() == 0;
    }

    public final eu4 x(boolean[] zArr, eu4 eu4Var) {
        int i;
        fr frVar = this.n;
        int iN = frVar.n();
        eu4 eu4Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iN; i2++) {
            float fX = frVar.x(i2);
            if (fX < 0.0f) {
                eu4 eu4VarV = frVar.v(i2);
                if ((zArr == null || !zArr[eu4VarV.t]) && eu4VarV != eu4Var && (((i = eu4VarV.u) == 3 || i == 4) && fX < f)) {
                    f = fX;
                    eu4Var2 = eu4VarV;
                }
            }
        }
        return eu4Var2;
    }

    public final void y(eu4 eu4Var, eu4 eu4Var2, eu4 eu4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.y = i;
        }
        fr frVar = this.n;
        if (z) {
            frVar.l(eu4Var, 1.0f);
            frVar.l(eu4Var2, -1.0f);
            frVar.l(eu4Var3, -1.0f);
        } else {
            frVar.l(eu4Var, -1.0f);
            frVar.l(eu4Var2, 1.0f);
            frVar.l(eu4Var3, 1.0f);
        }
    }
}
