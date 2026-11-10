package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rp4 extends kk2 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp4(Object obj, Object obj2, byte b) {
        super(1);
        this.t = b;
        this.a = obj;
        this.m = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        og5 og5Var;
        byte b = this.t;
        og5 og5Var2 = og5.g;
        Object obj2 = this.a;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((zg) obj2).a(th);
                m70 m70Var = (m70) ((kb5) obj3).a;
                m70Var.n(th, false);
                do {
                    Object objG = ld0.g(m70Var.p());
                    if (objG != null) {
                        ((j53) objG).y.f0(new hl0(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        og5Var = og5Var2;
                    } else {
                        og5Var = null;
                    }
                } while (og5Var != null);
                break;
            default:
                ((ts3) obj).j((us3) obj2, 0, 0, ((ps5) obj3).o);
                break;
        }
        return og5Var2;
    }
}
