package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class iw5 implements Parcelable {
    public static final Parcelable.Creator<iw5> CREATOR = new yv5(6);
    public final Messenger j;

    public iw5(IBinder iBinder) {
        this.j = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.j.getBinder().equals(((iw5) obj).j.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.j.getBinder().hashCode();
    }

    public final void r(Message message) throws RemoteException {
        this.j.send(message);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.j.getBinder());
    }
}
