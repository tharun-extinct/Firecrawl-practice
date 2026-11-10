package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rp3 extends xw4 implements Parcelable, mt4, ob3, bw4 {
    public static final Parcelable.Creator<rp3> CREATOR = new k21((byte) 7);
    public lt4 t;

    public rp3(long j) {
        at4 at4VarJ = it4.j();
        lt4 lt4Var = new lt4(at4VarJ.l(), j);
        if (!(at4VarJ instanceof d32)) {
            lt4Var.y = new lt4(1L, j);
        }
        this.t = lt4Var;
    }

    @Override // defpackage.ww4
    public final void b(yw4 yw4Var) {
        this.t = (lt4) yw4Var;
    }

    public final long d() {
        return ((lt4) it4.u(this.t, this)).r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(long j) {
        at4 at4VarJ;
        lt4 lt4Var = (lt4) it4.x(this.t);
        if (lt4Var.r != j) {
            lt4 lt4Var2 = this.t;
            synchronized (it4.r) {
                at4VarJ = it4.j();
                ((lt4) it4.c(lt4Var2, this, at4VarJ, lt4Var)).r = j;
            }
            it4.q(at4VarJ, this);
        }
    }

    @Override // defpackage.bw4
    public Object getValue() {
        return Long.valueOf(d());
    }

    @Override // defpackage.ww4
    public final yw4 l(yw4 yw4Var, yw4 yw4Var2, yw4 yw4Var3) {
        if (((lt4) yw4Var2).r == ((lt4) yw4Var3).r) {
            return yw4Var2;
        }
        return null;
    }

    @Override // defpackage.ww4
    public final yw4 n() {
        return this.t;
    }

    @Override // defpackage.ob3
    public void setValue(Object obj) {
        e(((Number) obj).longValue());
    }

    @Override // defpackage.mt4
    public final ot4 t() {
        return f73.w;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((lt4) it4.x(this.t)).r + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(d());
    }
}
