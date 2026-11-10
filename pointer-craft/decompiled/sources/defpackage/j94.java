package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class j94 extends View {
    public Long a;
    public yg5 j;
    public j4 m;
    public qd q;
    public Boolean t;
    public static final int[] w = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] c = new int[0];

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.m;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.a;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? w : c;
            yg5 yg5Var = this.j;
            if (yg5Var != null) {
                yg5Var.setState(iArr);
            }
        } else {
            j4 j4Var = new j4(this, (byte) 9);
            this.m = j4Var;
            postDelayed(j4Var, 50L);
        }
        this.a = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(j94 j94Var) {
        yg5 yg5Var = j94Var.j;
        if (yg5Var != null) {
            yg5Var.setState(c);
        }
        j94Var.m = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            r();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        qd qdVar = this.q;
        if (qdVar != null) {
            qdVar.g();
        }
    }

    public final void n() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void r() {
        this.q = null;
        j4 j4Var = this.m;
        if (j4Var != null) {
            removeCallbacks(j4Var);
            j4 j4Var2 = this.m;
            j4Var2.getClass();
            j4Var2.run();
        } else {
            yg5 yg5Var = this.j;
            if (yg5Var != null) {
                yg5Var.setState(c);
            }
        }
        yg5 yg5Var2 = this.j;
        if (yg5Var2 == null) {
            return;
        }
        yg5Var2.setVisible(false, false);
        unscheduleDrawable(yg5Var2);
    }

    public final void v(long j, int i, long j2, float f) {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            return;
        }
        if (yg5Var.getRadius() != i) {
            yg5Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jY = jj0.y(f, j2);
        jj0 jj0Var = yg5Var.t;
        if (!(jj0Var == null ? false : tf5.g(jj0Var.g, jY))) {
            yg5Var.t = new jj0(jY);
            yg5Var.setColor(ColorStateList.valueOf(ra.U(jY)));
        }
        Rect rect = new Rect(0, 0, k33.Z(Float.intBitsToFloat((int) (j >> 32))), k33.Z(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        yg5Var.setBounds(rect);
    }

    public final void y(mx3 mx3Var, boolean z, long j, int i, long j2, float f, qd qdVar) {
        long j3 = mx3Var.g;
        if (this.j == null || !Boolean.valueOf(z).equals(this.t)) {
            yg5 yg5Var = new yg5(z);
            setBackground(yg5Var);
            this.j = yg5Var;
            this.t = Boolean.valueOf(z);
        }
        yg5 yg5Var2 = this.j;
        yg5Var2.getClass();
        this.q = qdVar;
        v(j, i, j2, f);
        if (z) {
            yg5Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            yg5Var2.setHotspot(yg5Var2.getBounds().centerX(), yg5Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
