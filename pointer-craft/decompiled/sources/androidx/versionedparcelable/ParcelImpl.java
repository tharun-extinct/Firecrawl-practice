package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ck5;
import defpackage.dk5;
import defpackage.q4;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new q4((byte) 15);
    public final dk5 j;

    public ParcelImpl(Parcel parcel) {
        this.j = new ck5(parcel).l();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new ck5(parcel).t(this.j);
    }
}
