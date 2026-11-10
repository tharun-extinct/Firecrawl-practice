package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ActionBarOverlayLayout t;

    public /* synthetic */ n3(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.j = b;
        this.t = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        ActionBarOverlayLayout actionBarOverlayLayout = this.t;
        switch (b) {
            case 0:
                actionBarOverlayLayout.x();
                actionBarOverlayLayout.G = actionBarOverlayLayout.m.animate().translationY(0.0f).setListener(actionBarOverlayLayout.H);
                break;
            default:
                actionBarOverlayLayout.x();
                actionBarOverlayLayout.G = actionBarOverlayLayout.m.animate().translationY(-actionBarOverlayLayout.m.getHeight()).setListener(actionBarOverlayLayout.H);
                break;
        }
    }
}
