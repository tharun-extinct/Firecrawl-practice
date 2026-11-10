package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class s26 implements y56, IInterface {
    public final IBinder r;

    public s26(IBinder iBinder) {
        this.r = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.r;
    }
}
