package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x62 extends av0 implements s02 {
    public volatile vw1 B0;
    public yk5 z0;
    public boolean A0 = false;
    public final Object C0 = new Object();
    public boolean D0 = false;

    @Override // defpackage.pw1
    public final LayoutInflater E(Bundle bundle) {
        LayoutInflater layoutInflaterE = super.E(bundle);
        return layoutInflaterE.cloneInContext(new yk5(layoutInflaterE, this));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    @Override // defpackage.pw1
    public final void d(Activity activity) {
        boolean z;
        this.M = true;
        Context baseContext = this.z0;
        if (baseContext != null) {
            while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (baseContext == activity) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        js2.v(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e0();
        if (this.D0) {
            return;
        }
        this.D0 = true;
        ly0 ly0Var = (ly0) n();
        ly0Var.getClass();
    }

    public final void e0() {
        if (this.z0 == null) {
            this.z0 = new yk5(super.m(), this);
            this.A0 = cg6.y(super.m());
        }
    }

    @Override // defpackage.pw1
    public final void k(yk ykVar) {
        super.k(ykVar);
        e0();
        if (this.D0) {
            return;
        }
        this.D0 = true;
        ly0 ly0Var = (ly0) n();
        ly0Var.getClass();
    }

    @Override // defpackage.pw1
    public final Context m() {
        if (super.m() == null && !this.A0) {
            return null;
        }
        e0();
        return this.z0;
    }

    @Override // defpackage.r02
    public final Object n() {
        if (this.B0 == null) {
            synchronized (this.C0) {
                try {
                    if (this.B0 == null) {
                        this.B0 = new vw1(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.B0.n();
    }

    @Override // defpackage.pw1, defpackage.a52
    public final tl5 x() {
        tl5 tl5VarX = super.x();
        ji jiVarG = ((mz0) ((d41) a11.u(d41.class, this))).g();
        return new u62((yp2) jiVarG.t, tl5VarX, (q64) jiVarG.a);
    }
}
