package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k7 implements bz1 {
    public final /* synthetic */ r54 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ m8 t;

    public /* synthetic */ k7(m8 m8Var, r54 r54Var, byte b) {
        this.j = b;
        this.t = m8Var;
        this.a = r54Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        r54 r54Var = this.a;
        m8 m8Var = this.t;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                m8Var.g(fFloatValue, fFloatValue2);
                r54Var.j = fFloatValue;
                break;
            default:
                m8Var.g(fFloatValue, fFloatValue2);
                r54Var.j = fFloatValue;
                break;
        }
        return og5Var;
    }
}
