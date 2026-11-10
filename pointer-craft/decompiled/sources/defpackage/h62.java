package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class h62 {
    public final g62 a;
    public final Context g;
    public final ew4 j = y94.w(dq0.a);
    public volatile Class l;
    public volatile boolean n;
    public volatile e62 r;
    public boolean t;
    public volatile boolean v;
    public String x;
    public volatile x30 y;

    public h62(Context context, boolean z, rv rvVar) {
        this.g = context;
        this.a = new g62(this, rvVar, z);
    }

    public static void y(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        Log.e("HidServiceConnection", "main-thread contract violated", new IllegalStateException(du4.i(str, " must run on the main thread, was ", Thread.currentThread().getName())));
    }

    public final void g(String str) {
        if (!this.n) {
            this.x = str;
            return;
        }
        e62 e62Var = this.r;
        if (e62Var != null) {
            e62Var.g(str);
        }
    }

    public final void n() {
        y("unbind");
        if (this.v) {
            this.v = false;
            this.n = false;
            this.r = null;
            this.y = null;
            try {
                this.g.unbindService(this.a);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(ou0 ou0Var) {
        f62 f62Var;
        e62 e62Var;
        og5 og5Var = og5.g;
        if (ou0Var instanceof f62) {
            f62Var = (f62) ou0Var;
            int i = f62Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                f62Var.w = i - Integer.MIN_VALUE;
            } else {
                f62Var = new f62(this, ou0Var);
            }
        } else {
            f62Var = new f62(this, ou0Var);
        }
        Object obj = f62Var.m;
        px0 px0Var = px0.j;
        int i2 = f62Var.w;
        if (i2 != 0) {
            if (i2 == 1) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        if (this.n && (e62Var = this.r) != null) {
            f62Var.w = 1;
            if (e62Var.k(f62Var) == px0Var) {
                return px0Var;
            }
        }
        return og5Var;
    }
}
