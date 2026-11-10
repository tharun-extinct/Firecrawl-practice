package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fv4 implements Parcelable {
    public static final Parcelable.Creator<fv4> CREATOR = new q4((byte) 17);
    public int a;
    public boolean b;
    public ArrayList c;
    public boolean i;
    public int j;
    public int[] m;
    public int q;
    public boolean s;
    public int t;
    public int[] w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
        parcel.writeInt(this.t);
        parcel.writeInt(this.a);
        if (this.a > 0) {
            parcel.writeIntArray(this.m);
        }
        parcel.writeInt(this.q);
        if (this.q > 0) {
            parcel.writeIntArray(this.w);
        }
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeList(this.c);
    }
}
