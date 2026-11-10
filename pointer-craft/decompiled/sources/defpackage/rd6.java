package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rd6 {
    public static final byte[] g = {112, 114, 111, 0};
    public static final byte[] y = {112, 114, 109, 0};

    public static w81[] a(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new w81[0];
        }
        w81[] w81VarArr = new w81[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iA = (int) hf6.a(byteArrayInputStream, 2);
            int iA2 = (int) hf6.a(byteArrayInputStream, 2);
            w81VarArr[i3] = new w81(str, new String(hf6.x(byteArrayInputStream, iA), StandardCharsets.UTF_8), hf6.a(byteArrayInputStream, 4), iA2, (int) hf6.a(byteArrayInputStream, 4), (int) hf6.a(byteArrayInputStream, 4), new int[iA2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            w81 w81Var = w81VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = w81Var.x;
            int i6 = w81Var.l;
            TreeMap treeMap = w81Var.t;
            int i7 = iAvailable - i5;
            int iA3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iA3 += (int) hf6.a(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iA3), 1);
                int iA4 = (int) hf6.a(byteArrayInputStream, 2);
                while (iA4 > 0) {
                    hf6.a(byteArrayInputStream, 2);
                    int iA5 = (int) hf6.a(byteArrayInputStream, 1);
                    if (iA5 != 6 && iA5 != 7) {
                        while (iA5 > 0) {
                            hf6.a(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iA6 = (int) hf6.a(byteArrayInputStream, 1); iA6 > 0; iA6--) {
                                hf6.a(byteArrayInputStream, 2);
                            }
                            iA5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iA4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                l0.z("Read too much data during profile line parse");
                return null;
            }
            w81Var.j = v(byteArrayInputStream, w81Var.v);
            BitSet bitSetValueOf = BitSet.valueOf(hf6.x(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return w81VarArr;
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
            sb.append(s(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(s(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void c(ByteArrayOutputStream byteArrayOutputStream, int i, w81 w81Var) throws IOException {
        int i2 = w81Var.l;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : w81Var.t.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void g(b65 b65Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(2080741862);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(b65Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            qc6.g(b65Var, nm0Var, h02Var, i2 & 126);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new sk0(b65Var, nm0Var, i, b);
        }
    }

    public static void i(ByteArrayOutputStream byteArrayOutputStream, w81 w81Var) {
        int i = 0;
        for (Map.Entry entry : w81Var.t.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                hf6.q(byteArrayOutputStream, iIntValue - i);
                hf6.q(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static w81[] j(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, w81[] w81VarArr) {
        w81 w81Var;
        if (byteArrayInputStream.available() == 0) {
            return new w81[0];
        }
        if (i != w81VarArr.length) {
            l0.z("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            hf6.a(byteArrayInputStream, 2);
            String str = new String(hf6.x(byteArrayInputStream, (int) hf6.a(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jA = hf6.a(byteArrayInputStream, 4);
            int iA = (int) hf6.a(byteArrayInputStream, 2);
            if (w81VarArr.length <= 0) {
                w81Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= w81VarArr.length) {
                    w81Var = null;
                    break;
                }
                if (w81VarArr[i3].y.equals(strSubstring)) {
                    w81Var = w81VarArr[i3];
                    break;
                }
                i3++;
            }
            if (w81Var == null) {
                l0.z("Missing profile key: ".concat(str));
                return null;
            }
            w81Var.n = jA;
            int[] iArrV = v(byteArrayInputStream, iA);
            if (Arrays.equals(bArr, sd6.v)) {
                w81Var.v = iA;
                w81Var.j = iArrV;
            }
        }
        return w81VarArr;
    }

    public static w81[] l(ByteArrayInputStream byteArrayInputStream, int i, w81[] w81VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new w81[0];
        }
        if (i != w81VarArr.length) {
            l0.z("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iA = (int) hf6.a(byteArrayInputStream, 2);
            iArr[i2] = (int) hf6.a(byteArrayInputStream, 2);
            strArr[i2] = new String(hf6.x(byteArrayInputStream, iA), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            w81 w81Var = w81VarArr[i3];
            if (!w81Var.y.equals(strArr[i3])) {
                l0.z("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            w81Var.v = i4;
            w81Var.j = v(byteArrayInputStream, i4);
        }
        return w81VarArr;
    }

    public static boolean m(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, w81[] w81VarArr) throws IOException {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = sd6.g;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = sd6.y;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrY = y(w81VarArr, bArr3);
                hf6.m(byteArrayOutputStream, w81VarArr.length, 1);
                hf6.m(byteArrayOutputStream, bArrY.length, 4);
                byte[] bArrV = hf6.v(bArrY);
                hf6.m(byteArrayOutputStream, bArrV.length, 4);
                byteArrayOutputStream.write(bArrV);
                return true;
            }
            byte[] bArr4 = sd6.n;
            if (Arrays.equals(bArr, bArr4)) {
                hf6.m(byteArrayOutputStream, w81VarArr.length, 1);
                for (w81 w81Var : w81VarArr) {
                    int size = w81Var.t.size() * 4;
                    String strR = r(w81Var.g, w81Var.y, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    hf6.q(byteArrayOutputStream, strR.getBytes(charset).length);
                    hf6.q(byteArrayOutputStream, w81Var.j.length);
                    hf6.m(byteArrayOutputStream, size, 4);
                    hf6.m(byteArrayOutputStream, w81Var.r, 4);
                    byteArrayOutputStream.write(strR.getBytes(charset));
                    Iterator it = w81Var.t.keySet().iterator();
                    while (it.hasNext()) {
                        hf6.q(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        hf6.q(byteArrayOutputStream, 0);
                    }
                    for (int i3 : w81Var.j) {
                        hf6.q(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = sd6.r;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrY2 = y(w81VarArr, bArr5);
                hf6.m(byteArrayOutputStream, w81VarArr.length, 1);
                hf6.m(byteArrayOutputStream, bArrY2.length, 4);
                byte[] bArrV2 = hf6.v(bArrY2);
                hf6.m(byteArrayOutputStream, bArrV2.length, 4);
                byteArrayOutputStream.write(bArrV2);
                return true;
            }
            byte[] bArr6 = sd6.v;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            hf6.q(byteArrayOutputStream, w81VarArr.length);
            for (w81 w81Var2 : w81VarArr) {
                String str = w81Var2.g;
                TreeMap treeMap = w81Var2.t;
                String strR2 = r(str, w81Var2.y, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                hf6.q(byteArrayOutputStream, strR2.getBytes(charset2).length);
                hf6.q(byteArrayOutputStream, treeMap.size());
                hf6.q(byteArrayOutputStream, w81Var2.j.length);
                hf6.m(byteArrayOutputStream, w81Var2.r, 4);
                byteArrayOutputStream.write(strR2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    hf6.q(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : w81Var2.j) {
                    hf6.q(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            hf6.q(byteArrayOutputStream2, w81VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (w81 w81Var3 : w81VarArr) {
                hf6.m(byteArrayOutputStream2, w81Var3.r, 4);
                hf6.m(byteArrayOutputStream2, w81Var3.n, 4);
                hf6.m(byteArrayOutputStream2, w81Var3.l, 4);
                String strR3 = r(w81Var3.g, w81Var3.y, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strR3.getBytes(charset3).length;
                hf6.q(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strR3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            js5 js5Var = new js5(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(js5Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < w81VarArr.length) {
                try {
                    w81 w81Var4 = w81VarArr[i7];
                    hf6.q(byteArrayOutputStream3, i7);
                    hf6.q(byteArrayOutputStream3, w81Var4.v);
                    i8 = i8 + 4 + (w81Var4.v * i5);
                    int[] iArr = w81Var4.j;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        hf6.q(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            js5 js5Var2 = new js5(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(js5Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < w81VarArr.length) {
                try {
                    w81 w81Var5 = w81VarArr[i12];
                    Iterator it3 = w81Var5.t.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        c(byteArrayOutputStream5, iIntValue, w81Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            i(byteArrayOutputStream6, w81Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            hf6.q(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            hf6.m(byteArrayOutputStream4, length4, 4);
                            hf6.q(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            js5 js5Var3 = new js5(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(js5Var3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            hf6.m(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                js5 js5Var4 = (js5) arrayList2.get(i15);
                int i16 = js5Var4.g;
                byte[] bArr7 = js5Var4.y;
                int i17 = i11;
                if (i16 == 1) {
                    i = 0;
                } else if (i16 == i17) {
                    i = 1;
                } else if (i16 == 3) {
                    i = i17;
                } else if (i16 == 4) {
                    i = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    i = 4;
                }
                hf6.m(byteArrayOutputStream, i, 4);
                hf6.m(byteArrayOutputStream, size2, 4);
                if (js5Var4.r) {
                    long length5 = bArr7.length;
                    byte[] bArrV3 = hf6.v(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrV3);
                    hf6.m(byteArrayOutputStream, bArrV3.length, 4);
                    hf6.m(byteArrayOutputStream, length5, 4);
                    length = bArrV3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    hf6.m(byteArrayOutputStream, bArr7.length, 4);
                    hf6.m(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
                i11 = i17;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final gh3 n(tu3 tu3Var) {
        return k33.T(tu3Var, 16);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, w81 w81Var) throws IOException {
        i(byteArrayOutputStream, w81Var);
        int i = w81Var.l;
        int[] iArr = w81Var.j;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            hf6.q(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : w81Var.t.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static String r(String str, String str2, byte[] bArr) {
        byte[] bArr2 = sd6.v;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = sd6.n;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return du4.b(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static String s(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            du4.B(sb2, "<", string, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static w81[] t(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, sd6.y)) {
            l0.z("Unsupported version");
            return null;
        }
        int iA = (int) hf6.a(fileInputStream, 1);
        byte[] bArrL = hf6.l(fileInputStream, (int) hf6.a(fileInputStream, 4), (int) hf6.a(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            l0.z("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrL);
        try {
            w81[] w81VarArrA = a(byteArrayInputStream, str, iA);
            byteArrayInputStream.close();
            return w81VarArrA;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int[] v(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iA = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA += (int) hf6.a(byteArrayInputStream, 2);
            iArr[i2] = iA;
        }
        return iArr;
    }

    public static void w(ByteArrayOutputStream byteArrayOutputStream, w81 w81Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        hf6.q(byteArrayOutputStream, str.getBytes(charset).length);
        hf6.q(byteArrayOutputStream, w81Var.v);
        hf6.m(byteArrayOutputStream, w81Var.x, 4);
        hf6.m(byteArrayOutputStream, w81Var.r, 4);
        hf6.m(byteArrayOutputStream, w81Var.l, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static w81[] x(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, w81[] w81VarArr) throws IOException {
        byte[] bArr3 = sd6.x;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, sd6.l)) {
                l0.z("Unsupported meta version");
                return null;
            }
            int iA = (int) hf6.a(fileInputStream, 2);
            byte[] bArrL = hf6.l(fileInputStream, (int) hf6.a(fileInputStream, 4), (int) hf6.a(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                l0.z("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrL);
            try {
                w81[] w81VarArrJ = j(byteArrayInputStream, bArr2, iA, w81VarArr);
                byteArrayInputStream.close();
                return w81VarArrJ;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(sd6.g, bArr2)) {
            l0.z("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            l0.z("Unsupported meta version");
            return null;
        }
        int iA2 = (int) hf6.a(fileInputStream, 1);
        byte[] bArrL2 = hf6.l(fileInputStream, (int) hf6.a(fileInputStream, 4), (int) hf6.a(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            l0.z("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrL2);
        try {
            w81[] w81VarArrL = l(byteArrayInputStream2, iA2, w81VarArr);
            byteArrayInputStream2.close();
            return w81VarArrL;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static byte[] y(w81[] w81VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (w81 w81Var : w81VarArr) {
            length += ((((w81Var.l * 2) + 7) & (-8)) / 8) + (w81Var.v * 2) + r(w81Var.g, w81Var.y, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + w81Var.x;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, sd6.r)) {
            int length2 = w81VarArr.length;
            while (i < length2) {
                w81 w81Var2 = w81VarArr[i];
                w(byteArrayOutputStream, w81Var2, r(w81Var2.g, w81Var2.y, bArr));
                q(byteArrayOutputStream, w81Var2);
                i++;
            }
        } else {
            for (w81 w81Var3 : w81VarArr) {
                w(byteArrayOutputStream, w81Var3, r(w81Var3.g, w81Var3.y, bArr));
            }
            int length3 = w81VarArr.length;
            while (i < length3) {
                q(byteArrayOutputStream, w81VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }
}
