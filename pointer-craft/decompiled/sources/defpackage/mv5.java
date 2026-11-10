package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class mv5 extends i1 {
    public static final Parcelable.Creator<mv5> CREATOR = new q4((byte) 27);
    public final int j;
    public final xv5 t;

    public mv5(int i, xv5 xv5Var) {
        this.j = i;
        this.t = xv5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.y(parcel, 2, this.t, i);
        ef6.j(parcel, iL);
    }
}
