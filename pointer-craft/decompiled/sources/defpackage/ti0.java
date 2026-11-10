package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ti0 {
    public int g;
    public final Object n;
    public int r;
    public int y;

    public ti0(ri0 ri0Var) {
        this.r = 0;
        Charset charset = gf2.g;
        this.n = ri0Var;
        ri0Var.t = this;
    }

    public void a(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Integer.valueOf(ri0Var.s()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Integer.valueOf(ri0Var.s()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public void b(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Long.valueOf(ri0Var.o()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Long.valueOf(ri0Var.o()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public void c(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 2) {
            int iD = ri0Var.D();
            if ((iD & 3) != 0) {
                throw new ig2("Failed to parse the message.");
            }
            int iN = ri0Var.n() + iD;
            do {
                ((d14) ef2Var).add(Float.valueOf(ri0Var.z()));
            } while (ri0Var.n() < iN);
            return;
        }
        if (i != 5) {
            throw ig2.y();
        }
        do {
            ((d14) ef2Var).add(Float.valueOf(ri0Var.z()));
            if (ri0Var.v()) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == this.g);
        this.r = iC;
    }

    public void d(int i) throws gg2 {
        if ((this.g & 7) != i) {
            throw ig2.y();
        }
    }

    public boolean e() {
        int i;
        ri0 ri0Var = (ri0) this.n;
        if (ri0Var.v() || (i = this.g) == this.y) {
            return false;
        }
        return ri0Var.F(i);
    }

    public void f(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Long.valueOf(ri0Var.E()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Long.valueOf(ri0Var.E()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public int g() {
        int iC = this.r;
        if (iC != 0) {
            this.g = iC;
            this.r = 0;
        } else {
            iC = ((ri0) this.n).C();
            this.g = iC;
        }
        if (iC == 0 || iC == this.y) {
            return Integer.MAX_VALUE;
        }
        return iC >>> 3;
    }

    public void h(ef2 ef2Var, boolean z) throws gg2 {
        String strA;
        int iC;
        ri0 ri0Var = (ri0) this.n;
        if ((this.g & 7) != 2) {
            throw ig2.y();
        }
        do {
            if (z) {
                d(2);
                strA = ri0Var.B();
            } else {
                d(2);
                strA = ri0Var.A();
            }
            ((d14) ef2Var).add(strA);
            if (ri0Var.v()) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == this.g);
        this.r = iC;
    }

    public void i(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Integer.valueOf(ri0Var.h()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Integer.valueOf(ri0Var.h()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public void j(ef2 ef2Var) throws gg2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        if ((this.g & 7) != 2) {
            throw ig2.y();
        }
        do {
            ((d14) ef2Var).add(l());
            if (ri0Var.v()) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == this.g);
        this.r = iC;
    }

    public void k(int i) throws ig2 {
        if (((ri0) this.n).n() != i) {
            throw ig2.v();
        }
    }

    public da0 l() throws gg2 {
        d(2);
        return ((ri0) this.n).i();
    }

    public Object m(vq5 vq5Var, Class cls, xm1 xm1Var) throws ig2 {
        ri0 ri0Var = (ri0) this.n;
        switch (vq5Var.ordinal()) {
            case 0:
                d(1);
                return Double.valueOf(ri0Var.b());
            case 1:
                d(5);
                return Float.valueOf(ri0Var.z());
            case 2:
                d(0);
                return Long.valueOf(ri0Var.o());
            case 3:
                d(0);
                return Long.valueOf(ri0Var.E());
            case 4:
                d(0);
                return Integer.valueOf(ri0Var.h());
            case 5:
                d(1);
                return Long.valueOf(ri0Var.u());
            case 6:
                d(5);
                return Integer.valueOf(ri0Var.p());
            case 7:
                d(0);
                return Boolean.valueOf(ri0Var.w());
            case 8:
                d(2);
                return ri0Var.B();
            case 9:
            default:
                l0.u("unsupported field type.");
                return null;
            case 10:
                d(2);
                me4 me4VarG = b14.r.g(cls);
                c12 c12VarN = me4VarG.n();
                v(c12VarN, me4VarG, xm1Var);
                me4VarG.y(c12VarN);
                return c12VarN;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return l();
            case 12:
                d(0);
                return Integer.valueOf(ri0Var.D());
            case 13:
                d(0);
                return Integer.valueOf(ri0Var.s());
            case 14:
                d(5);
                return Integer.valueOf(ri0Var.f());
            case kq2.x /* 15 */:
                d(1);
                return Long.valueOf(ri0Var.k());
            case 16:
                d(0);
                return Integer.valueOf(ri0Var.d());
            case 17:
                d(0);
                return Long.valueOf(ri0Var.e());
        }
    }

    public void n(Object obj, me4 me4Var, xm1 xm1Var) {
        int i = this.y;
        this.y = ((this.g >>> 3) << 3) | 4;
        try {
            me4Var.t(obj, this, xm1Var);
            if (this.g != this.y) {
                throw new ig2("Failed to parse the message.");
            }
            this.y = i;
        } catch (Throwable th) {
            this.y = i;
            throw th;
        }
    }

    public void o(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Integer.valueOf(ri0Var.D()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Integer.valueOf(ri0Var.D()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public void p(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 1) {
            do {
                ((d14) ef2Var).add(Long.valueOf(ri0Var.k()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iD = ri0Var.D();
        if ((iD & 7) != 0) {
            throw new ig2("Failed to parse the message.");
        }
        int iN = ri0Var.n() + iD;
        do {
            ((d14) ef2Var).add(Long.valueOf(ri0Var.k()));
        } while (ri0Var.n() < iN);
    }

    public void q(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 2) {
            int iD = ri0Var.D();
            if ((iD & 3) != 0) {
                throw new ig2("Failed to parse the message.");
            }
            int iN = ri0Var.n() + iD;
            do {
                ((d14) ef2Var).add(Integer.valueOf(ri0Var.p()));
            } while (ri0Var.n() < iN);
            return;
        }
        if (i != 5) {
            throw ig2.y();
        }
        do {
            ((d14) ef2Var).add(Integer.valueOf(ri0Var.p()));
            if (ri0Var.v()) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == this.g);
        this.r = iC;
    }

    public Object r(int i) {
        return ((em3) this.n).x[this.r + i];
    }

    public void s(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 2) {
            int iD = ri0Var.D();
            if ((iD & 3) != 0) {
                throw new ig2("Failed to parse the message.");
            }
            int iN = ri0Var.n() + iD;
            do {
                ((d14) ef2Var).add(Integer.valueOf(ri0Var.f()));
            } while (ri0Var.n() < iN);
            return;
        }
        if (i != 5) {
            throw ig2.y();
        }
        do {
            ((d14) ef2Var).add(Integer.valueOf(ri0Var.f()));
            if (ri0Var.v()) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == this.g);
        this.r = iC;
    }

    public void t(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 1) {
            do {
                ((d14) ef2Var).add(Double.valueOf(ri0Var.b()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iD = ri0Var.D();
        if ((iD & 7) != 0) {
            throw new ig2("Failed to parse the message.");
        }
        int iN = ri0Var.n() + iD;
        do {
            ((d14) ef2Var).add(Double.valueOf(ri0Var.b()));
        } while (ri0Var.n() < iN);
    }

    public void u(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Integer.valueOf(ri0Var.d()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Integer.valueOf(ri0Var.d()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public void v(Object obj, me4 me4Var, xm1 xm1Var) throws ig2 {
        ri0 ri0Var = (ri0) this.n;
        int iD = ri0Var.D();
        if (ri0Var.j >= 100) {
            throw new ig2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iQ = ri0Var.q(iD);
        ri0Var.j++;
        me4Var.t(obj, this, xm1Var);
        ri0Var.g(0);
        ri0Var.j--;
        ri0Var.m(iQ);
    }

    public void w(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 1) {
            do {
                ((d14) ef2Var).add(Long.valueOf(ri0Var.u()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iD = ri0Var.D();
        if ((iD & 7) != 0) {
            throw new ig2("Failed to parse the message.");
        }
        int iN = ri0Var.n() + iD;
        do {
            ((d14) ef2Var).add(Long.valueOf(ri0Var.u()));
        } while (ri0Var.n() < iN);
    }

    public void x(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Boolean.valueOf(ri0Var.w()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Boolean.valueOf(ri0Var.w()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public int y(int i) {
        return ((em3) this.n).n[this.y + i];
    }

    public void z(ef2 ef2Var) throws ig2 {
        int iC;
        ri0 ri0Var = (ri0) this.n;
        int i = this.g & 7;
        if (i == 0) {
            do {
                ((d14) ef2Var).add(Long.valueOf(ri0Var.e()));
                if (ri0Var.v()) {
                    return;
                } else {
                    iC = ri0Var.C();
                }
            } while (iC == this.g);
            this.r = iC;
            return;
        }
        if (i != 2) {
            throw ig2.y();
        }
        int iN = ri0Var.n() + ri0Var.D();
        do {
            ((d14) ef2Var).add(Long.valueOf(ri0Var.e()));
        } while (ri0Var.n() < iN);
        k(iN);
    }

    public ti0(em3 em3Var) {
        this.n = em3Var;
    }
}
