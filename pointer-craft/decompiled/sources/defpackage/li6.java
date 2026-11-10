package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class li6 extends i1 {
    public static final Parcelable.Creator<li6> CREATOR = new yv5((byte) 22);
    public final String j;
    public final String t;

    public li6(String str, String str2) {
        this.j = str;
        this.t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.r(parcel, 1, this.j);
        ef6.r(parcel, 2, this.t);
        ef6.j(parcel, iL);
    }
}
