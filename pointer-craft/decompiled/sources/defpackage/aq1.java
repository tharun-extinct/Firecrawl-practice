package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class aq1 implements Parcelable {
    public static final Parcelable.Creator<aq1> CREATOR = new q4((byte) 7);
    public int j;
    public int t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.j);
        sb.append(", mAnchorOffset=");
        return fj.x(sb, this.t, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
        parcel.writeInt(this.t);
    }
}
