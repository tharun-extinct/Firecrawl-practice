package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pu4 {
    public boolean g;
    public boolean y;

    public final void g(ViewGroup viewGroup) {
        viewGroup.getClass();
        if (!this.y) {
            r(viewGroup);
        }
        this.y = true;
    }

    public final void l(ViewGroup viewGroup) {
        viewGroup.getClass();
        if (!this.g) {
            x(viewGroup);
        }
        this.g = true;
    }

    public abstract void n(ViewGroup viewGroup);

    public abstract void r(ViewGroup viewGroup);

    public void v(sv svVar, ViewGroup viewGroup) {
        viewGroup.getClass();
    }

    public void x(ViewGroup viewGroup) {
        viewGroup.getClass();
    }

    public boolean y() {
        return this instanceof p31;
    }
}
