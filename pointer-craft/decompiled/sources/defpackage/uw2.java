package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class uw2 implements View.OnTouchListener {
    public static final int k = ViewConfiguration.getTapTimeout();
    public final ef1 a;
    public final float[] b;
    public final int c;
    public final ef1 f;
    public boolean h;
    public final float[] i;
    public final zt j;
    public ml m;
    public boolean o;
    public boolean p;
    public final float[] q;
    public final float[] s;
    public final AccelerateInterpolator t;
    public boolean u;
    public final float[] w;
    public boolean z;

    public uw2(ef1 ef1Var) {
        zt ztVar = new zt();
        ztVar.v = Long.MIN_VALUE;
        ztVar.l = -1L;
        ztVar.x = 0L;
        this.j = ztVar;
        this.t = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.q = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.w = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.b = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.s = fArr5;
        this.a = ef1Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.c = k;
        ztVar.g = (short) 500;
        ztVar.y = (short) 500;
        this.f = ef1Var;
    }

    public static float y(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float g(int i, float f, float f2, float f3) {
        float fY;
        float interpolation;
        float fY2 = y(this.q[i] * f2, 0.0f, this.w[i]);
        float fR = r(f2 - f, fY2) - r(f, fY2);
        AccelerateInterpolator accelerateInterpolator = this.t;
        if (fR >= 0.0f) {
            if (fR > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fR);
            } else {
                fY = 0.0f;
            }
            if (fY == 0.0f) {
                return 0.0f;
            }
            float f4 = this.i[i];
            float f5 = this.b[i];
            float f6 = this.s[i];
            float f7 = f4 * f3;
            return fY > 0.0f ? y(fY * f7, f5, f6) : -y((-fY) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fR);
        fY = y(interpolation, -1.0f, 1.0f);
        if (fY == 0.0f) {
            return 0.0f;
        }
        float f8 = this.i[i];
        float f9 = this.b[i];
        float f10 = this.s[i];
        float f11 = f8 * f3;
        if (fY > 0.0f) {
        }
    }

    public final void n() {
        int i = 0;
        if (this.u) {
            this.h = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        zt ztVar = this.j;
        int i2 = (int) (jCurrentAnimationTimeMillis - ztVar.v);
        short s = ztVar.y;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        ztVar.t = i;
        ztVar.j = ztVar.g(jCurrentAnimationTimeMillis);
        ztVar.l = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.o
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L78
        L17:
            r7.n()
            return r1
        L1b:
            r7.z = r2
            r7.p = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            ef1 r4 = r7.a
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.g(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.g(r2, r9, r8, r3)
            zt r9 = r7.j
            r9.r = r0
            r9.n = r8
            boolean r8 = r7.h
            if (r8 != 0) goto L78
            boolean r8 = r7.v()
            if (r8 == 0) goto L78
            ml r8 = r7.m
            if (r8 != 0) goto L60
            ml r8 = new ml
            r8.<init>(r7, r2)
            r7.m = r8
        L60:
            r7.h = r2
            r7.u = r2
            boolean r9 = r7.p
            if (r9 != 0) goto L73
            int r9 = r7.c
            if (r9 <= 0) goto L73
            long r5 = (long) r9
            java.util.WeakHashMap r9 = defpackage.xk5.g
            r4.postOnAnimationDelayed(r8, r5)
            goto L76
        L73:
            r8.run()
        L76:
            r7.p = r2
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final float r(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.h) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final boolean v() {
        ef1 ef1Var;
        int count;
        zt ztVar = this.j;
        float f = ztVar.n;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(ztVar.r);
        if (iAbs != 0 && (count = (ef1Var = this.f).getCount()) != 0) {
            int childCount = ef1Var.getChildCount();
            int firstVisiblePosition = ef1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && ef1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && ef1Var.getChildAt(childCount - 1).getBottom() <= ef1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }
}
