package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import io.appground.blehid.ClassicHidService;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o40(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new o40((aa3) obj2, mu0Var, (byte) 0);
            case 1:
                return new o40((ClassicHidService) obj2, mu0Var, (byte) 1);
            case 2:
                return new o40((ob3) obj2, mu0Var, (byte) 2);
            case 3:
                return new o40((String) obj2, mu0Var, (byte) 3);
            default:
                return new o40((q81) obj2, mu0Var, (byte) 4);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((o40) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
            case 1:
                ((o40) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
            case 2:
                ((o40) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
            case 3:
                return ((o40) b(mu0Var, ox0Var)).u(og5Var);
            default:
                ((o40) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                ((aa3) obj2).t();
                return og5Var;
            case 1:
                js2.o(obj);
                ClassicHidService classicHidService = (ClassicHidService) obj2;
                ju2 ju2Var = (ju2) classicHidService.j.t;
                Context applicationContext = classicHidService.getApplicationContext();
                applicationContext.getClass();
                ju2Var.g(new sg0(applicationContext, classicHidService.R));
                return og5Var;
            case 2:
                js2.o(obj);
                ((xy1) ((ob3) obj2).getValue()).a(Boolean.TRUE);
                return og5Var;
            case 3:
                js2.o(obj);
                try {
                    return sp2.b(((String) obj2).concat("&v=6.25.2"));
                } catch (IOException unused) {
                    return og5Var;
                }
            default:
                js2.o(obj);
                q81 q81Var = (q81) obj2;
                q81Var.getClass();
                ji0 ji0VarD = v70.d(q81Var);
                x21 x21Var = na1.g;
                m50.T(ji0VarD, c21.a, new zh(q81Var, null, (byte) 9), 2);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
                intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
                intentFilter.addAction("android.bluetooth.device.action.CLASS_CHANGED");
                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                intentFilter.addAction("android.bluetooth.device.action.NAME_CHANGED");
                intentFilter.addAction("android.bluetooth.device.action.UUID");
                intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST");
                intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REPLY");
                intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_CANCEL");
                intentFilter.addAction("android.bluetooth.device.action.PAIRING_CANCEL");
                q81Var.v = new t30(q81Var, (byte) 3);
                Application application = q81Var.y;
                application.getClass();
                application.registerReceiver(q81Var.v, intentFilter);
                return og5Var;
        }
    }
}
