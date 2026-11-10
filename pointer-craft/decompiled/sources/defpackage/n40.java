package defpackage;

import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n40 extends nz1 implements my1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n40(Object obj) {
        super(0, obj, qr0.class, "enableBluetooth", "enableBluetooth()V", 0);
        this.i = (byte) 0;
    }

    @Override // defpackage.my1
    public final Object g() {
        e62 e62Var;
        switch (this.i) {
            case 0:
                h62 h62Var = ((qr0) this.t).j;
                if (h62Var.n && (e62Var = h62Var.r) != null) {
                    e62Var.q();
                }
                return og5.g;
            case 1:
                ClassicHidService classicHidService = (ClassicHidService) this.t;
                cm1 cm1Var = ClassicHidService.T;
                return classicHidService.M();
            default:
                return ((w35) this.t).z0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n40(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.i = b;
    }
}
