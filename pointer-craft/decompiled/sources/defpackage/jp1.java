package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jp1 implements nu0, vy4 {
    public final String a;
    public final FirebaseInstanceId j;
    public final String t;

    public jp1(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.j = firebaseInstanceId;
        this.t = str;
        this.a = str2;
    }

    @Override // defpackage.vy4
    public nj6 a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.j;
        String str = this.t;
        String str2 = this.a;
        String str3 = (String) obj;
        wh4 wh4Var = FirebaseInstanceId.t;
        ro1 ro1Var = firebaseInstanceId.y;
        ro1Var.g();
        String strN = "[DEFAULT]".equals(ro1Var.y) ? "" : ro1Var.n();
        String strG = firebaseInstanceId.r.g();
        synchronized (wh4Var) {
            String strY = lz2.y(str3, strG, System.currentTimeMillis());
            if (strY != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) wh4Var.j).edit();
                editorEdit.putString(wh4.n(strN, str, str2), strY);
                editorEdit.commit();
            }
        }
        return br2.s(new ae2(str3));
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) {
        FirebaseInstanceId firebaseInstanceId = this.j;
        String str = this.t;
        String str2 = this.a;
        firebaseInstanceId.getClass();
        try {
            FirebaseInstanceId.t.j(firebaseInstanceId.y.n());
            String str3 = (String) FirebaseInstanceId.g(((gp1) firebaseInstanceId.x).r());
            lz2 lz2VarV = firebaseInstanceId.v(str, str2);
            if (lz2VarV != null && !lz2VarV.r(firebaseInstanceId.r.g())) {
                return br2.s(new ae2((String) lz2VarV.y));
            }
            ji jiVar = firebaseInstanceId.v;
            cp1 cp1Var = new cp1();
            cp1Var.g = firebaseInstanceId;
            cp1Var.y = str3;
            cp1Var.r = str;
            cp1Var.n = str2;
            cp1Var.v = lz2VarV;
            synchronized (jiVar) {
                Pair pair = new Pair(str, str2);
                nj6 nj6Var2 = (nj6) ((mr) jiVar.a).get(pair);
                if (nj6Var2 != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf = String.valueOf(pair);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                        sb.append("Joining ongoing request for: ");
                        sb.append(strValueOf);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    return nj6Var2;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf2 = String.valueOf(pair);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
                    sb2.append("Making new request for: ");
                    sb2.append(strValueOf2);
                    Log.d("FirebaseInstanceId", sb2.toString());
                }
                nj6 nj6VarV = cp1Var.q().v((ThreadPoolExecutor) jiVar.t, new cd2((byte) 18, jiVar, pair, false));
                ((mr) jiVar.a).put(pair, nj6VarV);
                return nj6VarV;
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public jp1(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.j = firebaseInstanceId;
        this.t = str;
        this.a = str2;
    }
}
