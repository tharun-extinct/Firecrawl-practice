package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vb6 {
    public static final HashMap g;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        g = new HashMap();
        du4.q(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
