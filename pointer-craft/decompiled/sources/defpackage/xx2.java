package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xx2 extends e04 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx2(yx2 yx2Var) {
        super(yx2Var, a11.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.i = (byte) 0;
    }

    @Override // defpackage.ai2
    public final Object get() {
        byte b = this.i;
        Object obj = this.t;
        switch (b) {
            case 0:
                return obj.getClass().getSimpleName();
            case 1:
                return ((bw4) obj).getValue();
            case 2:
                return ((bw4) obj).getValue();
            case 3:
                return ((bw4) obj).getValue();
            case 4:
                return ((bw4) obj).getValue();
            default:
                return ((bw4) obj).getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx2(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.i = b;
    }
}
