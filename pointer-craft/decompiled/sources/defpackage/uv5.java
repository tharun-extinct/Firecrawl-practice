package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class uv5 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv5(Looper looper, byte b) {
        super(looper);
        switch (b) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
