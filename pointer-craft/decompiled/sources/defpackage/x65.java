package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x65 implements xt3 {
    public final wp2 a;
    public j4 c;
    public final View g;
    public ma2 j;
    public k65 l;
    public Rect m;
    public boolean n;
    public final iy0 q;
    public final k9 r;
    public final ArrayList t;
    public xy1 v;
    public final rb3 w;
    public xy1 x;
    public final ro y;

    public x65(View view, ba baVar, k9 k9Var) {
        ro roVar = new ro(view);
        this.g = view;
        this.y = roVar;
        this.r = k9Var;
        this.v = new nd4((byte) 26);
        this.x = new nd4((byte) 27);
        this.l = new k65("", u75.y, 4);
        this.j = ma2.l;
        this.t = new ArrayList();
        this.a = v13.u(bt2.t, new gd4(this, (byte) 10));
        this.q = new iy0(baVar, roVar);
        this.w = new rb3(new w65[16]);
    }

    @Override // defpackage.xt3
    public final void g(k65 k65Var, ma2 ma2Var, q2 q2Var, kw0 kw0Var) {
        this.n = true;
        this.l = k65Var;
        this.j = ma2Var;
        this.v = q2Var;
        this.x = kw0Var;
        t(w65.j);
    }

    @Override // defpackage.xt3
    public final void j(k44 k44Var) {
        Rect rect;
        this.m = new Rect(k33.Z(k44Var.g), k33.Z(k44Var.y), k33.Z(k44Var.r), k33.Z(k44Var.n));
        if (!this.t.isEmpty() || (rect = this.m) == null) {
            return;
        }
        this.g.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.xt3
    public final void l() {
        this.n = false;
        this.v = new vy3((byte) 27);
        this.x = new vy3((byte) 28);
        this.m = null;
        t(w65.t);
    }

    @Override // defpackage.xt3
    public final void n() {
        t(w65.a);
    }

    @Override // defpackage.xt3
    public final void r(k65 k65Var, k65 k65Var2) {
        boolean z = (u75.y(this.l.y, k65Var2.y) && yf2.p(this.l.r, k65Var2.r)) ? false : true;
        this.l = k65Var2;
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            g44 g44Var = (g44) ((WeakReference) this.t.get(i)).get();
            if (g44Var != null) {
                g44Var.n(k65Var2);
            }
        }
        iy0 iy0Var = this.q;
        synchronized (iy0Var.r) {
            iy0Var.a = null;
            iy0Var.q = null;
            iy0Var.m = null;
            iy0Var.w = be.w;
            iy0Var.c = null;
            iy0Var.i = null;
        }
        if (yf2.p(k65Var, k65Var2)) {
            if (z) {
                ro roVar = this.y;
                int iX = u75.x(k65Var2.y);
                int iV = u75.v(k65Var2.y);
                u75 u75Var = this.l.r;
                int iX2 = u75Var != null ? u75.x(u75Var.g) : -1;
                u75 u75Var2 = this.l.r;
                ((InputMethodManager) ((wp2) roVar.a).getValue()).updateSelection((View) roVar.t, iX, iV, iX2, u75Var2 != null ? u75.v(u75Var2.g) : -1);
                return;
            }
            return;
        }
        if (k65Var != null && (!yf2.p(k65Var.g.t, k65Var2.g.t) || (u75.y(k65Var.y, k65Var2.y) && !yf2.p(k65Var.r, k65Var2.r)))) {
            ro roVar2 = this.y;
            ((InputMethodManager) ((wp2) roVar2.a).getValue()).restartInput((View) roVar2.t);
            return;
        }
        int size2 = this.t.size();
        for (int i2 = 0; i2 < size2; i2++) {
            g44 g44Var2 = (g44) ((WeakReference) this.t.get(i2)).get();
            if (g44Var2 != null) {
                g44Var2.v(this.l, this.y);
            }
        }
    }

    public final void t(w65 w65Var) {
        this.w.y(w65Var);
        if (this.c == null) {
            j4 j4Var = new j4(this, (byte) 15);
            this.r.execute(j4Var);
            this.c = j4Var;
        }
    }

    @Override // defpackage.xt3
    public final void v(k65 k65Var, aj3 aj3Var, j75 j75Var, ce ceVar, k44 k44Var, k44 k44Var2) {
        iy0 iy0Var = this.q;
        synchronized (iy0Var.r) {
            try {
                iy0Var.a = k65Var;
                iy0Var.q = aj3Var;
                iy0Var.m = j75Var;
                iy0Var.w = ceVar;
                iy0Var.c = k44Var;
                iy0Var.i = k44Var2;
                if (iy0Var.v || iy0Var.n) {
                    iy0Var.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xt3
    public final void x() {
        t(w65.m);
    }

    @Override // defpackage.xt3
    public final void y() {
        t(w65.j);
    }
}
