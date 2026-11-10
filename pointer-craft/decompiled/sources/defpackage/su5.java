package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class su5 implements n32, o32 {
    public final cv5 a;
    public final /* synthetic */ p32 i;
    public boolean m;
    public final g n;
    public final int t;
    public final ck v;
    public final cd2 x;
    public final LinkedList r = new LinkedList();
    public final HashSet l = new HashSet();
    public final HashMap j = new HashMap();
    public final ArrayList q = new ArrayList();
    public kq0 w = null;
    public int c = 0;

    public su5(p32 p32Var, k32 k32Var) {
        this.i = p32Var;
        Looper looper = p32Var.w.getLooper();
        q70 q70VarG = k32Var.g();
        rr rrVar = new rr((or) q70VarG.t, (String) q70VarG.a, (String) q70VarG.m);
        g gVarT = ((mu5) k32Var.n.t).t(k32Var.g, looper, rrVar, k32Var.v, this, this);
        fa4 fa4Var = k32Var.r;
        if (fa4Var == null || !(gVarT instanceof g)) {
            String str = k32Var.y;
            if (str != null && (gVarT instanceof g)) {
                gVarT.p = str;
            }
        } else {
            gVarT.u = fa4Var;
        }
        this.n = gVarT;
        this.v = k32Var.x;
        this.x = new cd2((byte) 26);
        this.t = k32Var.l;
        if (!gVarT.c()) {
            this.a = null;
            return;
        }
        Context context = p32Var.v;
        uv5 uv5Var = p32Var.w;
        q70 q70VarG2 = k32Var.g();
        this.a = new cv5(context, uv5Var, new rr((or) q70VarG2.t, (String) q70VarG2.a, (String) q70VarG2.m));
    }

    public final void a(Status status) {
        jr2.j(this.i.w);
        t(status, null, false);
    }

    public final void b() {
        p32 p32Var = this.i;
        jr2.j(p32Var.w);
        Status status = p32.i;
        a(status);
        this.x.P(false, status);
        for (dx2 dx2Var : (dx2[]) this.j.keySet().toArray(new dx2[0])) {
            i(new lv5(null, new x25()));
        }
        q(new kq0(4, null, null));
        if (this.n.q()) {
            p32Var.w.post(new ml((Object) new ha5((Object) this, (byte) 3), (byte) 19));
        }
    }

    public final void c(kq0 kq0Var, RuntimeException runtimeException) {
        pp4 pp4Var;
        p32 p32Var = this.i;
        jr2.j(p32Var.w);
        cv5 cv5Var = this.a;
        if (cv5Var != null && (pp4Var = cv5Var.t) != null) {
            pp4Var.y();
        }
        jr2.j(this.i.w);
        this.w = null;
        SparseIntArray sparseIntArray = (SparseIntArray) p32Var.l.j;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        q(kq0Var);
        if ((this.n instanceof wv5) && kq0Var.t != 24) {
            p32Var.y = true;
            uv5 uv5Var = p32Var.w;
            uv5Var.sendMessageDelayed(uv5Var.obtainMessage(19), 300000L);
        }
        int i = kq0Var.t;
        if (i == 4) {
            a(p32.b);
            return;
        }
        if (i == 25) {
            a(p32.y(this.v, kq0Var));
            return;
        }
        LinkedList linkedList = this.r;
        if (linkedList.isEmpty()) {
            this.w = kq0Var;
            return;
        }
        if (runtimeException != null) {
            jr2.j(p32Var.w);
            t(null, runtimeException, false);
            return;
        }
        boolean z = p32Var.c;
        ck ckVar = this.v;
        if (!z) {
            a(p32.y(ckVar, kq0Var));
            return;
        }
        t(p32.y(ckVar, kq0Var), null, true);
        if (linkedList.isEmpty() || x(kq0Var) || p32Var.v(kq0Var, this.t)) {
            return;
        }
        if (kq0Var.t == 18) {
            this.m = true;
        }
        if (!this.m) {
            a(p32.y(ckVar, kq0Var));
        } else {
            uv5 uv5Var2 = p32Var.w;
            uv5Var2.sendMessageDelayed(Message.obtain(uv5Var2, 9, ckVar), 5000L);
        }
    }

    @Override // defpackage.n32
    public final void g(int i) {
        p32 p32Var = this.i;
        if (Looper.myLooper() == p32Var.w.getLooper()) {
            v(i);
        } else {
            p32Var.w.post(new xa0(this, i, (byte) 4));
        }
    }

    public final void i(zu5 zu5Var) {
        jr2.j(this.i.w);
        boolean zQ = this.n.q();
        LinkedList linkedList = this.r;
        if (zQ) {
            if (j(zu5Var)) {
                m();
                return;
            } else {
                linkedList.add(zu5Var);
                return;
            }
        }
        linkedList.add(zu5Var);
        kq0 kq0Var = this.w;
        if (kq0Var == null || kq0Var.t == 0 || kq0Var.a == null) {
            s();
        } else {
            c(kq0Var, null);
        }
    }

    public final boolean j(zu5 zu5Var) {
        if (zu5Var == null) {
            cd2 cd2Var = this.x;
            g gVar = this.n;
            zu5Var.x(cd2Var, gVar.c());
            try {
                zu5Var.l(this);
                return true;
            } catch (DeadObjectException unused) {
                g(1);
                gVar.r("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        tn1[] tn1VarArrG = zu5Var.g(this);
        tn1 tn1Var = null;
        if (tn1VarArrG != null && tn1VarArrG.length != 0) {
            tb6 tb6Var = this.n.o;
            tn1[] tn1VarArr = tb6Var == null ? null : tb6Var.t;
            if (tn1VarArr == null) {
                tn1VarArr = new tn1[0];
            }
            mr mrVar = new mr(tn1VarArr.length);
            for (tn1 tn1Var2 : tn1VarArr) {
                mrVar.put(tn1Var2.j, Long.valueOf(tn1Var2.r()));
            }
            for (tn1 tn1Var3 : tn1VarArrG) {
                Long l = (Long) mrVar.get(tn1Var3.j);
                if (l == null || l.longValue() < tn1Var3.r()) {
                    tn1Var = tn1Var3;
                    break;
                }
            }
        }
        if (tn1Var == null) {
            cd2 cd2Var2 = this.x;
            g gVar2 = this.n;
            zu5Var.x(cd2Var2, gVar2.c());
            try {
                zu5Var.l(this);
                return true;
            } catch (DeadObjectException unused2) {
                g(1);
                gVar2.r("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.n.getClass().getName();
        String str = tn1Var.j;
        long jR = tn1Var.r();
        StringBuilder sb = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jR).length() + 2);
        du4.B(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jR);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        p32 p32Var = this.i;
        if (!p32Var.c || !zu5Var.y(this)) {
            zu5Var.v(new mh5(tn1Var));
            return true;
        }
        int iR = zu5Var.r(this);
        tu5 tu5Var = new tu5(this.v, tn1Var);
        ArrayList arrayList = this.q;
        int iIndexOf = arrayList.indexOf(tu5Var);
        if (iIndexOf >= 0) {
            tu5 tu5Var2 = (tu5) arrayList.get(iIndexOf);
            p32Var.w.removeMessages(15, tu5Var2);
            p32Var.w.sendMessageDelayed(Message.obtain(p32Var.w, 15, tu5Var2), 5000L);
        } else {
            arrayList.add(tu5Var);
            p32Var.w.sendMessageDelayed(Message.obtain(p32Var.w, 15, tu5Var), 5000L);
            p32Var.w.sendMessageDelayed(Message.obtain(p32Var.w, 16, tu5Var), 120000L);
            kq0 kq0Var = new kq0(1, 2, null, null, Integer.valueOf(iR));
            if (x(kq0Var)) {
                String str2 = tn1Var.j;
                long jR2 = tn1Var.r();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jR2).length());
                sb2.append("A dialog should be displayed for missing feature: ");
                sb2.append(str2);
                sb2.append(", version: ");
                sb2.append(jR2);
                Log.w("GoogleApiManager", sb2.toString());
            } else if (p32Var.v(kq0Var, this.t)) {
                String str3 = tn1Var.j;
                long jR3 = tn1Var.r();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jR3).length());
                sb3.append("Notification displayed for missing feature: ");
                sb3.append(str3);
                sb3.append(", version: ");
                sb3.append(jR3);
                Log.w("GoogleApiManager", sb3.toString());
            }
        }
        return false;
    }

    public final void l() {
        LinkedList linkedList = this.r;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zu5 zu5Var = (zu5) arrayList.get(i);
            if (!this.n.q()) {
                return;
            }
            if (j(zu5Var)) {
                linkedList.remove(zu5Var);
            }
        }
    }

    public final void m() {
        p32 p32Var = this.i;
        uv5 uv5Var = p32Var.w;
        ck ckVar = this.v;
        uv5Var.removeMessages(12, ckVar);
        uv5 uv5Var2 = p32Var.w;
        uv5Var2.sendMessageDelayed(uv5Var2.obtainMessage(12, ckVar), p32Var.g);
    }

    @Override // defpackage.n32
    public final void n() {
        p32 p32Var = this.i;
        if (Looper.myLooper() == p32Var.w.getLooper()) {
            r();
        } else {
            p32Var.w.post(new ml((Object) this, (byte) 18));
        }
    }

    public final void q(kq0 kq0Var) {
        HashSet hashSet = this.l;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            uo1.B();
            return;
        }
        if (lb6.g(kq0Var, kq0.w)) {
            g gVar = this.n;
            if (!gVar.q() || gVar.y == null) {
                t94.v("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final void r() {
        p32 p32Var = this.i;
        jr2.j(p32Var.w);
        this.w = null;
        q(kq0.w);
        if (this.m) {
            uv5 uv5Var = p32Var.w;
            ck ckVar = this.v;
            uv5Var.removeMessages(11, ckVar);
            p32Var.w.removeMessages(9, ckVar);
            this.m = false;
        }
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        l();
        m();
    }

    public final void s() {
        p32 p32Var = this.i;
        jr2.j(p32Var.w);
        g gVar = this.n;
        if (gVar.q() || gVar.w()) {
            return;
        }
        try {
            int iC = p32Var.l.c(p32Var.v, gVar);
            if (iC != 0) {
                kq0 kq0Var = new kq0(iC, null, null);
                String name = gVar.getClass().getName();
                String string = kq0Var.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                c(kq0Var, null);
                return;
            }
            c20 c20Var = new c20();
            Objects.requireNonNull(p32Var);
            c20Var.w = p32Var;
            c20Var.m = null;
            c20Var.q = null;
            c20Var.j = false;
            c20Var.t = gVar;
            c20Var.a = this.v;
            if (gVar.c()) {
                cv5 cv5Var = this.a;
                jr2.m(cv5Var);
                pp4 pp4Var = cv5Var.t;
                if (pp4Var != null) {
                    pp4Var.y();
                }
                rr rrVar = cv5Var.j;
                rrVar.l = Integer.valueOf(System.identityHashCode(cv5Var));
                mu5 mu5Var = cv5Var.x;
                Context context = cv5Var.n;
                Handler handler = cv5Var.v;
                cv5Var.t = (pp4) mu5Var.t(context, handler.getLooper(), rrVar, (qp4) rrVar.x, cv5Var, cv5Var);
                cv5Var.a = c20Var;
                Set set = cv5Var.l;
                if (set == null || set.isEmpty()) {
                    handler.post(new ml(cv5Var));
                } else {
                    pp4 pp4Var2 = cv5Var.t;
                    pp4Var2.getClass();
                    pp4Var2.t = new v92(pp4Var2);
                    pp4Var2.b(2, null);
                }
            }
            try {
                gVar.t = c20Var;
                gVar.b(2, null);
            } catch (SecurityException e) {
                c(new kq0(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            c(new kq0(10, null, null), e2);
        }
    }

    public final void t(Status status, Exception exc, boolean z) {
        jr2.j(this.i.w);
        if ((status == null) == (exc == null)) {
            l0.u("Status XOR exception should be null");
            return;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            zu5 zu5Var = (zu5) it.next();
            if (!z || zu5Var.g == 2) {
                if (status != null) {
                    zu5Var.n(status);
                } else {
                    zu5Var.v(exc);
                }
                it.remove();
            }
        }
    }

    public final void v(int i) {
        jr2.j(this.i.w);
        this.w = null;
        this.m = true;
        String str = this.n.g;
        cd2 cd2Var = this.x;
        cd2Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        cd2Var.P(true, new Status(20, sb.toString(), null, null));
        ck ckVar = this.v;
        p32 p32Var = this.i;
        uv5 uv5Var = p32Var.w;
        uv5Var.sendMessageDelayed(Message.obtain(uv5Var, 9, ckVar), 5000L);
        uv5 uv5Var2 = p32Var.w;
        uv5Var2.sendMessageDelayed(Message.obtain(uv5Var2, 11, ckVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) p32Var.l.j;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            ((bv5) it.next()).getClass();
            throw null;
        }
    }

    public final void w(kq0 kq0Var) {
        jr2.j(this.i.w);
        g gVar = this.n;
        String name = gVar.getClass().getName();
        String strValueOf = String.valueOf(kq0Var);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        gVar.r(sb.toString());
        c(kq0Var, null);
    }

    public final boolean x(kq0 kq0Var) {
        synchronized (p32.s) {
            this.i.getClass();
        }
        return false;
    }

    @Override // defpackage.o32
    public final void y(kq0 kq0Var) {
        c(kq0Var, null);
    }
}
