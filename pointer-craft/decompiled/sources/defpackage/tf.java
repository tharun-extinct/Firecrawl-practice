package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tf implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ tf(xy1 xy1Var, byte b) {
        this.j = b;
        this.t = xy1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                Object tag = ((View) obj).getTag(R.id.binding_reference);
                tag.getClass();
                xy1Var.a((ik5) tag);
                return og5Var;
            case 1:
                r4 r4Var = (r4) obj;
                r4Var.getClass();
                if (r4Var.j == -1 && Build.VERSION.SDK_INT >= 26) {
                    Intent intent = r4Var.t;
                    BluetoothDevice bluetoothDevice = intent != null ? (BluetoothDevice) intent.getParcelableExtra("android.companion.extra.DEVICE") : null;
                    if (bluetoothDevice != null) {
                        xy1Var.a(bluetoothDevice);
                    }
                }
                return og5Var;
            case 2:
                ((String) obj).getClass();
                xy1Var.a(Boolean.FALSE);
                return og5Var;
            case 3:
                hd5 hd5Var = (hd5) obj;
                if (hd5Var instanceof i12) {
                    return Boolean.valueOf(((Boolean) xy1Var.a(((i12) hd5Var).o)).booleanValue());
                }
                l0.z("Node is not a GestureNode instance");
                return null;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    xy1Var.a(k63.a);
                } else {
                    xy1Var.a(k63.t);
                }
                return og5Var;
            case 5:
                bv0 bv0Var = (bv0) obj;
                bv0Var.getClass();
                xy1Var.a(bv0Var);
                return og5Var;
            default:
                if (((xt1) obj).y()) {
                    xy1Var.a(Boolean.TRUE);
                }
                return og5Var;
        }
    }
}
