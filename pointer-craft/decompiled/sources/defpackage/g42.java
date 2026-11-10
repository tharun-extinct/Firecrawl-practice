package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class g42 implements z32 {
    public static final f42 H = new f42();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public long a;
    public int b;
    public int c;
    public long d;
    public long e;
    public float f;
    public float h;
    public m30 i;
    public int j;
    public float k;
    public Paint l;
    public boolean m;
    public final nl5 n;
    public float o;
    public boolean p;
    public boolean q;
    public final qb0 r;
    public float s;
    public int t;
    public long u;
    public final Resources v;
    public boolean w;
    public final Rect x;
    public final ud1 y;
    public float z;

    public g42(ud1 ud1Var) {
        qb0 qb0Var = new qb0();
        pb0 pb0Var = new pb0();
        this.y = ud1Var;
        this.r = qb0Var;
        nl5 nl5Var = new nl5(ud1Var, qb0Var, pb0Var);
        this.n = nl5Var;
        this.v = ud1Var.getResources();
        this.x = new Rect();
        ud1Var.addView(nl5Var);
        nl5Var.setClipBounds(null);
        this.a = 0L;
        View.generateViewId();
        this.c = 3;
        this.b = 0;
        this.s = 1.0f;
        this.u = 9205357640488583168L;
        this.z = 1.0f;
        this.h = 1.0f;
        long j = jj0.y;
        this.d = j;
        this.e = j;
    }

    @Override // defpackage.z32
    public final void A(float f) {
        this.h = f;
        this.n.setScaleY(f);
    }

    @Override // defpackage.z32
    public final Matrix B() {
        return this.n.getMatrix();
    }

    @Override // defpackage.z32
    public final void C(int i, int i2, long j) {
        if (!qe2.g(this.a, j)) {
            this.j = i;
            this.t = i2;
            this.a = j;
            P();
            return;
        }
        int i3 = this.j;
        nl5 nl5Var = this.n;
        if (i3 != i) {
            nl5Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.t;
        if (i4 != i2) {
            nl5Var.offsetTopAndBottom(i2 - i4);
        }
        this.j = i;
        this.t = i2;
    }

    @Override // defpackage.z32
    public final float D() {
        return this.B;
    }

    @Override // defpackage.z32
    public final void E(m30 m30Var) {
        this.i = m30Var;
        Paint paint = this.l;
        if (paint == null) {
            paint = new Paint();
            this.l = paint;
        }
        paint.setColorFilter(m30Var != null ? m30Var.g : null);
        Q();
    }

    @Override // defpackage.z32
    public final void F(float f) {
        this.n.setCameraDistance(f * this.v.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.z32
    public final float G() {
        return this.k;
    }

    @Override // defpackage.z32
    public final float I() {
        return this.h;
    }

    @Override // defpackage.z32
    public final void J(float f) {
        this.A = f;
        this.n.setRotationX(f);
    }

    @Override // defpackage.z32
    public final float K() {
        return this.C;
    }

    @Override // defpackage.z32
    public final int L() {
        return this.c;
    }

    @Override // defpackage.z32
    public final void M(long j) {
        this.u = j;
        this.p = (j & 9223372034707292159L) == 9205357640488583168L;
        R();
    }

    @Override // defpackage.z32
    public final long N() {
        return this.d;
    }

    public final void O(int i) {
        Paint paint = this.l;
        nl5 nl5Var = this.n;
        boolean z = true;
        if (i == 1) {
            nl5Var.setLayerType(2, paint);
        } else if (i == 2) {
            nl5Var.setLayerType(0, paint);
            z = false;
        } else {
            nl5Var.setLayerType(0, paint);
        }
        nl5Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void P() {
        boolean z = this.w;
        nl5 nl5Var = this.n;
        if (z || nl5Var.getClipToOutline()) {
            this.m = true;
        }
        int i = this.j;
        int i2 = i - this.D;
        int i3 = this.t;
        int i4 = i3 - this.E;
        long j = this.a;
        nl5Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void Q() {
        int i = this.b;
        if (i != 1 && this.c == 3 && this.i == null) {
            O(i);
        } else {
            O(1);
        }
    }

    public final void R() {
        boolean z = this.p;
        nl5 nl5Var = this.n;
        if (z || wi3.y(this.u, 9205357640488583168L)) {
            nl5Var.setPivotX((((int) (this.a >> 32)) / 2.0f) + this.D);
            nl5Var.setPivotY((((int) (this.a & 4294967295L)) / 2.0f) + this.E);
        } else {
            nl5Var.setPivotX(Float.intBitsToFloat((int) (this.u >> 32)) + this.D);
            nl5Var.setPivotY(Float.intBitsToFloat((int) (this.u & 4294967295L)) + this.E);
        }
    }

    @Override // defpackage.z32
    public final long a() {
        return this.e;
    }

    @Override // defpackage.z32
    public final void b() {
        this.y.removeViewInLayout(this.n);
    }

    @Override // defpackage.z32
    public final void c(int i) {
        this.c = i;
        Paint paint = this.l;
        if (paint == null) {
            paint = new Paint();
            this.l = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(og0.J(i)));
        Q();
    }

    @Override // defpackage.z32
    public final void d(float f) {
        this.o = f;
        this.n.setTranslationX(f);
    }

    @Override // defpackage.z32
    public final void e(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.e = j;
            this.n.setOutlineSpotShadowColor(ra.U(j));
        }
    }

    @Override // defpackage.z32
    public final m30 f() {
        return this.i;
    }

    @Override // defpackage.z32
    public final float g() {
        return this.s;
    }

    @Override // defpackage.z32
    public final int h() {
        return this.b;
    }

    @Override // defpackage.z32
    public final float i() {
        return this.n.getCameraDistance() / this.v.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.z32
    public final void j(float f) {
        this.C = f;
        this.n.setRotation(f);
    }

    @Override // defpackage.z32
    public final void k(int i) {
        this.b = i;
        Q();
    }

    @Override // defpackage.z32
    public final float l() {
        return this.f;
    }

    @Override // defpackage.z32
    public final void m(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.d = j;
            this.n.setOutlineAmbientShadowColor(ra.U(j));
        }
    }

    @Override // defpackage.z32
    public final float n() {
        return this.z;
    }

    @Override // defpackage.z32
    public final float o() {
        return this.A;
    }

    @Override // defpackage.z32
    public final float p() {
        return this.o;
    }

    @Override // defpackage.z32
    public final void q(Outline outline, long j) {
        nl5 nl5Var = this.n;
        nl5Var.q = outline;
        nl5Var.invalidateOutline();
        if ((this.w || nl5Var.getClipToOutline()) && outline != null) {
            nl5Var.setClipToOutline(true);
            if (this.w) {
                this.w = false;
                this.m = true;
            }
        }
        this.q = outline != null;
    }

    @Override // defpackage.z32
    public final void r(float f) {
        this.s = f;
        this.n.setAlpha(f);
    }

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
    @Override // defpackage.z32
    public final void s(j51 j51Var, fl2 fl2Var, x32 x32Var, zg zgVar) {
        nl5 nl5Var = this.n;
        ViewParent parent = nl5Var.getParent();
        ud1 ud1Var = this.y;
        if (parent == null) {
            ud1Var.addView(nl5Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        nl5Var.c = j51Var;
        nl5Var.i = fl2Var;
        nl5Var.b = zgVar;
        nl5Var.s = x32Var;
        nl5Var.p = fIntBitsToFloat;
        nl5Var.u = fIntBitsToFloat2;
        if (nl5Var.isAttachedToWindow()) {
            nl5Var.setVisibility(4);
            nl5Var.setVisibility(0);
            try {
                c9 c9Var = this.r.g;
                f42 f42Var = H;
                Canvas canvas = c9Var.g;
                c9Var.g = f42Var;
                ud1Var.g(c9Var, nl5Var, nl5Var.getDrawingTime());
                c9Var.g = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.z32
    public final void t(float f) {
        this.f = f;
        this.n.setTranslationY(f);
    }

    @Override // defpackage.z32
    public final void u(nb0 nb0Var) {
        Rect rect;
        boolean z = this.m;
        nl5 nl5Var = this.n;
        if (z) {
            if ((this.w || nl5Var.getClipToOutline()) && !this.q) {
                rect = this.x;
                rect.left = 0;
                rect.top = 0;
                rect.right = nl5Var.getWidth();
                rect.bottom = nl5Var.getHeight();
            } else {
                rect = null;
            }
            nl5Var.setClipBounds(rect);
        }
        Canvas canvas = d9.g;
        if (((c9) nb0Var).g.isHardwareAccelerated()) {
            this.y.g(nb0Var, nl5Var, nl5Var.getDrawingTime());
        }
    }

    @Override // defpackage.z32
    public final void v(float f) {
        this.k = f;
        this.n.setElevation(f);
    }

    @Override // defpackage.z32
    public final void w(float f) {
        this.z = f;
        this.n.setScaleX(f);
    }

    @Override // defpackage.z32
    public final void x(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbS = du4.s(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbS.append(i3);
            sbS.append(", Bottom: ");
            sbS.append(i4);
            lc2.g(sbS.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        P();
        if (z) {
            R();
        }
    }

    @Override // defpackage.z32
    public final void y(float f) {
        this.B = f;
        this.n.setRotationY(f);
    }

    @Override // defpackage.z32
    public final void z(boolean z) {
        boolean z2 = false;
        this.w = z && !this.q;
        this.m = true;
        if (z && this.q) {
            z2 = true;
        }
        this.n.setClipToOutline(z2);
    }
}
