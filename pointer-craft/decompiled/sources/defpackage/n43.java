package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n43 implements ez4 {
    public o43 A;
    public MenuItem.OnActionExpandListener B;
    public char a;
    public MenuItem.OnMenuItemClickListener b;
    public final i43 c;
    public int d;
    public View e;
    public final int g;
    public ly4 i;
    public char j;
    public Intent l;
    public final int n;
    public CharSequence p;
    public Drawable q;
    public final int r;
    public CharSequence s;
    public CharSequence v;
    public CharSequence x;
    public final int y;
    public int t = 4096;
    public int m = 4096;
    public int w = 0;
    public ColorStateList u = null;
    public PorterDuff.Mode z = null;
    public boolean h = false;
    public boolean o = false;
    public boolean f = false;
    public int k = 16;
    public boolean C = false;

    public n43(i43 i43Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.c = i43Var;
        this.g = i2;
        this.y = i;
        this.r = i3;
        this.n = i4;
        this.v = charSequence;
        this.d = i5;
    }

    public static void r(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.d & 8) == 0) {
            return false;
        }
        if (this.e == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.c.v(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!v()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.c.l(this);
        }
        return false;
    }

    @Override // defpackage.ez4
    public final ez4 g(o43 o43Var) {
        this.e = null;
        this.A = o43Var;
        this.c.s(true);
        o43 o43Var2 = this.A;
        if (o43Var2 != null) {
            o43Var2.g = new v92((Object) this, (byte) 21);
            o43Var2.y.setVisibilityListener(o43Var2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.e;
        if (view != null) {
            return view;
        }
        o43 o43Var = this.A;
        if (o43Var == null) {
            return null;
        }
        View viewOnCreateActionView = o43Var.y.onCreateActionView(this);
        this.e = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.a;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.y;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.q;
        if (drawable != null) {
            return n(drawable);
        }
        int i = this.w;
        if (i == 0) {
            return null;
        }
        Drawable drawableJ = k33.J(this.c.g, i);
        this.w = 0;
        this.q = drawableJ;
        return n(drawableJ);
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.u;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.z;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.x;
        return charSequence != null ? charSequence : this.v;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.i != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.k & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.k & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.k & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o43 o43Var = this.A;
        if (o43Var == null || !o43Var.y.overridesItemVisibility()) {
            return (this.k & 8) == 0;
        }
        return (this.k & 8) == 0 && this.A.y.isVisible();
    }

    public final Drawable n(Drawable drawable) {
        if (drawable != null && this.f && (this.h || this.o)) {
            drawable = drawable.mutate();
            if (this.h) {
                drawable.setTintList(this.u);
            }
            if (this.o) {
                drawable.setTintMode(this.z);
            }
            this.f = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        i43 i43Var = this.c;
        Context context = i43Var.g;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.e = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.g) > 0) {
            viewInflate.setId(i2);
        }
        i43Var.m = true;
        i43Var.s(true);
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.a == c && this.m == i) {
            return this;
        }
        this.a = Character.toLowerCase(c);
        this.m = KeyEvent.normalizeMetaState(i);
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.k;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.k = i2;
        if (i != i2) {
            this.c.s(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.k;
        int i2 = i & 4;
        i43 i43Var = this.c;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.k = i3;
            if (i != i3) {
                i43Var.s(false);
            }
            return this;
        }
        ArrayList arrayList = i43Var.x;
        int size = arrayList.size();
        i43Var.e();
        for (int i4 = 0; i4 < size; i4++) {
            n43 n43Var = (n43) arrayList.get(i4);
            if (n43Var.y == this.y && (n43Var.k & 4) != 0 && n43Var.isCheckable()) {
                boolean z2 = n43Var == this;
                int i5 = n43Var.k;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                n43Var.k = i6;
                if (i5 != i6) {
                    n43Var.c.s(false);
                }
            }
        }
        i43Var.d();
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final ez4 setContentDescription(CharSequence charSequence) {
        this.s = charSequence;
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.k;
        if (z) {
            this.k = i | 16;
        } else {
            this.k = i & (-17);
        }
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.q = null;
        this.w = i;
        this.f = true;
        this.c.s(false);
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        this.h = true;
        this.f = true;
        this.c.s(false);
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.z = mode;
        this.o = true;
        this.f = true;
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.l = intent;
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.j == c && this.t == i) {
            return this;
        }
        this.j = c;
        this.t = KeyEvent.normalizeMetaState(i);
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = onMenuItemClickListener;
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.j = c;
        this.t = KeyEvent.normalizeMetaState(i);
        this.a = Character.toLowerCase(c2);
        this.m = KeyEvent.normalizeMetaState(i2);
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            l0.u("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.d = i;
        i43 i43Var = this.c;
        i43Var.m = true;
        i43Var.s(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.v = charSequence;
        this.c.s(false);
        ly4 ly4Var = this.i;
        if (ly4Var != null) {
            ly4Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.x = charSequence;
        this.c.s(false);
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final ez4 setTooltipText(CharSequence charSequence) {
        this.p = charSequence;
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.k;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.k = i2;
        if (i != i2) {
            i43 i43Var = this.c;
            i43Var.j = true;
            i43Var.s(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.v;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean v() {
        o43 o43Var;
        if ((this.d & 8) != 0) {
            View viewOnCreateActionView = this.e;
            if (viewOnCreateActionView == null && (o43Var = this.A) != null) {
                viewOnCreateActionView = o43Var.y.onCreateActionView(this);
                this.e = viewOnCreateActionView;
            }
            if (viewOnCreateActionView != null) {
                return true;
            }
        }
        return false;
    }

    public final void x(boolean z) {
        int i = this.k;
        if (z) {
            this.k = i | 32;
        } else {
            this.k = i & (-33);
        }
    }

    @Override // defpackage.ez4
    public final o43 y() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.w = 0;
        this.q = drawable;
        this.f = true;
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.c.g.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = c;
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.j = c;
        this.a = Character.toLowerCase(c2);
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.a == c) {
            return this;
        }
        this.a = Character.toLowerCase(c);
        this.c.s(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.e = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.g) > 0) {
            view.setId(i);
        }
        i43 i43Var = this.c;
        i43Var.m = true;
        i43Var.s(true);
        return this;
    }
}
