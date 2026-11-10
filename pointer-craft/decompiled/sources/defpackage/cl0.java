package defpackage;

import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class cl0 {
    public final tp3 g;
    public x03 r;
    public final o05 y;

    public cl0(Context context) {
        context.getClass();
        this.g = kq2.M(e71.g);
        this.y = new o05(new mn(context, (byte) 1));
    }

    public final CompanionDeviceManager g() {
        return a2.y(this.y.getValue());
    }

    public final void r() {
        if (Build.VERSION.SDK_INT < 26 || g() == null) {
            return;
        }
        this.g.setValue(f71.g);
        BluetoothDeviceFilter.Builder builder = new BluetoothDeviceFilter.Builder();
        builder.setNamePattern(Pattern.compile(""));
        BluetoothDeviceFilter bluetoothDeviceFilterBuild = builder.build();
        bluetoothDeviceFilterBuild.getClass();
        AssociationRequest associationRequestBuild = new AssociationRequest.Builder().addDeviceFilter(bluetoothDeviceFilterBuild).setSingleDevice(false).build();
        associationRequestBuild.getClass();
        CompanionDeviceManager companionDeviceManagerG = g();
        if (companionDeviceManagerG != null) {
            companionDeviceManagerG.associate(associationRequestBuild, new bl0(this), (Handler) null);
        }
    }

    public final g71 y() {
        return (g71) this.g.getValue();
    }
}
