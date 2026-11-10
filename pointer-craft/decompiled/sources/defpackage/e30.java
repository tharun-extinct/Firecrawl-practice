package defpackage;

import io.appground.blehid.BleHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class e30 extends zz4 implements bz1 {
    public final /* synthetic */ BleHidService c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e30(BleHidService bleHidService, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = bleHidService;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        BleHidService bleHidService = this.c;
        switch (b) {
            case 0:
                return new e30(bleHidService, mu0Var, (byte) 0);
            default:
                return new e30(bleHidService, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((e30) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        BleHidService bleHidService = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    return bleHidService.k(this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return bleHidService.k(this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
