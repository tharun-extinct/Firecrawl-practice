package defpackage;

import io.appground.blek.widget.ConnectDeviceActivity;
import io.appground.blek.widget.WidgetConfigurationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class w62 implements yj3 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ yl0 y;

    public /* synthetic */ w62(yl0 yl0Var, byte b) {
        this.g = b;
        this.y = yl0Var;
    }

    @Override // defpackage.yj3
    public final void g(yl0 yl0Var) {
        byte b = this.g;
        yl0 yl0Var2 = this.y;
        switch (b) {
            case 0:
                ConnectDeviceActivity connectDeviceActivity = (ConnectDeviceActivity) yl0Var2;
                if (!connectDeviceActivity.E) {
                    connectDeviceActivity.E = true;
                    nz0 nz0Var = ((kz0) ((sp0) connectDeviceActivity.n())).g;
                    connectDeviceActivity.F = (l62) nz0Var.r.get();
                    connectDeviceActivity.G = (yi2) nz0Var.t.get();
                }
                break;
            default:
                WidgetConfigurationActivity widgetConfigurationActivity = (WidgetConfigurationActivity) yl0Var2;
                if (!widgetConfigurationActivity.E) {
                    widgetConfigurationActivity.E = true;
                    ((rn5) widgetConfigurationActivity.n()).getClass();
                }
                break;
        }
    }
}
