package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ci6 extends i1 {
    public static final Parcelable.Creator<ci6> CREATOR = new yv5((byte) 12);
    public final int j;
    public final String[] t;

    public ci6(int i, String[] strArr) {
        this.j = i;
        this.t = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        String[] strArr = this.t;
        if (strArr != null) {
            int iL2 = ef6.l(parcel, 2);
            parcel.writeStringArray(strArr);
            ef6.j(parcel, iL2);
        }
        ef6.j(parcel, iL);
    }
}
