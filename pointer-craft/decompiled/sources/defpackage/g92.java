package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class g92 implements h92 {
    public IBinder r;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.r;
    }

    @Override // defpackage.h92
    public final void r(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h92.g);
            parcelObtain.writeStringArray(strArr);
            this.r.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
