package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class l96 {
    public static final l96 r = new l96();
    public final ConcurrentHashMap y = new ConcurrentHashMap();
    public final q64 g = new q64((byte) 2);

    /* JADX WARN: Code duplicated, block: B:143:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:149:0x0300  */
    /* JADX WARN: Code duplicated, block: B:189:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:204:0x041d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0427  */
    /* JADX WARN: Code duplicated, block: B:210:0x043a  */
    public final r96 g(Class cls) {
        r96 r96VarA;
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldB;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldB2;
        int i28;
        Object obj2;
        Field fieldB3;
        int i29;
        char cCharAt10;
        int i30;
        int i31;
        char cCharAt11;
        int i32;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        Charset charset = m76.g;
        if (cls == null) {
            l0.q("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.y;
        r96 r96Var = (r96) concurrentHashMap.get(cls);
        if (r96Var != null) {
            return r96Var;
        }
        d52 d52Var = u96.g;
        if (!y66.class.isAssignableFrom(cls)) {
            int i35 = z46.g;
        }
        p96 p96VarT = ((jy3) this.g.t).t(cls);
        int i36 = 0;
        if ((p96VarT.n & 2) == 2) {
            int i37 = z46.g;
            d52 d52Var2 = u96.g;
            d93 d93Var = l66.g;
            r96VarA = g96.a(d52Var2, p96VarT.g);
        } else {
            int i38 = z46.g;
            int i39 = j96.g;
            int i40 = b86.g;
            d52 d52Var3 = u96.g;
            d93 d93Var2 = p96VarT.g() + (-1) != 1 ? l66.g : null;
            int i41 = p86.g;
            int[] iArr2 = e96.a;
            if (!(p96VarT instanceof p96)) {
                uo1.B();
                return null;
            }
            String str = p96VarT.y;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i42 = 1;
                while (true) {
                    i = i42 + 1;
                    if (str.charAt(i42) < 55296) {
                        break;
                    }
                    i42 = i;
                }
            } else {
                i = 1;
            }
            int i43 = i + 1;
            int iCharAt4 = str.charAt(i);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i34 = i43 + 1;
                    cCharAt13 = str.charAt(i43);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt13 & 8191) << i45;
                    i45 += 13;
                    i43 = i34;
                }
                iCharAt4 = i44 | (cCharAt13 << i45);
                i43 = i34;
            }
            if (iCharAt4 == 0) {
                i4 = 0;
                iCharAt = 0;
                iCharAt2 = 0;
                iCharAt3 = 0;
                i5 = 0;
                iArr = e96.a;
                i3 = 0;
            } else {
                int i46 = i43 + 1;
                int iCharAt5 = str.charAt(i43);
                if (iCharAt5 >= 55296) {
                    int i47 = iCharAt5 & 8191;
                    int i48 = 13;
                    while (true) {
                        i13 = i46 + 1;
                        cCharAt8 = str.charAt(i46);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i47 |= (cCharAt8 & 8191) << i48;
                        i48 += 13;
                        i46 = i13;
                    }
                    iCharAt5 = i47 | (cCharAt8 << i48);
                    i46 = i13;
                }
                int i49 = i46 + 1;
                int iCharAt6 = str.charAt(i46);
                if (iCharAt6 >= 55296) {
                    int i50 = iCharAt6 & 8191;
                    int i51 = 13;
                    while (true) {
                        i12 = i49 + 1;
                        cCharAt7 = str.charAt(i49);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt7 & 8191) << i51;
                        i51 += 13;
                        i49 = i12;
                    }
                    iCharAt6 = i50 | (cCharAt7 << i51);
                    i49 = i12;
                }
                int i52 = i49 + 1;
                iCharAt = str.charAt(i49);
                if (iCharAt >= 55296) {
                    int i53 = iCharAt & 8191;
                    int i54 = 13;
                    while (true) {
                        i11 = i52 + 1;
                        cCharAt6 = str.charAt(i52);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt6 & 8191) << i54;
                        i54 += 13;
                        i52 = i11;
                    }
                    iCharAt = i53 | (cCharAt6 << i54);
                    i52 = i11;
                }
                int i55 = i52 + 1;
                iCharAt2 = str.charAt(i52);
                if (iCharAt2 >= 55296) {
                    int i56 = iCharAt2 & 8191;
                    int i57 = 13;
                    while (true) {
                        i10 = i55 + 1;
                        cCharAt5 = str.charAt(i55);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i56 |= (cCharAt5 & 8191) << i57;
                        i57 += 13;
                        i55 = i10;
                    }
                    iCharAt2 = i56 | (cCharAt5 << i57);
                    i55 = i10;
                }
                int i58 = i55 + 1;
                iCharAt3 = str.charAt(i55);
                if (iCharAt3 >= 55296) {
                    int i59 = iCharAt3 & 8191;
                    int i60 = 13;
                    while (true) {
                        i9 = i58 + 1;
                        cCharAt4 = str.charAt(i58);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i59 |= (cCharAt4 & 8191) << i60;
                        i60 += 13;
                        i58 = i9;
                    }
                    iCharAt3 = i59 | (cCharAt4 << i60);
                    i58 = i9;
                }
                int i61 = i58 + 1;
                int iCharAt7 = str.charAt(i58);
                if (iCharAt7 >= 55296) {
                    int i62 = iCharAt7 & 8191;
                    int i63 = 13;
                    while (true) {
                        i8 = i61 + 1;
                        cCharAt3 = str.charAt(i61);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i62 |= (cCharAt3 & 8191) << i63;
                        i63 += 13;
                        i61 = i8;
                    }
                    iCharAt7 = i62 | (cCharAt3 << i63);
                    i61 = i8;
                }
                int i64 = i61 + 1;
                int iCharAt8 = str.charAt(i61);
                if (iCharAt8 >= 55296) {
                    int i65 = iCharAt8 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i7 = i66 + 1;
                        cCharAt2 = str.charAt(i66);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i65 |= (cCharAt2 & 8191) << i67;
                        i67 += 13;
                        i66 = i7;
                    }
                    iCharAt8 = i65 | (cCharAt2 << i67);
                    i2 = i7;
                } else {
                    i2 = i64;
                }
                int i68 = i2 + 1;
                int iCharAt9 = str.charAt(i2);
                if (iCharAt9 >= 55296) {
                    int i69 = iCharAt9 & 8191;
                    int i70 = i68;
                    int i71 = 13;
                    while (true) {
                        i6 = i70 + 1;
                        cCharAt = str.charAt(i70);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i69 |= (cCharAt & 8191) << i71;
                        i71 += 13;
                        i70 = i6;
                    }
                    iCharAt9 = i69 | (cCharAt << i71);
                    i68 = i6;
                }
                int i72 = iCharAt9 + iCharAt7 + iCharAt8;
                int i73 = iCharAt5 + iCharAt5 + iCharAt6;
                int[] iArr3 = new int[i72];
                int i74 = iCharAt7;
                iArr = iArr3;
                i3 = i74;
                i4 = i73;
                i5 = iCharAt9;
                i36 = iCharAt5;
                i43 = i68;
            }
            Unsafe unsafe = e96.m;
            Object[] objArr2 = p96VarT.r;
            int i75 = i43;
            Class<?> cls2 = p96VarT.g.getClass();
            int i76 = i3 + i5;
            int i77 = i36;
            int i78 = iCharAt3 + iCharAt3;
            int[] iArr4 = new int[iCharAt3 * 3];
            Object[] objArr3 = new Object[i78];
            int i79 = i4;
            int i80 = i75;
            int i81 = i76;
            int i82 = i5;
            int i83 = 0;
            int i84 = 0;
            while (i80 < length) {
                int i85 = i80 + 1;
                int iCharAt10 = str.charAt(i80);
                int i86 = length;
                if (iCharAt10 >= 55296) {
                    int i87 = iCharAt10 & 8191;
                    int i88 = i85;
                    int i89 = 13;
                    while (true) {
                        i33 = i88 + 1;
                        cCharAt12 = str.charAt(i88);
                        objArr = objArr3;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i87 |= (cCharAt12 & 8191) << i89;
                        i89 += 13;
                        i88 = i33;
                        objArr3 = objArr;
                    }
                    iCharAt10 = i87 | (cCharAt12 << i89);
                    i14 = i33;
                } else {
                    objArr = objArr3;
                    i14 = i85;
                }
                int i90 = i14 + 1;
                int iCharAt11 = str.charAt(i14);
                if (iCharAt11 >= 55296) {
                    int i91 = iCharAt11 & 8191;
                    int i92 = i90;
                    int i93 = 13;
                    while (true) {
                        i31 = i92 + 1;
                        cCharAt11 = str.charAt(i92);
                        i32 = i91;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i91 = i32 | ((cCharAt11 & 8191) << i93);
                        i93 += 13;
                        i92 = i31;
                    }
                    iCharAt11 = i32 | (cCharAt11 << i93);
                    i15 = i31;
                } else {
                    i15 = i90;
                }
                Object[] objArr4 = objArr2;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i83] = i84;
                    i83++;
                }
                int i94 = iCharAt11 & 255;
                int i95 = i76;
                int i96 = iCharAt11 & 2048;
                if (i94 >= 51) {
                    int i97 = i15 + 1;
                    int iCharAt12 = str.charAt(i15);
                    if (iCharAt12 >= 55296) {
                        int i98 = iCharAt12 & 8191;
                        int i99 = i97;
                        int i100 = 13;
                        while (true) {
                            i29 = i99 + 1;
                            cCharAt10 = str.charAt(i99);
                            i30 = i98;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i98 = i30 | ((cCharAt10 & 8191) << i100);
                            i100 += 13;
                            i99 = i29;
                        }
                        iCharAt12 = i30 | (cCharAt10 << i100);
                        i24 = i29;
                    } else {
                        i24 = i97;
                    }
                    int i101 = iCharAt12;
                    int i102 = i94 - 51;
                    int i103 = i24;
                    if (i102 == 9 || i102 == 17) {
                        i25 = i79 + 1;
                        int i104 = i84 / 3;
                        objArr[i104 + i104 + 1] = objArr4[i79];
                    } else {
                        if (i102 != 12) {
                            i26 = i96;
                        } else if (p96VarT.g() == 1 || i96 != 0) {
                            i25 = i79 + 1;
                            int i105 = i84 / 3;
                            objArr[i105 + i105 + 1] = objArr4[i79];
                        } else {
                            i26 = 0;
                        }
                        i27 = i101 + i101;
                        obj = objArr4[i27];
                        i22 = i26;
                        if (obj instanceof Field) {
                            fieldB2 = (Field) obj;
                        } else {
                            fieldB2 = e96.B(cls2, (String) obj);
                            objArr4[i27] = fieldB2;
                        }
                        i16 = iCharAt10;
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldB2);
                        i28 = i27 + 1;
                        obj2 = objArr4[i28];
                        if (obj2 instanceof Field) {
                            fieldB3 = (Field) obj2;
                        } else {
                            fieldB3 = e96.B(cls2, (String) obj2);
                            objArr4[i28] = fieldB3;
                        }
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldB3);
                        iCharAt = iCharAt;
                        iCharAt2 = iCharAt2;
                        i80 = i103;
                        i20 = 0;
                        iObjectFieldOffset2 = iObjectFieldOffset4;
                        i21 = iObjectFieldOffset3;
                    }
                    i79 = i25;
                    i26 = i96;
                    i27 = i101 + i101;
                    obj = objArr4[i27];
                    i22 = i26;
                    if (obj instanceof Field) {
                        fieldB2 = (Field) obj;
                    } else {
                        fieldB2 = e96.B(cls2, (String) obj);
                        objArr4[i27] = fieldB2;
                    }
                    i16 = iCharAt10;
                    int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldB2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldB3 = (Field) obj2;
                    } else {
                        fieldB3 = e96.B(cls2, (String) obj2);
                        objArr4[i28] = fieldB3;
                    }
                    int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldB3);
                    iCharAt = iCharAt;
                    iCharAt2 = iCharAt2;
                    i80 = i103;
                    i20 = 0;
                    iObjectFieldOffset2 = iObjectFieldOffset6;
                    i21 = iObjectFieldOffset5;
                } else {
                    i16 = iCharAt10;
                    int i106 = i79 + 1;
                    Field fieldB4 = e96.B(cls2, (String) objArr4[i79]);
                    if (i94 == 9 || i94 == 17) {
                        int i107 = i84 / 3;
                        objArr[i107 + i107 + 1] = fieldB4.getType();
                    } else {
                        if (i94 != 27) {
                            if (i94 == 49) {
                                i79 += 2;
                                i23 = 1;
                            } else if (i94 == 12 || i94 == 30 || i94 == 44) {
                                iCharAt = iCharAt;
                                if (p96VarT.g() == 1 || i96 != 0) {
                                    i79 += 2;
                                    int i108 = i84 / 3;
                                    objArr[i108 + i108 + 1] = objArr4[i106];
                                    iCharAt2 = iCharAt2;
                                    i17 = i96;
                                } else {
                                    iCharAt2 = iCharAt2;
                                    i79 = i106;
                                    i17 = 0;
                                }
                            } else if (i94 == 50) {
                                int i109 = i79 + 2;
                                i82++;
                                iArr[i82] = i84;
                                int i110 = i84 / 3;
                                int i111 = i110 + i110;
                                objArr[i111] = objArr4[i106];
                                if (i96 != 0) {
                                    i79 += 3;
                                    objArr[i111 + 1] = objArr4[i109];
                                    i17 = i96;
                                } else {
                                    i79 = i109;
                                    i17 = 0;
                                }
                                iCharAt = iCharAt;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt11 & 4096) != 0 || i94 > 17) {
                                i18 = i15;
                                i19 = 0;
                            } else {
                                int i112 = i15 + 1;
                                int iCharAt13 = str.charAt(i15);
                                if (iCharAt13 >= 55296) {
                                    int i113 = iCharAt13 & 8191;
                                    int i114 = 13;
                                    while (true) {
                                        i18 = i112 + 1;
                                        cCharAt9 = str.charAt(i112);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i113 |= (cCharAt9 & 8191) << i114;
                                        i114 += 13;
                                        i112 = i18;
                                    }
                                    iCharAt13 = i113 | (cCharAt9 << i114);
                                } else {
                                    i18 = i112;
                                }
                                int i115 = (iCharAt13 / 32) + i77 + i77;
                                Object obj3 = objArr4[i115];
                                if (obj3 instanceof Field) {
                                    fieldB = (Field) obj3;
                                } else {
                                    fieldB = e96.B(cls2, (String) obj3);
                                    objArr4[i115] = fieldB;
                                }
                                i19 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB);
                            }
                            if (i94 >= 18 || i94 > 49) {
                                int i116 = i17;
                                i20 = i19;
                                i21 = iObjectFieldOffset;
                                i80 = i18;
                                i22 = i116;
                            } else {
                                int i117 = i81 + 1;
                                iArr[i81] = iObjectFieldOffset;
                                int i118 = i17;
                                i20 = i19;
                                i21 = iObjectFieldOffset;
                                i80 = i18;
                                i22 = i118;
                                i81 = i117;
                            }
                        } else {
                            i23 = 1;
                            i79 += 2;
                        }
                        int i119 = i84 / 3;
                        objArr[i119 + i119 + i23] = objArr4[i106];
                        iCharAt2 = iCharAt2;
                        i17 = i96;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0) {
                            i18 = i15;
                            i19 = 0;
                        } else {
                            i18 = i15;
                            i19 = 0;
                        }
                        if (i94 >= 18) {
                            int i1110 = i17;
                            i20 = i19;
                            i21 = iObjectFieldOffset;
                            i80 = i18;
                            i22 = i1110;
                        } else {
                            int i1111 = i17;
                            i20 = i19;
                            i21 = iObjectFieldOffset;
                            i80 = i18;
                            i22 = i1111;
                        }
                    }
                    iCharAt2 = iCharAt2;
                    i17 = i96;
                    i79 = i106;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i18 = i15;
                        i19 = 0;
                    } else {
                        i18 = i15;
                        i19 = 0;
                    }
                    if (i94 >= 18) {
                        int i1112 = i17;
                        i20 = i19;
                        i21 = iObjectFieldOffset;
                        i80 = i18;
                        i22 = i1112;
                    } else {
                        int i1113 = i17;
                        i20 = i19;
                        i21 = iObjectFieldOffset;
                        i80 = i18;
                        i22 = i1113;
                    }
                }
                int i120 = i84 + 1;
                iArr4[i84] = i16;
                int i121 = i84 + 2;
                String str2 = str;
                iArr4[i120] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i22 != 0 ? Integer.MIN_VALUE : 0) | (i94 << 20) | i21;
                i84 += 3;
                iArr4[i121] = (i20 << 20) | iObjectFieldOffset2;
                iCharAt2 = iCharAt2;
                objArr2 = objArr4;
                length = i86;
                i76 = i95;
                objArr3 = objArr;
                iCharAt = iCharAt;
                str = str2;
            }
            r96VarA = new e96(iArr4, objArr3, iCharAt, iCharAt2, p96VarT.g, iArr, i5, i76, d52Var3, d93Var2);
        }
        r96 r96Var2 = (r96) concurrentHashMap.putIfAbsent(cls, r96VarA);
        return r96Var2 != null ? r96Var2 : r96VarA;
    }
}
