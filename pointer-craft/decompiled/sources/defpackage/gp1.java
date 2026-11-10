package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gp1 implements hp1 {
    public static final Object q = new Object();
    public final HashSet a;
    public final ro1 g;
    public final ik4 j;
    public final ExecutorService l;
    public final ArrayList m;
    public final gi5 n;
    public final ji r;
    public String t;
    public final xp2 v;
    public final Object x;
    public final ep1 y;

    static {
        new AtomicInteger(1);
    }

    public gp1(ro1 ro1Var, n14 n14Var, ExecutorService executorService, ik4 ik4Var) {
        ro1Var.g();
        ep1 ep1Var = new ep1(ro1Var.g, n14Var);
        ji jiVar = new ji(ro1Var, (byte) 21);
        hi0 hi0Var = hi0.F;
        if (hi0Var == null) {
            hi0Var = new hi0((byte) 17);
            hi0.F = hi0Var;
        }
        gi5 gi5Var = gi5.y;
        if (gi5Var == null) {
            gi5Var = new gi5(hi0Var);
            gi5.y = gi5Var;
        }
        xp2 xp2Var = new xp2(new fm0(ro1Var, (byte) 2));
        this.x = new Object();
        this.a = new HashSet();
        this.m = new ArrayList();
        this.g = ro1Var;
        this.y = ep1Var;
        this.r = jiVar;
        this.n = gi5Var;
        this.v = xp2Var;
        this.l = executorService;
        this.j = ik4Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x0029, B:13:0x003c, B:17:0x0057, B:11:0x0036, B:14:0x0041, B:16:0x0053), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x0029, B:13:0x003c, B:17:0x0057, B:11:0x0036, B:14:0x0041, B:16:0x0053), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x0029, B:13:0x003c, B:17:0x0057, B:11:0x0036, B:14:0x0041, B:16:0x0053), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x0029, B:13:0x003c, B:17:0x0057, B:11:0x0036, B:14:0x0041, B:16:0x0053), top: B:33:0x000e, outer: #1 }] */
    public final void g() {
        wu wuVarS;
        String strG;
        synchronized (q) {
            try {
                ro1 ro1Var = this.g;
                ro1Var.g();
                cd2 cd2VarY = cd2.y(ro1Var.g);
                try {
                    wuVarS = this.r.S();
                    if (wuVarS.a()) {
                        ro1 ro1Var2 = this.g;
                        ro1Var2.g();
                        if (!ro1Var2.y.equals("CHIME_ANDROID_SDK")) {
                            ro1Var2.g();
                            if (!"[DEFAULT]".equals(ro1Var2.y)) {
                                strG = x24.g();
                            } else if (wuVarS.w()) {
                                strG = ((z92) this.v.get()).g();
                                if (TextUtils.isEmpty(strG)) {
                                    strG = x24.g();
                                }
                            } else {
                                strG = x24.g();
                            }
                        } else if (wuVarS.w()) {
                            strG = x24.g();
                        } else {
                            strG = ((z92) this.v.get()).g();
                            if (TextUtils.isEmpty(strG)) {
                                strG = x24.g();
                            }
                        }
                        ji jiVar = this.r;
                        wuVarS = wuVarS.u(strG);
                        jiVar.I(wuVarS);
                    }
                    if (cd2VarY != null) {
                        cd2VarY.G();
                    }
                } catch (Throwable th) {
                    if (cd2VarY != null) {
                        cd2VarY.G();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j(wuVarS);
        this.j.execute(new fp1(this, (byte) 2));
    }

    public final void j(wu wuVar) {
        synchronized (this.x) {
            try {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    if (((mw4) it.next()).y(wuVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Exception exc) {
        synchronized (this.x) {
            try {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    if (((mw4) it.next()).g(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final nj6 n() {
        v();
        x25 x25Var = new x25();
        m12 m12Var = new m12(this.n, x25Var);
        synchronized (this.x) {
            this.m.add(m12Var);
        }
        nj6 nj6Var = x25Var.g;
        this.l.execute(new fp1(this, (byte) 1));
        return nj6Var;
    }

    public final nj6 r() {
        String str;
        v();
        synchronized (this) {
            str = this.t;
        }
        if (str != null) {
            return br2.s(str);
        }
        x25 x25Var = new x25();
        n12 n12Var = new n12(x25Var);
        synchronized (this.x) {
            this.m.add(n12Var);
        }
        nj6 nj6Var = x25Var.g;
        this.l.execute(new fp1(this, (byte) 0));
        return nj6Var;
    }

    public final void v() {
        ro1 ro1Var = this.g;
        ro1Var.g();
        jr2.a(ro1Var.r.y, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ro1Var.g();
        jr2.a(ro1Var.r.j, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ro1Var.g();
        jr2.a(ro1Var.r.g, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ro1Var.g();
        String str = ro1Var.r.y;
        Pattern pattern = gi5.g;
        jr2.l("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        ro1Var.g();
        jr2.l("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", gi5.g.matcher(ro1Var.r.g).matches());
    }

    public final wu x(wu wuVar) {
        HttpURLConnection httpURLConnectionR;
        nu nuVarV;
        String strY = (wuVar.n() == null || wuVar.n().length() != 11) ? null : ((z92) this.v.get()).y();
        ro1 ro1Var = this.g;
        ro1Var.g();
        String str = ro1Var.r.g;
        String strN = wuVar.n();
        ro1Var.g();
        String str2 = ro1Var.r.j;
        ro1Var.g();
        String str3 = ro1Var.r.y;
        ep1 ep1Var = this.y;
        g74 g74Var = ep1Var.r;
        if (!g74Var.g()) {
            throw new ip1("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlG = ep1.g("projects/" + str2 + "/installations");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new ip1("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            httpURLConnectionR = ep1Var.r(urlG, str);
            try {
                try {
                    httpURLConnectionR.setRequestMethod("POST");
                    httpURLConnectionR.setDoOutput(true);
                    if (strY != null) {
                        httpURLConnectionR.addRequestProperty("x-goog-fis-android-iid-migration-auth", strY);
                    }
                    ep1.l(httpURLConnectionR, strN, str3);
                    int responseCode = httpURLConnectionR.getResponseCode();
                    g74Var.y(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        nuVarV = ep1.v(httpURLConnectionR);
                        break;
                    }
                    ep1.y(httpURLConnectionR, str3, str, str2);
                    if (responseCode == 429) {
                        throw new ip1("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        mu muVarG = nu.g();
                        muVarG.v(2);
                        nuVarV = muVarG.g();
                        break;
                    }
                    httpURLConnectionR.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionR.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionR.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iD = du4.D(nuVarV.v());
        if (iD == 0) {
            return wuVar.p(nuVarV.r(), nuVarV.n(), System.currentTimeMillis() / 1000, nuVarV.y().r(), nuVarV.y().n());
        }
        if (iD == 1) {
            return wuVar.b();
        }
        throw new ip1("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final wu y(wu wuVar) {
        HttpURLConnection httpURLConnectionR;
        bv bvVarX;
        ep1 ep1Var = this.y;
        ro1 ro1Var = this.g;
        ro1Var.g();
        String str = ro1Var.r.g;
        String strN = wuVar.n();
        ro1 ro1Var2 = this.g;
        ro1Var2.g();
        String str2 = ro1Var2.r.j;
        String strX = wuVar.x();
        g74 g74Var = ep1Var.r;
        if (!g74Var.g()) {
            throw new ip1("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlG = ep1.g("projects/" + str2 + "/installations/" + strN + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new ip1("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionR = ep1Var.r(urlG, str);
            try {
                try {
                    httpURLConnectionR.setRequestMethod("POST");
                    httpURLConnectionR.addRequestProperty("Authorization", "FIS_v2 " + strX);
                    httpURLConnectionR.setDoOutput(true);
                    ep1.j(httpURLConnectionR);
                    int responseCode = httpURLConnectionR.getResponseCode();
                    g74Var.y(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bvVarX = ep1.x(httpURLConnectionR);
                        break;
                    }
                    ep1.y(httpURLConnectionR, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        av avVarG = bv.g();
                        avVarG.y(3);
                        bvVarX = avVarG.g();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new ip1("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        av avVarG2 = bv.g();
                        avVarG2.y(2);
                        bvVarX = avVarG2.g();
                        break;
                    }
                    httpURLConnectionR.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionR.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionR.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iD = du4.D(bvVarX.y());
        if (iD == 0) {
            return wuVar.i(bvVarX.n(), System.currentTimeMillis() / 1000, bvVarX.r());
        }
        if (iD == 1) {
            return wuVar.b();
        }
        if (iD != 2) {
            throw new ip1("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.t = null;
        }
        return wuVar.s();
    }
}
