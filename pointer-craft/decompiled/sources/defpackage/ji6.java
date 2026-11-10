package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ji6 extends i1 {
    public static final Parcelable.Creator<ji6> CREATOR = new yv5((byte) 20);
    public final String a;
    public final String c;
    public final String j;
    public final String m;
    public final String q;
    public final String t;
    public final String w;

    public ji6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.j = str;
        this.t = str2;
        this.a = str3;
        this.m = str4;
        this.q = str5;
        this.w = str6;
        this.c = str7;
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
        ef6.j(parcel, iL);
    }
}
