package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fb implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ float t;

    public /* synthetic */ fb(oh5 oh5Var, float f, xy1 xy1Var) {
        this.j = (byte) 4;
        this.a = oh5Var;
        this.t = f;
        this.m = xy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b6 A[PHI: r0
  0x00b6: PHI (r0v12 float) = (r0v11 float), (r0v18 float) binds: [B:31:0x00ca, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        float fFloatValue;
        byte b = this.j;
        float f = 0.0f;
        og5 og5Var = og5.g;
        Object obj2 = this.m;
        float f2 = this.t;
        Object obj3 = this.a;
        switch (b) {
            case 0:
                nc ncVar = (nc) obj3;
                m30 m30Var = (m30) obj2;
                wm2 wm2Var = (wm2) obj;
                wm2Var.g();
                ro roVar = wm2Var.j.t;
                long jG = roVar.G();
                roVar.b().q();
                try {
                    y22 y22Var = (y22) roVar.t;
                    y22Var.D(f2, 0.0f);
                    y22Var.e(45.0f, 0L);
                    xd1.O(wm2Var, ncVar, m30Var);
                    return og5Var;
                } finally {
                    du4.d(roVar, jG);
                }
            case 1:
                r54 r54Var = (r54) obj3;
                ns2 ns2Var = (ns2) obj2;
                ni niVar = (ni) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) niVar.v.getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) niVar.v.getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - r54Var.j;
                if (f3 != ns2Var.g(f3) || f != ((Number) niVar.v.getValue()).floatValue()) {
                    niVar.g();
                }
                r54Var.j += f3;
                return og5Var;
            case 2:
                ((ts3) obj).j((us3) obj3, ((v33) obj2).V(f2), 0, 0.0f);
                return og5Var;
            case 3:
                us3 us3Var = (us3) obj3;
                ts3 ts3Var = (ts3) obj;
                qg qgVar = ((i95) obj2).e;
                ts3.m(ts3Var, us3Var, qgVar != null ? (int) ((Number) qgVar.n()).floatValue() : (int) f2, 0);
                return og5Var;
            default:
                oh5 oh5Var = (oh5) obj3;
                xy1 xy1Var = (xy1) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = oh5Var.y;
                if (j == Long.MIN_VALUE) {
                    oh5Var.y = jLongValue;
                    j = jLongValue;
                }
                float f4 = oh5Var.v;
                ri riVar = new ri(f4);
                ri riVar2 = oh5.x;
                long jY = f2 == 0.0f ? oh5Var.g.y(new ri(f4), riVar2, oh5Var.r) : k33.a0((jLongValue - j) / f2);
                float f5 = ((ri) oh5Var.g.l(jY, riVar, riVar2, oh5Var.r)).g;
                oh5Var.r = (ri) oh5Var.g.v(jY, riVar, riVar2, oh5Var.r);
                oh5Var.y = jLongValue;
                float f6 = oh5Var.v - f5;
                oh5Var.v = f5;
                xy1Var.a(Float.valueOf(f6));
                return og5Var;
        }
    }

    public /* synthetic */ fb(us3 us3Var, Object obj, float f, byte b) {
        this.j = b;
        this.a = us3Var;
        this.m = obj;
        this.t = f;
    }

    public /* synthetic */ fb(float f, Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = f;
        this.a = obj;
        this.m = obj2;
    }
}
