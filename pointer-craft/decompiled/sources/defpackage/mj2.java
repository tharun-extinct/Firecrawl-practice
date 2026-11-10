package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mj2 implements gr1 {
    public final /* synthetic */ sj2 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ gr1 t;

    public /* synthetic */ mj2(gr1 gr1Var, sj2 sj2Var, byte b) {
        this.j = b;
        this.t = gr1Var;
        this.a = sj2Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        lj2 lj2Var;
        pj2 pj2Var;
        rj2 rj2Var;
        hm2 hm2Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        sj2 sj2Var = this.a;
        gr1 gr1Var = this.t;
        Object obj2 = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof lj2) {
                    lj2Var = (lj2) mu0Var;
                    int i = lj2Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lj2Var.q = i - Integer.MIN_VALUE;
                    } else {
                        lj2Var = new lj2(this, mu0Var);
                    }
                } else {
                    lj2Var = new lj2(this, mu0Var);
                }
                Object obj3 = lj2Var.m;
                int i2 = lj2Var.q;
                if (i2 == 0) {
                    js2.o(obj3);
                    Object objG = vp2.g((db3) obj, sj2Var.r);
                    lj2Var.q = 1;
                    return gr1Var.c(objG, lj2Var) == obj2 ? obj2 : og5Var;
                }
                if (i2 == 1) {
                    js2.o(obj3);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (mu0Var instanceof pj2) {
                    pj2Var = (pj2) mu0Var;
                    int i3 = pj2Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pj2Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        pj2Var = new pj2(this, mu0Var);
                    }
                } else {
                    pj2Var = new pj2(this, mu0Var);
                }
                Object obj4 = pj2Var.m;
                int i4 = pj2Var.q;
                if (i4 == 0) {
                    js2.o(obj4);
                    Object objV = vp2.v((db3) obj, sj2Var.r);
                    pj2Var.q = 1;
                    return gr1Var.c(objV, pj2Var) == obj2 ? obj2 : og5Var;
                }
                if (i4 == 1) {
                    js2.o(obj4);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (mu0Var instanceof rj2) {
                    rj2Var = (rj2) mu0Var;
                    int i5 = rj2Var.q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rj2Var.q = i5 - Integer.MIN_VALUE;
                    } else {
                        rj2Var = new rj2(this, mu0Var);
                    }
                } else {
                    rj2Var = new rj2(this, mu0Var);
                }
                Object obj5 = rj2Var.m;
                int i6 = rj2Var.q;
                if (i6 != 0) {
                    if (i6 == 1) {
                        js2.o(obj5);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj5);
                Iterable<String> iterable = (Set) obj;
                if (iterable == null) {
                    iterable = vi1.j;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : iterable) {
                    yi2 yi2Var = sj2Var.y;
                    yi2Var.getClass();
                    str.getClass();
                    int i7 = 0;
                    if (ay4.P(str, "custom:", false)) {
                        to2 to2VarG = yi2Var.g.g(str);
                        if (to2VarG == null) {
                            hm2Var = null;
                        } else {
                            String str2 = to2VarG.a;
                            String str3 = (str2 == null || str2.length() == 0) ? "Custom Layout" : to2VarG.a;
                            str3.getClass();
                            hm2Var = new hm2("custom", str3, str, to2VarG.m == 2);
                        }
                    } else {
                        hm2[] hm2VarArr = (hm2[]) vp2.g.getValue();
                        int length = hm2VarArr.length;
                        while (true) {
                            if (i7 < length) {
                                hm2 hm2Var2 = hm2VarArr[i7];
                                if (yf2.p(hm2Var2.r, str)) {
                                    hm2Var = hm2Var2;
                                } else {
                                    i7++;
                                }
                            } else {
                                hm2Var = null;
                            }
                        }
                    }
                    if (hm2Var != null) {
                        arrayList.add(hm2Var);
                    }
                }
                rj2Var.q = 1;
                return gr1Var.c(arrayList, rj2Var) == obj2 ? obj2 : og5Var;
        }
    }
}
