package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class nl5 extends View {
    public static final ei0 z = new ei0((byte) 4);
    public final pb0 a;
    public xy1 b;
    public j51 c;
    public fl2 i;
    public final ud1 j;
    public boolean m;
    public float p;
    public Outline q;
    public x32 s;
    public final qb0 t;
    public float u;
    public boolean w;

    public nl5(ud1 ud1Var, qb0 qb0Var, pb0 pb0Var) {
        super(ud1Var.getContext());
        this.j = ud1Var;
        this.t = qb0Var;
        this.a = pb0Var;
        setOutlineProvider(z);
        this.w = true;
        this.c = og0.u;
        this.i = fl2.j;
        z32.g.getClass();
        this.b = vg.A;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.p;
        pb0 pb0Var = this.a;
        qb0 qb0Var = this.t;
        if (f > 0.0f || this.u > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.p, this.u);
            c9 c9Var = qb0Var.g;
            Canvas canvas2 = c9Var.g;
            c9Var.g = canvas;
            j51 j51Var = this.c;
            fl2 fl2Var = this.i;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            x32 x32Var = this.s;
            xy1 xy1Var = this.b;
            ro roVar = pb0Var.t;
            ro roVar2 = pb0Var.t;
            j51 j51VarZ = roVar.z();
            fl2 fl2VarC = roVar2.C();
            nb0 nb0VarB = roVar2.b();
            long jG = roVar2.G();
            x32 x32Var2 = (x32) roVar2.a;
            roVar2.Z(j51Var);
            roVar2.a0(fl2Var);
            roVar2.Y(c9Var);
            roVar2.b0(jFloatToRawIntBits);
            roVar2.a = x32Var;
            c9Var.q();
            try {
                xy1Var.a(pb0Var);
                c9Var.t();
                roVar2.Z(j51VarZ);
                roVar2.a0(fl2VarC);
                roVar2.Y(nb0VarB);
                roVar2.b0(jG);
                roVar2.a = x32Var2;
                qb0Var.g.g = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                c9Var.t();
                roVar2.Z(j51VarZ);
                roVar2.a0(fl2VarC);
                roVar2.Y(nb0VarB);
                roVar2.b0(jG);
                roVar2.a = x32Var2;
                throw th;
            }
        } else {
            c9 c9Var2 = qb0Var.g;
            Canvas canvas3 = c9Var2.g;
            c9Var2.g = canvas;
            j51 j51Var2 = this.c;
            fl2 fl2Var2 = this.i;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            x32 x32Var3 = this.s;
            xy1 xy1Var2 = this.b;
            ro roVar3 = pb0Var.t;
            ro roVar4 = pb0Var.t;
            j51 j51VarZ2 = roVar3.z();
            fl2 fl2VarC2 = roVar4.C();
            nb0 nb0VarB2 = roVar4.b();
            long jG2 = roVar4.G();
            x32 x32Var4 = (x32) roVar4.a;
            roVar4.Z(j51Var2);
            roVar4.a0(fl2Var2);
            roVar4.Y(c9Var2);
            roVar4.b0(jFloatToRawIntBits2);
            roVar4.a = x32Var3;
            c9Var2.q();
            try {
                xy1Var2.a(pb0Var);
                c9Var2.t();
                roVar4.Z(j51VarZ2);
                roVar4.a0(fl2VarC2);
                roVar4.Y(nb0VarB2);
                roVar4.b0(jG2);
                roVar4.a = x32Var4;
                qb0Var.g.g = canvas3;
            } catch (Throwable th2) {
                c9Var2.t();
                roVar4.Z(j51VarZ2);
                roVar4.a0(fl2VarC2);
                roVar4.Y(nb0VarB2);
                roVar4.b0(jG2);
                roVar4.a = x32Var4;
                throw th2;
            }
        }
        this.m = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.w;
    }

    public final qb0 getCanvasHolder() {
        return this.t;
    }

    public final View getOwnerView() {
        return this.j;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.w;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.m) {
            return;
        }
        this.m = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.m = z2;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
