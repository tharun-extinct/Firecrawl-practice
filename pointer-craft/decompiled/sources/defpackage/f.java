package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ f(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb A[Catch: all -> 0x01dd, LOOP:5: B:92:0x01af->B:109:0x01eb, LOOP_END, TryCatch #1 {all -> 0x01dd, blocks: (B:85:0x018c, B:87:0x019c, B:89:0x01a2, B:92:0x01af, B:94:0x01ba, B:96:0x01c4, B:98:0x01ca, B:100:0x01d3, B:105:0x01df, B:106:0x01e2, B:109:0x01eb, B:119:0x0211, B:110:0x01ef, B:111:0x01f5, B:113:0x01fb, B:115:0x0203, B:118:0x020d), top: B:309:0x018c }] */
    /* JADX WARN: Code duplicated, block: B:317:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[LOOP:2: B:39:0x00b8->B:52:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x013b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        Boolean bool;
        uc4 uc4Var;
        Object objW0;
        char c = 7;
        hb0 hb0VarD = null;
        wj4Var = null;
        wj4Var = null;
        wj4Var = null;
        wj4 wj4Var = null;
        dh2 dh2Var = null;
        boolean z = false;
        switch (this.j) {
            case 0:
                d dVar = (d) this.t;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dVar.g(0, h02Var);
                } else {
                    h02Var.Q();
                }
                return og5.g;
            case 1:
                fg4 fg4Var = (fg4) this.t;
                m50.T(fg4Var.E0(), null, new j1(fg4Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                ((ob3) this.t).setValue(new vb5(v13.x((ne2) obj, (ne2) obj2)));
                return og5.g;
            case 3:
                ga1 ga1Var = (ga1) this.t;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zX = h02Var2.x(ga1Var);
                    Object objK = h02Var2.K();
                    if (zX || objK == oo0.g) {
                        objK = new rk(ga1Var, (byte) 0);
                        h02Var2.i0(objK);
                    }
                    c93.s((my1) objK, null, false, null, null, null, by5.y, h02Var2, 805306368, 510);
                } else {
                    h02Var2.Q();
                }
                return og5.g;
            case 4:
                ik ikVar = (ik) this.t;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dk dkVar = (dk) ikVar;
                    t92.g(dkVar.g, (String) cj0.s0(tx4.h0(dkVar.g.g, new String[]{"."})), null, 0L, h02Var3, 0, 12);
                } else {
                    h02Var3.Q();
                }
                return og5.g;
            case 5:
                ((Integer) obj2).getClass();
                m50.a((qr0) this.t, (h02) obj, aq2.J(9));
                return og5.g;
            case 6:
                es4 es4Var = (es4) this.t;
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    jr2.v(es4Var, null, null, h02Var4, 0, 6);
                } else {
                    h02Var4.Q();
                }
                return og5.g;
            case 7:
                ((Integer) obj2).getClass();
                k33.p((aa3) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 8:
                ((Integer) obj2).getClass();
                z50.g((j73) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 9:
                ng0 ng0Var = (ng0) this.t;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ng0Var.n.y(str2, str);
                return og5.g;
            case 10:
                ((Integer) obj2).getClass();
                int i = ComposeView.u;
                ((ComposeView) this.t).g(aq2.J(1), (h02) obj);
                return og5.g;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                h02 h02Var5 = (h02) this.t;
                j73 j73Var = (j73) obj;
                j73 j73VarV = (h73) obj2;
                if (j73VarV instanceof no0) {
                    cz1 cz1Var = ((no0) j73VarV).o;
                    ue5.f(3, cz1Var);
                    j73VarV = m50.V(h02Var5, (j73) cz1Var.x(g73.g, h02Var5, 0));
                }
                return j73Var.n(j73VarV);
            case 12:
                i64 i64Var = (i64) this.t;
                ((Integer) obj).getClass();
                if (obj2 instanceof wn0) {
                    wn0 wn0Var = (wn0) obj2;
                    ib3 ib3Var = (ib3) i64Var.j;
                    if (ib3Var == null) {
                        ib3 ib3Var2 = fe4.g;
                        ib3Var = new ib3();
                        i64Var.j = ib3Var;
                    }
                    ib3Var.m(wn0Var);
                    ((rb3) i64Var.v).y(wn0Var);
                }
                if (obj2 instanceof l02) {
                    i64Var.x((l02) obj2);
                }
                if (obj2 instanceof u34) {
                    ((u34) obj2).r();
                }
                return og5.g;
            case 13:
                av0 av0Var = (av0) this.t;
                View view = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                view.getClass();
                motionEvent.getClass();
                int action = motionEvent.getAction();
                mu0 mu0Var = null;
                if (action != 0) {
                    bool = (action == 1 || action == 3) ? Boolean.FALSE : null;
                } else {
                    av0Var.Z(view);
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    Object tag = view.getTag();
                    tag.getClass();
                    m50.T(mq2.a(av0Var.b()), null, new yx((Object) av0Var, tag, zBooleanValue, mu0Var, (byte) 1), 3);
                }
                return Boolean.FALSE;
            case 14:
                xy1 xy1Var = (xy1) this.t;
                h02 h02Var6 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (h02Var6.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nm0 nm0Var = og0.r;
                    nm0 nm0Var2 = og0.n;
                    boolean zX2 = h02Var6.x(xy1Var);
                    Object objK2 = h02Var6.K();
                    if (zX2 || objK2 == oo0.g) {
                        objK2 = new y61(xy1Var, (byte) 0);
                        h02Var6.i0(objK2);
                    }
                    m50.q(nm0Var, nm0Var2, (my1) objK2, null, false, null, 0L, 0L, null, h02Var6, 54, 1016);
                } else {
                    h02Var6.Q();
                }
                return og5.g;
            case kq2.x /* 15 */:
                ((Integer) obj2).getClass();
                a11.g((n91) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 16:
                ((Integer) obj2).getClass();
                gp4.b((we1) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 17:
                sk2 sk2Var = (sk2) this.t;
                h02 h02Var7 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (h02Var7.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strI = sk2Var.y;
                    if (strI == null) {
                        h02Var7.X(-153360136);
                        strI = xs2.I(R.string.control_custom, h02Var7);
                    } else {
                        h02Var7.X(-153360601);
                    }
                    h02Var7.b(false);
                    g75.y(strI, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var7.a(of5.g)).w, h02Var7, 0, 0, 131070);
                } else {
                    h02Var7.Q();
                }
                return og5.g;
            case 18:
                ((Integer) obj2).getClass();
                ((ec2) this.t).g(aq2.J(1), (h02) obj);
                return og5.g;
            case 19:
                List list = (List) this.t;
                h02 h02Var8 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (h02Var8.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        bz1 bz1Var = (bz1) list.get(i2);
                        int iHashCode = Long.hashCode(h02Var8.T);
                        jo0.n.getClass();
                        y4 y4Var = tg1.a;
                        h02Var8.b0();
                        if (h02Var8.S) {
                            h02Var8.m(y4Var);
                        } else {
                            h02Var8.l0();
                        }
                        xs2.E(tg1.c, h02Var8, Integer.valueOf(iHashCode));
                        bz1Var.l(h02Var8, 0);
                        h02Var8.b(true);
                    }
                } else {
                    h02Var8.Q();
                }
                return og5.g;
            case 20:
                wm4 wm4Var = (wm4) this.t;
                View view2 = (View) obj;
                MotionEvent motionEvent2 = (MotionEvent) obj2;
                view2.getClass();
                motionEvent2.getClass();
                int action2 = motionEvent2.getAction();
                if (action2 != 0) {
                    if (action2 == 1 || action2 == 3) {
                        if (motionEvent2.getEventTime() - motionEvent2.getDownTime() > 200) {
                            wm4Var.m(false);
                            view2.setActivated(false);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                view2.setActivated(!view2.isActivated());
                wm4Var.m(view2.isActivated());
                z = true;
                return Boolean.valueOf(z);
            case 21:
                pc4 pc4Var = (pc4) obj;
                List list2 = (List) ((bz1) this.t).l(pc4Var, obj2);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj3 = list2.get(i3);
                    if (obj3 != null && (uc4Var = pc4Var.t) != null && !uc4Var.n(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i3 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 22:
                String str3 = (String) obj;
                str3.getClass();
                ((gp) this.t).l((Integer) obj2, str3);
                return og5.g;
            case 23:
                Context context = (Context) this.t;
                h02 h02Var9 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (h02Var9.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p04 p04VarG = d43.g(4, 1, false);
                    String string = context.getString(R.string.widget_media_remote_label);
                    string.getClass();
                    lr2.t(p04VarG, null, null, string, 1000, null, h02Var9, 25008, 32);
                } else {
                    h02Var9.Q();
                }
                return og5.g;
            case 24:
                ((Integer) obj2).getClass();
                c93.w((kk3) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 25:
                a44 a44Var = (a44) this.t;
                Set set = (Set) obj;
                synchronized (a44Var.n) {
                    try {
                        if (((x34) a44Var.f.getValue()).compareTo(x34.q) >= 0) {
                            ib3 ib3Var3 = a44Var.t;
                            if (set instanceof ge4) {
                                ib3 ib3Var4 = ((ge4) set).j;
                                Object[] objArr = ib3Var4.y;
                                long[] jArr = ib3Var4.g;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((j & 255) < 128) {
                                                    Object obj4 = objArr[(i4 << 3) + i6];
                                                    if (!(obj4 instanceof xw4) || ((xw4) obj4).z(1)) {
                                                        ib3Var3.g(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i5 == 8) {
                                                if (i4 != length) {
                                                    i4++;
                                                    c = 7;
                                                }
                                            }
                                        } else if (i4 != length) {
                                            i4++;
                                            c = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof xw4) || ((xw4) obj5).z(1)) {
                                        ib3Var3.g(obj5);
                                    }
                                }
                            }
                            hb0VarD = a44Var.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (hb0VarD != null) {
                    ((ib0) hb0VarD).j(og5.g);
                }
                return og5.g;
            case 26:
                dc4 dc4Var = (dc4) this.t;
                int iIntValue9 = ((Integer) obj).intValue();
                dx0 dx0Var = (dx0) obj2;
                ex0 key = dx0Var.getKey();
                dx0 dx0VarH = dc4Var.q.h(key);
                if (key == d52.m) {
                    dh2 dh2Var2 = (dh2) dx0VarH;
                    dh2 parent = (dh2) dx0Var;
                    while (parent != null) {
                        if (parent != dh2Var2 && (parent instanceof re4)) {
                            be0 be0Var = (be0) qr.g.getObjectVolatile((re4) parent, nh2.t);
                            parent = be0Var != null ? be0Var.getParent() : null;
                        } else {
                            dh2Var = parent;
                            if (dh2Var == dh2Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + dh2Var + ", expected child of " + dh2Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (dh2Var2 != null) {
                                iIntValue9++;
                            }
                        }
                    }
                    if (dh2Var == dh2Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + dh2Var + ", expected child of " + dh2Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (dh2Var2 != null) {
                        iIntValue9++;
                    }
                } else if (dx0Var != dx0VarH) {
                    iIntValue9 = Integer.MIN_VALUE;
                } else {
                    iIntValue9++;
                }
                return Integer.valueOf(iIntValue9);
            case 27:
                zp4 zp4Var = (zp4) this.t;
                Set set2 = (Set) obj;
                synchronized (zp4Var.g) {
                    try {
                        ib3 ib3Var5 = zp4Var.n;
                        if (ib3Var5 != null) {
                            Object[] objArr2 = ib3Var5.y;
                            long[] jArr2 = ib3Var5.g;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j2 = jArr2[i7];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < i8) {
                                                if ((j2 & 255) >= 128 || !set2.contains(objArr2[(i7 << 3) + i9])) {
                                                    j2 >>= 8;
                                                    i9++;
                                                } else {
                                                    wj4Var = zp4Var.x;
                                                }
                                            } else if (i8 == 8) {
                                                if (i7 != length2) {
                                                    i7++;
                                                }
                                            }
                                        }
                                    } else if (i7 != length2) {
                                        i7++;
                                    }
                                }
                            }
                        } else if (cj0.f0(set2, zp4Var.y)) {
                            wj4Var = zp4Var.x;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (wj4Var != null) {
                    wj4Var.z(og5.g);
                }
                return og5.g;
            case 28:
                ut4 ut4Var = (ut4) this.t;
                Set set3 = (Set) obj;
                AtomicReference atomicReference = ut4Var.y;
                while (true) {
                    Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        objW0 = set3;
                    } else if (obj6 instanceof Set) {
                        objW0 = pw5.d(obj6, set3);
                    } else {
                        if (!(obj6 instanceof List)) {
                            qo0.y("Unexpected notification");
                            l0.x();
                            return null;
                        }
                        objW0 = cj0.w0((Collection) obj6, pw5.k(set3));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj6, objW0)) {
                            if (ut4Var.r()) {
                                ut4Var.g.a(new gd4(ut4Var, (byte) 6));
                            }
                            return og5.g;
                        }
                    } while (atomicReference.get() == obj6);
                }
                break;
            default:
                return new je2(((long) ((i00) this.t).g(0, (int) (((qe2) obj).g >> 32), (fl2) obj2)) << 32);
        }
    }

    public /* synthetic */ f(Object obj, int i, byte b) {
        this.j = b;
        this.t = obj;
    }
}
