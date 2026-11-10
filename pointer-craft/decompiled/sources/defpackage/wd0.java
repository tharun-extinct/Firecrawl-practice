package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wd0 implements xy1 {
    public final /* synthetic */ bw4 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ bw4 m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ wd0(ox0 ox0Var, ob3 ob3Var, ob3 ob3Var2, b30 b30Var, yl0 yl0Var, UUID uuid, String str, my1 my1Var) {
        this.t = ox0Var;
        this.a = ob3Var;
        this.m = ob3Var2;
        this.q = b30Var;
        this.w = yl0Var;
        this.c = uuid;
        this.i = str;
        this.b = my1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.w;
        Object obj6 = this.q;
        bw4 bw4Var = this.m;
        bw4 bw4Var2 = this.a;
        Object obj7 = this.t;
        switch (b) {
            case 0:
                by4 by4Var = (by4) obj4;
                bw4 bw4Var3 = (bw4) obj6;
                bw4 bw4Var4 = (bw4) obj5;
                by4 by4Var2 = (by4) obj3;
                pd0 pd0Var = (pd0) obj2;
                xd1 xd1Var = (xd1) obj;
                long j = ((jj0) ((bw4) obj7).getValue()).g;
                long j2 = ((jj0) bw4Var2.getValue()).g;
                float fE = xd1Var.e(2.0f);
                float f = by4Var.g;
                float f2 = f / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() >> 32));
                int i = jj0.t;
                boolean zG = tf5.g(j, j2);
                go1 go1Var = go1.g;
                if (zG) {
                    xd1.G(xd1Var, j, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L), go1Var, 0.0f, 226);
                } else {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                    float f3 = fIntBitsToFloat - (f * 2.0f);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    float fMax = Math.max(0.0f, fE - f);
                    xd1Var = xd1Var;
                    xd1.G(xd1Var, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), go1Var, 0.0f, 224);
                    float f4 = fIntBitsToFloat - f;
                    float f5 = fE - f2;
                    xd1.G(xd1Var, j2, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), by4Var, 0.0f, 224);
                }
                long j3 = ((jj0) bw4Var.getValue()).g;
                float fFloatValue = ((Number) bw4Var3.getValue()).floatValue();
                float fFloatValue2 = ((Number) bw4Var4.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd1Var.n() >> 32));
                float fE2 = lr2.e(0.4f, 0.5f, fFloatValue2);
                float fE3 = lr2.e(0.7f, 0.5f, fFloatValue2);
                float fE4 = lr2.e(0.5f, 0.5f, fFloatValue2);
                float fE5 = lr2.e(0.3f, 0.5f, fFloatValue2);
                ld ldVar = pd0Var.g;
                ld ldVar2 = pd0Var.r;
                ldVar.j();
                ld ldVar3 = pd0Var.g;
                ldVar3.g.moveTo(0.2f * fIntBitsToFloat2, fE4 * fIntBitsToFloat2);
                ldVar3.v(fE2 * fIntBitsToFloat2, fE3 * fIntBitsToFloat2);
                ldVar3.v(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fE5);
                md mdVar = pd0Var.y;
                mdVar.r(ldVar3);
                ldVar2.j();
                mdVar.y(0.0f, mdVar.g.getLength() * fFloatValue, ldVar2);
                xd1.r0(xd1Var, ldVar2, j3, by4Var2, 52);
                break;
            default:
                ox0 ox0Var = (ox0) obj7;
                ob3 ob3Var = (ob3) bw4Var2;
                ob3 ob3Var2 = (ob3) bw4Var;
                b30 b30Var = (b30) obj6;
                yl0 yl0Var = (yl0) obj5;
                UUID uuid = (UUID) obj4;
                String str = (String) obj3;
                my1 my1Var = (my1) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (!((Boolean) ob3Var.getValue()).booleanValue()) {
                    ob3Var.setValue(Boolean.TRUE);
                    ob3Var2.setValue(Boolean.FALSE);
                    m50.T(ox0Var, null, new ey3(b30Var, yl0Var, str2, uuid, str, my1Var, ob3Var, ob3Var2, null), 3);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ wd0(bw4 bw4Var, bw4 bw4Var2, by4 by4Var, bw4 bw4Var3, hc5 hc5Var, hc5 hc5Var2, by4 by4Var2, pd0 pd0Var) {
        this.t = bw4Var;
        this.a = bw4Var2;
        this.c = by4Var;
        this.m = bw4Var3;
        this.q = hc5Var;
        this.w = hc5Var2;
        this.i = by4Var2;
        this.b = pd0Var;
    }
}
