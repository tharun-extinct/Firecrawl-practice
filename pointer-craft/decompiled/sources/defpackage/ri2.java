package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ri2 {
    public final yt4 g;
    public lt1 r;
    public si2 y;

    public ri2(yt4 yt4Var) {
        this.g = yt4Var;
    }

    public final si2 g() {
        si2 si2Var = this.y;
        if (si2Var != null) {
            return si2Var;
        }
        yf2.Y("keyboardActions");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:36:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x005b  */
    /* JADX WARN: Code duplicated, block: B:40:0x005f  */
    public final boolean y(int i) {
        xy1 xy1Var;
        yt4 yt4Var;
        lt1 lt1Var;
        lt1 lt1Var2;
        if (i != 7 && i != 2 && i != 6 && i != 5) {
            if (i == 3) {
                xy1Var = g().g;
            } else if (i == 4) {
                g();
            } else if (i != 1 && i != 0) {
                l0.z("invalid ImeAction");
                return false;
            }
            if (xy1Var != null) {
                xy1Var.a(this);
                return true;
            }
            if (i == 6) {
                lt1Var2 = this.r;
                if (lt1Var2 != null) {
                    ((nt1) lt1Var2).l(1, true);
                    return true;
                }
                yf2.Y("focusManager");
                throw null;
            }
            if (i == 5) {
                if (i == 7 || (yt4Var = this.g) == null) {
                    return false;
                }
                ((z41) yt4Var).g();
                return true;
            }
            lt1Var = this.r;
            if (lt1Var != null) {
                ((nt1) lt1Var).l(2, true);
                return true;
            }
            yf2.Y("focusManager");
            throw null;
        }
        g();
        xy1Var = null;
        if (xy1Var != null) {
            xy1Var.a(this);
            return true;
        }
        if (i == 6) {
            lt1Var2 = this.r;
            if (lt1Var2 != null) {
                ((nt1) lt1Var2).l(1, true);
                return true;
            }
            yf2.Y("focusManager");
            throw null;
        }
        if (i == 5) {
            if (i == 7) {
            }
            return false;
        }
        lt1Var = this.r;
        if (lt1Var != null) {
            ((nt1) lt1Var).l(2, true);
            return true;
        }
        yf2.Y("focusManager");
        throw null;
    }
}
