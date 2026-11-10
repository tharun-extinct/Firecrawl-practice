package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class qd0 extends s1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ View q;

    public /* synthetic */ qd0(View view, byte b) {
        this.m = b;
        this.q = view;
    }

    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        byte b = this.m;
        View view2 = this.q;
        View.AccessibilityDelegate accessibilityDelegate = this.j;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                m2Var.f(checkableImageButton.q);
                m2Var.k(checkableImageButton.m);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i = MaterialButtonToggleGroup.e;
                int i2 = -1;
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i2 = i3;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                i3++;
                            }
                        }
                    }
                }
                m2Var.B(l2.g(((MaterialButton) view).C, 0, 1, i2, 1));
                break;
        }
    }

    @Override // defpackage.s1
    public void r(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.m) {
            case 0:
                super.r(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.q).m);
                break;
            default:
                super.r(view, accessibilityEvent);
                break;
        }
    }
}
