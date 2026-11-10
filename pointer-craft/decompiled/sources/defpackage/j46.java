package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class j46 implements ServiceConnection {
    public final int g;
    public final /* synthetic */ g y;

    public j46(g gVar, int i) {
        this.y = gVar;
        this.g = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte b;
        int i;
        g gVar = this.y;
        if (iBinder == null) {
            synchronized (gVar.x) {
                b = gVar.w;
            }
            if (b == 3) {
                gVar.h = true;
                i = 5;
            } else {
                i = 4;
            }
            ly5 ly5Var = gVar.v;
            ly5Var.sendMessage(ly5Var.obtainMessage(i, gVar.f.get(), 16));
            return;
        }
        synchronized (gVar.l) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                gVar.j = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jw5)) ? new jw5(iBinder) : (jw5) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar2 = this.y;
        int i2 = this.g;
        j76 j76Var = new j76(gVar2, 0, null);
        ly5 ly5Var2 = gVar2.v;
        ly5Var2.sendMessage(ly5Var2.obtainMessage(7, i2, -1, j76Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar = this.y;
        synchronized (gVar.l) {
            gVar.j = null;
        }
        g gVar2 = this.y;
        int i = this.g;
        ly5 ly5Var = gVar2.v;
        ly5Var.sendMessage(ly5Var.obtainMessage(6, i, 1));
    }
}
