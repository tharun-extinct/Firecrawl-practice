package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pf0 extends vv {
    public static final qc0 c;
    public static final qc0 i;
    public static final on1 m = qi.y;
    public static final int[] q = {0, 1500, 3000, 4500};
    public static final float[] w = {0.1f, 0.87f};
    public float j;
    public ObjectAnimator n;
    public ObjectAnimator r;
    public float t;
    public final TimeInterpolator v;
    public final qf0 x;
    public int l = 0;
    public ky a = null;

    static {
        Class<Float> cls = Float.class;
        c = new qc0(cls, "animationFraction", (byte) 5);
        i = new qc0(cls, "completeEndFraction", (byte) 6);
    }

    public pf0(Context context, qf0 qf0Var) {
        this.x = qf0Var;
        this.v = lr2.E(context, R.attr.motionEasingStandardInterpolator, m);
    }

    @Override // defpackage.vv
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((ab2) this.g).isVisible()) {
            this.n.start();
        } else {
            g();
        }
    }

    @Override // defpackage.vv
    public final void g() {
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.vv
    public final void m() {
        w();
        this.l = 0;
        ((ye1) ((ArrayList) this.y).get(0)).r = this.x.v[0];
        this.t = 0.0f;
        this.r.start();
    }

    @Override // defpackage.vv
    public final void q() {
        this.a = null;
    }

    @Override // defpackage.vv
    public final void r() {
        w();
        ObjectAnimator objectAnimator = this.r;
        qf0 qf0Var = this.x;
        objectAnimator.setDuration((long) (qf0Var.c * 6000.0f));
        this.n.setDuration((long) (qf0Var.c * 500.0f));
        this.l = 0;
        ((ye1) ((ArrayList) this.y).get(0)).r = qf0Var.v[0];
        this.t = 0.0f;
    }

    @Override // defpackage.vv
    public final void t(ky kyVar) {
        this.a = kyVar;
    }

    public final void w() {
        ObjectAnimator objectAnimator = this.r;
        qf0 qf0Var = this.x;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c, 0.0f, 1.0f);
            this.r = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (qf0Var.c * 6000.0f));
            this.r.setInterpolator(null);
            this.r.setRepeatCount(-1);
            this.r.addListener(new of0(this, (byte) 0));
        }
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (qf0Var.c * 500.0f));
            this.n.addListener(new of0(this, (byte) 1));
        }
    }
}
