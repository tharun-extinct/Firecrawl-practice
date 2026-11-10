package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class em1 extends y22 {
    public final /* synthetic */ le0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em1(le0 le0Var) {
        super((byte) 3);
        this.w = le0Var;
    }

    @Override // defpackage.y22
    public final boolean k(int i, int i2, Bundle bundle) {
        int i3;
        le0 le0Var = this.w;
        Chip chip = le0Var.b;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return le0Var.s(i);
        }
        if (i2 == 2) {
            return le0Var.a(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = le0Var.i;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = le0Var.p) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                le0Var.p = Integer.MIN_VALUE;
                chip.invalidate();
                le0Var.p(i3, 65536);
            }
            le0Var.p = i;
            chip.invalidate();
            le0Var.p(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (le0Var.p != i) {
                return false;
            }
            le0Var.p = Integer.MIN_VALUE;
            chip.invalidate();
            le0Var.p(i, 65536);
            return true;
        }
        Chip chip2 = le0Var.h;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.i;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.e) {
                    chip2.d.p(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.y22
    public final m2 p(int i) {
        le0 le0Var = this.w;
        int i2 = i == 2 ? le0Var.p : le0Var.u;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i2);
    }

    @Override // defpackage.y22
    public final m2 w(int i) {
        return new m2(AccessibilityNodeInfo.obtain(this.w.c(i).g));
    }
}
