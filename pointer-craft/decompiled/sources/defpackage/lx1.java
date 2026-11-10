package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lx1 implements Parcelable {
    public static final Parcelable.Creator<lx1> CREATOR = new q4((byte) 9);
    public gw[] a;
    public ArrayList i;
    public ArrayList j;
    public int m;
    public ArrayList t;
    public String q = null;
    public ArrayList w = new ArrayList();
    public ArrayList c = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.t);
        parcel.writeTypedArray(this.a, i);
        parcel.writeInt(this.m);
        parcel.writeString(this.q);
        parcel.writeStringList(this.w);
        parcel.writeTypedList(this.c);
        parcel.writeTypedList(this.i);
    }
}
