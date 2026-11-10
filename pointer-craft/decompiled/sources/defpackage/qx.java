package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.Editable;
import android.view.textclassifier.TextClassifier;
import android.widget.PopupWindow;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes2.dex */
public final class qx extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx(Object obj, mu0 mu0Var, byte b) {
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
                return new qx((gy) obj2, mu0Var, (byte) 0);
            case 1:
                return new qx((TextInputEditText) obj2, mu0Var, (byte) 1);
            case 2:
                return new qx((ya5) obj2, mu0Var, (byte) 2);
            case 3:
                return new qx((w10) obj2, mu0Var, (byte) 3);
            case 4:
                return new qx((q81) obj2, mu0Var, (byte) 4);
            case 5:
                return new qx((og2) obj2, mu0Var, (byte) 5);
            case 6:
                return new qx((yl0) obj2, mu0Var, (byte) 6);
            case 7:
                return new qx((xl2) obj2, mu0Var, (byte) 7);
            case 8:
                return new qx((b30) obj2, mu0Var, (byte) 8);
            default:
                return new qx((rt3) obj2, mu0Var, (byte) 9);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                return ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 3:
                return ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 4:
                return ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                ((qx) b((mu0) obj2, (gr1) obj)).u(og5Var);
                return og5Var;
            case 6:
                ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 7:
                ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 8:
                ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            default:
                return ((qx) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object g84Var;
        fu3 fu3Var;
        Object g84Var2;
        Object g84Var3;
        String name;
        byte b = this.q;
        boolean z = false;
        og5 og5Var = og5.g;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                vl vlVar = ((gy) obj2).k0;
                if (vlVar == null) {
                    yf2.Y("popupWindowManager");
                    throw null;
                }
                iv4 iv4Var = (iv4) vlVar.v;
                if (iv4Var != null) {
                    iv4Var.x(null);
                }
                ((PopupWindow) vlVar.r).dismiss();
                StringBuffer stringBuffer = (StringBuffer) vlVar.n;
                stringBuffer.delete(0, stringBuffer.length());
                return og5Var;
            case 1:
                js2.o(obj);
                Editable text = ((TextInputEditText) obj2).getText();
                if (text == null) {
                    return null;
                }
                text.clear();
                return og5Var;
            case 2:
                js2.o(obj);
                ((ya5) obj2).dismiss();
                return og5Var;
            case 3:
                js2.o(obj);
                w10 w10Var = (w10) obj2;
                w10Var.getClass();
                Application application = w10Var.j;
                try {
                    g84Var = application.getPackageManager().getApplicationInfo("com.android.vending", 0);
                    break;
                } catch (Throwable th) {
                    g84Var = new g84(th);
                }
                boolean z2 = g84Var instanceof g84;
                Object obj3 = g84Var;
                if (z2) {
                    obj3 = null;
                }
                ApplicationInfo applicationInfo = (ApplicationInfo) obj3;
                if (applicationInfo == null) {
                    fu3Var = fu3.a;
                } else {
                    fu3Var = applicationInfo.enabled ? fu3.j : fu3.t;
                }
                try {
                    g84Var2 = Long.valueOf(application.getPackageManager().getPackageInfo("com.android.vending", 0).lastUpdateTime);
                    break;
                } catch (Throwable th2) {
                    g84Var2 = new g84(th2);
                }
                boolean z3 = g84Var2 instanceof g84;
                Object obj4 = g84Var2;
                if (z3) {
                    obj4 = null;
                }
                Long l = (Long) obj4;
                if (l != null) {
                    if (System.currentTimeMillis() - l.longValue() < 3600000) {
                        z = true;
                    }
                }
                PackageManager packageManager = application.getPackageManager();
                try {
                    g84Var3 = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(application.getPackageName()).getInstallingPackageName() : packageManager.getInstallerPackageName(application.getPackageName());
                    break;
                } catch (Throwable th3) {
                    g84Var3 = new g84(th3);
                }
                return new r00(fu3Var, z, yf2.p((String) (g84Var3 instanceof g84 ? null : g84Var3), "com.android.vending"));
            case 4:
                js2.o(obj);
                try {
                    BluetoothManager bluetoothManager = (BluetoothManager) ((q81) obj2).n.getValue();
                    BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                    return (adapter == null || (name = adapter.getName()) == null) ? "???" : name;
                } catch (SecurityException unused) {
                }
                break;
            case 5:
                js2.o(obj);
                ((og2) obj2).v.incrementAndGet();
                return og5Var;
            case 6:
                js2.o(obj);
                kq2.U((yl0) obj2);
                return og5Var;
            case 7:
                js2.o(obj);
                xl2 xl2Var = (xl2) obj2;
                tg1 tg1Var = xl2Var.r;
                byte[] bArr = xl2Var.l;
                tg1Var.getClass();
                q04 q04VarN = bArr != null ? eg6.n(bArr) : null;
                if (q04VarN != null) {
                    xl2Var.j(q04VarN);
                }
                return og5Var;
            case 8:
                js2.o(obj);
                ((b30) obj2).x();
                return og5Var;
            default:
                js2.o(obj);
                rt3 rt3Var = (rt3) obj2;
                TextClassifier textClassifierR = ym.r(rt3Var.y, rt3Var.r);
                rt3Var.x = textClassifierR;
                return textClassifierR;
        }
    }
}
