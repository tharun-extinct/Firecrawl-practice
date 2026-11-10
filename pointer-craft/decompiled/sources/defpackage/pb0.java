package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements xd1 {
    public cd a;
    public final ob0 j;
    public cd m;
    public final ro t;

    public pb0() {
        m51 m51Var = og0.u;
        ob0 ob0Var = new ob0();
        ob0Var.g = m51Var;
        ob0Var.y = fl2.j;
        ob0Var.r = li1.g;
        ob0Var.n = 0L;
        this.j = ob0Var;
        this.t = new ro(this);
    }

    public static cd g(pb0 pb0Var, long j, yd1 yd1Var, float f, int i) {
        cd cdVarV = pb0Var.v(yd1Var);
        if (f != 1.0f) {
            j = jj0.y(jj0.r(j) * f, j);
        }
        long jG = cdVarV.g();
        int i2 = jj0.t;
        if (!tf5.g(jG, j)) {
            cdVarV.x(j);
        }
        if (((Shader) cdVarV.r) != null) {
            cdVarV.t(null);
        }
        if (!yf2.p((m30) cdVarV.n, null)) {
            cdVarV.l(null);
        }
        if (cdVarV.g != i) {
            cdVarV.v(i);
        }
        if (((Paint) cdVarV.y).isFilterBitmap()) {
            return cdVarV;
        }
        cdVarV.j(1);
        return cdVarV;
    }

    @Override // defpackage.xd1
    public final void C0(long j, float f, float f2, long j2, long j3, yd1 yd1Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.j.r.z(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, g(this, j, yd1Var, 1.0f, 3));
    }

    @Override // defpackage.xd1
    public final ro E() {
        return this.t;
    }

    @Override // defpackage.xd1
    public final void T(nc ncVar, long j, long j2, long j3, float f, m30 m30Var, int i) {
        this.j.r.v(ncVar, j, j2, j3, r(null, go1.g, f, m30Var, 3, i));
    }

    @Override // defpackage.xd1
    public final void a0(long j, long j2, long j3, float f, int i) {
        nb0 nb0Var = this.j.r;
        cd cdVarP = this.m;
        if (cdVarP == null) {
            cdVarP = ue5.p();
            cdVarP.w(1);
            this.m = cdVarP;
        }
        Paint paint = (Paint) cdVarP.y;
        long jG = cdVarP.g();
        int i2 = jj0.t;
        if (!tf5.g(jG, j)) {
            cdVarP.x(j);
        }
        if (((Shader) cdVarP.r) != null) {
            cdVarP.t(null);
        }
        if (!yf2.p((m30) cdVarP.n, null)) {
            cdVarP.l(null);
        }
        if (cdVarP.g != 3) {
            cdVarP.v(3);
        }
        if (paint.getStrokeWidth() != f) {
            cdVarP.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (cdVarP.y() != i) {
            cdVarP.a(i);
        }
        if (cdVarP.r() != 0) {
            cdVarP.m(0);
        }
        if (!paint.isFilterBitmap()) {
            cdVarP.j(1);
        }
        nb0Var.w(j2, j3, cdVarP);
    }

    @Override // defpackage.xd1
    public final void f0(ld ldVar, long j, yd1 yd1Var) {
        this.j.r.j(ldVar, g(this, j, yd1Var, 1.0f, 3));
    }

    @Override // defpackage.xd1
    public final fl2 getLayoutDirection() {
        return this.j.y;
    }

    @Override // defpackage.xd1
    public final void k(long j, long j2, long j3, long j4, yd1 yd1Var, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.j.r.a(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), g(this, j, yd1Var, f, 3));
    }

    @Override // defpackage.xd1
    public final void l(ld ldVar, z60 z60Var, float f, yd1 yd1Var, int i) {
        this.j.r.j(ldVar, r(z60Var, yd1Var, f, null, i, 1));
    }

    @Override // defpackage.xd1
    public final void n0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.j.r.b(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), g(this, j, go1.g, f, i));
    }

    @Override // defpackage.xd1
    public final void q0(long j, float f, long j2, yd1 yd1Var) {
        this.j.r.n(f, j2, g(this, j, yd1Var, 1.0f, 3));
    }

    public final cd r(z60 z60Var, yd1 yd1Var, float f, m30 m30Var, int i, int i2) {
        cd cdVarV = v(yd1Var);
        Paint paint = (Paint) cdVarV.y;
        if (z60Var != null) {
            z60Var.g(f, n(), cdVarV);
        } else {
            if (((Shader) cdVarV.r) != null) {
                cdVarV.t(null);
            }
            long jG = cdVarV.g();
            long j = jj0.y;
            if (!tf5.g(jG, j)) {
                cdVarV.x(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                cdVarV.n(f);
            }
        }
        if (!yf2.p((m30) cdVarV.n, m30Var)) {
            cdVarV.l(m30Var);
        }
        if (cdVarV.g != i) {
            cdVarV.v(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return cdVarV;
        }
        cdVarV.j(i2);
        return cdVarV;
    }

    public final cd v(yd1 yd1Var) {
        if (yf2.p(yd1Var, go1.g)) {
            cd cdVar = this.a;
            if (cdVar != null) {
                return cdVar;
            }
            cd cdVarP = ue5.p();
            cdVarP.w(0);
            this.a = cdVarP;
            return cdVarP;
        }
        if (!(yd1Var instanceof by4)) {
            uo1.g();
            return null;
        }
        cd cdVarP2 = this.m;
        if (cdVarP2 == null) {
            cdVarP2 = ue5.p();
            cdVarP2.w(1);
            this.m = cdVarP2;
        }
        Paint paint = (Paint) cdVarP2.y;
        float strokeWidth = paint.getStrokeWidth();
        by4 by4Var = (by4) yd1Var;
        float f = by4Var.g;
        if (strokeWidth != f) {
            cdVarP2.q(f);
        }
        int iY = cdVarP2.y();
        int i = by4Var.r;
        if (iY != i) {
            cdVarP2.a(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = by4Var.y;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iR = cdVarP2.r();
        int i2 = by4Var.n;
        if (iR == i2) {
            return cdVarP2;
        }
        cdVarP2.m(i2);
        return cdVarP2;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.j.g.w();
    }

    @Override // defpackage.j51
    public final float y() {
        return this.j.g.y();
    }
}
