package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg0 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ zg0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                return g61.r((g61) obj, null, 0, 0, 0, 0, true, obj2 instanceof Integer ? ((Number) obj2).intValue() : 1, 0, 0L, 0L, false, false, false, 130687);
            default:
                ((Integer) obj).getClass();
                return obj2;
        }
    }
}
