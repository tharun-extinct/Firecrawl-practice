package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i72 {
    public final bz1 g;
    public final /* synthetic */ byte y;

    public i72(bz1 bz1Var, byte b) {
        this.y = b;
        this.g = bz1Var;
    }

    public final float g(float f, bl2 bl2Var, bl2 bl2Var2) {
        switch (this.y) {
            case 0:
                return Float.intBitsToFloat((int) (bl2Var2.p(bl2Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (bl2Var.L() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (bl2Var2.p(bl2Var, (((long) Float.floatToRawIntBits(((int) (bl2Var.L() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
