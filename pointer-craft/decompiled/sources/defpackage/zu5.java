package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zu5 {
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public zu5(int i) {
        this.g = i;
    }

    public static Status j(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public tn1[] g(su5 su5Var) {
        return null;
    }

    public abstract void l(su5 su5Var);

    public abstract void n(Status status);

    public int r(su5 su5Var) {
        return -1;
    }

    public abstract void v(Exception exc);

    public boolean y(su5 su5Var) {
        return false;
    }

    public /* bridge */ /* synthetic */ void x(cd2 cd2Var, boolean z) {
    }
}
