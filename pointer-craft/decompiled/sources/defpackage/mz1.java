package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class mz1 implements Parcelable {
    public static final Parcelable.Creator<mz1> CREATOR = new q4((byte) 10);
    public final oz1 j;
    public final Bundle t;

    public mz1(oz1 oz1Var, Bundle bundle) {
        oz1Var.getClass();
        bundle.getClass();
        this.j = oz1Var;
        this.t = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz1)) {
            return false;
        }
        mz1 mz1Var = (mz1) obj;
        return this.j == mz1Var.j && yf2.p(this.t, mz1Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + (this.j.hashCode() * 31);
    }

    public final oz1 n() {
        return this.j;
    }

    public final Bundle r() {
        return this.t;
    }

    public final String toString() {
        return "FunctionCall(type=" + this.j + ", params=" + this.t + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.j.name());
        parcel.writeBundle(this.t);
    }
}
