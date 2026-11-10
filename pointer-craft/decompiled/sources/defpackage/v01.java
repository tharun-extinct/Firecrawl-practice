package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v01 implements Parcelable {
    public static final Parcelable.Creator<v01> CREATOR = new q4((byte) 5);
    public final long j;

    public v01(long j) {
        this.j = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v01) && this.j == ((v01) obj).j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.j);
    }
}
