package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class lv5 extends zu5 {
    public final x25 y;

    public lv5(dx2 dx2Var, x25 x25Var) {
        super(4);
        this.y = x25Var;
    }

    @Override // defpackage.zu5
    public final void l(su5 su5Var) throws DeadObjectException {
        try {
            t(su5Var);
        } catch (DeadObjectException e) {
            n(zu5.j(e));
            throw e;
        } catch (RemoteException e2) {
            n(zu5.j(e2));
        } catch (RuntimeException e3) {
            this.y.r(e3);
        }
    }

    @Override // defpackage.zu5
    public final void n(Status status) {
        this.y.r(new ak(status));
    }

    public final void t(su5 su5Var) {
        this.y.g.q(Boolean.FALSE);
    }

    @Override // defpackage.zu5
    public final void v(Exception exc) {
        this.y.r(exc);
    }
}
