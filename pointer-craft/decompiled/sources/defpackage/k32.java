package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.common.internal.g;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k32 {
    public final Context g;
    public final t32 j;
    public final int l;
    public final rk4 n;
    public final fa4 r;
    public final p32 t;
    public final pj v;
    public final ck x;
    public final String y;

    public k32(Context context, rk4 rk4Var, pj pjVar, j32 j32Var) {
        jr2.q(context, "Null context is not permitted.");
        jr2.q(rk4Var, "Api must not be null.");
        jr2.q(j32Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        jr2.q(applicationContext, "The provided context did not have an application context.");
        this.g = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strY = (i < 30 || i < 30) ? null : g2.y(context);
        this.y = strY;
        this.r = i >= 31 ? new fa4((Object) context.getAttributionSource(), (byte) 4) : null;
        this.n = rk4Var;
        this.v = pjVar;
        this.x = new ck(rk4Var, pjVar, strY);
        p32 p32VarR = p32.r(applicationContext);
        this.t = p32VarR;
        this.l = p32VarR.j.getAndIncrement();
        this.j = j32Var.g;
        uv5 uv5Var = p32VarR.w;
        uv5Var.sendMessage(uv5Var.obtainMessage(7, this));
    }

    public final q70 g() {
        q70 q70Var = new q70((byte) 3, false);
        Set set = Collections.EMPTY_SET;
        or orVar = (or) q70Var.t;
        if (orVar == null) {
            orVar = new or(0);
            q70Var.t = orVar;
        }
        orVar.addAll(set);
        Context context = this.g;
        q70Var.m = context.getClass().getName();
        q70Var.a = context.getPackageName();
        return q70Var;
    }

    public final nj6 y(int i, w25 w25Var) {
        wu5 wu5Var;
        boolean z;
        x25 x25Var = new x25();
        t32 t32Var = this.j;
        p32 p32Var = this.t;
        p32Var.getClass();
        short s = w25Var.r;
        if (s != 0) {
            ck ckVar = this.x;
            if (p32Var.n()) {
                ga4 ga4Var = (ga4) fa4.B().t;
                if (ga4Var != null) {
                    if (ga4Var.t) {
                        z = ga4Var.a;
                        su5 su5Var = (su5) p32Var.a.get(ckVar);
                        if (su5Var != null) {
                            g gVar = su5Var.n;
                            if (gVar instanceof g) {
                                if (gVar.o != null && !gVar.w()) {
                                    pq0 pq0VarG = wu5.g(su5Var, gVar, s);
                                    if (pq0VarG != null) {
                                        su5Var.c++;
                                        z = pq0VarG.a;
                                    }
                                }
                            }
                        }
                    }
                    wu5Var = null;
                } else {
                    z = true;
                }
                wu5Var = new wu5(p32Var, s, ckVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                wu5Var = null;
            }
            if (wu5Var != null) {
                nj6 nj6Var = x25Var.g;
                uv5 uv5Var = p32Var.w;
                Objects.requireNonNull(uv5Var);
                nj6Var.y(new f74(uv5Var, (byte) 1), wu5Var);
            }
        }
        av5 av5Var = new av5(new kv5(i, w25Var, x25Var, t32Var), p32Var.t.get(), this);
        uv5 uv5Var2 = p32Var.w;
        uv5Var2.sendMessage(uv5Var2.obtainMessage(4, av5Var));
        return x25Var.g;
    }
}
