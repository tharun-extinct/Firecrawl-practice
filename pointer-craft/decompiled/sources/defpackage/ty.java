package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import io.appground.blek.R;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ty implements vt4, n83 {
    public Object a;
    public final /* synthetic */ byte j;
    public Object m;
    public Object q;
    public Object t;

    public ty(byte b) {
        this.j = b;
        switch (b) {
            case 5:
                this.a = new ArrayDeque();
                this.m = new ArrayDeque();
                this.q = new ArrayDeque();
                break;
            default:
                this.t = new c6(10);
                this.a = new sp4(0);
                this.m = new ArrayList();
                this.q = new HashSet();
                break;
        }
    }

    public static void w(ty tyVar, i34 i34Var, i34 i34Var2, int i) {
        fa4 fa4Var;
        if ((i & 1) != 0) {
            i34Var = null;
        }
        if ((i & 4) != 0) {
            i34Var2 = null;
        }
        tyVar.getClass();
        TimeZone timeZone = ws5.g;
        boolean zIsShutdown = tyVar.l().isShutdown();
        synchronized (tyVar) {
            if (i34Var2 != null) {
                try {
                    i34Var2.t.decrementAndGet();
                    if (!((ArrayDeque) tyVar.m).remove(i34Var2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i34Var != null) {
                ((ArrayDeque) tyVar.a).add(i34Var);
                i34 i34VarJ = tyVar.j(((a92) i34Var.a.t.r).n);
                if (i34VarJ != null) {
                    i34Var.t = i34VarJ.t;
                }
            }
            if (i34Var2 != null && (zIsShutdown || ((ArrayDeque) tyVar.m).isEmpty())) {
                ((ArrayDeque) tyVar.q).isEmpty();
            }
            byte b = 13;
            if (zIsShutdown) {
                List listF0 = cj0.F0((ArrayDeque) tyVar.a);
                ((ArrayDeque) tyVar.a).clear();
                fa4Var = new fa4(listF0, b);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) tyVar.a).iterator();
                it.getClass();
                while (it.hasNext()) {
                    i34 i34Var3 = (i34) it.next();
                    if (((ArrayDeque) tyVar.m).size() >= 64) {
                        break;
                    }
                    if (i34Var3.t.get() < 5) {
                        it.remove();
                        i34Var3.t.incrementAndGet();
                        arrayList.add(i34Var3);
                        ((ArrayDeque) tyVar.m).add(i34Var3);
                    }
                }
                fa4Var = new fa4(arrayList, b);
            }
        }
        int size = ((List) fa4Var.t).size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            i34 i34Var4 = (i34) ((List) fa4Var.t).get(i2);
            if (i34Var4 == i34Var) {
                z = false;
            } else {
                i34Var4.a.m.getClass();
            }
            if (zIsShutdown) {
                i34Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                l34 l34Var = i34Var4.a;
                l34Var.j(interruptedIOException);
                i34Var4.j.a(l34Var, interruptedIOException);
            } else {
                ExecutorService executorServiceL = tyVar.l();
                i34Var4.getClass();
                l34 l34Var2 = i34Var4.a;
                l34Var2.j.g.getClass();
                try {
                    try {
                        executorServiceL.execute(i34Var4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        l34 l34Var3 = i34Var4.a;
                        l34Var3.j(interruptedIOException2);
                        i34Var4.j.a(l34Var3, interruptedIOException2);
                        ty tyVar2 = l34Var2.j.g;
                        tyVar2.getClass();
                        w(tyVar2, null, i34Var4, 3);
                    }
                } catch (Throwable th2) {
                    ty tyVar3 = l34Var2.j.g;
                    tyVar3.getClass();
                    w(tyVar3, null, i34Var4, 3);
                    throw th2;
                }
            }
        }
        if (!z || i34Var == null) {
            return;
        }
        i34Var.a.m.getClass();
    }

    @Override // defpackage.n83
    public iv4 a(byte b, boolean z) {
        ol1 ol1Var = (ol1) this.a;
        ol1Var.getClass();
        ol1Var.g(new ll1(b, z, (byte) 1));
        vi2 vi2Var = (vi2) this.m;
        vi2Var.Z(vi2Var.O());
        return m50.T(mq2.a(vi2Var), null, new ti2(vi2Var, b, z, null, (byte) 1), 3);
    }

    @Override // defpackage.vt4
    public bq4 b() {
        return (i31) this.q;
    }

    @Override // defpackage.n83
    public void c(int i, int i2) {
        vi2 vi2Var = (vi2) this.m;
        if (((ql4) this.t).w) {
            i = -i;
        }
        int i3 = i;
        int i4 = -i2;
        ol1 ol1Var = (ol1) this.a;
        ol1Var.getClass();
        ol1Var.g(new kl1(i3, i4, (byte) 0));
        m50.T(mq2.a(vi2Var), null, new ui2(vi2Var, i3, i4, null, (byte) 1), 3);
    }

    @Override // defpackage.vt4
    public hu4 g() {
        return (j31) this.m;
    }

    public void i(String str) {
        this.t = str;
    }

    public i34 j(String str) {
        Iterator it = ((ArrayDeque) this.m).iterator();
        it.getClass();
        while (it.hasNext()) {
            i34 i34Var = (i34) it.next();
            if (yf2.p(((a92) i34Var.a.t.r).n, str)) {
                return i34Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.a).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            i34 i34Var2 = (i34) it2.next();
            if (yf2.p(((a92) i34Var2.a.t.r).n, str)) {
                return i34Var2;
            }
        }
        return null;
    }

    @Override // defpackage.n83
    public void k(byte b, boolean z) {
        ol1 ol1Var = (ol1) this.a;
        ol1Var.getClass();
        ol1Var.g(new ll1(b, z, (byte) 0));
        vi2 vi2Var = (vi2) this.m;
        m50.T(mq2.a(vi2Var), null, new ti2(vi2Var, b, z, null, (byte) 0), 3);
    }

    public synchronized ExecutorService l() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = (ThreadPoolExecutor) this.t;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new vs5(ws5.y + " Dispatcher", false));
            this.t = threadPoolExecutor2;
            threadPoolExecutor = threadPoolExecutor2;
        }
        return threadPoolExecutor;
    }

    public boolean m(d4 d4Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.t).onActionItemClicked(t(d4Var), new r43((Context) this.a, (ez4) menuItem));
    }

    public void n(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            t94.v("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((sp4) this.a).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                n(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.n83
    public void p(int i, int i2) {
        ol1 ol1Var = (ol1) this.a;
        ol1Var.getClass();
        ol1Var.g(new kl1(i, i2, (byte) 1));
        vi2 vi2Var = (vi2) this.m;
        m50.T(mq2.a(vi2Var), null, new ui2(vi2Var, i, i2, null, (byte) 0), 3);
    }

    public boolean q(d4 d4Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.t;
        zy4 zy4VarT = t(d4Var);
        sp4 sp4Var = (sp4) this.q;
        Menu i53Var = (Menu) sp4Var.get(menu);
        if (i53Var == null) {
            i53Var = new i53((Context) this.a, (i43) menu);
            sp4Var.put(menu, i53Var);
        }
        return callback.onCreateActionMode(zy4VarT, i53Var);
    }

    @Override // defpackage.n83
    public void r() {
        System.currentTimeMillis();
    }

    public void s(String str) {
        this.a = str;
    }

    public zy4 t(d4 d4Var) {
        ArrayList arrayList = (ArrayList) this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zy4 zy4Var = (zy4) arrayList.get(i);
            if (zy4Var != null && zy4Var.y == d4Var) {
                return zy4Var;
            }
        }
        zy4 zy4Var2 = new zy4((Context) this.a, d4Var);
        arrayList.add(zy4Var2);
        return zy4Var2;
    }

    public String toString() {
        switch (this.j) {
            case 3:
                String string = ((Socket) this.t).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public void u(List list) {
        this.m = new ArrayList(list);
    }

    @Override // defpackage.n83
    public void v(boolean z) {
        ((vi2) this.m).o0 = z;
    }

    @Override // defpackage.n83
    public void x() {
        vi2 vi2Var = (vi2) this.m;
        if (Build.VERSION.SDK_INT >= 26) {
            if (vi2Var.X()) {
                ((bv0) this.q).j.requestPointerCapture();
            } else {
                vi2Var.S().l(Integer.valueOf(R.string.premium_message_external_mouse_support), "external_mouse_click");
            }
        }
    }

    public c20 y() {
        Collection collectionM;
        ArrayList arrayList = (ArrayList) this.m;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (!z) {
            l0.u("Details of the products must be provided.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) this.m;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                if (((z10) obj) == null) {
                    l0.u("ProductDetailsParams cannot be null.");
                    return null;
                }
            }
        }
        c20 c20Var = new c20();
        c20Var.j = z && !((z10) ((ArrayList) this.m).get(0)).g.y.optString("packageName").isEmpty();
        c20Var.t = (String) this.t;
        c20Var.a = (String) this.a;
        c20Var.m = ((a20) this.q).g();
        c20Var.w = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.m;
        if (arrayList3 != null) {
            collectionM = a06.m(arrayList3);
        } else {
            vz5 vz5Var = a06.t;
            collectionM = r06.q;
        }
        c20Var.q = collectionM;
        return c20Var;
    }

    public void z(b20 b20Var) {
        a20 a20VarG = b20.g();
        a20VarG.g = (String) b20Var.g;
        a20VarG.r = b20Var.y;
        this.q = a20VarG;
    }

    public /* synthetic */ ty(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }

    public ty(Socket socket) {
        this.j = (byte) 3;
        this.t = socket;
        this.a = new AtomicInteger();
        this.m = new j31(this);
        this.q = new i31(this);
    }

    public /* synthetic */ ty(byte b, boolean z) {
        this.j = b;
    }

    public ty(Context context, ActionMode.Callback callback) {
        this.j = (byte) 7;
        this.a = context;
        this.t = callback;
        this.m = new ArrayList();
        this.q = new sp4(0);
    }
}
