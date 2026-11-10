package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class jy implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ly t;

    public /* synthetic */ jy(ly lyVar, byte b) {
        this.j = b;
        this.t = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        ly lyVar = this.t;
        switch (b) {
            case 0:
                if (lyVar.m > 0) {
                    lyVar.q = SystemClock.uptimeMillis();
                }
                lyVar.setVisibility(0);
                break;
            default:
                ((he1) lyVar.getCurrentDrawable()).n(false, false, true);
                if ((lyVar.getProgressDrawable() == null || !lyVar.getProgressDrawable().isVisible()) && (lyVar.getIndeterminateDrawable() == null || !lyVar.getIndeterminateDrawable().isVisible())) {
                    lyVar.setVisibility(4);
                }
                lyVar.q = -1L;
                break;
        }
    }
}
