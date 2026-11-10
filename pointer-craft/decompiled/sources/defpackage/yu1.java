package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yu1 implements oh1 {
    public final Object a = new Object();
    public ue5 c;
    public final Context j;
    public Handler m;
    public ThreadPoolExecutor q;
    public final xu1 t;
    public ThreadPoolExecutor w;

    public yu1(Context context, xu1 xu1Var) {
        xs2.t(context, "Context cannot be null");
        this.j = context.getApplicationContext();
        this.t = xu1Var;
    }

    @Override // defpackage.oh1
    public final void g(ue5 ue5Var) {
        synchronized (this.a) {
            this.c = ue5Var;
        }
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.q;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new kp0("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.w = threadPoolExecutor2;
                    this.q = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new k(this, (byte) 4));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final tv1 r() {
        try {
            Context context = this.j;
            Object[] objArr = {this.t};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            sv1 sv1VarG = wu1.g(context, Collections.unmodifiableList(arrayList));
            boolean z = sv1VarG.g;
            if (z) {
                t94.v(du4.w(z ? 1 : 0, "fetchFonts failed (", ")"));
                return null;
            }
            tv1[] tv1VarArr = (tv1[]) ((List) sv1VarG.y).get(0);
            if (tv1VarArr != null && tv1VarArr.length != 0) {
                return tv1VarArr[0];
            }
            t94.v("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            uo1.w("provider not found", e);
            return null;
        }
    }

    public final void y() {
        synchronized (this.a) {
            try {
                this.c = null;
                Handler handler = this.m;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.m = null;
                ThreadPoolExecutor threadPoolExecutor = this.w;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.q = null;
                this.w = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
