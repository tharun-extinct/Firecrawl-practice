package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yh6 implements nh6 {
    public final xp2 g;
    public final mh6 y;

    public yh6(Context context, mh6 mh6Var) {
        this.y = mh6Var;
        ga0 ga0Var = ga0.v;
        fd5.y(context);
        final ro roVarR = fd5.g().r(ga0Var);
        if (ga0.n.contains(new dj1("json"))) {
            final byte b = 0;
            new xp2(new n14() { // from class: xh6
                @Override // defpackage.n14
                public final Object get() {
                    byte b2 = b;
                    ro roVar = roVarR;
                    switch (b2) {
                        case 0:
                            return roVar.J("FIREBASE_ML_SDK", new dj1("json"), t32.u);
                        default:
                            return roVar.J("FIREBASE_ML_SDK", new dj1("proto"), aj6.u);
                    }
                }
            });
        }
        final byte b2 = 1;
        this.g = new xp2(new n14() { // from class: xh6
            @Override // defpackage.n14
            public final Object get() {
                byte b3 = b2;
                ro roVar = roVarR;
                switch (b3) {
                    case 0:
                        return roVar.J("FIREBASE_ML_SDK", new dj1("json"), t32.u);
                    default:
                        return roVar.J("FIREBASE_ML_SDK", new dj1("proto"), aj6.u);
                }
            }
        });
    }

    @Override // defpackage.nh6
    public final void g(ia6 ia6Var) {
        ed5 ed5Var = (ed5) this.g.get();
        bi6 bi6Var = bi6.h;
        q70 q70Var = (q70) ia6Var.g;
        ((lg6) ia6Var.y).t = false;
        lg6 lg6Var = (lg6) ia6Var.y;
        lg6Var.l = Boolean.FALSE;
        q70Var.t = new mg6(lg6Var);
        try {
            bi6.A();
            pd6 pd6Var = new pd6(q70Var);
            g14 g14Var = new g14();
            bi6Var.b(g14Var);
            HashMap map = new HashMap(g14Var.g);
            HashMap map2 = new HashMap(g14Var.y);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ex5 ex5Var = new ex5(byteArrayOutputStream, map, map2);
                ji3 ji3Var = (ji3) map.get(pd6.class);
                if (ji3Var == null) {
                    throw new ej1("No encoder for ".concat(String.valueOf(pd6.class)));
                }
                ji3Var.g(pd6Var, ex5Var);
                ed5Var.g(new iu(byteArrayOutputStream.toByteArray(), xx3.t));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
