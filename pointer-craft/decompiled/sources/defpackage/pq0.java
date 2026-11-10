package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pq0 extends i1 {
    public static final Parcelable.Creator<pq0> CREATOR = new yv5((byte) 10);
    public final boolean a;
    public final ga4 j;
    public final int[] m;
    public final int q;
    public final boolean t;
    public final int[] w;

    public pq0(ga4 ga4Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.j = ga4Var;
        this.t = z;
        this.a = z2;
        this.m = iArr;
        this.q = i;
        this.w = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.y(parcel, 1, this.j, i);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t ? 1 : 0);
        ef6.x(parcel, 3, 4);
        parcel.writeInt(this.a ? 1 : 0);
        int[] iArr = this.m;
        if (iArr != null) {
            int iL2 = ef6.l(parcel, 4);
            parcel.writeIntArray(iArr);
            ef6.j(parcel, iL2);
        }
        ef6.x(parcel, 5, 4);
        parcel.writeInt(this.q);
        int[] iArr2 = this.w;
        if (iArr2 != null) {
            int iL3 = ef6.l(parcel, 6);
            parcel.writeIntArray(iArr2);
            ef6.j(parcel, iL3);
        }
        ef6.j(parcel, iL);
    }
}
