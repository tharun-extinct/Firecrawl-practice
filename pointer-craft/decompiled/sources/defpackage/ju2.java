package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ju2 {
    public final ew4 a;
    public boolean l;
    public final et4 n;
    public wt2 t;
    public int v;
    public boolean x;
    public final boolean y;
    public y22 g = new y22((byte) 7);
    public ro r = new ro((byte) 14);
    public final ArrayList j = new ArrayList();

    public ju2(gu2 gu2Var, boolean z) {
        this.y = z;
        this.n = new et4(gu2Var);
        wt2 wt2Var = wt2.t;
        this.t = wt2Var;
        this.a = y94.w(wt2Var);
    }

    public final void g(fu2 fu2Var) {
        du2 ecVar;
        iu2 iu2Var;
        gu2 gu2Var;
        vt2 vt2Var;
        fu2Var.getClass();
        r("addObserver");
        wt2 wt2Var = this.t;
        wt2 wt2Var2 = wt2.j;
        if (wt2Var != wt2Var2) {
            wt2Var2 = wt2.t;
        }
        iu2 iu2Var2 = new iu2();
        iu2Var2.g = wt2Var2;
        HashMap map = qu2.g;
        boolean z = fu2Var instanceof du2;
        boolean z2 = fu2Var instanceof n21;
        byte b = 0;
        if (z && z2) {
            ecVar = new p21((n21) fu2Var, (du2) fu2Var);
        } else if (z2) {
            ecVar = new p21((n21) fu2Var, null);
        } else if (z) {
            ecVar = (du2) fu2Var;
        } else {
            Class<?> cls = fu2Var.getClass();
            if (qu2.y(cls) == 2) {
                Object obj = qu2.y.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    qu2.g((Constructor) list.get(0), fu2Var);
                    throw null;
                }
                int size = list.size();
                p02[] p02VarArr = new p02[size];
                if (size > 0) {
                    qu2.g((Constructor) list.get(0), fu2Var);
                    throw null;
                }
                ecVar = new ro0(p02VarArr, b);
            } else {
                ecVar = new ec(fu2Var);
            }
        }
        iu2Var2.y = ecVar;
        ro roVar = this.r;
        roVar.getClass();
        hb3 hb3Var = (hb3) roVar.t;
        pn1 pn1Var = (pn1) hb3Var.l(fu2Var);
        if (pn1Var != null) {
            iu2Var = pn1Var.t;
        } else {
            pn1 pn1Var2 = new pn1(fu2Var, iu2Var2);
            hb3Var.c(fu2Var, pn1Var2);
            pn1 pn1Var3 = (pn1) roVar.m;
            if (pn1Var3 == null) {
                roVar.a = pn1Var2;
                roVar.m = pn1Var2;
            } else {
                pn1Var3.a = pn1Var2;
                pn1Var2.m = pn1Var3;
                roVar.m = pn1Var2;
            }
            iu2Var = null;
        }
        if (iu2Var == null && (gu2Var = (gu2) ((WeakReference) this.n.t).get()) != null) {
            b = (this.v != 0 || this.x) ? (byte) 1 : (byte) 0;
            wt2 wt2VarY = y(fu2Var);
            this.v++;
            while (iu2Var2.g.compareTo(wt2VarY) < 0) {
                ro roVar2 = this.r;
                roVar2.getClass();
                if (!((hb3) roVar2.t).r(fu2Var)) {
                    break;
                }
                wt2 wt2Var3 = iu2Var2.g;
                ArrayList arrayList = this.j;
                arrayList.add(wt2Var3);
                tt2 tt2Var = vt2.Companion;
                wt2 wt2Var4 = iu2Var2.g;
                tt2Var.getClass();
                wt2Var4.getClass();
                int iOrdinal = wt2Var4.ordinal();
                if (iOrdinal == 1) {
                    vt2Var = vt2.ON_CREATE;
                } else if (iOrdinal != 2) {
                    vt2Var = iOrdinal != 3 ? null : vt2.ON_RESUME;
                } else {
                    vt2Var = vt2.ON_START;
                }
                if (vt2Var == null) {
                    t94.n(iu2Var2.g, "no event up from ");
                    return;
                } else {
                    iu2Var2.g(gu2Var, vt2Var);
                    hj0.e0(arrayList);
                    wt2VarY = y(fu2Var);
                }
            }
            if (b == 0) {
                j();
            }
            this.v--;
        }
    }

    public final void j() {
        Object obj = ((WeakReference) this.n.t).get();
        if (obj == null) {
            l0.z("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final gu2 gu2Var = (gu2) obj;
        while (true) {
            ro roVar = this.r;
            final byte b = 0;
            if (((hb3) roVar.t).v == 0) {
                break;
            }
            pn1 pn1Var = (pn1) roVar.a;
            if (pn1Var == null) {
                l0.s("Collection is empty.");
                return;
            }
            wt2 wt2Var = pn1Var.t.g;
            pn1 pn1Var2 = (pn1) roVar.m;
            if (pn1Var2 == null) {
                l0.s("Collection is empty.");
                return;
            }
            wt2 wt2Var2 = pn1Var2.t.g;
            if (wt2Var == wt2Var2 && this.t == wt2Var2) {
                break;
            }
            this.l = false;
            wt2 wt2Var3 = this.t;
            if (pn1Var == null) {
                l0.s("Collection is empty.");
                return;
            }
            if (wt2Var3.compareTo(wt2Var) < 0) {
                ro roVar2 = this.r;
                xy1 xy1Var = new xy1(this) { // from class: hu2
                    public final /* synthetic */ ju2 t;

                    {
                        this.t = this;
                    }

                    @Override // defpackage.xy1
                    public final Object a(Object obj2) {
                        vt2 vt2Var;
                        vt2 vt2Var2;
                        byte b2 = b;
                        og5 og5Var = og5.g;
                        gu2 gu2Var2 = gu2Var;
                        ju2 ju2Var = this.t;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b2) {
                            case 0:
                                entry.getClass();
                                fu2 fu2Var = (fu2) entry.getKey();
                                iu2 iu2Var = (iu2) entry.getValue();
                                while (true) {
                                    wt2 wt2Var4 = iu2Var.g;
                                    wt2 wt2Var5 = ju2Var.t;
                                    ArrayList arrayList = ju2Var.j;
                                    if (wt2Var4.compareTo(wt2Var5) <= 0 || ju2Var.l) {
                                        return og5Var;
                                    }
                                    ro roVar3 = ju2Var.r;
                                    roVar3.getClass();
                                    fu2Var.getClass();
                                    if (!((hb3) roVar3.t).r(fu2Var)) {
                                        return og5Var;
                                    }
                                    tt2 tt2Var = vt2.Companion;
                                    wt2 wt2Var6 = iu2Var.g;
                                    tt2Var.getClass();
                                    wt2Var6.getClass();
                                    int iOrdinal = wt2Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        vt2Var = vt2.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        vt2Var = iOrdinal != 4 ? null : vt2.ON_PAUSE;
                                    } else {
                                        vt2Var = vt2.ON_STOP;
                                    }
                                    if (vt2Var == null) {
                                        uo1.p(iu2Var.g, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(vt2Var.g());
                                    iu2Var.g(gu2Var2, vt2Var);
                                    hj0.e0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                fu2 fu2Var2 = (fu2) entry.getKey();
                                iu2 iu2Var2 = (iu2) entry.getValue();
                                while (true) {
                                    wt2 wt2Var7 = iu2Var2.g;
                                    wt2 wt2Var8 = ju2Var.t;
                                    ArrayList arrayList2 = ju2Var.j;
                                    if (wt2Var7.compareTo(wt2Var8) >= 0 || ju2Var.l) {
                                        return og5Var;
                                    }
                                    ro roVar4 = ju2Var.r;
                                    roVar4.getClass();
                                    fu2Var2.getClass();
                                    if (!((hb3) roVar4.t).r(fu2Var2)) {
                                        return og5Var;
                                    }
                                    arrayList2.add(iu2Var2.g);
                                    tt2 tt2Var2 = vt2.Companion;
                                    wt2 wt2Var9 = iu2Var2.g;
                                    tt2Var2.getClass();
                                    wt2Var9.getClass();
                                    int iOrdinal2 = wt2Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        vt2Var2 = vt2.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        vt2Var2 = iOrdinal2 != 3 ? null : vt2.ON_RESUME;
                                    } else {
                                        vt2Var2 = vt2.ON_START;
                                    }
                                    if (vt2Var2 == null) {
                                        uo1.p(iu2Var2.g, "no event up from ");
                                        return null;
                                    }
                                    iu2Var2.g(gu2Var2, vt2Var2);
                                    hj0.e0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                roVar2.getClass();
                for (pn1 pn1Var3 = (pn1) roVar2.m; pn1Var3 != null; pn1Var3 = pn1Var3.m) {
                    if (!pn1Var3.q) {
                        xy1Var.a(pn1Var3);
                    }
                }
            }
            pn1 pn1Var4 = (pn1) this.r.m;
            if (!this.l && pn1Var4 != null && this.t.compareTo(pn1Var4.t.g) > 0) {
                ro roVar3 = this.r;
                final byte b2 = 1;
                xy1 xy1Var2 = new xy1(this) { // from class: hu2
                    public final /* synthetic */ ju2 t;

                    {
                        this.t = this;
                    }

                    @Override // defpackage.xy1
                    public final Object a(Object obj2) {
                        vt2 vt2Var;
                        vt2 vt2Var2;
                        byte b3 = b2;
                        og5 og5Var = og5.g;
                        gu2 gu2Var2 = gu2Var;
                        ju2 ju2Var = this.t;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b3) {
                            case 0:
                                entry.getClass();
                                fu2 fu2Var = (fu2) entry.getKey();
                                iu2 iu2Var = (iu2) entry.getValue();
                                while (true) {
                                    wt2 wt2Var4 = iu2Var.g;
                                    wt2 wt2Var5 = ju2Var.t;
                                    ArrayList arrayList = ju2Var.j;
                                    if (wt2Var4.compareTo(wt2Var5) <= 0 || ju2Var.l) {
                                        return og5Var;
                                    }
                                    ro roVar4 = ju2Var.r;
                                    roVar4.getClass();
                                    fu2Var.getClass();
                                    if (!((hb3) roVar4.t).r(fu2Var)) {
                                        return og5Var;
                                    }
                                    tt2 tt2Var = vt2.Companion;
                                    wt2 wt2Var6 = iu2Var.g;
                                    tt2Var.getClass();
                                    wt2Var6.getClass();
                                    int iOrdinal = wt2Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        vt2Var = vt2.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        vt2Var = iOrdinal != 4 ? null : vt2.ON_PAUSE;
                                    } else {
                                        vt2Var = vt2.ON_STOP;
                                    }
                                    if (vt2Var == null) {
                                        uo1.p(iu2Var.g, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(vt2Var.g());
                                    iu2Var.g(gu2Var2, vt2Var);
                                    hj0.e0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                fu2 fu2Var2 = (fu2) entry.getKey();
                                iu2 iu2Var2 = (iu2) entry.getValue();
                                while (true) {
                                    wt2 wt2Var7 = iu2Var2.g;
                                    wt2 wt2Var8 = ju2Var.t;
                                    ArrayList arrayList2 = ju2Var.j;
                                    if (wt2Var7.compareTo(wt2Var8) >= 0 || ju2Var.l) {
                                        return og5Var;
                                    }
                                    ro roVar5 = ju2Var.r;
                                    roVar5.getClass();
                                    fu2Var2.getClass();
                                    if (!((hb3) roVar5.t).r(fu2Var2)) {
                                        return og5Var;
                                    }
                                    arrayList2.add(iu2Var2.g);
                                    tt2 tt2Var2 = vt2.Companion;
                                    wt2 wt2Var9 = iu2Var2.g;
                                    tt2Var2.getClass();
                                    wt2Var9.getClass();
                                    int iOrdinal2 = wt2Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        vt2Var2 = vt2.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        vt2Var2 = iOrdinal2 != 3 ? null : vt2.ON_RESUME;
                                    } else {
                                        vt2Var2 = vt2.ON_START;
                                    }
                                    if (vt2Var2 == null) {
                                        uo1.p(iu2Var2.g, "no event up from ");
                                        return null;
                                    }
                                    iu2Var2.g(gu2Var2, vt2Var2);
                                    hj0.e0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                roVar3.getClass();
                for (pn1 pn1Var5 = (pn1) roVar3.a; pn1Var5 != null; pn1Var5 = pn1Var5.a) {
                    if (!pn1Var5.q) {
                        xy1Var2.a(pn1Var5);
                    }
                }
            }
        }
        this.l = false;
        this.a.a(this.t);
    }

    public final void l(wt2 wt2Var) {
        wt2Var.getClass();
        r("setCurrentState");
        v(wt2Var);
    }

    public final void n(vt2 vt2Var) {
        vt2Var.getClass();
        r("handleLifecycleEvent");
        v(vt2Var.g());
    }

    public final void r(String str) {
        if (this.y) {
            tq.K().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            uo1.x(du4.i("Method ", str, " must be called on the main thread"));
        }
    }

    public final void v(wt2 wt2Var) {
        if (this.t == wt2Var) {
            return;
        }
        gu2 gu2Var = (gu2) ((WeakReference) this.n.t).get();
        wt2 wt2Var2 = this.t;
        wt2 wt2Var3 = wt2.t;
        wt2 wt2Var4 = wt2.j;
        if (wt2Var2 == wt2Var3 && wt2Var == wt2Var4) {
            throw new IllegalStateException(("State must be at least '" + wt2.a + "' to be moved to '" + wt2Var + "' in component " + gu2Var).toString());
        }
        if (wt2Var2 == wt2Var4 && wt2Var2 != wt2Var) {
            throw new IllegalStateException(("State is '" + wt2Var4 + "' and cannot be moved to `" + wt2Var + "` in component " + gu2Var).toString());
        }
        this.t = wt2Var;
        if (this.x || this.v != 0) {
            this.l = true;
            return;
        }
        this.x = true;
        j();
        this.x = false;
        if (this.t == wt2Var4) {
            this.r = new ro((byte) 14);
        }
    }

    public final void x(fu2 fu2Var) {
        fu2Var.getClass();
        r("removeObserver");
        ro roVar = this.r;
        roVar.getClass();
        pn1 pn1Var = (pn1) ((hb3) roVar.t).q(fu2Var);
        if (pn1Var == null) {
            return;
        }
        pn1 pn1Var2 = pn1Var.m;
        pn1 pn1Var3 = pn1Var.a;
        if (pn1Var2 == null) {
            roVar.a = pn1Var3;
        } else {
            pn1Var2.a = pn1Var3;
        }
        pn1 pn1Var4 = pn1Var.a;
        if (pn1Var4 == null) {
            roVar.m = pn1Var2;
        } else {
            pn1Var4.m = pn1Var2;
        }
        pn1Var.q = true;
    }

    public final wt2 y(fu2 fu2Var) {
        ro roVar = this.r;
        roVar.getClass();
        fu2Var.getClass();
        pn1 pn1Var = (pn1) ((hb3) roVar.t).l(fu2Var);
        pn1 pn1Var2 = pn1Var != null ? pn1Var.m : null;
        wt2 wt2Var = pn1Var2 != null ? pn1Var2.t.g : null;
        ArrayList arrayList = this.j;
        wt2 wt2Var2 = arrayList.isEmpty() ? null : (wt2) arrayList.get(arrayList.size() - 1);
        wt2 wt2Var3 = this.t;
        if (wt2Var == null || wt2Var.compareTo(wt2Var3) >= 0) {
            wt2Var = wt2Var3;
        }
        return (wt2Var2 == null || wt2Var2.compareTo(wt2Var) >= 0) ? wt2Var : wt2Var2;
    }
}
