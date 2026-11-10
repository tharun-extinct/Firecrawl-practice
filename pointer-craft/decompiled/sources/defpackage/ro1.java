package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ro1 {
    public static final Object a = new Object();
    public static final mr m = new mr(0);
    public final Context g;
    public final n14 j;
    public final xp2 l;
    public final lm0 n;
    public final lp1 r;
    public final CopyOnWriteArrayList t;
    public final AtomicBoolean v;
    public final AtomicBoolean x;
    public final String y;

    public ro1(Context context, String str, lp1 lp1Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.v = atomicBoolean;
        this.x = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.t = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.g = context;
        jr2.t(str);
        this.y = str;
        this.r = lp1Var;
        zu zuVar = FirebaseInitProvider.j;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM = new ji((Object) context, (Object) new q64((Object) ComponentDiscoveryService.class, (byte) 13), (byte) 4).m();
        Trace.endSection();
        Trace.beginSection("Runtime");
        yf5 yf5Var = yf5.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM);
        byte b = 1;
        arrayList.add(new fm0(new FirebaseCommonRegistrar(), b));
        arrayList.add(new fm0(new ExecutorsRegistrar(), b));
        arrayList2.add(ll0.y(context, Context.class, new Class[0]));
        arrayList2.add(ll0.y(this, ro1.class, new Class[0]));
        arrayList2.add(ll0.y(lp1Var, lp1.class, new Class[0]));
        d93 d93Var = new d93((byte) 9);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.t.get()) {
            arrayList2.add(ll0.y(zuVar, zu.class, new Class[0]));
        }
        lm0 lm0Var = new lm0(arrayList, arrayList2, d93Var);
        this.n = lm0Var;
        Trace.endSection();
        this.l = new xp2(new km0(this, context, b));
        this.j = lm0Var.v(z11.class);
        oo1 oo1Var = new oo1(this);
        g();
        if (atomicBoolean.get()) {
            kw.q.j.get();
        }
        copyOnWriteArrayList.add(oo1Var);
        Trace.endSection();
    }

    public static ro1 l(Context context, lp1 lp1Var) {
        ro1 ro1Var;
        AtomicReference atomicReference = po1.g;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = po1.g;
            if (atomicReference2.get() == null) {
                po1 po1Var = new po1();
                do {
                    if (atomicReference2.compareAndSet(null, po1Var)) {
                        kw.y(application);
                        kw.q.g(po1Var);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            mr mrVar = m;
            jr2.w("FirebaseApp name [DEFAULT] already exists!", !mrVar.containsKey("[DEFAULT]"));
            jr2.q(context, "Application context cannot be null.");
            ro1Var = new ro1(context, "[DEFAULT]", lp1Var);
            mrVar.put("[DEFAULT]", ro1Var);
        }
        ro1Var.v();
        return ro1Var;
    }

    public static ro1 r() {
        ro1 ro1Var;
        synchronized (a) {
            try {
                ro1Var = (ro1) m.get("[DEFAULT]");
                if (ro1Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + be6.r() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((z11) ro1Var.j.get()).g();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ro1Var;
    }

    public static ro1 x(Context context) {
        synchronized (a) {
            try {
                if (m.containsKey("[DEFAULT]")) {
                    return r();
                }
                lp1 lp1VarG = lp1.g(context);
                if (lp1VarG == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return l(context, lp1VarG);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ro1)) {
            return false;
        }
        ro1 ro1Var = (ro1) obj;
        ro1Var.g();
        return this.y.equals(ro1Var.y);
    }

    public final void g() {
        jr2.w("FirebaseApp was deleted", !this.x.get());
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String n() {
        StringBuilder sb = new StringBuilder();
        g();
        byte[] bytes = this.y.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        g();
        byte[] bytes2 = this.r.y.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final String toString() {
        rk4 rk4VarN = lb6.n(this);
        rk4VarN.q(this.y, "name");
        rk4VarN.q(this.r, "options");
        return rk4VarN.toString();
    }

    public final void v() {
        Context context = this.g;
        boolean zIsUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        String str = this.y;
        if (!zIsUserUnlocked) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            g();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            qo1.g(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        g();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        g();
        this.n.a("[DEFAULT]".equals(str));
        ((z11) this.j.get()).g();
    }

    public final Object y(Class cls) {
        g();
        return this.n.g(cls);
    }
}
