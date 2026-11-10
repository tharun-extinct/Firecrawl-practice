package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class pv5 extends ot5 implements IInterface {
    public final /* synthetic */ byte n;
    public final /* synthetic */ x25 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv5(zv5 zv5Var, x25 x25Var, byte b) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", (byte) 1);
        this.n = b;
        this.v = x25Var;
    }

    @Override // defpackage.ot5
    public final boolean v(int i, Parcel parcel, Parcel parcel2) {
        x25 x25Var = this.v;
        byte b = this.n;
        if (i == 1) {
            Status status = (Status) yu5.g(parcel, Status.CREATOR);
            p73 p73Var = (p73) yu5.g(parcel, p73.CREATOR);
            yu5.r(parcel);
            switch (b) {
                case 0:
                    gh6.x(status, p73Var, x25Var);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 2) {
            Status status2 = (Status) yu5.g(parcel, Status.CREATOR);
            r73 r73Var = (r73) yu5.g(parcel, r73.CREATOR);
            yu5.r(parcel);
            switch (b) {
                case 1:
                    gh6.x(status2, r73Var, x25Var);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 3) {
            yu5.r(parcel);
            uo1.f();
            return false;
        }
        if (i != 4) {
            return false;
        }
        yu5.r(parcel);
        uo1.f();
        return false;
    }
}
