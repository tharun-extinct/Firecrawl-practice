package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zg extends kk2 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg(Object obj, byte b) {
        super(1);
        this.t = b;
        this.a = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        og5 og5Var = og5.g;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                return Boolean.valueOf(yf2.p(obj, obj2));
            case 1:
                ts3 ts3Var = (ts3) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ts3Var.j((us3) arrayList.get(i), 0, 0, 0.0f);
                }
                return og5Var;
            case 2:
                ((ts3) obj).j((us3) obj2, 0, 0, 0.0f);
                return og5Var;
            case 3:
                ui uiVar = (ui) obj;
                float f = uiVar.y;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = uiVar.r;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = uiVar.n;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = uiVar.g;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new jj0(jj0.g(ra.r(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, wj0.k), (uj0) obj2));
            case 4:
                return Boolean.valueOf(!yf2.p(obj, ((nc5) obj2).n.getValue()));
            case 5:
                ((o84) obj).r(((Number) ((bw4) obj2).getValue()).floatValue());
                return og5Var;
            case 6:
                Throwable th = (Throwable) obj;
                p01 p01Var = (p01) obj2;
                o05 o05Var = p01Var.a;
                if (th != null) {
                    p01Var.j.w(new lo1(th));
                }
                if (o05Var.g()) {
                    ((do1) o05Var.getValue()).close();
                }
                return og5Var;
            default:
                xd1 xd1Var = (xd1) obj;
                x32 x32Var = (x32) obj2;
                ld ldVar = x32Var.q;
                if (x32Var.c && x32Var.A && ldVar != null) {
                    ro roVarE = xd1Var.E();
                    long jG = roVarE.G();
                    roVarE.b().q();
                    try {
                        ((ro) ((y22) roVarE.t).t).b().u(ldVar);
                        x32Var.r(xd1Var);
                    } finally {
                        du4.d(roVarE, jG);
                    }
                } else {
                    x32Var.r(xd1Var);
                }
                return og5Var;
        }
    }
}
