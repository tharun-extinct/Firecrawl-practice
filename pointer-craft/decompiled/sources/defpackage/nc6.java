package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.os.LocaleList;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nc6 {
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static gr3[] a(String str) {
        int i;
        String strTrim;
        float[] fArrT;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrT = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrT = t(fArr, i5);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    uo1.w(du4.i("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            arrayList.add(new gr3(strTrim.charAt(i2), fArrT));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrT = new float[i2];
                } else {
                    fArrT = new float[i2];
                }
                arrayList.add(new gr3(strTrim.charAt(i2), fArrT));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new gr3(str.charAt(i3), new float[0]));
        }
        return (gr3[]) arrayList.toArray(new gr3[i]);
    }

    public static String b(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(p(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(p(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(gr3[] gr3VarArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        gr3[] gr3VarArr2 = gr3VarArr;
        float[] fArr = new float[6];
        int length = gr3VarArr2.length;
        int i2 = 0;
        int i3 = 0;
        char c = 'm';
        while (i3 < length) {
            gr3 gr3Var = gr3VarArr2[i3];
            char c2 = gr3Var.g;
            float[] fArr2 = gr3Var.y;
            float f11 = fArr[i2];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            int i4 = i2;
            float f16 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i5 = i4;
            while (i5 < fArr2.length) {
                if (c2 == 'A') {
                    fArr2 = fArr2;
                    i5 = i5;
                    gr3Var = gr3Var;
                    float f21 = f20;
                    i3 = i3;
                    int i6 = i5 + 5;
                    int i7 = i5 + 6;
                    gr3.g(path, f19, f21, fArr2[i6], fArr2[i7], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f13 = fArr2[i6];
                    f = fArr2[i7];
                    f14 = f;
                    f2 = f13;
                } else if (c2 == 'C') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    gr3Var = gr3Var;
                    int i8 = i5 + 2;
                    int i9 = i5 + 3;
                    int i10 = i5 + 4;
                    int i11 = i5 + 5;
                    path.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                    float f22 = fArr2[i10];
                    float f23 = fArr2[i11];
                    f13 = fArr2[i8];
                    f14 = fArr2[i9];
                    f = f23;
                    f2 = f22;
                } else if (c2 == 'H') {
                    fArr2 = fArr2;
                    i5 = i5;
                    gr3Var = gr3Var;
                    f = f20;
                    i3 = i3;
                    path.lineTo(fArr2[i5], f);
                    f2 = fArr2[i5];
                } else if (c2 == 'Q') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    gr3Var = gr3Var;
                    int i12 = i5 + 1;
                    int i13 = i5 + 2;
                    int i14 = i5 + 3;
                    path.quadTo(fArr2[i5], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f24 = fArr2[i5];
                    float f25 = fArr2[i12];
                    float f26 = fArr2[i13];
                    float f27 = fArr2[i14];
                    f13 = f24;
                    f14 = f25;
                    f2 = f26;
                    f = f27;
                } else if (c2 == 'V') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    gr3Var = gr3Var;
                    f2 = f19;
                    path.lineTo(f2, fArr2[i5]);
                    f = fArr2[i5];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        fArr2 = fArr2;
                        i5 = i5;
                        int i15 = i5 + 2;
                        int i16 = i5 + 3;
                        int i17 = i5 + 4;
                        int i18 = i5 + 5;
                        path.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f28 = fArr2[i15] + f19;
                        float f29 = fArr2[i16] + f20;
                        f19 += fArr2[i17];
                        f20 += fArr2[i18];
                        f13 = f28;
                        f14 = f29;
                    } else if (c2 != 'h') {
                        if (c2 != 'q') {
                            if (c2 != 'v') {
                                if (c2 == 'L') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i5], fArr2[i19]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i19];
                                } else if (c2 == 'M') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    f2 = fArr2[i5];
                                    f = fArr2[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f2, f);
                                    } else {
                                        path.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c2 == 'S') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f30 = f19;
                                    float f31 = f20;
                                    int i20 = i5 + 1;
                                    int i21 = i5 + 2;
                                    int i22 = i5 + 3;
                                    path.cubicTo(f30, f31, fArr2[i5], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f13 = fArr2[i5];
                                    f14 = fArr2[i20];
                                    f2 = fArr2[i21];
                                    f = fArr2[i22];
                                } else if (c2 == 'T') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    int i23 = i5 + 1;
                                    path.quadTo(f19, f20, fArr2[i5], fArr2[i23]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i23];
                                    gr3Var = gr3Var;
                                    f13 = f19;
                                    f14 = f20;
                                } else if (c2 == 'l') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i24 = i5 + 1;
                                    path.rLineTo(fArr2[i5], fArr2[i24]);
                                    f19 += fArr2[i5];
                                    f6 = fArr2[i24];
                                } else if (c2 == 'm') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    float f32 = fArr2[i5];
                                    f19 += f32;
                                    float f33 = fArr2[i5 + 1];
                                    f20 += f33;
                                    if (i5 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        gr3Var = gr3Var;
                                        f2 = f19;
                                        f17 = f2;
                                        f = f20;
                                        f18 = f;
                                    }
                                } else if (c2 != 's') {
                                    if (c2 != 't') {
                                        f2 = f19;
                                    } else {
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i25 = i5 + 1;
                                        path.rQuadTo(f9, f10, fArr2[i5], fArr2[i25]);
                                        float f34 = f9 + f19;
                                        float f35 = f10 + f20;
                                        float f36 = f19 + fArr2[i5];
                                        f20 += fArr2[i25];
                                        f14 = f35;
                                        f2 = f36;
                                        f13 = f34;
                                    }
                                    f = f20;
                                } else {
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f7 = f20 - f14;
                                        f8 = f19 - f13;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i26 = i5;
                                    int i27 = i26 + 1;
                                    int i28 = i26 + 2;
                                    int i29 = i26 + 3;
                                    fArr2 = fArr2;
                                    i5 = i26;
                                    path.rCubicTo(f8, f7, fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    f3 = fArr2[i5] + f19;
                                    f4 = fArr2[i27] + f20;
                                    f19 += fArr2[i28];
                                    f5 = fArr2[i29];
                                }
                                gr3Var = gr3Var;
                            } else {
                                fArr2 = fArr2;
                                i5 = i5;
                                path.rLineTo(0.0f, fArr2[i5]);
                                f6 = fArr2[i5];
                            }
                            f20 += f6;
                        } else {
                            fArr2 = fArr2;
                            i5 = i5;
                            int i30 = i5 + 1;
                            int i31 = i5 + 2;
                            int i32 = i5 + 3;
                            path.rQuadTo(fArr2[i5], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f3 = fArr2[i5] + f19;
                            f4 = fArr2[i30] + f20;
                            f19 += fArr2[i31];
                            f5 = fArr2[i32];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr2 = fArr2;
                        i5 = i5;
                        path.rLineTo(fArr2[i5], 0.0f);
                        f19 += fArr2[i5];
                    }
                    gr3Var = gr3Var;
                    f2 = f19;
                    f = f20;
                } else {
                    fArr2 = fArr2;
                    i5 = i5;
                    int i33 = i5 + 5;
                    float f37 = fArr2[i33] + f19;
                    int i34 = i5 + 6;
                    float f38 = fArr2[i34] + f20;
                    gr3Var = gr3Var;
                    float f39 = f19;
                    float f40 = f20;
                    i3 = i3;
                    gr3.g(path, f39, f40, f37, f38, fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f2 = f39 + fArr2[i33];
                    f = f40 + fArr2[i34];
                    f13 = f2;
                    f14 = f;
                }
                i5 += i;
                path = path;
                gr3Var = gr3Var;
                c2 = c2;
                i3 = i3;
                f19 = f2;
                f20 = f;
                c = c2;
                fArr2 = fArr2;
            }
            fArr[i4] = f19;
            fArr[1] = f20;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f17;
            fArr[5] = f18;
            c = gr3Var.g;
            i3++;
            gr3VarArr2 = gr3VarArr;
            i2 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(xy1 xy1Var, h02 h02Var, int i) {
        h02 h02Var2;
        h02Var.Z(-563304380);
        byte b = 1;
        if (h02Var.N(i & 1, (i & 3) != 2)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                ux2 ux2Var = ux2.y;
                ux2 ux2VarN = ux2.n(LocaleList.getDefault());
                ArrayList arrayList = new ArrayList();
                int iR = ux2VarN.r();
                for (int i2 = 0; i2 < iR; i2++) {
                    Locale localeY = ux2VarN.y(i2);
                    if (localeY != null) {
                        arrayList.add(localeY);
                    }
                }
                arrayList.add(null);
                objK = arrayList instanceof qa2 ? (qa2) arrayList : null;
                if (objK == null) {
                    objK = nf6.n(arrayList);
                }
                h02Var.i0(objK);
            }
            qa2 qa2Var = (qa2) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK2);
            }
            ob3 ob3Var = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = kq2.M(cj0.l0(qa2Var));
                h02Var.i0(objK3);
            }
            ob3 ob3Var2 = (ob3) objK3;
            boolean zBooleanValue = ((Boolean) ob3Var.getValue()).booleanValue();
            Object objK4 = h02Var.K();
            if (objK4 == l76Var) {
                objK4 = new ff(ob3Var, (byte) 16);
                h02Var.i0(objK4);
            }
            h02Var2 = h02Var;
            lf6.g(zBooleanValue, (xy1) objK4, null, ue5.m0(-2141354386, new tn2(ob3Var2, ob3Var, qa2Var, xy1Var), h02Var), h02Var2, 3120);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new i81(xy1Var, i, b);
        }
    }

    public static final my1 i(xy1 xy1Var, h02 h02Var) {
        xy1Var.getClass();
        Context context = (Context) h02Var.a(sa.y);
        t4 t4Var = new t4((byte) 0);
        boolean zJ = h02Var.j(context) | h02Var.x(xy1Var);
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (zJ || objK == l76Var) {
            objK = new m(context, xy1Var, (byte) 29);
            h02Var.i0(objK);
        }
        x03 x03VarL = ra.L(t4Var, (xy1) objK, h02Var, 0);
        boolean zJ2 = h02Var.j(x03VarL);
        Object objK2 = h02Var.K();
        if (zJ2 || objK2 == l76Var) {
            objK2 = new qd((Object) x03VarL, (byte) 26);
            h02Var.i0(objK2);
        }
        return (my1) objK2;
    }

    public static final void j(my1 my1Var, h02 h02Var, int i) {
        my1Var.getClass();
        h02Var.Z(-813580806);
        int i2 = (h02Var.j(my1Var) ? 4 : 2) | i;
        byte b = 9;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            boolean zJ = h02Var.j(gx3Var) | ((i2 & 14) == 4);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new nn2(gx3Var, my1Var, (byte) 0);
                h02Var.i0(objK);
            }
            m50.w((my1) objK, null, null, 0L, 0L, null, ue5.m0(-208753795, new tn(gx3Var, b), h02Var), h02Var, 12582912);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ys(my1Var, i, b);
        }
    }

    public static final void l(String str, final xy1 xy1Var, final my1 my1Var, h02 h02Var, int i) {
        h02Var.Z(379990175);
        int i2 = i | (h02Var.x(str) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(Boolean.FALSE);
                h02Var.i0(objK);
            }
            final ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK2);
            }
            final ob3 ob3Var2 = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = kq2.M(new wn4("", str == null ? "" : str, null));
                h02Var.i0(objK3);
            }
            final ob3 ob3Var3 = (ob3) objK3;
            Boolean bool = (Boolean) ob3Var.getValue();
            bool.getClass();
            y94.y(bool, null, null, null, "public_layout", null, ue5.m0(968983484, new dz1() { // from class: mn2
                @Override // defpackage.dz1
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    h02 h02Var2 = (h02) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((hh) obj).getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= h02Var2.l(zBooleanValue) ? 32 : 16;
                    }
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                        xy1 xy1Var2 = xy1Var;
                        ob3 ob3Var4 = ob3Var3;
                        ob3 ob3Var5 = ob3Var2;
                        nm0 nm0VarM0 = ue5.m0(567831662, new yw(zBooleanValue, (Object) xy1Var2, ob3Var4, ob3Var5, (byte) 4), h02Var2);
                        my1 my1Var2 = my1Var;
                        yd6.y(my1Var2, nm0VarM0, null, ue5.m0(1548582444, new ys(my1Var2, (byte) 11), h02Var2), mz5.j, mz5.t, ue5.m0(872224969, new yw(zBooleanValue, (Object) ob3Var, ob3Var4, ob3Var5, (byte) 5), h02Var2), null, 0L, 0L, 0L, 0L, null, null, h02Var2, 1797168, 32644);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 1597440, 46);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) str, (Object) xy1Var, (Object) my1Var, i, (byte) 17);
        }
    }

    public static Path m(String str) {
        Path path = new Path();
        try {
            c(a(str), path);
            return path;
        } catch (RuntimeException e) {
            uo1.w("Error in parsing ".concat(str), e);
            return null;
        }
    }

    public static final void n(sk2 sk2Var, xy1 xy1Var, my1 my1Var, h02 h02Var, int i) {
        h02Var.Z(-1296706231);
        byte b = 4;
        int i2 = i | (h02Var.j(sk2Var) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                String str = sk2Var.y;
                if (str == null) {
                    str = "";
                }
                objK = kq2.M(str);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            yd6.y(my1Var, ue5.m0(249907451, new r2(xy1Var, my1Var, ob3Var), h02Var), null, ue5.m0(1230862265, new ys(my1Var, (byte) 10), h02Var), null, mz5.i, ue5.m0(554810838, new hb(ob3Var, b), h02Var), null, 0L, 0L, 0L, 0L, null, null, h02Var, 1772598, 32660);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) sk2Var, (Object) xy1Var, (Object) my1Var, i, (byte) 19);
        }
    }

    public static String p(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strI = du4.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI), (Throwable) e);
            return xi3.a("<", strI, " threw ", e.getClass().getName(), ">");
        }
    }

    public static final String q(sk2 sk2Var, h02 h02Var) {
        String strI = sk2Var.y;
        if (strI == null) {
            h02Var.X(22256263);
            strI = xs2.I(R.string.control_custom, h02Var);
        } else {
            h02Var.X(22255829);
        }
        h02Var.b(false);
        return strI;
    }

    public static final void r(final sk2 sk2Var, final j73 j73Var, final boolean z, final boolean z2, final boolean z3, final my1 my1Var, final my1 my1Var2, final my1 my1Var3, final my1 my1Var4, final my1 my1Var5, final my1 my1Var6, final my1 my1Var7, final my1 my1Var8, h02 h02Var, final int i) {
        h02Var.Z(1441719948);
        int i2 = i | (h02Var.j(sk2Var) ? 4 : 2) | (h02Var.x(j73Var) ? 32 : 16) | (h02Var.l(z) ? 256 : 128) | (h02Var.l(z2) ? 2048 : 1024) | (h02Var.l(z3) ? 16384 : 8192) | (h02Var.j(my1Var) ? 131072 : 65536) | (h02Var.j(my1Var2) ? 1048576 : 524288) | (h02Var.j(my1Var3) ? 8388608 : 4194304) | (h02Var.j(my1Var4) ? 67108864 : 33554432) | (h02Var.j(my1Var5) ? 536870912 : 268435456);
        if (h02Var.N(i2 & 1, ((306783379 & i2) == 306783378 && ((((h02Var.j(my1Var6) ? (char) 4 : (char) 2) | (h02Var.j(my1Var7) ? ' ' : (char) 16)) | (h02Var.j(my1Var8) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            final gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            boolean zJ = h02Var.j(gx3Var) | ((i2 & 896) == 256) | ((i2 & 458752) == 131072);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new on2(gx3Var, z, my1Var, (byte) 0);
                h02Var.i0(objK);
            }
            lr2.r(ue5.m0(-454745618, new db((byte) 4, sk2Var, z), h02Var), ue5.I(j73Var, false, null, null, (my1) objK, 15), null, null, null, ue5.m0(115169609, new bz1() { // from class: pn2
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    h02 h02Var2 = (h02) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    byte b = 1;
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objK2 = h02Var2.K();
                        l76 l76Var = oo0.g;
                        if (objK2 == l76Var) {
                            objK2 = kq2.M(Boolean.FALSE);
                            h02Var2.i0(objK2);
                        }
                        final ob3 ob3Var = (ob3) objK2;
                        kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var2, 48);
                        int iHashCode = Long.hashCode(h02Var2.T);
                        tr3 tr3VarQ = h02Var2.q();
                        g73 g73Var = g73.g;
                        j73 j73VarW = m50.W(h02Var2, g73Var);
                        jo0.n.getClass();
                        h02Var2.b0();
                        boolean z4 = h02Var2.S;
                        sx1 sx1Var = um2.Z;
                        if (z4) {
                            h02Var2.m(sx1Var);
                        } else {
                            h02Var2.l0();
                        }
                        on0 on0Var = tg1.w;
                        xs2.E(on0Var, h02Var2, kb4VarG);
                        on0 on0Var2 = tg1.q;
                        xs2.E(on0Var2, h02Var2, tr3VarQ);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        on0 on0Var3 = tg1.c;
                        xs2.E(on0Var3, h02Var2, numValueOf);
                        xs2.D(h02Var2);
                        on0 on0Var4 = tg1.m;
                        xs2.E(on0Var4, h02Var2, j73VarW);
                        Boolean boolValueOf = Boolean.valueOf(z3);
                        final sk2 sk2Var2 = sk2Var;
                        y94.y(boolValueOf, null, null, null, null, null, ue5.m0(937739714, new y71(sk2Var2, my1Var8, b), h02Var2), h02Var2, 1572864, 62);
                        final gx3 gx3Var2 = gx3Var;
                        boolean zJ2 = h02Var2.j(gx3Var2);
                        boolean z5 = z;
                        boolean zL = zJ2 | h02Var2.l(z5);
                        my1 my1Var9 = my1Var2;
                        boolean zX = zL | h02Var2.x(my1Var9);
                        Object objK3 = h02Var2.K();
                        if (zX || objK3 == l76Var) {
                            objK3 = new on2(gx3Var2, z5, my1Var9, (byte) 1);
                            h02Var2.i0(objK3);
                        }
                        k33.w((my1) objK3, null, false, null, null, mz5.z, h02Var2, 1572864, 62);
                        k00 k00Var = hi0.t;
                        j73 j73VarI = mq4.i(g73Var, k00Var, 2);
                        t33 t33VarR = z50.r(k00Var, false);
                        int iHashCode2 = Long.hashCode(h02Var2.T);
                        tr3 tr3VarQ2 = h02Var2.q();
                        j73 j73VarW2 = m50.W(h02Var2, j73VarI);
                        h02Var2.b0();
                        if (h02Var2.S) {
                            h02Var2.m(sx1Var);
                        } else {
                            h02Var2.l0();
                        }
                        xs2.E(on0Var, h02Var2, t33VarR);
                        xs2.E(on0Var2, h02Var2, tr3VarQ2);
                        du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
                        xs2.E(on0Var4, h02Var2, j73VarW2);
                        boolean zJ3 = h02Var2.j(gx3Var2) | h02Var2.l(z5);
                        Object objK4 = h02Var2.K();
                        if (zJ3 || objK4 == l76Var) {
                            objK4 = new nm1(gx3Var2, z5, ob3Var);
                            h02Var2.i0(objK4);
                        }
                        k33.w((my1) objK4, null, false, null, null, mz5.h, h02Var2, 1572864, 62);
                        boolean zBooleanValue = ((Boolean) ob3Var.getValue()).booleanValue();
                        Object objK5 = h02Var2.K();
                        if (objK5 == l76Var) {
                            objK5 = new ef(ob3Var, (byte) 25);
                            h02Var2.i0(objK5);
                        }
                        final my1 my1Var10 = my1Var3;
                        final boolean z6 = z2;
                        final my1 my1Var11 = my1Var4;
                        final my1 my1Var12 = my1Var5;
                        final my1 my1Var13 = my1Var6;
                        final my1 my1Var14 = my1Var7;
                        ad.g(zBooleanValue, (my1) objK5, null, 0L, null, null, null, 0L, 0.0f, ue5.m0(-1341489510, new cz1() { // from class: rn2
                            @Override // defpackage.cz1
                            public final Object x(Object obj3, Object obj4, Object obj5) {
                                ob3 ob3Var2;
                                ob3 ob3Var3;
                                boolean z7;
                                ob3 ob3Var4;
                                h02 h02Var3 = (h02) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gk0) obj3).getClass();
                                if (h02Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    my1 my1Var15 = my1Var10;
                                    boolean zX2 = h02Var3.x(my1Var15);
                                    Object objK6 = h02Var3.K();
                                    ob3 ob3Var5 = ob3Var;
                                    l76 l76Var2 = oo0.g;
                                    if (zX2 || objK6 == l76Var2) {
                                        objK6 = new bm0(my1Var15, ob3Var5, (byte) 3);
                                        h02Var3.i0(objK6);
                                    }
                                    ad.y(mz5.o, (my1) objK6, null, mz5.f, null, false, null, null, h02Var3, 3078, 500);
                                    gx3 gx3Var3 = gx3Var2;
                                    boolean zJ4 = h02Var3.j(gx3Var3);
                                    boolean z8 = z6;
                                    boolean zL2 = zJ4 | h02Var3.l(z8);
                                    my1 my1Var16 = my1Var11;
                                    boolean zX3 = zL2 | h02Var3.x(my1Var16);
                                    Object objK7 = h02Var3.K();
                                    if (zX3 || objK7 == l76Var2) {
                                        sn2 sn2Var = new sn2(gx3Var3, z8, ob3Var5, my1Var16, (byte) 0);
                                        ob3Var2 = ob3Var5;
                                        h02Var3.i0(sn2Var);
                                        objK7 = sn2Var;
                                    } else {
                                        ob3Var2 = ob3Var5;
                                    }
                                    ad.y(mz5.k, (my1) objK7, null, mz5.d, z8 != 0 ? mz5.e : null, false, null, null, h02Var3, 3078, 484);
                                    if (sk2Var2.j != null) {
                                        h02Var3.X(358469297);
                                        boolean zJ5 = h02Var3.j(gx3Var3) | h02Var3.l(z8);
                                        my1 my1Var17 = my1Var12;
                                        boolean zX4 = zJ5 | h02Var3.x(my1Var17);
                                        Object objK8 = h02Var3.K();
                                        if (zX4 || objK8 == l76Var2) {
                                            ob3Var4 = ob3Var2;
                                            sn2 sn2Var2 = new sn2(gx3Var3, z8, ob3Var4, my1Var17, (byte) 1);
                                            h02Var3.i0(sn2Var2);
                                            objK8 = sn2Var2;
                                        } else {
                                            ob3Var4 = ob3Var2;
                                        }
                                        ob3Var3 = ob3Var4;
                                        ad.y(mz5.A, (my1) objK8, null, mz5.B, z8 != 0 ? mz5.C : null, false, null, null, h02Var3, 3078, 484);
                                        my1 my1Var18 = my1Var13;
                                        boolean zX5 = h02Var3.x(my1Var18);
                                        Object objK9 = h02Var3.K();
                                        if (zX5 || objK9 == l76Var2) {
                                            objK9 = new bm0(my1Var18, ob3Var3, (byte) 4);
                                            h02Var3.i0(objK9);
                                        }
                                        ad.y(mz5.D, (my1) objK9, null, mz5.E, null, false, null, null, h02Var3, 3078, 500);
                                        h02Var3.b(false);
                                    } else {
                                        ob3Var3 = ob3Var2;
                                        h02Var3.X(360275016);
                                        h02Var3.b(false);
                                    }
                                    m50.p(null, 0.0f, 0L, h02Var3, 0, 7);
                                    boolean zJ6 = h02Var3.j(gx3Var3) | h02Var3.l(z8);
                                    my1 my1Var19 = my1Var14;
                                    boolean zX6 = h02Var3.x(my1Var19) | zJ6;
                                    Object objK10 = h02Var3.K();
                                    if (zX6 || objK10 == l76Var2) {
                                        z7 = z8;
                                        sn2 sn2Var3 = new sn2(gx3Var3, z7, ob3Var3, my1Var19, (byte) 2);
                                        h02Var3.i0(sn2Var3);
                                        objK10 = sn2Var3;
                                    } else {
                                        z7 = z8;
                                    }
                                    ad.y(mz5.F, (my1) objK10, null, mz5.G, z7 ? mz5.H : null, false, null, null, h02Var3, 3078, 484);
                                } else {
                                    h02Var3.Q();
                                }
                                return og5.g;
                            }
                        }, h02Var2), h02Var2, 48, 2044);
                        h02Var2.b(true);
                        h02Var2.b(true);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), null, 0.0f, h02Var, 196614, 476);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j73Var, z, z2, z3, my1Var, my1Var2, my1Var3, my1Var4, my1Var5, my1Var6, my1Var7, my1Var8, i) { // from class: qn2
                public final /* synthetic */ boolean a;
                public final /* synthetic */ my1 b;
                public final /* synthetic */ my1 c;
                public final /* synthetic */ my1 i;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ my1 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ my1 s;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ my1 u;
                public final /* synthetic */ my1 w;
                public final /* synthetic */ my1 z;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(9);
                    nc6.r(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, this.p, this.u, this.z, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static String s(String str) {
        return str == null ? "" : str;
    }

    public static float[] t(float[] fArr, int i) {
        if (i < 0) {
            t94.g();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final void v(ao2 ao2Var, xy1 xy1Var, xy1 xy1Var2, xy1 xy1Var3, h02 h02Var, int i) {
        boolean z;
        ao2Var.getClass();
        xy1Var.getClass();
        xy1Var2.getClass();
        xy1Var3.getClass();
        h02Var.Z(-182252448);
        int i2 = i | (h02Var.j(ao2Var) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.j(xy1Var2) ? 256 : 128) | (h02Var.j(xy1Var3) ? 2048 : 1024);
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ob3 ob3VarS = og0.s(ao2Var.t, h02Var);
            Object objK = h02Var.K();
            mu0 mu0Var = null;
            Object obj = oo0.g;
            if (objK == obj) {
                objK = kq2.M(null);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = kq2.M(null);
                h02Var.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == obj) {
                objK3 = kq2.M(null);
                h02Var.i0(objK3);
            }
            ob3 ob3Var3 = (ob3) objK3;
            Object obj2 = (yt4) h02Var.a(hp0.s);
            Boolean boolValueOf = Boolean.valueOf(((sk2) ob3Var2.getValue()) == null);
            boolean zX = h02Var.x(obj2);
            Object objK4 = h02Var.K();
            if (zX || objK4 == obj) {
                objK4 = new dy(obj2, mu0Var, (byte) 17);
                h02Var.i0(objK4);
            }
            k33.b((bz1) objK4, h02Var, boolValueOf);
            Object obj3 = (Context) h02Var.a(sa.y);
            Object objK5 = h02Var.K();
            if (objK5 == obj) {
                objK5 = kq2.M(null);
                h02Var.i0(objK5);
            }
            ob3 ob3Var4 = (ob3) objK5;
            t4 t4Var = new t4((byte) 2);
            boolean zJ = h02Var.j(obj3);
            Object objK6 = h02Var.K();
            if (zJ || objK6 == obj) {
                objK6 = new kn2(obj3, ob3Var4, (byte) 1);
                h02Var.i0(objK6);
            }
            Object objL = ra.L(t4Var, (xy1) objK6, h02Var, 8);
            boolean zJ2 = h02Var.j(objL) | h02Var.j(obj3);
            Object objK7 = h02Var.K();
            if (zJ2 || objK7 == obj) {
                objK7 = new q2(objL, obj3, (Object) ob3Var4, (byte) 15);
                h02Var.i0(objK7);
            }
            xy1 xy1Var4 = (xy1) objK7;
            sk2 sk2Var = (sk2) ob3Var.getValue();
            byte b = 5;
            if (sk2Var == null) {
                h02Var.X(-643291319);
                z = false;
                h02Var.b(false);
            } else {
                h02Var.X(-643291318);
                boolean zJ3 = ((i2 & 14) == 4 || h02Var.j(ao2Var)) | h02Var.j(sk2Var);
                Object objK8 = h02Var.K();
                if (zJ3 || objK8 == obj) {
                    objK8 = new o82(ao2Var, sk2Var, b);
                    h02Var.i0(objK8);
                }
                my1 my1Var = (my1) objK8;
                Object objK9 = h02Var.K();
                if (objK9 == obj) {
                    objK9 = new ef(ob3Var, (byte) 21);
                    h02Var.i0(objK9);
                }
                y(sk2Var, my1Var, (my1) objK9, h02Var, 392);
                z = false;
                h02Var.b(false);
            }
            sk2 sk2Var2 = (sk2) ob3Var2.getValue();
            if (sk2Var2 == null) {
                h02Var.X(-643057393);
                h02Var.b(z);
            } else {
                h02Var.X(-643057392);
                boolean zJ4 = ((i2 & 14) == 4 || h02Var.j(ao2Var)) | h02Var.j(sk2Var2);
                Object objK10 = h02Var.K();
                if (zJ4 || objK10 == obj) {
                    objK10 = new kn2(ao2Var, sk2Var2, (byte) 0);
                    h02Var.i0(objK10);
                }
                xy1 xy1Var5 = (xy1) objK10;
                Object objK11 = h02Var.K();
                if (objK11 == obj) {
                    objK11 = new ef(ob3Var2, (byte) 22);
                    h02Var.i0(objK11);
                }
                n(sk2Var2, xy1Var5, (my1) objK11, h02Var, 392);
                z = false;
                h02Var.b(false);
            }
            sk2 sk2Var3 = (sk2) ob3Var3.getValue();
            if (sk2Var3 == null) {
                h02Var.X(-642797551);
                h02Var.b(z);
            } else {
                h02Var.X(-642797550);
                String str = sk2Var3.y;
                boolean zJ5 = ((i2 & 14) == 4 || h02Var.j(ao2Var)) | h02Var.j(sk2Var3);
                Object objK12 = h02Var.K();
                if (zJ5 || objK12 == obj) {
                    objK12 = new q2((Object) ao2Var, (Object) sk2Var3, (Object) ob3Var3, (byte) 14);
                    h02Var.i0(objK12);
                }
                xy1 xy1Var6 = (xy1) objK12;
                Object objK13 = h02Var.K();
                if (objK13 == obj) {
                    objK13 = new ef(ob3Var3, (byte) 23);
                    h02Var.i0(objK13);
                }
                l(str, xy1Var6, (my1) objK13, h02Var, 384);
                h02Var.b(false);
            }
            ho1 ho1Var = mq4.r;
            bo3 bo3VarS = ue5.s(0.0f, 8.0f, 0.0f, 144.0f, 5);
            boolean zX2 = h02Var.x(ob3VarS) | ((i2 & 14) == 4 || h02Var.j(ao2Var)) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | h02Var.x(xy1Var4) | ((i2 & 7168) == 2048);
            Object objK14 = h02Var.K();
            if (zX2 || objK14 == obj) {
                Object tz1Var = new tz1(ob3VarS, ao2Var, xy1Var, xy1Var2, xy1Var4, xy1Var3, ob3Var2, ob3Var3, ob3Var);
                h02Var.i0(tz1Var);
                objK14 = tz1Var;
            }
            aq2.g(ho1Var, null, bo3VarS, null, null, null, false, null, (xy1) objK14, h02Var, 390, 506);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zy(ao2Var, xy1Var, xy1Var2, xy1Var3, i, (byte) 5);
        }
    }

    public static int w(Context context, int i) {
        return context.getColor(i);
    }

    public static final void x(ao2 ao2Var, final xy1 xy1Var, final xy1 xy1Var2, final xy1 xy1Var3, final xy1 xy1Var4, h02 h02Var, int i) {
        Object s3Var;
        xh5 xh5Var;
        Object obj;
        qp2 qp2Var;
        es4 es4Var;
        byte b;
        int i2;
        final ao2 ao2Var2 = ao2Var;
        ao2Var2.getClass();
        xy1Var.getClass();
        xy1Var2.getClass();
        xy1Var3.getClass();
        xy1Var4.getClass();
        h02Var.Z(-320137149);
        int i3 = i | (h02Var.j(ao2Var2) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.j(xy1Var2) ? 256 : 128) | (h02Var.j(xy1Var3) ? 2048 : 1024) | (h02Var.j(xy1Var4) ? 16384 : 8192);
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ob3 ob3VarQ = kq2.Q(xy1Var, h02Var);
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (objK == obj2) {
                objK = new es4();
                h02Var.i0(objK);
            }
            es4 es4Var2 = (es4) objK;
            xn2 xn2VarX = ao2Var2.x();
            List list = xn2VarX.g;
            qp2 qp2Var2 = xn2VarX.r;
            xh5 xh5Var2 = (xh5) cj0.l0(list);
            if (xh5Var2 == null) {
                h02Var.X(1917006787);
                h02Var.b(false);
                obj = obj2;
                ob3VarQ = ob3VarQ;
                xn2VarX = xn2VarX;
                qp2Var = qp2Var2;
                es4Var = es4Var2;
            } else {
                h02Var.X(1917006788);
                Object objI = xs2.I(xh5Var2.y, h02Var);
                boolean zX = h02Var.x(objI) | ((i3 & 14) == 4 || h02Var.j(ao2Var2)) | h02Var.j(xh5Var2);
                Object objK2 = h02Var.K();
                if (zX || objK2 == obj2) {
                    xh5Var = xh5Var2;
                    obj = obj2;
                    qp2Var = qp2Var2;
                    s3Var = new s3(es4Var2, objI, ao2Var2, xh5Var, null, (byte) 14);
                    es4Var = es4Var2;
                    ao2Var2 = ao2Var2;
                    h02Var.i0(s3Var);
                } else {
                    obj = obj2;
                    xh5Var = xh5Var2;
                    qp2Var = qp2Var2;
                    es4Var = es4Var2;
                    s3Var = objK2;
                }
                k33.b((bz1) s3Var, h02Var, xh5Var);
                h02Var.b(false);
            }
            if (qp2Var != null) {
                h02Var.X(1917354732);
                boolean zJ = h02Var.j(xn2VarX) | h02Var.x(ob3VarQ) | ((i3 & 14) == 4 || h02Var.j(ao2Var2));
                Object objK3 = h02Var.K();
                if (zJ || objK3 == obj) {
                    ob3 ob3Var = ob3VarQ;
                    b = 14;
                    Object moVar = new mo(xn2VarX, ao2Var2, ob3Var, null, (byte) 5);
                    h02Var.i0(moVar);
                    objK3 = moVar;
                } else {
                    b = 14;
                }
                k33.b((bz1) objK3, h02Var, qp2Var);
                i2 = 0;
                h02Var.b(false);
            } else {
                b = 14;
                i2 = 0;
                h02Var.X(1917557503);
                h02Var.b(false);
            }
            Object[] objArr = new Object[i2];
            Object objK4 = h02Var.K();
            if (objK4 == obj) {
                objK4 = new yj2((byte) 1);
                h02Var.i0(objK4);
            }
            final qp3 qp3Var = (qp3) xq2.f(objArr, (my1) objK4, h02Var);
            kq2.v(null, null, ue5.m0(-115989986, new ed(qp3Var, (byte) 13), h02Var), ue5.m0(-1098983363, new ed(es4Var, b), h02Var), ue5.m0(-2081976740, new ta(qp3Var, ao2Var2, (byte) 21), h02Var), 1, ((rj0) h02Var.a(tj0.g)).b, 0L, new op1(0), ue5.m0(1822872212, new cz1() { // from class: un2
                @Override // defpackage.cz1
                public final Object x(Object obj3, Object obj4, Object obj5) {
                    zn3 zn3Var = (zn3) obj3;
                    h02 h02Var2 = (h02) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    zn3Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= h02Var2.x(zn3Var) ? 4 : 2;
                    }
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        y94.l(Integer.valueOf(qp3Var.d()), ue5.d0(g73.g, zn3Var), null, null, ue5.m0(-1017294694, new v80((Object) ao2Var2, (Object) xy1Var2, (Object) xy1Var3, (Object) xy1Var, (Object) xy1Var4, (byte) 3), h02Var2), h02Var2, 24576, 12);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 805334400, 131);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vb0(ao2Var, xy1Var, xy1Var2, xy1Var3, xy1Var4, i, (byte) 3);
        }
    }

    public static final void y(sk2 sk2Var, my1 my1Var, my1 my1Var2, h02 h02Var, int i) {
        h02Var.Z(-1247994053);
        byte b = 2;
        int i2 = i | (h02Var.j(sk2Var) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            yd6.y(my1Var2, ue5.m0(298619629, new yn(my1Var, my1Var2, b), h02Var), null, ue5.m0(1279574443, new ys(my1Var2, (byte) 8), h02Var), mz5.p, ue5.m0(-2034438039, new ed(sk2Var, (byte) 12), h02Var), null, null, 0L, 0L, 0L, 0L, null, null, h02Var, 224310, 32708);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) sk2Var, (Object) my1Var, (jz1) my1Var2, i, (byte) 16);
        }
    }
}
