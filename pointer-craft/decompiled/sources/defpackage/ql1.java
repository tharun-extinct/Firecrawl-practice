package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements p14 {
    public final /* synthetic */ byte g;

    public /* synthetic */ ql1(byte b) {
        this.g = b;
    }

    @Override // defpackage.p14
    public final Object get() {
        switch (this.g) {
            case 0:
                return Integer.valueOf(oe4.m);
            case 1:
                return new mc4(Executors.newSingleThreadExecutor(), (byte) 0);
            default:
                tg1 tg1Var = new tg1((byte) 18);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    l0.q("Null flags");
                    return null;
                }
                map.put(xx3.j, new yu(30000L, 86400000L, set));
                if (set == null) {
                    l0.q("Null flags");
                    return null;
                }
                map.put(xx3.a, new yu(1000L, 86400000L, set));
                if (set == null) {
                    l0.q("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ie4.t)));
                if (setUnmodifiableSet == null) {
                    l0.q("Null flags");
                    return null;
                }
                map.put(xx3.t, new yu(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= xx3.values().length) {
                    new HashMap();
                    return new xu(tg1Var, map);
                }
                l0.z("Not all priorities have been configured");
                return null;
        }
    }
}
