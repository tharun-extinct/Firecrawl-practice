package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class po2 extends b12 {
    private static final po2 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile yp3 PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        po2 po2Var = new po2();
        DEFAULT_INSTANCE = po2Var;
        b12.a(po2.class, po2Var);
    }

    public static po2 d(byte[] bArr) throws hg2 {
        b12 b12Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        wm1 wm1VarG = wm1.g();
        if (length != 0) {
            b12 b12VarT = b12Var.t();
            try {
                z04 z04Var = z04.r;
                z04Var.getClass();
                le4 le4VarG = z04Var.g(b12VarT.getClass());
                cr crVar = new cr();
                wm1VarG.getClass();
                le4VarG.t(b12VarT, bArr, 0, length, crVar);
                le4VarG.y(b12VarT);
                b12Var = b12VarT;
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
            } catch (IndexOutOfBoundsException unused) {
                throw hg2.x();
            } catch (jg5 e3) {
                throw new hg2(e3.getMessage());
            }
        }
        if (b12Var == null || b12.x(b12Var, true)) {
            return (po2) b12Var;
        }
        throw new hg2(new jg5().getMessage());
    }

    public static co2 k() {
        return (co2) DEFAULT_INSTANCE.y();
    }

    public final void A(go2 go2Var) {
        this.request_ = go2Var;
        this.requestCase_ = 4;
    }

    public final void B(io2 io2Var) {
        this.request_ = io2Var;
        this.requestCase_ = 6;
    }

    public final void C(ko2 ko2Var) {
        this.request_ = ko2Var;
        this.requestCase_ = 2;
    }

    public final void D(mo2 mo2Var) {
        this.request_ = mo2Var;
        this.requestCase_ = 5;
    }

    public final void E(oo2 oo2Var) {
        this.request_ = oo2Var;
        this.requestCase_ = 1;
    }

    public final mo2 b() {
        return this.requestCase_ == 5 ? (mo2) this.request_ : mo2.i();
    }

    public final go2 c() {
        return this.requestCase_ == 4 ? (go2) this.request_ : go2.i();
    }

    public final void e(eo2 eo2Var) {
        this.request_ = eo2Var;
        this.requestCase_ = 3;
    }

    public final boolean f() {
        return this.requestCase_ == 1;
    }

    public final boolean h() {
        return this.requestCase_ == 2;
    }

    public final ko2 i() {
        return this.requestCase_ == 2 ? (ko2) this.request_ : ko2.i();
    }

    public final boolean o() {
        return this.requestCase_ == 5;
    }

    public final boolean p() {
        return this.requestCase_ == 3;
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
                return new z24(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", oo2.class, ko2.class, eo2.class, go2.class, mo2.class, io2.class});
            case 3:
                return new po2();
            case 4:
                return new co2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (po2.class) {
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

    public final oo2 s() {
        return this.requestCase_ == 1 ? (oo2) this.request_ : oo2.i();
    }

    public final boolean u() {
        return this.requestCase_ == 4;
    }

    public final eo2 w() {
        return this.requestCase_ == 3 ? (eo2) this.request_ : eo2.i();
    }

    public final boolean z() {
        return this.requestCase_ == 6;
    }
}
