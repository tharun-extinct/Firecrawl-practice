package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l05 implements Runnable {
    public final FirebaseInstanceId a;
    public final long j;
    public final PowerManager.WakeLock t;

    public l05(FirebaseInstanceId firebaseInstanceId, long j) {
        pw5.B();
        this.a = firebaseInstanceId;
        this.j = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) g().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.t = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final Context g() {
        ro1 ro1Var = this.a.y;
        ro1Var.g();
        return ro1Var.g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        FirebaseInstanceId firebaseInstanceId = this.a;
        PowerManager.WakeLock wakeLock = this.t;
        if (rk4.f().B(g())) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseInstanceId) {
                    z = true;
                    firebaseInstanceId.l = true;
                }
                if (!firebaseInstanceId.x()) {
                    synchronized (firebaseInstanceId) {
                        firebaseInstanceId.l = false;
                    }
                    if (rk4.f().B(g())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (rk4.f().A(g())) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) g().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z = false;
                    }
                    if (!z) {
                        ql qlVar = new ql();
                        qlVar.y = this;
                        qlVar.g();
                        if (rk4.f().B(g())) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                }
                if (y()) {
                    synchronized (firebaseInstanceId) {
                        firebaseInstanceId.l = false;
                    }
                } else {
                    firebaseInstanceId.l(this.j);
                }
                if (rk4.f().B(g())) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                synchronized (firebaseInstanceId) {
                    firebaseInstanceId.l = false;
                    if (rk4.f().B(g())) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (rk4.f().B(g())) {
                wakeLock.release();
            }
            throw th;
        }
    }

    public final boolean y() throws IOException {
        FirebaseInstanceId firebaseInstanceId = this.a;
        lz2 lz2VarV = firebaseInstanceId.v(s53.y(firebaseInstanceId.y), "*");
        if (lz2VarV != null && !lz2VarV.r(firebaseInstanceId.r.g())) {
            return true;
        }
        try {
            if (firebaseInstanceId.y() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message2 = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message2);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseInstanceId", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }
}
