package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class rr {
    public final /* synthetic */ byte g;
    public Object l;
    public final Object n;
    public final Object r;
    public Object v;
    public Object x;
    public final String y;

    public rr(Set set, String str, String str2) {
        this.g = (byte) 1;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.r = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.y = str;
        this.v = str2;
        this.x = qp4.y;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.n = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            uo1.B();
            throw null;
        }
    }

    public id2 g() throws IOException {
        ys3 ys3Var = ys3.g;
        Object obj = ys3.g;
        fu0 fu0Var = obj != null ? (fu0) obj : null;
        Context contextY = fu0Var != null ? fu0Var.y() : null;
        AssetManager assets = contextY != null ? contextY.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open(this.y);
            inputStreamOpen.getClass();
            return new id2(inputStreamOpen, new m95());
        }
        if (Build.FINGERPRINT == null) {
            uo1.t("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        uo1.t("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public void r() {
        try {
            h34 h34Var = new h34(g());
            try {
                fa0 fa0VarA = h34Var.a(h34Var.w());
                fa0 fa0VarA2 = h34Var.a(h34Var.w());
                h34Var.close();
                synchronized (this) {
                    fa0VarA.getClass();
                    this.v = fa0VarA;
                    fa0VarA2.getClass();
                    this.x = fa0VarA2;
                }
                ((CountDownLatch) this.n).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gp4.C(h34Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.n).countDown();
            throw th3;
        }
    }

    public String toString() {
        switch (this.g) {
            case 2:
                bi6 bi6Var = (bi6) this.x;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append(this.y);
                sb.append(", url=");
                sb.append((a92) this.r);
                c52 c52Var = (c52) this.n;
                if (c52Var.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = c52Var.iterator();
                    int i = 0;
                    while (true) {
                        er erVar = (er) it;
                        if (erVar.hasNext()) {
                            Object next = erVar.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                pw5.R();
                                throw null;
                            }
                            fp3 fp3Var = (fp3) next;
                            String str = (String) fp3Var.j;
                            String str2 = (String) fp3Var.t;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            if (us5.m(str)) {
                                str2 = "██";
                            }
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!yf2.p(bi6Var, bi6.w)) {
                    sb.append(", tags=");
                    sb.append(bi6Var);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public cp1 y() {
        cp1 cp1Var = new cp1();
        cp1Var.g = (a92) this.r;
        cp1Var.y = this.y;
        cp1Var.n = (d74) this.v;
        cp1Var.v = (bi6) this.x;
        cp1Var.r = ec6.x((c52) this.n);
        return cp1Var;
    }

    public rr() {
        this.g = (byte) 0;
        this.r = new AtomicBoolean(false);
        this.n = new CountDownLatch(1);
        this.y = "PublicSuffixDatabase.list";
    }

    public rr(cp1 cp1Var) {
        this.g = (byte) 2;
        a92 a92Var = (a92) cp1Var.g;
        if (a92Var != null) {
            this.r = a92Var;
            this.y = (String) cp1Var.y;
            fa4 fa4Var = (fa4) cp1Var.r;
            fa4Var.getClass();
            this.n = ec6.n(fa4Var);
            this.v = (d74) cp1Var.n;
            this.x = (bi6) cp1Var.v;
            return;
        }
        l0.z("url == null");
        throw null;
    }
}
