package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class se2 extends ak {
    public final Throwable t;

    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public se2(int i, Throwable th) {
        String str;
        Locale locale = Locale.ROOT;
        HashMap map = xs5.g;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = xs5.y;
            if (map2.containsKey(numValueOf)) {
                str = ((String) map.get(numValueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((String) map2.get(numValueOf)) + ")";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        super(new Status(i, "Integrity API error (" + i + "): " + str + ".", null, null));
        if (i != 0) {
            this.t = th;
        } else {
            l0.u("ErrorCode should not be 0.");
            throw null;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.t;
    }
}
