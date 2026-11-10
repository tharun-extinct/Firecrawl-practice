package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class tv5 extends i1 {
    public static final Parcelable.Creator<tv5> CREATOR = new q4((byte) 28);
    public final aw5 a;
    public final int j;
    public final kq0 t;

    public tv5(int i, kq0 kq0Var, aw5 aw5Var) {
        this.j = i;
        this.t = kq0Var;
        this.a = aw5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.y(parcel, 2, this.t, i);
        ef6.y(parcel, 3, this.a, i);
        ef6.j(parcel, iL);
    }
}
