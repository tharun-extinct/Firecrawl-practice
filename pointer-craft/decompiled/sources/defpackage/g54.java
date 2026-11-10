package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public final class g54 extends x {
    public static final Parcelable.Creator<g54> CREATOR = new e50((byte) 2);
    public Parcelable a;

    public g54(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? g.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }
}
