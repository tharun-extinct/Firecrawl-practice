package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vo2 extends b12 {
    private static final vo2 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile yp3 PARSER;
    private df2 layout_ = c14.m;
    private int nextIndex_;

    static {
        vo2 vo2Var = new vo2();
        DEFAULT_INSTANCE = vo2Var;
        b12.a(vo2.class, vo2Var);
    }

    public static vo2 i() {
        return DEFAULT_INSTANCE;
    }

    public static vo2 p(FileInputStream fileInputStream) throws hg2 {
        vo2 vo2Var = DEFAULT_INSTANCE;
        pi0 pi0Var = new pi0(fileInputStream);
        wm1 wm1VarG = wm1.g();
        b12 b12VarT = vo2Var.t();
        try {
            z04 z04Var = z04.r;
            z04Var.getClass();
            le4 le4VarG = z04Var.g(b12VarT.getClass());
            si0 si0Var = (si0) pi0Var.t;
            if (si0Var == null) {
                si0Var = new si0(pi0Var);
            }
            le4VarG.l(b12VarT, si0Var, wm1VarG);
            le4VarG.y(b12VarT);
            if (b12.x(b12VarT, true)) {
                return (vo2) b12VarT;
            }
            throw new hg2(new jg5().getMessage());
        } catch (hg2 e) {
            if (e.j) {
                throw new hg2(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof hg2) {
                throw ((hg2) e2.getCause());
            }
            throw new hg2(e2.getMessage(), e2);
        } catch (jg5 e3) {
            throw new hg2(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof hg2) {
                throw ((hg2) e4.getCause());
            }
            throw e4;
        }
    }

    public final df2 b() {
        return this.layout_;
    }

    public final void c() {
        this.layout_ = c14.m;
    }

    @Override // defpackage.b12
    public final Object r(int i) {
        yp3 z02Var;
        switch (du4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z24(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", xo2.class, "nextIndex_"});
            case 3:
                return new vo2();
            case 4:
                return new uo2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (vo2.class) {
                    try {
                        z02Var = PARSER;
                        if (z02Var == null) {
                            z02Var = new z02();
                            PARSER = z02Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return z02Var;
            default:
                uo1.f();
                return null;
        }
    }

    public final int s() {
        return this.nextIndex_;
    }

    public final void u(int i) {
        this.nextIndex_ = i;
    }

    public final void w(xo2 xo2Var) {
        df2 df2VarT = this.layout_;
        if (!((a1) df2VarT).j) {
            int size = df2VarT.size();
            df2VarT = df2VarT.t(size == 0 ? 10 : size * 2);
            this.layout_ = df2VarT;
        }
        df2VarT.add(xo2Var);
    }
}
