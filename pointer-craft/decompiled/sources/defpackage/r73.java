package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r73 extends i1 {
    public static final Parcelable.Creator<r73> CREATOR = new q4((byte) 24);
    public final int j;
    public final boolean t;

    public r73(int i, boolean z) {
        this.j = i;
        this.t = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t ? 1 : 0);
        ef6.j(parcel, iL);
    }
}
