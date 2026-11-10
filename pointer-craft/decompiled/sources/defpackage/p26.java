package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class p26 extends ot5 {
    public g n;
    public final int v;

    public p26(g gVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 2);
        this.n = gVar;
        this.v = i;
    }

    @Override // defpackage.ot5
    public final boolean x(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) h06.g(parcel, Bundle.CREATOR);
            h06.r(parcel);
            jr2.q(this.n, "onPostInitComplete can be called only once per call to getRemoteService");
            g gVar = this.n;
            int i3 = this.v;
            gVar.getClass();
            w56 w56Var = new w56(gVar, i2, strongBinder, bundle);
            ly5 ly5Var = gVar.v;
            ly5Var.sendMessage(ly5Var.obtainMessage(1, i3, -1, w56Var));
            this.n = null;
        } else if (i == 2) {
            parcel.readInt();
            h06.r(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            tb6 tb6Var = (tb6) h06.g(parcel, tb6.CREATOR);
            h06.r(parcel);
            g gVar2 = this.n;
            jr2.q(gVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            jr2.m(tb6Var);
            gVar2.o = tb6Var;
            if (gVar2 instanceof bw5) {
                pq0 pq0Var = tb6Var.m;
                fa4 fa4VarB = fa4.B();
                ga4 ga4Var = pq0Var == null ? null : pq0Var.j;
                synchronized (fa4VarB) {
                    try {
                        if (ga4Var == null) {
                            ga4Var = fa4.m;
                        } else {
                            ga4 ga4Var2 = (ga4) fa4VarB.t;
                            if (ga4Var2 == null || ga4Var2.j < ga4Var.j) {
                            }
                        }
                        fa4VarB.t = ga4Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = tb6Var.j;
            jr2.q(this.n, "onPostInitComplete can be called only once per call to getRemoteService");
            g gVar3 = this.n;
            int i5 = this.v;
            gVar3.getClass();
            w56 w56Var2 = new w56(gVar3, i4, strongBinder2, bundle2);
            ly5 ly5Var2 = gVar3.v;
            ly5Var2.sendMessage(ly5Var2.obtainMessage(1, i5, -1, w56Var2));
            this.n = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
