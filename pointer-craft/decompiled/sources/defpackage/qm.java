package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qm extends View.BaseSavedState {
    public static final Parcelable.Creator<qm> CREATOR = new q4((byte) 1);
    public boolean j;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
    }
}
