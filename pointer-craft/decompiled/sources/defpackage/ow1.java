package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ow1 implements Parcelable {
    public static final Parcelable.Creator<ow1> CREATOR = new sp3((byte) 2);
    public final Bundle j;

    public ow1(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.j = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.j);
    }

    public ow1(Bundle bundle) {
        this.j = bundle;
    }
}
