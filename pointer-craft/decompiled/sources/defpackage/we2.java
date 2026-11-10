package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we2 extends nz1 implements bz1 {
    public static final we2 i = new we2(2, k33.class, "min", "min(II)I", 1);

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
