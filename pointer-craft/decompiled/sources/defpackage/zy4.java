package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zy4 extends ActionMode {
    public final Context g;
    public final d4 y;

    public zy4(Context context, d4 d4Var) {
        this.g = context;
        this.y = d4Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.y.g();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.y.y();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new i53(this.g, this.y.r());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.y.n();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.y.v();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.y.j;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.y.x();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.y.t;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.y.l();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.y.t();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.y.a(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.y.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.y.j = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.y.c(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.y.i(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.y.m(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.y.w(i);
    }
}
