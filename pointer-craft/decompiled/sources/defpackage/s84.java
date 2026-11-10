package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s84 implements Parcelable {
    public static final Parcelable.Creator<s84> CREATOR = new yv5((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dw5 dw5Var = (dw5) this;
        parcel.writeParcelable(dw5Var.j, 0);
        parcel.writeInt(dw5Var.t ? 1 : 0);
    }
}
