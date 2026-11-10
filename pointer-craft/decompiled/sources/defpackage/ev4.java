package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ev4 implements Parcelable {
    public static final Parcelable.Creator<ev4> CREATOR = new q4(16);
    public int[] a;
    public int j;
    public boolean m;
    public int t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.j + ", mGapDir=" + this.t + ", mHasUnwantedGapAfter=" + this.m + ", mGapPerSpan=" + Arrays.toString(this.a) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
        parcel.writeInt(this.t);
        parcel.writeInt(this.m ? 1 : 0);
        int[] iArr = this.a;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.a);
        }
    }
}
