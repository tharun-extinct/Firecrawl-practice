package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p73 extends i1 {
    public static final Parcelable.Creator<p73> CREATOR = new q4((byte) 18);
    public final boolean j;
    public final int t;

    public p73(boolean z, int i) {
        this.j = z;
        this.t = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t);
        ef6.j(parcel, iL);
    }
}
