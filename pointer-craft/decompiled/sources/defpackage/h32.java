package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes2.dex */
public final class h32 extends p41 implements wd1 {
    public final ig1 d;
    public final bo3 e;
    public final tb k;

    public h32(g05 g05Var, tb tbVar, ig1 ig1Var, bo3 bo3Var) {
        this.k = tbVar;
        this.d = ig1Var;
        this.e = bo3Var;
        Q0(g05Var);
    }

    public static boolean T0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        boolean zT0;
        char c;
        long j;
        pb0 pb0Var = wm2Var.j;
        long jN = pb0Var.n();
        tb tbVar = this.k;
        tbVar.a(jN);
        if (cq4.r(pb0Var.n())) {
            wm2Var.g();
            return;
        }
        wm2Var.g();
        tbVar.n.getValue();
        Canvas canvasG = d9.g(pb0Var.t.b());
        ig1 ig1Var = this.d;
        boolean zX = ig1.x(ig1Var.x);
        bo3 bo3Var = this.e;
        if (zX) {
            zT0 = T0(270.0f, (((long) Float.floatToRawIntBits(wm2Var.e(bo3Var.g(wm2Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (pb0Var.n() & 4294967295L)))) << 32), ig1Var.r(), canvasG);
        } else {
            zT0 = false;
        }
        if (ig1.x(ig1Var.n)) {
            c = ' ';
            j = 4294967295L;
            zT0 = T0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wm2Var.e(bo3Var.y))) & 4294967295L), ig1Var.v(), canvasG) || zT0;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (ig1.x(ig1Var.l)) {
            zT0 = T0(90.0f, (((long) Float.floatToRawIntBits(wm2Var.e(bo3Var.y(wm2Var.getLayoutDirection())) + (-((float) k33.Z(Float.intBitsToFloat((int) (pb0Var.n() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), ig1Var.n(), canvasG) || zT0;
        }
        if (ig1.x(ig1Var.v)) {
            EdgeEffect edgeEffectY = ig1Var.y();
            zT0 = T0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (pb0Var.n() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (pb0Var.n() & j))) + wm2Var.e(bo3Var.n))) & j), edgeEffectY, canvasG) || zT0;
        }
        if (zT0) {
            tbVar.n();
        }
    }
}
