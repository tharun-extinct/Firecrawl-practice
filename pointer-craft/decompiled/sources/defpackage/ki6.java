package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ki6 extends i1 {
    public static final Parcelable.Creator<ki6> CREATOR = new yv5((byte) 21);
    public final int j;
    public final String t;

    public ki6(String str, int i) {
        this.j = i;
        this.t = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.r(parcel, 2, this.t);
        ef6.j(parcel, iL);
    }
}
