package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lu5 implements IInterface {
    public final IBinder n;
    public final /* synthetic */ byte r;
    public final String v;

    public /* synthetic */ lu5(IBinder iBinder, String str, byte b) {
        this.r = b;
        this.n = iBinder;
        this.v = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.r) {
            case 0:
                break;
        }
        return this.n;
    }

    public Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.v);
        return parcelObtain;
    }

    public Parcel n(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.n.transact(i, parcel, parcelObtain, 0);
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

    public Parcel v() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.v);
        return parcelObtain;
    }

    public void y(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.n.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
