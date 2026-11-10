package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ah3 {
    public yg3 a;
    public final um2 g;
    public xa3 j;
    public xa3 l;
    public gh3 n;
    public final sc2 r;
    public xa3 t;
    public final g25 v;
    public i73 x;
    public final zg3 y;

    public ah3(um2 um2Var) {
        this.g = um2Var;
        zg3 zg3Var = new zg3();
        zg3Var.m = -1;
        this.y = zg3Var;
        sc2 sc2Var = new sc2(um2Var);
        this.r = sc2Var;
        this.n = sc2Var;
        g25 g25Var = sc2Var.j0;
        this.v = g25Var;
        this.x = g25Var;
        this.l = new xa3();
    }

    public static i73 g(h73 h73Var, i73 i73Var) {
        i73 i73VarL;
        if (h73Var instanceof o73) {
            i73VarL = ((o73) h73Var).l();
            i73VarL.a = hh3.x(i73VarL);
        } else {
            rw rwVar = new rw();
            rwVar.a = hh3.n(h73Var);
            rwVar.o = h73Var;
            rwVar.k = new HashSet();
            i73VarL = rwVar;
        }
        if (i73VarL.h) {
            mc2.y("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        i73VarL.b = true;
        i73 i73Var2 = i73Var.w;
        if (i73Var2 != null) {
            i73Var2.q = i73VarL;
            i73VarL.w = i73Var2;
        }
        i73Var.w = i73VarL;
        i73VarL.q = i73Var;
        return i73VarL;
    }

    public static void j(h73 h73Var, h73 h73Var2, i73 i73Var) {
        if ((h73Var instanceof o73) && (h73Var2 instanceof o73)) {
            i73Var.getClass();
            ((o73) h73Var2).j(i73Var);
            if (i73Var.h) {
                hh3.r(i73Var);
                return;
            } else {
                i73Var.s = true;
                return;
            }
        }
        if (!(i73Var instanceof rw)) {
            mc2.y("Unknown Modifier.Node type");
            return;
        }
        rw rwVar = (rw) i73Var;
        if (rwVar.h) {
            rwVar.R0();
        }
        rwVar.o = h73Var2;
        rwVar.a = hh3.n(h73Var2);
        if (rwVar.h) {
            rwVar.Q0(false);
        }
        if (i73Var.h) {
            hh3.r(i73Var);
        } else {
            i73Var.s = true;
        }
    }

    public static i73 y(i73 i73Var) {
        boolean z = i73Var.h;
        if (z) {
            ta3 ta3Var = hh3.g;
            if (!z) {
                mc2.y("autoInvalidateRemovedNode called on unattached node");
            }
            hh3.g(i73Var, -1, 2);
            i73Var.N0();
            i73Var.H0();
        }
        i73 i73Var2 = i73Var.w;
        i73 i73Var3 = i73Var.q;
        if (i73Var2 != null) {
            i73Var2.q = i73Var3;
            i73Var.w = null;
        }
        if (i73Var3 != null) {
            i73Var3.w = i73Var2;
            i73Var.q = null;
        }
        i73Var3.getClass();
        return i73Var3;
    }

    public final void l() {
        um2 um2Var;
        nm2 nm2Var;
        on3 on3Var;
        i73 i73Var = this.v.q;
        gh3 gh3Var = this.r;
        while (true) {
            um2Var = this.g;
            if (i73Var == null) {
                break;
            }
            lm2 lm2VarF = k33.f(i73Var);
            if (lm2VarF != null) {
                gh3 gh3Var2 = i73Var.i;
                if (gh3Var2 != null) {
                    nm2Var = (nm2) gh3Var2;
                    lm2 lm2Var = nm2Var.j0;
                    nm2Var.C1(lm2VarF);
                    if (lm2Var != i73Var && (on3Var = nm2Var.a0) != null) {
                        ((a42) on3Var).r();
                    }
                } else {
                    nm2Var = new nm2(um2Var, lm2VarF);
                    i73Var.P0(nm2Var);
                }
                gh3Var.D = nm2Var;
                nm2Var.C = gh3Var;
                gh3Var = nm2Var;
            } else {
                i73Var.P0(gh3Var);
            }
            i73Var = i73Var.q;
        }
        um2 um2VarO = um2Var.o();
        gh3Var.D = um2VarO != null ? um2VarO.M.r : null;
        this.n = gh3Var;
    }

    public final void n(i73 i73Var, gh3 gh3Var) {
        for (i73 i73Var2 = i73Var.q; i73Var2 != null; i73Var2 = i73Var2.q) {
            if (i73Var2 == this.y) {
                um2 um2VarO = this.g.o();
                gh3Var.D = um2VarO != null ? um2VarO.M.r : null;
                this.n = gh3Var;
                return;
            } else {
                if ((i73Var2.a & 2) != 0) {
                    return;
                }
                i73Var2.P0(gh3Var);
            }
        }
    }

    public final boolean r(int i) {
        return (this.x.m & i) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        i73 i73Var = this.x;
        g25 g25Var = this.v;
        if (i73Var == g25Var) {
            sb.append("]");
        } else {
            while (i73Var != null && i73Var != g25Var) {
                sb.append(String.valueOf(i73Var));
                if (i73Var.w == g25Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                i73Var = i73Var.w;
            }
        }
        return sb.toString();
    }

    public final void v() {
        for (i73 i73Var = this.x; i73Var != null; i73Var = i73Var.w) {
            i73Var.M0();
            if (i73Var.b) {
                ta3 ta3Var = hh3.g;
                if (!i73Var.h) {
                    mc2.y("autoInvalidateInsertedNode called on unattached node");
                }
                hh3.g(i73Var, -1, 1);
            }
            if (i73Var.s) {
                hh3.r(i73Var);
            }
            i73Var.b = false;
            i73Var.s = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0143 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a1
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void x(int r32, defpackage.xa3 r33, defpackage.xa3 r34, defpackage.i73 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah3.x(int, xa3, xa3, i73, boolean):void");
    }
}
