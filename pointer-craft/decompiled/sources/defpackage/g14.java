package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g14 implements cj1 {
    public final HashMap g;
    public final HashMap y;

    public g14() {
        this.g = new HashMap();
        this.y = new HashMap();
    }

    @Override // defpackage.cj1
    public /* bridge */ /* synthetic */ cj1 g(Class cls, ji3 ji3Var) {
        this.g.put(cls, ji3Var);
        this.y.remove(cls);
        return this;
    }

    public void y(zh0 zh0Var, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.y;
        HashMap map2 = this.g;
        f14 f14Var = new f14(byteArrayOutputStream, map2, map);
        ji3 ji3Var = (ji3) map2.get(zh0.class);
        if (ji3Var != null) {
            ji3Var.g(zh0Var, f14Var);
        } else {
            throw new ej1("No encoder for " + zh0.class);
        }
    }

    public g14(HashMap map, HashMap map2) {
        this.g = map;
        this.y = map2;
    }
}
