package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nn5 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ nn5(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        mu0 mu0Var = null;
        Object obj2 = this.m;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                fo5 fo5Var = (fo5) obj4;
                bz1 bz1Var = (bz1) obj3;
                ob3 ob3Var = (ob3) obj2;
                String str = (String) obj;
                str.getClass();
                if (fo5Var != fo5.t) {
                    ob3Var.setValue(str);
                } else {
                    bz1Var.l(str, null);
                }
                break;
            default:
                final b65 b65Var = (b65) obj4;
                ox0 ox0Var = (ox0) obj3;
                Context context = (Context) obj2;
                t35 t35Var = (t35) obj;
                xa3 xa3Var = t35Var.g;
                xa3 xa3Var2 = t35Var.g;
                g45 g45Var = g45.y;
                xa3Var.g(g45Var);
                d45 d45Var = d45.Autofill;
                final byte b2 = 0;
                final byte b3 = 1;
                boolean z = (u75.r(b65Var.q().y) || !b65Var.j() || b65Var.l == null) ? false : true;
                byte b4 = 18;
                o82 o82Var = new o82(ox0Var, new v55(b65Var, mu0Var, b3), b4);
                Resources resources = context.getResources();
                byte b5 = 22;
                kn2 kn2Var = new kn2(o82Var, mu0Var, b5);
                if (z) {
                    xa3Var2.g(new c45(af6.g, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, kn2Var));
                }
                d45 d45Var2 = d45.Autofill;
                boolean z2 = (u75.r(b65Var.q().y) || b65Var.l == null) ? false : true;
                o82 o82Var2 = new o82(ox0Var, new v55(b65Var, mu0Var, (byte) 2), b4);
                Resources resources2 = context.getResources();
                kn2 kn2Var2 = new kn2(o82Var2, mu0Var, b5);
                if (z2) {
                    xa3Var2.g(new c45(af6.y, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, kn2Var2));
                }
                d45 d45Var3 = d45.Autofill;
                boolean z3 = b65Var.j() && ((Boolean) b65Var.f.getValue()).booleanValue() && b65Var.l != null;
                o82 o82Var3 = new o82(ox0Var, new v55(b65Var, mu0Var, (byte) 3), b4);
                Resources resources3 = context.getResources();
                kn2 kn2Var3 = new kn2(o82Var3, mu0Var, b5);
                if (z3) {
                    xa3Var2.g(new c45(af6.r, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, kn2Var3));
                }
                d45 d45Var4 = d45.Autofill;
                boolean z4 = u75.n(b65Var.q().y) != b65Var.q().g.t.length();
                my1 my1Var = new my1() { // from class: f65
                    @Override // defpackage.my1
                    public final Object g() {
                        byte b6 = b2;
                        og5 og5Var2 = og5.g;
                        b65 b65Var2 = b65Var;
                        switch (b6) {
                            case 0:
                                return Boolean.valueOf(!b65Var2.A);
                            case 1:
                                k65 k65VarY = b65.y(b65Var2.q().g, sp2.y(0, b65Var2.q().g.t.length()));
                                b65Var2.r.a(k65VarY);
                                long j = k65VarY.y;
                                b65Var2.o = new u75(j);
                                b65Var2.z = k65.g(b65Var2.z, null, j, 5);
                                b65Var2.v(true);
                                return og5Var2;
                            default:
                                my1 my1Var2 = b65Var2.x;
                                if (my1Var2 != null) {
                                    my1Var2.g();
                                }
                                return og5Var2;
                        }
                    }
                };
                my1 my1Var2 = new my1() { // from class: f65
                    @Override // defpackage.my1
                    public final Object g() {
                        byte b6 = b3;
                        og5 og5Var2 = og5.g;
                        b65 b65Var2 = b65Var;
                        switch (b6) {
                            case 0:
                                return Boolean.valueOf(!b65Var2.A);
                            case 1:
                                k65 k65VarY = b65.y(b65Var2.q().g, sp2.y(0, b65Var2.q().g.t.length()));
                                b65Var2.r.a(k65VarY);
                                long j = k65VarY.y;
                                b65Var2.o = new u75(j);
                                b65Var2.z = k65.g(b65Var2.z, null, j, 5);
                                b65Var2.v(true);
                                return og5Var2;
                            default:
                                my1 my1Var3 = b65Var2.x;
                                if (my1Var3 != null) {
                                    my1Var3.g();
                                }
                                return og5Var2;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                kn2 kn2Var4 = new kn2(my1Var2, my1Var, b5);
                if (z4) {
                    xa3Var2.g(new c45(af6.n, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, kn2Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    d45 d45Var5 = d45.Autofill;
                    if (b65Var.j() && u75.r(b65Var.q().y)) {
                        b2 = 1;
                    }
                    final byte b6 = 2;
                    my1 my1Var3 = new my1() { // from class: f65
                        @Override // defpackage.my1
                        public final Object g() {
                            byte b7 = b6;
                            og5 og5Var2 = og5.g;
                            b65 b65Var2 = b65Var;
                            switch (b7) {
                                case 0:
                                    return Boolean.valueOf(!b65Var2.A);
                                case 1:
                                    k65 k65VarY = b65.y(b65Var2.q().g, sp2.y(0, b65Var2.q().g.t.length()));
                                    b65Var2.r.a(k65VarY);
                                    long j = k65VarY.y;
                                    b65Var2.o = new u75(j);
                                    b65Var2.z = k65.g(b65Var2.z, null, j, 5);
                                    b65Var2.v(true);
                                    return og5Var2;
                                default:
                                    my1 my1Var4 = b65Var2.x;
                                    if (my1Var4 != null) {
                                        my1Var4.g();
                                    }
                                    return og5Var2;
                            }
                        }
                    };
                    Resources resources5 = context.getResources();
                    kn2 kn2Var5 = new kn2(my1Var3, mu0Var, b5);
                    if (b2 != 0) {
                        xa3Var2.g(new c45(d45Var5.j, resources5.getString(d45Var5.t), d45Var5.a, kn2Var5));
                    }
                }
                xa3Var2.g(g45Var);
                break;
        }
        return og5Var;
    }
}
