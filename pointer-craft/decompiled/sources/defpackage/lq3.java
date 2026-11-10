package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lq3 extends li5 {
    public float a;
    public boolean b;
    public boolean c;
    public final wp2 h;
    public boolean i;
    public int j;
    public z60 l;
    public float m;
    public List n;
    public final ld p;
    public float q;
    public float r = 1.0f;
    public by4 s;
    public int t;
    public ld u;
    public float v;
    public float w;
    public float x;
    public z60 y;
    public ld z;

    public lq3() {
        int i = fj5.g;
        this.n = pi1.j;
        this.v = 1.0f;
        this.j = 0;
        this.t = 0;
        this.a = 4.0f;
        this.q = 1.0f;
        this.c = true;
        this.i = true;
        ld ldVarG = nd.g();
        this.p = ldVarG;
        this.u = ldVarG;
        this.h = v13.u(bt2.t, new lc3((byte) 4));
    }

    @Override // defpackage.li5
    public final void g(xd1 xd1Var) {
        xd1 xd1Var2;
        by4 by4Var;
        if (this.c) {
            kq2.V(this.n, this.p);
            v();
        } else if (this.b) {
            v();
        }
        this.c = false;
        this.b = false;
        z60 z60Var = this.y;
        if (z60Var != null) {
            xd1Var2 = xd1Var;
            xd1.z(xd1Var2, this.u, z60Var, this.r, null, 56);
        } else {
            xd1Var2 = xd1Var;
        }
        z60 z60Var2 = this.l;
        if (z60Var2 != null) {
            by4 by4Var2 = this.s;
            if (this.i || by4Var2 == null) {
                by4 by4Var3 = new by4(this.x, this.a, this.j, this.t, 16);
                this.s = by4Var3;
                this.i = false;
                by4Var = by4Var3;
            } else {
                by4Var = by4Var2;
            }
            xd1.z(xd1Var2, this.u, z60Var2, this.v, by4Var, 48);
        }
    }

    public final String toString() {
        return this.p.toString();
    }

    public final void v() {
        float f = this.m;
        ld ldVar = this.p;
        if (f == 0.0f && this.q == 1.0f) {
            this.u = ldVar;
            return;
        }
        ld ldVar2 = this.u;
        if (ldVar2 != ldVar) {
            Path.FillType fillType = ldVar2.g.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.u.j();
            Path path = this.u.g;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.u = nd.g();
        }
        wp2 wp2Var = this.h;
        ((md) wp2Var.getValue()).r(ldVar);
        float fG = ((md) wp2Var.getValue()).g();
        float f2 = this.m;
        float f3 = this.w;
        float f4 = ((f2 + f3) % 1.0f) * fG;
        float f5 = ((this.q + f3) % 1.0f) * fG;
        if (f4 <= f5) {
            ((md) wp2Var.getValue()).y(f4, f5, this.u);
            return;
        }
        ld ldVarG = this.z;
        if (ldVarG == null) {
            ldVarG = nd.g();
            this.z = ldVarG;
        }
        ldVarG.l();
        ((md) wp2Var.getValue()).y(f4, fG, ldVarG);
        ld.g(this.u, ldVarG);
        ldVarG.l();
        ((md) wp2Var.getValue()).y(0.0f, f5, ldVarG);
        ld.g(this.u, ldVarG);
    }
}
