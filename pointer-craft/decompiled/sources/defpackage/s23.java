package defpackage;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s23 extends s1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object q;

    public /* synthetic */ s23(Object obj, byte b) {
        this.m = b;
        this.q = obj;
    }

    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        byte b = this.m;
        Object obj = this.q;
        View.AccessibilityDelegate accessibilityDelegate = this.j;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
                u23 u23Var = (u23) obj;
                m2Var.y(new f2(u23Var.u0.getVisibility() == 0 ? u23Var.i(R.string.mtrl_picker_toggle_to_year_selection) : u23Var.i(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                m2Var.f(navigationMenuItemView.E);
                m2Var.Y(navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }
}
