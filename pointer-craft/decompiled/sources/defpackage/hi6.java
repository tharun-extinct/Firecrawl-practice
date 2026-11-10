package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class hi6 extends i1 {
    public static final Parcelable.Creator<hi6> CREATOR = new yv5((byte) 18);
    public final String a;
    public final int j;
    public final String m;
    public final String t;

    public hi6(int i, String str, String str2, String str3) {
        this.j = i;
        this.t = str;
        this.a = str2;
        this.m = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.r(parcel, 2, this.t);
        ef6.r(parcel, 3, this.a);
        ef6.r(parcel, 4, this.m);
        ef6.j(parcel, iL);
    }
}
