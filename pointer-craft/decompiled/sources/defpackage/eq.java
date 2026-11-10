package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class eq {
    public Map a;
    public final String g;
    public final tp3 j;
    public final pq4 l;
    public final fh2 m;
    public final m70 n;
    public final ew4 q;
    public final AtomicBoolean r;
    public final tp3 t;
    public final w12 v;
    public final tp x;
    public final AtomicBoolean y;

    public eq(w12 w12Var, tp tpVar, Bundle bundle) {
        w22 w22Var = w22.g;
        this.g = ra.u(tpVar.g());
        this.y = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.n = v70.y(Integer.MAX_VALUE, 6, null);
        this.v = w12Var;
        this.x = tpVar;
        this.l = nq4.g;
        if (ra.F(tpVar)) {
            l0.u("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        hi0 hi0Var = hi0.B;
        this.j = new tp3(null, hi0Var);
        this.t = new tp3(bundle, hi0Var);
        this.a = qi1.j;
        this.m = v70.v();
        this.q = y94.w(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object r(eq eqVar, Context context, Object obj, ou0 ou0Var) {
        bq bqVar;
        nb3 nb3VarC;
        nb3 nb3VarC2;
        nb3 nb3VarC3;
        String str = eqVar.g;
        if (ou0Var instanceof bq) {
            bqVar = (bq) ou0Var;
            int i = bqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bqVar.c = i - Integer.MIN_VALUE;
            } else {
                bqVar = new bq(eqVar, ou0Var);
            }
        } else {
            bqVar = new bq(eqVar, ou0Var);
        }
        Object objR = bqVar.q;
        int i2 = bqVar.c;
        og5 og5Var = og5.g;
        og5 og5Var2 = null;
        if (i2 == 0) {
            js2.o(objR);
            if (!(obj instanceof yp)) {
                if (obj instanceof xp) {
                    at4 at4VarJ = it4.j();
                    nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
                    if (nb3Var == null || (nb3VarC2 = nb3Var.C(null, null)) == null) {
                        l0.z("Cannot create a mutable snapshot of an read-only snapshot");
                        return null;
                    }
                    try {
                        at4 at4VarA = nb3VarC2.a();
                        try {
                            eqVar.t.setValue(((xp) obj).g);
                            at4.s(at4VarA);
                            nb3VarC2.f().v();
                            nb3VarC2.r();
                            return og5Var;
                        } catch (Throwable th) {
                            at4.s(at4VarA);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        nb3VarC2.r();
                        throw th2;
                    }
                }
                if (obj instanceof wp) {
                    at4 at4VarJ2 = it4.j();
                    nb3 nb3Var2 = at4VarJ2 instanceof nb3 ? (nb3) at4VarJ2 : null;
                    if (nb3Var2 == null || (nb3VarC = nb3Var2.C(null, null)) == null) {
                        l0.z("Cannot create a mutable snapshot of an read-only snapshot");
                        return null;
                    }
                    try {
                        at4 at4VarA2 = nb3VarC.a();
                        try {
                            List list = (List) eqVar.a.get(((wp) obj).g);
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((lk2) it.next()).y.g();
                                }
                                og5Var2 = og5Var;
                            }
                            at4.s(at4VarA2);
                            nb3VarC.f().v();
                            nb3VarC.r();
                            if (og5Var2 == null) {
                                new Integer(Log.w("AppWidgetSession", "Triggering Action(" + ((wp) obj).g + ") for session(" + str + ") failed"));
                                return og5Var;
                            }
                        } catch (Throwable th3) {
                            at4.s(at4VarA2);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        nb3VarC.r();
                        throw th4;
                    }
                } else {
                    if (!(obj instanceof zp)) {
                        up.l(obj.getClass(), " to AppWidgetSession", "Sent unrecognized event type ");
                        return null;
                    }
                    fh2 fh2Var = ((zp) obj).g;
                    if (fh2Var.y()) {
                        fh2Var.f0(og5Var);
                    }
                }
                return og5Var;
            }
            w22 w22Var = w22.g;
            bqVar.m = eqVar;
            bqVar.c = 1;
            objR = w22Var.r(context, uw3.g, str, bqVar);
            px0 px0Var = px0.j;
            if (objR == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eqVar = bqVar.m;
            js2.o(objR);
        }
        at4 at4VarJ3 = it4.j();
        nb3 nb3Var3 = at4VarJ3 instanceof nb3 ? (nb3) at4VarJ3 : null;
        if (nb3Var3 == null || (nb3VarC3 = nb3Var3.C(null, null)) == null) {
            l0.z("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            at4 at4VarA3 = nb3VarC3.a();
            try {
                eqVar.j.setValue(objR);
                at4.s(at4VarA3);
                nb3VarC3.f().v();
                nb3VarC3.r();
                return og5Var;
            } catch (Throwable th5) {
                at4.s(at4VarA3);
                throw th5;
            }
        } catch (Throwable th6) {
            nb3VarC3.r();
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a4 -> B:32:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object v(defpackage.eq r9, java.util.ArrayList r10, defpackage.ou0 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.cq
            if (r0 == 0) goto L13
            r0 = r11
            cq r0 = (defpackage.cq) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            cq r0 = new cq
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.p
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L31
            int r9 = r0.i
            int r10 = r0.c
            java.util.List r1 = r0.w
            eq r2 = r0.q
            eq r4 = r0.m
            defpackage.js2.o(r11)
            goto La7
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r9)
            return r2
        L37:
            defpackage.js2.o(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r10.size()
            r4 = 0
            r5 = r4
        L45:
            if (r5 >= r1) goto L55
            java.lang.Object r6 = r10.get(r5)
            int r5 = r5 + 1
            boolean r7 = r6 instanceof defpackage.wp
            if (r7 == 0) goto L45
            r11.add(r6)
            goto L45
        L55:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r10.size()
            r6 = r4
        L5f:
            if (r6 >= r5) goto L6f
            java.lang.Object r7 = r10.get(r6)
            int r6 = r6 + 1
            boolean r8 = r7 instanceof defpackage.xp
            if (r8 == 0) goto L5f
            r1.add(r7)
            goto L5f
        L6f:
            java.lang.Object r10 = defpackage.cj0.s0(r1)
            xp r10 = (defpackage.xp) r10
            if (r10 == 0) goto L79
            android.os.Bundle r2 = r10.g
        L79:
            eq r10 = new eq
            w12 r1 = r9.v
            tp r9 = r9.x
            r10.<init>(r1, r9, r2)
            int r9 = r11.size()
            r2 = r10
            r1 = r11
            r10 = r4
            r4 = r2
        L8a:
            if (r10 >= r9) goto La9
            java.lang.Object r11 = r1.get(r10)
            wp r11 = (defpackage.wp) r11
            r0.m = r4
            r0.q = r2
            r0.w = r1
            r0.c = r10
            r0.i = r9
            r0.p = r3
            java.lang.Object r11 = r2.x(r11, r0)
            px0 r5 = defpackage.px0.j
            if (r11 != r5) goto La7
            return r5
        La7:
            int r10 = r10 + r3
            goto L8a
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.v(eq, java.util.ArrayList, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (r3.y(r5) == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        if (r3.y(r5) == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        if (r3.y(r5) == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        if (r3.y(r5) == r13) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object y(defpackage.eq r21, android.content.Context r22, defpackage.jh1 r23, defpackage.ou0 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.y(eq, android.content.Context, jh1, ou0):java.lang.Object");
    }

    public final void g(Context context, Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        AppWidgetManager.getInstance(context).updateAppWidget(this.x.g, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(ou0 ou0Var) {
        dq dqVar;
        zp zpVar;
        if (ou0Var instanceof dq) {
            dqVar = (dq) ou0Var;
            int i = dqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqVar.c = i - Integer.MIN_VALUE;
            } else {
                dqVar = new dq(this, ou0Var);
            }
        } else {
            dqVar = new dq(this, ou0Var);
        }
        Object obj = dqVar.q;
        int i2 = dqVar.c;
        if (i2 == 0) {
            js2.o(obj);
            zp zpVar2 = new zp(new fh2(this.m));
            dqVar.m = zpVar2;
            dqVar.c = 1;
            Object objX = x(zpVar2, dqVar);
            Object obj2 = px0.j;
            if (objX == obj2) {
                return obj2;
            }
            zpVar = zpVar2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zpVar = dqVar.m;
            js2.o(obj);
        }
        return zpVar.g;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[Catch: li0 -> 0x007e, TRY_LEAVE, TryCatch #0 {li0 -> 0x007e, blocks: (B:13:0x002c, B:22:0x004e, B:26:0x0060, B:28:0x0068, B:18:0x0040, B:21:0x0047), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r(r6, r1, r9, r0) == r4) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007b -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(android.content.Context r7, defpackage.q2 r8, defpackage.ou0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.sk4
            if (r0 == 0) goto L13
            r0 = r9
            sk4 r0 = (defpackage.sk4) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            sk4 r0 = new sk4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.b
            r2 = 2
            r3 = 1
            px0 r4 = defpackage.px0.j
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            h70 r7 = r0.w
            xy1 r8 = r0.q
            android.content.Context r1 = r0.m
            defpackage.js2.o(r9)     // Catch: defpackage.li0 -> L7e
        L2f:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L4e
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            r6 = 0
            return r6
        L3a:
            h70 r7 = r0.w
            xy1 r8 = r0.q
            android.content.Context r1 = r0.m
            defpackage.js2.o(r9)     // Catch: defpackage.li0 -> L7e
            goto L60
        L44:
            defpackage.js2.o(r9)
            m70 r9 = r6.n     // Catch: defpackage.li0 -> L7e
            h70 r1 = new h70     // Catch: defpackage.li0 -> L7e
            r1.<init>(r9)     // Catch: defpackage.li0 -> L7e
        L4e:
            r0.m = r7     // Catch: defpackage.li0 -> L7e
            r0.q = r8     // Catch: defpackage.li0 -> L7e
            r0.w = r1     // Catch: defpackage.li0 -> L7e
            r0.b = r3     // Catch: defpackage.li0 -> L7e
            java.lang.Object r9 = r1.y(r0)     // Catch: defpackage.li0 -> L7e
            if (r9 != r4) goto L5d
            goto L7d
        L5d:
            r5 = r1
            r1 = r7
            r7 = r5
        L60:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: defpackage.li0 -> L7e
            boolean r9 = r9.booleanValue()     // Catch: defpackage.li0 -> L7e
            if (r9 == 0) goto L7e
            java.lang.Object r9 = r7.r()     // Catch: defpackage.li0 -> L7e
            r8.a(r9)     // Catch: defpackage.li0 -> L7e
            r0.m = r1     // Catch: defpackage.li0 -> L7e
            r0.q = r8     // Catch: defpackage.li0 -> L7e
            r0.w = r7     // Catch: defpackage.li0 -> L7e
            r0.b = r2     // Catch: defpackage.li0 -> L7e
            java.lang.Object r9 = r(r6, r1, r9, r0)     // Catch: defpackage.li0 -> L7e
            if (r9 != r4) goto L2f
        L7d:
            return r4
        L7e:
            og5 r6 = defpackage.og5.g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.n(android.content.Context, q2, ou0):java.lang.Object");
    }

    public final Object x(Object obj, ou0 ou0Var) {
        Object objR = this.n.r(ou0Var, obj);
        return objR == px0.j ? objR : og5.g;
    }
}
