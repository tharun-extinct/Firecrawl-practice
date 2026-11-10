package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class q43 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener g;
    public final /* synthetic */ r43 y;

    public q43(r43 r43Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.y = r43Var;
        this.g = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.g.onMenuItemActionCollapse(this.y.x(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.g.onMenuItemActionExpand(this.y.x(menuItem));
    }
}
