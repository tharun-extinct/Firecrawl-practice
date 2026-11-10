package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class h05 extends ya6 {
    public int n = -1;
    public int r;
    public final /* synthetic */ SwipeDismissBehavior v;

    public h05(SwipeDismissBehavior swipeDismissBehavior) {
        this.v = swipeDismissBehavior;
    }

    @Override // defpackage.ya6
    public final void a(View view, int i) {
        this.n = i;
        this.r = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.v;
            swipeDismissBehavior.r = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.r = false;
        }
    }

    @Override // defpackage.ya6
    public final boolean c(View view, int i) {
        int i2 = this.n;
        return (i2 == -1 || i2 == i) && this.v.p(view);
    }

    @Override // defpackage.ya6
    public final int g(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        byte b = this.v.n;
        if (b == 0) {
            width = this.r;
            if (z) {
                width -= view.getWidth();
                width2 = this.r;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i2 = this.r;
            if (b != 1) {
                width = i2 - view.getWidth();
                width2 = this.r + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i2;
                width = i2;
            } else {
                width = i2 - view.getWidth();
                width2 = this.r;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.ya6
    public final int j(View view) {
        return view.getWidth();
    }

    @Override // defpackage.ya6
    public final void q(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.v;
        float f = width * swipeDismissBehavior.v;
        float width2 = view.getWidth() * swipeDismissBehavior.x;
        float fAbs = Math.abs(i - this.r);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // defpackage.ya6
    public final void w(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.n = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.v;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            byte b = swipeDismissBehavior.n;
            if (b != 2 && (b != 0 ? b != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.r;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.r;
                    if (left < i2) {
                        i = this.r - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.r - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.r) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.r;
                    if (left < i2) {
                        i = this.r - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.r - width;
                }
                z = true;
            } else {
                i = this.r;
            }
        }
        if (swipeDismissBehavior.g.c(i, view.getTop())) {
            view.postOnAnimation(new i26(swipeDismissBehavior, view, z));
        }
    }
}
