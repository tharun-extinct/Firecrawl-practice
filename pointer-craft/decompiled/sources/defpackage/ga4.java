package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ga4 extends i1 {
    public static final Parcelable.Creator<ga4> CREATOR = new yv5((byte) 3);
    public final boolean a;
    public final int j;
    public final int m;
    public final int q;
    public final boolean t;

    public ga4(int i, boolean z, boolean z2, int i2, int i3) {
        this.j = i;
        this.t = z;
        this.a = z2;
        this.m = i2;
        this.q = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t ? 1 : 0);
        ef6.x(parcel, 3, 4);
        parcel.writeInt(this.a ? 1 : 0);
        ef6.x(parcel, 4, 4);
        parcel.writeInt(this.m);
        ef6.x(parcel, 5, 4);
        parcel.writeInt(this.q);
        ef6.j(parcel, iL);
    }
}
