package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements Parcelable {
    public static final Parcelable.Creator<r4> CREATOR = new q4(0);
    public final int j;
    public final Intent t;

    public r4(Intent intent, int i) {
        this.j = i;
        this.t = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + gg6.y(this.j) + ", data=" + this.t + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.j);
        Intent intent = this.t;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
