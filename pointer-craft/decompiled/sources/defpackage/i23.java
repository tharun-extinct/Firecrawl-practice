package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i23 extends x {
    public static final Parcelable.Creator<i23> CREATOR = new rt4((byte) 2);
    public boolean a;

    public i23(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            i23.class.getClassLoader();
        }
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
