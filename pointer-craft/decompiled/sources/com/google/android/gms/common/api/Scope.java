package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ef6;
import defpackage.i1;
import defpackage.jr2;
import defpackage.yv5;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends i1 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new yv5(7);
    public final int j;
    public final String t;

    public Scope(String str, int i) {
        jr2.a(str, "scopeUri must not be null or empty");
        this.j = i;
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.t.equals(((Scope) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.r(parcel, 2, this.t);
        ef6.j(parcel, iL);
    }
}
