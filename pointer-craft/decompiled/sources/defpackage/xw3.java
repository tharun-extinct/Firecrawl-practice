package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xw3 extends c12 {
    private static final xw3 DEFAULT_INSTANCE;
    private static volatile zp3 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private n13 preferences_ = n13.t;

    static {
        xw3 xw3Var = new xw3();
        DEFAULT_INSTANCE = xw3Var;
        c12.a(xw3.class, xw3Var);
    }

    public static vw3 c() {
        return (vw3) ((y02) DEFAULT_INSTANCE.r(5));
    }

    public static xw3 i(FileInputStream fileInputStream) {
        xw3 xw3Var = DEFAULT_INSTANCE;
        qi0 qi0Var = new qi0(fileInputStream);
        xm1 xm1VarG = xm1.g();
        c12 c12VarT = xw3Var.t();
        try {
            b14 b14Var = b14.r;
            b14Var.getClass();
            me4 me4VarG = b14Var.g(c12VarT.getClass());
            ti0 ti0Var = (ti0) qi0Var.t;
            if (ti0Var == null) {
                ti0Var = new ti0(qi0Var);
            }
            me4VarG.t(c12VarT, ti0Var, xm1VarG);
            me4VarG.y(c12VarT);
            if (c12.x(c12VarT, true)) {
                return (xw3) c12VarT;
            }
            throw new ig2(new kg5().getMessage());
        } catch (ig2 e) {
            if (e.j) {
                throw new ig2(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof ig2) {
                throw ((ig2) e2.getCause());
            }
            throw new ig2(e2.getMessage(), e2);
        } catch (kg5 e3) {
            throw new ig2(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ig2) {
                throw ((ig2) e4.getCause());
            }
            throw e4;
        }
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    @Override // defpackage.c12
    public final Object r(int i) {
        zp3 a12Var;
        switch (du4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a34(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ww3.g});
            case 3:
                return new xw3();
            case 4:
                return new vw3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                zp3 zp3Var = PARSER;
                if (zp3Var != null) {
                    return zp3Var;
                }
                synchronized (xw3.class) {
                    try {
                        a12Var = PARSER;
                        if (a12Var == null) {
                            a12Var = new a12();
                            PARSER = a12Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return a12Var;
            default:
                uo1.f();
                return null;
        }
    }

    public final n13 w() {
        n13 n13Var = this.preferences_;
        if (n13Var.j) {
            return n13Var;
        }
        n13 n13VarY = n13Var.y();
        this.preferences_ = n13VarY;
        return n13VarY;
    }
}
