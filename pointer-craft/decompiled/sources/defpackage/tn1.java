package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tn1 extends i1 {
    public static final Parcelable.Creator<tn1> CREATOR = new yv5(5);
    public final long a;
    public final String j;
    public final boolean m;
    public final int t;

    public tn1(String str, int i, long j, boolean z) {
        this.j = str;
        this.t = i;
        this.a = j;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tn1) {
            tn1 tn1Var = (tn1) obj;
            if (lb6.g(this.j, tn1Var.j) && r() == tn1Var.r() && this.m == tn1Var.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.j, Long.valueOf(r()), Boolean.valueOf(this.m)});
    }

    public final long r() {
        long j = this.a;
        return j == -1 ? this.t : j;
    }

    public final String toString() {
        rk4 rk4Var = new rk4(this);
        rk4Var.q(this.j, "name");
        rk4Var.q(Long.valueOf(r()), "version");
        rk4Var.q(Boolean.valueOf(this.m), "is_fully_rolled_out");
        return rk4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.r(parcel, 1, this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t);
        long jR = r();
        ef6.x(parcel, 3, 8);
        parcel.writeLong(jR);
        ef6.x(parcel, 4, 4);
        parcel.writeInt(this.m ? 1 : 0);
        ef6.j(parcel, iL);
    }

    public tn1(String str, long j) {
        this(str, -1, j, false);
    }
}
