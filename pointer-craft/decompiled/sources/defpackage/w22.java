package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w22 {
    public static final w22 g = new w22();
    public static final ec3 y = new ec3();
    public static final LinkedHashMap r = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Context context, x22 x22Var, String str, ou0 ou0Var) {
        s22 s22Var;
        ec3 ec3Var;
        if (ou0Var instanceof s22) {
            s22Var = (s22) ou0Var;
            int i = s22Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                s22Var.s = i - Integer.MIN_VALUE;
            } else {
                s22Var = new s22(this, ou0Var);
            }
        } else {
            s22Var = new s22(this, ou0Var);
        }
        Object obj = s22Var.i;
        int i2 = s22Var.s;
        if (i2 == 0) {
            js2.o(obj);
            s22Var.m = context;
            s22Var.q = x22Var;
            s22Var.w = str;
            ec3Var = y;
            s22Var.c = ec3Var;
            s22Var.s = 1;
            Object objY = ec3Var.y(s22Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ec3 ec3Var2 = s22Var.c;
            str = s22Var.w;
            x22Var = s22Var.q;
            Context context2 = s22Var.m;
            js2.o(obj);
            ec3Var = ec3Var2;
            context = context2;
        }
        try {
            r.remove(str);
            x22Var.g(context, str).delete();
            return og5.g;
        } finally {
            ec3Var.x(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Context context, x22 x22Var, String str, mt mtVar, ou0 ou0Var) throws Throwable {
        v22 v22Var;
        if (ou0Var instanceof v22) {
            v22Var = (v22) ou0Var;
            int i = v22Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v22Var.c = i - Integer.MIN_VALUE;
            } else {
                v22Var = new v22(this, ou0Var);
            }
        } else {
            v22Var = new v22(this, ou0Var);
        }
        Object objY = v22Var.q;
        int i2 = v22Var.c;
        Object obj = px0.j;
        if (i2 == 0) {
            js2.o(objY);
            v22Var.m = mtVar;
            v22Var.c = 1;
            objY = y(context, x22Var, str, v22Var);
            if (objY != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                js2.o(objY);
                return objY;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mtVar = v22Var.m;
        js2.o(objY);
        v22Var.m = null;
        v22Var.c = 2;
        Object objG = ((vz0) objY).g(mtVar, v22Var);
        return objG == obj ? obj : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(Context context, x22 x22Var, String str, ou0 ou0Var) {
        u22 u22Var;
        if (ou0Var instanceof u22) {
            u22Var = (u22) ou0Var;
            int i = u22Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                u22Var.w = i - Integer.MIN_VALUE;
            } else {
                u22Var = new u22(this, ou0Var);
            }
        } else {
            u22Var = new u22(this, ou0Var);
        }
        Object objY = u22Var.m;
        int i2 = u22Var.w;
        Object obj = px0.j;
        if (i2 == 0) {
            js2.o(objY);
            u22Var.w = 1;
            objY = y(context, x22Var, str, u22Var);
            if (objY != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                js2.o(objY);
                return objY;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(objY);
        er1 er1VarY = ((vz0) objY).y();
        u22Var.w = 2;
        Object objM = ue5.M(er1VarY, u22Var);
        return objM == obj ? obj : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(Context context, x22 x22Var, String str, ou0 ou0Var) throws Throwable {
        t22 t22Var;
        ec3 ec3Var;
        cc3 cc3Var;
        Throwable th;
        Object obj;
        String str2;
        Map map;
        if (ou0Var instanceof t22) {
            t22Var = (t22) ou0Var;
            int i = t22Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                t22Var.s = i - Integer.MIN_VALUE;
            } else {
                t22Var = new t22(this, ou0Var);
            }
        } else {
            t22Var = new t22(this, ou0Var);
        }
        Object obj2 = t22Var.i;
        int i2 = t22Var.s;
        px0 px0Var = px0.j;
        try {
            if (i2 == 0) {
                js2.o(obj2);
                t22Var.m = context;
                t22Var.q = x22Var;
                t22Var.w = str;
                ec3Var = y;
                t22Var.c = ec3Var;
                t22Var.s = 1;
                if (ec3Var.y(t22Var) != px0Var) {
                }
                return px0Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = t22Var.w;
                map = (Map) t22Var.q;
                cc3Var = (cc3) t22Var.m;
                try {
                    js2.o(obj2);
                    obj = (vz0) obj2;
                    map.put(str2, obj);
                    obj.getClass();
                    vz0 vz0Var = (vz0) obj;
                    cc3Var.x(null);
                    return vz0Var;
                } catch (Throwable th2) {
                    th = th2;
                    cc3Var.x(null);
                    throw th;
                }
            }
            ec3 ec3Var2 = t22Var.c;
            str = t22Var.w;
            x22Var = (x22) t22Var.q;
            Context context2 = (Context) t22Var.m;
            js2.o(obj2);
            ec3Var = ec3Var2;
            context = context2;
            LinkedHashMap linkedHashMap = r;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                t22Var.m = ec3Var;
                t22Var.q = linkedHashMap;
                t22Var.w = str;
                t22Var.c = null;
                t22Var.s = 2;
                Object objY = x22Var.y(context, str);
                if (objY != px0Var) {
                    String str3 = str;
                    cc3Var = ec3Var;
                    obj2 = objY;
                    str2 = str3;
                    map = linkedHashMap;
                    obj = (vz0) obj2;
                    map.put(str2, obj);
                }
                return px0Var;
            }
            cc3Var = ec3Var;
            obj.getClass();
            vz0 vz0Var2 = (vz0) obj;
            cc3Var.x(null);
            return vz0Var2;
        } catch (Throwable th3) {
            cc3Var = ec3Var;
            th = th3;
            cc3Var.x(null);
            throw th;
        }
    }
}
