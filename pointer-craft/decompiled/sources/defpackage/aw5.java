package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class aw5 extends i1 {
    public static final Parcelable.Creator<aw5> CREATOR = new yv5(1);
    public final kq0 a;
    public final int j;
    public final boolean m;
    public final boolean q;
    public final IBinder t;

    public aw5(int i, IBinder iBinder, kq0 kq0Var, boolean z, boolean z2) {
        this.j = i;
        this.t = iBinder;
        this.a = kq0Var;
        this.m = z;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        Object fj6Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof aw5)) {
                return false;
            }
            aw5 aw5Var = (aw5) obj;
            if (!this.a.equals(aw5Var.a)) {
                return false;
            }
            Object fj6Var2 = null;
            IBinder iBinder = this.t;
            if (iBinder == null) {
                fj6Var = null;
            } else {
                int i = f3.n;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                fj6Var = iInterfaceQueryLocalInterface instanceof f92 ? (f92) iInterfaceQueryLocalInterface : new fj6(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 1);
            }
            IBinder iBinder2 = aw5Var.t;
            if (iBinder2 != null) {
                int i2 = f3.n;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                fj6Var2 = iInterfaceQueryLocalInterface2 instanceof f92 ? (f92) iInterfaceQueryLocalInterface2 : new fj6(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 1);
            }
            if (!lb6.g(fj6Var, fj6Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        IBinder iBinder = this.t;
        if (iBinder != null) {
            int iL2 = ef6.l(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            ef6.j(parcel, iL2);
        }
        ef6.y(parcel, 3, this.a, i);
        ef6.x(parcel, 4, 4);
        parcel.writeInt(this.m ? 1 : 0);
        ef6.x(parcel, 5, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ef6.j(parcel, iL);
    }
}
