package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xj1 extends kk2 implements xy1 {
    public static final xj1 a;
    public static final xj1 m;
    public final /* synthetic */ byte t;

    static {
        int i = 1;
        a = new xj1(i, (byte) 0);
        m = new xj1(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(int i, byte b) {
        super(i);
        this.t = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        switch (this.t) {
            case 0:
                qe2 qe2Var = (qe2) obj;
                long j = qe2Var.g;
                return qe2Var;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return "  " + ((rw3) entry.getKey()).g + " = " + (value instanceof byte[] ? pr.c0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
        }
    }
}
