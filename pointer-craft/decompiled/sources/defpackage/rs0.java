package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class rs0 {
    public static final SparseIntArray n;
    public static final int[] r = {0, 4, 8};
    public static final SparseIntArray v;
    public final HashMap g = new HashMap();
    public final HashMap y = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        v = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static void j(fs0 fs0Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        fs0Var.G = str;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public static void l(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        ls0 ls0Var;
        ns0 ns0Var;
        fs0 fs0Var;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof fs0) {
                    fs0Var = (fs0) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) fs0Var).width = i4;
                        fs0Var.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fs0Var).height = i4;
                        fs0Var.X = z;
                        return;
                    }
                }
                if (obj instanceof ns0) {
                    ns0Var = (ns0) obj;
                    if (i2 == 0) {
                        ns0Var.y = i4;
                        ns0Var.l0 = z;
                        return;
                    } else {
                        ns0Var.r = i4;
                        ns0Var.m0 = z;
                        return;
                    }
                }
                if (obj instanceof ls0) {
                    ls0Var = (ls0) obj;
                    if (i2 == 0) {
                        ls0Var.y(23, i4);
                        ls0Var.r(80, z);
                        return;
                    } else {
                        ls0Var.y(21, i4);
                        ls0Var.r(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof fs0) {
                fs0Var = (fs0) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) fs0Var).width = i4;
                    fs0Var.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) fs0Var).height = i4;
                    fs0Var.X = z;
                    return;
                }
            }
            if (obj instanceof ns0) {
                ns0Var = (ns0) obj;
                if (i2 == 0) {
                    ns0Var.y = i4;
                    ns0Var.l0 = z;
                    return;
                } else {
                    ns0Var.r = i4;
                    ns0Var.m0 = z;
                    return;
                }
            }
            if (obj instanceof ls0) {
                ls0Var = (ls0) obj;
                if (i2 == 0) {
                    ls0Var.y(23, i4);
                    ls0Var.r(80, z);
                    return;
                } else {
                    ls0Var.y(21, i4);
                    ls0Var.r(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof fs0) {
                    fs0 fs0Var2 = (fs0) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) fs0Var2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fs0Var2).height = 0;
                    }
                    j(fs0Var2, strTrim2);
                    return;
                }
                if (obj instanceof ns0) {
                    ((ns0) obj).d = strTrim2;
                    return;
                } else {
                    if (obj instanceof ls0) {
                        ((ls0) obj).n(strTrim2, 5);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof fs0) {
                        fs0 fs0Var3 = (fs0) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) fs0Var3).width = 0;
                            fs0Var3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fs0Var3).height = 0;
                            fs0Var3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof ns0) {
                        ns0 ns0Var2 = (ns0) obj;
                        if (i2 == 0) {
                            ns0Var2.y = 0;
                            ns0Var2.U = f;
                            return;
                        } else {
                            ns0Var2.r = 0;
                            ns0Var2.T = f;
                            return;
                        }
                    }
                    if (obj instanceof ls0) {
                        ls0 ls0Var2 = (ls0) obj;
                        if (i2 == 0) {
                            ls0Var2.y(23, 0);
                            ls0Var2.g(39, f);
                            return;
                        } else {
                            ls0Var2.y(21, 0);
                            ls0Var2.g(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof fs0) {
                        fs0 fs0Var4 = (fs0) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) fs0Var4).width = 0;
                            fs0Var4.R = fMax;
                            fs0Var4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fs0Var4).height = 0;
                            fs0Var4.S = fMax;
                            fs0Var4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof ns0) {
                        ns0 ns0Var3 = (ns0) obj;
                        if (i2 == 0) {
                            ns0Var3.y = 0;
                            ns0Var3.d0 = fMax;
                            ns0Var3.X = 2;
                            return;
                        } else {
                            ns0Var3.r = 0;
                            ns0Var3.e0 = fMax;
                            ns0Var3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof ls0) {
                        ls0 ls0Var3 = (ls0) obj;
                        if (i2 == 0) {
                            ls0Var3.y(23, 0);
                            ls0Var3.y(54, 2);
                        } else {
                            ls0Var3.y(21, 0);
                            ls0Var3.y(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static ms0 n(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        ms0 ms0Var = new ms0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? j24.r : j24.g);
        ps0 ps0Var = ms0Var.y;
        qs0 qs0Var = ms0Var.v;
        os0 os0Var = ms0Var.r;
        ns0 ns0Var = ms0Var.n;
        int[] iArr = r;
        String[] strArr = ya6.g;
        SparseIntArray sparseIntArray = n;
        if (z) {
            ls0 ls0Var = new ls0();
            ls0Var.g = new int[10];
            ls0Var.y = new int[10];
            ls0Var.r = 0;
            ls0Var.n = new int[10];
            ls0Var.v = new float[10];
            ls0Var.x = 0;
            ls0Var.l = new int[5];
            ls0Var.j = new String[5];
            ls0Var.t = 0;
            ls0Var.a = new int[4];
            ls0Var.m = new boolean[4];
            ls0Var.q = 0;
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (v.get(index)) {
                    case 2:
                        i2 = indexCount;
                        ls0Var.y(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.I));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        ls0Var.n(typedArrayObtainStyledAttributes.getString(index), 5);
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        ls0Var.y(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ns0Var.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        ls0Var.y(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ns0Var.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        ls0Var.y(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.J));
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        i2 = indexCount;
                        ls0Var.y(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        ls0Var.y(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        ls0Var.y(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        ls0Var.y(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.O));
                        break;
                    case kq2.x /* 15 */:
                        i2 = indexCount;
                        ls0Var.y(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        ls0Var.y(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        ls0Var.y(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ns0Var.n));
                        break;
                    case 18:
                        i2 = indexCount;
                        ls0Var.y(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ns0Var.v));
                        break;
                    case 19:
                        i2 = indexCount;
                        ls0Var.g(19, typedArrayObtainStyledAttributes.getFloat(index, ns0Var.x));
                        break;
                    case 20:
                        i2 = indexCount;
                        ls0Var.g(20, typedArrayObtainStyledAttributes.getFloat(index, ns0Var.f));
                        break;
                    case 21:
                        i2 = indexCount;
                        ls0Var.y(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, ns0Var.r));
                        break;
                    case 22:
                        i2 = indexCount;
                        ls0Var.y(22, iArr[typedArrayObtainStyledAttributes.getInt(index, ps0Var.g)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        ls0Var.y(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, ns0Var.y));
                        break;
                    case 24:
                        i2 = indexCount;
                        ls0Var.y(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        ls0Var.y(27, typedArrayObtainStyledAttributes.getInt(index, ns0Var.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        ls0Var.y(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        ls0Var.y(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        ls0Var.y(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        ls0Var.g(37, typedArrayObtainStyledAttributes.getFloat(index, ns0Var.k));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ms0Var.g);
                        ms0Var.g = resourceId;
                        ls0Var.y(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        ls0Var.g(39, typedArrayObtainStyledAttributes.getFloat(index, ns0Var.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        ls0Var.g(40, typedArrayObtainStyledAttributes.getFloat(index, ns0Var.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        ls0Var.y(41, typedArrayObtainStyledAttributes.getInt(index, ns0Var.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        ls0Var.y(42, typedArrayObtainStyledAttributes.getInt(index, ns0Var.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        ls0Var.g(43, typedArrayObtainStyledAttributes.getFloat(index, ps0Var.r));
                        break;
                    case 44:
                        i2 = indexCount;
                        ls0Var.r(44, true);
                        ls0Var.g(44, typedArrayObtainStyledAttributes.getDimension(index, qs0Var.w));
                        break;
                    case 45:
                        i2 = indexCount;
                        ls0Var.g(45, typedArrayObtainStyledAttributes.getFloat(index, qs0Var.y));
                        break;
                    case 46:
                        i2 = indexCount;
                        ls0Var.g(46, typedArrayObtainStyledAttributes.getFloat(index, qs0Var.r));
                        break;
                    case 47:
                        i2 = indexCount;
                        ls0Var.g(47, typedArrayObtainStyledAttributes.getFloat(index, qs0Var.n));
                        break;
                    case kq2.l /* 48 */:
                        i2 = indexCount;
                        ls0Var.g(48, typedArrayObtainStyledAttributes.getFloat(index, qs0Var.v));
                        break;
                    case 49:
                        i2 = indexCount;
                        ls0Var.g(49, typedArrayObtainStyledAttributes.getDimension(index, qs0Var.x));
                        break;
                    case 50:
                        i2 = indexCount;
                        ls0Var.g(50, typedArrayObtainStyledAttributes.getDimension(index, qs0Var.l));
                        break;
                    case 51:
                        i2 = indexCount;
                        ls0Var.g(51, typedArrayObtainStyledAttributes.getDimension(index, qs0Var.t));
                        break;
                    case 52:
                        i2 = indexCount;
                        ls0Var.g(52, typedArrayObtainStyledAttributes.getDimension(index, qs0Var.a));
                        break;
                    case 53:
                        i2 = indexCount;
                        ls0Var.g(53, typedArrayObtainStyledAttributes.getDimension(index, qs0Var.m));
                        break;
                    case 54:
                        i2 = indexCount;
                        ls0Var.y(54, typedArrayObtainStyledAttributes.getInt(index, ns0Var.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        ls0Var.y(55, typedArrayObtainStyledAttributes.getInt(index, ns0Var.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        ls0Var.y(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        ls0Var.y(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        ls0Var.y(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        ls0Var.y(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        ls0Var.g(60, typedArrayObtainStyledAttributes.getFloat(index, qs0Var.g));
                        break;
                    case 62:
                        i2 = indexCount;
                        ls0Var.y(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        ls0Var.g(63, typedArrayObtainStyledAttributes.getFloat(index, ns0Var.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        ls0Var.y(64, x(typedArrayObtainStyledAttributes, index, os0Var.g));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            ls0Var.n(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            ls0Var.n(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        ls0Var.y(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        ls0Var.g(67, typedArrayObtainStyledAttributes.getFloat(index, os0Var.v));
                        break;
                    case 68:
                        i2 = indexCount;
                        ls0Var.g(68, typedArrayObtainStyledAttributes.getFloat(index, ps0Var.n));
                        break;
                    case 69:
                        i2 = indexCount;
                        ls0Var.g(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        ls0Var.g(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        ls0Var.y(72, typedArrayObtainStyledAttributes.getInt(index, ns0Var.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        ls0Var.y(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        ls0Var.n(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        ls0Var.r(75, typedArrayObtainStyledAttributes.getBoolean(index, ns0Var.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        ls0Var.y(76, typedArrayObtainStyledAttributes.getInt(index, os0Var.r));
                        break;
                    case 77:
                        i2 = indexCount;
                        ls0Var.n(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        ls0Var.y(78, typedArrayObtainStyledAttributes.getInt(index, ps0Var.y));
                        break;
                    case 79:
                        i2 = indexCount;
                        ls0Var.g(79, typedArrayObtainStyledAttributes.getFloat(index, os0Var.n));
                        break;
                    case 80:
                        i2 = indexCount;
                        ls0Var.r(80, typedArrayObtainStyledAttributes.getBoolean(index, ns0Var.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        ls0Var.r(81, typedArrayObtainStyledAttributes.getBoolean(index, ns0Var.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        ls0Var.y(82, typedArrayObtainStyledAttributes.getInteger(index, os0Var.y));
                        break;
                    case 83:
                        i2 = indexCount;
                        ls0Var.y(83, x(typedArrayObtainStyledAttributes, index, qs0Var.j));
                        break;
                    case 84:
                        i2 = indexCount;
                        ls0Var.y(84, typedArrayObtainStyledAttributes.getInteger(index, os0Var.l));
                        break;
                    case 85:
                        i2 = indexCount;
                        ls0Var.g(85, typedArrayObtainStyledAttributes.getFloat(index, os0Var.x));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            os0Var.t = resourceId2;
                            ls0Var.y(89, resourceId2);
                            if (os0Var.t != -1) {
                                ls0Var.y(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            os0Var.j = string;
                            ls0Var.n(string, 90);
                            if (os0Var.j.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                os0Var.t = resourceId3;
                                ls0Var.y(89, resourceId3);
                                ls0Var.y(88, -2);
                            } else {
                                ls0Var.y(88, -1);
                            }
                        } else {
                            ls0Var.y(88, typedArrayObtainStyledAttributes.getInteger(index, os0Var.t));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        ls0Var.y(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        ls0Var.y(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ns0Var.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        l(ls0Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        l(ls0Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        ls0Var.y(97, typedArrayObtainStyledAttributes.getInt(index, ns0Var.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = c83.k;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            ms0Var.g = typedArrayObtainStyledAttributes.getResourceId(index, ms0Var.g);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        ls0Var.r(99, typedArrayObtainStyledAttributes.getBoolean(index, ns0Var.l));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        ns0Var.b = x(typedArrayObtainStyledAttributes, index2, ns0Var.b);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        ns0Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        ns0Var.i = x(typedArrayObtainStyledAttributes, index2, ns0Var.i);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        ns0Var.c = x(typedArrayObtainStyledAttributes, index2, ns0Var.c);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        ns0Var.d = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        ns0Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ns0Var.C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        ns0Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ns0Var.D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        ns0Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        ns0Var.o = x(typedArrayObtainStyledAttributes, index2, ns0Var.o);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        ns0Var.h = x(typedArrayObtainStyledAttributes, index2, ns0Var.h);
                        continue;
                        i7++;
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        i = indexCount2;
                        ns0Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.P);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        ns0Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        ns0Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        ns0Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.O);
                        continue;
                        i7++;
                        break;
                    case kq2.x /* 15 */:
                        i = indexCount2;
                        ns0Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.R);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        ns0Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        ns0Var.n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ns0Var.n);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        ns0Var.v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ns0Var.v);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        ns0Var.x = typedArrayObtainStyledAttributes.getFloat(index2, ns0Var.x);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        ns0Var.f = typedArrayObtainStyledAttributes.getFloat(index2, ns0Var.f);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        ns0Var.r = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ns0Var.r);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, ps0Var.g);
                        ps0Var.g = i8;
                        ps0Var.g = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        ns0Var.y = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ns0Var.y);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        ns0Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        ns0Var.j = x(typedArrayObtainStyledAttributes, index2, ns0Var.j);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        ns0Var.t = x(typedArrayObtainStyledAttributes, index2, ns0Var.t);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        ns0Var.E = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        ns0Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        ns0Var.a = x(typedArrayObtainStyledAttributes, index2, ns0Var.a);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        ns0Var.m = x(typedArrayObtainStyledAttributes, index2, ns0Var.m);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        ns0Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        ns0Var.u = x(typedArrayObtainStyledAttributes, index2, ns0Var.u);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        ns0Var.z = x(typedArrayObtainStyledAttributes, index2, ns0Var.z);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        ns0Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.H);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        ns0Var.w = x(typedArrayObtainStyledAttributes, index2, ns0Var.w);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        ns0Var.q = x(typedArrayObtainStyledAttributes, index2, ns0Var.q);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        ns0Var.k = typedArrayObtainStyledAttributes.getFloat(index2, ns0Var.k);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        ms0Var.g = typedArrayObtainStyledAttributes.getResourceId(index2, ms0Var.g);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        ns0Var.U = typedArrayObtainStyledAttributes.getFloat(index2, ns0Var.U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        ns0Var.T = typedArrayObtainStyledAttributes.getFloat(index2, ns0Var.T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        ns0Var.V = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        ns0Var.W = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        ps0Var.r = typedArrayObtainStyledAttributes.getFloat(index2, ps0Var.r);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        qs0Var.q = true;
                        qs0Var.w = typedArrayObtainStyledAttributes.getDimension(index2, qs0Var.w);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        qs0Var.y = typedArrayObtainStyledAttributes.getFloat(index2, qs0Var.y);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        qs0Var.r = typedArrayObtainStyledAttributes.getFloat(index2, qs0Var.r);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        qs0Var.n = typedArrayObtainStyledAttributes.getFloat(index2, qs0Var.n);
                        continue;
                        i7++;
                        break;
                    case kq2.l /* 48 */:
                        i = indexCount2;
                        qs0Var.v = typedArrayObtainStyledAttributes.getFloat(index2, qs0Var.v);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        qs0Var.x = typedArrayObtainStyledAttributes.getDimension(index2, qs0Var.x);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        qs0Var.l = typedArrayObtainStyledAttributes.getDimension(index2, qs0Var.l);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        qs0Var.t = typedArrayObtainStyledAttributes.getDimension(index2, qs0Var.t);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        qs0Var.a = typedArrayObtainStyledAttributes.getDimension(index2, qs0Var.a);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        qs0Var.m = typedArrayObtainStyledAttributes.getDimension(index2, qs0Var.m);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        ns0Var.X = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        ns0Var.Y = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        ns0Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        ns0Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        ns0Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        ns0Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        qs0Var.g = typedArrayObtainStyledAttributes.getFloat(index2, qs0Var.g);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        ns0Var.e = x(typedArrayObtainStyledAttributes, index2, ns0Var.e);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        ns0Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        ns0Var.B = typedArrayObtainStyledAttributes.getFloat(index2, ns0Var.B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        os0Var.g = x(typedArrayObtainStyledAttributes, index2, os0Var.g);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        os0Var.v = typedArrayObtainStyledAttributes.getFloat(index2, os0Var.v);
                        break;
                    case 68:
                        i = indexCount2;
                        ps0Var.n = typedArrayObtainStyledAttributes.getFloat(index2, ps0Var.n);
                        break;
                    case 69:
                        i = indexCount2;
                        ns0Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        ns0Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        ns0Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        ns0Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        ns0Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        ns0Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, ns0Var.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        os0Var.r = typedArrayObtainStyledAttributes.getInt(index2, os0Var.r);
                        break;
                    case 77:
                        i = indexCount2;
                        ns0Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        ps0Var.y = typedArrayObtainStyledAttributes.getInt(index2, ps0Var.y);
                        break;
                    case 79:
                        i = indexCount2;
                        os0Var.n = typedArrayObtainStyledAttributes.getFloat(index2, os0Var.n);
                        break;
                    case 80:
                        i = indexCount2;
                        ns0Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, ns0Var.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        ns0Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, ns0Var.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        os0Var.y = typedArrayObtainStyledAttributes.getInteger(index2, os0Var.y);
                        break;
                    case 83:
                        i = indexCount2;
                        qs0Var.j = x(typedArrayObtainStyledAttributes, index2, qs0Var.j);
                        break;
                    case 84:
                        i = indexCount2;
                        os0Var.l = typedArrayObtainStyledAttributes.getInteger(index2, os0Var.l);
                        break;
                    case 85:
                        i = indexCount2;
                        os0Var.x = typedArrayObtainStyledAttributes.getFloat(index2, os0Var.x);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            os0Var.t = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            os0Var.j = string2;
                            if (string2.indexOf("/") > 0) {
                                os0Var.t = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, os0Var.t);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        ns0Var.s = x(typedArrayObtainStyledAttributes, index2, ns0Var.s);
                        break;
                    case 92:
                        i = indexCount2;
                        ns0Var.p = x(typedArrayObtainStyledAttributes, index2, ns0Var.p);
                        break;
                    case 93:
                        i = indexCount2;
                        ns0Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.L);
                        break;
                    case 94:
                        i = indexCount2;
                        ns0Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ns0Var.S);
                        break;
                    case 95:
                        i = indexCount2;
                        l(ns0Var, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        l(ns0Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        ns0Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, ns0Var.o0);
                        break;
                }
                i7++;
            }
            if (ns0Var.j0 != null) {
                ns0Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return ms0Var;
    }

    public static int[] r(ax axVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = axVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = h24.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && axVar.isInEditMode() && (axVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) axVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.z;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.z.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static int x(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void g(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = this.y;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (id == -1) {
                    t94.v("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        ms0 ms0Var = (ms0) map2.get(Integer.valueOf(id));
                        if (ms0Var != null) {
                            ps0 ps0Var = ms0Var.y;
                            ns0 ns0Var = ms0Var.n;
                            qs0 qs0Var = ms0Var.v;
                            if (childAt instanceof ax) {
                                ns0Var.h0 = 1;
                                ax axVar = (ax) childAt;
                                axVar.setId(id);
                                axVar.setType(ns0Var.f0);
                                axVar.setMargin(ns0Var.g0);
                                axVar.setAllowsGoneWidget(ns0Var.n0);
                                int[] iArr = ns0Var.i0;
                                if (iArr != null) {
                                    axVar.setReferencedIds(iArr);
                                } else {
                                    String str = ns0Var.j0;
                                    if (str != null) {
                                        int[] iArrR = r(axVar, str);
                                        ns0Var.i0 = iArrR;
                                        axVar.setReferencedIds(iArrR);
                                    }
                                }
                            }
                            fs0 fs0Var = (fs0) childAt.getLayoutParams();
                            fs0Var.g();
                            ms0Var.g(fs0Var);
                            HashMap map3 = ms0Var.x;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                bs0 bs0Var = (bs0) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strT = !bs0Var.g ? xi3.t("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iD = du4.D(bs0Var.y);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iD) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strT, cls3).invoke(childAt, Integer.valueOf(bs0Var.r));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strT, cls2).invoke(childAt, Float.valueOf(bs0Var.n));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strT, cls3).invoke(childAt, Integer.valueOf(bs0Var.l));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strT, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bs0Var.l);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strT, e);
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strT, CharSequence.class).invoke(childAt, bs0Var.v);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strT, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bs0Var.x));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strT, cls2).invoke(childAt, Float.valueOf(bs0Var.n));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strT, cls3).invoke(childAt, Integer.valueOf(bs0Var.r));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    map = map3;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(fs0Var);
                            if (ps0Var.y == 0) {
                                childAt.setVisibility(ps0Var.g);
                            }
                            childAt.setAlpha(ps0Var.r);
                            childAt.setRotation(qs0Var.g);
                            childAt.setRotationX(qs0Var.y);
                            childAt.setRotationY(qs0Var.r);
                            childAt.setScaleX(qs0Var.n);
                            childAt.setScaleY(qs0Var.v);
                            if (qs0Var.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(qs0Var.j);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(qs0Var.x)) {
                                    childAt.setPivotX(qs0Var.x);
                                }
                                if (!Float.isNaN(qs0Var.l)) {
                                    childAt.setPivotY(qs0Var.l);
                                }
                            }
                            childAt.setTranslationX(qs0Var.t);
                            childAt.setTranslationY(qs0Var.a);
                            childAt.setTranslationZ(qs0Var.m);
                            if (qs0Var.q) {
                                childAt.setElevation(qs0Var.w);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            ms0 ms0Var2 = (ms0) map2.get(num);
            if (ms0Var2 != null) {
                ns0 ns0Var2 = ms0Var2.n;
                if (ns0Var2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ax axVar2 = new ax(context);
                    axVar2.j = new int[32];
                    axVar2.c = new HashMap();
                    axVar2.a = context;
                    axVar2.j(null);
                    axVar2.setVisibility(8);
                    axVar2.setId(num.intValue());
                    int[] iArr2 = ns0Var2.i0;
                    if (iArr2 != null) {
                        axVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = ns0Var2.j0;
                        if (str3 != null) {
                            int[] iArrR2 = r(axVar2, str3);
                            ns0Var2.i0 = iArrR2;
                            axVar2.setReferencedIds(iArrR2);
                        }
                    }
                    axVar2.setType(ns0Var2.f0);
                    axVar2.setMargin(ns0Var2.g0);
                    fs0 fs0VarN = ConstraintLayout.n();
                    axVar2.m();
                    ms0Var2.g(fs0VarN);
                    constraintLayout.addView(axVar2, fs0VarN);
                }
                if (ns0Var2.g) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    fs0 fs0VarN2 = ConstraintLayout.n();
                    ms0Var2.g(fs0VarN2);
                    constraintLayout.addView(guideline, fs0VarN2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof ds0) {
                ((ds0) childAt2).x(constraintLayout);
            }
        }
    }

    public final void v(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ms0 ms0VarN = n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        ms0VarN.n.g = true;
                    }
                    this.y.put(Integer.valueOf(ms0VarN.g), ms0VarN);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    public final void y(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        rs0 rs0Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = rs0Var.y;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            fs0 fs0Var = (fs0) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                t94.v("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new ms0());
            }
            ms0 ms0Var = (ms0) map2.get(Integer.valueOf(id));
            if (ms0Var == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                ps0 ps0Var = ms0Var.y;
                ns0 ns0Var = ms0Var.n;
                qs0 qs0Var = ms0Var.v;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = rs0Var.g;
                for (String str : map4.keySet()) {
                    bs0 bs0Var = (bs0) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new bs0(bs0Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new bs0(bs0Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
                    }
                    map4 = map5;
                }
                ms0Var.x = map3;
                ms0Var.g = id;
                ns0Var.j = fs0Var.v;
                ns0Var.t = fs0Var.x;
                ns0Var.a = fs0Var.l;
                ns0Var.m = fs0Var.j;
                ns0Var.q = fs0Var.t;
                ns0Var.w = fs0Var.a;
                ns0Var.c = fs0Var.m;
                ns0Var.i = fs0Var.q;
                ns0Var.b = fs0Var.w;
                ns0Var.s = fs0Var.c;
                ns0Var.p = fs0Var.i;
                ns0Var.u = fs0Var.u;
                ns0Var.z = fs0Var.z;
                ns0Var.h = fs0Var.h;
                ns0Var.o = fs0Var.o;
                ns0Var.f = fs0Var.E;
                ns0Var.k = fs0Var.F;
                ns0Var.d = fs0Var.G;
                ns0Var.e = fs0Var.b;
                ns0Var.A = fs0Var.s;
                ns0Var.B = fs0Var.p;
                ns0Var.C = fs0Var.T;
                ns0Var.D = fs0Var.U;
                ns0Var.E = fs0Var.V;
                ns0Var.x = fs0Var.r;
                ns0Var.n = fs0Var.g;
                ns0Var.v = fs0Var.y;
                ns0Var.y = ((ViewGroup.MarginLayoutParams) fs0Var).width;
                ns0Var.r = ((ViewGroup.MarginLayoutParams) fs0Var).height;
                ns0Var.F = ((ViewGroup.MarginLayoutParams) fs0Var).leftMargin;
                ns0Var.G = ((ViewGroup.MarginLayoutParams) fs0Var).rightMargin;
                ns0Var.H = ((ViewGroup.MarginLayoutParams) fs0Var).topMargin;
                ns0Var.I = ((ViewGroup.MarginLayoutParams) fs0Var).bottomMargin;
                ns0Var.L = fs0Var.D;
                ns0Var.T = fs0Var.I;
                ns0Var.U = fs0Var.H;
                ns0Var.W = fs0Var.K;
                ns0Var.V = fs0Var.J;
                ns0Var.l0 = fs0Var.W;
                ns0Var.m0 = fs0Var.X;
                ns0Var.X = fs0Var.L;
                ns0Var.Y = fs0Var.M;
                ns0Var.Z = fs0Var.P;
                ns0Var.a0 = fs0Var.Q;
                ns0Var.b0 = fs0Var.N;
                ns0Var.c0 = fs0Var.O;
                ns0Var.d0 = fs0Var.R;
                ns0Var.e0 = fs0Var.S;
                ns0Var.k0 = fs0Var.Y;
                ns0Var.N = fs0Var.k;
                ns0Var.P = fs0Var.e;
                ns0Var.M = fs0Var.f;
                ns0Var.O = fs0Var.d;
                ns0Var.R = fs0Var.A;
                ns0Var.Q = fs0Var.B;
                ns0Var.S = fs0Var.C;
                ns0Var.o0 = fs0Var.Z;
                ns0Var.J = fs0Var.getMarginEnd();
                ns0Var.K = fs0Var.getMarginStart();
                ps0Var.g = childAt.getVisibility();
                ps0Var.r = childAt.getAlpha();
                qs0Var.g = childAt.getRotation();
                qs0Var.y = childAt.getRotationX();
                qs0Var.r = childAt.getRotationY();
                qs0Var.n = childAt.getScaleX();
                qs0Var.v = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    qs0Var.x = pivotX;
                    qs0Var.l = pivotY;
                }
                qs0Var.t = childAt.getTranslationX();
                qs0Var.a = childAt.getTranslationY();
                qs0Var.m = childAt.getTranslationZ();
                if (qs0Var.q) {
                    qs0Var.w = childAt.getElevation();
                }
                if (childAt instanceof ax) {
                    ax axVar = (ax) childAt;
                    ns0Var.n0 = axVar.getAllowsGoneWidget();
                    ns0Var.i0 = axVar.getReferencedIds();
                    ns0Var.f0 = axVar.getType();
                    ns0Var.g0 = axVar.getMargin();
                }
            }
            i3 = i2 + 1;
            rs0Var = this;
            childCount = i;
            map2 = map;
        }
    }
}
