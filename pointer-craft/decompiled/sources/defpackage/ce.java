package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ce implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ ce(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ql4 ql4Var;
        String str;
        String str2;
        switch (this.j) {
            case 0:
                ts3.m((ts3) obj, (us3) this.t, 0, 0);
                return og5.g;
            case 1:
                ts3 ts3Var = (ts3) obj;
                ArrayList arrayList = (ArrayList) this.t;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        ts3.m(ts3Var, (us3) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return og5.g;
            case 2:
                ((ez3) this.t).z(null);
                return og5.g;
            case 3:
                KeyEvent keyEvent = ((ki2) obj).g;
                keyEvent.getClass();
                Log.d("ControlLayout", "handleDeviceKeys: event: ".concat("KeyEvent(nativeKeyEvent=" + keyEvent + ")"));
                sv0 sv0Var = (sv0) this.t;
                sv0Var.getClass();
                long jN = vx5.n(keyEvent.getKeyCode());
                mu0 mu0Var = null;
                if (fi2.g(jN, fi2.t)) {
                    ql4 ql4Var2 = sv0Var.n;
                    if (ql4Var2 != null) {
                        str = ql4Var2.C;
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                } else if (!fi2.g(jN, fi2.a) || (ql4Var = sv0Var.n) == null) {
                    str2 = null;
                } else {
                    str = ql4Var.D;
                    str2 = str;
                }
                if (str2 != null) {
                    m50.T(sv0Var.g, null, new ux(str2, sv0Var, mx5.n(keyEvent) == 2, mu0Var, (byte) 1), 3);
                    return Boolean.TRUE;
                }
                int iN = mx5.n(keyEvent);
                if (iN == 2) {
                    Log.d("ControlLayout", "handleDeviceKeys: KeyDown: ".concat("Key code: " + vx5.n(keyEvent.getKeyCode())));
                } else if (iN == 1) {
                    Log.d("ControlLayout", "handleDeviceKeys: KeyUp: ".concat("Key code: " + vx5.n(keyEvent.getKeyCode())));
                } else if (iN == 0) {
                    Log.d("ControlLayout", "handleDeviceKeys: Unknown: ".concat("Key code: " + vx5.n(keyEvent.getKeyCode())));
                }
                return Boolean.FALSE;
            case 4:
                af2 af2Var = (af2) this.t;
                synchronized (af2Var.m) {
                    af2Var.q = (byte) 5;
                    af2Var.c = null;
                }
                return og5.g;
            case 5:
                return ((xy1) this.t).a(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 6:
                Object obj2 = ((Object[]) this.t)[((Number) obj).intValue()];
                return null;
            case 7:
                Throwable th = (Throwable) obj;
                f05 f05Var = (f05) this.t;
                ib0 ib0Var = f05Var.a;
                if (ib0Var != null) {
                    ib0Var.s(th);
                }
                f05Var.a = null;
                return og5.g;
            default:
                float[] fArr = ((l33) obj).g;
                bl2 bl2Var = (bl2) this.t;
                if (bl2Var.W()) {
                    m50.K(bl2Var).D(bl2Var, fArr);
                }
                return og5.g;
        }
    }
}
