package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xu0 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q = 2;
    public final /* synthetic */ Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(av0 av0Var, p04 p04Var, String str, ViewGroup viewGroup, LayoutInflater layoutInflater, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = av0Var;
        this.i = p04Var;
        this.b = str;
        this.s = viewGroup;
        this.p = layoutInflater;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.p;
        Object obj3 = this.s;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return new xu0((av0) this.c, (p04) this.i, (String) obj4, (ViewGroup) obj3, (LayoutInflater) obj2, mu0Var);
            case 1:
                xu0 xu0Var = new xu0((ju2) this.i, (wt2) obj4, (fx0) obj3, (er1) obj2, mu0Var);
                xu0Var.c = obj;
                return xu0Var;
            default:
                xu0 xu0Var2 = new xu0((a44) obj4, (z34) obj3, (s73) obj2, mu0Var);
                xu0Var2.i = obj;
                return xu0Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((xu0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((xu0) b((mu0) obj2, (dz3) obj)).u(og5Var);
            default:
                return ((xu0) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff A[Catch: all -> 0x0129, TryCatch #2 {all -> 0x0129, blocks: (B:43:0x00eb, B:44:0x00f1, B:46:0x00f6, B:47:0x00f7, B:49:0x00ff, B:51:0x010d, B:53:0x0113, B:56:0x0119, B:58:0x011d, B:59:0x0120, B:60:0x0123, B:64:0x012b, B:84:0x017a, B:85:0x017b, B:45:0x00f2), top: B:135:0x00eb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010d A[Catch: all -> 0x0129, TryCatch #2 {all -> 0x0129, blocks: (B:43:0x00eb, B:44:0x00f1, B:46:0x00f6, B:47:0x00f7, B:49:0x00ff, B:51:0x010d, B:53:0x0113, B:56:0x0119, B:58:0x011d, B:59:0x0120, B:60:0x0123, B:64:0x012b, B:84:0x017a, B:85:0x017b, B:45:0x00f2), top: B:135:0x00eb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0113 A[Catch: all -> 0x0129, TryCatch #2 {all -> 0x0129, blocks: (B:43:0x00eb, B:44:0x00f1, B:46:0x00f6, B:47:0x00f7, B:49:0x00ff, B:51:0x010d, B:53:0x0113, B:56:0x0119, B:58:0x011d, B:59:0x0120, B:60:0x0123, B:64:0x012b, B:84:0x017a, B:85:0x017b, B:45:0x00f2), top: B:135:0x00eb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157 A[Catch: all -> 0x015a, TryCatch #4 {all -> 0x015a, blocks: (B:70:0x0153, B:72:0x0157, B:75:0x015d, B:77:0x0163), top: B:138:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0163 A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #4 {all -> 0x015a, blocks: (B:70:0x0153, B:72:0x0157, B:75:0x015d, B:77:0x0163), top: B:138:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x018a A[Catch: all -> 0x018d, TryCatch #5 {all -> 0x018d, blocks: (B:88:0x0186, B:90:0x018a, B:93:0x0190, B:95:0x0196), top: B:140:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0196 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #5 {all -> 0x018d, blocks: (B:88:0x0186, B:90:0x018a, B:93:0x0190, B:95:0x0196), top: B:140:0x0186 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00ff, please report this as an issue */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        dh2 dh2VarK;
        ew4 ew4Var;
        fs3 fs3Var;
        fs3 fs3Var2;
        d5 d5Var;
        a44 a44Var;
        List listD;
        int size;
        int i;
        zh zhVar;
        int i2;
        u34 u34Var;
        yo0 yo0Var;
        a44 a44Var2;
        a44 a44Var3;
        mu0 mu0Var = null;
        switch (this.q) {
            case 0:
                av0 av0Var = (av0) this.c;
                px0 px0Var = px0.j;
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    er1 er1Var = av0Var.W().j;
                    wu0 wu0Var = new wu0(av0Var, (p04) this.i, (String) this.b, (ViewGroup) this.s, (LayoutInflater) this.p);
                    this.w = true;
                    if (er1Var.r(wu0Var, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 1:
                px0 px0Var2 = px0.j;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    dz3 dz3Var = (dz3) this.c;
                    ju2 ju2Var = (ju2) this.i;
                    wt2 wt2Var = (wt2) this.b;
                    hh0 hh0Var = new hh0((fx0) this.s, (er1) this.p, dz3Var, null, (byte) 2);
                    this.w = true;
                    if (br2.A(ju2Var, wt2Var, hh0Var, this) == px0Var2) {
                        return px0Var2;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            default:
                px0 px0Var3 = px0.j;
                boolean z3 = this.w;
                if (z3) {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d5Var = (d5) this.c;
                    dh2VarK = (dh2) this.i;
                    try {
                        js2.o(obj);
                        d5Var.y();
                        a44Var3 = (a44) this.b;
                        synchronized (a44Var3.n) {
                            try {
                                if (a44Var3.v == dh2VarK) {
                                    a44Var3.v = null;
                                }
                                if (a44Var3.d() != null) {
                                    qo0.g("called outside of runRecomposeAndApplyChanges");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        ew4 ew4Var2 = a44.B;
                        v13.C(((a44) this.b).A);
                        return og5.g;
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        d5Var.y();
                        a44Var2 = (a44) this.b;
                        synchronized (a44Var2.n) {
                            try {
                                if (a44Var2.v == dh2VarK) {
                                    a44Var2.v = null;
                                }
                                if (a44Var2.d() != null) {
                                    qo0.g("called outside of runRecomposeAndApplyChanges");
                                    break;
                                }
                                ew4 ew4Var3 = a44.B;
                                v13.C(((a44) this.b).A);
                                throw th3;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
                js2.o(obj);
                dh2VarK = v70.k(((ox0) this.i).w());
                a44 a44Var4 = (a44) this.b;
                ew4 ew4Var4 = a44.B;
                synchronized (a44Var4.n) {
                    Throwable th5 = a44Var4.x;
                    if (th5 != null) {
                        throw th5;
                    }
                    if (((x34) a44Var4.f.getValue()).compareTo(x34.t) <= 0) {
                        throw new IllegalStateException("Recomposer shut down");
                    }
                    if (a44Var4.v != null) {
                        throw new IllegalStateException("Recomposer already running");
                    }
                    a44Var4.v = dh2VarK;
                    if (a44Var4.d() != null) {
                        qo0.g("called outside of runRecomposeAndApplyChanges");
                    }
                }
                f fVar = new f((a44) this.b, (byte) 25);
                it4.y(it4.g);
                synchronized (it4.r) {
                    it4.j = cj0.x0(it4.j, fVar);
                }
                d5 d5Var2 = new d5(fVar, (byte) 7);
                hi0 hi0Var = ((a44) this.b).A;
                try {
                    do {
                        ew4Var = a44.B;
                        fs3Var = (fs3) ew4Var.getValue();
                        tg1 tg1Var = tg1.b;
                        ur3 ur3Var = fs3Var.a;
                        if (ur3Var.containsKey(hi0Var)) {
                            fs3Var2 = fs3Var;
                        } else if (fs3Var.isEmpty()) {
                            fs3Var2 = new fs3(hi0Var, hi0Var, ur3Var.g(hi0Var, new qv2(tg1Var, tg1Var)));
                        } else {
                            Object obj2 = fs3Var.t;
                            Object obj3 = ur3Var.get(obj2);
                            obj3.getClass();
                            fs3Var2 = new fs3(fs3Var.j, hi0Var, ur3Var.g(obj2, new qv2(((qv2) obj3).g, hi0Var)).g(hi0Var, new qv2(obj2, tg1Var)));
                        }
                        if (fs3Var != fs3Var2) {
                        }
                        a44Var = (a44) this.b;
                        synchronized (a44Var.n) {
                            listD = a44Var.D();
                        }
                        size = listD.size();
                        for (i = 0; i < size; i++) {
                            for (Object obj4 : ((yo0) listD.get(i)).w.a) {
                                if (obj4 instanceof u34) {
                                    u34Var = (u34) obj4;
                                } else {
                                    u34Var = null;
                                }
                                if (u34Var == null && (yo0Var = u34Var.g) != null) {
                                    yo0Var.u(u34Var, null);
                                }
                            }
                        }
                        zhVar = new zh((z34) this.s, (s73) this.p, mu0Var, (byte) 13);
                        this.i = dh2VarK;
                        this.c = d5Var2;
                        this.w = true;
                        if (k33.B(zhVar, this) == px0Var3) {
                            return px0Var3;
                        }
                        d5Var = d5Var2;
                        d5Var.y();
                        a44Var3 = (a44) this.b;
                        synchronized (a44Var3.n) {
                            if (a44Var3.v == dh2VarK) {
                                a44Var3.v = null;
                            }
                            if (a44Var3.d() != null) {
                                qo0.g("called outside of runRecomposeAndApplyChanges");
                                break;
                            }
                            ew4 ew4Var5 = a44.B;
                            v13.C(((a44) this.b).A);
                            return og5.g;
                        }
                    } while (!ew4Var.t(fs3Var, fs3Var2));
                    a44Var = (a44) this.b;
                    synchronized (a44Var.n) {
                        listD = a44Var.D();
                        size = listD.size();
                        while (i < size) {
                            while (i2 < r9) {
                                if (obj4 instanceof u34) {
                                    u34Var = (u34) obj4;
                                } else {
                                    u34Var = null;
                                }
                                if (u34Var == null) {
                                }
                            }
                        }
                        zhVar = new zh((z34) this.s, (s73) this.p, mu0Var, (byte) 13);
                        this.i = dh2VarK;
                        this.c = d5Var2;
                        this.w = true;
                        if (k33.B(zhVar, this) == px0Var3) {
                            return px0Var3;
                        }
                        d5Var = d5Var2;
                        d5Var.y();
                        a44Var3 = (a44) this.b;
                        synchronized (a44Var3.n) {
                            if (a44Var3.v == dh2VarK) {
                                a44Var3.v = null;
                            }
                            if (a44Var3.d() != null) {
                                qo0.g("called outside of runRecomposeAndApplyChanges");
                                break;
                            }
                            ew4 ew4Var6 = a44.B;
                            v13.C(((a44) this.b).A);
                            return og5.g;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    d5Var = d5Var2;
                    Throwable th7 = th;
                    d5Var.y();
                    a44Var2 = (a44) this.b;
                    synchronized (a44Var2.n) {
                        if (a44Var2.v == dh2VarK) {
                            a44Var2.v = null;
                        }
                        if (a44Var2.d() != null) {
                            qo0.g("called outside of runRecomposeAndApplyChanges");
                        }
                        break;
                    }
                    ew4 ew4Var7 = a44.B;
                    v13.C(((a44) this.b).A);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(ju2 ju2Var, wt2 wt2Var, fx0 fx0Var, er1 er1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = ju2Var;
        this.b = wt2Var;
        this.s = fx0Var;
        this.p = er1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(a44 a44Var, z34 z34Var, s73 s73Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = a44Var;
        this.s = z34Var;
        this.p = s73Var;
    }
}
