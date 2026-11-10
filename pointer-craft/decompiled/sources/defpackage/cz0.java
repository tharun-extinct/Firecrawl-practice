package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class cz0 extends g33 {
    public static final /* synthetic */ int O = 0;
    public bz0 N;

    public final void e(float f, float f2, float f3, float f4) {
        RectF rectF = this.N.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.g33, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.N = new bz0(this.N);
        return this;
    }

    @Override // defpackage.g33
    public final void x(Canvas canvas) {
        if (this.N.s.isEmpty()) {
            super.x(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        bz0 bz0Var = this.N;
        if (i >= 26) {
            canvas.clipOutRect(bz0Var.s);
        } else {
            canvas.clipRect(bz0Var.s, Region.Op.DIFFERENCE);
        }
        super.x(canvas);
        canvas.restore();
    }
}
