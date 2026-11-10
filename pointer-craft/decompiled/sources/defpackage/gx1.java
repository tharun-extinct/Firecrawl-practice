package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gx1 implements Parcelable {
    public static final Parcelable.Creator<gx1> CREATOR = new q4((byte) 8);
    public String j;
    public int t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.j);
        parcel.writeInt(this.t);
    }
}
