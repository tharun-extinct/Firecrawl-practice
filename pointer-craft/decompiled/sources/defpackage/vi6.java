package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class vi6 extends lu5 {
    public final j92 l(pi3 pi3Var, int i, pi3 pi3Var2) {
        Parcel parcelV = v();
        h06.y(parcelV, pi3Var);
        parcelV.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelV.writeInt(i);
        h06.y(parcelV, pi3Var2);
        Parcel parcelN = n(parcelV, 3);
        j92 j92VarL = pi3.l(parcelN.readStrongBinder());
        parcelN.recycle();
        return j92VarL;
    }

    public final j92 x(pi3 pi3Var, int i, pi3 pi3Var2) {
        Parcel parcelV = v();
        h06.y(parcelV, pi3Var);
        parcelV.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelV.writeInt(i);
        h06.y(parcelV, pi3Var2);
        Parcel parcelN = n(parcelV, 2);
        j92 j92VarL = pi3.l(parcelN.readStrongBinder());
        parcelN.recycle();
        return j92VarL;
    }
}
