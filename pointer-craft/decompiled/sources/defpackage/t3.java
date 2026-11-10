package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 implements ez4 {
    public CharSequence a;
    public int b;
    public boolean c;
    public CharSequence g;
    public boolean i;
    public Drawable j;
    public int l;
    public CharSequence m;
    public char n;
    public ColorStateList q;
    public Intent r;
    public Context t;
    public int v;
    public PorterDuff.Mode w;
    public char x;
    public CharSequence y;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // defpackage.ez4
    public final ez4 g(o43 o43Var) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.x;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.j;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.q;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.y;
        return charSequence != null ? charSequence : this.g;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.b & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.b & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.b & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.b & 8) == 0;
    }

    public final void r() {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (this.c || this.i) {
                this.j = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.j = drawableMutate;
                if (this.c) {
                    drawableMutate.setTintList(this.q);
                }
                if (this.i) {
                    this.j.setTintMode(this.w);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.x = Character.toLowerCase(c);
        this.l = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.b = (z ? 1 : 0) | (this.b & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.b = (z ? 2 : 0) | (this.b & (-3));
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final ez4 setContentDescription(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.b = (z ? 16 : 0) | (this.b & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.j = this.t.getDrawable(i);
        r();
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.q = colorStateList;
        this.c = true;
        r();
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.i = true;
        r();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.r = intent;
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.n = c;
        this.v = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.n = c;
        this.v = KeyEvent.normalizeMetaState(i);
        this.x = Character.toLowerCase(c2);
        this.l = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.g = this.t.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.y = charSequence;
        return this;
    }

    @Override // defpackage.ez4, android.view.MenuItem
    public final ez4 setTooltipText(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.b = (this.b & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // defpackage.ez4
    public final o43 y() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.n = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.j = drawable;
        r();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.x = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.g = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.n = c;
        this.x = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
