package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gi6 extends i1 {
    public static final Parcelable.Creator<gi6> CREATOR = new yv5((byte) 17);
    public final String a;
    public final String b;
    public final String c;
    public final String h;
    public final String i;
    public final String j;
    public final String m;
    public final String p;
    public final String q;
    public final String s;
    public final String t;
    public final String u;
    public final String w;
    public final String z;

    public gi6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.j = str;
        this.t = str2;
        this.a = str3;
        this.m = str4;
        this.q = str5;
        this.w = str6;
        this.c = str7;
        this.i = str8;
        this.b = str9;
        this.s = str10;
        this.p = str11;
        this.u = str12;
        this.z = str13;
        this.h = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.r(parcel, 1, this.j);
        ef6.r(parcel, 2, this.t);
        ef6.r(parcel, 3, this.a);
        ef6.r(parcel, 4, this.m);
        ef6.r(parcel, 5, this.q);
        ef6.r(parcel, 6, this.w);
        ef6.r(parcel, 7, this.c);
        ef6.r(parcel, 8, this.i);
        ef6.r(parcel, 9, this.b);
        ef6.r(parcel, 10, this.s);
        ef6.r(parcel, 11, this.p);
        ef6.r(parcel, 12, this.u);
        ef6.r(parcel, 13, this.z);
        ef6.r(parcel, 14, this.h);
        ef6.j(parcel, iL);
    }
}
