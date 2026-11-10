package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ei6 extends i1 {
    public static final Parcelable.Creator<ei6> CREATOR = new yv5((byte) 15);
    public final String a;
    public final di6 c;
    public final String j;
    public final String m;
    public final String q;
    public final String t;
    public final di6 w;

    public ei6(String str, String str2, String str3, String str4, String str5, di6 di6Var, di6 di6Var2) {
        this.j = str;
        this.t = str2;
        this.a = str3;
        this.m = str4;
        this.q = str5;
        this.w = di6Var;
        this.c = di6Var2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.r(parcel, 1, this.j);
        ef6.r(parcel, 2, this.t);
        ef6.r(parcel, 3, this.a);
        ef6.r(parcel, 4, this.m);
        ef6.r(parcel, 5, this.q);
        ef6.y(parcel, 6, this.w, i);
        ef6.y(parcel, 7, this.c, i);
        ef6.j(parcel, iL);
    }
}
