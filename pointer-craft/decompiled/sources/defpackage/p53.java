package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class p53 implements me4 {
    public static final int[] c = new int[0];
    public static final Unsafe i;
    public final tg3 a;
    public final int[] g;
    public final int j;
    public final int[] l;
    public final xv2 m;
    public final int n;
    public final sg5 q;
    public final int r;
    public final int t;
    public final t0 v;
    public final p13 w;
    public final boolean x;
    public final Object[] y;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ch5((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public p53(int[] iArr, Object[] objArr, int i2, int i3, t0 t0Var, int[] iArr2, int i4, int i5, tg3 tg3Var, xv2 xv2Var, sg5 sg5Var, zm1 zm1Var, p13 p13Var) {
        this.g = iArr;
        this.y = objArr;
        this.r = i2;
        this.n = i3;
        this.x = t0Var instanceof c12;
        this.l = iArr2;
        this.j = i4;
        this.t = i5;
        this.a = tg3Var;
        this.m = xv2Var;
        this.q = sg5Var;
        this.v = t0Var;
        this.w = p13Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int I(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c12) {
            return ((c12) obj).l();
        }
        return true;
    }

    public static int d(long j, Object obj) {
        return ((Integer) jh5.j(j, obj)).intValue();
    }

    public static long e(long j, Object obj) {
        return ((Long) jh5.j(j, obj)).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    public static p53 f(a34 a34Var, tg3 tg3Var, xv2 xv2Var, sg5 sg5Var, zm1 zm1Var, p13 p13Var) {
        int i2;
        int iCharAt;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        int iObjectFieldOffset3;
        Field fieldF;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldF2;
        int i27;
        Object obj2;
        Field fieldF3;
        int i28;
        char cCharAt10;
        int i29;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(a34Var instanceof a34)) {
            uo1.B();
            return null;
        }
        String str = a34Var.y;
        int length = str.length();
        char c2 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i2 = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i2;
            }
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int iCharAt2 = str.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                cCharAt13 = str.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i7 = 0;
            iCharAt = 0;
            i3 = 0;
            i6 = 0;
            i8 = 0;
            iArr = c;
            i5 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = str.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i16 = i37 + 1;
                    cCharAt8 = str.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i16;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i16;
            }
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i15 = i40 + 1;
                    cCharAt7 = str.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i15;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i15;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i14 = i43 + 1;
                    cCharAt6 = str.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i14;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i14;
            }
            int i46 = i43 + 1;
            int iCharAt6 = str.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i13 = i46 + 1;
                    cCharAt5 = str.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i13;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i13;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i12 = i49 + 1;
                    cCharAt4 = str.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i12;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i12;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i11 = i52 + 1;
                    cCharAt3 = str.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i11;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i11;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i10 = i55 + 1;
                    cCharAt2 = str.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i10;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i10;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i9 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i9;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i9;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = (iCharAt3 * 2) + iCharAt4;
            int i62 = iCharAt7;
            i3 = iCharAt5;
            i4 = i62;
            i5 = iCharAt3;
            i34 = i58;
            iArr = iArr2;
            i6 = iCharAt6;
            i7 = i61;
            i8 = iCharAt9;
        }
        Object[] objArr = a34Var.r;
        Class<?> cls = a34Var.g.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i63 = i8 + i4;
        int i64 = i63;
        int i65 = i8;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt10 = str.charAt(i34);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt12 = str.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i17 = i31;
            } else {
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt11 = str.charAt(i74);
                    i18 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i30;
                    length = i18;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i19 = i30;
            } else {
                i18 = length;
                i19 = i72;
            }
            int i76 = iCharAt11 & 255;
            int i77 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i78 = i5;
            Unsafe unsafe = i;
            if (i76 >= 51) {
                int i79 = i19 + 1;
                int iCharAt12 = str.charAt(i19);
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i28 = i81 + 1;
                        cCharAt10 = str.charAt(i81);
                        i29 = i80;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i80 = i29 | ((cCharAt10 & 8191) << i82);
                        i82 += 13;
                        i81 = i28;
                    }
                    iCharAt12 = i29 | (cCharAt10 << i82);
                    i24 = i28;
                } else {
                    i24 = i79;
                }
                int i83 = iCharAt12;
                int i84 = i76 - 51;
                int i85 = i24;
                if (i84 == 9 || i84 == 17) {
                    i25 = i7 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr[i7];
                } else {
                    if (i84 == 12 && (du4.g(a34Var.g(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i7 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr[i7];
                    }
                    i26 = i83 * 2;
                    obj = objArr[i26];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr[i26] = fieldF2;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                    i27 = i26 + 1;
                    obj2 = objArr[i27];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr[i27] = fieldF3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                    objArr2 = objArr2;
                    i21 = i85;
                    i22 = 0;
                }
                i7 = i25;
                i26 = i83 * 2;
                obj = objArr[i26];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i26] = fieldF2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                i27 = i26 + 1;
                obj2 = objArr[i27];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i27] = fieldF3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                objArr2 = objArr2;
                i21 = i85;
                i22 = 0;
            } else {
                int i86 = i7 + 1;
                Field fieldF4 = F(cls, (String) objArr[i7]);
                if (i76 == 9 || i76 == 17) {
                    i20 = i86;
                    objArr2[((i67 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i23 = i7 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr[i86];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        i20 = i86;
                        if (a34Var.g() == 1 || (iCharAt11 & 2048) != 0) {
                            i23 = i7 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr[i20];
                        }
                    } else if (i76 == 50) {
                        int i87 = i65 + 1;
                        iArr[i65] = i67;
                        int i88 = (i67 / 3) * 2;
                        i20 = i7 + 2;
                        objArr2[i88] = objArr[i86];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i88 + 1] = objArr[i20];
                            i20 = i7 + 3;
                        }
                        i65 = i87;
                    } else {
                        i20 = i86;
                    }
                    i20 = i23;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) == 0 || i76 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i21 = i19;
                    i22 = 0;
                } else {
                    int i89 = i19 + 1;
                    int iCharAt13 = str.charAt(i19);
                    if (iCharAt13 >= 55296) {
                        int i90 = iCharAt13 & 8191;
                        int i91 = 13;
                        while (true) {
                            i21 = i89 + 1;
                            cCharAt9 = str.charAt(i89);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i90 |= (cCharAt9 & 8191) << i91;
                            i91 += 13;
                            i89 = i21;
                        }
                        iCharAt13 = i90 | (cCharAt9 << i91);
                    } else {
                        i21 = i89;
                    }
                    int i92 = (iCharAt13 / 32) + (i78 * 2);
                    Object obj3 = objArr[i92];
                    if (obj3 instanceof Field) {
                        fieldF = (Field) obj3;
                    } else {
                        fieldF = F(cls, (String) obj3);
                        objArr[i92] = fieldF;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                    i22 = iCharAt13 % 32;
                }
                if (i76 < 18 || i76 > 49) {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                } else {
                    iArr[i64] = iObjectFieldOffset;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i64++;
                }
                i7 = i20;
            }
            int i93 = i67 + 1;
            iArr3[i67] = i77;
            int i94 = i67 + 2;
            String str2 = str;
            iArr3[i93] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr3[i94] = (i22 << 20) | iObjectFieldOffset3;
            objArr2 = objArr2;
            str = str2;
            i34 = i21;
            length = i18;
            i5 = i78;
            iArr3 = iArr3;
            i63 = i63;
            c2 = 55296;
        }
        return new p53(iArr3, objArr2, i3, i6, a34Var.g, iArr, i8, i63, tg3Var, xv2Var, sg5Var, zm1Var, p13Var);
    }

    public static long k(int i2) {
        return i2 & 1048575;
    }

    public final int A(int i2) {
        if (i2 < this.r || i2 > this.n) {
            return -1;
        }
        int[] iArr = this.g;
        int length = (iArr.length / 3) - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, ti0 ti0Var, me4 me4Var, xm1 xm1Var) throws gg2 {
        int iC;
        this.m.getClass();
        ef2 ef2VarG = xv2.g(j, obj);
        ri0 ri0Var = (ri0) ti0Var.n;
        int i2 = ti0Var.g;
        if ((i2 & 7) != 3) {
            throw ig2.y();
        }
        do {
            c12 c12VarN = me4Var.n();
            ti0Var.n(c12VarN, me4Var, xm1Var);
            me4Var.y(c12VarN);
            ((d14) ef2VarG).add(c12VarN);
            if (ri0Var.v() || ti0Var.r != 0) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == i2);
        ti0Var.r = iC;
    }

    public final void C(Object obj, int i2, ti0 ti0Var, me4 me4Var, xm1 xm1Var) throws ig2 {
        int iC;
        this.m.getClass();
        ef2 ef2VarG = xv2.g(i2 & 1048575, obj);
        ri0 ri0Var = (ri0) ti0Var.n;
        int i3 = ti0Var.g;
        if ((i3 & 7) != 2) {
            throw ig2.y();
        }
        do {
            c12 c12VarN = me4Var.n();
            ti0Var.v(c12VarN, me4Var, xm1Var);
            me4Var.y(c12VarN);
            ((d14) ef2VarG).add(c12VarN);
            if (ri0Var.v() || ti0Var.r != 0) {
                return;
            } else {
                iC = ri0Var.C();
            }
        } while (iC == i3);
        ti0Var.r = iC;
    }

    public final void D(int i2, ti0 ti0Var, Object obj) throws gg2 {
        if ((536870912 & i2) != 0) {
            ti0Var.d(2);
            jh5.i(i2 & 1048575, obj, ((ri0) ti0Var.n).B());
        } else if (!this.x) {
            jh5.i(i2 & 1048575, obj, ti0Var.l());
        } else {
            ti0Var.d(2);
            jh5.i(i2 & 1048575, obj, ((ri0) ti0Var.n).A());
        }
    }

    public final void E(int i2, ti0 ti0Var, Object obj) throws gg2 {
        boolean z = (536870912 & i2) != 0;
        xv2 xv2Var = this.m;
        if (z) {
            xv2Var.getClass();
            ti0Var.h(xv2.g(i2 & 1048575, obj), true);
        } else {
            xv2Var.getClass();
            ti0Var.h(xv2.g(i2 & 1048575, obj), false);
        }
    }

    public final void G(int i2, Object obj) {
        int i3 = this.g[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        jh5.w(obj, j, (1 << (i3 >>> 20)) | jh5.x(j, obj));
    }

    public final void H(int i2, int i3, Object obj) {
        jh5.w(obj, this.g[i3 + 2] & 1048575, i2);
    }

    public final int J(int i2) {
        return this.g[i2 + 1];
    }

    public final boolean a(c12 c12Var, c12 c12Var2, int i2) {
        return c(i2, c12Var) == c(i2, c12Var2);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean c(int i2, Object obj) {
        int i3 = this.g[i2 + 2];
        long j = i3 & 1048575;
        if (j != 1048575) {
            if (((1 << (i3 >>> 20)) & jh5.x(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iJ = J(i2);
        long j2 = iJ & 1048575;
        switch (I(iJ)) {
            case 0:
                if (Double.doubleToRawLongBits(jh5.r.r(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(jh5.r.n(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (jh5.l(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (jh5.l(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (jh5.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (jh5.l(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (jh5.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return jh5.r.g(j2, obj);
            case 8:
                Object objJ = jh5.j(j2, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof da0) {
                    return !da0.a.equals(objJ);
                }
                t94.g();
                return false;
            case 9:
                if (jh5.j(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !da0.a.equals(jh5.j(j2, obj));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (jh5.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (jh5.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (jh5.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (jh5.l(j2, obj) != 0) {
                    return true;
                }
                return false;
            case kq2.x /* 15 */:
                if (jh5.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (jh5.l(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (jh5.j(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                t94.g();
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.me4
    public final void g(Object obj, Object obj2) {
        Object obj3;
        if (!b(obj)) {
            l0.m(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i2 >= iArr.length) {
                qe4.m(this.q, obj, obj2);
                return;
            }
            int iJ = J(i2);
            long j = 1048575 & iJ;
            int i3 = iArr[i2];
            switch (I(iJ)) {
                case 0:
                    if (!c(i2, obj2)) {
                        obj3 = obj;
                    } else {
                        hh5 hh5Var = jh5.r;
                        obj3 = obj;
                        hh5Var.l(obj3, j, hh5Var.r(j, obj2));
                        G(i2, obj3);
                    }
                    break;
                case 1:
                    if (c(i2, obj2)) {
                        hh5 hh5Var2 = jh5.r;
                        hh5Var2.j(obj, j, hh5Var2.n(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (c(i2, obj2)) {
                        jh5.c(obj, j, jh5.l(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (c(i2, obj2)) {
                        jh5.c(obj, j, jh5.l(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (c(i2, obj2)) {
                        jh5.w(obj, j, jh5.x(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (c(i2, obj2)) {
                        jh5.c(obj, j, jh5.l(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (c(i2, obj2)) {
                        jh5.w(obj, j, jh5.x(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (c(i2, obj2)) {
                        hh5 hh5Var3 = jh5.r;
                        hh5Var3.v(obj, j, hh5Var3.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (c(i2, obj2)) {
                        jh5.i(j, obj, jh5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    u(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (c(i2, obj2)) {
                        jh5.i(j, obj, jh5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (c(i2, obj2)) {
                        jh5.w(obj, j, jh5.x(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (c(i2, obj2)) {
                        jh5.w(obj, j, jh5.x(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (c(i2, obj2)) {
                        jh5.w(obj, j, jh5.x(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (c(i2, obj2)) {
                        jh5.c(obj, j, jh5.l(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case kq2.x /* 15 */:
                    if (c(i2, obj2)) {
                        jh5.w(obj, j, jh5.x(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (c(i2, obj2)) {
                        jh5.c(obj, j, jh5.l(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    u(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case kq2.l /* 48 */:
                case 49:
                    this.m.getClass();
                    ef2 ef2VarN = (ef2) jh5.j(j, obj);
                    ef2 ef2Var = (ef2) jh5.j(j, obj2);
                    int i4 = ((d14) ef2VarN).a;
                    int i5 = ((d14) ef2Var).a;
                    if (i4 > 0 && i5 > 0) {
                        if (!((d14) ef2VarN).j) {
                            ef2VarN = ((d14) ef2VarN).n(i5 + i4);
                        }
                        ((d14) ef2VarN).addAll(ef2Var);
                    }
                    if (i4 > 0) {
                        ef2Var = ef2VarN;
                    }
                    jh5.i(j, obj, ef2Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = qe4.g;
                    Object objJ = jh5.j(j, obj);
                    Object objJ2 = jh5.j(j, obj2);
                    this.w.getClass();
                    jh5.i(j, obj, p13.g(objJ, objJ2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (s(i3, i2, obj2)) {
                        jh5.i(j, obj, jh5.j(j, obj2));
                        H(i3, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    z(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i3, i2, obj2)) {
                        jh5.i(j, obj, jh5.j(j, obj2));
                        H(i3, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    z(i2, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i2 += 3;
            obj = obj3;
        }
    }

    public final Object h(int i2, Object obj) {
        me4 me4VarW = w(i2);
        long J = J(i2) & 1048575;
        if (!c(i2, obj)) {
            return me4VarW.n();
        }
        Object object = i.getObject(obj, J);
        if (b(object)) {
            return object;
        }
        c12 c12VarN = me4VarW.n();
        if (object != null) {
            me4VarW.g(c12VarN, object);
        }
        return c12VarN;
    }

    public final boolean i(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return c(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // defpackage.me4
    public final boolean j(c12 c12Var, c12 c12Var2) {
        int[] iArr = this.g;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean zQ = true;
            if (i2 < length) {
                int iJ = J(i2);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!a(c12Var, c12Var2, i2)) {
                            zQ = false;
                        } else {
                            hh5 hh5Var = jh5.r;
                            if (Double.doubleToLongBits(hh5Var.r(j, c12Var)) != Double.doubleToLongBits(hh5Var.r(j, c12Var2))) {
                                zQ = false;
                            }
                        }
                        break;
                    case 1:
                        if (!a(c12Var, c12Var2, i2)) {
                            zQ = false;
                        } else {
                            hh5 hh5Var2 = jh5.r;
                            if (Float.floatToIntBits(hh5Var2.n(j, c12Var)) != Float.floatToIntBits(hh5Var2.n(j, c12Var2))) {
                                zQ = false;
                            }
                        }
                        break;
                    case 2:
                        if (!a(c12Var, c12Var2, i2) || jh5.l(j, c12Var) != jh5.l(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 3:
                        if (!a(c12Var, c12Var2, i2) || jh5.l(j, c12Var) != jh5.l(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 4:
                        if (!a(c12Var, c12Var2, i2) || jh5.x(j, c12Var) != jh5.x(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 5:
                        if (!a(c12Var, c12Var2, i2) || jh5.l(j, c12Var) != jh5.l(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 6:
                        if (!a(c12Var, c12Var2, i2) || jh5.x(j, c12Var) != jh5.x(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 7:
                        if (!a(c12Var, c12Var2, i2)) {
                            zQ = false;
                        } else {
                            hh5 hh5Var3 = jh5.r;
                            if (hh5Var3.g(j, c12Var) != hh5Var3.g(j, c12Var2)) {
                                zQ = false;
                            }
                        }
                        break;
                    case 8:
                        if (!a(c12Var, c12Var2, i2) || !qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2))) {
                            zQ = false;
                        }
                        break;
                    case 9:
                        if (!a(c12Var, c12Var2, i2) || !qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2))) {
                            zQ = false;
                        }
                        break;
                    case 10:
                        if (!a(c12Var, c12Var2, i2) || !qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2))) {
                            zQ = false;
                        }
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        if (!a(c12Var, c12Var2, i2) || jh5.x(j, c12Var) != jh5.x(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 12:
                        if (!a(c12Var, c12Var2, i2) || jh5.x(j, c12Var) != jh5.x(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 13:
                        if (!a(c12Var, c12Var2, i2) || jh5.x(j, c12Var) != jh5.x(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 14:
                        if (!a(c12Var, c12Var2, i2) || jh5.l(j, c12Var) != jh5.l(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case kq2.x /* 15 */:
                        if (!a(c12Var, c12Var2, i2) || jh5.x(j, c12Var) != jh5.x(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 16:
                        if (!a(c12Var, c12Var2, i2) || jh5.l(j, c12Var) != jh5.l(j, c12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 17:
                        if (!a(c12Var, c12Var2, i2) || !qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2))) {
                            zQ = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case kq2.l /* 48 */:
                    case 49:
                        zQ = qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2));
                        break;
                    case 50:
                        zQ = qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i2 + 2] & 1048575;
                        if (jh5.x(j2, c12Var) != jh5.x(j2, c12Var2) || !qe4.q(jh5.j(j, c12Var), jh5.j(j, c12Var2))) {
                            zQ = false;
                        }
                        break;
                }
                if (zQ) {
                    i2 += 3;
                }
            } else {
                this.q.getClass();
                if (c12Var.unknownFields.equals(c12Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x0310  */
    /* JADX WARN: Code duplicated, block: B:122:0x031d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0330  */
    /* JADX WARN: Code duplicated, block: B:125:0x0340  */
    /* JADX WARN: Code duplicated, block: B:127:0x034a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0354  */
    /* JADX WARN: Code duplicated, block: B:130:0x0362  */
    /* JADX WARN: Code duplicated, block: B:131:0x036f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0374  */
    /* JADX WARN: Code duplicated, block: B:135:0x0381  */
    /* JADX WARN: Code duplicated, block: B:136:0x0389  */
    /* JADX WARN: Code duplicated, block: B:137:0x0398  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0400  */
    /* JADX WARN: Code duplicated, block: B:278:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.me4
    public final void l(Object obj, q64 q64Var) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int iA;
        int size;
        int iT;
        int iG;
        int iT2;
        int i6;
        int iJ;
        int iA2;
        int size2;
        int iT3;
        p53 p53Var = this;
        q64Var.getClass();
        xi0 xi0Var = (xi0) q64Var.t;
        int[] iArr = p53Var.g;
        int length = iArr.length;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int iJ2 = p53Var.J(i9);
            int i11 = iArr[i9];
            int I = I(iJ2);
            Unsafe unsafe = i;
            if (I <= 17) {
                int i12 = iArr[i9 + 2];
                i2 = 1;
                int i13 = i12 & i7;
                if (i13 != i8) {
                    i10 = i13 == i7 ? 0 : unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i3 = 1 << (i12 >>> 20);
            } else {
                i2 = 1;
                i3 = 0;
            }
            long j = iJ2 & i7;
            switch (I) {
                case 0:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        double dR = jh5.r.r(j, obj);
                        xi0Var.getClass();
                        xi0Var.z(i11, Double.doubleToRawLongBits(dR));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 1:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        float fN = jh5.r.n(j, obj);
                        xi0Var.getClass();
                        xi0Var.p(i11, Float.floatToRawIntBits(fN));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 2:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.E(i11, unsafe.getLong(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 3:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.E(i11, unsafe.getLong(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 4:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.o(i11, unsafe.getInt(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 5:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.z(i11, unsafe.getLong(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 6:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.p(i11, unsafe.getInt(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 7:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.i(i11, jh5.r.g(j, obj));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 8:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            xi0Var.e((String) object, i11);
                        } else {
                            xi0Var.b(i11, (da0) object);
                        }
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 9:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.d(i11, (t0) unsafe.getObject(obj, j), p53Var.w(i9));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 10:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.b(i11, (da0) unsafe.getObject(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.C(i11, unsafe.getInt(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 12:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.o(i11, unsafe.getInt(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 13:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.p(i11, unsafe.getInt(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 14:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        xi0Var.z(i11, unsafe.getLong(obj, j));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case kq2.x /* 15 */:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        int i14 = unsafe.getInt(obj, j);
                        xi0Var.C(i11, (i14 >> 31) ^ (i14 << 1));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 16:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        xi0Var.E(i11, (j2 >> 63) ^ (j2 << 1));
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 17:
                    if (p53Var.i(obj, i9, i8, i10, i3)) {
                        q64Var.c(i11, unsafe.getObject(obj, j), p53Var.w(i9));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 18:
                    i8 = i8;
                    i10 = i10;
                    qe4.c(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 19:
                    i8 = i8;
                    i10 = i10;
                    qe4.p(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 20:
                    i8 = i8;
                    i10 = i10;
                    qe4.z(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 21:
                    i8 = i8;
                    i10 = i10;
                    qe4.e(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 22:
                    i8 = i8;
                    i10 = i10;
                    qe4.u(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 23:
                    i8 = i8;
                    i10 = i10;
                    qe4.s(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 24:
                    i8 = i8;
                    i10 = i10;
                    qe4.b(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 25:
                    i8 = i8;
                    i10 = i10;
                    qe4.w(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 26:
                    i4 = i8;
                    i5 = i10;
                    int i15 = iArr[i9];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = qe4.g;
                    if (list != null && !list.isEmpty()) {
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            xi0Var.e((String) list.get(i16), i15);
                        }
                    }
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 27:
                    i4 = i8;
                    i5 = i10;
                    int i17 = iArr[i9];
                    List list2 = (List) unsafe.getObject(obj, j);
                    me4 me4VarW = p53Var.w(i9);
                    Class cls2 = qe4.g;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            xi0Var.d(i17, (t0) list2.get(i18), me4VarW);
                        }
                    }
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 28:
                    i4 = i8;
                    i5 = i10;
                    int i19 = iArr[i9];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = qe4.g;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            xi0Var.b(i19, (da0) list3.get(i20));
                        }
                    }
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 29:
                    z = false;
                    qe4.d(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 30:
                    z = false;
                    qe4.i(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 31:
                    z = false;
                    qe4.h(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 32:
                    z = false;
                    qe4.o(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 33:
                    z = false;
                    qe4.f(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 34:
                    z = false;
                    qe4.k(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, false);
                    i8 = i8;
                    i10 = i10;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 35:
                    i4 = i8;
                    i5 = i10;
                    qe4.c(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 36:
                    i4 = i8;
                    i5 = i10;
                    qe4.p(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 37:
                    i4 = i8;
                    i5 = i10;
                    qe4.z(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 38:
                    i4 = i8;
                    i5 = i10;
                    qe4.e(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 39:
                    i4 = i8;
                    i5 = i10;
                    qe4.u(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 40:
                    i4 = i8;
                    i5 = i10;
                    qe4.s(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 41:
                    i4 = i8;
                    i5 = i10;
                    qe4.b(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 42:
                    i4 = i8;
                    i5 = i10;
                    qe4.w(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 43:
                    i4 = i8;
                    i5 = i10;
                    qe4.d(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 44:
                    i4 = i8;
                    i5 = i10;
                    qe4.i(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 45:
                    i4 = i8;
                    i5 = i10;
                    qe4.h(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 46:
                    i4 = i8;
                    i5 = i10;
                    qe4.o(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 47:
                    i4 = i8;
                    i5 = i10;
                    qe4.f(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, i2);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case kq2.l /* 48 */:
                    i4 = i8;
                    i5 = i10;
                    qe4.k(iArr[i9], (List) unsafe.getObject(obj, j), q64Var, true);
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 49:
                    i4 = i8;
                    i5 = i10;
                    int i21 = iArr[i9];
                    List list4 = (List) unsafe.getObject(obj, j);
                    me4 me4VarW2 = p53Var.w(i9);
                    Class cls4 = qe4.g;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            q64Var.c(i21, list4.get(i22), me4VarW2);
                        }
                    }
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i23 = 2;
                        Object obj2 = p53Var.y[(i9 / 3) * 2];
                        p53Var.w.getClass();
                        ro roVar = ((l13) obj2).g;
                        vq5 vq5Var = (vq5) roVar.a;
                        vq5 vq5Var2 = (vq5) roVar.t;
                        xi0Var.getClass();
                        Iterator it = ((n13) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            xi0Var.B(i11, i23);
                            Object key = entry.getKey();
                            int i24 = i23;
                            Object value = entry.getValue();
                            int i25 = vn1.r;
                            int iJ3 = xi0.j(i2);
                            int i26 = i8;
                            sq5 sq5Var = vq5.m;
                            if (vq5Var2 == sq5Var) {
                                iJ3 *= 2;
                            }
                            int i27 = i10;
                            switch (vq5Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iA = 8;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key2);
                                            vn1.y(xi0Var, vq5Var, i24, value2);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key3);
                                            vn1.y(xi0Var, vq5Var, i24, value3);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key4);
                                            vn1.y(xi0Var, vq5Var, i24, value4);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key5);
                                            vn1.y(xi0Var, vq5Var, i24, value5);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key6);
                                            vn1.y(xi0Var, vq5Var, i24, value6);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key7);
                                            vn1.y(xi0Var, vq5Var, i24, value7);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key8);
                                            vn1.y(xi0Var, vq5Var, i24, value8);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key9);
                                            vn1.y(xi0Var, vq5Var, i24, value9);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key10);
                                            vn1.y(xi0Var, vq5Var, i24, value10);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11);
                                            vn1.y(xi0Var, vq5Var, i24, value11);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key12);
                                            vn1.y(xi0Var, vq5Var, i24, value12);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key13);
                                            vn1.y(xi0Var, vq5Var, i24, value13);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key14);
                                            vn1.y(xi0Var, vq5Var, i24, value14);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key15);
                                            vn1.y(xi0Var, vq5Var, i24, value15);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key16);
                                            vn1.y(xi0Var, vq5Var, i24, value16);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key17);
                                            vn1.y(xi0Var, vq5Var, i24, value17);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue >> 31) ^ (iIntValue << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key18);
                                            vn1.y(xi0Var, vq5Var, i24, value18);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue << i2) ^ (jLongValue >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key19);
                                            vn1.y(xi0Var, vq5Var, i24, value19);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iA = 4;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key110);
                                            vn1.y(xi0Var, vq5Var, i24, value110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111);
                                            vn1.y(xi0Var, vq5Var, i24, value111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key112);
                                            vn1.y(xi0Var, vq5Var, i24, value112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key113);
                                            vn1.y(xi0Var, vq5Var, i24, value113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key114);
                                            vn1.y(xi0Var, vq5Var, i24, value114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key115);
                                            vn1.y(xi0Var, vq5Var, i24, value115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key116);
                                            vn1.y(xi0Var, vq5Var, i24, value116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key117);
                                            vn1.y(xi0Var, vq5Var, i24, value117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key118);
                                            vn1.y(xi0Var, vq5Var, i24, value118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key119);
                                            vn1.y(xi0Var, vq5Var, i24, value119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1110);
                                            vn1.y(xi0Var, vq5Var, i24, value1110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1112);
                                            vn1.y(xi0Var, vq5Var, i24, value1112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1113);
                                            vn1.y(xi0Var, vq5Var, i24, value1113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1114);
                                            vn1.y(xi0Var, vq5Var, i24, value1114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1115);
                                            vn1.y(xi0Var, vq5Var, i24, value1115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1116);
                                            vn1.y(xi0Var, vq5Var, i24, value1116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue2 << i2) ^ (jLongValue2 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1117);
                                            vn1.y(xi0Var, vq5Var, i24, value1117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 2:
                                    it = it;
                                    iA = xi0.a(((Long) key).longValue());
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1118);
                                            vn1.y(xi0Var, vq5Var, i24, value1118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1119);
                                            vn1.y(xi0Var, vq5Var, i24, value1119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11110);
                                            vn1.y(xi0Var, vq5Var, i24, value11110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11112);
                                            vn1.y(xi0Var, vq5Var, i24, value11112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11113);
                                            vn1.y(xi0Var, vq5Var, i24, value11113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11114);
                                            vn1.y(xi0Var, vq5Var, i24, value11114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11115);
                                            vn1.y(xi0Var, vq5Var, i24, value11115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11116);
                                            vn1.y(xi0Var, vq5Var, i24, value11116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11117);
                                            vn1.y(xi0Var, vq5Var, i24, value11117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11118);
                                            vn1.y(xi0Var, vq5Var, i24, value11118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11119);
                                            vn1.y(xi0Var, vq5Var, i24, value11119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue3 << i2) ^ (jLongValue3 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    iA = xi0.a(((Long) key).longValue());
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue4 << i2) ^ (jLongValue4 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 4:
                                    it = it;
                                    iA = xi0.a(((Integer) key).intValue());
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue5 << i2) ^ (jLongValue5 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iA = 8;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue6 << i2) ^ (jLongValue6 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iA = 4;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue7 << i2) ^ (jLongValue7 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 7:
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iA = i2;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue8 << i2) ^ (jLongValue8 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 8:
                                    it = it;
                                    if (key instanceof da0) {
                                        size = ((da0) key).size();
                                        iT = xi0.t(size);
                                        iA = size + iT;
                                    } else {
                                        iA = xi0.l((String) key);
                                    }
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue9 << i2) ^ (jLongValue9 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 9:
                                    iG = ((c12) ((t0) key)).g(null);
                                    iA = iG;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue10 << i2) ^ (jLongValue10 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 10:
                                    int iG2 = ((c12) ((t0) key)).g(null);
                                    iG = iG2 + xi0.t(iG2);
                                    iA = iG;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue11 << i2) ^ (jLongValue11 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                    it = it;
                                    if (key instanceof da0) {
                                        size = ((da0) key).size();
                                        iT = xi0.t(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iT = xi0.t(size);
                                    }
                                    iA = size + iT;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue12 << i2) ^ (jLongValue12 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 12:
                                    it = it;
                                    iA = xi0.t(((Integer) key).intValue());
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue13 << i2) ^ (jLongValue13 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 13:
                                    it = it;
                                    iA = xi0.a(((Integer) key).intValue());
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue14 << i2) ^ (jLongValue14 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iA = 4;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue15 << i2) ^ (jLongValue15 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case kq2.x /* 15 */:
                                    ((Long) key).getClass();
                                    iA = 8;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue16 << i2) ^ (jLongValue16 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iT2 = xi0.t((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    it = it;
                                    iA = iT2;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue17 << i2) ^ (jLongValue17 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iT2 = xi0.a((jLongValue18 << i2) ^ (jLongValue18 >> 63));
                                    it = it;
                                    iA = iT2;
                                    i6 = iA + iJ3;
                                    iJ = xi0.j(i24);
                                    if (vq5Var == sq5Var) {
                                        iJ *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key1111111111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value1111111111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 3:
                                            i6 = i6;
                                            iA2 = xi0.a(((Long) value).longValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 4:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 7:
                                            i6 = i6;
                                            ((Boolean) value).getClass();
                                            iA2 = i2;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 8:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                                iA2 = size2 + iT3;
                                            } else {
                                                iA2 = xi0.l((String) value);
                                            }
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111116);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111116);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 9:
                                            i6 = i6;
                                            iA2 = ((c12) ((t0) value)).g(null);
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111117);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111117);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 10:
                                            i6 = i6;
                                            size2 = ((c12) ((t0) value)).g(null);
                                            iT3 = xi0.t(size2);
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111118);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111118);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i6 = i6;
                                            if (value instanceof da0) {
                                                size2 = ((da0) value).size();
                                                iT3 = xi0.t(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iT3 = xi0.t(size2);
                                            }
                                            iA2 = size2 + iT3;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key11111111111111111111111111111119);
                                            vn1.y(xi0Var, vq5Var, i24, value11111111111111111111111111111119);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 12:
                                            i6 = i6;
                                            iA2 = xi0.t(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111110);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111110);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 13:
                                            i6 = i6;
                                            iA2 = xi0.a(((Integer) value).intValue());
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111111);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111111);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA2 = 4;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111112);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111112);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA2 = 8;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111113);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111113);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iA2 = xi0.t((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111114);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111114);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iA2 = xi0.a((jLongValue19 << i2) ^ (jLongValue19 >> 63));
                                            i6 = i6;
                                            xi0Var.D(iA2 + iJ + i6);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            vn1.y(xi0Var, vq5Var2, i2, key111111111111111111111111111111115);
                                            vn1.y(xi0Var, vq5Var, i24, value111111111111111111111111111111115);
                                            i23 = i24;
                                            i8 = i26;
                                            it = it;
                                            i10 = i27;
                                            i2 = 1;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                default:
                                    t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                    break;
                            }
                        }
                    }
                    i4 = i8;
                    i5 = i10;
                    i8 = i4;
                    i10 = i5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 51:
                    if (p53Var.s(i11, i9, obj)) {
                        double dDoubleValue = ((Double) jh5.j(j, obj)).doubleValue();
                        xi0Var.getClass();
                        xi0Var.z(i11, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 52:
                    if (p53Var.s(i11, i9, obj)) {
                        float fFloatValue = ((Float) jh5.j(j, obj)).floatValue();
                        xi0Var.getClass();
                        xi0Var.p(i11, Float.floatToRawIntBits(fFloatValue));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 53:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.E(i11, e(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 54:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.E(i11, e(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 55:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.o(i11, d(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 56:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.z(i11, e(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 57:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.p(i11, d(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 58:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.i(i11, ((Boolean) jh5.j(j, obj)).booleanValue());
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 59:
                    if (p53Var.s(i11, i9, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            xi0Var.e((String) object3, i11);
                        } else {
                            xi0Var.b(i11, (da0) object3);
                        }
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 60:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.d(i11, (t0) unsafe.getObject(obj, j), p53Var.w(i9));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 61:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.b(i11, (da0) unsafe.getObject(obj, j));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 62:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.C(i11, d(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 63:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.o(i11, d(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 64:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.p(i11, d(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 65:
                    if (p53Var.s(i11, i9, obj)) {
                        xi0Var.z(i11, e(j, obj));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 66:
                    if (p53Var.s(i11, i9, obj)) {
                        int iD = d(j, obj);
                        xi0Var.C(i11, (iD >> 31) ^ (iD << 1));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 67:
                    if (p53Var.s(i11, i9, obj)) {
                        long jE = e(j, obj);
                        xi0Var.E(i11, (jE << i2) ^ (jE >> 63));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 68:
                    if (p53Var.s(i11, i9, obj)) {
                        q64Var.c(i11, unsafe.getObject(obj, j), p53Var.w(i9));
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                default:
                    i9 += 3;
                    i7 = 1048575;
                    break;
            }
            return;
        }
        p53Var.q.getClass();
        ((c12) obj).unknownFields.n(q64Var);
    }

    public final void m(int i2, Object obj, Object obj2) {
        int i3 = this.g[i2];
        if (jh5.j(J(i2) & 1048575, obj) == null) {
            return;
        }
        q(i2);
    }

    @Override // defpackage.me4
    public final c12 n() {
        this.a.getClass();
        return ((c12) this.v).t();
    }

    public final Object o(int i2, int i3, Object obj) {
        me4 me4VarW = w(i3);
        if (!s(i2, i3, obj)) {
            return me4VarW.n();
        }
        Object object = i.getObject(obj, J(i3) & 1048575);
        if (b(object)) {
            return object;
        }
        c12 c12VarN = me4VarW.n();
        if (object != null) {
            me4VarW.g(c12VarN, object);
        }
        return c12VarN;
    }

    public final void p(Object obj, int i2, Object obj2, xm1 xm1Var, ti0 ti0Var) throws gg2 {
        long J = J(i2) & 1048575;
        Object objJ = jh5.j(J, obj);
        p13 p13Var = this.w;
        if (objJ == null) {
            p13Var.getClass();
            objJ = n13.t.y();
            jh5.i(J, obj, objJ);
        } else {
            p13Var.getClass();
            if (!((n13) objJ).j) {
                Object objY = n13.t.y();
                p13.g(objY, objJ);
                jh5.i(J, obj, objY);
                objJ = objY;
            }
        }
        p13Var.getClass();
        n13 n13Var = (n13) objJ;
        ro roVar = ((l13) obj2).g;
        ti0Var.d(2);
        ri0 ri0Var = (ri0) ti0Var.n;
        int iQ = ri0Var.q(ri0Var.D());
        Object obj3 = roVar.m;
        Object objM = "";
        Object objM2 = obj3;
        while (true) {
            try {
                int iG = ti0Var.g();
                if (iG == Integer.MAX_VALUE || ri0Var.v()) {
                    break;
                }
                if (iG == 1) {
                    objM = ti0Var.m((vq5) roVar.t, null, null);
                } else if (iG != 2) {
                    try {
                        if (!ti0Var.e()) {
                            throw new ig2("Unable to parse map entry.");
                        }
                    } catch (gg2 unused) {
                        if (!ti0Var.e()) {
                            throw new ig2("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM2 = ti0Var.m((vq5) roVar.a, obj3.getClass(), xm1Var);
                }
            } catch (Throwable th) {
                ri0Var.m(iQ);
                throw th;
            }
        }
        n13Var.put(objM, objM2);
        ri0Var.m(iQ);
    }

    public final void q(int i2) {
        if (this.y[((i2 / 3) * 2) + 1] == null) {
            return;
        }
        uo1.B();
    }

    @Override // defpackage.me4
    public final boolean r(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.j) {
            int i7 = this.l[i6];
            int[] iArr = this.g;
            int i8 = iArr[i7];
            int iJ = J(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = i.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                int i12 = i5;
                i2 = i4;
                i3 = i12;
            }
            if ((268435456 & iJ) == 0 || i(obj, i7, i2, i3, i11)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!s(i8, i7, obj) || w(i7).r(jh5.j(iJ & 1048575, obj))) {
                                i6++;
                                i4 = i2;
                                i5 = i3;
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objJ = jh5.j(iJ & 1048575, obj);
                                this.w.getClass();
                                n13 n13Var = (n13) objJ;
                                if (n13Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((vq5) ((l13) this.y[(i7 / 3) * 2]).g.a).j != wq5.b) {
                                        continue;
                                    } else {
                                        me4 me4VarG = null;
                                        for (Object obj2 : n13Var.values()) {
                                            if (me4VarG == null) {
                                                me4VarG = b14.r.g(obj2.getClass());
                                            }
                                            if (!me4VarG.r(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i2;
                            i5 = i3;
                        }
                    }
                    List list = (List) jh5.j(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        me4 me4VarW = w(i7);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (me4VarW.r(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                } else if (!i(obj, i7, i2, i3, i11) || w(i7).r(jh5.j(iJ & 1048575, obj))) {
                    i6++;
                    i4 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean s(int i2, int i3, Object obj) {
        return jh5.x((long) (this.g[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x082a A[Catch: all -> 0x0500, TryCatch #0 {all -> 0x0500, blocks: (B:158:0x0825, B:160:0x082a, B:161:0x082f, B:114:0x04fb, B:117:0x0503, B:118:0x051b, B:119:0x0533, B:120:0x054b, B:121:0x0563, B:122:0x057b, B:123:0x0593, B:124:0x05ab, B:125:0x05c3, B:126:0x05eb, B:127:0x060b, B:128:0x062b, B:129:0x064c, B:130:0x066d, B:131:0x0690, B:132:0x06b0, B:133:0x06c9, B:134:0x06f1, B:135:0x0702, B:136:0x0724, B:137:0x0745, B:138:0x0766, B:139:0x0786, B:140:0x07a6, B:141:0x07c5, B:142:0x07e7, B:148:0x0809), top: B:179:0x0825 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0839 A[LOOP:2: B:164:0x0837->B:165:0x0839, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0850 A[LOOP:3: B:170:0x084e->B:171:0x0850, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x085a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.me4
    public final void t(Object obj, ti0 ti0Var, xm1 xm1Var) throws Throwable {
        int[] iArr;
        int i2;
        int i3;
        ti0 ti0Var2;
        xm1 xm1Var2;
        int i4;
        p53 p53Var = this;
        Object obj2 = obj;
        ti0 ti0Var3 = ti0Var;
        xm1 xm1Var3 = xm1Var;
        xm1Var3.getClass();
        if (!b(obj2)) {
            l0.m(obj2, "Mutating immutable message: ");
            return;
        }
        sg5 sg5Var = p53Var.q;
        int[] iArr2 = p53Var.l;
        int i5 = p53Var.t;
        int i6 = p53Var.j;
        qg5 qg5VarG = null;
        while (true) {
            try {
                int iG = ti0Var3.g();
                int iA = p53Var.A(iG);
                if (iA >= 0) {
                    int iJ = p53Var.J(iA);
                    try {
                        try {
                            int I = I(iJ);
                            Unsafe unsafe = i;
                            xv2 xv2Var = p53Var.m;
                            switch (I) {
                                case 0:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK = k(iJ);
                                    ti0Var2.d(1);
                                    try {
                                        try {
                                            jh5.r.l(obj, jK, ((ri0) ti0Var2.n).b());
                                            obj2 = obj;
                                            p53Var.G(iA, obj2);
                                        } catch (gg2 unused) {
                                            obj2 = obj;
                                            try {
                                                sg5Var.getClass();
                                                if (qg5VarG == null) {
                                                    qg5VarG = sg5.g(obj2);
                                                }
                                                if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                                    i4 = i3;
                                                    while (i6 < i4) {
                                                        p53Var.m(iArr[i6], obj2, qg5VarG);
                                                        i6++;
                                                    }
                                                    if (qg5VarG == null) {
                                                        return;
                                                    }
                                                    ((c12) obj2).unknownFields = qg5VarG;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i2 = i3;
                                                while (i6 < i2) {
                                                    p53Var.m(iArr[i6], obj2, qg5VarG);
                                                    i6++;
                                                }
                                                if (qg5VarG != null) {
                                                    sg5Var.getClass();
                                                    ((c12) obj2).unknownFields = qg5VarG;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i2 = i3;
                                            while (i6 < i2) {
                                                p53Var.m(iArr[i6], obj2, qg5VarG);
                                                i6++;
                                            }
                                            if (qg5VarG != null) {
                                                sg5Var.getClass();
                                                ((c12) obj2).unknownFields = qg5VarG;
                                            }
                                            throw th;
                                        }
                                    } catch (gg2 unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK2 = k(iJ);
                                    ti0Var2.d(5);
                                    jh5.r.j(obj2, jK2, ((ri0) ti0Var2.n).z());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 2:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK3 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.c(obj2, jK3, ((ri0) ti0Var2.n).o());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 3:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK4 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.c(obj2, jK4, ((ri0) ti0Var2.n).E());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 4:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK5 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.w(obj2, jK5, ((ri0) ti0Var2.n).h());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 5:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK6 = k(iJ);
                                    ti0Var2.d(1);
                                    jh5.c(obj2, jK6, ((ri0) ti0Var2.n).u());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 6:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK7 = k(iJ);
                                    ti0Var2.d(5);
                                    jh5.w(obj2, jK7, ((ri0) ti0Var2.n).p());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 7:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK8 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.r.v(obj2, jK8, ((ri0) ti0Var2.n).w());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    p53Var.D(iJ, ti0Var2, obj2);
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 9:
                                    p53Var = p53Var;
                                    iArr = iArr2;
                                    i3 = i5;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    t0 t0Var = (t0) p53Var.h(iA, obj2);
                                    me4 me4VarW = p53Var.w(iA);
                                    ti0Var2.d(2);
                                    ti0Var2.v(t0Var, me4VarW, xm1Var2);
                                    unsafe.putObject(obj2, p53Var.J(iA) & 1048575, t0Var);
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 10:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    jh5.i(k(iJ), obj2, ti0Var2.l());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK9 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.w(obj2, jK9, ((ri0) ti0Var2.n).D());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 12:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var2.d(0);
                                    int iS = ((ri0) ti0Var2.n).s();
                                    p53Var.q(iA);
                                    jh5.w(obj2, k(iJ), iS);
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 13:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK10 = k(iJ);
                                    ti0Var2.d(5);
                                    jh5.w(obj2, jK10, ((ri0) ti0Var2.n).f());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK11 = k(iJ);
                                    ti0Var2.d(1);
                                    jh5.c(obj2, jK11, ((ri0) ti0Var2.n).k());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case kq2.x /* 15 */:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK12 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.w(obj2, jK12, ((ri0) ti0Var2.n).d());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 16:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK13 = k(iJ);
                                    ti0Var2.d(0);
                                    jh5.c(obj2, jK13, ((ri0) ti0Var2.n).e());
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 17:
                                    p53Var = p53Var;
                                    iArr = iArr2;
                                    i3 = i5;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    t0 t0Var2 = (t0) p53Var.h(iA, obj2);
                                    me4 me4VarW2 = p53Var.w(iA);
                                    ti0Var2.d(3);
                                    ti0Var2.n(t0Var2, me4VarW2, xm1Var2);
                                    unsafe.putObject(obj2, p53Var.J(iA) & 1048575, t0Var2);
                                    p53Var.G(iA, obj2);
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 18:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK14 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.t(xv2.g(jK14, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 19:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK15 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.c(xv2.g(jK15, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK16 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.b(xv2.g(jK16, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 21:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK17 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.f(xv2.g(jK17, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK18 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.i(xv2.g(jK18, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK19 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.w(xv2.g(jK19, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK20 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.q(xv2.g(jK20, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 25:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    long jK21 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var2.x(xv2.g(jK21, obj2));
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 26:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    try {
                                        p53Var.E(iJ, ti0Var2, obj2);
                                    } catch (gg2 unused3) {
                                        sg5Var.getClass();
                                        if (qg5VarG == null) {
                                            qg5VarG = sg5.g(obj2);
                                        }
                                        if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                            i4 = i3;
                                            while (i6 < i4) {
                                                p53Var.m(iArr[i6], obj2, qg5VarG);
                                                i6++;
                                            }
                                            if (qg5VarG == null) {
                                                return;
                                            }
                                            ((c12) obj2).unknownFields = qg5VarG;
                                        }
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 27:
                                    iArr = iArr2;
                                    i3 = i5;
                                    try {
                                        p53Var.C(obj2, iJ, ti0Var3, p53Var.w(iA), xm1Var);
                                        ti0Var2 = ti0Var3;
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                    } catch (gg2 unused4) {
                                        ti0Var2 = ti0Var3;
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                        sg5Var.getClass();
                                        if (qg5VarG == null) {
                                            qg5VarG = sg5.g(obj2);
                                        }
                                        if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                            i4 = i3;
                                            while (i6 < i4) {
                                                p53Var.m(iArr[i6], obj2, qg5VarG);
                                                i6++;
                                            }
                                            if (qg5VarG == null) {
                                                return;
                                            }
                                            ((c12) obj2).unknownFields = qg5VarG;
                                        }
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 28:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK22 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.j(xv2.g(jK22, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 29:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK23 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.o(xv2.g(jK23, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 30:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK24 = k(iJ);
                                    xv2Var.getClass();
                                    ef2 ef2VarG = xv2.g(jK24, obj2);
                                    ti0Var3.a(ef2VarG);
                                    p53Var.q(iA);
                                    qe4.a(obj2, iG, ef2VarG, qg5VarG, sg5Var);
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 31:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK25 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.s(xv2.g(jK25, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 32:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK26 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.p(xv2.g(jK26, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK27 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.u(xv2.g(jK27, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK28 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.z(xv2.g(jK28, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK29 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.t(xv2.g(jK29, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK30 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.c(xv2.g(jK30, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK31 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.b(xv2.g(jK31, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK32 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.f(xv2.g(jK32, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK33 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.i(xv2.g(jK33, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK34 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.w(xv2.g(jK34, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK35 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.q(xv2.g(jK35, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK36 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.x(xv2.g(jK36, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK37 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.o(xv2.g(jK37, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK38 = k(iJ);
                                    xv2Var.getClass();
                                    ef2 ef2VarG2 = xv2.g(jK38, obj2);
                                    ti0Var3.a(ef2VarG2);
                                    p53Var.q(iA);
                                    qe4.a(obj2, iG, ef2VarG2, qg5VarG, sg5Var);
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK39 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.s(xv2.g(jK39, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK40 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.p(xv2.g(jK40, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 47:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK41 = k(iJ);
                                    xv2Var.getClass();
                                    ti0Var3.u(xv2.g(jK41, obj2));
                                    xm1Var2 = xm1Var;
                                    p53Var = p53Var;
                                    ti0Var2 = ti0Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case kq2.l /* 48 */:
                                    iArr = iArr2;
                                    i3 = i5;
                                    try {
                                        long jK42 = k(iJ);
                                        xv2Var.getClass();
                                        ti0Var3.z(xv2.g(jK42, obj2));
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                        ti0Var2 = ti0Var3;
                                    } catch (gg2 unused5) {
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                        ti0Var2 = ti0Var3;
                                        sg5Var.getClass();
                                        if (qg5VarG == null) {
                                            qg5VarG = sg5.g(obj2);
                                        }
                                        if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                            i4 = i3;
                                            while (i6 < i4) {
                                                p53Var.m(iArr[i6], obj2, qg5VarG);
                                                i6++;
                                            }
                                            if (qg5VarG == null) {
                                                return;
                                            }
                                            ((c12) obj2).unknownFields = qg5VarG;
                                        }
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i3 = i5;
                                    obj2 = obj;
                                    try {
                                        p53Var.B(obj2, k(iJ), ti0Var, p53Var.w(iA), xm1Var);
                                        ti0Var3 = ti0Var;
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                        ti0Var2 = ti0Var3;
                                    } catch (gg2 unused6) {
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                        ti0Var2 = ti0Var;
                                        sg5Var.getClass();
                                        if (qg5VarG == null) {
                                            qg5VarG = sg5.g(obj2);
                                        }
                                        if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                            i4 = i3;
                                            while (i6 < i4) {
                                                p53Var.m(iArr[i6], obj2, qg5VarG);
                                                i6++;
                                            }
                                            if (qg5VarG == null) {
                                                return;
                                            }
                                            ((c12) obj2).unknownFields = qg5VarG;
                                        }
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 50:
                                    iArr = iArr2;
                                    i3 = i5;
                                    try {
                                        p53Var.p(obj2, iA, p53Var.y[(iA / 3) * 2], xm1Var3, ti0Var3);
                                        obj2 = obj;
                                        ti0Var2 = ti0Var;
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                    } catch (gg2 unused7) {
                                        obj2 = obj;
                                        ti0Var2 = ti0Var;
                                        xm1Var2 = xm1Var;
                                        p53Var = p53Var;
                                        sg5Var.getClass();
                                        if (qg5VarG == null) {
                                            qg5VarG = sg5.g(obj2);
                                        }
                                        if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                            i4 = i3;
                                            while (i6 < i4) {
                                                p53Var.m(iArr[i6], obj2, qg5VarG);
                                                i6++;
                                            }
                                            if (qg5VarG == null) {
                                                return;
                                            }
                                            ((c12) obj2).unknownFields = qg5VarG;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        p53Var = p53Var;
                                        i2 = i3;
                                        while (i6 < i2) {
                                            p53Var.m(iArr[i6], obj2, qg5VarG);
                                            i6++;
                                        }
                                        if (qg5VarG != null) {
                                            sg5Var.getClass();
                                            ((c12) obj2).unknownFields = qg5VarG;
                                        }
                                        throw th;
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK43 = k(iJ);
                                    ti0Var3.d(1);
                                    jh5.i(jK43, obj2, Double.valueOf(((ri0) ti0Var3.n).b()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK44 = k(iJ);
                                    ti0Var3.d(5);
                                    jh5.i(jK44, obj2, Float.valueOf(((ri0) ti0Var3.n).z()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 53:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK45 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK45, obj2, Long.valueOf(((ri0) ti0Var3.n).o()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK46 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK46, obj2, Long.valueOf(((ri0) ti0Var3.n).E()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK47 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK47, obj2, Integer.valueOf(((ri0) ti0Var3.n).h()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK48 = k(iJ);
                                    ti0Var3.d(1);
                                    jh5.i(jK48, obj2, Long.valueOf(((ri0) ti0Var3.n).u()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK49 = k(iJ);
                                    ti0Var3.d(5);
                                    jh5.i(jK49, obj2, Integer.valueOf(((ri0) ti0Var3.n).p()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK50 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK50, obj2, Boolean.valueOf(((ri0) ti0Var3.n).w()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i3 = i5;
                                    p53Var.D(iJ, ti0Var3, obj2);
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i3 = i5;
                                    t0 t0Var3 = (t0) p53Var.o(iG, iA, obj2);
                                    me4 me4VarW3 = p53Var.w(iA);
                                    ti0Var3.d(2);
                                    ti0Var3.v(t0Var3, me4VarW3, xm1Var3);
                                    unsafe.putObject(obj2, p53Var.J(iA) & 1048575, t0Var3);
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i3 = i5;
                                    jh5.i(k(iJ), obj2, ti0Var3.l());
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK51 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK51, obj2, Integer.valueOf(((ri0) ti0Var3.n).D()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i3 = i5;
                                    ti0Var3.d(0);
                                    int iS2 = ((ri0) ti0Var3.n).s();
                                    p53Var.q(iA);
                                    jh5.i(k(iJ), obj2, Integer.valueOf(iS2));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 64:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK52 = k(iJ);
                                    ti0Var3.d(5);
                                    jh5.i(jK52, obj2, Integer.valueOf(((ri0) ti0Var3.n).f()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK53 = k(iJ);
                                    ti0Var3.d(1);
                                    jh5.i(jK53, obj2, Long.valueOf(((ri0) ti0Var3.n).k()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 66:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK54 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK54, obj2, Integer.valueOf(((ri0) ti0Var3.n).d()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i3 = i5;
                                    long jK55 = k(iJ);
                                    ti0Var3.d(0);
                                    jh5.i(jK55, obj2, Long.valueOf(((ri0) ti0Var3.n).e()));
                                    p53Var.H(iG, iA, obj2);
                                    ti0Var2 = ti0Var3;
                                    xm1Var2 = xm1Var3;
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                case 68:
                                    try {
                                        t0 t0Var4 = (t0) p53Var.o(iG, iA, obj2);
                                        me4 me4VarW4 = p53Var.w(iA);
                                        ti0Var3.d(3);
                                        ti0Var3.n(t0Var4, me4VarW4, xm1Var3);
                                        iArr = iArr2;
                                        i3 = i5;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, p53Var.J(iA) & 1048575, t0Var4);
                                                p53Var.H(iG, iA, obj2);
                                                ti0Var2 = ti0Var3;
                                                xm1Var2 = xm1Var3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                p53Var = p53Var;
                                                i2 = i3;
                                                while (i6 < i2) {
                                                    p53Var.m(iArr[i6], obj2, qg5VarG);
                                                    i6++;
                                                }
                                                if (qg5VarG != null) {
                                                    sg5Var.getClass();
                                                    ((c12) obj2).unknownFields = qg5VarG;
                                                }
                                                throw th;
                                            }
                                        } catch (gg2 unused8) {
                                            ti0Var2 = ti0Var3;
                                            xm1Var2 = xm1Var3;
                                            sg5Var.getClass();
                                            if (qg5VarG == null) {
                                                qg5VarG = sg5.g(obj2);
                                            }
                                            if (!sg5.y(0, ti0Var2, qg5VarG)) {
                                                i4 = i3;
                                                while (i6 < i4) {
                                                    p53Var.m(iArr[i6], obj2, qg5VarG);
                                                    i6++;
                                                }
                                                if (qg5VarG == null) {
                                                    return;
                                                }
                                                ((c12) obj2).unknownFields = qg5VarG;
                                            }
                                        }
                                    } catch (gg2 unused9) {
                                        iArr = iArr2;
                                        i3 = i5;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i3 = i5;
                                    }
                                    ti0Var3 = ti0Var2;
                                    xm1Var3 = xm1Var2;
                                    iArr2 = iArr;
                                    i5 = i3;
                                    p53Var = p53Var;
                                    break;
                                default:
                                    if (qg5VarG == null) {
                                        sg5Var.getClass();
                                        qg5VarG = sg5.g(obj2);
                                    }
                                    sg5Var.getClass();
                                    if (sg5.y(0, ti0Var3, qg5VarG)) {
                                        iArr = iArr2;
                                        i3 = i5;
                                        ti0Var2 = ti0Var3;
                                        xm1Var2 = xm1Var3;
                                        ti0Var3 = ti0Var2;
                                        xm1Var3 = xm1Var2;
                                        iArr2 = iArr;
                                        i5 = i3;
                                        p53Var = p53Var;
                                    } else {
                                        while (i6 < i5) {
                                            p53Var.m(iArr2[i6], obj2, qg5VarG);
                                            i6++;
                                        }
                                        if (qg5VarG == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (gg2 unused10) {
                            iArr = iArr2;
                            i3 = i5;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        p53Var = p53Var;
                        iArr = iArr2;
                        i3 = i5;
                    }
                } else if (iG == Integer.MAX_VALUE) {
                    while (i6 < i5) {
                        p53Var.m(iArr2[i6], obj2, qg5VarG);
                        i6++;
                    }
                    if (qg5VarG == null) {
                        return;
                    } else {
                        sg5Var.getClass();
                    }
                } else {
                    sg5Var.getClass();
                    if (qg5VarG == null) {
                        qg5VarG = sg5.g(obj2);
                    }
                    if (!sg5.y(0, ti0Var3, qg5VarG)) {
                        while (i6 < i5) {
                            p53Var.m(iArr2[i6], obj2, qg5VarG);
                            i6++;
                        }
                        if (qg5VarG == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                p53Var = p53Var;
                iArr = iArr2;
                i2 = i5;
            }
        }
        ((c12) obj2).unknownFields = qg5VarG;
    }

    public final void u(int i2, Object obj, Object obj2) {
        if (c(i2, obj2)) {
            long J = J(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                up.r(this.g[i2], obj2);
                return;
            }
            me4 me4VarW = w(i2);
            if (!c(i2, obj)) {
                if (b(object)) {
                    c12 c12VarN = me4VarW.n();
                    me4VarW.g(c12VarN, object);
                    unsafe.putObject(obj, J, c12VarN);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!b(object2)) {
                c12 c12VarN2 = me4VarW.n();
                me4VarW.g(c12VarN2, object2);
                unsafe.putObject(obj, J, c12VarN2);
                object2 = c12VarN2;
            }
            me4VarW.g(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.me4
    public final int v(c12 c12Var) {
        int i2;
        int iY;
        int i3;
        int[] iArr = this.g;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iJ = J(i5);
            int i6 = iArr[i5];
            long j = 1048575 & iJ;
            int i7 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i2 = i4 * 53;
                    iY = gf2.y(Double.doubleToLongBits(jh5.r.r(j, c12Var)));
                    i4 = iY + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iY = Float.floatToIntBits(jh5.r.n(j, c12Var));
                    i4 = iY + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    iY = gf2.y(jh5.l(j, c12Var));
                    i4 = iY + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    iY = gf2.y(jh5.l(j, c12Var));
                    i4 = iY + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    iY = jh5.x(j, c12Var);
                    i4 = iY + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    iY = gf2.y(jh5.l(j, c12Var));
                    i4 = iY + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    iY = jh5.x(j, c12Var);
                    i4 = iY + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    boolean zG = jh5.r.g(j, c12Var);
                    Charset charset = gf2.g;
                    if (zG) {
                        i7 = 1231;
                    }
                    i4 = i7 + i3;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iY = ((String) jh5.j(j, c12Var)).hashCode();
                    i4 = iY + i2;
                    break;
                case 9:
                    Object objJ = jh5.j(j, c12Var);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iY = jh5.j(j, c12Var).hashCode();
                    i4 = iY + i2;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    i2 = i4 * 53;
                    iY = jh5.x(j, c12Var);
                    i4 = iY + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iY = jh5.x(j, c12Var);
                    i4 = iY + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iY = jh5.x(j, c12Var);
                    i4 = iY + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    iY = gf2.y(jh5.l(j, c12Var));
                    i4 = iY + i2;
                    break;
                case kq2.x /* 15 */:
                    i2 = i4 * 53;
                    iY = jh5.x(j, c12Var);
                    i4 = iY + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    iY = gf2.y(jh5.l(j, c12Var));
                    i4 = iY + i2;
                    break;
                case 17:
                    Object objJ2 = jh5.j(j, c12Var);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case kq2.l /* 48 */:
                case 49:
                    i2 = i4 * 53;
                    iY = jh5.j(j, c12Var).hashCode();
                    i4 = iY + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iY = jh5.j(j, c12Var).hashCode();
                    i4 = iY + i2;
                    break;
                case 51:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = gf2.y(Double.doubleToLongBits(((Double) jh5.j(j, c12Var)).doubleValue()));
                        i4 = iY + i2;
                    }
                    break;
                case 52:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = Float.floatToIntBits(((Float) jh5.j(j, c12Var)).floatValue());
                        i4 = iY + i2;
                    }
                    break;
                case 53:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = gf2.y(e(j, c12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 54:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = gf2.y(e(j, c12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 55:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = d(j, c12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 56:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = gf2.y(e(j, c12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 57:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = d(j, c12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 58:
                    if (s(i6, i5, c12Var)) {
                        i3 = i4 * 53;
                        boolean zBooleanValue = ((Boolean) jh5.j(j, c12Var)).booleanValue();
                        Charset charset2 = gf2.g;
                        if (zBooleanValue) {
                            i7 = 1231;
                        }
                        i4 = i7 + i3;
                    }
                    break;
                case 59:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = ((String) jh5.j(j, c12Var)).hashCode();
                        i4 = iY + i2;
                    }
                    break;
                case 60:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = jh5.j(j, c12Var).hashCode();
                        i4 = iY + i2;
                    }
                    break;
                case 61:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = jh5.j(j, c12Var).hashCode();
                        i4 = iY + i2;
                    }
                    break;
                case 62:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = d(j, c12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 63:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = d(j, c12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 64:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = d(j, c12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 65:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = gf2.y(e(j, c12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 66:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = d(j, c12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 67:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = gf2.y(e(j, c12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 68:
                    if (s(i6, i5, c12Var)) {
                        i2 = i4 * 53;
                        iY = jh5.j(j, c12Var).hashCode();
                        i4 = iY + i2;
                    }
                    break;
            }
        }
        this.q.getClass();
        return c12Var.unknownFields.hashCode() + (i4 * 53);
    }

    public final me4 w(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.y;
        me4 me4Var = (me4) objArr[i3];
        if (me4Var != null) {
            return me4Var;
        }
        me4 me4VarG = b14.r.g((Class) objArr[i3 + 1]);
        objArr[i3] = me4VarG;
        return me4VarG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0319  */
    /* JADX WARN: Code duplicated, block: B:136:0x032e  */
    /* JADX WARN: Code duplicated, block: B:137:0x033e  */
    /* JADX WARN: Code duplicated, block: B:139:0x034a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0356  */
    /* JADX WARN: Code duplicated, block: B:142:0x0366  */
    /* JADX WARN: Code duplicated, block: B:143:0x0375  */
    /* JADX WARN: Code duplicated, block: B:145:0x037c  */
    /* JADX WARN: Code duplicated, block: B:147:0x038a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0392  */
    /* JADX WARN: Code duplicated, block: B:149:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:159:0x0407  */
    /* JADX WARN: Code duplicated, block: B:160:0x0415  */
    /* JADX WARN: Code duplicated, block: B:161:0x041f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0620 A[PHI: r9 r20 r21
  0x0620: PHI (r9v26 int) = (r9v9 int), (r9v10 int), (r9v11 int), (r9v15 int), (r9v17 int), (r9v18 int), (r9v19 int), (r9v23 int), (r9v27 int) binds: [B:276:0x07eb, B:272:0x07cc, B:268:0x07ad, B:251:0x072a, B:237:0x06bc, B:233:0x069e, B:229:0x0681, B:222:0x0641, B:216:0x061e] A[DONT_GENERATE, DONT_INLINE]
  0x0620: PHI (r20v35 int) = 
  (r20v21 int)
  (r20v22 int)
  (r20v23 int)
  (r20v27 int)
  (r20v29 int)
  (r20v30 int)
  (r20v31 int)
  (r20v34 int)
  (r20v36 int)
 binds: [B:276:0x07eb, B:272:0x07cc, B:268:0x07ad, B:251:0x072a, B:237:0x06bc, B:233:0x069e, B:229:0x0681, B:222:0x0641, B:216:0x061e] A[DONT_GENERATE, DONT_INLINE]
  0x0620: PHI (r21v18 int) = 
  (r21v2 int)
  (r21v3 int)
  (r21v4 int)
  (r21v8 int)
  (r21v10 int)
  (r21v11 int)
  (r21v12 int)
  (r21v15 int)
  (r21v19 int)
 binds: [B:276:0x07eb, B:272:0x07cc, B:268:0x07ad, B:251:0x072a, B:237:0x06bc, B:233:0x069e, B:229:0x0681, B:222:0x0641, B:216:0x061e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:353:0x0315 A[SYNTHETIC] */
    @Override // defpackage.me4
    public final int x(c12 c12Var) {
        int i2;
        int iJ;
        int iJ2;
        int iJ3;
        int iA;
        int iJ4;
        int iA2;
        int iJ5;
        int iJ6;
        int iX;
        int iR;
        int i3;
        int i4;
        int i5;
        int iJ7;
        int size;
        int iT;
        int iJ8;
        int iJ9;
        int size2;
        int iJ10;
        int iT2;
        int iG;
        int iT3;
        int iA3;
        int size3;
        int iT4;
        int iG2;
        int i6;
        vq5 vq5Var;
        int iJ11;
        int iA4;
        int size4;
        int iT5;
        int iJ12;
        int iJ13;
        int iJ14;
        int iA5;
        int iJ15;
        int iA6;
        int iJ16;
        int iT6;
        p53 p53Var = this;
        c12 c12Var2 = c12Var;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int iX2 = 0;
        while (true) {
            int[] iArr = p53Var.g;
            if (i9 >= iArr.length) {
                p53Var.q.getClass();
                return c12Var2.unknownFields.y() + iX2;
            }
            int iJ17 = p53Var.J(i9);
            int I = I(iJ17);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i7;
            int i14 = 1;
            Unsafe unsafe = i;
            if (I <= 17) {
                if (i13 != i8) {
                    i10 = i13 == i7 ? 0 : unsafe.getInt(c12Var2, i13);
                    i8 = i13;
                }
                i2 = 1 << (i12 >>> 20);
            } else {
                i2 = 0;
            }
            long j = iJ17 & i7;
            if (I >= xn1.t.j) {
                byte b = xn1.a.j;
            }
            char c2 = '?';
            switch (I) {
                case 0:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ = xi0.j(i11) + 8;
                        iX2 += iJ;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 1:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ2 = xi0.j(i11);
                        iJ6 = iJ2 + 4;
                        iX2 += iJ6;
                    }
                    p53Var = this;
                    c12Var2 = c12Var;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 2:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        long j2 = unsafe.getLong(c12Var2, j);
                        iJ3 = xi0.j(i11);
                        iA = xi0.a(j2);
                        iX2 += iA + iJ3;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 3:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        long j3 = unsafe.getLong(c12Var2, j);
                        iJ3 = xi0.j(i11);
                        iA = xi0.a(j3);
                        iX2 += iA + iJ3;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 4:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        int i15 = unsafe.getInt(c12Var2, j);
                        iJ4 = xi0.j(i11);
                        iA2 = xi0.a(i15);
                        iX = iA2 + iJ4;
                        iX2 += iX;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 5:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ5 = xi0.j(i11);
                        iJ6 = iJ5 + 8;
                        iX2 += iJ6;
                    }
                    p53Var = this;
                    c12Var2 = c12Var;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 6:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ2 = xi0.j(i11);
                        iJ6 = iJ2 + 4;
                        iX2 += iJ6;
                    }
                    p53Var = this;
                    c12Var2 = c12Var;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 7:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ6 = xi0.j(i11) + 1;
                        iX2 += iJ6;
                    }
                    p53Var = this;
                    c12Var2 = c12Var;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 8:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        Object object = unsafe.getObject(c12Var2, j);
                        iX2 = (object instanceof da0 ? xi0.x(i11, (da0) object) : xi0.l((String) object) + xi0.j(i11)) + iX2;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 9:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        Object object2 = unsafe.getObject(c12Var2, j);
                        me4 me4VarW = p53Var.w(i9);
                        Class cls = qe4.g;
                        int iJ18 = xi0.j(i11);
                        int iG3 = ((t0) object2).g(me4VarW);
                        iX2 += xi0.t(iG3) + iG3 + iJ18;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 10:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iX = xi0.x(i11, (da0) unsafe.getObject(c12Var2, j));
                        iX2 += iX;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        int i16 = unsafe.getInt(c12Var2, j);
                        iJ4 = xi0.j(i11);
                        iA2 = xi0.t(i16);
                        iX = iA2 + iJ4;
                        iX2 += iX;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 12:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        int i17 = unsafe.getInt(c12Var2, j);
                        iJ4 = xi0.j(i11);
                        iA2 = xi0.a(i17);
                        iX = iA2 + iJ4;
                        iX2 += iX;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 13:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ2 = xi0.j(i11);
                        iJ6 = iJ2 + 4;
                        iX2 += iJ6;
                    }
                    p53Var = this;
                    c12Var2 = c12Var;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 14:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ5 = xi0.j(i11);
                        iJ6 = iJ5 + 8;
                        iX2 += iJ6;
                    }
                    p53Var = this;
                    c12Var2 = c12Var;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case kq2.x /* 15 */:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        int i18 = unsafe.getInt(c12Var2, j);
                        iJ4 = xi0.j(i11);
                        iA2 = xi0.t((i18 >> 31) ^ (i18 << 1));
                        iX = iA2 + iJ4;
                        iX2 += iX;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 16:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        long j4 = unsafe.getLong(c12Var2, j);
                        iJ3 = xi0.j(i11);
                        iA = xi0.a((j4 >> 63) ^ (j4 << 1));
                        iX2 += iA + iJ3;
                    }
                    p53Var = this;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 17:
                    if (p53Var.i(c12Var2, i9, i8, i10, i2)) {
                        iJ = ((t0) unsafe.getObject(c12Var2, j)).g(p53Var.w(i9)) + (xi0.j(i11) * 2);
                        iX2 += iJ;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 18:
                    iR = qe4.r(i11, (List) unsafe.getObject(c12Var2, j));
                    iX2 += iR;
                    i8 = i8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 19:
                    iR = qe4.y(i11, (List) unsafe.getObject(c12Var2, j));
                    iX2 += iR;
                    i8 = i8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 20:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list = (List) unsafe.getObject(c12Var2, j);
                    Class cls2 = qe4.g;
                    if (list.size() == 0) {
                        iJ7 = i5;
                    } else {
                        iJ7 = (xi0.j(i11) * list.size()) + qe4.v(list);
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 21:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list2 = (List) unsafe.getObject(c12Var2, j);
                    Class cls3 = qe4.g;
                    size = list2.size();
                    if (size == 0) {
                        iJ7 = i5;
                    } else {
                        iT = qe4.t(list2);
                        iJ8 = xi0.j(i11);
                        iJ7 = (iJ8 * size) + iT;
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 22:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list3 = (List) unsafe.getObject(c12Var2, j);
                    Class cls4 = qe4.g;
                    size = list3.size();
                    if (size == 0) {
                        iJ7 = i5;
                    } else {
                        iT = qe4.n(list3);
                        iJ8 = xi0.j(i11);
                        iJ7 = (iJ8 * size) + iT;
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 23:
                    iR = qe4.r(i11, (List) unsafe.getObject(c12Var2, j));
                    iX2 += iR;
                    i8 = i8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 24:
                    iR = qe4.y(i11, (List) unsafe.getObject(c12Var2, j));
                    iX2 += iR;
                    i8 = i8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 25:
                    i3 = i8;
                    i4 = i10;
                    List list4 = (List) unsafe.getObject(c12Var2, j);
                    Class cls5 = qe4.g;
                    int size5 = list4.size();
                    iX2 += size5 == 0 ? 0 : (xi0.j(i11) + 1) * size5;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 26:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list5 = (List) unsafe.getObject(c12Var2, j);
                    Class cls6 = qe4.g;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iJ7 = i5;
                    } else {
                        iJ7 = xi0.j(i11) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof da0) {
                                int size7 = ((da0) obj).size();
                                iJ7 = xi0.t(size7) + size7 + iJ7;
                            } else {
                                iJ7 = xi0.l((String) obj) + iJ7;
                            }
                        }
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 27:
                    i3 = i8;
                    i4 = i10;
                    List list6 = (List) unsafe.getObject(c12Var2, j);
                    me4 me4VarW2 = p53Var.w(i9);
                    Class cls7 = qe4.g;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iJ9 = 0;
                    } else {
                        iJ9 = xi0.j(i11) * size8;
                        for (int i20 = 0; i20 < size8; i20++) {
                            int iG4 = ((t0) list6.get(i20)).g(me4VarW2);
                            iJ9 += xi0.t(iG4) + iG4;
                        }
                    }
                    iX2 += iJ9;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 28:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list7 = (List) unsafe.getObject(c12Var2, j);
                    Class cls8 = qe4.g;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iJ7 = i5;
                    } else {
                        iJ7 = xi0.j(i11) * size9;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int size10 = ((da0) list7.get(i21)).size();
                            iJ7 += xi0.t(size10) + size10;
                        }
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 29:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list8 = (List) unsafe.getObject(c12Var2, j);
                    Class cls9 = qe4.g;
                    size = list8.size();
                    if (size == 0) {
                        iJ7 = i5;
                    } else {
                        iT = qe4.j(list8);
                        iJ8 = xi0.j(i11);
                        iJ7 = (iJ8 * size) + iT;
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 30:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list9 = (List) unsafe.getObject(c12Var2, j);
                    Class cls10 = qe4.g;
                    size = list9.size();
                    if (size == 0) {
                        iJ7 = i5;
                    } else {
                        iT = qe4.g(list9);
                        iJ8 = xi0.j(i11);
                        iJ7 = (iJ8 * size) + iT;
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 31:
                    iR = qe4.y(i11, (List) unsafe.getObject(c12Var2, j));
                    iX2 += iR;
                    i8 = i8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 32:
                    iR = qe4.r(i11, (List) unsafe.getObject(c12Var2, j));
                    iX2 += iR;
                    i8 = i8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 33:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list10 = (List) unsafe.getObject(c12Var2, j);
                    Class cls11 = qe4.g;
                    size = list10.size();
                    if (size == 0) {
                        iJ7 = i5;
                    } else {
                        iT = qe4.x(list10);
                        iJ8 = xi0.j(i11);
                        iJ7 = (iJ8 * size) + iT;
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 34:
                    i3 = i8;
                    i4 = i10;
                    i5 = 0;
                    List list11 = (List) unsafe.getObject(c12Var2, j);
                    Class cls12 = qe4.g;
                    size = list11.size();
                    if (size == 0) {
                        iJ7 = i5;
                    } else {
                        iT = qe4.l(list11);
                        iJ8 = xi0.j(i11);
                        iJ7 = (iJ8 * size) + iT;
                    }
                    iX2 += iJ7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 35:
                    i3 = i8;
                    i4 = i10;
                    List list12 = (List) unsafe.getObject(c12Var2, j);
                    Class cls13 = qe4.g;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 36:
                    i3 = i8;
                    i4 = i10;
                    List list13 = (List) unsafe.getObject(c12Var2, j);
                    Class cls14 = qe4.g;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 37:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.v((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 38:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.t((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 39:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.n((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 40:
                    i3 = i8;
                    i4 = i10;
                    List list14 = (List) unsafe.getObject(c12Var2, j);
                    Class cls15 = qe4.g;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 41:
                    i3 = i8;
                    i4 = i10;
                    List list15 = (List) unsafe.getObject(c12Var2, j);
                    Class cls16 = qe4.g;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 42:
                    i3 = i8;
                    i4 = i10;
                    List list16 = (List) unsafe.getObject(c12Var2, j);
                    Class cls17 = qe4.g;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 43:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.j((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 44:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.g((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 45:
                    i3 = i8;
                    i4 = i10;
                    List list17 = (List) unsafe.getObject(c12Var2, j);
                    Class cls18 = qe4.g;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 46:
                    i3 = i8;
                    i4 = i10;
                    List list18 = (List) unsafe.getObject(c12Var2, j);
                    Class cls19 = qe4.g;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 47:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.x((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case kq2.l /* 48 */:
                    i3 = i8;
                    i4 = i10;
                    size2 = qe4.l((List) unsafe.getObject(c12Var2, j));
                    if (size2 > 0) {
                        iJ10 = xi0.j(i11);
                        iT2 = xi0.t(size2);
                        iX2 += iT2 + iJ10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 49:
                    i3 = i8;
                    i4 = i10;
                    List list19 = (List) unsafe.getObject(c12Var2, j);
                    me4 me4VarW3 = p53Var.w(i9);
                    Class cls20 = qe4.g;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iG = 0;
                    } else {
                        iG = 0;
                        for (int i22 = 0; i22 < size11; i22++) {
                            iG += ((t0) list19.get(i22)).g(me4VarW3) + (xi0.j(i11) * 2);
                        }
                    }
                    iX2 += iG;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(c12Var2, j);
                    Object obj2 = p53Var.y[(i9 / 3) * 2];
                    p53Var.w.getClass();
                    n13 n13Var = (n13) object3;
                    l13 l13Var = (l13) obj2;
                    if (n13Var.isEmpty()) {
                        iT3 = 0;
                    } else {
                        iT3 = 0;
                        for (Map.Entry entry : n13Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            l13Var.getClass();
                            int iJ19 = xi0.j(i11);
                            ro roVar = l13Var.g;
                            vq5 vq5Var2 = (vq5) roVar.t;
                            int i23 = vn1.r;
                            int iJ20 = xi0.j(i14);
                            char c3 = c2;
                            sq5 sq5Var = vq5.m;
                            if (vq5Var2 == sq5Var) {
                                iJ20 *= 2;
                            }
                            int i24 = i14;
                            switch (vq5Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iA3 = 8;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i25 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i25) + i25 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i26 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i26) + i26 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i27 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i27) + i27 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i28 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i28) + i28 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i29 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i29) + i29 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i210 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i210) + i210 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211) + i211 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i212 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i212) + i212 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i213 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i213) + i213 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i214 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i214) + i214 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i215 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i215) + i215 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i216 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i216) + i216 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i217 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i217) + i217 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i218 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i218) + i218 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i219 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i219) + i219 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2110) + i2110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue >> 31) ^ (iIntValue << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111) + i2111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue << i24) ^ (jLongValue >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2112) + i2112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iA3 = 4;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2113) + i2113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i2114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2114) + i2114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2115) + i2115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2116) + i2116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2117) + i2117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2118) + i2118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2119) + i2119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21110) + i21110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111) + i21111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21112) + i21112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21113) + i21113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i21114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21114) + i21114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i21115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21115) + i21115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21116) + i21116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21117) + i21117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21118) + i21118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21119) + i21119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue2 << i24) ^ (jLongValue2 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211110) + i211110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 2:
                                    iA3 = xi0.a(((Long) key).longValue());
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111) + i211111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211112) + i211112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211113) + i211113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211114) + i211114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211115) + i211115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211116) + i211116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211117) + i211117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211118) + i211118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211119) + i211119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111110) + i2111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111) + i2111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111112) + i2111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111113) + i2111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111114) + i2111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111115) + i2111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111116) + i2111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111117) + i2111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue3 << i24) ^ (jLongValue3 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111118) + i2111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 3:
                                    iA3 = xi0.a(((Long) key).longValue());
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111119) + i2111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i21111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111110) + i21111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111) + i21111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111112) + i21111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111113) + i21111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111114) + i21111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111115) + i21111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111116) + i21111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111117) + i21111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111118) + i21111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111119) + i21111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i211111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111110) + i211111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i211111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111) + i211111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111112) + i211111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111113) + i211111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111114) + i211111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111115) + i211111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue4 << i24) ^ (jLongValue4 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111116) + i211111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 4:
                                    iA3 = xi0.a(((Integer) key).intValue());
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111117) + i211111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111118) + i211111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111119) + i211111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111110) + i2111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111) + i2111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111112) + i2111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111113) + i2111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i2111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111114) + i2111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i2111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111115) + i2111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111116) + i2111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111117) + i2111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111118) + i2111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111119) + i2111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111110) + i21111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111) + i21111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111112) + i21111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111113) + i21111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue5 << i24) ^ (jLongValue5 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111114) + i21111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iA3 = 8;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i21111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111115) + i21111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i21111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111116) + i21111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111117) + i21111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111118) + i21111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111119) + i21111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111110) + i211111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111) + i211111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111112) + i211111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111113) + i211111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i211111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111114) + i211111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i211111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111115) + i211111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i211111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111116) + i211111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i211111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111117) + i211111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111118) + i211111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111119) + i211111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111110) + i2111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111) + i2111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue6 << i24) ^ (jLongValue6 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111112) + i2111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iA3 = 4;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111113) + i2111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i2111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111114) + i2111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111115) + i2111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111116) + i2111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111117) + i2111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111118) + i2111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111119) + i2111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111110) + i21111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111) + i21111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111112) + i21111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111113) + i21111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i21111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111114) + i21111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i21111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111115) + i21111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111116) + i21111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111117) + i21111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111118) + i21111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111119) + i21111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue7 << i24) ^ (jLongValue7 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111110) + i211111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iA3 = i24;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111) + i211111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111112) + i211111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111113) + i211111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111114) + i211111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111115) + i211111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111116) + i211111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111117) + i211111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111118) + i211111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111119) + i211111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111110) + i2111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111) + i2111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111112) + i2111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111113) + i2111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111114) + i2111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111115) + i2111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111116) + i2111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111117) + i2111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue8 << i24) ^ (jLongValue8 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111118) + i2111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 8:
                                    if (key instanceof da0) {
                                        size3 = ((da0) key).size();
                                        iT4 = xi0.t(size3);
                                        iA3 = size3 + iT4;
                                    } else {
                                        iA3 = xi0.l((String) key);
                                    }
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111119) + i2111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111110) + i21111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111) + i21111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111112) + i21111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111113) + i21111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111114) + i21111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111115) + i21111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111116) + i21111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111117) + i21111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111118) + i21111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111119) + i21111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i211111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111110) + i211111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i211111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111) + i211111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111112) + i211111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111113) + i211111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111114) + i211111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111115) + i211111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue9 << i24) ^ (jLongValue9 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111116) + i211111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 9:
                                    iG2 = ((c12) ((t0) key)).g(null);
                                    iA3 = iG2;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111117) + i211111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111118) + i211111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111119) + i211111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111110) + i2111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111) + i2111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111112) + i2111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111113) + i2111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i2111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111114) + i2111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i2111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111115) + i2111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111116) + i2111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111117) + i2111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111118) + i2111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111119) + i2111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111110) + i21111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111) + i21111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111112) + i21111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111113) + i21111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue10 << i24) ^ (jLongValue10 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111114) + i21111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 10:
                                    int iG5 = ((c12) ((t0) key)).g(null);
                                    iG2 = iG5 + xi0.t(iG5);
                                    iA3 = iG2;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111115) + i21111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111116) + i21111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111117) + i21111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111118) + i21111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111119) + i21111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111110) + i211111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111) + i211111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111112) + i211111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111113) + i211111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i211111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111114) + i211111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i211111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111115) + i211111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i211111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111116) + i211111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i211111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111117) + i211111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111118) + i211111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111119) + i211111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111110) + i2111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111) + i2111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue11 << i24) ^ (jLongValue11 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111112) + i2111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                    if (key instanceof da0) {
                                        size3 = ((da0) key).size();
                                        iT4 = xi0.t(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iT4 = xi0.t(size3);
                                    }
                                    iA3 = size3 + iT4;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111113) + i2111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111114) + i2111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111115) + i2111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111116) + i2111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111117) + i2111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111118) + i2111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111119) + i2111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111110) + i21111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111) + i21111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111112) + i21111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111113) + i21111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i21111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111114) + i21111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i21111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111115) + i21111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111116) + i21111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111117) + i21111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111118) + i21111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111119) + i21111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue12 << i24) ^ (jLongValue12 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111110) + i211111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 12:
                                    iA3 = xi0.t(((Integer) key).intValue());
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111) + i211111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111112) + i211111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111113) + i211111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111114) + i211111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111115) + i211111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111116) + i211111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111117) + i211111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111118) + i211111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111119) + i211111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111110) + i2111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111) + i2111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111112) + i2111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111113) + i2111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111114) + i2111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111115) + i2111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111116) + i2111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111117) + i2111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue13 << i24) ^ (jLongValue13 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111118) + i2111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 13:
                                    iA3 = xi0.a(((Integer) key).intValue());
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111119) + i2111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111110) + i21111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111) + i21111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111112) + i21111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111113) + i21111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111114) + i21111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111115) + i21111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111116) + i21111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111117) + i21111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111118) + i21111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111119) + i21111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i211111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111110) + i211111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i211111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111) + i211111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111112) + i211111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111113) + i211111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111114) + i211111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111115) + i211111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue14 << i24) ^ (jLongValue14 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111116) + i211111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iA3 = 4;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111117) + i211111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111118) + i211111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111119) + i211111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111110) + i2111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111) + i2111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111112) + i2111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111113) + i2111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i2111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111114) + i2111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i2111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111115) + i2111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111116) + i2111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111117) + i2111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111118) + i2111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111119) + i2111111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111110) + i21111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111) + i21111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111112) + i21111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111113) + i21111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue15 << i24) ^ (jLongValue15 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111114) + i21111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case kq2.x /* 15 */:
                                    ((Long) key).getClass();
                                    iA3 = 8;
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111115) + i21111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111116) + i21111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111117) + i21111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i21111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111118) + i21111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111119) + i21111111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111110) + i211111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111) + i211111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111112) + i211111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111113) + i211111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i211111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111114) + i211111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i211111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111115) + i211111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i211111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111116) + i211111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i211111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111117) + i211111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111118) + i211111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111119) + i211111111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111110) + i2111111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111) + i2111111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue16 << i24) ^ (jLongValue16 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111112) + i2111111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iA3 = xi0.t((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111113) + i2111111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111114) + i2111111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111115) + i2111111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i2111111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111116) + i2111111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111117) + i2111111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111118) + i2111111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111119) + i2111111111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i21111111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111110) + i21111111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i21111111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111111) + i21111111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i21111111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111112) + i21111111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i21111111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111113) + i21111111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i21111111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111114) + i21111111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i21111111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111115) + i21111111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i21111111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111116) + i21111111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i21111111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111117) + i21111111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i21111111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111118) + i21111111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i21111111111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i21111111111111111111111111111119) + i21111111111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue17 << i24) ^ (jLongValue17 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i211111111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111110) + i211111111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iA3 = xi0.a((jLongValue18 << i24) ^ (jLongValue18 >> c3));
                                    i6 = iA3 + iJ20;
                                    vq5Var = (vq5) roVar.a;
                                    iJ11 = xi0.j(2);
                                    if (vq5Var == sq5Var) {
                                        iJ11 *= 2;
                                    }
                                    switch (vq5Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111111) + i211111111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111112) + i211111111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111113) + i211111111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Long) value).longValue());
                                            int i211111111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111114) + i211111111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i211111111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111115) + i211111111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i211111111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111116) + i211111111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i211111111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111117) + i211111111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            i10 = i10;
                                            ((Boolean) value).getClass();
                                            iA4 = i24;
                                            int i211111111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111118) + i211111111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                                iA4 = iT5 + size4;
                                            } else {
                                                iA4 = xi0.l((String) value);
                                            }
                                            int i211111111111111111111111111111119 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i211111111111111111111111111111119) + i211111111111111111111111111111119 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = ((c12) ((t0) value)).g(null);
                                            int i2111111111111111111111111111111110 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111110) + i2111111111111111111111111111111110 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            i10 = i10;
                                            size4 = ((c12) ((t0) value)).g(null);
                                            iT5 = xi0.t(size4);
                                            iA4 = iT5 + size4;
                                            int i2111111111111111111111111111111111 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111111) + i2111111111111111111111111111111111 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            i8 = i8;
                                            i10 = i10;
                                            if (value instanceof da0) {
                                                size4 = ((da0) value).size();
                                                iT5 = xi0.t(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iT5 = xi0.t(size4);
                                            }
                                            iA4 = iT5 + size4;
                                            int i2111111111111111111111111111111112 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111112) + i2111111111111111111111111111111112 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.t(((Integer) value).intValue());
                                            int i2111111111111111111111111111111113 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111113) + i2111111111111111111111111111111113 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            i10 = i10;
                                            iA4 = xi0.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111111114 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111114) + i2111111111111111111111111111111114 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iA4 = 4;
                                            int i2111111111111111111111111111111115 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111115) + i2111111111111111111111111111111115 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case kq2.x /* 15 */:
                                            ((Long) value).getClass();
                                            iA4 = 8;
                                            int i2111111111111111111111111111111116 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111116) + i2111111111111111111111111111111116 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iA4 = xi0.t((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111111111111117 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111117) + i2111111111111111111111111111111117 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iA4 = xi0.a((jLongValue19 << i24) ^ (jLongValue19 >> c3));
                                            i8 = i8;
                                            i10 = i10;
                                            int i2111111111111111111111111111111118 = iA4 + iJ11 + i6;
                                            iT3 += xi0.t(i2111111111111111111111111111111118) + i2111111111111111111111111111111118 + iJ19;
                                            i8 = i8;
                                            i10 = i10;
                                            c2 = c3;
                                            i14 = i24;
                                            break;
                                        default:
                                            t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                default:
                                    t94.v("There is no way to get here, but the compiler thinks otherwise.");
                                    return 0;
                            }
                        }
                    }
                    i3 = i8;
                    i4 = i10;
                    iX2 += iT3;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 51:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ12 = xi0.j(i11);
                        iJ16 = iJ12 + 8;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 52:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ13 = xi0.j(i11);
                        iJ16 = iJ13 + 4;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 53:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        long jE = e(j, c12Var2);
                        iJ14 = xi0.j(i11);
                        iA5 = xi0.a(jE);
                        iT6 = iA5 + iJ14;
                        iX2 += iT6;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 54:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        long jE2 = e(j, c12Var2);
                        iJ14 = xi0.j(i11);
                        iA5 = xi0.a(jE2);
                        iT6 = iA5 + iJ14;
                        iX2 += iT6;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 55:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        int iD = d(j, c12Var2);
                        iJ15 = xi0.j(i11);
                        iA6 = xi0.a(iD);
                        iJ16 = iA6 + iJ15;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 56:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ12 = xi0.j(i11);
                        iJ16 = iJ12 + 8;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 57:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ13 = xi0.j(i11);
                        iJ16 = iJ13 + 4;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 58:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ16 = xi0.j(i11) + 1;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 59:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        Object object4 = unsafe.getObject(c12Var2, j);
                        iX2 = (object4 instanceof da0 ? xi0.x(i11, (da0) object4) : xi0.l((String) object4) + xi0.j(i11)) + iX2;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 60:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        Object object5 = unsafe.getObject(c12Var2, j);
                        me4 me4VarW4 = p53Var.w(i9);
                        Class cls21 = qe4.g;
                        int iJ21 = xi0.j(i11);
                        int iG6 = ((t0) object5).g(me4VarW4);
                        iT6 = xi0.t(iG6) + iG6 + iJ21;
                        iX2 += iT6;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 61:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ16 = xi0.x(i11, (da0) unsafe.getObject(c12Var2, j));
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 62:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        int iD2 = d(j, c12Var2);
                        iJ15 = xi0.j(i11);
                        iA6 = xi0.t(iD2);
                        iJ16 = iA6 + iJ15;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 63:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        int iD3 = d(j, c12Var2);
                        iJ15 = xi0.j(i11);
                        iA6 = xi0.a(iD3);
                        iJ16 = iA6 + iJ15;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 64:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ13 = xi0.j(i11);
                        iJ16 = iJ13 + 4;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 65:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ12 = xi0.j(i11);
                        iJ16 = iJ12 + 8;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 66:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        int iD4 = d(j, c12Var2);
                        iJ15 = xi0.j(i11);
                        iA6 = xi0.t((iD4 >> 31) ^ (iD4 << 1));
                        iJ16 = iA6 + iJ15;
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 67:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        long jE3 = e(j, c12Var2);
                        iJ14 = xi0.j(i11);
                        iA5 = xi0.a((jE3 << 1) ^ (jE3 >> 63));
                        iT6 = iA5 + iJ14;
                        iX2 += iT6;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 68:
                    if (p53Var.s(i11, i9, c12Var2)) {
                        iJ16 = ((t0) unsafe.getObject(c12Var2, j)).g(p53Var.w(i9)) + (xi0.j(i11) * 2);
                        iX2 += iJ16;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                default:
                    i9 += 3;
                    i7 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // defpackage.me4
    public final void y(Object obj) {
        if (b(obj)) {
            if (obj instanceof c12) {
                c12 c12Var = (c12) obj;
                c12Var.m(Integer.MAX_VALUE);
                c12Var.memoizedHashCode = 0;
                c12Var.j();
            }
            int[] iArr = this.g;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iJ = J(i2);
                long j = 1048575 & iJ;
                int I = I(iJ);
                Unsafe unsafe = i;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (c(i2, obj)) {
                                    w(i2).y(unsafe.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case kq2.l /* 48 */:
                            case 49:
                                this.m.getClass();
                                d14 d14Var = (d14) ((ef2) jh5.j(j, obj));
                                if (d14Var.j) {
                                    d14Var.j = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.w.getClass();
                                    ((n13) object).j = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (s(iArr[i2], i2, obj)) {
                        w(i2).y(unsafe.getObject(obj, j));
                    }
                } else if (c(i2, obj)) {
                    w(i2).y(unsafe.getObject(obj, j));
                }
            }
            this.q.getClass();
            qg5 qg5Var = ((c12) obj).unknownFields;
            if (qg5Var.v) {
                qg5Var.v = false;
            }
        }
    }

    public final void z(int i2, Object obj, Object obj2) {
        int[] iArr = this.g;
        int i3 = iArr[i2];
        if (s(i3, i2, obj2)) {
            long J = J(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                up.r(iArr[i2], obj2);
                return;
            }
            me4 me4VarW = w(i2);
            if (!s(i3, i2, obj)) {
                if (b(object)) {
                    c12 c12VarN = me4VarW.n();
                    me4VarW.g(c12VarN, object);
                    unsafe.putObject(obj, J, c12VarN);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i3, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!b(object2)) {
                c12 c12VarN2 = me4VarW.n();
                me4VarW.g(c12VarN2, object2);
                unsafe.putObject(obj, J, c12VarN2);
                object2 = c12VarN2;
            }
            me4VarW.g(object2, object);
        }
    }
}
