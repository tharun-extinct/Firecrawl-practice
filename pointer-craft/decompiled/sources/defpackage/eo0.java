package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class eo0 implements ScrollCaptureCallback {
    public final gj4 g;
    public final ba n;
    public final y22 r;
    public final ku0 v;
    public final g72 x;
    public final ne2 y;

    public eo0(gj4 gj4Var, ne2 ne2Var, ku0 ku0Var, y22 y22Var, ba baVar) {
        this.g = gj4Var;
        this.y = ne2Var;
        this.r = y22Var;
        this.n = baVar;
        this.v = new ku0(ku0Var.j.b(ea1.j));
        this.x = new g72(ne2Var.y(), new do0(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ScrollCaptureSession scrollCaptureSession, ne2 ne2Var, ou0 ou0Var) {
        co0 co0Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionA;
        int i3;
        ne2 ne2Var2;
        int i4;
        int iW;
        int iW2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (ou0Var instanceof co0) {
            co0Var = (co0) ou0Var;
            int i7 = co0Var.s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                co0Var.s = i7 - Integer.MIN_VALUE;
            } else {
                co0Var = new co0(this, ou0Var);
            }
        } else {
            co0Var = new co0(this, ou0Var);
        }
        Object obj = co0Var.i;
        int i8 = co0Var.s;
        g72 g72Var = this.x;
        px0 px0Var = px0.j;
        if (i8 == 0) {
            js2.o(obj);
            i = ne2Var.y;
            i2 = ne2Var.n;
            co0Var.m = scrollCaptureSession;
            co0Var.q = ne2Var;
            co0Var.w = i;
            co0Var.c = i2;
            co0Var.s = 1;
            if (i > i2) {
                g72Var.getClass();
                uo1.v(i, i2, " ≤ max=", "Expected min=");
                return null;
            }
            int i9 = i2 - i;
            int i10 = g72Var.g;
            if (i9 > i10) {
                l0.t(du4.m(i9, i10, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            Object objY = g72Var.y((((i9 / 2) + i) - (i10 / 2)) - g72Var.y, co0Var);
            Object obj2 = og5.g;
            if (objY != px0Var) {
                objY = obj2;
            }
            if (objY == px0Var) {
                obj2 = objY;
            }
            if (obj2 != px0Var) {
            }
            return px0Var;
        }
        if (i8 == 1) {
            int i11 = co0Var.c;
            int i12 = co0Var.w;
            ne2 ne2Var3 = co0Var.q;
            ScrollCaptureSession scrollCaptureSessionA2 = na.a(co0Var.m);
            js2.o(obj);
            i = i12;
            ne2Var = ne2Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionA2;
        } else {
            if (i8 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = co0Var.c;
            i4 = co0Var.w;
            ne2Var2 = co0Var.q;
            scrollCaptureSessionA = na.a(co0Var.m);
            js2.o(obj);
        }
        iW = xs2.w(i4 - k33.Z(g72Var.y), 0, g72Var.g);
        iW2 = xs2.w(i3 - k33.Z(g72Var.y), 0, g72Var.g);
        i5 = ne2Var2.g;
        i6 = ne2Var2.r;
        if (iW == iW2) {
            return ne2.v;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionA.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iW);
            ne2 ne2Var4 = this.y;
            canvasLockHardwareCanvas.translate(-ne2Var4.g, -ne2Var4.y);
            this.n.getRootView().draw(canvasLockHardwareCanvas);
            int iZ = k33.Z(g72Var.y);
            return new ne2(i5, iW + iZ, i6, iW2 + iZ);
        } finally {
            scrollCaptureSessionA.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        wm0 wm0Var = new wm0((byte) 13);
        co0Var.m = scrollCaptureSession;
        co0Var.q = ne2Var;
        co0Var.w = i;
        co0Var.c = i2;
        co0Var.s = 2;
        fx0 fx0Var = co0Var.t;
        fx0Var.getClass();
        if (br2.u(fx0Var).I(co0Var, wm0Var) != px0Var) {
            scrollCaptureSessionA = scrollCaptureSession;
            i3 = i2;
            ne2Var2 = ne2Var;
            i4 = i;
            iW = xs2.w(i4 - k33.Z(g72Var.y), 0, g72Var.g);
            iW2 = xs2.w(i3 - k33.Z(g72Var.y), 0, g72Var.g);
            i5 = ne2Var2.g;
            i6 = ne2Var2.r;
            if (iW == iW2) {
                return ne2.v;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionA.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iW);
            ne2 ne2Var5 = this.y;
            canvasLockHardwareCanvas.translate(-ne2Var5.g, -ne2Var5.y);
            this.n.getRootView().draw(canvasLockHardwareCanvas);
            int iZ2 = k33.Z(g72Var.y);
            return new ne2(i5, iW + iZ2, i6, iW2 + iZ2);
        }
        return px0Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        m50.T(this.v, mh3.t, new q(this, runnable, null, (byte) 13), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        iv4 iv4VarT = m50.T(this.v, null, new s3(this, scrollCaptureSession, rect, consumer, null, (byte) 6), 3);
        iv4VarT.A(new h((Object) cancellationSignal, (byte) 14));
        cancellationSignal.setOnCancelListener(new fo0(iv4VarT, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(oe6.y(this.y));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.x.y = 0.0f;
        ((tp3) this.r.t).setValue(Boolean.TRUE);
        runnable.run();
    }
}
