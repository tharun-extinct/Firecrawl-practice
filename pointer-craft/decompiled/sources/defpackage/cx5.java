package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cx5 implements ji3 {
    public final /* synthetic */ byte g;
    public static final /* synthetic */ cx5 y = new cx5(0);
    public static final /* synthetic */ cx5 r = new cx5(1);

    public /* synthetic */ cx5(byte b) {
        this.g = b;
    }

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ki3 ki3Var = (ki3) obj2;
                ki3Var.g(ex5.x, entry.getKey());
                ki3Var.g(ex5.l, entry.getValue());
                return;
            default:
                throw new ej1("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
