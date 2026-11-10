package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class iv2 implements Parcelable {
    public static final Parcelable.Creator<iv2> CREATOR = new q4((byte) 12);
    public boolean a;
    public int j;
    public int t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
        parcel.writeInt(this.t);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
