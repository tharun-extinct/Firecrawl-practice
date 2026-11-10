package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class di6 extends i1 {
    public static final Parcelable.Creator<di6> CREATOR = new yv5((byte) 14);
    public final int a;
    public final boolean c;
    public final String i;
    public final int j;
    public final int m;
    public final int q;
    public final int t;
    public final int w;

    public di6(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.j = i;
        this.t = i2;
        this.a = i3;
        this.m = i4;
        this.q = i5;
        this.w = i6;
        this.c = z;
        this.i = str;
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
        ef6.x(parcel, 4, 4);
        parcel.writeInt(this.m);
        ef6.x(parcel, 5, 4);
        parcel.writeInt(this.q);
        ef6.x(parcel, 6, 4);
        parcel.writeInt(this.w);
        ef6.x(parcel, 7, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ef6.r(parcel, 8, this.i);
        ef6.j(parcel, iL);
    }
}
