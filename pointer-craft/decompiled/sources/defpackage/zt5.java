package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class zt5 implements cu5, IInterface {
    public final IBinder r;

    public zt5(IBinder iBinder) {
        this.r = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.r;
    }
}
