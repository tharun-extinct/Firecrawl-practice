package defpackage;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zs5 extends hu5 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte t = 0;

    public zs5(bt5 bt5Var) {
        Objects.requireNonNull(bt5Var);
        this.a = bt5Var;
    }

    @Override // defpackage.hu5
    public final void y() {
        switch (this.t) {
            case 0:
                bt5 bt5Var = (bt5) ((at5) this.a).y;
                bt5Var.y.g("unlinkToDeath", new Object[0]);
                ((zt5) bt5Var.c).r.unlinkToDeath(bt5Var.m, 0);
                bt5Var.c = null;
                bt5Var.l = false;
                return;
            default:
                bt5 bt5Var2 = (bt5) this.a;
                synchronized (bt5Var2.x) {
                    try {
                        if (bt5Var2.q.get() > 0 && bt5Var2.q.decrementAndGet() > 0) {
                            bt5Var2.y.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (bt5Var2.c != null) {
                            bt5Var2.y.g("Unbind from service.", new Object[0]);
                            bt5Var2.g.unbindService(bt5Var2.w);
                            bt5Var2.l = false;
                            bt5Var2.c = null;
                            bt5Var2.w = null;
                        }
                        HashSet hashSet = bt5Var2.v;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((x25) it.next()).r(new RemoteException(String.valueOf(bt5Var2.r).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public zs5(at5 at5Var) {
        this.a = at5Var;
    }
}
