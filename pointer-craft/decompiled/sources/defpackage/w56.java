package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class w56 extends fw5 {
    public final /* synthetic */ g j;
    public final IBinder l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w56(g gVar, int i, IBinder iBinder, Bundle bundle) {
        super(gVar, i, bundle);
        this.j = gVar;
        this.l = iBinder;
    }

    @Override // defpackage.fw5
    public final boolean g() {
        IBinder iBinder = this.l;
        try {
            jr2.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.j;
            if (!gVar.t().equals(interfaceDescriptor)) {
                String strT = gVar.t();
                StringBuilder sb = new StringBuilder(strT.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strT);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceG = gVar.g(iBinder);
            if (iInterfaceG == null || !(gVar.i(2, 4, iInterfaceG) || gVar.i(3, 4, iInterfaceG))) {
                return false;
            }
            gVar.z = null;
            s25 s25Var = gVar.c;
            if (s25Var == null) {
                return true;
            }
            ((n32) s25Var.j).n();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.fw5
    public final void y(kq0 kq0Var) {
        ha5 ha5Var = this.j.i;
        if (ha5Var != null) {
            ((o32) ha5Var.t).y(kq0Var);
        }
        System.currentTimeMillis();
    }
}
