package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ae5 {
    public static final String[] q = {"INSERT", "UPDATE", "DELETE"};
    public final x94 g;
    public final ri3 j;
    public final String[] l;
    public final boolean n;
    public final HashMap r;
    public final y22 t;
    public final w v;
    public final HashMap y;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public my1 m = new y4((byte) 20);
    public final LinkedHashMap x = new LinkedHashMap();

    public ae5(x94 x94Var, HashMap map, HashMap map2, String[] strArr, boolean z, w wVar) {
        String lowerCase;
        this.g = x94Var;
        this.y = map;
        this.r = map2;
        this.n = z;
        this.v = wVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.x.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.y.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.y.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.x.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.x;
                linkedHashMap.put(lowerCase4, v13.i(lowerCase3, linkedHashMap));
            }
        }
        this.j = new ri3(this.l.length);
        this.t = new y22(this.l.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(gv3 gv3Var, ou0 ou0Var) {
        td5 td5Var;
        if (ou0Var instanceof td5) {
            td5Var = (td5) ou0Var;
            int i = td5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                td5Var.c = i - Integer.MIN_VALUE;
            } else {
                td5Var = new td5(this, ou0Var);
            }
        } else {
            td5Var = new td5(this, ou0Var);
        }
        Object objN = td5Var.q;
        int i2 = td5Var.c;
        byte b = 1;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(objN);
            qc5 qc5Var = new qc5(b);
            td5Var.m = gv3Var;
            td5Var.c = 1;
            objN = gv3Var.n("SELECT * FROM room_table_modification_log WHERE invalidated = 1", qc5Var, td5Var);
            if (objN != px0Var) {
            }
            return px0Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) td5Var.m;
            js2.o(objN);
            return set;
        }
        gv3Var = (gv3) td5Var.m;
        js2.o(objN);
        Set set2 = (Set) objN;
        if (!set2.isEmpty()) {
            td5Var.m = set2;
            td5Var.c = 2;
            if (js2.a(gv3Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", td5Var) == px0Var) {
                return px0Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (defpackage.js2.a(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (defpackage.js2.a(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d5 -> B:28:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.tb5 r18, int r19, defpackage.ou0 r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae5.n(tb5, int, ou0):java.lang.Object");
    }

    public final void r(my1 my1Var, my1 my1Var2) {
        my1Var.getClass();
        my1Var2.getClass();
        if (this.a.compareAndSet(false, true)) {
            my1Var.g();
            ku0 ku0Var = this.g.g;
            mu0 mu0Var = null;
            if (ku0Var != null) {
                m50.T(ku0Var, new kx0(kx0.t), new op(this, my1Var2, mu0Var, (byte) 16), 2);
            } else {
                yf2.Y("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:19:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object v(defpackage.tb5 r8, int r9, defpackage.ou0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.xd5
            if (r0 == 0) goto L13
            r0 = r10
            xd5 r0 = (defpackage.xd5) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            xd5 r0 = new xd5
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.p
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.i
            int r8 = r0.c
            java.lang.String[] r9 = r0.w
            java.lang.String r1 = r0.q
            gv3 r3 = r0.m
            defpackage.js2.o(r10)
            r10 = r9
            r9 = r3
            goto L8c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            r7 = 0
            return r7
        L38:
            defpackage.js2.o(r10)
            java.lang.String[] r7 = r7.l
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.ae5.q
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L8e
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.m = r9
            r0.q = r1
            r0.w = r10
            r0.c = r8
            r0.i = r7
            r0.p = r2
            java.lang.Object r3 = defpackage.js2.a(r9, r3, r0)
            px0 r4 = defpackage.px0.j
            if (r3 != r4) goto L8c
            return r4
        L8c:
            int r8 = r8 + r2
            goto L4a
        L8e:
            og5 r7 = defpackage.og5.g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae5.v(tb5, int, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(ou0 ou0Var) {
        yd5 yd5Var;
        ro roVar;
        if (ou0Var instanceof yd5) {
            yd5Var = (yd5) ou0Var;
            int i = yd5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yd5Var.c = i - Integer.MIN_VALUE;
            } else {
                yd5Var = new yd5(this, ou0Var);
            }
        } else {
            yd5Var = new yd5(this, ou0Var);
        }
        Object obj = yd5Var.q;
        int i2 = yd5Var.c;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(obj);
            x94 x94Var = this.g;
            ro roVar2 = x94Var.l;
            if (roVar2.y()) {
                try {
                    hh0 hh0Var = new hh0((Object) this, mu0Var, (byte) 4);
                    yd5Var.m = roVar2;
                    yd5Var.c = 1;
                    Object objP = x94Var.p(false, hh0Var, yd5Var);
                    px0 px0Var = px0.j;
                    if (objP == px0Var) {
                        return px0Var;
                    }
                    roVar = roVar2;
                    roVar.e0();
                } catch (Throwable th) {
                    th = th;
                    roVar = roVar2;
                    roVar.e0();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            roVar = yd5Var.m;
            try {
                js2.o(obj);
                roVar.e0();
            } catch (Throwable th2) {
                th = th2;
                roVar.e0();
                throw th;
            }
        }
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(ou0 ou0Var) throws Throwable {
        vd5 vd5Var;
        ro roVar;
        Object value;
        int[] iArr;
        if (ou0Var instanceof vd5) {
            vd5Var = (vd5) ou0Var;
            int i = vd5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd5Var.c = i - Integer.MIN_VALUE;
            } else {
                vd5Var = new vd5(this, ou0Var);
            }
        } else {
            vd5Var = new vd5(this, ou0Var);
        }
        Object objP = vd5Var.q;
        int i2 = vd5Var.c;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(objP);
            x94 x94Var = this.g;
            ro roVar2 = x94Var.l;
            boolean zY = roVar2.y();
            vi1 vi1Var = vi1.j;
            if (!zY) {
                return vi1Var;
            }
            try {
                if (!this.a.compareAndSet(true, false)) {
                    roVar2.e0();
                    return vi1Var;
                }
                if (!((Boolean) this.m.g()).booleanValue()) {
                    roVar2.e0();
                    return vi1Var;
                }
                fp fpVar = new fp(this, mu0Var, (byte) 4);
                vd5Var.m = roVar2;
                vd5Var.c = 1;
                objP = x94Var.p(false, fpVar, vd5Var);
                px0 px0Var = px0.j;
                if (objP == px0Var) {
                    return px0Var;
                }
                roVar = roVar2;
            } catch (Throwable th) {
                th = th;
                roVar = roVar2;
                roVar.e0();
                throw th;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            roVar = vd5Var.m;
            try {
                js2.o(objP);
            } catch (Throwable th2) {
                th = th2;
                roVar.e0();
                throw th;
            }
        }
        Set set = (Set) objP;
        if (!set.isEmpty()) {
            y22 y22Var = this.t;
            set.getClass();
            if (!set.isEmpty()) {
                ew4 ew4Var = (ew4) y22Var.t;
                do {
                    value = ew4Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!ew4Var.t(value, iArr));
            }
            this.v.a(set);
        }
        roVar.e0();
        return set;
    }
}
