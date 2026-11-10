package defpackage;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sd implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public sd(nm1 nm1Var, boolean z, ob3 ob3Var) {
        this.j = (byte) 4;
        this.t = nm1Var;
        this.a = ob3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        h44 h44Var;
        zL = false;
        zL = false;
        zL = false;
        zL = false;
        zL = false;
        boolean zL = false;
        z = false;
        z = false;
        boolean z = false;
        switch (this.j) {
            case 0:
                dd2 dd2Var = (dd2) this.t;
                synchronized (dd2Var.r) {
                    try {
                        dd2Var.v = true;
                        rb3 rb3Var = dd2Var.n;
                        Object[] objArr = rb3Var.j;
                        int i = rb3Var.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            ci3 ci3Var = (ci3) ((dn5) objArr[i2]).get();
                            if (ci3Var != null && (h44Var = ci3Var.y) != null) {
                                h44Var.closeConnection();
                                ci3Var.y = null;
                            }
                        }
                        dd2Var.n.j();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                v65 v65Var = ((td) this.a).t;
                v65Var.y.set(null);
                v65Var.g.l();
                return og5.g;
            case 1:
                ((Choreographer) ((qf) this.t).t).removeFrameCallback((pf) this.a);
                return og5.g;
            case 2:
                KeyEvent keyEvent = ((ki2) obj).g;
                if (((mt2) this.t).g() == r42.t && keyEvent.getKeyCode() == 4 && mx5.n(keyEvent) == 1) {
                    ((b65) this.a).n(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((wm0) this.t).a(((List) this.a).get(((Number) obj).intValue()));
            case 4:
                KeyEvent keyEvent2 = ((ki2) obj).g;
                ob3 ob3Var = (ob3) this.a;
                nm1 nm1Var = (nm1) this.t;
                if (mx5.n(keyEvent2) == 1) {
                    long jR = mx5.r(keyEvent2);
                    int i3 = fi2.Q;
                    if (((fi2.g(jR, fi2.j) || fi2.g(jR, fi2.z) || fi2.g(jR, fi2.G)) ? 1 : 0) != 0 || fi2.g(vx5.n(keyEvent2.getKeyCode()), fi2.u)) {
                        nm1Var.g();
                    }
                }
                Boolean bool = Boolean.FALSE;
                ob3Var.setValue(bool);
                return bool;
            case 5:
                return ((m92) this.t).a(((List) this.a).get(((Number) obj).intValue()));
            case 6:
                ok2 ok2Var = (ok2) this.t;
                Object obj2 = ok2Var.y;
                ib0 ib0Var = (ib0) this.a;
                synchronized (obj2) {
                    ((ArrayList) ok2Var.r).remove(ib0Var);
                }
                return og5.g;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                return ((vq0) this.t).l(Integer.valueOf(iIntValue), ((List) this.a).get(iIntValue));
            case 8:
                ((Boolean) obj).booleanValue();
                ((xy1) this.t).a((String) this.a);
                return og5.g;
            default:
                KeyEvent keyEvent3 = ((ki2) obj).g;
                lt1 lt1Var = (lt1) this.t;
                InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && mx5.n(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (ai6.n(19, keyEvent3)) {
                        zL = ((nt1) lt1Var).l(5, true);
                    } else if (ai6.n(20, keyEvent3)) {
                        zL = ((nt1) lt1Var).l(6, true);
                    } else if (ai6.n(21, keyEvent3)) {
                        zL = ((nt1) lt1Var).l(3, true);
                    } else if (ai6.n(22, keyEvent3)) {
                        zL = ((nt1) lt1Var).l(4, true);
                    } else if (ai6.n(23, keyEvent3)) {
                        yt4 yt4Var = ((mt2) this.a).r;
                        if (yt4Var != null) {
                            ((z41) yt4Var).y();
                        }
                        zL = true;
                    }
                }
                return Boolean.valueOf(zL);
        }
    }

    public /* synthetic */ sd(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
