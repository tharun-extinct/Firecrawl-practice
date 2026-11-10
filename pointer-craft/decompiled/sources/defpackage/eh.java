package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eh extends kk2 implements bz1 {
    public static final eh a;
    public static final eh m;
    public final /* synthetic */ byte t;

    static {
        int i = 2;
        a = new eh(i, (byte) 0);
        m = new eh(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh(int i, byte b) {
        super(i);
        this.t = b;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                long j = ((qe2) obj).g;
                long j2 = ((qe2) obj2).g;
                Map map = ym5.g;
                return m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1);
            default:
                mj1 mj1Var = (mj1) obj2;
                return Boolean.valueOf(((mj1) obj) == mj1Var && mj1Var == mj1.a);
        }
    }
}
