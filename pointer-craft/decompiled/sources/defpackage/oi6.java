package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class oi6 extends i1 {
    public static final Parcelable.Creator<oi6> CREATOR = new yv5((byte) 13);
    public final String a;
    public final li6 b;
    public final hi6 c;
    public final fi6 h;
    public final ki6 i;
    public final int j;
    public final byte[] m;
    public final gi6 o;
    public final mi6 p;
    public final Point[] q;
    public final ni6 s;
    public final String t;
    public final ii6 u;
    public final int w;
    public final ei6 z;

    public oi6(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, hi6 hi6Var, ki6 ki6Var, li6 li6Var, ni6 ni6Var, mi6 mi6Var, ii6 ii6Var, ei6 ei6Var, fi6 fi6Var, gi6 gi6Var) {
        this.j = i;
        this.t = str;
        this.a = str2;
        this.m = bArr;
        this.q = pointArr;
        this.w = i2;
        this.c = hi6Var;
        this.i = ki6Var;
        this.b = li6Var;
        this.s = ni6Var;
        this.p = mi6Var;
        this.u = ii6Var;
        this.z = ei6Var;
        this.h = fi6Var;
        this.o = gi6Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.r(parcel, 2, this.t);
        ef6.r(parcel, 3, this.a);
        byte[] bArr = this.m;
        if (bArr != null) {
            int iL2 = ef6.l(parcel, 4);
            parcel.writeByteArray(bArr);
            ef6.j(parcel, iL2);
        }
        ef6.n(parcel, 5, this.q, i);
        ef6.x(parcel, 6, 4);
        parcel.writeInt(this.w);
        ef6.y(parcel, 7, this.c, i);
        ef6.y(parcel, 8, this.i, i);
        ef6.y(parcel, 9, this.b, i);
        ef6.y(parcel, 10, this.s, i);
        ef6.y(parcel, 11, this.p, i);
        ef6.y(parcel, 12, this.u, i);
        ef6.y(parcel, 13, this.z, i);
        ef6.y(parcel, 14, this.h, i);
        ef6.y(parcel, 15, this.o, i);
        ef6.j(parcel, iL);
    }
}
