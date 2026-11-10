package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l21 implements Parcelable {
    public static final Parcelable.Creator<l21> CREATOR = new k21((byte) 0);
    public final int j;

    public l21(int i) {
        this.j = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l21) && this.j == ((l21) obj).j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j);
    }

    public final String toString() {
        return du4.w(this.j, "DefaultLazyKey(index=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
    }
}
