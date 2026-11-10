package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kg0 extends zz4 implements cz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(ng0 ng0Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.q = (byte) 0;
        this.c = ng0Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        switch (this.q) {
            case 0:
                ng0 ng0Var = (ng0) this.c;
                rg0 rg0Var = ng0Var.j;
                Throwable th = (Throwable) this.w;
                js2.o(obj);
                if (th instanceof a64) {
                    rg0Var.a(ok4.c);
                } else if (th instanceof d64) {
                    rg0Var.a(ok4.i);
                } else if (th instanceof ah5) {
                    ng0Var.t.g();
                    iv4 iv4Var = ng0Var.f;
                    if (iv4Var != null) {
                        iv4Var.x(null);
                    }
                }
                return og5.g;
            case 1:
                g61 g61Var = (g61) this.w;
                List<g61> list = (List) this.c;
                js2.o(obj);
                f13 f13Var = new f13();
                oq0 oq0Var = oq0.a;
                oq0 oq0Var2 = oq0.t;
                oq0 oq0Var3 = oq0.j;
                if (g61Var != null) {
                }
                for (g61 g61Var2 : list) {
                    f13Var.put(g61Var2.t, g61Var2.l() ? oq0Var3 : g61Var2.c == 1 ? oq0Var2 : oq0Var);
                }
                return f13Var.y();
            default:
                js2.o(obj);
                oo4 oo4Var = (oo4) this.w;
                db3 db3Var = (db3) this.c;
                Set setKeySet = db3Var.g().keySet();
                ArrayList arrayList = new ArrayList(dj0.Y(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rw3) it.next()).g);
                }
                LinkedHashMap linkedHashMapG = oo4Var.g();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapG.entrySet()) {
                    if (!arrayList.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                db3 db3VarL = db3Var.l();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        str.getClass();
                        db3VarL.x(new rw3(str), value);
                    } else if (value instanceof Float) {
                        str.getClass();
                        db3VarL.x(new rw3(str), value);
                    } else if (value instanceof Integer) {
                        str.getClass();
                        db3VarL.x(new rw3(str), value);
                    } else if (value instanceof Long) {
                        str.getClass();
                        db3VarL.x(new rw3(str), value);
                    } else if (value instanceof String) {
                        str.getClass();
                        db3VarL.x(new rw3(str), value);
                    } else if (value instanceof Set) {
                        str.getClass();
                        db3VarL.x(new rw3(str), (Set) value);
                    }
                }
                return db3VarL.j();
        }
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.q;
        int i = 3;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                kg0 kg0Var = new kg0((ng0) this.c, (mu0) obj3);
                kg0Var.w = (Throwable) obj2;
                kg0Var.u(og5Var);
                return og5Var;
            case 1:
                kg0 kg0Var2 = new kg0(i, (mu0) obj3, (byte) 1);
                kg0Var2.w = (g61) obj;
                kg0Var2.c = (List) obj2;
                return kg0Var2.u(og5Var);
            default:
                kg0 kg0Var3 = new kg0(i, (mu0) obj3, (byte) 2);
                kg0Var3.w = (oo4) obj;
                kg0Var3.c = (db3) obj2;
                return kg0Var3.u(og5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg0(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }
}
