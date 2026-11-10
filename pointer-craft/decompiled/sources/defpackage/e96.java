package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class e96 implements r96 {
    public static final int[] a = new int[0];
    public static final Unsafe m = va6.j();
    public final int[] g;
    public final int j;
    public final int l;
    public final int n;
    public final int r;
    public final d52 t;
    public final v46 v;
    public final int[] x;
    public final Object[] y;

    public e96(int[] iArr, Object[] objArr, int i, int i2, v46 v46Var, int[] iArr2, int i3, int i4, d52 d52Var, d93 d93Var) {
        this.g = iArr;
        this.y = objArr;
        this.r = i;
        this.n = i2;
        this.x = iArr2;
        this.l = i3;
        this.j = i4;
        this.t = d52Var;
        this.v = v46Var;
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbZ = du4.z("Field ", str, " for ", name, " not found. Known fields are ");
            sbZ.append(string);
            throw new RuntimeException(sbZ.toString(), e);
        }
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y66) {
            return ((y66) obj).j();
        }
        return true;
    }

    public static long f(long j, Object obj) {
        return ((Long) va6.l(j, obj)).longValue();
    }

    public static int h(int i) {
        return (i >>> 20) & 255;
    }

    public static int u(long j, Object obj) {
        return ((Integer) va6.l(j, obj)).intValue();
    }

    public final Object A(int i, int i2, Object obj) {
        r96 r96VarD = d(i2);
        if (!s(i, i2, obj)) {
            return r96VarD.x();
        }
        Object object = m.getObject(obj, o(i2) & 1048575);
        if (b(object)) {
            return object;
        }
        y66 y66VarX = r96VarD.x();
        if (object != null) {
            r96VarD.y(y66VarX, object);
        }
        return y66VarX;
    }

    public final void a(int i, Object obj, Object obj2) {
        if (c(i, obj2)) {
            long jO = o(i) & 1048575;
            Unsafe unsafe = m;
            Object object = unsafe.getObject(obj2, jO);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.g[i] + " is present but null: " + obj2.toString());
            }
            r96 r96VarD = d(i);
            if (!c(i, obj)) {
                if (b(object)) {
                    y66 y66VarX = r96VarD.x();
                    r96VarD.y(y66VarX, object);
                    unsafe.putObject(obj, jO, y66VarX);
                } else {
                    unsafe.putObject(obj, jO, object);
                }
                q(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jO);
            if (!b(object2)) {
                y66 y66VarX2 = r96VarD.x();
                r96VarD.y(y66VarX2, object2);
                unsafe.putObject(obj, jO, y66VarX2);
                object2 = y66VarX2;
            }
            r96VarD.y(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean c(int i, Object obj) {
        int i2 = this.g[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & va6.v(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iO = o(i);
        long j2 = iO & 1048575;
        switch (h(iO)) {
            case 0:
                if (Double.doubleToRawLongBits(va6.r.m(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(va6.r.q(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (va6.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (va6.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (va6.v(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (va6.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (va6.v(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return va6.r.s(j2, obj);
            case 8:
                Object objL = va6.l(j2, obj);
                if (objL instanceof String) {
                    if (((String) objL).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objL instanceof l56)) {
                    t94.g();
                    return false;
                }
                if (l56.t.equals(objL)) {
                    return false;
                }
                return true;
            case 9:
                if (va6.l(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (l56.t.equals(va6.l(j2, obj))) {
                    return false;
                }
                return true;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (va6.v(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (va6.v(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (va6.v(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (va6.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case kq2.x /* 15 */:
                if (va6.v(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (va6.x(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (va6.l(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                t94.g();
                return false;
        }
    }

    public final r96 d(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.y;
        r96 r96Var = (r96) objArr[i3];
        if (r96Var != null) {
            return r96Var;
        }
        r96 r96VarG = l96.r.g((Class) objArr[i3 + 1]);
        objArr[i3] = r96VarG;
        return r96VarG;
    }

    public final Object e(int i, Object obj) {
        r96 r96VarD = d(i);
        int iO = o(i) & 1048575;
        if (!c(i, obj)) {
            return r96VarD.x();
        }
        Object object = m.getObject(obj, iO);
        if (b(object)) {
            return object;
        }
        y66 y66VarX = r96VarD.x();
        if (object != null) {
            r96VarD.y(y66VarX, object);
        }
        return y66VarX;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[SYNTHETIC] */
    @Override // defpackage.r96
    public final void g(Object obj) {
        if (!b(obj)) {
            return;
        }
        if (obj instanceof y66) {
            y66 y66Var = (y66) obj;
            y66Var.l();
            y66Var.zza = 0;
            y66Var.v();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.g;
            if (i >= iArr.length) {
                this.t.getClass();
                na6 na6Var = ((y66) obj).zzc;
                if (na6Var.v) {
                    na6Var.v = false;
                    return;
                }
                return;
            }
            int iO = o(i);
            int i2 = 1048575 & iO;
            int iH = h(iO);
            long j = i2;
            Unsafe unsafe = m;
            if (iH != 9) {
                if (iH != 60 && iH != 68) {
                    switch (iH) {
                        case 17:
                            if (c(i, obj)) {
                                d(i).g(unsafe.getObject(obj, j));
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
                            ((x46) ((h76) va6.l(j, obj))).y();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((m86) object).r();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (s(iArr[i], i, obj)) {
                    d(i).g(unsafe.getObject(obj, j));
                }
            } else if (c(i, obj)) {
                d(i).g(unsafe.getObject(obj, j));
            }
            i += 3;
        }
    }

    public final boolean i(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return c(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0366  */
    /* JADX WARN: Code duplicated, block: B:192:0x0488  */
    /* JADX WARN: Code duplicated, block: B:224:0x0579  */
    /* JADX WARN: Code duplicated, block: B:227:0x0587  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // defpackage.r96
    public final int j(v46 v46Var) {
        int i;
        int iC;
        int i2;
        int iC2;
        int iY;
        int iC3;
        int iR;
        int i3;
        int iC4;
        int iT;
        int i4;
        int iR2;
        int iC5;
        int size;
        int i5;
        int iC6;
        int iC7;
        int iC8;
        int size2;
        int iC9;
        int iR3;
        int iC10;
        int i6;
        int iC11;
        int iY2;
        int iU;
        int iC12;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int iR4 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i9 >= iArr.length) {
                return ((y66) v46Var).zzc.g() + iR4;
            }
            int iO = o(i9);
            int iH = h(iO);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i7;
            Unsafe unsafe = m;
            if (iH <= 17) {
                if (i13 != i8) {
                    i10 = i13 == i7 ? 0 : unsafe.getInt(v46Var, i13);
                    i8 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = iO & i7;
            if (iH >= p66.t.j) {
                byte b = p66.a.j;
            }
            long j = i14;
            switch (iH) {
                case 0:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 8, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 1:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 2:
                    if (i(v46Var, i9, i8, i10, i)) {
                        long j2 = unsafe.getLong(v46Var, j);
                        iC = u56.c(i11 << 3);
                        i2 = u56.i(j2);
                        iT = i2 + iC;
                        iR4 += iT;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 3:
                    if (i(v46Var, i9, i8, i10, i)) {
                        long j3 = unsafe.getLong(v46Var, j);
                        iC = u56.c(i11 << 3);
                        i2 = u56.i(j3);
                        iT = i2 + iC;
                        iR4 += iT;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 4:
                    if (i(v46Var, i9, i8, i10, i)) {
                        long j4 = unsafe.getInt(v46Var, j);
                        iC = u56.c(i11 << 3);
                        i2 = u56.i(j4);
                        iT = i2 + iC;
                        iR4 += iT;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 5:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 8, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 6:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 7:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 1, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 8:
                    if (i(v46Var, i9, i8, i10, i)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(v46Var, j);
                        if (object instanceof l56) {
                            iC2 = u56.c(i15);
                            iY = ((l56) object).v();
                        } else {
                            iC2 = u56.c(i15);
                            iY = cb6.y((String) object);
                        }
                        iR4 = xi3.n(iY, iY, iC2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 9:
                    if (i(v46Var, i9, i8, i10, i)) {
                        Object object2 = unsafe.getObject(v46Var, j);
                        r96 r96VarD = d(i9);
                        d52 d52Var = u96.g;
                        iC3 = u56.c(i11 << 3);
                        iR = ((v46) object2).r(r96VarD);
                        iR4 = xi3.n(iR, iR, iC3, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 10:
                    if (i(v46Var, i9, i8, i10, i)) {
                        l56 l56Var = (l56) unsafe.getObject(v46Var, j);
                        iC2 = u56.c(i11 << 3);
                        iY = l56Var.v();
                        iR4 = xi3.n(iY, iY, iC2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (i(v46Var, i9, i8, i10, i)) {
                        i3 = unsafe.getInt(v46Var, j);
                        iC4 = u56.c(i11 << 3);
                        iR4 = xi3.r(i3, iC4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 12:
                    if (i(v46Var, i9, i8, i10, i)) {
                        long j5 = unsafe.getInt(v46Var, j);
                        iC = u56.c(i11 << 3);
                        i2 = u56.i(j5);
                        iT = i2 + iC;
                        iR4 += iT;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 13:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 14:
                    if (i(v46Var, i9, i8, i10, i)) {
                        iR4 = xi3.r(i11 << 3, 8, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case kq2.x /* 15 */:
                    if (i(v46Var, i9, i8, i10, i)) {
                        int i16 = unsafe.getInt(v46Var, j);
                        iC4 = u56.c(i11 << 3);
                        i3 = (i16 >> 31) ^ (i16 + i16);
                        iR4 = xi3.r(i3, iC4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 16:
                    if (i(v46Var, i9, i8, i10, i)) {
                        long j6 = unsafe.getLong(v46Var, j);
                        iC = u56.c(i11 << 3);
                        i2 = u56.i((j6 >> 63) ^ (j6 + j6));
                        iT = i2 + iC;
                        iR4 += iT;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 17:
                    if (i(v46Var, i9, i8, i10, i)) {
                        v46 v46Var2 = (v46) unsafe.getObject(v46Var, j);
                        r96 r96VarD2 = d(i9);
                        d52 d52Var2 = u96.g;
                        int iC13 = u56.c(i11 << 3);
                        i4 = iC13 + iC13;
                        iR2 = v46Var2.r(r96VarD2);
                        iT = iR2 + i4;
                        iR4 += iT;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 18:
                    iT = u96.t(i11, (List) unsafe.getObject(v46Var, j));
                    iR4 += iT;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 19:
                    iT = u96.j(i11, (List) unsafe.getObject(v46Var, j));
                    iR4 += iT;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var3 = u96.g;
                    if (list.size() == 0) {
                        iC5 = 0;
                    } else {
                        iC5 = (u56.c(i11 << 3) * list.size()) + u96.m(list);
                    }
                    iR4 += iC5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var4 = u96.g;
                    size = list2.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i5 = u96.i(list2);
                        iC6 = u56.c(i11 << 3);
                        iC7 = (iC6 * size) + i5;
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var5 = u96.g;
                    size = list3.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i5 = u96.a(list3);
                        iC6 = u56.c(i11 << 3);
                        iC7 = (iC6 * size) + i5;
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 23:
                    iT = u96.t(i11, (List) unsafe.getObject(v46Var, j));
                    iR4 += iT;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 24:
                    iT = u96.j(i11, (List) unsafe.getObject(v46Var, j));
                    iR4 += iT;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var6 = u96.g;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iC5 = 0;
                    } else {
                        iC5 = (u56.c(i11 << 3) + 1) * size3;
                    }
                    iR4 += iC5;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var7 = u96.g;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iC7 = 0;
                    } else {
                        iC7 = u56.c(i11 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj = list5.get(i17);
                            int iV = obj instanceof l56 ? ((l56) obj).v() : cb6.y((String) obj);
                            iC7 = xi3.r(iV, iV, iC7);
                        }
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(v46Var, j);
                    r96 r96VarD3 = d(i9);
                    d52 d52Var8 = u96.g;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iC8 = 0;
                    } else {
                        iC8 = u56.c(i11 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int iR5 = ((v46) list6.get(i18)).r(r96VarD3);
                            iC8 = xi3.r(iR5, iR5, iC8);
                        }
                    }
                    iR4 += iC8;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var9 = u96.g;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iC7 = 0;
                    } else {
                        iC7 = u56.c(i11 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iV2 = ((l56) list7.get(i19)).v();
                            iC7 = xi3.r(iV2, iV2, iC7);
                        }
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var10 = u96.g;
                    size = list8.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i5 = u96.c(list8);
                        iC6 = u56.c(i11 << 3);
                        iC7 = (iC6 * size) + i5;
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var11 = u96.g;
                    size = list9.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i5 = u96.l(list9);
                        iC6 = u56.c(i11 << 3);
                        iC7 = (iC6 * size) + i5;
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 31:
                    iT = u96.j(i11, (List) unsafe.getObject(v46Var, j));
                    iR4 += iT;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 32:
                    iT = u96.t(i11, (List) unsafe.getObject(v46Var, j));
                    iR4 += iT;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var12 = u96.g;
                    size = list10.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i5 = u96.q(list10);
                        iC6 = u56.c(i11 << 3);
                        iC7 = (iC6 * size) + i5;
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var13 = u96.g;
                    size = list11.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i5 = u96.w(list11);
                        iC6 = u56.c(i11 << 3);
                        iC7 = (iC6 * size) + i5;
                    }
                    iR4 += iC7;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var14 = u96.g;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var15 = u96.g;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 37:
                    size2 = u96.m((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 38:
                    size2 = u96.i((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 39:
                    size2 = u96.a((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var16 = u96.g;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var17 = u96.g;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var18 = u96.g;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 43:
                    size2 = u96.c((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 44:
                    size2 = u96.l((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var19 = u96.g;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(v46Var, j);
                    d52 d52Var20 = u96.g;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 47:
                    size2 = u96.q((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case kq2.l /* 48 */:
                    size2 = u96.w((List) unsafe.getObject(v46Var, j));
                    if (size2 > 0) {
                        iC9 = u56.c(i11 << 3);
                        iR4 = xi3.n(size2, iC9, size2, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(v46Var, j);
                    r96 r96VarD4 = d(i9);
                    d52 d52Var21 = u96.g;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iR3 = 0;
                    } else {
                        iR3 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            v46 v46Var3 = (v46) list19.get(i20);
                            int iC14 = u56.c(i11 << 3);
                            iR3 += v46Var3.r(r96VarD4) + iC14 + iC14;
                        }
                    }
                    iR4 += iR3;
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 50:
                    int i21 = i9 / 3;
                    m86 m86Var = (m86) unsafe.getObject(v46Var, j);
                    if (this.y[i21 + i21] != null) {
                        uo1.B();
                        return 0;
                    }
                    if (m86Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = m86Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 51:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 8, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 52:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 53:
                    if (s(i11, i9, v46Var)) {
                        long jF = f(j, v46Var);
                        iC10 = u56.c(i11 << 3);
                        i6 = u56.i(jF);
                        iR4 += i6 + iC10;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 54:
                    if (s(i11, i9, v46Var)) {
                        long jF2 = f(j, v46Var);
                        iC10 = u56.c(i11 << 3);
                        i6 = u56.i(jF2);
                        iR4 += i6 + iC10;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 55:
                    if (s(i11, i9, v46Var)) {
                        long jU = u(j, v46Var);
                        iC10 = u56.c(i11 << 3);
                        i6 = u56.i(jU);
                        iR4 += i6 + iC10;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 56:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 8, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 57:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 58:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 1, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 59:
                    if (s(i11, i9, v46Var)) {
                        int i22 = i11 << 3;
                        Object object3 = unsafe.getObject(v46Var, j);
                        if (object3 instanceof l56) {
                            iC11 = u56.c(i22);
                            iY2 = ((l56) object3).v();
                        } else {
                            iC11 = u56.c(i22);
                            iY2 = cb6.y((String) object3);
                        }
                        iR4 = xi3.n(iY2, iY2, iC11, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 60:
                    if (s(i11, i9, v46Var)) {
                        Object object4 = unsafe.getObject(v46Var, j);
                        r96 r96VarD5 = d(i9);
                        d52 d52Var22 = u96.g;
                        iC3 = u56.c(i11 << 3);
                        iR = ((v46) object4).r(r96VarD5);
                        iR4 = xi3.n(iR, iR, iC3, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 61:
                    if (s(i11, i9, v46Var)) {
                        l56 l56Var2 = (l56) unsafe.getObject(v46Var, j);
                        iC11 = u56.c(i11 << 3);
                        iY2 = l56Var2.v();
                        iR4 = xi3.n(iY2, iY2, iC11, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 62:
                    if (s(i11, i9, v46Var)) {
                        iU = u(j, v46Var);
                        iC12 = u56.c(i11 << 3);
                        iR4 = xi3.r(iU, iC12, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 63:
                    if (s(i11, i9, v46Var)) {
                        long jU2 = u(j, v46Var);
                        iC10 = u56.c(i11 << 3);
                        i6 = u56.i(jU2);
                        iR4 += i6 + iC10;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 64:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 4, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 65:
                    if (s(i11, i9, v46Var)) {
                        iR4 = xi3.r(i11 << 3, 8, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 66:
                    if (s(i11, i9, v46Var)) {
                        int iU2 = u(j, v46Var);
                        iC12 = u56.c(i11 << 3);
                        iU = (iU2 >> 31) ^ (iU2 + iU2);
                        iR4 = xi3.r(iU, iC12, iR4);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 67:
                    if (s(i11, i9, v46Var)) {
                        long jF3 = f(j, v46Var);
                        iC10 = u56.c(i11 << 3);
                        i6 = u56.i((jF3 >> 63) ^ (jF3 + jF3));
                        iR4 += i6 + iC10;
                    }
                    i9 += 3;
                    i7 = 1048575;
                    break;
                case 68:
                    if (s(i11, i9, v46Var)) {
                        v46 v46Var4 = (v46) unsafe.getObject(v46Var, j);
                        r96 r96VarD6 = d(i9);
                        d52 d52Var23 = u96.g;
                        int iC15 = u56.c(i11 << 3);
                        i4 = iC15 + iC15;
                        iR2 = v46Var4.r(r96VarD6);
                        iT = iR2 + i4;
                        iR4 += iT;
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

    public final d76 k(int i) {
        int i2 = i / 3;
        return (d76) this.y[i2 + i2 + 1];
    }

    @Override // defpackage.r96
    public final boolean l(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.l) {
            int i6 = this.x[i4];
            int[] iArr = this.g;
            int i7 = iArr[i6];
            int iO = o(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = m.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iO) == 0 || i(obj, i6, i, i2, i10)) {
                int iH = h(iO);
                if (iH != 9 && iH != 17) {
                    if (iH != 27) {
                        if (iH == 60 || iH == 68) {
                            if (!s(i7, i6, obj) || d(i6).l(va6.l(iO & 1048575, obj))) {
                            }
                        } else if (iH != 49) {
                            if (iH == 50 && !((m86) va6.l(iO & 1048575, obj)).isEmpty()) {
                                int i12 = i6 / 3;
                                fj.w(this.y[i12 + i12]);
                                throw null;
                            }
                        }
                        i4++;
                        i5 = i;
                        i3 = i2;
                    }
                    List list = (List) va6.l(iO & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        r96 r96VarD = d(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (r96VarD.l(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!i(obj, i6, i, i2, i10) || d(i6).l(va6.l(iO & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final void m(int i, Object obj, Object obj2) {
        int[] iArr = this.g;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            long jO = o(i) & 1048575;
            Unsafe unsafe = m;
            Object object = unsafe.getObject(obj2, jO);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            r96 r96VarD = d(i);
            if (!s(i2, i, obj)) {
                if (b(object)) {
                    y66 y66VarX = r96VarD.x();
                    r96VarD.y(y66VarX, object);
                    unsafe.putObject(obj, jO, y66VarX);
                } else {
                    unsafe.putObject(obj, jO, object);
                }
                va6.t(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jO);
            if (!b(object2)) {
                y66 y66VarX2 = r96VarD.x();
                r96VarD.y(y66VarX2, object2);
                unsafe.putObject(obj, jO, y66VarX2);
                object2 = y66VarX2;
            }
            r96VarD.y(object2, object);
        }
    }

    @Override // defpackage.r96
    public final boolean n(y66 y66Var, y66 y66Var2) {
        boolean zX;
        int i = 0;
        while (true) {
            int[] iArr = this.g;
            if (i < iArr.length) {
                int iO = o(i);
                long j = iO & 1048575;
                switch (h(iO)) {
                    case 0:
                        if (w(y66Var, y66Var2, i)) {
                            hh5 hh5Var = va6.r;
                            if (Double.doubleToLongBits(hh5Var.m(j, y66Var)) == Double.doubleToLongBits(hh5Var.m(j, y66Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (w(y66Var, y66Var2, i)) {
                            hh5 hh5Var2 = va6.r;
                            if (Float.floatToIntBits(hh5Var2.q(j, y66Var)) == Float.floatToIntBits(hh5Var2.q(j, y66Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (w(y66Var, y66Var2, i) && va6.x(j, y66Var) == va6.x(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (w(y66Var, y66Var2, i) && va6.x(j, y66Var) == va6.x(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (w(y66Var, y66Var2, i) && va6.v(j, y66Var) == va6.v(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (w(y66Var, y66Var2, i) && va6.x(j, y66Var) == va6.x(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (w(y66Var, y66Var2, i) && va6.v(j, y66Var) == va6.v(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (w(y66Var, y66Var2, i)) {
                            hh5 hh5Var3 = va6.r;
                            if (hh5Var3.s(j, y66Var) == hh5Var3.s(j, y66Var2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (w(y66Var, y66Var2, i) && u96.x(va6.l(j, y66Var), va6.l(j, y66Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (w(y66Var, y66Var2, i) && u96.x(va6.l(j, y66Var), va6.l(j, y66Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (w(y66Var, y66Var2, i) && u96.x(va6.l(j, y66Var), va6.l(j, y66Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        if (w(y66Var, y66Var2, i) && va6.v(j, y66Var) == va6.v(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (w(y66Var, y66Var2, i) && va6.v(j, y66Var) == va6.v(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (w(y66Var, y66Var2, i) && va6.v(j, y66Var) == va6.v(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (w(y66Var, y66Var2, i) && va6.x(j, y66Var) == va6.x(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case kq2.x /* 15 */:
                        if (w(y66Var, y66Var2, i) && va6.v(j, y66Var) == va6.v(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (w(y66Var, y66Var2, i) && va6.x(j, y66Var) == va6.x(j, y66Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (w(y66Var, y66Var2, i) && u96.x(va6.l(j, y66Var), va6.l(j, y66Var2))) {
                            continue;
                            i += 3;
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
                        zX = u96.x(va6.l(j, y66Var), va6.l(j, y66Var2));
                        break;
                    case 50:
                        zX = u96.x(va6.l(j, y66Var), va6.l(j, y66Var2));
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
                        long j2 = iArr[i + 2] & 1048575;
                        if (va6.v(j2, y66Var) == va6.v(j2, y66Var2) && u96.x(va6.l(j, y66Var), va6.l(j, y66Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else if (y66Var.zzc.equals(y66Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int o(int i) {
        return this.g[i + 1];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int p(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, defpackage.cr r44) {
        /*
            Method dump skipped, instruction units count: 3526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e96.p(java.lang.Object, byte[], int, int, int, cr):int");
    }

    public final void q(int i, Object obj) {
        int i2 = this.g[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        va6.t(obj, j, (1 << (i2 >>> 20)) | va6.v(j, obj));
    }

    @Override // defpackage.r96
    public final void r(Object obj, et4 et4Var) throws ui0 {
        int i;
        u56 u56Var = (u56) et4Var.t;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i4 >= iArr.length) {
                ((y66) obj).zzc.n(et4Var);
                return;
            }
            int iO = o(i4);
            int iH = h(iO);
            int i6 = iArr[i4];
            Unsafe unsafe = m;
            if (iH <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iO & i2;
            int i9 = 3;
            switch (iH) {
                case 0:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.v(i6, Double.doubleToRawLongBits(va6.r.m(j, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.r(i6, Float.floatToRawIntBits(va6.r.q(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.q(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.q(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.l(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.v(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.r(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (i(obj, i4, i3, i5, i)) {
                        boolean zS = va6.r.s(j, obj);
                        u56Var.m(i6 << 3);
                        u56Var.g(zS ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (i(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            String str = (String) object;
                            u56Var.m((i6 << 3) | 2);
                            int i10 = u56Var.r;
                            byte[] bArr = u56Var.y;
                            int i11 = u56Var.n;
                            try {
                                int iC = u56.c(str.length() * 3);
                                int iC2 = u56.c(str.length());
                                if (iC2 == iC) {
                                    int i12 = i11 + iC2;
                                    u56Var.n = i12;
                                    int iG = cb6.g(str, bArr, i12, i10 - i12);
                                    u56Var.n = i11;
                                    u56Var.m((iG - i11) - iC2);
                                    u56Var.n = iG;
                                } else {
                                    u56Var.m(cb6.y(str));
                                    int i13 = u56Var.n;
                                    u56Var.n = cb6.g(str, bArr, i13, i10 - i13);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new ui0(e);
                            }
                        } else {
                            l56 l56Var = (l56) object;
                            u56Var.m((i6 << 3) | 2);
                            u56Var.m(l56Var.v());
                            l56Var.l(u56Var);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (i(obj, i4, i3, i5, i)) {
                        et4Var.l(i6, unsafe.getObject(obj, j), d(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (i(obj, i4, i3, i5, i)) {
                        l56 l56Var2 = (l56) unsafe.getObject(obj, j);
                        u56Var.m((i6 << 3) | 2);
                        u56Var.m(l56Var2.v());
                        l56Var2.l(u56Var);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.a(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.l(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.r(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (i(obj, i4, i3, i5, i)) {
                        u56Var.v(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case kq2.x /* 15 */:
                    if (i(obj, i4, i3, i5, i)) {
                        int i14 = unsafe.getInt(obj, j);
                        u56Var.a(i6, (i14 >> 31) ^ (i14 + i14));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (i(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        u56Var.q(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (i(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        u56Var.t(i6, 3);
                        d(i4).r((v46) object2, et4Var);
                        u56Var.t(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    u96.p(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    u96.o(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    u96.k(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    u96.v(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    u96.f(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    u96.h(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    u96.z(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    u96.s(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i15 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    d52 d52Var = u96.g;
                    if (list != null && !list.isEmpty()) {
                        int i16 = 0;
                        while (i16 < list.size()) {
                            String str2 = (String) list.get(i16);
                            u56Var.m((i15 << 3) | 2);
                            int i17 = u56Var.r;
                            byte[] bArr2 = u56Var.y;
                            int i18 = u56Var.n;
                            try {
                                int iC3 = u56.c(str2.length() * i9);
                                int iC4 = u56.c(str2.length());
                                if (iC4 == iC3) {
                                    int i19 = i18 + iC4;
                                    u56Var.n = i19;
                                    int iG2 = cb6.g(str2, bArr2, i19, i17 - i19);
                                    u56Var.n = i18;
                                    u56Var.m((iG2 - i18) - iC4);
                                    u56Var.n = iG2;
                                } else {
                                    u56Var.m(cb6.y(str2));
                                    int i20 = u56Var.n;
                                    u56Var.n = cb6.g(str2, bArr2, i20, i17 - i20);
                                }
                                i16++;
                                i9 = 3;
                            } catch (IndexOutOfBoundsException e2) {
                                throw new ui0(e2);
                            }
                        }
                    }
                    break;
                case 27:
                    int i21 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    r96 r96VarD = d(i4);
                    d52 d52Var2 = u96.g;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            et4Var.l(i21, list2.get(i22), r96VarD);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    d52 d52Var3 = u96.g;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            l56 l56Var3 = (l56) list3.get(i24);
                            u56Var.m((i23 << 3) | 2);
                            u56Var.m(l56Var3.v());
                            l56Var3.l(u56Var);
                        }
                    }
                    break;
                case 29:
                    u96.n(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    u96.u(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    u96.d(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    u96.g(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    u96.y(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    u96.r(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    u96.p(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 36:
                    u96.o(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 37:
                    u96.k(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 38:
                    u96.v(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 39:
                    u96.f(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 40:
                    u96.h(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 41:
                    u96.z(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 42:
                    u96.s(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 43:
                    u96.n(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 44:
                    u96.u(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 45:
                    u96.d(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 46:
                    u96.g(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 47:
                    u96.y(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case kq2.l /* 48 */:
                    u96.r(iArr[i4], (List) unsafe.getObject(obj, j), et4Var, true);
                    break;
                case 49:
                    int i25 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    r96 r96VarD2 = d(i4);
                    d52 d52Var4 = u96.g;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            v46 v46Var = (v46) list4.get(i26);
                            u56Var.t(i25, 3);
                            r96VarD2.r(v46Var, et4Var);
                            u56Var.t(i25, 4);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i27 = i4 / 3;
                        throw du4.a(this.y[i27 + i27]);
                    }
                    break;
                case 51:
                    if (s(i6, i4, obj)) {
                        u56Var.v(i6, Double.doubleToRawLongBits(((Double) va6.l(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (s(i6, i4, obj)) {
                        u56Var.r(i6, Float.floatToRawIntBits(((Float) va6.l(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (s(i6, i4, obj)) {
                        u56Var.q(i6, f(j, obj));
                    }
                    break;
                case 54:
                    if (s(i6, i4, obj)) {
                        u56Var.q(i6, f(j, obj));
                    }
                    break;
                case 55:
                    if (s(i6, i4, obj)) {
                        u56Var.l(i6, u(j, obj));
                    }
                    break;
                case 56:
                    if (s(i6, i4, obj)) {
                        u56Var.v(i6, f(j, obj));
                    }
                    break;
                case 57:
                    if (s(i6, i4, obj)) {
                        u56Var.r(i6, u(j, obj));
                    }
                    break;
                case 58:
                    if (s(i6, i4, obj)) {
                        boolean zBooleanValue = ((Boolean) va6.l(j, obj)).booleanValue();
                        u56Var.m(i6 << 3);
                        u56Var.g(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (s(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (!(object3 instanceof String)) {
                            l56 l56Var4 = (l56) object3;
                            u56Var.m((i6 << 3) | 2);
                            u56Var.m(l56Var4.v());
                            l56Var4.l(u56Var);
                        } else {
                            String str3 = (String) object3;
                            u56Var.m((i6 << 3) | 2);
                            int i28 = u56Var.r;
                            byte[] bArr3 = u56Var.y;
                            int i29 = u56Var.n;
                            try {
                                int iC5 = u56.c(str3.length() * 3);
                                int iC6 = u56.c(str3.length());
                                if (iC6 == iC5) {
                                    int i30 = i29 + iC6;
                                    u56Var.n = i30;
                                    int iG3 = cb6.g(str3, bArr3, i30, i28 - i30);
                                    u56Var.n = i29;
                                    u56Var.m((iG3 - i29) - iC6);
                                    u56Var.n = iG3;
                                } else {
                                    u56Var.m(cb6.y(str3));
                                    int i31 = u56Var.n;
                                    u56Var.n = cb6.g(str3, bArr3, i31, i28 - i31);
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw new ui0(e3);
                            }
                        }
                    }
                    break;
                case 60:
                    if (s(i6, i4, obj)) {
                        et4Var.l(i6, unsafe.getObject(obj, j), d(i4));
                    }
                    break;
                case 61:
                    if (s(i6, i4, obj)) {
                        l56 l56Var5 = (l56) unsafe.getObject(obj, j);
                        u56Var.m((i6 << 3) | 2);
                        u56Var.m(l56Var5.v());
                        l56Var5.l(u56Var);
                    }
                    break;
                case 62:
                    if (s(i6, i4, obj)) {
                        u56Var.a(i6, u(j, obj));
                    }
                    break;
                case 63:
                    if (s(i6, i4, obj)) {
                        u56Var.l(i6, u(j, obj));
                    }
                    break;
                case 64:
                    if (s(i6, i4, obj)) {
                        u56Var.r(i6, u(j, obj));
                    }
                    break;
                case 65:
                    if (s(i6, i4, obj)) {
                        u56Var.v(i6, f(j, obj));
                    }
                    break;
                case 66:
                    if (s(i6, i4, obj)) {
                        int iU = u(j, obj);
                        u56Var.a(i6, (iU >> 31) ^ (iU + iU));
                    }
                    break;
                case 67:
                    if (s(i6, i4, obj)) {
                        long jF = f(j, obj);
                        u56Var.q(i6, (jF >> 63) ^ (jF + jF));
                    }
                    break;
                case 68:
                    if (s(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        u56Var.t(i6, 3);
                        d(i4).r((v46) object4, et4Var);
                        u56Var.t(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    public final boolean s(int i, int i2, Object obj) {
        return va6.v((long) (this.g[i2 + 2] & 1048575), obj) == i;
    }

    @Override // defpackage.r96
    public final void t(Object obj, byte[] bArr, int i, int i2, cr crVar) {
        p(obj, bArr, i, i2, 0, crVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.r96
    public final int v(y66 y66Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i5 >= iArr.length) {
                return y66Var.zzc.hashCode() + (i6 * 53);
            }
            int iO = o(i5);
            int i7 = 1048575 & iO;
            int iH = h(iO);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iH) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(va6.r.m(j, y66Var));
                    Charset charset = m76.g;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(va6.r.q(j, y66Var));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = va6.x(j, y66Var);
                    Charset charset2 = m76.g;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = va6.x(j, y66Var);
                    Charset charset3 = m76.g;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.v(j, y66Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = va6.x(j, y66Var);
                    Charset charset4 = m76.g;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.v(j, y66Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zS = va6.r.s(j, y66Var);
                    Charset charset5 = m76.g;
                    if (zS) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) va6.l(j, y66Var)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objL = va6.l(j, y66Var);
                    if (objL != null) {
                        iHashCode = objL.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.l(j, y66Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.v(j, y66Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.v(j, y66Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.v(j, y66Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = va6.x(j, y66Var);
                    Charset charset6 = m76.g;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case kq2.x /* 15 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.v(j, y66Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = va6.x(j, y66Var);
                    Charset charset7 = m76.g;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objL2 = va6.l(j, y66Var);
                    if (objL2 != null) {
                        iHashCode = objL2.hashCode();
                    }
                    i6 = i4 + iHashCode;
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
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.l(j, y66Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = va6.l(j, y66Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (s(i8, i5, y66Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) va6.l(j, y66Var)).doubleValue());
                        Charset charset8 = m76.g;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) va6.l(j, y66Var)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (s(i8, i5, y66Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = f(j, y66Var);
                        Charset charset9 = m76.g;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (s(i8, i5, y66Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = f(j, y66Var);
                        Charset charset10 = m76.g;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u(j, y66Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (s(i8, i5, y66Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = f(j, y66Var);
                        Charset charset11 = m76.g;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u(j, y66Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (s(i8, i5, y66Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) va6.l(j, y66Var)).booleanValue();
                        Charset charset12 = m76.g;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) va6.l(j, y66Var)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = va6.l(j, y66Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = va6.l(j, y66Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u(j, y66Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u(j, y66Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u(j, y66Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (s(i8, i5, y66Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = f(j, y66Var);
                        Charset charset13 = m76.g;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u(j, y66Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (s(i8, i5, y66Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = f(j, y66Var);
                        Charset charset14 = m76.g;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (s(i8, i5, y66Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = va6.l(j, y66Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    public final boolean w(y66 y66Var, y66 y66Var2, int i) {
        return c(i, y66Var) == c(i, y66Var2);
    }

    @Override // defpackage.r96
    public final y66 x() {
        return ((y66) this.v).c();
    }

    @Override // defpackage.r96
    public final void y(Object obj, Object obj2) {
        Object obj3;
        if (!b(obj)) {
            l0.u("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.g;
            if (i >= iArr.length) {
                u96.b(obj, obj2);
                return;
            }
            int iO = o(i);
            int i2 = iO & 1048575;
            int iH = h(iO);
            int i3 = iArr[i];
            long j = i2;
            switch (iH) {
                case 0:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        hh5 hh5Var = va6.r;
                        hh5Var.i(obj3, j, hh5Var.m(j, obj2));
                        q(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        hh5 hh5Var2 = va6.r;
                        hh5Var2.b(obj3, j, hh5Var2.q(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.r.y.putLong(obj3, j, va6.x(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.r.y.putLong(obj3, j, va6.x(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.t(obj3, j, va6.v(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.r.y.putLong(obj3, j, va6.x(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.t(obj3, j, va6.v(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        hh5 hh5Var3 = va6.r;
                        hh5Var3.w(obj3, j, hh5Var3.s(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.a(j, obj3, va6.l(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    a(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.a(j, obj3, va6.l(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.t(obj3, j, va6.v(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.t(obj3, j, va6.v(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.t(obj3, j, va6.v(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.r.y.putLong(obj3, j, va6.x(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case kq2.x /* 15 */:
                    obj3 = obj;
                    if (c(i, obj2)) {
                        va6.t(obj3, j, va6.v(j, obj2));
                        q(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (c(i, obj2)) {
                        obj3 = obj;
                        va6.r.y.putLong(obj3, j, va6.x(j, obj2));
                        q(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    a(i, obj, obj2);
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
                    h76 h76VarR = (h76) va6.l(j, obj);
                    h76 h76Var = (h76) va6.l(j, obj2);
                    int size = h76VarR.size();
                    int size2 = h76Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((x46) h76VarR).n()) {
                            h76VarR = h76VarR.r(size2 + size);
                        }
                        h76VarR.addAll(h76Var);
                    }
                    if (size > 0) {
                        h76Var = h76VarR;
                    }
                    va6.a(j, obj, h76Var);
                    break;
                case 50:
                    d52 d52Var = u96.g;
                    m86 m86VarY = (m86) va6.l(j, obj);
                    m86 m86Var = (m86) va6.l(j, obj2);
                    if (!m86Var.isEmpty()) {
                        if (!m86VarY.v()) {
                            m86VarY = m86VarY.y();
                        }
                        m86VarY.n(m86Var);
                    }
                    va6.a(j, obj, m86VarY);
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
                    if (s(i3, i, obj2)) {
                        va6.a(j, obj, va6.l(j, obj2));
                        va6.t(obj, iArr[i + 2] & 1048575, i3);
                    }
                    break;
                case 60:
                    m(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i3, i, obj2)) {
                        va6.a(j, obj, va6.l(j, obj2));
                        va6.t(obj, iArr[i + 2] & 1048575, i3);
                    }
                    break;
                case 68:
                    m(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    public final int z(int i, int i2) {
        int[] iArr = this.g;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
