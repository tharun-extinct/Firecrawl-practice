package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hv4 extends d4 implements g43 {
    public final Context a;
    public boolean c;
    public final i43 i;
    public final ActionBarContextView m;
    public final cd2 q;
    public WeakReference w;

    public hv4(Context context, ActionBarContextView actionBarContextView, cd2 cd2Var) {
        this.a = context;
        this.m = actionBarContextView;
        this.q = cd2Var;
        i43 i43Var = new i43(actionBarContextView.getContext());
        i43Var.q = true;
        this.i = i43Var;
        i43Var.v = this;
    }

    @Override // defpackage.d4
    public final void a(View view) {
        this.m.setCustomView(view);
        this.w = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.d4
    public final void c(CharSequence charSequence) {
        this.m.setTitle(charSequence);
    }

    @Override // defpackage.d4
    public final void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.q.B(this);
    }

    @Override // defpackage.d4
    public final void i(boolean z) {
        this.t = z;
        this.m.setTitleOptional(z);
    }

    @Override // defpackage.g43
    public final boolean j(i43 i43Var, MenuItem menuItem) {
        return ((ty) this.q.t).m(this, menuItem);
    }

    @Override // defpackage.d4
    public final void l() {
        this.q.C(this, this.i);
    }

    @Override // defpackage.d4
    public final void m(int i) {
        q(this.a.getString(i));
    }

    @Override // defpackage.d4
    public final MenuInflater n() {
        return new dz4(this.m.getContext());
    }

    @Override // defpackage.d4
    public final void q(CharSequence charSequence) {
        this.m.setSubtitle(charSequence);
    }

    @Override // defpackage.d4
    public final i43 r() {
        return this.i;
    }

    @Override // defpackage.d4
    public final boolean t() {
        return this.m.e;
    }

    @Override // defpackage.d4
    public final CharSequence v() {
        return this.m.getSubtitle();
    }

    @Override // defpackage.d4
    public final void w(int i) {
        c(this.a.getString(i));
    }

    @Override // defpackage.d4
    public final CharSequence x() {
        return this.m.getTitle();
    }

    @Override // defpackage.d4
    public final View y() {
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.g43
    public final void z(i43 i43Var) {
        l();
        z3 z3Var = this.m.m;
        if (z3Var != null) {
            z3Var.q();
        }
    }
}
