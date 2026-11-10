package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ia t;

    public /* synthetic */ ca(ia iaVar, byte b) {
        this.j = b;
        this.t = iaVar;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        ia iaVar = this.t;
        switch (b) {
            case 0:
                View view = iaVar.m;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                of4 of4Var = (of4) obj;
                if (of4Var.A()) {
                    sn3 snapshotObserver = iaVar.m.getSnapshotObserver();
                    snapshotObserver.g.n(of4Var, iaVar.T, new p2(of4Var, iaVar, (byte) 3));
                }
                return og5.g;
        }
    }
}
