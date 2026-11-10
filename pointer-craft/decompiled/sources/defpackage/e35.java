package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e35 extends i1 {
    public static final Parcelable.Creator<e35> CREATOR = new q4((byte) 19);
    public final int j;
    public List t;

    public e35(int i, List list) {
        this.j = i;
        this.t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.v(parcel, 2, this.t);
        ef6.j(parcel, iL);
    }
}
