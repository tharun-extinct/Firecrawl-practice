package defpackage;

import android.util.Property;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends Property {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf0(Class cls, String str, byte b) {
        super(cls, str);
        this.g = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.g) {
            case 0:
                return Float.valueOf(((nf0) obj).j);
            case 1:
                return Float.valueOf(((nf0) obj).t);
            default:
                return Float.valueOf(((he1) obj).y());
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                nf0 nf0Var = (nf0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                nf0Var.j = fFloatValue;
                int i = (int) (fFloatValue * 5400.0f);
                on1 on1Var = nf0Var.v;
                ArrayList arrayList = (ArrayList) nf0Var.y;
                ye1 ye1Var = (ye1) arrayList.get(0);
                float f = nf0Var.j * 1520.0f;
                ye1Var.g = (-20.0f) + f;
                ye1Var.y = f;
                for (int i2 = 0; i2 < 4; i2++) {
                    ye1Var.y = (on1Var.getInterpolation(vv.y(i, nf0.m[i2], 667)) * 250.0f) + ye1Var.y;
                    ye1Var.g = (on1Var.getInterpolation(vv.y(i, nf0.q[i2], 667)) * 250.0f) + ye1Var.g;
                }
                float f2 = ye1Var.g;
                float f3 = ye1Var.y;
                ye1Var.g = (((f3 - f2) * nf0Var.t) + f2) / 360.0f;
                ye1Var.y = f3 / 360.0f;
                for (int i3 = 0; i3 < 4; i3++) {
                    float fY = vv.y(i, nf0.w[i3], 333);
                    if (fY > 0.0f && fY < 1.0f) {
                        int i4 = i3 + nf0Var.l;
                        int[] iArr = nf0Var.x.v;
                        int length = i4 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i5 = iArr[length];
                        int i6 = iArr[length2];
                        ((ye1) arrayList.get(0)).r = uq.g(on1Var.getInterpolation(fY), Integer.valueOf(i5), Integer.valueOf(i6)).intValue();
                        ((ab2) nf0Var.g).invalidateSelf();
                    }
                    break;
                }
                ((ab2) nf0Var.g).invalidateSelf();
                break;
            case 1:
                ((nf0) obj).t = ((Float) obj2).floatValue();
                break;
            default:
                he1 he1Var = (he1) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (he1Var.b != fFloatValue2) {
                    he1Var.b = fFloatValue2;
                    he1Var.invalidateSelf();
                }
                break;
        }
    }
}
