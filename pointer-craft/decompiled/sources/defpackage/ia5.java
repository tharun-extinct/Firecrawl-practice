package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ia5 implements f53 {
    public final /* synthetic */ Toolbar a;
    public i43 j;
    public n43 t;

    public ia5(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // defpackage.f53
    public final boolean a(ly4 ly4Var) {
        return false;
    }

    @Override // defpackage.f53
    public final void l() {
        if (this.t != null) {
            i43 i43Var = this.j;
            if (i43Var != null) {
                int size = i43Var.x.size();
                for (int i = 0; i < size; i++) {
                    if (this.j.getItem(i) == this.t) {
                        return;
                    }
                }
            }
            n(this.t);
        }
    }

    @Override // defpackage.f53
    public final boolean m() {
        return false;
    }

    @Override // defpackage.f53
    public final boolean n(n43 n43Var) {
        Toolbar toolbar = this.a;
        KeyEvent.Callback callback = toolbar.b;
        if (callback instanceof zi0) {
            ((p43) ((zi0) callback)).j.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.b);
        toolbar.removeView(toolbar.i);
        toolbar.b = null;
        ArrayList arrayList = toolbar.L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.t = null;
        toolbar.requestLayout();
        n43Var.C = false;
        n43Var.c.s(false);
        toolbar.z();
        return true;
    }

    @Override // defpackage.f53
    public final void t(Context context, i43 i43Var) {
        n43 n43Var;
        i43 i43Var2 = this.j;
        if (i43Var2 != null && (n43Var = this.t) != null) {
            i43Var2.v(n43Var);
        }
        this.j = i43Var;
    }

    @Override // defpackage.f53
    public final boolean x(n43 n43Var) {
        Toolbar toolbar = this.a;
        toolbar.r();
        ViewParent parent = toolbar.i.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.i);
            }
            toolbar.addView(toolbar.i);
        }
        View actionView = n43Var.getActionView();
        toolbar.b = actionView;
        this.t = n43Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.b);
            }
            ja5 ja5VarJ = Toolbar.j();
            ja5VarJ.g = (toolbar.h & 112) | 8388611;
            ja5VarJ.y = (byte) 2;
            toolbar.b.setLayoutParams(ja5VarJ);
            toolbar.addView(toolbar.b);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((ja5) childAt.getLayoutParams()).y != 2 && childAt != toolbar.j) {
                toolbar.removeViewAt(childCount);
                toolbar.L.add(childAt);
            }
        }
        toolbar.requestLayout();
        n43Var.C = true;
        n43Var.c.s(false);
        KeyEvent.Callback callback = toolbar.b;
        if (callback instanceof zi0) {
            ((p43) ((zi0) callback)).j.onActionViewExpanded();
        }
        toolbar.z();
        return true;
    }

    @Override // defpackage.f53
    public final void y(i43 i43Var, boolean z) {
    }
}
