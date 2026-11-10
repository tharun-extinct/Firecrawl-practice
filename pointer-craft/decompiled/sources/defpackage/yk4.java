package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yk4 {
    public final LinkedHashMap g = new LinkedHashMap();
    public final /* synthetic */ zk4 y;

    public yk4(zk4 zk4Var) {
        this.y = zk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Context context, String str, ou0 ou0Var) {
        vk4 vk4Var;
        if (ou0Var instanceof vk4) {
            vk4Var = (vk4) ou0Var;
            int i = vk4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk4Var.c = i - Integer.MIN_VALUE;
            } else {
                vk4Var = new vk4(this, ou0Var);
            }
        } else {
            vk4Var = new vk4(this, ou0Var);
        }
        Object objV = vk4Var.q;
        int i2 = vk4Var.c;
        if (i2 == 0) {
            js2.o(objV);
            ug5 ug5Var = this.y.r;
            vk4Var.m = str;
            vk4Var.c = 1;
            objV = ug5Var.v(context, str, vk4Var);
            px0 px0Var = px0.j;
            if (objV == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vk4Var.m;
            js2.o(objV);
        }
        boolean zBooleanValue = ((Boolean) objV).booleanValue();
        eq eqVar = (eq) this.g.get(str);
        return Boolean.valueOf((eqVar != null ? eqVar.y.get() : false) && zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object r(Context context, eq eqVar, ou0 ou0Var) {
        xk4 xk4Var;
        Context context2;
        zk4 zk4Var = this.y;
        ug5 ug5Var = zk4Var.r;
        Class cls = zk4Var.g;
        if (ou0Var instanceof xk4) {
            xk4Var = (xk4) ou0Var;
            int i = xk4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk4Var.c = i - Integer.MIN_VALUE;
            } else {
                xk4Var = new xk4(this, ou0Var);
            }
        } else {
            xk4Var = new xk4(this, ou0Var);
        }
        Object obj = xk4Var.q;
        int i2 = xk4Var.c;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(obj);
            eq eqVar2 = (eq) this.g.put(eqVar.g, eqVar);
            if (eqVar2 != null) {
                eqVar2.n.g(null);
                eqVar2.y.set(false);
                eqVar2.m.x(null);
            }
            q70 q70Var = new q70(cls);
            ((sr5) q70Var.a).v = (qz0) zk4Var.y.l(zk4Var, eqVar);
            qk3 qk3VarZ = q70Var.z();
            String str = eqVar.g;
            xk4Var.m = context;
            xk4Var.c = 1;
            ug5Var.getClass();
            Object objG = gz5.g((ol4) new zq5(kr5.g(context), str, 1, Collections.singletonList(qk3VarZ)).g().a, xk4Var);
            if (objG != px0Var) {
                objG = og5Var;
            }
            if (objG != px0Var) {
                context2 = context;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context2 = xk4Var.m;
        js2.o(obj);
        xk4Var.m = null;
        xk4Var.c = 2;
        q70 q70Var2 = new q70(cls);
        q70Var2.A();
        du0 du0Var = new du0();
        vs0 vs0Var = new vs0();
        vs0Var.g = 1;
        vs0Var.x = -1L;
        vs0Var.l = -1L;
        new HashSet();
        vs0Var.y = true;
        vs0Var.r = false;
        vs0Var.g = 1;
        vs0Var.n = false;
        vs0Var.v = false;
        vs0Var.j = du0Var;
        vs0Var.x = -1L;
        vs0Var.l = -1L;
        ((sr5) q70Var2.a).a = vs0Var;
        qk3 qk3VarZ2 = q70Var2.z();
        ug5Var.getClass();
        Object objG2 = gz5.g((ol4) new zq5(kr5.g(context2), "sessionWorkerKeepEnabled", 2, Collections.singletonList(qk3VarZ2)).g().a, xk4Var);
        if (objG2 != px0Var) {
            objG2 = og5Var;
        }
        if (objG2 != px0Var) {
            objG2 = og5Var;
        }
        return objG2 == px0Var ? px0Var : og5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r13 == r9) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.eq r12, defpackage.ou0 r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.y(eq, ou0):java.lang.Object");
    }
}
