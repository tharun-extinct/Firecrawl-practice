package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class c9 implements nb0 {
    public Canvas g = d9.g;
    public Rect r;
    public Rect y;

    @Override // defpackage.nb0
    public final void a(float f, float f2, float f3, float f4, float f5, float f6, cd cdVar) {
        this.g.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) cdVar.y);
    }

    @Override // defpackage.nb0
    public final void b(float f, float f2, float f3, float f4, cd cdVar) {
        this.g.drawRect(f, f2, f3, f4, ue5.T(cdVar));
    }

    @Override // defpackage.nb0
    public final void c() {
        pw5.i(this.g, false);
    }

    @Override // defpackage.nb0
    public final void g(nc ncVar, cd cdVar) {
        this.g.drawBitmap(y94.b(ncVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) cdVar.y);
    }

    @Override // defpackage.nb0
    public final void i(k44 k44Var, cd cdVar) {
        this.g.saveLayer(k44Var.g, k44Var.y, k44Var.r, k44Var.n, (Paint) cdVar.y, 31);
    }

    @Override // defpackage.nb0
    public final void j(ld ldVar, cd cdVar) {
        Canvas canvas = this.g;
        if (ldVar instanceof ld) {
            canvas.drawPath(ldVar.g, ue5.T(cdVar));
        } else {
            uo1.u("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.nb0
    public final void l(float f, float f2) {
        this.g.translate(f, f2);
    }

    @Override // defpackage.nb0
    public final void n(float f, long j, cd cdVar) {
        this.g.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) cdVar.y);
    }

    @Override // defpackage.nb0
    public final void p() {
        pw5.i(this.g, true);
    }

    @Override // defpackage.nb0
    public final void q() {
        this.g.save();
    }

    @Override // defpackage.nb0
    public final void r(float f) {
        this.g.rotate(f);
    }

    @Override // defpackage.nb0
    public final void s(float[] fArr) {
        if (sp2.z(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        gp4.Q(matrix, fArr);
        this.g.concat(matrix);
    }

    @Override // defpackage.nb0
    public final void t() {
        this.g.restore();
    }

    @Override // defpackage.nb0
    public final void u(ld ldVar) {
        Canvas canvas = this.g;
        if (ldVar instanceof ld) {
            canvas.clipPath(ldVar.g, ec6.j(1) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            uo1.u("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.nb0
    public final void v(nc ncVar, long j, long j2, long j3, cd cdVar) {
        if (this.y == null) {
            this.y = new Rect();
            this.r = new Rect();
        }
        Canvas canvas = this.g;
        Bitmap bitmapB = y94.b(ncVar);
        Rect rect = this.y;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.r;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapB, rect, rect2, (Paint) cdVar.y);
    }

    @Override // defpackage.nb0
    public final void w(long j, long j2, cd cdVar) {
        this.g.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) cdVar.y);
    }

    @Override // defpackage.nb0
    public final void x(float f, float f2, float f3, float f4, int i) {
        this.g.clipRect(f, f2, f3, f4, ec6.j(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.nb0
    public final void y(float f, float f2) {
        this.g.scale(f, f2);
    }

    @Override // defpackage.nb0
    public final void z(float f, float f2, float f3, float f4, float f5, float f6, cd cdVar) {
        this.g.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) cdVar.y);
    }
}
