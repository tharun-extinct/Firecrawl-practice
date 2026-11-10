package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qa0 implements Parcelable {
    public static final Parcelable.Creator<qa0> CREATOR = new q4((byte) 4);
    public final v01 a;
    public final int c;
    public final u73 j;
    public final u73 m;
    public final int q;
    public final u73 t;
    public final int w;

    public qa0(u73 u73Var, u73 u73Var2, v01 v01Var, u73 u73Var3, int i) {
        Objects.requireNonNull(u73Var, "start cannot be null");
        Objects.requireNonNull(u73Var2, "end cannot be null");
        Objects.requireNonNull(v01Var, "validator cannot be null");
        this.j = u73Var;
        this.t = u73Var2;
        this.m = u73Var3;
        this.q = i;
        this.a = v01Var;
        if (u73Var3 != null && u73Var.j.compareTo(u73Var3.j) > 0) {
            l0.u("start Month cannot be after current Month");
            throw null;
        }
        if (u73Var3 != null && u73Var3.j.compareTo(u73Var2.j) > 0) {
            l0.u("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > zh5.r(null).getMaximum(7)) {
            l0.u("firstDayOfWeek is not valid");
            throw null;
        }
        this.c = u73Var.t(u73Var2) + 1;
        this.w = (u73Var2.a - u73Var.a) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return this.j.equals(qa0Var.j) && this.t.equals(qa0Var.t) && Objects.equals(this.m, qa0Var.m) && this.q == qa0Var.q && this.a.equals(qa0Var.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.j, this.t, this.m, Integer.valueOf(this.q), this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, 0);
        parcel.writeParcelable(this.t, 0);
        parcel.writeParcelable(this.m, 0);
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.q);
    }
}
