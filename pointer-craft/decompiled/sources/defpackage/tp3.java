package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class tp3 extends xw4 implements Parcelable, mt4 {
    public static final Parcelable.Creator<tp3> CREATOR = new sp3(0);
    public nt4 a;
    public final ot4 t;

    public tp3(Object obj, ot4 ot4Var) {
        this.t = ot4Var;
        at4 at4VarJ = it4.j();
        nt4 nt4Var = new nt4(at4VarJ.l(), obj);
        if (!(at4VarJ instanceof d32)) {
            nt4Var.y = new nt4(1L, obj);
        }
        this.a = nt4Var;
    }

    @Override // defpackage.ww4
    public final void b(yw4 yw4Var) {
        this.a = (nt4) yw4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return ((nt4) it4.u(this.a, this)).r;
    }

    @Override // defpackage.ww4
    public final yw4 l(yw4 yw4Var, yw4 yw4Var2, yw4 yw4Var3) {
        if (this.t.r(((nt4) yw4Var2).r, ((nt4) yw4Var3).r)) {
            return yw4Var2;
        }
        return null;
    }

    @Override // defpackage.ww4
    public final yw4 n() {
        return this.a;
    }

    @Override // defpackage.ob3
    public final void setValue(Object obj) {
        at4 at4VarJ;
        nt4 nt4Var = (nt4) it4.x(this.a);
        if (this.t.r(nt4Var.r, obj)) {
            return;
        }
        nt4 nt4Var2 = this.a;
        synchronized (it4.r) {
            at4VarJ = it4.j();
            ((nt4) it4.c(nt4Var2, this, at4VarJ, nt4Var)).r = obj;
        }
        it4.q(at4VarJ, this);
    }

    @Override // defpackage.mt4
    public final ot4 t() {
        return this.t;
    }

    public final String toString() {
        return "MutableState(value=" + ((nt4) it4.x(this.a)).r + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        hi0 hi0Var = hi0.B;
        ot4 ot4Var = this.t;
        if (ot4Var.equals(hi0Var)) {
            i2 = 0;
        } else if (ot4Var.equals(f73.w)) {
            i2 = 1;
        } else {
            if (!ot4Var.equals(l76.q)) {
                l0.z("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
