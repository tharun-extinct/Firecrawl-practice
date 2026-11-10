package defpackage;

import io.appground.blek.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dp extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(qq0 qq0Var, qr0 qr0Var, bw4 bw4Var, nf3 nf3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 0;
        this.w = qq0Var;
        this.c = qr0Var;
        this.i = bw4Var;
        this.b = nf3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                return new dp((qq0) this.w, (qr0) obj3, (bw4) obj4, (nf3) obj2, mu0Var);
            case 1:
                dp dpVar = new dp(obj3, obj4, obj2, mu0Var, (byte) 1);
                dpVar.w = obj;
                return dpVar;
            case 2:
                dp dpVar2 = new dp(obj3, obj4, obj2, mu0Var, (byte) 2);
                dpVar2.w = obj;
                return dpVar2;
            default:
                return new dp((g61) this.w, (bw4) obj4, (ob3) obj3, (ob3) obj2, mu0Var);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((dp) b((mu0) obj2, (ox0) obj)).u(og5Var);
                break;
            case 1:
                ((dp) b((mu0) obj2, (ox0) obj)).u(og5Var);
                break;
            case 2:
                ((dp) b((mu0) obj2, (dz3) obj)).u(og5Var);
                break;
            default:
                ((dp) b((mu0) obj2, (ox0) obj)).u(og5Var);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v12, types: [dz3] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object next;
        g61 g61Var;
        g61 g61Var2;
        String str;
        String str2;
        g61 g61Var3;
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.i;
        ?? num = 0;
        String str3 = null;
        num = 0;
        switch (b) {
            case 0:
                js2.o(obj);
                if (!yf2.p(((qq0) this.w).y, t32.a)) {
                    up.y();
                    return null;
                }
                qr0 qr0Var = (qr0) obj2;
                qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 1));
                g61 g61Var4 = (g61) ((bw4) obj4).getValue();
                if (g61Var4 == null) {
                    return og5Var;
                }
                ((nf3) obj3).y.a(g61Var4);
                return og5Var;
            case 1:
                js2.o(obj);
                ox0 ox0Var = (ox0) this.w;
                vu3 vu3Var = (vu3) obj2;
                m50.T(ox0Var, null, new tw0(vu3Var, (r45) obj4, num, (byte) 0), 1);
                m50.T(ox0Var, null, new q(vu3Var, (b65) obj3, num, (byte) 23), 1);
                return og5Var;
            case 2:
                qp3 qp3Var = (qp3) obj3;
                v81 v81Var = (v81) obj2;
                ?? r7 = (dz3) this.w;
                js2.o(obj);
                ob3 ob3Var = (ob3) obj4;
                if ((((v81) ob3Var.getValue()) instanceof s81) && (v81Var instanceof t81)) {
                    int iD = qp3Var.d();
                    qp3Var.e(iD + 1);
                    num = new Integer(iD < 1 ? R.string.device_help_check : R.string.not_supported);
                }
                r7.setValue(num);
                ob3Var.setValue(v81Var);
                return og5Var;
            default:
                bw4 bw4Var = (bw4) obj4;
                js2.o(obj);
                if (((g61) this.w) == null) {
                    ob3 ob3Var2 = (ob3) obj3;
                    List list = xj4.g;
                    ob3 ob3Var3 = (ob3) obj2;
                    Iterator it = ((List) bw4Var.getValue()).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            str2 = ((g61) next).t;
                            g61Var3 = (g61) ob3Var3.getValue();
                        } else {
                            next = null;
                        }
                        g61Var = (g61) next;
                        if (g61Var != null || (str = g61Var.t) == null) {
                            g61Var2 = (g61) cj0.l0((List) bw4Var.getValue());
                            if (g61Var2 != null) {
                                str3 = g61Var2.t;
                            }
                        } else {
                            str3 = str;
                        }
                        ob3Var2.setValue(str3);
                    } while (!yf2.p(str2, g61Var3 != null ? g61Var3.t : null));
                    g61Var = (g61) next;
                    if (g61Var != null) {
                        g61Var2 = (g61) cj0.l0((List) bw4Var.getValue());
                        if (g61Var2 != null) {
                            str3 = g61Var2.t;
                        }
                    } else {
                        g61Var2 = (g61) cj0.l0((List) bw4Var.getValue());
                        if (g61Var2 != null) {
                            str3 = g61Var2.t;
                        }
                    }
                    ob3Var2.setValue(str3);
                }
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(g61 g61Var, bw4 bw4Var, ob3 ob3Var, ob3 ob3Var2, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 3;
        this.w = g61Var;
        this.i = bw4Var;
        this.c = ob3Var;
        this.b = ob3Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
    }
}
