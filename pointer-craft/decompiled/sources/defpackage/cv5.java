package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class cv5 extends ot5 implements n32, o32 {
    public static final mu5 m = dv5.g;
    public c20 a;
    public final rr j;
    public final Set l;
    public final Context n;
    public pp4 t;
    public final Handler v;
    public final mu5 x;

    public cv5(Context context, uv5 uv5Var, rr rrVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 1);
        this.n = context;
        this.v = uv5Var;
        this.j = rrVar;
        this.l = (Set) rrVar.r;
        this.x = m;
    }

    @Override // defpackage.n32
    public final void g(int i) {
        c20 c20Var = this.a;
        su5 su5Var = (su5) ((p32) c20Var.w).a.get((ck) c20Var.a);
        if (su5Var != null) {
            if (su5Var.m) {
                su5Var.w(new kq0(17, null, null));
            } else {
                su5Var.g(i);
            }
        }
    }

    @Override // defpackage.n32
    public final void n() {
        GoogleSignInAccount googleSignInAccountR;
        pp4 pp4Var = this.t;
        pp4Var.getClass();
        try {
            pp4Var.A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = pp4Var.r;
                ReentrantLock reentrantLock = kx4.r;
                jr2.m(context);
                ReentrantLock reentrantLock2 = kx4.r;
                reentrantLock2.lock();
                try {
                    kx4 kx4Var = kx4.n;
                    if (kx4Var == null) {
                        kx4Var = new kx4(context.getApplicationContext());
                        kx4.n = kx4Var;
                    }
                    reentrantLock2.unlock();
                    String strG = kx4Var.g("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strG)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strG).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strG);
                        String strG2 = kx4Var.g(sb.toString());
                        if (strG2 != null) {
                            try {
                                googleSignInAccountR = GoogleSignInAccount.r(strG2);
                            } catch (JSONException unused) {
                                googleSignInAccountR = null;
                            }
                        }
                    }
                    googleSignInAccountR = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountR = null;
            }
            Integer num = pp4Var.C;
            jr2.m(num);
            xv5 xv5Var = new xv5(2, account, num.intValue(), googleSignInAccountR);
            gv5 gv5Var = (gv5) pp4Var.j();
            mv5 mv5Var = new mv5(1, xv5Var);
            Parcel parcelG = gv5Var.g();
            yu5.y(parcelG, mv5Var);
            parcelG.writeStrongBinder(this);
            gv5Var.y(parcelG, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.v.post(new i26((byte) 16, this, new tv5(1, new kq0(8, null, null), null), false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.o32
    public final void y(kq0 kq0Var) {
        this.a.y(kq0Var);
    }
}
