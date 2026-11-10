package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mo5 extends d4 implements g43 {
    public final Context a;
    public final /* synthetic */ no5 c;
    public final i43 m;
    public cd2 q;
    public WeakReference w;

    public mo5(no5 no5Var, Context context, cd2 cd2Var) {
        this.c = no5Var;
        this.a = context;
        this.q = cd2Var;
        i43 i43Var = new i43(context);
        i43Var.q = true;
        this.m = i43Var;
        i43Var.v = this;
    }

    @Override // defpackage.d4
    public final void a(View view) {
        this.c.x.setCustomView(view);
        this.w = new WeakReference(view);
    }

    @Override // defpackage.d4
    public final void c(CharSequence charSequence) {
        this.c.x.setTitle(charSequence);
    }

    @Override // defpackage.d4
    public final void g() {
        no5 no5Var = this.c;
        if (no5Var.t != this) {
            return;
        }
        if (no5Var.b) {
            no5Var.a = this;
            no5Var.m = this.q;
        } else {
            this.q.B(this);
        }
        this.q = null;
        no5Var.g(false);
        ActionBarContextView actionBarContextView = no5Var.x;
        if (actionBarContextView.p == null) {
            actionBarContextView.v();
        }
        no5Var.r.setHideOnContentScrollEnabled(no5Var.h);
        no5Var.t = null;
    }

    @Override // defpackage.d4
    public final void i(boolean z) {
        this.t = z;
        this.c.x.setTitleOptional(z);
    }

    @Override // defpackage.g43
    public final boolean j(i43 i43Var, MenuItem menuItem) {
        cd2 cd2Var = this.q;
        if (cd2Var != null) {
            return ((ty) cd2Var.t).m(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.d4
    public final void l() {
        if (this.c.t != this) {
            return;
        }
        i43 i43Var = this.m;
        i43Var.e();
        try {
            this.q.C(this, i43Var);
        } finally {
            i43Var.d();
        }
    }

    @Override // defpackage.d4
    public final void m(int i) {
        q(this.c.g.getResources().getString(i));
    }

    @Override // defpackage.d4
    public final MenuInflater n() {
        return new dz4(this.a);
    }

    @Override // defpackage.d4
    public final void q(CharSequence charSequence) {
        this.c.x.setSubtitle(charSequence);
    }

    @Override // defpackage.d4
    public final i43 r() {
        return this.m;
    }

    @Override // defpackage.d4
    public final boolean t() {
        return this.c.x.e;
    }

    @Override // defpackage.d4
    public final CharSequence v() {
        return this.c.x.getSubtitle();
    }

    @Override // defpackage.d4
    public final void w(int i) {
        c(this.c.g.getResources().getString(i));
    }

    @Override // defpackage.d4
    public final CharSequence x() {
        return this.c.x.getTitle();
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
        if (this.q == null) {
            return;
        }
        l();
        z3 z3Var = this.c.x.m;
        if (z3Var != null) {
            z3Var.q();
        }
    }
}
