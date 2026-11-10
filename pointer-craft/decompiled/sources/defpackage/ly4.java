package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ly4 extends i43 implements SubMenu {
    public final n43 A;
    public final i43 e;

    public ly4(Context context, i43 i43Var, n43 n43Var) {
        super(context);
        this.e = i43Var;
        this.A = n43Var;
    }

    @Override // defpackage.i43
    public final boolean b() {
        return this.e.b();
    }

    @Override // defpackage.i43
    public final boolean c() {
        return this.e.c();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.i43
    public final boolean i() {
        return this.e.i();
    }

    @Override // defpackage.i43
    public final boolean l(n43 n43Var) {
        return this.e.l(n43Var);
    }

    @Override // defpackage.i43
    public final String m() {
        int i = this.A.g;
        if (i == 0) {
            return null;
        }
        return xi3.j("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.i43
    public final void o(g43 g43Var) {
        throw null;
    }

    @Override // defpackage.i43
    public final i43 q() {
        return this.e.q();
    }

    @Override // defpackage.i43, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.e.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        f(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        f(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        f(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.i43, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.e.setQwertyMode(z);
    }

    @Override // defpackage.i43
    public final boolean v(n43 n43Var) {
        return this.e.v(n43Var);
    }

    @Override // defpackage.i43
    public final boolean x(i43 i43Var, MenuItem menuItem) {
        return super.x(i43Var, menuItem) || this.e.x(i43Var, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        f(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        f(i, null, 0, null, null);
        return this;
    }
}
