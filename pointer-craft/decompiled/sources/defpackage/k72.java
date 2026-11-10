package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k72 implements cn4 {
    public final /* synthetic */ byte g;
    public static final k72 y = new k72(0);
    public static final k72 r = new k72(1);

    public /* synthetic */ k72(byte b) {
        this.g = b;
    }

    @Override // defpackage.cn4
    public final br2 g(long j, fl2 fl2Var, j51 j51Var) {
        switch (this.g) {
            case 0:
                float fV = j51Var.V(30.0f);
                return new ym3(new k44(0.0f, -fV, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fV));
            case 1:
                float fV2 = j51Var.V(30.0f);
                return new ym3(new k44(-fV2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fV2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ym3(kq2.r(0L, j));
        }
    }

    public String toString() {
        switch (this.g) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
