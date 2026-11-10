package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pu5 extends i1 {
    public static final Parcelable.Creator<pu5> CREATOR = new q4((byte) 23);
    public final long a;
    public final int j;
    public final int m;
    public final boolean q;
    public final String t;

    public pu5(int i, String str, long j, int i2, boolean z) {
        this.j = i;
        this.t = str;
        this.a = j;
        this.m = i2;
        this.q = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.r(parcel, 2, this.t);
        ef6.x(parcel, 3, 8);
        parcel.writeLong(this.a);
        ef6.x(parcel, 4, 4);
        parcel.writeInt(this.m);
        ef6.x(parcel, 5, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ef6.j(parcel, iL);
    }
}
