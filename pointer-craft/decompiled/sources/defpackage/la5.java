package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class la5 extends x {
    public static final Parcelable.Creator<la5> CREATOR = new e50((byte) 4);
    public int a;
    public boolean m;

    public la5(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.m = parcel.readInt() != 0;
    }

    @Override // defpackage.x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.m ? 1 : 0);
    }
}
