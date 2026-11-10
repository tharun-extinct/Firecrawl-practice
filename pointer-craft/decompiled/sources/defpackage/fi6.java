package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class fi6 extends i1 {
    public static final Parcelable.Creator<fi6> CREATOR = new yv5((byte) 16);
    public final String a;
    public final ci6[] c;
    public final ji6 j;
    public final ki6[] m;
    public final hi6[] q;
    public final String t;
    public final String[] w;

    public fi6(ji6 ji6Var, String str, String str2, ki6[] ki6VarArr, hi6[] hi6VarArr, String[] strArr, ci6[] ci6VarArr) {
        this.j = ji6Var;
        this.t = str;
        this.a = str2;
        this.m = ki6VarArr;
        this.q = hi6VarArr;
        this.w = strArr;
        this.c = ci6VarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.y(parcel, 1, this.j, i);
        ef6.r(parcel, 2, this.t);
        ef6.r(parcel, 3, this.a);
        ef6.n(parcel, 4, this.m, i);
        ef6.n(parcel, 5, this.q, i);
        String[] strArr = this.w;
        if (strArr != null) {
            int iL2 = ef6.l(parcel, 6);
            parcel.writeStringArray(strArr);
            ef6.j(parcel, iL2);
        }
        ef6.n(parcel, 7, this.c, i);
        ef6.j(parcel, iL);
    }
}
