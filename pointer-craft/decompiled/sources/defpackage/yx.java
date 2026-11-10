package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yx extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx(Object obj, Object obj2, boolean z, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
        this.c = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new yx(obj3, obj2, this.c, mu0Var, (byte) 0);
            case 1:
                return new yx(obj3, obj2, this.c, mu0Var, (byte) 1);
            case 2:
                return new yx(obj3, obj2, this.c, mu0Var, (byte) 2);
            case 3:
                return new yx(obj3, this.c, obj2, mu0Var, (byte) 3);
            default:
                return new yx(obj3, this.c, obj2, mu0Var, (byte) 4);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((yx) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        boolean z = this.c;
        Object obj3 = this.i;
        px0 px0Var = px0.j;
        byte b2 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                String str = (String) obj2;
                gy gyVar = (gy) obj3;
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qr0.b(gyVar.T(), str);
                if (z) {
                    return og5Var;
                }
                x21 x21Var = na1.g;
                t42 t42Var = p03.g;
                tx txVar = new tx(gyVar, str, mu0Var, b2);
                this.w = true;
                return m50.f0(t42Var, txVar, this) == px0Var ? px0Var : og5Var;
            case 1:
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                uu0 uu0Var = ((av0) obj3).w0;
                r04 r04Var = (r04) obj2;
                int i = r04Var.m;
                o04 o04VarZ = r04Var.z();
                o04VarZ.getClass();
                this.w = true;
                return uu0Var.a(i, o04VarZ, z, this) == px0Var ? px0Var : og5Var;
            case 2:
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ov0 ov0Var = ((sv0) obj3).v;
                r04 r04Var2 = (r04) obj2;
                int i2 = r04Var2.m;
                o04 o04VarZ2 = r04Var2.z();
                o04VarZ2.getClass();
                this.w = true;
                return ov0Var.a(i2, o04VarZ2, z, this) == px0Var ? px0Var : og5Var;
            case 3:
                String str2 = (String) obj2;
                vl vlVar = (vl) obj3;
                StringBuffer stringBuffer = (StringBuffer) vlVar.n;
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    iv4 iv4Var = (iv4) vlVar.v;
                    if (iv4Var != null) {
                        iv4Var.x(null);
                    }
                    if (z) {
                        stringBuffer.delete(0, stringBuffer.length());
                    }
                    if (yf2.p(str2, "\n")) {
                        stringBuffer.append("⏎");
                    } else {
                        stringBuffer.append(str2);
                    }
                    String string = stringBuffer.toString();
                    string.getClass();
                    x21 x21Var2 = na1.g;
                    t42 t42Var2 = p03.g;
                    mt mtVar = new mt((Object) vlVar, string, mu0Var, (byte) 13);
                    this.w = true;
                    if (m50.f0(t42Var2, mtVar, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                vlVar.v = m50.T((ku0) vlVar.x, null, new dy((Object) vlVar, mu0Var, (byte) 26), 3);
                return og5Var;
            default:
                boolean z6 = this.w;
                if (z6) {
                    if (z6) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar = (qg) obj3;
                float f = z ? 1.0f : 0.8f;
                this.w = true;
                return qg.g(qgVar, new Float(f), (zu4) obj2, null, this, 12) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx(Object obj, boolean z, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = z;
        this.b = obj2;
    }
}
