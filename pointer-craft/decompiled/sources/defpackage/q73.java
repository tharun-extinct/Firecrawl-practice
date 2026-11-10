package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q73 extends i1 {
    public static final Parcelable.Creator<q73> CREATOR = new q4((byte) 20);
    public final PendingIntent j;

    public q73(PendingIntent pendingIntent) {
        this.j = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.y(parcel, 1, this.j, i);
        ef6.j(parcel, iL);
    }
}
