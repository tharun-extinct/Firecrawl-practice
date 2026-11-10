package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class pp3 extends xw4 implements Parcelable, mt4, ob3, bw4 {
    public static final Parcelable.Creator<pp3> CREATOR = new k21((byte) 5);
    public jt4 t;

    public pp3(float f) {
        at4 at4VarJ = it4.j();
        jt4 jt4Var = new jt4(f, at4VarJ.l());
        if (!(at4VarJ instanceof d32)) {
            jt4Var.y = new jt4(f, 1L);
        }
        this.t = jt4Var;
    }

    @Override // defpackage.ww4
    public final void b(yw4 yw4Var) {
        this.t = (jt4) yw4Var;
    }

    public final float d() {
        return ((jt4) it4.u(this.t, this)).r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(float f) {
        at4 at4VarJ;
        jt4 jt4Var = (jt4) it4.x(this.t);
        if (jt4Var.r == f) {
            return;
        }
        jt4 jt4Var2 = this.t;
        synchronized (it4.r) {
            at4VarJ = it4.j();
            ((jt4) it4.c(jt4Var2, this, at4VarJ, jt4Var)).r = f;
        }
        it4.q(at4VarJ, this);
    }

    @Override // defpackage.bw4
    public Object getValue() {
        return Float.valueOf(d());
    }

    @Override // defpackage.ww4
    public final yw4 l(yw4 yw4Var, yw4 yw4Var2, yw4 yw4Var3) {
        if (((jt4) yw4Var2).r == ((jt4) yw4Var3).r) {
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
        e(((Number) obj).floatValue());
    }

    @Override // defpackage.mt4
    public final ot4 t() {
        return f73.w;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((jt4) it4.x(this.t)).r + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(d());
    }
}
