package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class e26 extends ux5 {
    public final si6 r;

    public e26(si6 si6Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
        this.r = si6Var;
    }

    @Override // defpackage.ux5
    public final boolean g(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        ux5.y(parcel);
        this.r.g(Integer.valueOf(i2));
        return true;
    }
}
