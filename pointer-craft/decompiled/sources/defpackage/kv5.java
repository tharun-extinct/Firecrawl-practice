package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kv5 extends zu5 {
    public final t32 n;
    public final x25 r;
    public final w25 y;

    public kv5(int i, w25 w25Var, x25 x25Var, t32 t32Var) {
        super(i);
        this.r = x25Var;
        this.y = w25Var;
        this.n = t32Var;
        if (i == 2 && w25Var.y) {
            l0.u("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.zu5
    public final tn1[] g(su5 su5Var) {
        return this.y.g;
    }

    @Override // defpackage.zu5
    public final void l(su5 su5Var) throws DeadObjectException {
        x25 x25Var = this.r;
        try {
            w25 w25Var = this.y;
            ((n64) ((w25) w25Var.n).n).accept(su5Var.n, x25Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            n(zu5.j(e2));
        } catch (RuntimeException e3) {
            x25Var.r(e3);
        }
    }

    @Override // defpackage.zu5
    public final void n(Status status) {
        this.n.getClass();
        this.r.r(status.a != null ? new l74(status) : new ak(status));
    }

    @Override // defpackage.zu5
    public final int r(su5 su5Var) {
        return this.y.r;
    }

    @Override // defpackage.zu5
    public final void v(Exception exc) {
        this.r.r(exc);
    }

    @Override // defpackage.zu5
    public final void x(cd2 cd2Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) cd2Var.a;
        x25 x25Var = this.r;
        map.put(x25Var, boolValueOf);
        x25Var.g.g(new cd2(cd2Var, x25Var));
    }

    @Override // defpackage.zu5
    public final boolean y(su5 su5Var) {
        return this.y.y;
    }
}
