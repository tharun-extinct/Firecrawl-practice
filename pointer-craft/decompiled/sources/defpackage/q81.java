package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes.dex */
public final class q81 extends fg {
    public final o05 n;
    public final tp3 r;
    public t30 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(Application application) {
        super(application);
        application.getClass();
        this.r = kq2.M(new p81(r71.g));
        this.n = new o05(new gf(application, (byte) 5));
    }

    public final void l(boolean z) {
        ji0 ji0VarD = v70.d(this);
        x21 x21Var = na1.g;
        m50.T(ji0VarD, c21.a, new lr0((Object) this, z, (mu0) null, (byte) 1), 2);
    }

    @Override // defpackage.pl5
    public final void n() {
        t30 t30Var = this.v;
        if (t30Var != null) {
            Application application = this.y;
            application.getClass();
            application.unregisterReceiver(t30Var);
        }
    }

    public final void v(BluetoothDevice bluetoothDevice) {
        Object g84Var;
        g61 g61VarU = gp4.U(bluetoothDevice);
        x(new p81(new s71(g61VarU)));
        int bondState = bluetoothDevice.getBondState();
        if (bondState != 10) {
            if (bondState != 12) {
                return;
            }
            x(new p81(new q71(g61VarU)));
        } else {
            try {
                g84Var = Boolean.valueOf(bluetoothDevice.createBond());
            } catch (Throwable th) {
                g84Var = new g84(th);
            }
            if (h84.g(g84Var) != null) {
                x(new p81(new t71(g61VarU, cq0.t)));
            }
        }
    }

    public final void x(p81 p81Var) {
        this.r.setValue(p81Var);
    }
}
