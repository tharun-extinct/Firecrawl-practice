package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class sx5 implements IInterface {
    public final String n;
    public final IBinder r;

    public sx5(IBinder iBinder, String str) {
        this.r = iBinder;
        this.n = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.r;
    }

    public final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.n);
        return parcelObtain;
    }

    public final void n(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.r.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel y(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.r.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
