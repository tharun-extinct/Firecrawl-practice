package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class te2 implements Parcelable {
    public static final Parcelable.Creator<te2> CREATOR = new q4((byte) 11);
    public final int a;
    public final IntentSender j;
    public final int m;
    public final Intent t;

    public te2(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.j = intentSender;
        this.t = intent;
        this.a = i;
        this.m = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int l() {
        return this.m;
    }

    public final int n() {
        return this.a;
    }

    public final Intent r() {
        return this.t;
    }

    public final IntentSender t() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.m);
    }
}
