package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class sc0 extends sc5 {
    public boolean g = false;
    public final ViewGroup y;

    public sc0(ViewGroup viewGroup) {
        this.y = viewGroup;
    }

    @Override // defpackage.sc5, defpackage.ic5
    public final void g(lc5 lc5Var) {
        if (!this.g) {
            za6.c(this.y, false);
        }
        lc5Var.e(this);
    }

    @Override // defpackage.sc5, defpackage.ic5
    public final void r() {
        za6.c(this.y, true);
    }

    @Override // defpackage.sc5, defpackage.ic5
    public final void v(lc5 lc5Var) {
        za6.c(this.y, false);
        this.g = true;
    }

    @Override // defpackage.sc5, defpackage.ic5
    public final void y() {
        za6.c(this.y, false);
    }
}
