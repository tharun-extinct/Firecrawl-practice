package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b14 {
    public static final b14 r = new b14();
    public final ConcurrentHashMap y = new ConcurrentHashMap();
    public final y22 g = new y22((byte) 2);

    public final me4 g(Class cls) {
        zm1 zm1Var;
        me4 me4VarF;
        Class cls2;
        gf2.g(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.y;
        me4 me4Var = (me4) concurrentHashMap.get(cls);
        if (me4Var != null) {
            return me4Var;
        }
        Class cls3 = qe4.g;
        if (!c12.class.isAssignableFrom(cls) && (cls2 = qe4.g) != null && !cls2.isAssignableFrom(cls)) {
            l0.u("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        a34 a34VarG = ((a13) this.g.t).g(cls);
        if ((a34VarG.n & 2) == 2) {
            if (c12.class.isAssignableFrom(cls)) {
                me4VarF = r53.a(qe4.r, bn1.g, a34VarG.g);
            } else {
                sg5 sg5Var = qe4.y;
                zm1 zm1Var2 = bn1.y;
                if (zm1Var2 == null) {
                    l0.z("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                me4VarF = r53.a(sg5Var, zm1Var2, a34VarG.g);
            }
        } else if (c12.class.isAssignableFrom(cls)) {
            me4VarF = p53.f(a34VarG, vg3.y, zv2.y, qe4.r, du4.D(a34VarG.g()) != 1 ? bn1.g : null, r13.y);
        } else {
            tg3 tg3Var = vg3.g;
            xv2 xv2Var = zv2.g;
            sg5 sg5Var2 = qe4.y;
            if (du4.D(a34VarG.g()) != 1) {
                zm1 zm1Var3 = bn1.y;
                if (zm1Var3 == null) {
                    l0.z("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                zm1Var = zm1Var3;
            } else {
                zm1Var = null;
            }
            me4VarF = p53.f(a34VarG, tg3Var, xv2Var, sg5Var2, zm1Var, r13.g);
        }
        me4 me4Var2 = (me4) concurrentHashMap.putIfAbsent(cls, me4VarF);
        return me4Var2 != null ? me4Var2 : me4VarF;
    }
}
