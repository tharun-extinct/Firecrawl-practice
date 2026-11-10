package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zs implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bw4 t;

    public /* synthetic */ zs(bw4 bw4Var, byte b) {
        this.j = b;
        this.t = bw4Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        bw4 bw4Var = this.t;
        switch (b) {
            case 0:
                return Float.valueOf(((Number) bw4Var.getValue()).floatValue());
            case 1:
                return Float.valueOf(((Number) bw4Var.getValue()).floatValue());
            case 2:
                return Float.valueOf(((Number) bw4Var.getValue()).floatValue());
            case 3:
                wi3 wi3Var = (wi3) bw4Var.getValue();
                long j = wi3Var.g;
                return wi3Var;
            case 4:
                si siVar = ti4.g;
                wi3 wi3Var2 = (wi3) bw4Var.getValue();
                long j2 = wi3Var2.g;
                return wi3Var2;
            case 5:
                return Boolean.valueOf(((Number) bw4Var.getValue()).floatValue() > 0.0f);
            case 6:
                return Boolean.valueOf(((Number) bw4Var.getValue()).floatValue() > 0.0f);
            default:
                return Float.valueOf(((Number) bw4Var.getValue()).floatValue());
        }
    }
}
