package defpackage;

import androidx.glance.session.SessionWorker;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class og extends zz4 implements xy1 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(1, mu0Var);
        this.q = b;
        this.w = obj;
        this.c = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        Object obj3 = this.w;
        mu0 mu0Var = (mu0) obj;
        switch (b) {
            case 0:
                new og((qg) obj3, obj2, mu0Var, (byte) 0).u(og5Var);
                break;
            case 1:
                new og((ox0) obj3, (ClassicHidService) obj2, mu0Var, (byte) 1).u(og5Var);
                break;
            default:
                new og((s95) obj3, (SessionWorker) obj2, mu0Var, (byte) 2).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        Object obj2 = this.w;
        og5 og5Var = og5.g;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                js2.o(obj);
                qg qgVar = (qg) obj2;
                qgVar.r();
                Object objY = qgVar.y(obj3);
                qgVar.r.t.setValue(objY);
                qgVar.v.setValue(objY);
                break;
            case 1:
                js2.o(obj);
                ClassicHidService classicHidService = (ClassicHidService) obj3;
                try {
                    cm1 cm1Var = ClassicHidService.T;
                    classicHidService.O();
                } catch (SecurityException unused) {
                }
                break;
            default:
                js2.o(obj);
                ((s95) obj2).y(((SessionWorker) obj3).p.r);
                break;
        }
        return og5Var;
        return og5Var;
    }
}
