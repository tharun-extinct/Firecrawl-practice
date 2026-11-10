package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import io.appground.blek.R;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class sv3 extends d {
    public static final m92 K = new m92((byte) 29);
    public final tp3 A;
    public final tp3 B;
    public ne2 C;
    public final z51 D;
    public final Rect E;
    public final ut4 F;
    public wj G;
    public final tp3 H;
    public boolean I;
    public final int[] J;
    public vv3 d;
    public fl2 e;
    public final WindowManager f;
    public final boolean h;
    public final WindowManager.LayoutParams k;
    public final t32 o;
    public wv3 p;
    public my1 s;
    public String u;
    public final View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv3(my1 my1Var, wv3 wv3Var, String str, View view, j51 j51Var, vv3 vv3Var, UUID uuid, boolean z) {
        super(view.getContext(), null);
        int i = Build.VERSION.SDK_INT;
        byte b = 25;
        t32 uv3Var = i >= 30 ? new uv3(b) : i >= 29 ? new tv3(b) : new t32(b);
        this.s = my1Var;
        this.p = wv3Var;
        this.u = str;
        this.z = view;
        this.h = z;
        this.o = uv3Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        wv3 wv3Var2 = this.p;
        boolean zY = de.y(view);
        boolean z2 = wv3Var2.y;
        int i2 = wv3Var2.g;
        if (z2 && zY) {
            i2 |= 8192;
        } else if (z2 && !zY) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.p.x;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.k = layoutParams;
        this.d = vv3Var;
        this.e = fl2.j;
        this.A = kq2.M(null);
        this.B = kq2.M(null);
        this.D = pt4.y(new m63(this, (byte) 1));
        this.E = new Rect();
        this.F = new ut4(new vd(this, (byte) 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, aq2.c(view));
        setTag(R.id.view_tree_view_model_store_owner, kq2.B(view));
        setTag(R.id.view_tree_saved_state_registry_owner, v13.m(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(j51Var.e(8.0f));
        setOutlineProvider(new ei0((byte) 3));
        this.H = kq2.M(zx5.g);
        this.J = new int[2];
    }

    private final bz1 getContent() {
        return (bz1) this.H.getValue();
    }

    private final ne2 getDisplayBounds() {
        int i = this.p.g & 512;
        View view = this.z;
        Rect rect = this.E;
        t32 t32Var = this.o;
        if (i == 0) {
            t32Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            t32Var.b(rect, view);
        }
        return new ne2(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final bl2 getParentLayoutCoordinates() {
        return (bl2) this.B.getValue();
    }

    private final void setContent(bz1 bz1Var) {
        this.H.setValue(bz1Var);
    }

    private final void setParentLayoutCoordinates(bl2 bl2Var) {
        this.B.setValue(bl2Var);
    }

    public static final boolean w(sv3 sv3Var) {
        bl2 parentLayoutCoordinates = sv3Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.W()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || sv3Var.m19getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    public final void b() {
        bl2 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.W()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jL = parentLayoutCoordinates.L();
            long jG = this.h ? parentLayoutCoordinates.g(0L) : parentLayoutCoordinates.t(0L);
            ne2 ne2VarQ = c93.q((((long) Math.round(Float.intBitsToFloat((int) (jG >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jG & 4294967295L))))), jL);
            if (ne2VarQ.equals(this.C)) {
                return;
            }
            this.C = ne2VarQ;
            p();
        }
    }

    public final void c(to0 to0Var, bz1 bz1Var) {
        setParentCompositionContext(to0Var);
        setContent(bz1Var);
        this.I = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.p.r) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                my1 my1Var = this.s;
                if (my1Var != null) {
                    my1Var.g();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.d
    public final void g(int i, h02 h02Var) {
        h02Var.Z(-857613600);
        int i2 = (h02Var.j(this) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            getContent().l(h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(this, i, (byte) 22);
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.k;
    }

    public final fl2 getParentLayoutDirection() {
        return this.e;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final qe2 m19getPopupContentSizebOM6tXw() {
        return (qe2) this.A.getValue();
    }

    public final vv3 getPositionProvider() {
        return this.d;
    }

    @Override // defpackage.d
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.I;
    }

    public final String getTestTag() {
        return this.u;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(my1 my1Var, wv3 wv3Var, String str, fl2 fl2Var) {
        int i;
        this.s = my1Var;
        this.u = str;
        if (!yf2.p(this.p, wv3Var)) {
            wv3Var.getClass();
            this.p = wv3Var;
            boolean zY = de.y(this.z);
            boolean z = wv3Var.y;
            int i2 = wv3Var.g;
            if (z && zY) {
                i2 |= 8192;
            } else if (z && !zY) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.k;
            layoutParams.flags = i2;
            this.o.getClass();
            this.f.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = fl2Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                up.y();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.d
    public final void j(int i, int i2) {
        this.p.getClass();
        ne2 displayBounds = getDisplayBounds();
        super.j(View.MeasureSpec.makeMeasureSpec(displayBounds.n(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.y(), Integer.MIN_VALUE));
    }

    @Override // defpackage.d
    public final void l(boolean z, int i, int i2, int i3, int i4) {
        super.l(z, i, i2, i3, i4);
        this.p.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.k;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.o.getClass();
        this.f.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.d, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.v();
        if (!this.p.r || Build.VERSION.SDK_INT < 33) {
            return;
        }
        wj wjVar = this.G;
        if (wjVar == null) {
            wj wjVar2 = new wj(this.s, (byte) 0);
            this.G = wjVar2;
            wjVar = wjVar2;
        }
        h2.a(this, wjVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ut4 ut4Var = this.F;
        d5 d5Var = ut4Var.j;
        if (d5Var != null) {
            d5Var.y();
        }
        ut4Var.g();
        if (Build.VERSION.SDK_INT >= 33) {
            h2.m(this, this.G);
        }
        this.G = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.p.n) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            my1 my1Var = this.s;
            if (my1Var != null) {
                my1Var.g();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            my1 my1Var2 = this.s;
            if (my1Var2 != null) {
                my1Var2.g();
            }
        }
        return true;
    }

    public final void p() {
        qe2 qe2VarM19getPopupContentSizebOM6tXw;
        final ne2 ne2Var = this.C;
        if (ne2Var == null || (qe2VarM19getPopupContentSizebOM6tXw = m19getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = qe2VarM19getPopupContentSizebOM6tXw.g;
        ne2 displayBounds = getDisplayBounds();
        final long jY = (((long) displayBounds.y()) & 4294967295L) | (((long) displayBounds.n()) << 32);
        final t54 t54Var = new t54();
        t54Var.j = 0L;
        this.F.n(this, K, new my1() { // from class: rv3
            @Override // defpackage.my1
            public final Object g() {
                sv3 sv3Var = this;
                t54Var.j = sv3Var.d.v(ne2Var, jY, sv3Var.e, j);
                return og5.g;
            }
        });
        long j2 = t54Var.j;
        WindowManager.LayoutParams layoutParams = this.k;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.p.v;
        t32 t32Var = this.o;
        if (z) {
            t32Var.s(this, (int) (jY >> 32), (int) (jY & 4294967295L));
        }
        t32Var.getClass();
        this.f.updateViewLayout(this, layoutParams);
    }

    public final void s(bl2 bl2Var) {
        setParentLayoutCoordinates(bl2Var);
        b();
    }

    public final void setParentLayoutDirection(fl2 fl2Var) {
        this.e = fl2Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m20setPopupContentSizefhxjrPA(qe2 qe2Var) {
        this.A.setValue(qe2Var);
    }

    public final void setPositionProvider(vv3 vv3Var) {
        this.d = vv3Var;
    }

    public final void setTestTag(String str) {
        this.u = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public d getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
