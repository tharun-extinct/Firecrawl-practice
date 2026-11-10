package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ii6 extends i1 {
    public static final Parcelable.Creator<ii6> CREATOR = new yv5((byte) 19);
    public final double j;
    public final double t;

    public ii6(double d, double d2) {
        this.j = d;
        this.t = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 8);
        parcel.writeDouble(this.j);
        ef6.x(parcel, 2, 8);
        parcel.writeDouble(this.t);
        ef6.j(parcel, iL);
    }
}
