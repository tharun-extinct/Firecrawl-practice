package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hw implements Parcelable {
    public static final Parcelable.Creator<hw> CREATOR = new q4((byte) 3);
    public final ArrayList j;
    public final ArrayList t;

    public hw(Parcel parcel) {
        this.j = parcel.createStringArrayList();
        this.t = parcel.createTypedArrayList(gw.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.j);
        parcel.writeTypedList(this.t);
    }
}
