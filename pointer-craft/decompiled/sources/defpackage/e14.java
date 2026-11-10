package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e14 implements ji3 {
    public final /* synthetic */ byte g;

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ki3 ki3Var = (ki3) obj2;
                ki3Var.g(f14.x, entry.getKey());
                ki3Var.g(f14.l, entry.getValue());
                return;
            default:
                throw new ej1("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
