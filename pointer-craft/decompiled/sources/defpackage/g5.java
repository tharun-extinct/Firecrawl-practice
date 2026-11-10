package defpackage;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g5 implements tl5 {
    public final /* synthetic */ byte g;
    public final Object y;

    public /* synthetic */ g5(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tl5
    public final pl5 y(Class cls, ea3 ea3Var) {
        pl5 pl5Var;
        Closeable closeable;
        ql5 ql5Var;
        rl5 rl5Var;
        xy1 xy1Var;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b = 1;
        pl5 pl5Var2 = null;
        switch (this.g) {
            case 0:
                sv1 sv1Var = new sv1();
                sv1Var.g = true;
                sv1Var.y = ea3Var;
                return new i5(new lz0(((nz0) ((h5) og0.f((yl0) this.y, h5.class))).g), sv1Var);
            case 1:
                final k84 k84Var = new k84();
                q64 q64Var = (q64) this.y;
                k33.F(ea3Var);
                nz0 nz0Var = (nz0) q64Var.t;
                oz0 oz0Var = new oz0();
                o14 o14Var = nz0Var.x;
                o14 o14Var2 = nz0Var.a;
                oz0Var.g = new hp(o14Var, o14Var2, objArr2 == true ? 1 : 0);
                kq kqVar = nz0Var.n;
                byte b2 = 2;
                oz0Var.y = new hp(kqVar, o14Var, b2);
                o14 o14Var3 = nz0Var.t;
                oz0Var.r = new e20(o14Var3, b);
                o14 o14Var4 = nz0Var.m;
                oz0Var.n = new e20(o14Var4, b2);
                kq kqVar2 = nz0Var.y;
                oz0Var.v = new rr0(kqVar2, nz0Var.r, o14Var3, o14Var2);
                hp hpVar = new hp(kqVar2, o14Var4, (byte) 4);
                e20 e20Var = nz0Var.q;
                oz0Var.x = new zv0(e20Var, hpVar, objArr == true ? 1 : 0);
                oz0Var.l = new hp(o14Var3, kqVar2, (byte) 5);
                e20 e20Var2 = new e20(e20Var, (byte) 9);
                oz0Var.j = new zv0(nz0Var.w, e20Var2, b);
                oz0Var.t = new bo2(e20Var, hpVar, e20Var2, o14Var4, kqVar2);
                oz0Var.a = new hp(kqVar, e20Var, (byte) 6);
                oz0Var.m = new hp(e20Var, kqVar2, (byte) 7);
                oz0 oz0Var2 = (oz0) ((t62) a11.u(t62.class, oz0Var));
                oz0Var2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(15);
                linkedHashMap.put("gp", oz0Var2.g);
                linkedHashMap.put("b30", oz0Var2.y);
                linkedHashMap.put("b90", oz0Var2.r);
                linkedHashMap.put("zk0", oz0Var2.n);
                linkedHashMap.put("qr0", oz0Var2.v);
                linkedHashMap.put("yv0", oz0Var2.x);
                linkedHashMap.put("sj2", oz0Var2.l);
                linkedHashMap.put("xl2", oz0Var2.j);
                linkedHashMap.put("ao2", oz0Var2.t);
                linkedHashMap.put("wm4", oz0Var2.a);
                linkedHashMap.put("un5", oz0Var2.m);
                p14 p14Var = (p14) (linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap)).get(cls.getName());
                xy1 xy1Var2 = (xy1) ea3Var.g.get(u62.n);
                ((oz0) ((t62) a11.u(t62.class, oz0Var))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (xy1Var2 != null) {
                        l0.a(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                    } else if (p14Var != null) {
                        pl5Var = (pl5) p14Var.get();
                        pl5Var2 = pl5Var;
                        closeable = new Closeable() { // from class: r62
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                hy5.r();
                                Iterator it = k84Var.g.iterator();
                                if (it.hasNext()) {
                                    fj.w(it.next());
                                    throw null;
                                }
                            }
                        };
                        pl5Var2.getClass();
                        ql5Var = pl5Var2.g;
                        if (ql5Var.n) {
                            ql5.g(closeable);
                        } else {
                            synchronized (ql5Var.g) {
                                ql5Var.r.add(closeable);
                            }
                        }
                    } else {
                        l0.a(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                    }
                } else {
                    if (p14Var != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (xy1Var2 != null) {
                        pl5Var = (pl5) xy1Var2.a(obj);
                        pl5Var2 = pl5Var;
                        closeable = new Closeable() { // from class: r62
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                hy5.r();
                                Iterator it = k84Var.g.iterator();
                                if (it.hasNext()) {
                                    fj.w(it.next());
                                    throw null;
                                }
                            }
                        };
                        pl5Var2.getClass();
                        ql5Var = pl5Var2.g;
                        if (ql5Var.n) {
                            ql5.g(closeable);
                        } else {
                            synchronized (ql5Var.g) {
                                ql5Var.r.add(closeable);
                            }
                        }
                    } else {
                        l0.a(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                    }
                }
                return pl5Var2;
            default:
                tf0 tf0VarG = v54.g(cls);
                rl5[] rl5VarArr = (rl5[]) this.y;
                rl5[] rl5VarArr2 = (rl5[]) Arrays.copyOf(rl5VarArr, rl5VarArr.length);
                int length = rl5VarArr2.length;
                while (true) {
                    if (i < length) {
                        rl5Var = rl5VarArr2[i];
                        if (!rl5Var.g.equals(tf0VarG)) {
                            i++;
                        }
                    } else {
                        rl5Var = null;
                    }
                }
                pl5 pl5Var3 = (rl5Var == null || (xy1Var = rl5Var.y) == null) ? null : (pl5) xy1Var.a(ea3Var);
                if (pl5Var3 != null) {
                    return pl5Var3;
                }
                l0.t(xi3.t("No initializer set for given class ", tf0VarG.y()));
                return null;
        }
    }
}
