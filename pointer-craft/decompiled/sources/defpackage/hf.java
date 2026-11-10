package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class hf extends TextPaint {
    public cd g;
    public cq4 j;
    public z51 l;
    public ym4 n;
    public byte r;
    public yd1 t;
    public jj0 v;
    public z60 x;
    public l45 y;

    public final cd g() {
        cd cdVar = this.g;
        if (cdVar != null) {
            return cdVar;
        }
        cd cdVar2 = new cd(this);
        this.g = cdVar2;
        return cdVar2;
    }

    public final void l(l45 l45Var) {
        if (l45Var == null || yf2.p(this.y, l45Var)) {
            return;
        }
        this.y = l45Var;
        int i = l45Var.g;
        setUnderlineText((i | 1) == i);
        int i2 = this.y.g;
        setStrikeThruText((i2 | 2) == i2);
    }

    public final void n(long j) {
        jj0 jj0Var = this.v;
        if ((jj0Var == null ? false : tf5.g(jj0Var.g, j)) || j == 16) {
            return;
        }
        this.v = new jj0(j);
        setColor(ra.U(j));
        this.l = null;
        this.x = null;
        this.j = null;
        setShader(null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void r(z60 z60Var, long j, float f) {
        if (z60Var == null) {
            this.l = null;
            this.x = null;
            this.j = null;
            setShader(null);
            return;
        }
        if (z60Var instanceof cu4) {
            n(kh6.x(f, ((cu4) z60Var).g));
            return;
        }
        if (!(z60Var instanceof a70)) {
            uo1.g();
            return;
        }
        if (yf2.p(this.x, z60Var)) {
            cq4 cq4Var = this.j;
            if (!(cq4Var == null ? false : cq4.g(cq4Var.g, j))) {
                if (j != 9205357640488583168L) {
                    this.x = z60Var;
                    this.j = new cq4(j);
                    this.l = pt4.y(new gf(z60Var, j));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.x = z60Var;
            this.j = new cq4(j);
            this.l = pt4.y(new gf(z60Var, j));
        }
        cd cdVarG = g();
        z51 z51Var = this.l;
        cdVarG.t(z51Var != null ? (Shader) z51Var.getValue() : null);
        this.v = null;
        ih6.r(this, f);
    }

    public final void v(yd1 yd1Var) {
        if (yd1Var == null || yf2.p(this.t, yd1Var)) {
            return;
        }
        this.t = yd1Var;
        if (yd1Var.equals(go1.g)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(yd1Var instanceof by4)) {
            uo1.g();
            return;
        }
        g().w(1);
        by4 by4Var = (by4) yd1Var;
        g().q(by4Var.g);
        cd cdVarG = g();
        ((Paint) cdVarG.y).setStrokeMiter(by4Var.y);
        g().m(by4Var.n);
        g().a(by4Var.r);
        ((Paint) g().y).setPathEffect(null);
    }

    public final void x(ym4 ym4Var) {
        if (ym4Var == null || yf2.p(this.n, ym4Var)) {
            return;
        }
        this.n = ym4Var;
        if (ym4Var.equals(ym4.n)) {
            clearShadowLayer();
            return;
        }
        ym4 ym4Var2 = this.n;
        float f = ym4Var2.r;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (ym4Var2.y >> 32)), Float.intBitsToFloat((int) (this.n.y & 4294967295L)), ra.U(this.n.g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i) {
        if (i == this.r) {
            return;
        }
        g().v(i);
        this.r = i;
    }
}
