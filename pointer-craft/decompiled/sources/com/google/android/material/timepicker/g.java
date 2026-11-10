package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import defpackage.f2;
import defpackage.l2;
import defpackage.m2;
import defpackage.s1;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends s1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ViewGroup q;

    public /* synthetic */ g(ViewGroup viewGroup, byte b) {
        this.m = b;
        this.q = viewGroup;
    }

    @Override // defpackage.s1
    public boolean l(View view, int i, Bundle bundle) {
        switch (this.m) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.q;
                ClockHandView clockHandView = clockFaceView.A;
                Rect rect = clockFaceView.B;
                if (i != 16) {
                    return super.l(view, i, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            default:
                return super.l(view, i, bundle);
        }
    }

    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        byte b = this.m;
        ViewGroup viewGroup = this.q;
        View.AccessibilityDelegate accessibilityDelegate = this.j;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
                m2Var.f0(((EditText) view).getText());
                m2Var.L(((ChipTextInputComboView) viewGroup).a.getText());
                m2Var.Q(2);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    m2Var.i0((View) ((ClockFaceView) viewGroup).E.get(iIntValue - 1));
                }
                m2Var.B(l2.g(view.isSelected(), 0, 1, iIntValue, 1));
                m2Var.e(true);
                m2Var.y(f2.v);
                break;
        }
    }
}
