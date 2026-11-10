package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q8 {
    public final m8 c;
    public final xy1 g;
    public final tp3 j;
    public final tp3 l;
    public final pp3 m;
    public oi n;
    public final tp3 q;
    public my1 r;
    public final z51 t;
    public c11 v;
    public final tp3 w;
    public xy1 y;
    public final ac3 x = new ac3();
    public final pp3 a = new pp3(Float.NaN);

    public q8(Object obj, xy1 xy1Var) {
        this.g = new l1((byte) 5);
        this.l = kq2.M(obj);
        this.j = kq2.M(obj);
        final byte b = 0;
        this.t = pt4.y(new my1(this) { // from class: e8
            public final /* synthetic */ q8 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                q8 q8Var = this.t;
                switch (b2) {
                    case 0:
                        Object value = q8Var.q.getValue();
                        if (value != null) {
                            return value;
                        }
                        float fD = q8Var.a.d();
                        tp3 tp3Var = q8Var.l;
                        if (Float.isNaN(fD)) {
                            return tp3Var.getValue();
                        }
                        float fR = q8Var.y().r(tp3Var.getValue());
                        if (Float.isNaN(fR) || fD == fR) {
                            return tp3Var.getValue();
                        }
                        Object objG = q8Var.y().g(fD);
                        return objG == null ? tp3Var.getValue() : objG;
                    default:
                        float fR2 = q8Var.y().r(q8Var.j.getValue());
                        float fR3 = q8Var.y().r(q8Var.t.getValue()) - fR2;
                        float fAbs = Math.abs(fR3);
                        float f = 1.0f;
                        if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                            float fV = (q8Var.v() - fR2) / fR3;
                            if (fV < 1.0E-6f) {
                                f = 0.0f;
                            } else if (fV <= 0.999999f) {
                                f = fV;
                            }
                        }
                        return Float.valueOf(f);
                }
            }
        });
        final byte b2 = 1;
        pt4.r(new my1(this) { // from class: e8
            public final /* synthetic */ q8 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                q8 q8Var = this.t;
                switch (b3) {
                    case 0:
                        Object value = q8Var.q.getValue();
                        if (value != null) {
                            return value;
                        }
                        float fD = q8Var.a.d();
                        tp3 tp3Var = q8Var.l;
                        if (Float.isNaN(fD)) {
                            return tp3Var.getValue();
                        }
                        float fR = q8Var.y().r(tp3Var.getValue());
                        if (Float.isNaN(fR) || fD == fR) {
                            return tp3Var.getValue();
                        }
                        Object objG = q8Var.y().g(fD);
                        return objG == null ? tp3Var.getValue() : objG;
                    default:
                        float fR2 = q8Var.y().r(q8Var.j.getValue());
                        float fR3 = q8Var.y().r(q8Var.t.getValue()) - fR2;
                        float fAbs = Math.abs(fR3);
                        float f = 1.0f;
                        if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                            float fV = (q8Var.v() - fR2) / fR3;
                            if (fV < 1.0E-6f) {
                                f = 0.0f;
                            } else if (fV <= 0.999999f) {
                                f = fV;
                            }
                        }
                        return Float.valueOf(f);
                }
            }
        });
        this.m = new pp3(0.0f);
        this.q = kq2.M(null);
        this.w = kq2.M(new l11(pi1.j, new float[0]));
        this.c = new m8(this);
        this.g = xy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Object obj, ub3 ub3Var, dz1 dz1Var, ou0 ou0Var) {
        j8 j8Var;
        if (ou0Var instanceof j8) {
            j8Var = (j8) ou0Var;
            int i = j8Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                j8Var.w = i - Integer.MIN_VALUE;
            } else {
                j8Var = new j8(this, ou0Var);
            }
        } else {
            j8Var = new j8(this, ou0Var);
        }
        Object obj2 = j8Var.m;
        int i2 = j8Var.w;
        tp3 tp3Var = this.q;
        mu0 mu0Var = null;
        try {
            if (i2 == 0) {
                js2.o(obj2);
                if (y().g.indexOf(obj) != -1) {
                    ac3 ac3Var = this.x;
                    k8 k8Var = new k8((Object) this, obj, (Object) dz1Var, mu0Var, (byte) 1);
                    j8Var.w = 1;
                    ac3Var.getClass();
                    Object objB = k33.B(new jf2(ub3Var, ac3Var, k8Var, mu0Var, (byte) 1), j8Var);
                    px0 px0Var = px0.j;
                    if (objB == px0Var) {
                        return px0Var;
                    }
                } else if (((Boolean) this.g.a(obj)).booleanValue()) {
                    this.j.setValue(obj);
                    this.l.setValue(obj);
                }
                return og5.g;
            }
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj2);
            tp3Var.setValue(null);
            return og5.g;
        } catch (Throwable th) {
            tp3Var.setValue(null);
            throw th;
        }
    }

    public final float n(float f) {
        float fMin;
        pp3 pp3Var = this.a;
        float fD = (Float.isNaN(pp3Var.d()) ? 0.0f : pp3Var.d()) + f;
        float[] fArr = y().y;
        float fMax = Float.NaN;
        int i = 1;
        if (fArr.length != 0) {
            fMin = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    fMin = Math.min(fMin, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            fMin = Float.NaN;
        }
        float[] fArr2 = y().y;
        if (fArr2.length != 0) {
            fMax = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    fMax = Math.max(fMax, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return xs2.q(fD, fMin, fMax);
    }

    public final boolean r() {
        return (this.y == null || this.r == null || this.n == null || this.v == null) ? false : true;
    }

    public final float v() {
        pp3 pp3Var = this.a;
        if (Float.isNaN(pp3Var.d())) {
            pc2.r("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return pp3Var.d();
    }

    public final boolean x(Object obj) {
        ac3 ac3Var = this.x;
        ec3 ec3Var = ac3Var.y;
        ec3 ec3Var2 = ac3Var.y;
        boolean zV = ec3Var.v();
        if (!zV) {
            return zV;
        }
        try {
            m8 m8Var = this.c;
            float fR = y().r(obj);
            if (!Float.isNaN(fR)) {
                m8Var.g(fR, 0.0f);
                this.q.setValue(null);
            }
            this.l.setValue(obj);
            this.j.setValue(obj);
            return zV;
        } finally {
            ec3Var2.x(null);
        }
    }

    public final l11 y() {
        return (l11) this.w.getValue();
    }
}
