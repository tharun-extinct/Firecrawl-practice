package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements Parcelable {
    public final Parcelable j;
    public static final v t = new v();
    public static final Parcelable.Creator<x> CREATOR = new sp3(1);

    public x(Parcelable parcelable) {
        if (parcelable != null) {
            this.j = parcelable == t ? null : parcelable;
        } else {
            l0.u("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, i);
    }

    public x() {
        this.j = null;
    }

    public x(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.j = parcelable == null ? t : parcelable;
    }
}
