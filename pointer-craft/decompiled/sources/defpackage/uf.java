package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class uf implements bl5 {
    public final ViewConfiguration g;

    public uf(ViewConfiguration viewConfiguration) {
        this.g = viewConfiguration;
    }

    @Override // defpackage.bl5
    public final float g() {
        return this.g.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.bl5
    public final float n() {
        return this.g.getScaledTouchSlop();
    }

    @Override // defpackage.bl5
    public final long r() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.bl5
    public final float v() {
        if (Build.VERSION.SDK_INT >= 34) {
            return lh6.y(this.g);
        }
        return 2.0f;
    }

    @Override // defpackage.bl5
    public final float x() {
        if (Build.VERSION.SDK_INT >= 34) {
            return lh6.g(this.g);
        }
        return 16.0f;
    }

    @Override // defpackage.bl5
    public final long y() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
}
