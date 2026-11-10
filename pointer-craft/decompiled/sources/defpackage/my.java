package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class my implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw du4.a(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw du4.a(message.obj);
    }
}
