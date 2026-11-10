package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y53 extends i1 {
    public static final Parcelable.Creator<y53> CREATOR = new q4(29);
    public final int a;
    public final int b;
    public final String c;
    public final int i;
    public final int j;
    public final long m;
    public final long q;
    public final int t;
    public final String w;

    public y53(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.j = i;
        this.t = i2;
        this.a = i3;
        this.m = j;
        this.q = j2;
        this.w = str;
        this.c = str2;
        this.i = i4;
        this.b = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t);
        ef6.x(parcel, 3, 4);
        parcel.writeInt(this.a);
        ef6.x(parcel, 4, 8);
        parcel.writeLong(this.m);
        ef6.x(parcel, 5, 8);
        parcel.writeLong(this.q);
        ef6.r(parcel, 6, this.w);
        ef6.r(parcel, 7, this.c);
        ef6.x(parcel, 8, 4);
        parcel.writeInt(this.i);
        ef6.x(parcel, 9, 4);
        parcel.writeInt(this.b);
        ef6.j(parcel, iL);
    }
}
