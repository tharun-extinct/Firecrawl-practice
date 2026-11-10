package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ot5 extends Binder implements IInterface {
    public final /* synthetic */ byte r;

    public ot5(String str, byte b) {
        this.r = b;
        switch (b) {
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.r;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        se2 se2Var;
        byte b = 0;
        switch (this.r) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                it5 it5Var = (it5) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = qt5.g;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(xi3.j("Parcel data not fully consumed, unread size: ", iDataAvail));
                }
                jt5 jt5Var = it5Var.x;
                bt5 bt5Var = jt5Var.v;
                x25 x25Var = it5Var.v;
                synchronized (bt5Var.x) {
                    bt5Var.v.remove(x25Var);
                    break;
                }
                bt5Var.g().post(new zs5(bt5Var));
                it5Var.n.g("onRequestIntegrityToken", new Object[0]);
                jt5Var.n.getClass();
                int i4 = bundle.getInt("error");
                if (i4 == 0) {
                    se2Var = null;
                } else {
                    bundle.getBoolean("is.error.remediable");
                    se2Var = new se2(i4, null);
                }
                if (se2Var != null) {
                    x25Var.r(se2Var);
                } else {
                    String string = bundle.getString("token");
                    if (string == null) {
                        x25Var.r(new se2(-100, null));
                    } else {
                        bundle.getLong("request.token.sid");
                        du4.q(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                        x25Var.g.q(new mt5(string));
                    }
                }
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return v(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return x(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                x86 x86Var = (x86) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i5 = k06.g;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(xi3.j("Parcel data not fully consumed, unread size: ", iDataAvail2));
                }
                jj6 jj6Var = x86Var.x.g;
                if (jj6Var != null) {
                    x25 x25Var2 = x86Var.v;
                    synchronized (jj6Var.x) {
                        jj6Var.v.remove(x25Var2);
                        break;
                    }
                    jj6Var.g().post(new yg6(jj6Var, b));
                }
                x86Var.n.n("onGetLaunchReviewFlowInfo", new Object[0]);
                x86Var.v.g.q(new dw5((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                return true;
        }
    }

    public boolean v(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                yu5.r(parcel);
                break;
            case 4:
                yu5.r(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                yu5.r(parcel);
                break;
            case 7:
                yu5.r(parcel);
                break;
            case 8:
                tv5 tv5Var = (tv5) yu5.g(parcel, tv5.CREATOR);
                yu5.r(parcel);
                cv5 cv5Var = (cv5) this;
                cv5Var.v.post(new i26((byte) 16, cv5Var, tv5Var, z));
                break;
            case 9:
                yu5.r(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public boolean x(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }
}
