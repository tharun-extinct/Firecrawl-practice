package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class at0 implements ai1 {
    public String j;

    public at0(String str, byte b) {
        switch (b) {
            case 2:
                this.j = du4.q(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            default:
                this.j = str;
                break;
        }
    }

    public static String l(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return du4.i(str, " : ", str2);
    }

    public void n(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", l(this.j, str, objArr));
        }
    }

    public void r(String str) {
        this.j = str;
    }

    @Override // defpackage.ai1
    public boolean v(CharSequence charSequence, int i, int i2, ff5 ff5Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.j)) {
            return true;
        }
        ff5Var.r = (ff5Var.r & 3) | 4;
        return false;
    }

    public void x(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", l(this.j, str, objArr));
        }
    }

    public h3 y() {
        String str = this.j;
        if (str == null) {
            l0.u("Purchase token must be set");
            return null;
        }
        h3 h3Var = new h3();
        h3Var.g = str;
        return h3Var;
    }

    @Override // defpackage.ai1
    public Object g() {
        return this;
    }
}
