package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class c42 implements z32 {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int a;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public long h;
    public long i;
    public boolean j;
    public float k;
    public Matrix l;
    public int m;
    public final RenderNode n;
    public long o;
    public float p;
    public m30 q;
    public final pb0 r;
    public float s;
    public long t;
    public float u;
    public long v;
    public float w;
    public Paint x;
    public final qb0 y;
    public float z;

    public c42(ba baVar, qb0 qb0Var, pb0 pb0Var) {
        this.y = qb0Var;
        this.r = pb0Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", baVar);
        this.n = renderNodeCreate;
        this.v = 0L;
        this.t = 0L;
        if (J.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                x64.r(renderNodeCreate, x64.g(renderNodeCreate));
                x64.n(renderNodeCreate, x64.y(renderNodeCreate));
            }
            w64.g(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.a = 0;
        this.m = 3;
        this.w = 1.0f;
        this.i = 9205357640488583168L;
        this.b = 1.0f;
        this.s = 1.0f;
        long j = jj0.y;
        this.h = j;
        this.o = j;
        this.e = 8.0f;
    }

    @Override // defpackage.z32
    public final void A(float f) {
        this.s = f;
        this.n.setScaleY(f);
    }

    @Override // defpackage.z32
    public final Matrix B() {
        Matrix matrix = this.l;
        if (matrix == null) {
            matrix = new Matrix();
            this.l = matrix;
        }
        this.n.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.z32
    public final void C(int i, int i2, long j) {
        this.H = i;
        this.I = i2;
        boolean zG = qe2.g(this.v, j);
        this.v = j;
        S();
        if (zG) {
            return;
        }
        if (this.c || wi3.y(this.i, 9205357640488583168L)) {
            this.n.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.n.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.z32
    public final float D() {
        return this.k;
    }

    @Override // defpackage.z32
    public final void E(m30 m30Var) {
        this.q = m30Var;
        if (m30Var == null) {
            Q();
            return;
        }
        P(1);
        RenderNode renderNode = this.n;
        Paint paint = this.x;
        if (paint == null) {
            paint = new Paint();
            this.x = paint;
        }
        paint.setColorFilter(m30Var.g);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.z32
    public final void F(float f) {
        this.e = f;
        this.n.setCameraDistance(-f);
    }

    @Override // defpackage.z32
    public final float G() {
        return this.z;
    }

    @Override // defpackage.z32
    public final boolean H() {
        return this.n.isValid();
    }

    @Override // defpackage.z32
    public final float I() {
        return this.s;
    }

    @Override // defpackage.z32
    public final void J(float f) {
        this.f = f;
        this.n.setRotationX(f);
    }

    @Override // defpackage.z32
    public final float K() {
        return this.d;
    }

    @Override // defpackage.z32
    public final int L() {
        return this.m;
    }

    @Override // defpackage.z32
    public final void M(long j) {
        this.i = j;
        R();
    }

    @Override // defpackage.z32
    public final long N() {
        return this.h;
    }

    public final void O() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.j;
        if (z && this.j) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.n.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.n.setClipToOutline(z2);
        }
    }

    public final void P(int i) {
        RenderNode renderNode = this.n;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.x);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.x);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.x);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.a;
        if (i != 1 && this.m == 3 && this.q == null) {
            P(i);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j = this.i;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.c = true;
            this.n.setPivotX((((int) (this.v >> 32)) / 2.0f) + this.B);
            this.n.setPivotY((((int) (4294967295L & this.v)) / 2.0f) + this.C);
        } else {
            this.c = false;
            this.n.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.n.setPivotY(Float.intBitsToFloat((int) (this.i & 4294967295L)) + this.C);
        }
    }

    public final void S() {
        RenderNode renderNode = this.n;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.v;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.z32
    public final long a() {
        return this.o;
    }

    @Override // defpackage.z32
    public final void b() {
        w64.g(this.n);
    }

    @Override // defpackage.z32
    public final void c(int i) {
        if (this.m == i) {
            return;
        }
        this.m = i;
        Paint paint = this.x;
        if (paint == null) {
            paint = new Paint();
            this.x = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(og0.J(i)));
        Q();
    }

    @Override // defpackage.z32
    public final void d(float f) {
        this.p = f;
        this.n.setTranslationX(f);
    }

    @Override // defpackage.z32
    public final void e(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.o = j;
            x64.n(this.n, ra.U(j));
        }
    }

    @Override // defpackage.z32
    public final m30 f() {
        return this.q;
    }

    @Override // defpackage.z32
    public final float g() {
        return this.w;
    }

    @Override // defpackage.z32
    public final int h() {
        return this.a;
    }

    @Override // defpackage.z32
    public final float i() {
        return this.e;
    }

    @Override // defpackage.z32
    public final void j(float f) {
        this.d = f;
        this.n.setRotation(f);
    }

    @Override // defpackage.z32
    public final void k(int i) {
        this.a = i;
        Q();
    }

    @Override // defpackage.z32
    public final float l() {
        return this.u;
    }

    @Override // defpackage.z32
    public final void m(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.h = j;
            x64.r(this.n, ra.U(j));
        }
    }

    @Override // defpackage.z32
    public final float n() {
        return this.b;
    }

    @Override // defpackage.z32
    public final float o() {
        return this.f;
    }

    @Override // defpackage.z32
    public final float p() {
        return this.p;
    }

    @Override // defpackage.z32
    public final void q(Outline outline, long j) {
        this.t = j;
        this.n.setOutline(outline);
        this.j = outline != null;
        O();
    }

    @Override // defpackage.z32
    public final void r(float f) {
        this.w = f;
        this.n.setAlpha(f);
    }

    @Override // defpackage.z32
    public final void s(j51 j51Var, fl2 fl2Var, x32 x32Var, zg zgVar) throws Throwable {
        c42 c42Var;
        DisplayListCanvas displayListCanvas;
        DisplayListCanvas displayListCanvas2;
        int i;
        int i2;
        long jN;
        ro roVar;
        j51 j51VarZ;
        fl2 fl2VarC;
        nb0 nb0VarB;
        long jG;
        x32 x32Var2;
        DisplayListCanvas displayListCanvasStart = this.n.start(Math.max(((int) (this.v >> 32)) + this.B + this.D, (int) (this.t >> 32)), Math.max(((int) (this.v & 4294967295L)) + this.C + this.E, (int) (this.t & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            qb0 qb0Var = this.y;
            c9 c9Var = qb0Var.g;
            Canvas canvas = c9Var.g;
            c9Var.g = (Canvas) displayListCanvasStart;
            float f2 = this.B;
            pb0 pb0Var = this.r;
            try {
                try {
                    try {
                        if (f2 <= 0.0f) {
                            try {
                                if (this.C <= 0.0f) {
                                    long jN2 = y94.N(this.v);
                                    ro roVar2 = pb0Var.t;
                                    ro roVar3 = pb0Var.t;
                                    j51 j51VarZ2 = roVar2.z();
                                    fl2 fl2VarC2 = roVar3.C();
                                    nb0 nb0VarB2 = roVar3.b();
                                    long jG2 = roVar3.G();
                                    displayListCanvas2 = displayListCanvasStart;
                                    x32 x32Var3 = (x32) roVar3.a;
                                    roVar3.Z(j51Var);
                                    roVar3.a0(fl2Var);
                                    roVar3.Y(c9Var);
                                    roVar3.b0(jN2);
                                    roVar3.a = x32Var;
                                    c9Var.q();
                                    try {
                                        zgVar.a(pb0Var);
                                        c9Var.t();
                                        roVar3.Z(j51VarZ2);
                                        roVar3.a0(fl2VarC2);
                                        roVar3.Y(nb0VarB2);
                                        roVar3.b0(jG2);
                                        roVar3.a = x32Var3;
                                    } catch (Throwable th) {
                                        c9Var.t();
                                        ro roVar4 = pb0Var.t;
                                        roVar4.Z(j51VarZ2);
                                        roVar4.a0(fl2VarC2);
                                        roVar4.Y(nb0VarB2);
                                        roVar4.b0(jG2);
                                        roVar4.a = x32Var3;
                                        throw th;
                                    }
                                }
                                qb0Var.g.g = canvas;
                                this.n.end(displayListCanvas2);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                displayListCanvas2 = displayListCanvasStart;
                                c42Var = this;
                                displayListCanvas = displayListCanvas2;
                                c42Var.n.end(displayListCanvas);
                                throw th;
                            }
                        }
                        zgVar.a(pb0Var);
                        c9Var.t();
                        roVar.Z(j51VarZ);
                        roVar.a0(fl2VarC);
                        roVar.Y(nb0VarB);
                        roVar.b0(jG);
                        roVar.a = x32Var2;
                        c9Var.l(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                        qb0Var.g.g = canvas;
                        this.n.end(displayListCanvas2);
                        return;
                    } catch (Throwable th3) {
                        c42Var = this;
                        displayListCanvas = displayListCanvas2;
                        try {
                            c9Var.t();
                            ro roVar5 = pb0Var.t;
                            roVar5.Z(j51VarZ);
                            roVar5.a0(fl2VarC);
                            roVar5.Y(nb0VarB);
                            roVar5.b0(jG);
                            roVar5.a = x32Var2;
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            c42Var.n.end(displayListCanvas);
                            throw th;
                        }
                    }
                    x32Var2 = (x32) roVar.a;
                    roVar.Z(j51Var);
                    roVar.a0(fl2Var);
                    roVar.Y(c9Var);
                    roVar.b0(jN);
                    roVar.a = x32Var;
                    c9Var.q();
                } catch (Throwable th5) {
                    th = th5;
                    c42Var = this;
                    displayListCanvas = displayListCanvas2;
                    c42Var.n.end(displayListCanvas);
                    throw th;
                }
                displayListCanvas2 = displayListCanvasStart;
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                c9Var.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                jN = y94.N(this.v);
                ro roVar6 = pb0Var.t;
                roVar = pb0Var.t;
                j51VarZ = roVar6.z();
                fl2VarC = roVar.C();
                nb0VarB = roVar.b();
                jG = roVar.G();
            } catch (Throwable th6) {
                th = th6;
                c42Var = this;
                displayListCanvas = displayListCanvas2;
                c42Var.n.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            c42Var = this;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.z32
    public final void t(float f) {
        this.u = f;
        this.n.setTranslationY(f);
    }

    @Override // defpackage.z32
    public final void u(nb0 nb0Var) {
        Canvas canvas = d9.g;
        DisplayListCanvas displayListCanvas = ((c9) nb0Var).g;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.n);
    }

    @Override // defpackage.z32
    public final void v(float f) {
        this.z = f;
        this.n.setElevation(f);
    }

    @Override // defpackage.z32
    public final void w(float f) {
        this.b = f;
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.z32
    public final void y(float f) {
        this.k = f;
        this.n.setRotationY(f);
    }

    @Override // defpackage.z32
    public final void z(boolean z) {
        this.A = z;
        O();
    }

    public /* synthetic */ c42(ba baVar) {
        this(baVar, new qb0(), new pb0());
    }
}
