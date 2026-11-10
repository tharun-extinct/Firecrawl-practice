package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w12 {
    public static Object x(w12 w12Var, Context context, int i, ou0 ou0Var) {
        w12Var.getClass();
        jb5.g();
        Object objY = w12Var.y(context, new tp(i), null, new v12(), ou0Var);
        return objY == px0.j ? objY : og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Context context, int i, ou0 ou0Var) throws Throwable {
        r12 r12Var;
        tp tpVar;
        tp tpVar2;
        Throwable th;
        Context context2;
        int i2;
        tp tpVar3;
        Throwable th2;
        w22 w22Var;
        String strU;
        Context context3;
        w22 w22Var2;
        String strU2;
        Context context4;
        w22 w22Var3;
        String strU3;
        Context context5;
        StringBuilder sb;
        if (ou0Var instanceof r12) {
            r12Var = (r12) ou0Var;
            int i3 = r12Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r12Var.s = i3 - Integer.MIN_VALUE;
            } else {
                r12Var = new r12(this, ou0Var);
            }
        } else {
            r12Var = new r12(this, ou0Var);
        }
        Object obj = r12Var.i;
        int i4 = r12Var.s;
        mu0 mu0Var = null;
        og5 og5Var = og5.g;
        uw3 uw3Var = uw3.g;
        px0 px0Var = px0.j;
        switch (i4) {
            case 0:
                js2.o(obj);
                tpVar = new tp(i);
                zk4 zk4VarG = al4.g();
                s12 s12Var = new s12(tpVar, mu0Var, (byte) 0);
                r12Var.m = context;
                r12Var.q = tpVar;
                r12Var.c = i;
                r12Var.s = 1;
                if (zk4VarG.g(s12Var, r12Var) != px0Var) {
                    try {
                        r12Var.m = context;
                        r12Var.q = tpVar;
                        r12Var.c = i;
                        r12Var.s = 2;
                        if (og5Var != px0Var) {
                            context2 = context;
                            tpVar3 = tpVar;
                            w22Var3 = w22.g;
                            strU3 = ra.u(i);
                            r12Var.m = context2;
                            r12Var.q = tpVar3;
                            r12Var.s = 3;
                            if (w22Var3.g(context2, uw3Var, strU3, r12Var) != px0Var) {
                                context5 = context2;
                                if (tpVar3 != null && !ra.F(tpVar3)) {
                                    try {
                                        m50.H(context5, js2.c(tpVar3.g())).delete();
                                    } catch (Exception e) {
                                        e = e;
                                        sb = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                        sb.append(tpVar3);
                                        Log.d("GlanceAppWidget", sb.toString(), e);
                                    }
                                    break;
                                }
                                return og5Var;
                            }
                        }
                    } catch (CancellationException unused) {
                        context2 = context;
                        tpVar3 = tpVar;
                        w22Var2 = w22.g;
                        strU2 = ra.u(i);
                        r12Var.m = context2;
                        r12Var.q = tpVar3;
                        r12Var.s = 4;
                        if (w22Var2.g(context2, uw3Var, strU2, r12Var) != px0Var) {
                            context4 = context2;
                            if (tpVar3 != null) {
                                try {
                                    m50.H(context4, js2.c(tpVar3.g())).delete();
                                } catch (Exception e2) {
                                    e = e2;
                                    sb = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                    sb.append(tpVar3);
                                    Log.d("GlanceAppWidget", sb.toString(), e);
                                }
                                break;
                            }
                            return og5Var;
                        }
                    } catch (Throwable th3) {
                        int i5 = i;
                        tpVar2 = tpVar;
                        th = th3;
                        context2 = context;
                        i2 = i5;
                        try {
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                            w22Var = w22.g;
                            strU = ra.u(i2);
                            r12Var.m = context2;
                            r12Var.q = tpVar2;
                            r12Var.s = 5;
                            if (w22Var.g(context2, uw3Var, strU, r12Var) != px0Var) {
                                tpVar3 = tpVar2;
                                context3 = context2;
                                if (tpVar3 != null) {
                                    try {
                                        m50.H(context3, js2.c(tpVar3.g())).delete();
                                    } catch (Exception e3) {
                                        e = e3;
                                        sb = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                        sb.append(tpVar3);
                                        Log.d("GlanceAppWidget", sb.toString(), e);
                                    }
                                    break;
                                }
                                return og5Var;
                            }
                        } catch (Throwable th4) {
                            w22 w22Var4 = w22.g;
                            String strU4 = ra.u(i2);
                            r12Var.m = context2;
                            r12Var.q = tpVar2;
                            r12Var.w = th4;
                            r12Var.s = 6;
                            if (w22Var4.g(context2, uw3Var, strU4, r12Var) != px0Var) {
                                th2 = th4;
                                if (tpVar2 != null) {
                                    throw th2;
                                }
                                throw th2;
                            }
                        }
                    }
                }
                return px0Var;
            case 1:
                i = r12Var.c;
                tp tpVar4 = r12Var.q;
                Context context6 = r12Var.m;
                js2.o(obj);
                tpVar = tpVar4;
                context = context6;
                r12Var.m = context;
                r12Var.q = tpVar;
                r12Var.c = i;
                r12Var.s = 2;
                if (og5Var != px0Var) {
                    context2 = context;
                    tpVar3 = tpVar;
                    w22Var3 = w22.g;
                    strU3 = ra.u(i);
                    r12Var.m = context2;
                    r12Var.q = tpVar3;
                    r12Var.s = 3;
                    if (w22Var3.g(context2, uw3Var, strU3, r12Var) != px0Var) {
                        context5 = context2;
                        if (tpVar3 != null) {
                            m50.H(context5, js2.c(tpVar3.g())).delete();
                            break;
                        }
                        return og5Var;
                    }
                }
                return px0Var;
            case 2:
                i2 = r12Var.c;
                tpVar2 = r12Var.q;
                context2 = r12Var.m;
                try {
                    js2.o(obj);
                    i = i2;
                    tpVar3 = tpVar2;
                    w22Var3 = w22.g;
                    strU3 = ra.u(i);
                    r12Var.m = context2;
                    r12Var.q = tpVar3;
                    r12Var.s = 3;
                    if (w22Var3.g(context2, uw3Var, strU3, r12Var) != px0Var) {
                        context5 = context2;
                        if (tpVar3 != null) {
                            m50.H(context5, js2.c(tpVar3.g())).delete();
                            break;
                        }
                        return og5Var;
                    }
                } catch (CancellationException unused2) {
                    i = i2;
                    tpVar3 = tpVar2;
                    w22Var2 = w22.g;
                    strU2 = ra.u(i);
                    r12Var.m = context2;
                    r12Var.q = tpVar3;
                    r12Var.s = 4;
                    if (w22Var2.g(context2, uw3Var, strU2, r12Var) != px0Var) {
                        context4 = context2;
                        if (tpVar3 != null) {
                            m50.H(context4, js2.c(tpVar3.g())).delete();
                            break;
                        }
                        return og5Var;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                    w22Var = w22.g;
                    strU = ra.u(i2);
                    r12Var.m = context2;
                    r12Var.q = tpVar2;
                    r12Var.s = 5;
                    if (w22Var.g(context2, uw3Var, strU, r12Var) != px0Var) {
                        tpVar3 = tpVar2;
                        context3 = context2;
                        if (tpVar3 != null) {
                            m50.H(context3, js2.c(tpVar3.g())).delete();
                            break;
                        }
                        return og5Var;
                    }
                }
                return px0Var;
            case 3:
                tpVar3 = r12Var.q;
                context5 = r12Var.m;
                js2.o(obj);
                if (tpVar3 != null) {
                    m50.H(context5, js2.c(tpVar3.g())).delete();
                    break;
                }
                return og5Var;
            case 4:
                tpVar3 = r12Var.q;
                context4 = r12Var.m;
                js2.o(obj);
                if (tpVar3 != null && !ra.F(tpVar3)) {
                    m50.H(context4, js2.c(tpVar3.g())).delete();
                    break;
                }
                return og5Var;
            case 5:
                tpVar3 = r12Var.q;
                context3 = r12Var.m;
                js2.o(obj);
                if (tpVar3 != null && !ra.F(tpVar3)) {
                    m50.H(context3, js2.c(tpVar3.g())).delete();
                    break;
                }
                return og5Var;
            case 6:
                th2 = r12Var.w;
                tpVar2 = r12Var.q;
                context2 = r12Var.m;
                js2.o(obj);
                if (tpVar2 != null || ra.F(tpVar2)) {
                    throw th2;
                }
                try {
                    m50.H(context2, js2.c(tpVar2.g())).delete();
                    throw th2;
                } catch (Exception e4) {
                    Log.d("GlanceAppWidget", "Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id " + tpVar2, e4);
                    throw th2;
                }
            default:
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public abstract void n(Context context, int i, ou0 ou0Var);

    public abstract void r(Context context, tp tpVar, ou0 ou0Var);

    public final Object v(Context context, tp tpVar, ou0 ou0Var) {
        if (tpVar == null || ra.F(tpVar)) {
            l0.u("Invalid Glance ID");
            return null;
        }
        Object objX = x(this, context, tpVar.g(), ou0Var);
        return objX == px0.j ? objX : og5.g;
    }

    public final Object y(Context context, tp tpVar, Bundle bundle, dz1 dz1Var, ou0 ou0Var) {
        return al4.g().g(new t12(context, tpVar, this, bundle, dz1Var, null), ou0Var);
    }
}
