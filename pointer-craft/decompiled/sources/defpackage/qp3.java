package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qp3 extends xw4 implements Parcelable, mt4, bw4, ob3 {
    public static final Parcelable.Creator<qp3> CREATOR = new k21((byte) 6);
    public kt4 t;

    public qp3(int i) {
        at4 at4VarJ = it4.j();
        kt4 kt4Var = new kt4(i, at4VarJ.l());
        if (!(at4VarJ instanceof d32)) {
            kt4Var.y = new kt4(i, 1L);
        }
        this.t = kt4Var;
    }

    @Override // defpackage.ww4
    public final void b(yw4 yw4Var) {
        this.t = (kt4) yw4Var;
    }

    public final int d() {
        return ((kt4) it4.u(this.t, this)).r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        at4 at4VarJ;
        kt4 kt4Var = (kt4) it4.x(this.t);
        if (kt4Var.r != i) {
            kt4 kt4Var2 = this.t;
            synchronized (it4.r) {
                at4VarJ = it4.j();
                ((kt4) it4.c(kt4Var2, this, at4VarJ, kt4Var)).r = i;
            }
            it4.q(at4VarJ, this);
        }
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return Integer.valueOf(d());
    }

    @Override // defpackage.ww4
    public final yw4 l(yw4 yw4Var, yw4 yw4Var2, yw4 yw4Var3) {
        if (((kt4) yw4Var2).r == ((kt4) yw4Var3).r) {
            return yw4Var2;
        }
        return null;
    }

    @Override // defpackage.ww4
    public final yw4 n() {
        return this.t;
    }

    @Override // defpackage.ob3
    public final void setValue(Object obj) {
        e(((Number) obj).intValue());
    }

    @Override // defpackage.mt4
    public final ot4 t() {
        return f73.w;
    }

    public final String toString() {
        return du4.m(((kt4) it4.x(this.t)).r, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(d());
    }
}
