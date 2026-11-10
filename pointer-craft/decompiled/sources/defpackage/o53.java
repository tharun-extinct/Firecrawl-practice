package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class o53 implements le4 {
    public static final int[] c = new int[0];
    public static final Unsafe i;
    public final sg3 a;
    public final int[] g;
    public final int j;
    public final int[] l;
    public final wv2 m;
    public final int n;
    public final rg5 q;
    public final int r;
    public final int t;
    public final s0 v;
    public final o13 w;
    public final boolean x;
    public final Object[] y;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ch5((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        i = unsafe;
    }

    public o53(int[] iArr, Object[] objArr, int i2, int i3, s0 s0Var, int[] iArr2, int i4, int i5, sg3 sg3Var, wv2 wv2Var, rg5 rg5Var, ym1 ym1Var, o13 o13Var) {
        this.g = iArr;
        this.y = objArr;
        this.r = i2;
        this.n = i3;
        this.x = s0Var instanceof b12;
        this.l = iArr2;
        this.j = i4;
        this.t = i5;
        this.a = sg3Var;
        this.m = wv2Var;
        this.q = rg5Var;
        this.v = s0Var;
        this.w = o13Var;
    }

    public static long A(int i2) {
        return i2 & 1048575;
    }

    public static int B(long j, Object obj) {
        return ((Integer) ih5.a(j, obj)).intValue();
    }

    public static long C(long j, Object obj) {
        return ((Long) ih5.a(j, obj)).longValue();
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

    public static int L(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    public static o53 e(z24 z24Var, sg3 sg3Var, wv2 wv2Var, rg5 rg5Var, ym1 ym1Var, o13 o13Var) {
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
        if (!(z24Var instanceof z24)) {
            uo1.B();
            return null;
        }
        String str = z24Var.y;
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
        Object[] objArr = z24Var.r;
        Class<?> cls = z24Var.g.getClass();
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
                    if (i84 == 12 && (du4.g(z24Var.g(), 1) || (iCharAt11 & 2048) != 0)) {
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
                        if (z24Var.g() == 1 || (iCharAt11 & 2048) != 0) {
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
        return new o53(iArr3, objArr2, i3, i6, z24Var.g, iArr, i8, i63, sg3Var, wv2Var, rg5Var, ym1Var, o13Var);
    }

    public static void q(Object obj) {
        if (u(obj)) {
            return;
        }
        l0.m(obj, "Mutating immutable message: ");
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b12) {
            return ((b12) obj).l();
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int D(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, defpackage.cr r35) {
        /*
            Method dump skipped, instruction units count: 2284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o53.D(java.lang.Object, byte[], int, int, int, cr):int");
    }

    public final void E(int i2, si0 si0Var, Object obj) {
        if ((536870912 & i2) != 0) {
            ih5.s(i2 & 1048575, obj, si0Var.Q());
        } else if (this.x) {
            ih5.s(i2 & 1048575, obj, si0Var.M());
        } else {
            ih5.s(i2 & 1048575, obj, si0Var.w());
        }
    }

    public final void G(int i2, Object obj) {
        int i3 = this.g[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        ih5.i(obj, j, (1 << (i3 >>> 20)) | ih5.j(j, obj));
    }

    public final void H(int i2, int i3, Object obj) {
        ih5.i(obj, this.g[i3 + 2] & 1048575, i2);
    }

    public final int I(int i2, int i3) {
        int[] iArr = this.g;
        int length = (iArr.length / 3) - 1;
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

    public final void J(int i2, Object obj, Object obj2) {
        i.putObject(obj, M(i2) & 1048575, obj2);
        G(i2, obj);
    }

    public final void K(int i2, int i3, Object obj, Object obj2) {
        i.putObject(obj, M(i3) & 1048575, obj2);
        H(i2, i3, obj);
    }

    public final int M(int i2) {
        return this.g[i2 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // defpackage.le4
    public final boolean a(b12 b12Var, b12 b12Var2) {
        int[] iArr = this.g;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean zQ = true;
            if (i2 < length) {
                int iM = M(i2);
                long j = iM & 1048575;
                switch (L(iM)) {
                    case 0:
                        if (!m(b12Var, b12Var2, i2)) {
                            zQ = false;
                        } else {
                            hh5 hh5Var = ih5.r;
                            if (Double.doubleToLongBits(hh5Var.r(j, b12Var)) != Double.doubleToLongBits(hh5Var.r(j, b12Var2))) {
                                zQ = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m(b12Var, b12Var2, i2)) {
                            zQ = false;
                        } else {
                            hh5 hh5Var2 = ih5.r;
                            if (Float.floatToIntBits(hh5Var2.n(j, b12Var)) != Float.floatToIntBits(hh5Var2.n(j, b12Var2))) {
                                zQ = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m(b12Var, b12Var2, i2) || ih5.t(j, b12Var) != ih5.t(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 3:
                        if (!m(b12Var, b12Var2, i2) || ih5.t(j, b12Var) != ih5.t(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 4:
                        if (!m(b12Var, b12Var2, i2) || ih5.j(j, b12Var) != ih5.j(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 5:
                        if (!m(b12Var, b12Var2, i2) || ih5.t(j, b12Var) != ih5.t(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 6:
                        if (!m(b12Var, b12Var2, i2) || ih5.j(j, b12Var) != ih5.j(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 7:
                        if (!m(b12Var, b12Var2, i2)) {
                            zQ = false;
                        } else {
                            hh5 hh5Var3 = ih5.r;
                            if (hh5Var3.g(j, b12Var) != hh5Var3.g(j, b12Var2)) {
                                zQ = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m(b12Var, b12Var2, i2) || !pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2))) {
                            zQ = false;
                        }
                        break;
                    case 9:
                        if (!m(b12Var, b12Var2, i2) || !pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2))) {
                            zQ = false;
                        }
                        break;
                    case 10:
                        if (!m(b12Var, b12Var2, i2) || !pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2))) {
                            zQ = false;
                        }
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        if (!m(b12Var, b12Var2, i2) || ih5.j(j, b12Var) != ih5.j(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 12:
                        if (!m(b12Var, b12Var2, i2) || ih5.j(j, b12Var) != ih5.j(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 13:
                        if (!m(b12Var, b12Var2, i2) || ih5.j(j, b12Var) != ih5.j(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 14:
                        if (!m(b12Var, b12Var2, i2) || ih5.t(j, b12Var) != ih5.t(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case kq2.x /* 15 */:
                        if (!m(b12Var, b12Var2, i2) || ih5.j(j, b12Var) != ih5.j(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 16:
                        if (!m(b12Var, b12Var2, i2) || ih5.t(j, b12Var) != ih5.t(j, b12Var2)) {
                            zQ = false;
                        }
                        break;
                    case 17:
                        if (!m(b12Var, b12Var2, i2) || !pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2))) {
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
                        zQ = pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2));
                        break;
                    case 50:
                        zQ = pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2));
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
                        if (ih5.j(j2, b12Var) != ih5.j(j2, b12Var2) || !pe4.q(ih5.a(j, b12Var), ih5.a(j, b12Var2))) {
                            zQ = false;
                        }
                        break;
                }
                if (zQ) {
                    i2 += 3;
                }
            } else {
                this.q.getClass();
                if (b12Var.unknownFields.equals(b12Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final le4 b(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.y;
        le4 le4Var = (le4) objArr[i3];
        if (le4Var != null) {
            return le4Var;
        }
        le4 le4VarG = z04.r.g((Class) objArr[i3 + 1]);
        objArr[i3] = le4VarG;
        return le4VarG;
    }

    public final void c(int i2) {
        fj.w(this.y[((i2 / 3) * 2) + 1]);
    }

    public final Object d(int i2, int i3, Object obj) {
        le4 le4VarB = b(i3);
        if (!z(i2, i3, obj)) {
            return le4VarB.n();
        }
        Object object = i.getObject(obj, M(i3) & 1048575);
        if (u(object)) {
            return object;
        }
        b12 b12VarN = le4VarB.n();
        if (object != null) {
            le4VarB.g(b12VarN, object);
        }
        return b12VarN;
    }

    public final void f(int i2, Object obj, Object obj2) {
        int[] iArr = this.g;
        int i3 = iArr[i2];
        if (z(i3, i2, obj2)) {
            long jM = M(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                up.r(iArr[i2], obj2);
                return;
            }
            le4 le4VarB = b(i2);
            if (!z(i3, i2, obj)) {
                if (u(object)) {
                    b12 b12VarN = le4VarB.n();
                    le4VarB.g(b12VarN, object);
                    unsafe.putObject(obj, jM, b12VarN);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i3, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!u(object2)) {
                b12 b12VarN2 = le4VarB.n();
                le4VarB.g(b12VarN2, object2);
                unsafe.putObject(obj, jM, b12VarN2);
                object2 = b12VarN2;
            }
            le4VarB.g(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.le4
    public final void g(Object obj, Object obj2) {
        Object obj3;
        q(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i2 >= iArr.length) {
                pe4.m(this.q, obj, obj2);
                return;
            }
            int iM = M(i2);
            long j = 1048575 & iM;
            int i3 = iArr[i2];
            switch (L(iM)) {
                case 0:
                    if (!s(i2, obj2)) {
                        obj3 = obj;
                    } else {
                        hh5 hh5Var = ih5.r;
                        obj3 = obj;
                        hh5Var.l(obj3, j, hh5Var.r(j, obj2));
                        G(i2, obj3);
                    }
                    break;
                case 1:
                    if (s(i2, obj2)) {
                        hh5 hh5Var2 = ih5.r;
                        hh5Var2.j(obj, j, hh5Var2.n(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i2, obj2)) {
                        ih5.b(obj, j, ih5.t(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i2, obj2)) {
                        ih5.b(obj, j, ih5.t(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i2, obj2)) {
                        ih5.i(obj, j, ih5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i2, obj2)) {
                        ih5.b(obj, j, ih5.t(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i2, obj2)) {
                        ih5.i(obj, j, ih5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i2, obj2)) {
                        hh5 hh5Var3 = ih5.r;
                        hh5Var3.v(obj, j, hh5Var3.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i2, obj2)) {
                        ih5.s(j, obj, ih5.a(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    o(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i2, obj2)) {
                        ih5.s(j, obj, ih5.a(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (s(i2, obj2)) {
                        ih5.i(obj, j, ih5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i2, obj2)) {
                        ih5.i(obj, j, ih5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i2, obj2)) {
                        ih5.i(obj, j, ih5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i2, obj2)) {
                        ih5.b(obj, j, ih5.t(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case kq2.x /* 15 */:
                    if (s(i2, obj2)) {
                        ih5.i(obj, j, ih5.j(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i2, obj2)) {
                        ih5.b(obj, j, ih5.t(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    o(i2, obj, obj2);
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
                    df2 df2VarT = (df2) ih5.a(j, obj);
                    df2 df2Var = (df2) ih5.a(j, obj2);
                    int size = df2VarT.size();
                    int size2 = df2Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((a1) df2VarT).j) {
                            df2VarT = df2VarT.t(size2 + size);
                        }
                        df2VarT.addAll(df2Var);
                    }
                    if (size > 0) {
                        df2Var = df2VarT;
                    }
                    ih5.s(j, obj, df2Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = pe4.g;
                    Object objA = ih5.a(j, obj);
                    Object objA2 = ih5.a(j, obj2);
                    this.w.getClass();
                    ih5.s(j, obj, o13.g(objA, objA2));
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
                    if (z(i3, i2, obj2)) {
                        ih5.s(j, obj, ih5.a(j, obj2));
                        H(i3, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    f(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(i3, i2, obj2)) {
                        ih5.s(j, obj, ih5.a(j, obj2));
                        H(i3, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    f(i2, obj, obj2);
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

    public final void h(int i2, Object obj, Object obj2) {
        long jM = M(i2) & 1048575;
        Object objA = ih5.a(jM, obj);
        o13 o13Var = this.w;
        if (objA != null) {
            o13Var.getClass();
            if (!((m13) objA).n()) {
                Object objL = m13.y().l();
                o13.g(objL, objA);
                ih5.s(jM, obj, objL);
                objA = objL;
            }
        } else {
            o13Var.getClass();
            objA = m13.y().l();
            ih5.s(jM, obj, objA);
        }
        o13Var.getClass();
        fj.w(obj2);
        throw null;
    }

    public final Object i(int i2) {
        return this.y[(i2 / 3) * 2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x032a  */
    @Override // defpackage.le4
    public final int j(b12 b12Var) {
        int i2;
        int i3;
        o53 o53Var;
        int i4;
        b12 b12Var2;
        int iN;
        int iR;
        int iD;
        int size;
        int iT;
        int iD2;
        int iD3;
        int size2;
        int iD4;
        int iA;
        int iA2;
        int i5 = 0;
        int i6 = 0;
        int iY = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = this.g;
            if (i6 >= iArr.length) {
                this.q.getClass();
                return b12Var.unknownFields.y() + iY;
            }
            int iM = this.M(i6);
            int iL = L(iM);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & 1048575;
            Unsafe unsafe = i;
            if (iL <= 17) {
                if (i10 != i7) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(b12Var, i10);
                    i7 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = i7;
                i3 = i11;
            } else {
                i2 = i7;
                i3 = 0;
            }
            long j = iM & 1048575;
            if (iL >= wn1.t.g()) {
                wn1.a.g();
            }
            switch (iL) {
                case 0:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.n(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 1:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.t(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 2:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.w(i8, unsafe.getLong(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 3:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.B(i8, unsafe.getLong(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 4:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.m(i8, unsafe.getInt(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 5:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.j(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 6:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.l(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 7:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.g(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 8:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        Object object = unsafe.getObject(b12Var2, j);
                        iY = (object instanceof ea0 ? yi0.y(i8, (ea0) object) : yi0.f((String) object, i8)) + iY;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 9:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        Object object2 = unsafe.getObject(b12Var2, j);
                        le4 le4VarB = o53Var.b(i6);
                        Class cls = pe4.g;
                        iN = yi0.i(i8, (s0) object2, le4VarB);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 10:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.y(i8, (ea0) unsafe.getObject(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.e(i8, unsafe.getInt(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 12:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.v(i8, unsafe.getInt(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 13:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.s(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 14:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.p(i8);
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case kq2.x /* 15 */:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.u(i8, unsafe.getInt(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 16:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.h(i8, unsafe.getLong(b12Var2, j));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 17:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    if (o53Var.p(b12Var2, i6, i2, i4, i3)) {
                        iN = yi0.a(i8, (s0) unsafe.getObject(b12Var2, j), o53Var.b(i6));
                        iY += iN;
                    }
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 18:
                    iR = pe4.r(i8, (List) unsafe.getObject(b12Var, j));
                    iY += iR;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 19:
                    iR = pe4.y(i8, (List) unsafe.getObject(b12Var, j));
                    iY += iR;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(b12Var, j);
                    Class cls2 = pe4.g;
                    if (list.size() == 0) {
                        iD = 0;
                    } else {
                        iD = (yi0.d(i8) * list.size()) + pe4.v(list);
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(b12Var, j);
                    Class cls3 = pe4.g;
                    size = list2.size();
                    if (size == 0) {
                        iD = 0;
                    } else {
                        iT = pe4.t(list2);
                        iD2 = yi0.d(i8);
                        iD = (iD2 * size) + iT;
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(b12Var, j);
                    Class cls4 = pe4.g;
                    size = list3.size();
                    if (size == 0) {
                        iD = 0;
                    } else {
                        iT = pe4.n(list3);
                        iD2 = yi0.d(i8);
                        iD = (iD2 * size) + iT;
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 23:
                    iR = pe4.r(i8, (List) unsafe.getObject(b12Var, j));
                    iY += iR;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 24:
                    iR = pe4.y(i8, (List) unsafe.getObject(b12Var, j));
                    iY += iR;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(b12Var, j);
                    Class cls5 = pe4.g;
                    int size3 = list4.size();
                    iY += size3 == 0 ? 0 : yi0.g(i8) * size3;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(b12Var, j);
                    Class cls6 = pe4.g;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iD = 0;
                    } else {
                        iD = yi0.d(i8) * size4;
                        for (int i12 = 0; i12 < size4; i12++) {
                            Object obj = list5.get(i12);
                            iD = (obj instanceof ea0 ? yi0.r((ea0) obj) : yi0.k((String) obj)) + iD;
                        }
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(b12Var, j);
                    le4 le4VarB2 = this.b(i6);
                    Class cls7 = pe4.g;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iD3 = 0;
                    } else {
                        iD3 = yi0.d(i8) * size5;
                        for (int i13 = 0; i13 < size5; i13++) {
                            iD3 += yi0.b((s0) list6.get(i13), le4VarB2);
                        }
                    }
                    iY += iD3;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(b12Var, j);
                    Class cls8 = pe4.g;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iD = 0;
                    } else {
                        iD = yi0.d(i8) * size6;
                        for (int i14 = 0; i14 < list7.size(); i14++) {
                            iD += yi0.r((ea0) list7.get(i14));
                        }
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(b12Var, j);
                    Class cls9 = pe4.g;
                    size = list8.size();
                    if (size == 0) {
                        iD = 0;
                    } else {
                        iT = pe4.j(list8);
                        iD2 = yi0.d(i8);
                        iD = (iD2 * size) + iT;
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(b12Var, j);
                    Class cls10 = pe4.g;
                    size = list9.size();
                    if (size == 0) {
                        iD = 0;
                    } else {
                        iT = pe4.g(list9);
                        iD2 = yi0.d(i8);
                        iD = (iD2 * size) + iT;
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 31:
                    iR = pe4.y(i8, (List) unsafe.getObject(b12Var, j));
                    iY += iR;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 32:
                    iR = pe4.r(i8, (List) unsafe.getObject(b12Var, j));
                    iY += iR;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(b12Var, j);
                    Class cls11 = pe4.g;
                    size = list10.size();
                    if (size == 0) {
                        iD = 0;
                    } else {
                        iT = pe4.x(list10);
                        iD2 = yi0.d(i8);
                        iD = (iD2 * size) + iT;
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(b12Var, j);
                    Class cls12 = pe4.g;
                    size = list11.size();
                    if (size == 0) {
                        iD = 0;
                    } else {
                        iT = pe4.l(list11);
                        iD2 = yi0.d(i8);
                        iD = (iD2 * size) + iT;
                    }
                    iY += iD;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(b12Var, j);
                    Class cls13 = pe4.g;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(b12Var, j);
                    Class cls14 = pe4.g;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 37:
                    size2 = pe4.v((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 38:
                    size2 = pe4.t((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 39:
                    size2 = pe4.n((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(b12Var, j);
                    Class cls15 = pe4.g;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(b12Var, j);
                    Class cls16 = pe4.g;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(b12Var, j);
                    Class cls17 = pe4.g;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 43:
                    size2 = pe4.j((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 44:
                    size2 = pe4.g((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(b12Var, j);
                    Class cls18 = pe4.g;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(b12Var, j);
                    Class cls19 = pe4.g;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 47:
                    size2 = pe4.x((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case kq2.l /* 48 */:
                    size2 = pe4.l((List) unsafe.getObject(b12Var, j));
                    if (size2 > 0) {
                        iD4 = yi0.d(i8);
                        iA = yi0.A(size2);
                        iY += iA + iD4 + size2;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(b12Var, j);
                    le4 le4VarB3 = this.b(i6);
                    Class cls20 = pe4.g;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i15 = 0; i15 < size7; i15++) {
                            iA2 += yi0.a(i8, (s0) list19.get(i15), le4VarB3);
                        }
                    }
                    iY += iA2;
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(b12Var, j);
                    Object objI = this.i(i6);
                    this.w.getClass();
                    m13 m13Var = (m13) object3;
                    fj.w(objI);
                    if (!m13Var.isEmpty()) {
                        Iterator it = m13Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 51:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.n(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 52:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.t(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 53:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.w(i8, C(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 54:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.B(i8, C(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 55:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.m(i8, B(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 56:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.j(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 57:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.l(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 58:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.g(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 59:
                    if (this.z(i8, i6, b12Var)) {
                        Object object4 = unsafe.getObject(b12Var, j);
                        iY = (object4 instanceof ea0 ? yi0.y(i8, (ea0) object4) : yi0.f((String) object4, i8)) + iY;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 60:
                    if (this.z(i8, i6, b12Var)) {
                        Object object5 = unsafe.getObject(b12Var, j);
                        le4 le4VarB4 = this.b(i6);
                        Class cls21 = pe4.g;
                        iR = yi0.i(i8, (s0) object5, le4VarB4);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 61:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.y(i8, (ea0) unsafe.getObject(b12Var, j));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 62:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.e(i8, B(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 63:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.v(i8, B(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 64:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.s(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 65:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.p(i8);
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 66:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.u(i8, B(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 67:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.h(i8, C(j, b12Var));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                case 68:
                    if (this.z(i8, i6, b12Var)) {
                        iR = yi0.a(i8, (s0) unsafe.getObject(b12Var, j), this.b(i6));
                        iY += iR;
                    }
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
                default:
                    o53Var = this;
                    i4 = i5;
                    b12Var2 = b12Var;
                    i6 += 3;
                    this = o53Var;
                    b12Var = b12Var2;
                    i7 = i2;
                    i5 = i4;
                    break;
            }
        }
    }

    public final Object k(int i2, Object obj) {
        le4 le4VarB = b(i2);
        long jM = M(i2) & 1048575;
        if (!s(i2, obj)) {
            return le4VarB.n();
        }
        Object object = i.getObject(obj, jM);
        if (u(object)) {
            return object;
        }
        b12 b12VarN = le4VarB.n();
        if (object != null) {
            le4VarB.g(b12VarN, object);
        }
        return b12VarN;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x068c A[Catch: all -> 0x05e6, TryCatch #3 {all -> 0x05e6, blocks: (B:145:0x0687, B:147:0x068c, B:148:0x0691, B:125:0x0515, B:126:0x0521, B:127:0x0537, B:128:0x054d, B:129:0x0563, B:130:0x057c, B:131:0x0592, B:132:0x05a8, B:133:0x05c0, B:134:0x05ce, B:137:0x05e9, B:138:0x05ff, B:139:0x0615, B:140:0x062b, B:141:0x0641, B:142:0x0656, B:143:0x066d), top: B:166:0x0687 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0699 A[LOOP:2: B:150:0x0697->B:151:0x0699, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:159:0x06b4 A[LOOP:3: B:158:0x06b2->B:159:0x06b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x06be  */
    /* JADX WARN: Code duplicated, block: B:188:0x0697 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.le4
    public final void l(Object obj, si0 si0Var, wm1 wm1Var) throws Throwable {
        int[] iArr;
        pg5 pg5VarG;
        rg5 rg5Var;
        pg5 pg5Var;
        wm1Var.getClass();
        q(obj);
        rg5 rg5Var2 = this.q;
        int[] iArr2 = this.l;
        int i2 = this.t;
        int i3 = this.j;
        pg5 pg5VarG2 = null;
        while (true) {
            try {
                int iV = si0Var.v();
                int I = (iV < this.r || iV > this.n) ? -1 : I(iV, 0);
                if (I >= 0) {
                    int iM = M(I);
                    try {
                        int iL = L(iM);
                        wv2 wv2Var = this.m;
                        switch (iL) {
                            case 0:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.r.l(obj, A(iM), si0Var.i());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 1:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.r.j(obj, A(iM), si0Var.f());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 2:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.b(obj, A(iM), si0Var.B());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 3:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.b(obj, A(iM), si0Var.T());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 4:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.i(obj, A(iM), si0Var.e());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 5:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.b(obj, A(iM), si0Var.h());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 6:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.i(obj, A(iM), si0Var.u());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 7:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.r.v(obj, A(iM), si0Var.m());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 8:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                E(iM, si0Var, obj);
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 9:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                s0 s0Var = (s0) k(I, obj);
                                si0Var.t(s0Var, b(I), wm1Var);
                                J(I, obj, s0Var);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 10:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.s(A(iM), obj, si0Var.w());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.i(obj, A(iM), si0Var.R());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 12:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                int iS = si0Var.s();
                                c(I);
                                ih5.i(obj, A(iM), iS);
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 13:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.i(obj, A(iM), si0Var.E());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 14:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.b(obj, A(iM), si0Var.G());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case kq2.x /* 15 */:
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                ih5.i(obj, A(iM), si0Var.I());
                                G(I, obj);
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 16:
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                try {
                                    ih5.b(obj, A(iM), si0Var.K());
                                    G(I, obj);
                                    break;
                                } catch (fg2 unused) {
                                    try {
                                        rg5Var.getClass();
                                        if (pg5VarG == null) {
                                            pg5VarG = rg5.g(obj);
                                        }
                                        if (!rg5.y(0, si0Var, pg5VarG)) {
                                            while (i3 < i2) {
                                                w(iArr[i3], obj, pg5VarG);
                                                i3++;
                                            }
                                            if (pg5VarG != null) {
                                                ((b12) obj).unknownFields = pg5VarG;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i3 < i2) {
                                            w(iArr[i3], obj, pg5VarG);
                                            i3++;
                                        }
                                        if (pg5VarG != null) {
                                            rg5Var.getClass();
                                            ((b12) obj).unknownFields = pg5VarG;
                                        }
                                        throw th;
                                    }
                                }
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 17:
                                pg5VarG = pg5VarG2;
                                s0 s0Var2 = (s0) k(I, obj);
                                si0Var.l(s0Var2, b(I), wm1Var);
                                J(I, obj, s0Var2);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 18:
                                pg5VarG = pg5VarG2;
                                long jA = A(iM);
                                wv2Var.getClass();
                                si0Var.b(wv2.g(jA, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 19:
                                pg5VarG = pg5VarG2;
                                long jA2 = A(iM);
                                wv2Var.getClass();
                                si0Var.k(wv2.g(jA2, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 20:
                                pg5VarG = pg5VarG2;
                                long jA3 = A(iM);
                                wv2Var.getClass();
                                si0Var.C(wv2.g(jA3, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 21:
                                pg5VarG = pg5VarG2;
                                long jA4 = A(iM);
                                wv2Var.getClass();
                                si0Var.U(wv2.g(jA4, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 22:
                                pg5VarG = pg5VarG2;
                                long jA5 = A(iM);
                                wv2Var.getClass();
                                si0Var.A(wv2.g(jA5, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 23:
                                pg5VarG = pg5VarG2;
                                long jA6 = A(iM);
                                wv2Var.getClass();
                                si0Var.o(wv2.g(jA6, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 24:
                                pg5VarG = pg5VarG2;
                                long jA7 = A(iM);
                                wv2Var.getClass();
                                si0Var.z(wv2.g(jA7, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 25:
                                pg5VarG = pg5VarG2;
                                long jA8 = A(iM);
                                wv2Var.getClass();
                                si0Var.q(wv2.g(jA8, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 26:
                                pg5VarG = pg5VarG2;
                                if ((536870912 & iM) != 0) {
                                    wv2Var.getClass();
                                    si0Var.P(wv2.g(iM & 1048575, obj));
                                } else {
                                    wv2Var.getClass();
                                    si0Var.N(wv2.g(iM & 1048575, obj));
                                }
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 27:
                                pg5VarG = pg5VarG2;
                                le4 le4VarB = b(I);
                                wv2Var.getClass();
                                si0Var.D(wv2.g(iM & 1048575, obj), le4VarB, wm1Var);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 28:
                                pg5VarG = pg5VarG2;
                                long jA9 = A(iM);
                                wv2Var.getClass();
                                si0Var.c(wv2.g(jA9, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 29:
                                pg5VarG = pg5VarG2;
                                long jA10 = A(iM);
                                wv2Var.getClass();
                                si0Var.S(wv2.g(jA10, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 30:
                                pg5VarG = pg5VarG2;
                                long jA11 = A(iM);
                                wv2Var.getClass();
                                df2 df2VarG = wv2.g(jA11, obj);
                                si0Var.p(df2VarG);
                                c(I);
                                pe4.a(obj, iV, df2VarG, pg5VarG, rg5Var2);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 31:
                                pg5VarG = pg5VarG2;
                                long jA12 = A(iM);
                                wv2Var.getClass();
                                si0Var.F(wv2.g(jA12, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 32:
                                pg5VarG = pg5VarG2;
                                long jA13 = A(iM);
                                wv2Var.getClass();
                                si0Var.H(wv2.g(jA13, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 33:
                                pg5VarG = pg5VarG2;
                                long jA14 = A(iM);
                                wv2Var.getClass();
                                si0Var.J(wv2.g(jA14, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 34:
                                pg5VarG = pg5VarG2;
                                long jA15 = A(iM);
                                wv2Var.getClass();
                                si0Var.L(wv2.g(jA15, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 35:
                                pg5VarG = pg5VarG2;
                                long jA16 = A(iM);
                                wv2Var.getClass();
                                si0Var.b(wv2.g(jA16, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 36:
                                pg5VarG = pg5VarG2;
                                long jA17 = A(iM);
                                wv2Var.getClass();
                                si0Var.k(wv2.g(jA17, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 37:
                                pg5VarG = pg5VarG2;
                                long jA18 = A(iM);
                                wv2Var.getClass();
                                si0Var.C(wv2.g(jA18, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 38:
                                pg5VarG = pg5VarG2;
                                long jA19 = A(iM);
                                wv2Var.getClass();
                                si0Var.U(wv2.g(jA19, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 39:
                                pg5VarG = pg5VarG2;
                                long jA20 = A(iM);
                                wv2Var.getClass();
                                si0Var.A(wv2.g(jA20, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 40:
                                pg5VarG = pg5VarG2;
                                long jA21 = A(iM);
                                wv2Var.getClass();
                                si0Var.o(wv2.g(jA21, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 41:
                                pg5VarG = pg5VarG2;
                                long jA22 = A(iM);
                                wv2Var.getClass();
                                si0Var.z(wv2.g(jA22, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 42:
                                pg5VarG = pg5VarG2;
                                long jA23 = A(iM);
                                wv2Var.getClass();
                                si0Var.q(wv2.g(jA23, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 43:
                                pg5VarG = pg5VarG2;
                                long jA24 = A(iM);
                                wv2Var.getClass();
                                si0Var.S(wv2.g(jA24, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 44:
                                pg5 pg5Var2 = pg5VarG2;
                                try {
                                    long jA25 = A(iM);
                                    wv2Var.getClass();
                                    df2 df2VarG2 = wv2.g(jA25, obj);
                                    si0Var.p(df2VarG2);
                                    c(I);
                                    pg5VarG = pg5Var2;
                                    try {
                                        pe4.a(obj, iV, df2VarG2, pg5VarG, rg5Var2);
                                        rg5Var = rg5Var2;
                                        iArr = iArr2;
                                    } catch (fg2 unused2) {
                                        rg5Var = rg5Var2;
                                        iArr = iArr2;
                                        rg5Var.getClass();
                                        if (pg5VarG == null) {
                                            pg5VarG = rg5.g(obj);
                                        }
                                        if (!rg5.y(0, si0Var, pg5VarG)) {
                                            while (i3 < i2) {
                                                w(iArr[i3], obj, pg5VarG);
                                                i3++;
                                            }
                                            if (pg5VarG != null) {
                                                ((b12) obj).unknownFields = pg5VarG;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        rg5Var = rg5Var2;
                                        iArr = iArr2;
                                        while (i3 < i2) {
                                            w(iArr[i3], obj, pg5VarG);
                                            i3++;
                                        }
                                        if (pg5VarG != null) {
                                            rg5Var.getClass();
                                            ((b12) obj).unknownFields = pg5VarG;
                                        }
                                        throw th;
                                    }
                                } catch (fg2 unused3) {
                                    pg5VarG = pg5Var2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    pg5VarG = pg5Var2;
                                }
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 45:
                                pg5Var = pg5VarG2;
                                long jA26 = A(iM);
                                wv2Var.getClass();
                                si0Var.F(wv2.g(jA26, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 46:
                                pg5Var = pg5VarG2;
                                long jA27 = A(iM);
                                wv2Var.getClass();
                                si0Var.H(wv2.g(jA27, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 47:
                                pg5Var = pg5VarG2;
                                long jA28 = A(iM);
                                wv2Var.getClass();
                                si0Var.J(wv2.g(jA28, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case kq2.l /* 48 */:
                                pg5Var = pg5VarG2;
                                long jA29 = A(iM);
                                wv2Var.getClass();
                                si0Var.L(wv2.g(jA29, obj));
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 49:
                                pg5Var = pg5VarG2;
                                long jA30 = A(iM);
                                le4 le4VarB2 = b(I);
                                wv2Var.getClass();
                                si0Var.d(wv2.g(jA30, obj), le4VarB2, wm1Var);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 50:
                                pg5Var = pg5VarG2;
                                h(I, obj, i(I));
                                throw null;
                            case 51:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Double.valueOf(si0Var.i()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 52:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Float.valueOf(si0Var.f()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 53:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Long.valueOf(si0Var.B()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 54:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Long.valueOf(si0Var.T()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 55:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Integer.valueOf(si0Var.e()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 56:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Long.valueOf(si0Var.h()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 57:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Integer.valueOf(si0Var.u()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 58:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Boolean.valueOf(si0Var.m()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 59:
                                pg5Var = pg5VarG2;
                                E(iM, si0Var, obj);
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 60:
                                pg5Var = pg5VarG2;
                                s0 s0Var3 = (s0) d(iV, I, obj);
                                si0Var.t(s0Var3, b(I), wm1Var);
                                K(iV, I, obj, s0Var3);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 61:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, si0Var.w());
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 62:
                                pg5Var = pg5VarG2;
                                ih5.s(A(iM), obj, Integer.valueOf(si0Var.R()));
                                H(iV, I, obj);
                                rg5Var = rg5Var2;
                                iArr = iArr2;
                                pg5VarG = pg5Var;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 63:
                                try {
                                    int iS2 = si0Var.s();
                                    c(I);
                                    pg5Var = pg5VarG2;
                                    try {
                                        ih5.s(A(iM), obj, Integer.valueOf(iS2));
                                        H(iV, I, obj);
                                        rg5Var = rg5Var2;
                                        iArr = iArr2;
                                        pg5VarG = pg5Var;
                                    } catch (fg2 unused4) {
                                        rg5Var = rg5Var2;
                                        iArr = iArr2;
                                        pg5VarG = pg5Var;
                                        rg5Var.getClass();
                                        if (pg5VarG == null) {
                                            pg5VarG = rg5.g(obj);
                                        }
                                        if (!rg5.y(0, si0Var, pg5VarG)) {
                                            while (i3 < i2) {
                                                w(iArr[i3], obj, pg5VarG);
                                                i3++;
                                            }
                                            if (pg5VarG != null) {
                                                ((b12) obj).unknownFields = pg5VarG;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        rg5Var = rg5Var2;
                                        iArr = iArr2;
                                        pg5VarG = pg5Var;
                                        while (i3 < i2) {
                                            w(iArr[i3], obj, pg5VarG);
                                            i3++;
                                        }
                                        if (pg5VarG != null) {
                                            rg5Var.getClass();
                                            ((b12) obj).unknownFields = pg5VarG;
                                        }
                                        throw th;
                                    }
                                } catch (fg2 unused5) {
                                    pg5Var = pg5VarG2;
                                    rg5Var = rg5Var2;
                                    iArr = iArr2;
                                    pg5VarG = pg5Var;
                                    rg5Var.getClass();
                                    if (pg5VarG == null) {
                                        pg5VarG = rg5.g(obj);
                                    }
                                    if (!rg5.y(0, si0Var, pg5VarG)) {
                                        while (i3 < i2) {
                                            w(iArr[i3], obj, pg5VarG);
                                            i3++;
                                        }
                                        if (pg5VarG != null) {
                                            ((b12) obj).unknownFields = pg5VarG;
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    pg5Var = pg5VarG2;
                                    rg5Var = rg5Var2;
                                    iArr = iArr2;
                                    pg5VarG = pg5Var;
                                    while (i3 < i2) {
                                        w(iArr[i3], obj, pg5VarG);
                                        i3++;
                                    }
                                    if (pg5VarG != null) {
                                        rg5Var.getClass();
                                        ((b12) obj).unknownFields = pg5VarG;
                                    }
                                    throw th;
                                }
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 64:
                                ih5.s(A(iM), obj, Integer.valueOf(si0Var.E()));
                                H(iV, I, obj);
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 65:
                                ih5.s(A(iM), obj, Long.valueOf(si0Var.G()));
                                H(iV, I, obj);
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 66:
                                ih5.s(A(iM), obj, Integer.valueOf(si0Var.I()));
                                H(iV, I, obj);
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 67:
                                ih5.s(A(iM), obj, Long.valueOf(si0Var.K()));
                                H(iV, I, obj);
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            case 68:
                                s0 s0Var4 = (s0) d(iV, I, obj);
                                si0Var.l(s0Var4, b(I), wm1Var);
                                K(iV, I, obj, s0Var4);
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                            default:
                                if (pg5VarG2 == null) {
                                    rg5Var2.getClass();
                                    pg5VarG2 = rg5.g(obj);
                                }
                                rg5Var2.getClass();
                                if (!rg5.y(0, si0Var, pg5VarG2)) {
                                    while (i3 < i2) {
                                        w(iArr2[i3], obj, pg5VarG2);
                                        i3++;
                                    }
                                    if (pg5VarG2 == null) {
                                        return;
                                    }
                                }
                                iArr = iArr2;
                                pg5VarG = pg5VarG2;
                                rg5Var = rg5Var2;
                                rg5Var2 = rg5Var;
                                iArr2 = iArr;
                                pg5VarG2 = pg5VarG;
                                break;
                        }
                    } catch (fg2 unused6) {
                        iArr = iArr2;
                        pg5VarG = pg5VarG2;
                        rg5Var = rg5Var2;
                    }
                } else if (iV == Integer.MAX_VALUE) {
                    while (i3 < i2) {
                        w(iArr2[i3], obj, pg5VarG2);
                        i3++;
                    }
                    if (pg5VarG2 == null) {
                        return;
                    } else {
                        rg5Var2.getClass();
                    }
                } else {
                    rg5Var2.getClass();
                    if (pg5VarG2 == null) {
                        pg5VarG2 = rg5.g(obj);
                    }
                    if (!rg5.y(0, si0Var, pg5VarG2)) {
                        while (i3 < i2) {
                            w(iArr2[i3], obj, pg5VarG2);
                            i3++;
                        }
                        if (pg5VarG2 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                iArr = iArr2;
                pg5VarG = pg5VarG2;
                rg5Var = rg5Var2;
            }
        }
        ((b12) obj).unknownFields = pg5VarG2;
    }

    public final boolean m(b12 b12Var, b12 b12Var2, int i2) {
        return s(i2, b12Var) == s(i2, b12Var2);
    }

    @Override // defpackage.le4
    public final b12 n() {
        this.a.getClass();
        return ((b12) this.v).t();
    }

    public final void o(int i2, Object obj, Object obj2) {
        if (s(i2, obj2)) {
            long jM = M(i2) & 1048575;
            Unsafe unsafe = i;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                up.r(this.g[i2], obj2);
                return;
            }
            le4 le4VarB = b(i2);
            if (!s(i2, obj)) {
                if (u(object)) {
                    b12 b12VarN = le4VarB.n();
                    le4VarB.g(b12VarN, object);
                    unsafe.putObject(obj, jM, b12VarN);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                G(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!u(object2)) {
                b12 b12VarN2 = le4VarB.n();
                le4VarB.g(b12VarN2, object2);
                unsafe.putObject(obj, jM, b12VarN2);
                object2 = b12VarN2;
            }
            le4VarB.g(object2, object);
        }
    }

    public final boolean p(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return s(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    @Override // defpackage.le4
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
            int iM = M(i7);
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
            if ((268435456 & iM) == 0 || p(obj, i7, i2, i3, i11)) {
                int iL = L(iM);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!z(i8, i7, obj) || b(i7).r(ih5.a(iM & 1048575, obj))) {
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                Object objA = ih5.a(iM & 1048575, obj);
                                this.w.getClass();
                                if (!((m13) objA).isEmpty()) {
                                    fj.w(i(i7));
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i2;
                        i5 = i3;
                    }
                    List list = (List) ih5.a(iM & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        le4 le4VarB = b(i7);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (le4VarB.r(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                } else if (!p(obj, i7, i2, i3, i11) || b(i7).r(ih5.a(iM & 1048575, obj))) {
                    i6++;
                    i4 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean s(int i2, Object obj) {
        int i3 = this.g[i2 + 2];
        long j = i3 & 1048575;
        if (j != 1048575) {
            if (((1 << (i3 >>> 20)) & ih5.j(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM = M(i2);
        long j2 = iM & 1048575;
        switch (L(iM)) {
            case 0:
                if (Double.doubleToRawLongBits(ih5.r.r(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(ih5.r.n(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (ih5.t(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (ih5.t(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (ih5.j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (ih5.t(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (ih5.j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return ih5.r.g(j2, obj);
            case 8:
                Object objA = ih5.a(j2, obj);
                if (objA instanceof String) {
                    return !((String) objA).isEmpty();
                }
                if (objA instanceof ea0) {
                    return !ea0.t.equals(objA);
                }
                t94.g();
                return false;
            case 9:
                if (ih5.a(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ea0.t.equals(ih5.a(j2, obj));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (ih5.j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (ih5.j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (ih5.j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (ih5.t(j2, obj) != 0) {
                    return true;
                }
                return false;
            case kq2.x /* 15 */:
                if (ih5.j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (ih5.t(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (ih5.a(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                t94.g();
                return false;
        }
    }

    @Override // defpackage.le4
    public final void t(Object obj, byte[] bArr, int i2, int i3, cr crVar) {
        D(obj, bArr, i2, i3, 0, crVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @Override // defpackage.le4
    public final void v(Object obj, fa4 fa4Var) {
        int i2;
        o53 o53Var = this;
        fa4Var.getClass();
        int[] iArr = o53Var.g;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iM = o53Var.M(i5);
            int i7 = iArr[i5];
            int iL = L(iM);
            Unsafe unsafe = i;
            if (iL <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j = iM & i3;
            switch (iL) {
                case 0:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.R(i7, ih5.r.r(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.a0(i7, ih5.r.n(j, obj));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.g0(i7, unsafe.getLong(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.x0(i7, unsafe.getLong(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.e0(i7, unsafe.getInt(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.Y(i7, unsafe.getLong(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.W(i7, unsafe.getInt(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.N(i7, ih5.r.g(j, obj));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            fa4Var.t0((String) object, i7);
                        } else {
                            fa4Var.P(i7, (ea0) object);
                        }
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.i0(i7, unsafe.getObject(obj, j), o53Var.b(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.P(i7, (ea0) unsafe.getObject(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.v0(i7, unsafe.getInt(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.U(i7, unsafe.getInt(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.k0(i7, unsafe.getInt(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.m0(i7, unsafe.getLong(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case kq2.x /* 15 */:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.o0(i7, unsafe.getInt(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.q0(i7, unsafe.getLong(obj, j));
                    }
                    o53Var = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (o53Var.p(obj, i5, i4, i6, i2)) {
                        fa4Var.c0(i7, unsafe.getObject(obj, j), o53Var.b(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    int i10 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = pe4.g;
                    if (list != null && !list.isEmpty()) {
                        fa4Var.S(i10, list, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    int i11 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls2 = pe4.g;
                    if (list2 != null && !list2.isEmpty()) {
                        fa4Var.b0(i11, list2, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    int i12 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = pe4.g;
                    if (list3 != null && !list3.isEmpty()) {
                        fa4Var.h0(i12, list3, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    int i13 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Class cls4 = pe4.g;
                    if (list4 != null && !list4.isEmpty()) {
                        fa4Var.y0(i13, list4, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    int i14 = iArr[i5];
                    List list5 = (List) unsafe.getObject(obj, j);
                    Class cls5 = pe4.g;
                    if (list5 != null && !list5.isEmpty()) {
                        fa4Var.f0(i14, list5, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    int i15 = iArr[i5];
                    List list6 = (List) unsafe.getObject(obj, j);
                    Class cls6 = pe4.g;
                    if (list6 != null && !list6.isEmpty()) {
                        fa4Var.Z(i15, list6, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    int i16 = iArr[i5];
                    List list7 = (List) unsafe.getObject(obj, j);
                    Class cls7 = pe4.g;
                    if (list7 != null && !list7.isEmpty()) {
                        fa4Var.X(i16, list7, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    int i17 = iArr[i5];
                    List list8 = (List) unsafe.getObject(obj, j);
                    Class cls8 = pe4.g;
                    if (list8 != null && !list8.isEmpty()) {
                        fa4Var.O(i17, list8, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    int i18 = iArr[i5];
                    List list9 = (List) unsafe.getObject(obj, j);
                    Class cls9 = pe4.g;
                    if (list9 != null && !list9.isEmpty()) {
                        fa4Var.u0(i18, list9);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    int i19 = iArr[i5];
                    List list10 = (List) unsafe.getObject(obj, j);
                    le4 le4VarB = o53Var.b(i5);
                    Class cls10 = pe4.g;
                    if (list10 != null && !list10.isEmpty()) {
                        fa4Var.j0(i19, list10, le4VarB);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    int i20 = iArr[i5];
                    List list11 = (List) unsafe.getObject(obj, j);
                    Class cls11 = pe4.g;
                    if (list11 != null && !list11.isEmpty()) {
                        fa4Var.Q(i20, list11);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    int i21 = iArr[i5];
                    List list12 = (List) unsafe.getObject(obj, j);
                    Class cls12 = pe4.g;
                    if (list12 != null && !list12.isEmpty()) {
                        fa4Var.w0(i21, list12, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    int i22 = iArr[i5];
                    List list13 = (List) unsafe.getObject(obj, j);
                    Class cls13 = pe4.g;
                    if (list13 != null && !list13.isEmpty()) {
                        fa4Var.V(i22, list13, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    int i23 = iArr[i5];
                    List list14 = (List) unsafe.getObject(obj, j);
                    Class cls14 = pe4.g;
                    if (list14 != null && !list14.isEmpty()) {
                        fa4Var.l0(i23, list14, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    int i24 = iArr[i5];
                    List list15 = (List) unsafe.getObject(obj, j);
                    Class cls15 = pe4.g;
                    if (list15 != null && !list15.isEmpty()) {
                        fa4Var.n0(i24, list15, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    int i25 = iArr[i5];
                    List list16 = (List) unsafe.getObject(obj, j);
                    Class cls16 = pe4.g;
                    if (list16 != null && !list16.isEmpty()) {
                        fa4Var.p0(i25, list16, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    int i26 = iArr[i5];
                    List list17 = (List) unsafe.getObject(obj, j);
                    Class cls17 = pe4.g;
                    if (list17 != null && !list17.isEmpty()) {
                        fa4Var.r0(i26, list17, false);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    int i27 = iArr[i5];
                    List list18 = (List) unsafe.getObject(obj, j);
                    Class cls18 = pe4.g;
                    if (list18 != null && !list18.isEmpty()) {
                        fa4Var.S(i27, list18, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    int i28 = iArr[i5];
                    List list19 = (List) unsafe.getObject(obj, j);
                    Class cls19 = pe4.g;
                    if (list19 != null && !list19.isEmpty()) {
                        fa4Var.b0(i28, list19, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    int i29 = iArr[i5];
                    List list20 = (List) unsafe.getObject(obj, j);
                    Class cls20 = pe4.g;
                    if (list20 != null && !list20.isEmpty()) {
                        fa4Var.h0(i29, list20, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    int i30 = iArr[i5];
                    List list21 = (List) unsafe.getObject(obj, j);
                    Class cls21 = pe4.g;
                    if (list21 != null && !list21.isEmpty()) {
                        fa4Var.y0(i30, list21, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    int i31 = iArr[i5];
                    List list22 = (List) unsafe.getObject(obj, j);
                    Class cls22 = pe4.g;
                    if (list22 != null && !list22.isEmpty()) {
                        fa4Var.f0(i31, list22, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    int i32 = iArr[i5];
                    List list23 = (List) unsafe.getObject(obj, j);
                    Class cls23 = pe4.g;
                    if (list23 != null && !list23.isEmpty()) {
                        fa4Var.Z(i32, list23, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    int i33 = iArr[i5];
                    List list24 = (List) unsafe.getObject(obj, j);
                    Class cls24 = pe4.g;
                    if (list24 != null && !list24.isEmpty()) {
                        fa4Var.X(i33, list24, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    int i34 = iArr[i5];
                    List list25 = (List) unsafe.getObject(obj, j);
                    Class cls25 = pe4.g;
                    if (list25 != null && !list25.isEmpty()) {
                        fa4Var.O(i34, list25, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    int i35 = iArr[i5];
                    List list26 = (List) unsafe.getObject(obj, j);
                    Class cls26 = pe4.g;
                    if (list26 != null && !list26.isEmpty()) {
                        fa4Var.w0(i35, list26, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    int i36 = iArr[i5];
                    List list27 = (List) unsafe.getObject(obj, j);
                    Class cls27 = pe4.g;
                    if (list27 != null && !list27.isEmpty()) {
                        fa4Var.V(i36, list27, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    int i37 = iArr[i5];
                    List list28 = (List) unsafe.getObject(obj, j);
                    Class cls28 = pe4.g;
                    if (list28 != null && !list28.isEmpty()) {
                        fa4Var.l0(i37, list28, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    int i38 = iArr[i5];
                    List list29 = (List) unsafe.getObject(obj, j);
                    Class cls29 = pe4.g;
                    if (list29 != null && !list29.isEmpty()) {
                        fa4Var.n0(i38, list29, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    int i39 = iArr[i5];
                    List list30 = (List) unsafe.getObject(obj, j);
                    Class cls30 = pe4.g;
                    if (list30 != null && !list30.isEmpty()) {
                        fa4Var.p0(i39, list30, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case kq2.l /* 48 */:
                    int i40 = iArr[i5];
                    List list31 = (List) unsafe.getObject(obj, j);
                    Class cls31 = pe4.g;
                    if (list31 != null && !list31.isEmpty()) {
                        fa4Var.r0(i40, list31, true);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    int i41 = iArr[i5];
                    List list32 = (List) unsafe.getObject(obj, j);
                    le4 le4VarB2 = o53Var.b(i5);
                    Class cls32 = pe4.g;
                    if (list32 != null && !list32.isEmpty()) {
                        fa4Var.d0(i41, list32, le4VarB2);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objI = o53Var.i(i5);
                        o53Var.w.getClass();
                        fj.w(objI);
                        throw null;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.R(i7, ((Double) ih5.a(j, obj)).doubleValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.a0(i7, ((Float) ih5.a(j, obj)).floatValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.g0(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.x0(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.e0(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.Y(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.W(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.N(i7, ((Boolean) ih5.a(j, obj)).booleanValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (o53Var.z(i7, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            fa4Var.t0((String) object2, i7);
                        } else {
                            fa4Var.P(i7, (ea0) object2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.i0(i7, unsafe.getObject(obj, j), o53Var.b(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.P(i7, (ea0) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.v0(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.U(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.k0(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.m0(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.o0(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.q0(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (o53Var.z(i7, i5, obj)) {
                        fa4Var.c0(i7, unsafe.getObject(obj, j), o53Var.b(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i5 += 3;
                    i3 = 1048575;
                    break;
            }
        }
        o53Var.q.getClass();
        ((b12) obj).unknownFields.v(fa4Var);
    }

    public final void w(int i2, Object obj, Object obj2) {
        int i3 = this.g[i2];
        if (ih5.a(M(i2) & 1048575, obj) == null) {
            return;
        }
        c(i2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.le4
    public final int x(b12 b12Var) {
        int i2;
        int iY;
        int i3;
        int[] iArr = this.g;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iM = M(i5);
            int i6 = iArr[i5];
            long j = 1048575 & iM;
            int i7 = 1237;
            int iHashCode = 37;
            switch (L(iM)) {
                case 0:
                    i2 = i4 * 53;
                    iY = ff2.y(Double.doubleToLongBits(ih5.r.r(j, b12Var)));
                    i4 = iY + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iY = Float.floatToIntBits(ih5.r.n(j, b12Var));
                    i4 = iY + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    iY = ff2.y(ih5.t(j, b12Var));
                    i4 = iY + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    iY = ff2.y(ih5.t(j, b12Var));
                    i4 = iY + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    iY = ih5.j(j, b12Var);
                    i4 = iY + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    iY = ff2.y(ih5.t(j, b12Var));
                    i4 = iY + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    iY = ih5.j(j, b12Var);
                    i4 = iY + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    boolean zG = ih5.r.g(j, b12Var);
                    Charset charset = ff2.g;
                    if (zG) {
                        i7 = 1231;
                    }
                    i4 = i7 + i3;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iY = ((String) ih5.a(j, b12Var)).hashCode();
                    i4 = iY + i2;
                    break;
                case 9:
                    Object objA = ih5.a(j, b12Var);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iY = ih5.a(j, b12Var).hashCode();
                    i4 = iY + i2;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    i2 = i4 * 53;
                    iY = ih5.j(j, b12Var);
                    i4 = iY + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iY = ih5.j(j, b12Var);
                    i4 = iY + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iY = ih5.j(j, b12Var);
                    i4 = iY + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    iY = ff2.y(ih5.t(j, b12Var));
                    i4 = iY + i2;
                    break;
                case kq2.x /* 15 */:
                    i2 = i4 * 53;
                    iY = ih5.j(j, b12Var);
                    i4 = iY + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    iY = ff2.y(ih5.t(j, b12Var));
                    i4 = iY + i2;
                    break;
                case 17:
                    Object objA2 = ih5.a(j, b12Var);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
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
                    iY = ih5.a(j, b12Var).hashCode();
                    i4 = iY + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iY = ih5.a(j, b12Var).hashCode();
                    i4 = iY + i2;
                    break;
                case 51:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ff2.y(Double.doubleToLongBits(((Double) ih5.a(j, b12Var)).doubleValue()));
                        i4 = iY + i2;
                    }
                    break;
                case 52:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = Float.floatToIntBits(((Float) ih5.a(j, b12Var)).floatValue());
                        i4 = iY + i2;
                    }
                    break;
                case 53:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ff2.y(C(j, b12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 54:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ff2.y(C(j, b12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 55:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = B(j, b12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 56:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ff2.y(C(j, b12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 57:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = B(j, b12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 58:
                    if (z(i6, i5, b12Var)) {
                        i3 = i4 * 53;
                        boolean zBooleanValue = ((Boolean) ih5.a(j, b12Var)).booleanValue();
                        Charset charset2 = ff2.g;
                        if (zBooleanValue) {
                            i7 = 1231;
                        }
                        i4 = i7 + i3;
                    }
                    break;
                case 59:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ((String) ih5.a(j, b12Var)).hashCode();
                        i4 = iY + i2;
                    }
                    break;
                case 60:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ih5.a(j, b12Var).hashCode();
                        i4 = iY + i2;
                    }
                    break;
                case 61:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ih5.a(j, b12Var).hashCode();
                        i4 = iY + i2;
                    }
                    break;
                case 62:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = B(j, b12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 63:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = B(j, b12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 64:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = B(j, b12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 65:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ff2.y(C(j, b12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 66:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = B(j, b12Var);
                        i4 = iY + i2;
                    }
                    break;
                case 67:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ff2.y(C(j, b12Var));
                        i4 = iY + i2;
                    }
                    break;
                case 68:
                    if (z(i6, i5, b12Var)) {
                        i2 = i4 * 53;
                        iY = ih5.a(j, b12Var).hashCode();
                        i4 = iY + i2;
                    }
                    break;
            }
        }
        this.q.getClass();
        return b12Var.unknownFields.hashCode() + (i4 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e A[SYNTHETIC] */
    @Override // defpackage.le4
    public final void y(Object obj) {
        if (u(obj)) {
            if (obj instanceof b12) {
                b12 b12Var = (b12) obj;
                b12Var.m(Integer.MAX_VALUE);
                b12Var.memoizedHashCode = 0;
                b12Var.j();
            }
            int[] iArr = this.g;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iM = M(i2);
                long j = 1048575 & iM;
                int iL = L(iM);
                Unsafe unsafe = i;
                if (iL != 9) {
                    if (iL != 60 && iL != 68) {
                        switch (iL) {
                            case 17:
                                if (s(i2, obj)) {
                                    b(i2).y(unsafe.getObject(obj, j));
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
                                a1 a1Var = (a1) ((df2) ih5.a(j, obj));
                                if (a1Var.j) {
                                    a1Var.j = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.w.getClass();
                                    ((m13) object).v();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (z(iArr[i2], i2, obj)) {
                        b(i2).y(unsafe.getObject(obj, j));
                    }
                } else if (s(i2, obj)) {
                    b(i2).y(unsafe.getObject(obj, j));
                }
            }
            this.q.getClass();
            pg5 pg5Var = ((b12) obj).unknownFields;
            if (pg5Var.v) {
                pg5Var.v = false;
            }
        }
    }

    public final boolean z(int i2, int i3, Object obj) {
        return ih5.j((long) (this.g[i3 + 2] & 1048575), obj) == i2;
    }
}
