package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class e42 implements z32 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int a;
    public float b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public Matrix l;
    public m30 m;
    public final RenderNode n;
    public float o;
    public long p;
    public long q;
    public final pb0 r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public Paint x;
    public final qb0 y;
    public float z;

    public e42() {
        qb0 qb0Var = new qb0();
        pb0 pb0Var = new pb0();
        this.y = qb0Var;
        this.r = pb0Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.n = renderNode;
        this.v = 0L;
        renderNode.setClipToBounds(false);
        P(renderNode, 0);
        this.t = 1.0f;
        this.a = 3;
        this.q = 9205357640488583168L;
        this.w = 1.0f;
        this.c = 1.0f;
        long j = jj0.y;
        this.p = j;
        this.u = j;
        this.f = 8.0f;
        this.G = 0;
    }

    @Override // defpackage.z32
    public final void A(float f) {
        this.c = f;
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
        this.E = i;
        this.F = i2;
        boolean zG = cq4.g(this.v, y94.N(j));
        this.v = y94.N(j);
        S();
        if (zG || !wi3.y(this.q, 9205357640488583168L)) {
            return;
        }
        this.n.setPivotX((((int) (j >> 32)) / 2.0f) + this.d);
        this.n.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.e);
    }

    @Override // defpackage.z32
    public final float D() {
        return this.h;
    }

    @Override // defpackage.z32
    public final void E(m30 m30Var) {
        this.m = m30Var;
        Paint paint = this.x;
        if (paint == null) {
            paint = new Paint();
            this.x = paint;
        }
        paint.setColorFilter(m30Var != null ? m30Var.g : null);
        Q();
    }

    @Override // defpackage.z32
    public final void F(float f) {
        this.f = f;
        this.n.setCameraDistance(f);
    }

    @Override // defpackage.z32
    public final float G() {
        return this.s;
    }

    @Override // defpackage.z32
    public final boolean H() {
        return this.n.hasDisplayList();
    }

    @Override // defpackage.z32
    public final float I() {
        return this.c;
    }

    @Override // defpackage.z32
    public final void J(float f) {
        this.z = f;
        this.n.setRotationX(f);
    }

    @Override // defpackage.z32
    public final float K() {
        return this.o;
    }

    @Override // defpackage.z32
    public final int L() {
        return this.a;
    }

    @Override // defpackage.z32
    public final void M(long j) {
        this.q = j;
        R();
    }

    @Override // defpackage.z32
    public final long N() {
        return this.p;
    }

    public final void O() {
        boolean z = this.k;
        boolean z2 = false;
        boolean z3 = z && !this.j;
        if (z && this.j) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.n.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.n.setClipToOutline(z2);
        }
    }

    public final void P(RenderNode renderNode, int i) {
        Paint paint = this.x;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.G;
        if (i != 1 && this.a == 3 && this.m == null) {
            P(this.n, i);
        } else {
            P(this.n, 1);
        }
    }

    public final void R() {
        long j = this.q;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.n;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.v >> 32)) / 2.0f) + this.d);
            this.n.setPivotY((Float.intBitsToFloat((int) (this.v & 4294967295L)) / 2.0f) + this.e);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.d);
            this.n.setPivotY(Float.intBitsToFloat((int) (this.q & 4294967295L)) + this.e);
        }
    }

    public final void S() {
        RenderNode renderNode = this.n;
        int i = this.E;
        renderNode.setPosition(i - this.d, this.F - this.e, i + ((int) Float.intBitsToFloat((int) (this.v >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.v & 4294967295L))) + this.B);
    }

    @Override // defpackage.z32
    public final long a() {
        return this.u;
    }

    @Override // defpackage.z32
    public final void b() {
        this.n.discardDisplayList();
    }

    @Override // defpackage.z32
    public final void c(int i) {
        this.a = i;
        Paint paint = this.x;
        if (paint == null) {
            paint = new Paint();
            this.x = paint;
        }
        paint.setBlendMode(og0.I(i));
        Q();
    }

    @Override // defpackage.z32
    public final void d(float f) {
        this.i = f;
        this.n.setTranslationX(f);
    }

    @Override // defpackage.z32
    public final void e(long j) {
        this.u = j;
        this.n.setSpotShadowColor(ra.U(j));
    }

    @Override // defpackage.z32
    public final m30 f() {
        return this.m;
    }

    @Override // defpackage.z32
    public final float g() {
        return this.t;
    }

    @Override // defpackage.z32
    public final int h() {
        return this.G;
    }

    @Override // defpackage.z32
    public final float i() {
        return this.f;
    }

    @Override // defpackage.z32
    public final void j(float f) {
        this.o = f;
        this.n.setRotationZ(f);
    }

    @Override // defpackage.z32
    public final void k(int i) {
        this.G = i;
        Q();
    }

    @Override // defpackage.z32
    public final float l() {
        return this.b;
    }

    @Override // defpackage.z32
    public final void m(long j) {
        this.p = j;
        this.n.setAmbientShadowColor(ra.U(j));
    }

    @Override // defpackage.z32
    public final float n() {
        return this.w;
    }

    @Override // defpackage.z32
    public final float o() {
        return this.z;
    }

    @Override // defpackage.z32
    public final float p() {
        return this.i;
    }

    @Override // defpackage.z32
    public final void q(Outline outline, long j) {
        this.n.setOutline(outline);
        this.j = outline != null;
        O();
    }

    @Override // defpackage.z32
    public final void r(float f) {
        this.t = f;
        this.n.setAlpha(f);
    }

    @Override // defpackage.z32
    public final void s(j51 j51Var, fl2 fl2Var, x32 x32Var, zg zgVar) {
        pb0 pb0Var = this.r;
        RecordingCanvas recordingCanvasBeginRecording = this.n.beginRecording();
        float f = this.d;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.e)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            qb0 qb0Var = this.y;
            c9 c9Var = qb0Var.g;
            Canvas canvas = c9Var.g;
            c9Var.g = recordingCanvasBeginRecording;
            ro roVar = pb0Var.t;
            roVar.Z(j51Var);
            roVar.a0(fl2Var);
            roVar.a = x32Var;
            roVar.b0(this.v);
            roVar.Y(c9Var);
            if (this.d > 0.0f || this.e > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                c9Var.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                zgVar.a(pb0Var);
                c9Var.l(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                zgVar.a(pb0Var);
            }
            qb0Var.g.g = canvas;
        } finally {
            this.n.endRecording();
        }
    }

    @Override // defpackage.z32
    public final void t(float f) {
        this.b = f;
        this.n.setTranslationY(f);
    }

    @Override // defpackage.z32
    public final void u(nb0 nb0Var) {
        Canvas canvas = d9.g;
        ((c9) nb0Var).g.drawRenderNode(this.n);
    }

    @Override // defpackage.z32
    public final void v(float f) {
        this.s = f;
        this.n.setElevation(f);
    }

    @Override // defpackage.z32
    public final void w(float f) {
        this.w = f;
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
        int i5 = this.d;
        if (i == i5 && i2 == this.e && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.e) ? false : true;
        this.d = i;
        this.e = i2;
        this.A = i3;
        this.B = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.z32
    public final void y(float f) {
        this.h = f;
        this.n.setRotationY(f);
    }

    @Override // defpackage.z32
    public final void z(boolean z) {
        this.k = z;
        O();
    }
}
