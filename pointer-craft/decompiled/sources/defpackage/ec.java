package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ec implements du2 {
    public final Object a;
    public final /* synthetic */ byte j;
    public final Object t;

    public ec(fu2 fu2Var) {
        this.j = (byte) 2;
        this.t = fu2Var;
        wf0 wf0Var = wf0.r;
        Class<?> cls = fu2Var.getClass();
        uf0 uf0Var = (uf0) wf0Var.g.get(cls);
        this.a = uf0Var == null ? wf0Var.g(cls, null) : uf0Var;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        byte b = this.j;
        Object obj = this.t;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                if (vt2Var.g().compareTo(wt2.m) >= 0) {
                    ((q54) obj).j = false;
                    ((pw1) obj2).X.x(this);
                }
                break;
            case 1:
                if (vt2Var == vt2.ON_START) {
                    ((ju2) obj).x(this);
                    ((ji) obj2).U();
                }
                break;
            default:
                fu2 fu2Var = (fu2) obj;
                HashMap map = ((uf0) obj2).g;
                uf0.g((List) map.get(vt2Var), gu2Var, vt2Var, fu2Var);
                uf0.g((List) map.get(vt2.ON_ANY), gu2Var, vt2Var, fu2Var);
                break;
        }
    }

    public /* synthetic */ ec(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
