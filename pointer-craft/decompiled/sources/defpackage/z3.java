package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 implements f53 {
    public x3 A;
    public i43 a;
    public boolean b;
    public y3 c;
    public w3 d;
    public i26 e;
    public int h;
    public Drawable i;
    public final Context j;
    public w3 k;
    public final LayoutInflater m;
    public boolean o;
    public boolean p;
    public e53 q;
    public boolean s;
    public Context t;
    public int u;
    public h53 w;
    public int z;
    public final SparseBooleanArray f = new SparseBooleanArray();
    public final fa4 B = new fa4((Object) this, (byte) 2);

    public z3(Context context) {
        this.j = context;
        this.m = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f53
    public final boolean a(ly4 ly4Var) {
        boolean z;
        if (ly4Var.hasVisibleItems()) {
            ly4 ly4Var2 = ly4Var;
            while (true) {
                i43 i43Var = ly4Var2.e;
                if (i43Var == this.a) {
                    break;
                }
                ly4Var2 = (ly4) i43Var;
            }
            n43 n43Var = ly4Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.w;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof g53) && ((g53) childAt).getItemData() == n43Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = ly4Var.x.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = ly4Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                w3 w3Var = new w3(this, this.t, ly4Var, view);
                this.d = w3Var;
                w3Var.j = z;
                x43 x43Var = w3Var.a;
                if (x43Var != null) {
                    x43Var.i(z);
                }
                w3 w3Var2 = this.d;
                if (!w3Var2.y()) {
                    if (w3Var2.x == null) {
                        l0.z("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    w3Var2.n(0, 0, false, false);
                }
                e53 e53Var = this.q;
                if (e53Var != null) {
                    e53Var.d(ly4Var);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View g(n43 n43Var, View view, ViewGroup viewGroup) {
        View actionView = n43Var.getActionView();
        if (actionView == null || n43Var.v()) {
            g53 g53Var = view instanceof g53 ? (g53) view : (g53) this.m.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            g53Var.r(n43Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) g53Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.w);
            x3 x3Var = this.A;
            if (x3Var == null) {
                x3Var = new x3(this);
                this.A = x3Var;
            }
            actionMenuItemView.setPopupCallback(x3Var);
            actionView = (View) g53Var;
        }
        actionView.setVisibility(n43Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof b4)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean j() {
        w3 w3Var = this.k;
        return w3Var != null && w3Var.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f53
    public final void l() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.w;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            i43 i43Var = this.a;
            if (i43Var != null) {
                i43Var.a();
                ArrayList arrayListW = this.a.w();
                int size = arrayListW.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    n43 n43Var = (n43) arrayListW.get(i2);
                    if ((n43Var.k & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        n43 itemData = childAt instanceof g53 ? ((g53) childAt).getItemData() : null;
                        View viewG = g(n43Var, childAt, viewGroup);
                        if (n43Var != itemData) {
                            viewG.setPressed(false);
                            viewG.jumpDrawablesToCurrentState();
                        }
                        if (viewG != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewG.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewG);
                            }
                            ((ViewGroup) this.w).addView(viewG, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.c) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.w).requestLayout();
        i43 i43Var2 = this.a;
        if (i43Var2 != null) {
            i43Var2.a();
            ArrayList arrayList2 = i43Var2.t;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                o43 o43Var = ((n43) arrayList2.get(i3)).A;
            }
        }
        i43 i43Var3 = this.a;
        if (i43Var3 != null) {
            i43Var3.a();
            arrayList = i43Var3.a;
        }
        if (this.s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((n43) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        y3 y3Var = this.c;
        if (z) {
            if (y3Var == null) {
                y3Var = new y3(this, this.j);
                this.c = y3Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) y3Var.getParent();
            if (viewGroup3 != this.w) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.c);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.w;
                y3 y3Var2 = this.c;
                actionMenuView.getClass();
                b4 b4VarA = ActionMenuView.a();
                b4VarA.g = true;
                actionMenuView.addView(y3Var2, b4VarA);
            }
        } else if (y3Var != null) {
            Object parent = y3Var.getParent();
            Object obj = this.w;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.c);
            }
        }
        ((ActionMenuView) this.w).setOverflowReserved(this.s);
    }

    @Override // defpackage.f53
    public final boolean m() {
        int size;
        ArrayList arrayListW;
        int i;
        boolean z;
        z3 z3Var = this;
        i43 i43Var = z3Var.a;
        if (i43Var != null) {
            arrayListW = i43Var.w();
            size = arrayListW.size();
        } else {
            size = 0;
            arrayListW = null;
        }
        int i2 = z3Var.h;
        int i3 = z3Var.z;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) z3Var.w;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            n43 n43Var = (n43) arrayListW.get(i4);
            int i7 = n43Var.d;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (z3Var.o && n43Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (z3Var.s && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = z3Var.f;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            n43 n43Var2 = (n43) arrayListW.get(i9);
            int i11 = n43Var2.d;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = n43Var2.y;
            if (z3) {
                View viewG = z3Var.g(n43Var2, null, viewGroup);
                viewG.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewG.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                n43Var2.x(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewG2 = z3Var.g(n43Var2, null, viewGroup);
                        viewG2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewG2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            n43 n43Var3 = (n43) arrayListW.get(i13);
                            if (n43Var3.y == i12) {
                                if ((n43Var3.k & 32) == 32) {
                                    i8++;
                                }
                                n43Var3.x(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    n43Var2.x(z5);
                } else {
                    n43Var2.x(false);
                }
                i9++;
                i = 2;
                z3Var = this;
                z = true;
            }
            i9++;
            i = 2;
            z3Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.f53
    public final boolean n(n43 n43Var) {
        return false;
    }

    public final boolean q() {
        i43 i43Var;
        boolean z = false;
        if (this.s && !j() && (i43Var = this.a) != null && this.w != null && this.e == null) {
            i43Var.a();
            if (!i43Var.a.isEmpty()) {
                i26 i26Var = new i26((byte) 1, this, new w3(this, this.t, this.a, this.c), z);
                this.e = i26Var;
                ((View) this.w).post(i26Var);
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        Object obj;
        i26 i26Var = this.e;
        if (i26Var != null && (obj = this.w) != null) {
            ((View) obj).removeCallbacks(i26Var);
            this.e = null;
            return true;
        }
        w3 w3Var = this.k;
        if (w3Var == null) {
            return false;
        }
        if (w3Var.y()) {
            w3Var.a.dismiss();
        }
        return true;
    }

    @Override // defpackage.f53
    public final void t(Context context, i43 i43Var) {
        this.t = context;
        LayoutInflater.from(context);
        this.a = i43Var;
        Resources resources = context.getResources();
        if (!this.p) {
            this.s = true;
        }
        int i = 2;
        this.u = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.h = i;
        int measuredWidth = this.u;
        if (this.s) {
            if (this.c == null) {
                y3 y3Var = new y3(this, this.j);
                this.c = y3Var;
                if (this.b) {
                    y3Var.setImageDrawable(this.i);
                    this.i = null;
                    this.b = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.c.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.c.getMeasuredWidth();
        } else {
            this.c = null;
        }
        this.z = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.f53
    public final void v(e53 e53Var) {
        throw null;
    }

    @Override // defpackage.f53
    public final boolean x(n43 n43Var) {
        return false;
    }

    @Override // defpackage.f53
    public final void y(i43 i43Var, boolean z) {
        r();
        w3 w3Var = this.d;
        if (w3Var != null && w3Var.y()) {
            w3Var.a.dismiss();
        }
        e53 e53Var = this.q;
        if (e53Var != null) {
            e53Var.y(i43Var, z);
        }
    }
}
