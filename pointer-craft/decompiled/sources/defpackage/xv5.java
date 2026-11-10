package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes2.dex */
public final class xv5 extends i1 {
    public static final Parcelable.Creator<xv5> CREATOR = new yv5(0);
    public final int a;
    public final int j;
    public final GoogleSignInAccount m;
    public final Account t;

    public xv5(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.j = i;
        this.t = account;
        this.a = i2;
        this.m = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.y(parcel, 2, this.t, i);
        ef6.x(parcel, 3, 4);
        parcel.writeInt(this.a);
        ef6.y(parcel, 4, this.m, i);
        ef6.j(parcel, iL);
    }
}
