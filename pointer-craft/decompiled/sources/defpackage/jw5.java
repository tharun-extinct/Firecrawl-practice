package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class jw5 implements IInterface {
    public final IBinder r;

    public jw5(IBinder iBinder) {
        this.r = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.r;
    }

    public final void g(p26 p26Var, p12 p12Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(p26Var);
            parcelObtain.writeInt(1);
            yv5.g(p12Var, parcelObtain, 0);
            this.r.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
