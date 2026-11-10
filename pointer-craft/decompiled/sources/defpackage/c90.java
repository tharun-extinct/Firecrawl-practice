package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHidDevice;
import io.appground.blek.MainApp;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c90 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public c90(ox0 ox0Var, MainApp mainApp) {
        this.j = (byte) 5;
        this.t = mainApp;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        Object value;
        BluetoothDevice bluetoothDevice;
        Object objJ;
        pr1 pr1Var;
        byte b = this.j;
        mu0 mu0Var2 = null;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                ue2 ue2Var = (ue2) obj;
                st4 st4Var = (st4) obj2;
                if (ue2Var instanceof p72) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof q72) {
                    st4Var.remove(((q72) ue2Var).g());
                } else if (ue2Var instanceof gt1) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof ht1) {
                    st4Var.remove(((ht1) ue2Var).g());
                } else if (ue2Var instanceof mx3) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof nx3) {
                    st4Var.remove(((nx3) ue2Var).g());
                } else if (ue2Var instanceof lx3) {
                    st4Var.remove(((lx3) ue2Var).g());
                }
                return og5Var;
            case 1:
                yf0 yf0Var = (yf0) obj;
                ng0 ng0Var = (ng0) obj2;
                ew4 ew4Var = ng0Var.s;
                do {
                    value = ew4Var.getValue();
                    ((yf0) value).getClass();
                } while (!ew4Var.t(value, yf0Var));
                if (yf0Var.g && yf0Var.r == 0 && (bluetoothDevice = ng0Var.u) != null) {
                    ng0Var.u = null;
                    BluetoothHidDevice bluetoothHidDevice = ng0Var.b;
                    if (bluetoothHidDevice != null) {
                        bluetoothHidDevice.connect(bluetoothDevice);
                    }
                }
                return og5Var;
            case 2:
                p01 p01Var = (p01) obj2;
                return ((p01Var.j.x() instanceof lo1) || (objJ = p01Var.j(true, mu0Var)) != px0Var) ? og5Var : objJ;
            case 3:
                if (mu0Var instanceof pr1) {
                    pr1Var = (pr1) mu0Var;
                    int i = pr1Var.w;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pr1Var.w = i - Integer.MIN_VALUE;
                    } else {
                        pr1Var = new pr1(this, mu0Var);
                    }
                } else {
                    pr1Var = new pr1(this, mu0Var);
                }
                Object obj3 = pr1Var.m;
                int i2 = pr1Var.w;
                if (i2 == 0) {
                    js2.o(obj3);
                    ez3 ez3Var = (ez3) obj2;
                    Object obj4 = obj == null ? a11.o : obj;
                    pr1Var.w = 1;
                    if (ez3Var.q.r(pr1Var, obj4) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i2 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj3);
                }
                return og5Var;
            case 4:
                ((u54) obj2).j = obj;
                throw new r(this);
            case 5:
                return g(((Boolean) obj).booleanValue(), mu0Var);
            case 6:
                ((x73) obj2).a.e(((Number) obj).floatValue());
                return og5Var;
            case 7:
                String str = (String) obj;
                wm4 wm4Var = (wm4) obj2;
                h61 h61Var = wm4Var.u;
                if (h61Var != null) {
                    h61 h61VarG = !yf2.p(h61Var.y(), str) ? h61.g(h61Var, 0, 0, 0, null, 0, 0, str, 895) : null;
                    if (h61VarG != null) {
                        wm4Var.u = h61VarG;
                        m50.T(v70.d(wm4Var), null, new s12(wm4Var, h61VarG, mu0Var2, (byte) 16), 3);
                    }
                }
                return og5Var;
            default:
                Object objG = ((wn5) obj2).g((Map) obj, mu0Var);
                return objG == px0Var ? objG : og5Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (defpackage.og0.K(r8, r6, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(boolean r7, defpackage.mu0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.n03
            if (r0 == 0) goto L13
            r0 = r8
            n03 r0 = (defpackage.n03) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            n03 r0 = new n03
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.w
            int r1 = r0.i
            r2 = 2
            r3 = 1
            r4 = 0
            px0 r5 = defpackage.px0.j
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            io.appground.blek.MainApp r6 = r0.q
            ox0 r6 = (defpackage.ox0) r6
            defpackage.js2.o(r8)     // Catch: java.lang.Throwable -> L68
            goto L68
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            return r4
        L35:
            boolean r7 = r0.m
            io.appground.blek.MainApp r6 = r0.q
            defpackage.js2.o(r8)     // Catch: java.lang.Throwable -> L68
            goto L56
        L3d:
            defpackage.js2.o(r8)
            java.lang.Object r6 = r6.t
            io.appground.blek.MainApp r6 = (io.appground.blek.MainApp) r6
            vy0 r8 = new vy0     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            r0.q = r6     // Catch: java.lang.Throwable -> L68
            r0.m = r7     // Catch: java.lang.Throwable -> L68
            r0.i = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r8 = defpackage.og0.K(r8, r6, r0)     // Catch: java.lang.Throwable -> L68
            if (r8 != r5) goto L56
            goto L67
        L56:
            z93 r8 = new z93     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            r0.q = r4     // Catch: java.lang.Throwable -> L68
            r0.m = r7     // Catch: java.lang.Throwable -> L68
            r0.i = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = defpackage.og0.K(r8, r6, r0)     // Catch: java.lang.Throwable -> L68
            if (r6 != r5) goto L68
        L67:
            return r5
        L68:
            og5 r6 = defpackage.og5.g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c90.g(boolean, mu0):java.lang.Object");
    }

    public /* synthetic */ c90(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
