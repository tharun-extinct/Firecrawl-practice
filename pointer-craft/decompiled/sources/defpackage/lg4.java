package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg4 {
    public final /* synthetic */ ng4 g;

    public lg4(ng4 ng4Var) {
        this.g = ng4Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:130:0x026a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0293  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c A[PHI: r8
  0x013c: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:76:0x016a, B:65:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long g(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fJ;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jN;
        long jN2;
        boolean z;
        boolean zX;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        ng4 ng4Var = this.g;
        ng4Var.a = i;
        tb tbVar = ng4Var.y;
        if (tbVar == null || !ng4Var.y()) {
            return ng4Var.n(ng4Var.m, j, i);
        }
        byte b = ng4Var.a;
        s94 s94Var = ng4Var.w;
        ig1 ig1Var = tbVar.r;
        if (cq4.r(tbVar.l)) {
            return ((wi3) s94Var.a(new wi3(j))).g;
        }
        if (!tbVar.x) {
            if (ig1.l(ig1Var.x)) {
                tbVar.l(0L);
            }
            if (ig1.l(ig1Var.l)) {
                tbVar.j(0L);
            }
            if (ig1.l(ig1Var.n)) {
                tbVar.t(0L);
            }
            if (ig1.l(ig1Var.v)) {
                tbVar.x(0L);
            }
            tbVar.x = true;
        }
        int i5 = bd.g;
        float f = b == 2 ? 4.0f : 1.0f;
        long jX = wi3.x(f, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!ig1.l(ig1Var.n) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (ig1.l(ig1Var.v) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fX = tbVar.x(jX);
                    if (!ig1.l(ig1Var.v)) {
                        ig1Var.y().finish();
                    }
                    fIntBitsToFloat = fX == Float.intBitsToFloat((int) (jX & 4294967295L)) ? Float.intBitsToFloat(i6) : fX / f;
                }
            } else {
                float fT = tbVar.t(jX);
                j2 = 4294967295L;
                if (!ig1.l(ig1Var.n)) {
                    ig1Var.v().finish();
                }
                fIntBitsToFloat = fT == Float.intBitsToFloat((int) (jX & 4294967295L)) ? Float.intBitsToFloat(i6) : fT / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!ig1.l(ig1Var.x) && Float.intBitsToFloat(i2) < 0.0f) {
                fJ = tbVar.l(jX);
                if (!ig1.l(ig1Var.x)) {
                    ig1Var.r().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jX >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f;
                }
            } else if (ig1.l(ig1Var.l) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fJ = tbVar.j(jX);
                if (!ig1.l(ig1Var.l)) {
                    ig1Var.n().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jX >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!wi3.y(jFloatToRawIntBits, 0L)) {
                tbVar.n();
            }
            jN = wi3.n(j, jFloatToRawIntBits);
            long j3 = ((wi3) s94Var.a(new wi3(jN))).g;
            jN2 = wi3.n(jN, j3);
            if ((Float.intBitsToFloat((int) (jN >> 32)) == 0.0f || Float.intBitsToFloat((int) (jN & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (ig1.l(ig1Var.x) || ig1.l(ig1Var.n) || ig1.l(ig1Var.l) || ig1.l(ig1Var.v)))) {
                tbVar.g();
            }
            if (b == 1) {
                i3 = (int) (jN2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    tbVar.l(jN2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        tbVar.j(jN2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jN2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        tbVar.t(jN2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            tbVar.x(jN2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jN2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    tbVar.t(jN2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        tbVar.x(jN2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!wi3.y(jN, 0L)) {
                if (ig1.x(ig1Var.x) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zX = false;
                } else {
                    cf6.x(ig1Var.r(), Float.intBitsToFloat(i2));
                    zX = ig1.x(ig1Var.x);
                }
                if (ig1.x(ig1Var.l) && Float.intBitsToFloat(i2) > 0.0f) {
                    cf6.x(ig1Var.n(), Float.intBitsToFloat(i2));
                    if (!zX || ig1.x(ig1Var.l)) {
                        zX = true;
                    } else {
                        zX = false;
                    }
                }
                if (ig1.x(ig1Var.n) && Float.intBitsToFloat(i6) < 0.0f) {
                    cf6.x(ig1Var.v(), Float.intBitsToFloat(i6));
                    if (!zX || ig1.x(ig1Var.n)) {
                        zX = true;
                    } else {
                        zX = false;
                    }
                }
                if (ig1.x(ig1Var.v) && Float.intBitsToFloat(i6) > 0.0f) {
                    cf6.x(ig1Var.y(), Float.intBitsToFloat(i6));
                    if (!zX || ig1.x(ig1Var.v)) {
                        zX = true;
                    } else {
                        zX = false;
                    }
                }
                if (!zX || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                tbVar.n();
            }
            return wi3.v(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!ig1.l(ig1Var.x)) {
            if (ig1.l(ig1Var.l)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (ig1.l(ig1Var.l)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!wi3.y(jFloatToRawIntBits, 0L)) {
            tbVar.n();
        }
        jN = wi3.n(j, jFloatToRawIntBits);
        long j4 = ((wi3) s94Var.a(new wi3(jN))).g;
        jN2 = wi3.n(jN, j4);
        if (Float.intBitsToFloat((int) (jN >> 32)) == 0.0f) {
            tbVar.g();
        } else {
            tbVar.g();
        }
        if (b == 1) {
            i3 = (int) (jN2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                tbVar.l(jN2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    tbVar.j(jN2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jN2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    tbVar.t(jN2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        tbVar.x(jN2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jN2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                tbVar.t(jN2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    tbVar.x(jN2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!wi3.y(jN, 0L)) {
            if (ig1.x(ig1Var.x)) {
                zX = false;
            } else {
                zX = false;
            }
            if (ig1.x(ig1Var.l)) {
                cf6.x(ig1Var.n(), Float.intBitsToFloat(i2));
                if (zX) {
                    zX = true;
                } else {
                    zX = true;
                }
            }
            if (ig1.x(ig1Var.n)) {
                cf6.x(ig1Var.v(), Float.intBitsToFloat(i6));
                if (zX) {
                    zX = true;
                } else {
                    zX = true;
                }
            }
            if (ig1.x(ig1Var.v)) {
                cf6.x(ig1Var.y(), Float.intBitsToFloat(i6));
                if (zX) {
                    zX = true;
                } else {
                    zX = true;
                }
            }
            if (zX) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            tbVar.n();
        }
        return wi3.v(jFloatToRawIntBits, j4);
    }
}
