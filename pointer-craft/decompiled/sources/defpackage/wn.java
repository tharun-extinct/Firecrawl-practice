package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ jd3 t;

    public /* synthetic */ wn(jd3 jd3Var, byte b) {
        this.j = b;
        this.t = jd3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        int i;
        byte b = this.j;
        og5 og5Var = og5.g;
        jd3 jd3Var = this.t;
        switch (b) {
            case 0:
                jd3.v(jd3Var, "keyboard_layout");
                return og5Var;
            case 1:
                jd3.v(jd3Var, te4.l.g);
                return og5Var;
            case 2:
                jd3.v(jd3Var, "keyboard_layout");
                return og5Var;
            case 3:
                uv uvVar = jd3Var.x;
                boolean z = false;
                if (jd3Var.l) {
                    dr drVar = jd3Var.y.x;
                    if (drVar == null || !drVar.isEmpty()) {
                        Iterator it = drVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((mc3) it.next()).t instanceof dd3) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                uvVar.x(z);
                return og5Var;
            default:
                jd3Var.x();
                return og5Var;
        }
    }
}
