package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class tc2 {
    public final /* synthetic */ byte g;
    public final i72 n;
    public final i72 r;
    public final i72 v;
    public final Serializable x;
    public final i72 y;

    /* JADX WARN: Multi-variable type inference failed */
    public tc2(tc2[] tc2VarArr) {
        final byte b = 0;
        this.g = (byte) 0;
        this.x = tc2VarArr;
        int length = tc2VarArr.length;
        final i72[] i72VarArr = new i72[length];
        for (int i = 0; i < length; i++) {
            i72VarArr[i] = ((tc2[]) this.x)[i].y();
        }
        final byte b2 = 1;
        this.y = new i72(new bz1() { // from class: fk5
            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                float fG;
                byte b3 = b2;
                i72[] i72VarArr2 = i72VarArr;
                ts3 ts3Var = (ts3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fG = bf6.g(ts3Var, false, i72VarArr2, fFloatValue);
                        break;
                    default:
                        fG = bf6.g(ts3Var, true, i72VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fG);
            }
        }, (byte) 1);
        int length2 = ((tc2[]) this.x).length;
        final i72[] i72VarArr2 = new i72[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            i72VarArr2[i2] = ((tc2[]) this.x)[i2].n();
        }
        this.r = new i72(new bz1() { // from class: h72
            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                float fG;
                byte b3 = b2;
                i72[] i72VarArr3 = i72VarArr2;
                ts3 ts3Var = (ts3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fG = bf6.g(ts3Var, false, i72VarArr3, fFloatValue);
                        break;
                    default:
                        fG = bf6.g(ts3Var, true, i72VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fG);
            }
        }, (byte) 0);
        int length3 = ((tc2[]) this.x).length;
        final i72[] i72VarArr3 = new i72[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            i72VarArr3[i3] = ((tc2[]) this.x)[i3].r();
        }
        this.n = new i72(new bz1() { // from class: fk5
            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                float fG;
                byte b3 = b;
                i72[] i72VarArr4 = i72VarArr3;
                ts3 ts3Var = (ts3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fG = bf6.g(ts3Var, false, i72VarArr4, fFloatValue);
                        break;
                    default:
                        fG = bf6.g(ts3Var, true, i72VarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fG);
            }
        }, (byte) 1);
        int length4 = ((tc2[]) this.x).length;
        final i72[] i72VarArr4 = new i72[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            i72VarArr4[i4] = ((tc2[]) this.x)[i4].g();
        }
        this.v = new i72(new bz1() { // from class: h72
            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                float fG;
                byte b3 = b;
                i72[] i72VarArr5 = i72VarArr4;
                ts3 ts3Var = (ts3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fG = bf6.g(ts3Var, false, i72VarArr5, fFloatValue);
                        break;
                    default:
                        fG = bf6.g(ts3Var, true, i72VarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fG);
            }
        }, (byte) 0);
    }

    public final i72 g() {
        byte b = this.g;
        return this.v;
    }

    public final i72 n() {
        byte b = this.g;
        return this.r;
    }

    public final i72 r() {
        byte b = this.g;
        return this.n;
    }

    public final String toString() {
        byte b = this.g;
        Object obj = this.x;
        switch (b) {
            case 0:
                return pr.d0((tc2[]) obj, null, 57);
            default:
                return du4.i("RectRulers(", (String) obj, ")");
        }
    }

    public final i72 y() {
        byte b = this.g;
        return this.y;
    }

    public tc2(String str) {
        this.g = (byte) 1;
        this.x = str;
        this.y = new i72(null, (byte) 1);
        this.r = new i72(null, (byte) 0);
        this.n = new i72(null, (byte) 1);
        this.v = new i72(null, (byte) 0);
    }
}
