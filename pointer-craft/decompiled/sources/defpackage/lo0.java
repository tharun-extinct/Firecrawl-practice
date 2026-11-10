package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ mo0 j;

    public lo0(mo0 mo0Var) {
        this.j = mo0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.j.x(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        mo0 mo0Var = this.j;
        mo0Var.l.g.clear();
        q74 q74Var = mo0Var.j;
        synchronized (q74Var) {
            q74Var.g.r();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        mo0 mo0Var = this.j;
        mo0Var.l.g.clear();
        q74 q74Var = mo0Var.j;
        synchronized (q74Var) {
            q74Var.g.r();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.j.z.g.setValue(Boolean.valueOf(z));
    }
}
