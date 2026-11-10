package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr5 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ zr5(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                return new je2(((long) ((j00) obj3).g(0, (int) (((qe2) obj).g & 4294967295L))) & 4294967295L);
            default:
                return new je2(((u6) obj3).g(0L, ((qe2) obj).g, (fl2) obj2));
        }
    }
}
