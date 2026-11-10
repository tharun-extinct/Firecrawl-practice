package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iu5 implements IBinder.DeathRecipient {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ iu5(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        byte b = this.g;
        int i = 0;
        Object obj = this.y;
        switch (b) {
            case 0:
                bt5 bt5Var = (bt5) obj;
                fu5 fu5Var = bt5Var.y;
                fu5Var.g("reportBinderDeath", new Object[0]);
                if (bt5Var.a.get() != null) {
                    uo1.B();
                    return;
                }
                fu5Var.g("%s : Binder has died.", bt5Var.r);
                ArrayList arrayList = bt5Var.n;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((hu5) obj2).g(new RemoteException(String.valueOf(bt5Var.r).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (bt5Var.x) {
                    HashSet hashSet = bt5Var.v;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((x25) it.next()).r(new RemoteException(String.valueOf(bt5Var.r).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
            default:
                jj6 jj6Var = (jj6) obj;
                jj6Var.y.n("reportBinderDeath", new Object[0]);
                if (jj6Var.t.get() != null) {
                    uo1.B();
                    return;
                }
                jj6Var.y.n("%s : Binder has died.", jj6Var.r);
                ArrayList arrayList2 = jj6Var.n;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(jj6Var.r).concat(" : Binder has died."));
                    x25 x25Var = ((wb6) obj3).j;
                    if (x25Var != null) {
                        x25Var.r(remoteException);
                    }
                }
                jj6Var.n.clear();
                synchronized (jj6Var.x) {
                    jj6Var.r();
                    break;
                }
                return;
        }
    }
}
