package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class px4 extends p41 implements wd1 {
    public final ig1 d;
    public RenderNode e;
    public final tb k;

    public px4(g05 g05Var, tb tbVar, ig1 ig1Var) {
        this.k = tbVar;
        this.d = ig1Var;
        Q0(g05Var);
    }

    public static boolean T0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        boolean zT0;
        float f;
        pb0 pb0Var = wm2Var.j;
        long jN = pb0Var.n();
        tb tbVar = this.k;
        tbVar.a(jN);
        Canvas canvasG = d9.g(pb0Var.t.b());
        tbVar.n.getValue();
        if (cq4.r(pb0Var.n())) {
            wm2Var.g();
            return;
        }
        boolean zIsHardwareAccelerated = canvasG.isHardwareAccelerated();
        ig1 ig1Var = this.d;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = ig1Var.n;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = ig1Var.v;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = ig1Var.x;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = ig1Var.l;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = ig1Var.j;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = ig1Var.t;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = ig1Var.a;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = ig1Var.m;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            wm2Var.g();
            return;
        }
        float fE = wm2Var.e(30.0f);
        boolean z = ig1.x(ig1Var.n) || ig1.l(ig1Var.j) || ig1.x(ig1Var.v) || ig1.l(ig1Var.t);
        boolean z2 = ig1.x(ig1Var.x) || ig1.l(ig1Var.a) || ig1.x(ig1Var.l) || ig1.l(ig1Var.m);
        if (z && z2) {
            U0().setPosition(0, 0, canvasG.getWidth(), canvasG.getHeight());
        } else if (z) {
            U0().setPosition(0, 0, (k33.Z(fE) * 2) + canvasG.getWidth(), canvasG.getHeight());
        } else {
            if (!z2) {
                wm2Var.g();
                return;
            }
            U0().setPosition(0, 0, canvasG.getWidth(), (k33.Z(fE) * 2) + canvasG.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = U0().beginRecording();
        boolean zL = ig1.l(ig1Var.a);
        um3 um3Var = um3.t;
        if (zL) {
            EdgeEffect edgeEffectG = ig1Var.a;
            if (edgeEffectG == null) {
                edgeEffectG = ig1Var.g(um3Var);
                ig1Var.a = edgeEffectG;
            }
            T0(90.0f, edgeEffectG, recordingCanvasBeginRecording);
            edgeEffectG.finish();
        }
        if (ig1.x(ig1Var.x)) {
            EdgeEffect edgeEffectR = ig1Var.r();
            zT0 = T0(270.0f, edgeEffectR, recordingCanvasBeginRecording);
            if (ig1.l(ig1Var.x)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tbVar.r() & 4294967295L));
                EdgeEffect edgeEffectG2 = ig1Var.a;
                if (edgeEffectG2 == null) {
                    edgeEffectG2 = ig1Var.g(um3Var);
                    ig1Var.a = edgeEffectG2;
                }
                cf6.v(edgeEffectG2, cf6.r(edgeEffectR), 1.0f - fIntBitsToFloat);
            }
        } else {
            zT0 = false;
        }
        boolean zL2 = ig1.l(ig1Var.j);
        um3 um3Var2 = um3.j;
        if (zL2) {
            EdgeEffect edgeEffectG3 = ig1Var.j;
            if (edgeEffectG3 == null) {
                edgeEffectG3 = ig1Var.g(um3Var2);
                ig1Var.j = edgeEffectG3;
            }
            T0(180.0f, edgeEffectG3, recordingCanvasBeginRecording);
            edgeEffectG3.finish();
        }
        if (ig1.x(ig1Var.n)) {
            EdgeEffect edgeEffectV = ig1Var.v();
            zT0 = T0(0.0f, edgeEffectV, recordingCanvasBeginRecording) || zT0;
            if (ig1.l(ig1Var.n)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tbVar.r() >> 32));
                EdgeEffect edgeEffectG4 = ig1Var.j;
                if (edgeEffectG4 == null) {
                    edgeEffectG4 = ig1Var.g(um3Var2);
                    ig1Var.j = edgeEffectG4;
                }
                cf6.v(edgeEffectG4, cf6.r(edgeEffectV), fIntBitsToFloat2);
            }
        }
        if (ig1.l(ig1Var.m)) {
            EdgeEffect edgeEffectG5 = ig1Var.m;
            if (edgeEffectG5 == null) {
                edgeEffectG5 = ig1Var.g(um3Var);
                ig1Var.m = edgeEffectG5;
            }
            T0(270.0f, edgeEffectG5, recordingCanvasBeginRecording);
            edgeEffectG5.finish();
        }
        if (ig1.x(ig1Var.l)) {
            EdgeEffect edgeEffectN = ig1Var.n();
            zT0 = T0(90.0f, edgeEffectN, recordingCanvasBeginRecording) || zT0;
            if (ig1.l(ig1Var.l)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tbVar.r() & 4294967295L));
                EdgeEffect edgeEffectG6 = ig1Var.m;
                if (edgeEffectG6 == null) {
                    edgeEffectG6 = ig1Var.g(um3Var);
                    ig1Var.m = edgeEffectG6;
                }
                cf6.v(edgeEffectG6, cf6.r(edgeEffectN), fIntBitsToFloat3);
            }
        }
        if (ig1.l(ig1Var.t)) {
            EdgeEffect edgeEffectG7 = ig1Var.t;
            if (edgeEffectG7 == null) {
                edgeEffectG7 = ig1Var.g(um3Var2);
                ig1Var.t = edgeEffectG7;
            }
            f = 0.0f;
            T0(0.0f, edgeEffectG7, recordingCanvasBeginRecording);
            edgeEffectG7.finish();
        } else {
            f = 0.0f;
        }
        if (ig1.x(ig1Var.v)) {
            EdgeEffect edgeEffectY = ig1Var.y();
            boolean z3 = T0(180.0f, edgeEffectY, recordingCanvasBeginRecording) || zT0;
            if (ig1.l(ig1Var.v)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (tbVar.r() >> 32));
                EdgeEffect edgeEffectG8 = ig1Var.t;
                if (edgeEffectG8 == null) {
                    edgeEffectG8 = ig1Var.g(um3Var2);
                    ig1Var.t = edgeEffectG8;
                }
                cf6.v(edgeEffectG8, cf6.r(edgeEffectY), 1.0f - fIntBitsToFloat4);
            }
            zT0 = z3;
        }
        if (zT0) {
            tbVar.n();
        }
        float f2 = z2 ? f : fE;
        if (z) {
            fE = f;
        }
        fl2 layoutDirection = wm2Var.getLayoutDirection();
        c9 c9Var = new c9();
        c9Var.g = recordingCanvasBeginRecording;
        long jN2 = pb0Var.n();
        j51 j51VarZ = pb0Var.t.z();
        fl2 fl2VarC = pb0Var.t.C();
        nb0 nb0VarB = pb0Var.t.b();
        long jG = pb0Var.t.G();
        ro roVar = pb0Var.t;
        x32 x32Var = (x32) roVar.a;
        roVar.Z(wm2Var);
        roVar.a0(layoutDirection);
        roVar.Y(c9Var);
        roVar.b0(jN2);
        roVar.a = null;
        c9Var.q();
        try {
            ((y22) pb0Var.t.t).D(f2, fE);
            try {
                wm2Var.g();
                float f3 = -f2;
                float f4 = -fE;
                ((y22) pb0Var.t.t).D(f3, f4);
                c9Var.t();
                ro roVar2 = pb0Var.t;
                roVar2.Z(j51VarZ);
                roVar2.a0(fl2VarC);
                roVar2.Y(nb0VarB);
                roVar2.b0(jG);
                roVar2.a = x32Var;
                U0().endRecording();
                int iSave = canvasG.save();
                canvasG.translate(f3, f4);
                canvasG.drawRenderNode(U0());
                canvasG.restoreToCount(iSave);
            } catch (Throwable th) {
                ((y22) pb0Var.t.t).D(-f2, -fE);
                throw th;
            }
        } catch (Throwable th2) {
            c9Var.t();
            ro roVar3 = pb0Var.t;
            roVar3.Z(j51VarZ);
            roVar3.a0(fl2VarC);
            roVar3.Y(nb0VarB);
            roVar3.b0(jG);
            roVar3.a = x32Var;
            throw th2;
        }
    }

    public final RenderNode U0() {
        RenderNode renderNode = this.e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeN = d42.n();
        this.e = renderNodeN;
        return renderNodeN;
    }
}
