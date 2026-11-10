package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class p12 extends i1 {
    public final int a;
    public tn1[] b;
    public Bundle c;
    public final String h;
    public Account i;
    public final int j;
    public String m;
    public final boolean p;
    public IBinder q;
    public tn1[] s;
    public final int t;
    public final int u;
    public Scope[] w;
    public boolean z;
    public static final Parcelable.Creator<p12> CREATOR = new yv5((byte) 11);
    public static final Scope[] o = new Scope[0];
    public static final tn1[] f = new tn1[0];

    public p12(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, tn1[] tn1VarArr, tn1[] tn1VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        tn1[] tn1VarArr3 = f;
        tn1[] tn1VarArr4 = tn1VarArr == null ? tn1VarArr3 : tn1VarArr;
        tn1VarArr3 = tn1VarArr2 != null ? tn1VarArr2 : tn1VarArr3;
        this.j = i;
        this.t = i2;
        this.a = i3;
        if ("com.google.android.gms".equals(str)) {
            this.m = "com.google.android.gms";
        } else {
            this.m = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = f3.n;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface fj6Var = iInterfaceQueryLocalInterface instanceof f92 ? (f92) iInterfaceQueryLocalInterface : new fj6(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        fj6 fj6Var2 = (fj6) fj6Var;
                        Parcel parcelN = fj6Var2.n(fj6Var2.v(), 2);
                        Account account3 = (Account) h06.g(parcelN, Account.CREATOR);
                        parcelN.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.q = iBinder;
            account2 = account;
        }
        this.i = account2;
        this.w = scopeArr2;
        this.c = bundle2;
        this.b = tn1VarArr4;
        this.s = tn1VarArr3;
        this.p = z;
        this.u = i4;
        this.z = z2;
        this.h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yv5.g(this, parcel, i);
    }
}
