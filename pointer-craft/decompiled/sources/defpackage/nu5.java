package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class nu5 extends i1 {
    public static final Parcelable.Creator<nu5> CREATOR = new q4((byte) 21);
    public final Intent a;
    public final int j;
    public final int t;

    public nu5(int i, int i2, Intent intent) {
        this.j = i;
        this.t = i2;
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t);
        ef6.y(parcel, 3, this.a, i);
        ef6.j(parcel, iL);
    }
}
