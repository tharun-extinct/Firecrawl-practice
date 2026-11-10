package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zl4 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ zl4(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00da A[LOOP:0: B:25:0x00aa->B:36:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0114 A[LOOP:2: B:42:0x00e5->B:53:0x0114, LOOP_END] */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        Object next;
        String str;
        fp3 fp3Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                km3 km3Var = (km3) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yf6.v(km3Var, h02Var, 0);
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 1:
                lm3 lm3Var = (lm3) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yf6.v(lm3Var, h02Var2, 0);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 2:
                jm3 jm3Var = (jm3) obj3;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    yf6.v(jm3Var, h02Var3, 0);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            case 3:
                hm3 hm3Var = (hm3) obj3;
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    yf6.v(hm3Var, h02Var4, 0);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 4:
                ((Integer) obj2).getClass();
                yf6.v((nm3) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 5:
                ja3 ja3Var = (ja3) obj3;
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    cr4.g.g(ja3Var, null, cr4.n(h02Var5), true, 0L, h02Var5, 199686);
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 6:
                mm3 mm3Var = (mm3) obj3;
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    yf6.v(mm3Var.y, h02Var6, 0);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iX = tx4.X(charSequence, (char[]) obj3, iIntValue7, false);
                if (iX < 0) {
                    return null;
                }
                return new fp3(Integer.valueOf(iX), 1);
            case 8:
                List list = (List) obj3;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                if (list.size() == 1) {
                    String str5 = (String) cj0.z0(list);
                    int iW = tx4.W(charSequence2, str5, iIntValue8, false, 4);
                    if (iW < 0) {
                        fp3Var = null;
                    } else {
                        fp3Var = new fp3(Integer.valueOf(iW), str5);
                    }
                } else {
                    if (iIntValue8 < 0) {
                        iIntValue8 = 0;
                    }
                    me2 me2Var = new me2(iIntValue8, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i = me2Var.a;
                    int i2 = me2Var.t;
                    if (z) {
                        if ((i <= 0 || iIntValue8 > i2) && (i >= 0 || i2 > iIntValue8)) {
                            fp3Var = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        fp3Var = new fp3(Integer.valueOf(iIntValue8), str3);
                                    } else if (iIntValue8 != i2) {
                                        iIntValue8 += i;
                                    } else {
                                        fp3Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence2, iIntValue8, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    fp3Var = new fp3(Integer.valueOf(iIntValue8), str3);
                                } else if (iIntValue8 != i2) {
                                    iIntValue8 += i;
                                } else {
                                    fp3Var = null;
                                }
                            }
                        }
                    } else if ((i <= 0 || iIntValue8 > i2) && (i >= 0 || i2 > iIntValue8)) {
                        fp3Var = null;
                    } else {
                        int i3 = iIntValue8;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    fp3Var = new fp3(Integer.valueOf(i3), str);
                                } else if (i3 != i2) {
                                    i3 += i;
                                } else {
                                    fp3Var = null;
                                }
                            } while (!tx4.c0(str2, 0, charSequence2, i3, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                fp3Var = new fp3(Integer.valueOf(i3), str);
                            } else if (i3 != i2) {
                                i3 += i;
                            } else {
                                fp3Var = null;
                            }
                        }
                    }
                }
                if (fp3Var != null) {
                    return new fp3(fp3Var.j, Integer.valueOf(((String) fp3Var.t).length()));
                }
                return null;
            case 9:
                h02 h02Var7 = (h02) obj;
                ((Integer) obj2).getClass();
                h02Var7.X(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                h02Var7.b(false);
                return strValueOf;
            case 10:
                h02 h02Var8 = (h02) obj;
                ((Integer) obj2).getClass();
                h02Var8.X(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                h02Var8.b(false);
                return string;
            default:
                ((Integer) obj2).getClass();
                ((o75) obj3).g(aq2.J(1), (h02) obj);
                return og5Var;
        }
    }

    public /* synthetic */ zl4(Object obj, int i, byte b) {
        this.j = b;
        this.t = obj;
    }
}
