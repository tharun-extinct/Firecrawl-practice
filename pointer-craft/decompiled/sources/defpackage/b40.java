package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b40 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ e40 i;
    public boolean q;
    public final /* synthetic */ int s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(boolean z, e40 e40Var, int i, int i2, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = z;
        this.i = e40Var;
        this.b = i;
        this.s = i2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new b40(this.c, this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((b40) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z;
        boolean z2;
        int iG;
        e40 e40Var = this.i;
        m70 m70Var = e40Var.n;
        up1 up1Var = e40Var.r;
        byte b = this.w;
        int i = this.s;
        og5 og5Var = og5.g;
        int i2 = 1;
        int i3 = 2;
        if (b == 0) {
            js2.o(obj);
            boolean z3 = this.c;
            if (!z3 && up1Var.g.isEmpty() && up1Var.y == 0) {
                return og5Var;
            }
            int i4 = this.b;
            z = false;
            px0 px0Var = px0.j;
            if (z3) {
                List list = up1Var.g;
                switch (i4) {
                    case 224:
                        i3 = 1;
                        break;
                    case 225:
                        break;
                    case 226:
                        i3 = 4;
                        break;
                    case 227:
                        i3 = 8;
                        break;
                    case 228:
                        i3 = 16;
                        break;
                    case 229:
                        i3 = 32;
                        break;
                    case 230:
                        i3 = 64;
                        break;
                    case 231:
                        i3 = 128;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                if (i3 != 0) {
                    up1Var.y |= i3;
                } else if (!list.contains(Integer.valueOf(i4))) {
                    list.add(Integer.valueOf(i4));
                }
                if (i != 0 && (iG = up1.g(i)) != 0) {
                    up1Var.y = iG | up1Var.y;
                    z = true;
                }
                if (!up1Var.g.isEmpty() || up1Var.y != 0) {
                    z30 z30Var = new z30(up1Var.y());
                    this.q = z;
                    this.w = (byte) 1;
                    if (m70Var.r(this, z30Var) != px0Var) {
                        z2 = z;
                    }
                }
                if (z) {
                    up1Var.y = (~up1.g(i)) & up1Var.y;
                    return og5Var;
                }
                return og5Var;
            }
            switch (i4) {
                case 224:
                    break;
                case 225:
                    i2 = 2;
                    break;
                case 226:
                    i2 = 4;
                    break;
                case 227:
                    i2 = 8;
                    break;
                case 228:
                    i2 = 16;
                    break;
                case 229:
                    i2 = 32;
                    break;
                case 230:
                    i2 = 64;
                    break;
                case 231:
                    i2 = 128;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                up1Var.y &= ~i2;
            } else {
                up1Var.g.remove(Integer.valueOf(i4));
            }
            z30 z30Var2 = new z30(up1Var.y());
            this.w = (byte) 2;
            if (m70Var.r(this, z30Var2) != px0Var) {
                return og5Var;
            }
            return px0Var;
        }
        if (b != 1) {
            if (b == 2) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = this.q;
        js2.o(obj);
        z = z2;
        if (z) {
            up1Var.y = (~up1.g(i)) & up1Var.y;
            return og5Var;
        }
        return og5Var;
    }
}
