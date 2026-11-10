package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ys5 extends hu5 {
    public final /* synthetic */ at5 a;
    public final /* synthetic */ IBinder t;

    public ys5(at5 at5Var, IBinder iBinder) {
        this.t = iBinder;
        this.a = at5Var;
    }

    @Override // defpackage.hu5
    public final void y() {
        cu5 zt5Var;
        bt5 bt5Var = (bt5) this.a.y;
        vg5 vg5Var = bt5Var.t;
        ArrayList arrayList = bt5Var.n;
        fu5 fu5Var = bt5Var.y;
        vg5Var.getClass();
        int i = au5.n;
        IBinder iBinder = this.t;
        if (iBinder == null) {
            zt5Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            zt5Var = iInterfaceQueryLocalInterface instanceof cu5 ? (cu5) iInterfaceQueryLocalInterface : new zt5(iBinder);
        }
        bt5Var.c = zt5Var;
        int i2 = 0;
        fu5Var.g("linkToDeath", new Object[0]);
        try {
            ((zt5) bt5Var.c).r.linkToDeath(bt5Var.m, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", fu5.r(fu5Var.g, "linkToDeath failed", objArr), e);
            }
        }
        bt5Var.l = false;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }
}
