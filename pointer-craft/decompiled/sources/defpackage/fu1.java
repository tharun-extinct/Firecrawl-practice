package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fu1 implements Comparator {
    public final /* synthetic */ byte g;
    public static final fu1 y = new fu1(0);
    public static final fu1 r = new fu1(1);
    public static final fu1 n = new fu1(2);
    public static final fu1 v = new fu1(3);
    public static final /* synthetic */ fu1 x = new fu1(17);

    public /* synthetic */ fu1(byte b) {
        this.g = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                cu1 cu1Var = (cu1) obj;
                cu1 cu1Var2 = (cu1) obj2;
                if (og0.C(cu1Var) && og0.C(cu1Var2)) {
                    um2 um2VarV = k33.V(cu1Var);
                    um2 um2VarV2 = k33.V(cu1Var2);
                    if (!yf2.p(um2VarV, um2VarV2)) {
                        Object[] objArr = new um2[16];
                        int i = 0;
                        while (um2VarV != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = um2VarV;
                            i++;
                            um2VarV = um2VarV.o();
                        }
                        Object[] objArr3 = new um2[16];
                        int i3 = 0;
                        while (um2VarV2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = um2VarV2;
                            i3++;
                            um2VarV2 = um2VarV2.o();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (yf2.p(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return yf2.f(((um2) objArr[i5]).f(), ((um2) objArr3[i5]).f());
                        }
                        l0.z("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (og0.C(cu1Var)) {
                        return -1;
                    }
                    if (og0.C(cu1Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                k44 k44VarJ = ((gj4) obj).j();
                k44 k44VarJ2 = ((gj4) obj2).j();
                int iCompare = Float.compare(k44VarJ.g, k44VarJ2.g);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(k44VarJ.y, k44VarJ2.y);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(k44VarJ.n, k44VarJ2.n);
                return iCompare3 != 0 ? iCompare3 : Float.compare(k44VarJ.r, k44VarJ2.r);
            case 2:
                k44 k44VarJ3 = ((gj4) obj).j();
                k44 k44VarJ4 = ((gj4) obj2).j();
                int iCompare4 = Float.compare(k44VarJ4.r, k44VarJ3.r);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(k44VarJ3.y, k44VarJ4.y);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(k44VarJ3.n, k44VarJ4.n);
                return iCompare6 != 0 ? iCompare6 : Float.compare(k44VarJ4.g, k44VarJ3.g);
            case 3:
                fp3 fp3Var = (fp3) obj;
                fp3 fp3Var2 = (fp3) obj2;
                int iCompare7 = Float.compare(((k44) fp3Var.j).y, ((k44) fp3Var2.j).y);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((k44) fp3Var.j).n, ((k44) fp3Var2.j).n);
            case 4:
                return Integer.valueOf(((bj) obj).y).compareTo(Integer.valueOf(((bj) obj2).y));
            case 5:
                return Integer.valueOf(((bj) obj).y).compareTo(Integer.valueOf(((bj) obj2).y));
            case 6:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (yf2.f(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                        return -1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 >= length4) {
                    return 1;
                }
                return -1;
            case 7:
                WeakHashMap weakHashMap = xk5.g;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 8:
                m02 m02Var = (m02) obj;
                m02 m02Var2 = (m02) obj2;
                RecyclerView recyclerView = m02Var.n;
                if ((recyclerView == null) == (m02Var2.n == null)) {
                    boolean z3 = m02Var.g;
                    if (z3 == m02Var2.g) {
                        int i7 = m02Var2.y - m02Var.y;
                        if (i7 != 0) {
                            return i7;
                        }
                        int i8 = m02Var.r - m02Var2.r;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 9:
                return ((mk2) obj).y.compareTo(((mk2) obj2).y);
            case 10:
                return Integer.valueOf(((c43) obj).y).compareTo(Integer.valueOf(((c43) obj2).y));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(((c43) obj).g).compareTo(Integer.valueOf(((c43) obj2).g));
            case 12:
                return c93.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 13:
                return c93.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 14:
                return c93.f(((c25) obj).g, ((c25) obj2).g);
            case kq2.x /* 15 */:
                return c93.f(((e25) obj).g, ((e25) obj2).g);
            case 16:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                tn1 tn1Var = (tn1) obj2;
                tn1 tn1Var2 = (tn1) obj;
                return !tn1Var2.j.equals(tn1Var.j) ? tn1Var2.j.compareTo(tn1Var.j) : Long.compare(tn1Var2.r(), tn1Var.r());
        }
    }
}
