package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t55 extends zz4 implements bz1 {
    public final /* synthetic */ b65 c;
    public final /* synthetic */ byte q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t55(b65 b65Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = b65Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        b65 b65Var = this.c;
        switch (b) {
            case 0:
                return new t55(b65Var, mu0Var, (byte) 0);
            default:
                return new t55(b65Var, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                long j = ((wi3) obj).g;
                return new t55(this.c, (mu0) obj2, (byte) 0).u(og5Var);
            default:
                return ((t55) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object ai0Var;
        Object cjVar;
        CharSequence text;
        int i;
        cj cjVar2;
        byte b = this.q;
        px0 px0Var = px0.j;
        byte b2 = 1;
        b65 b65Var = this.c;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                byte b3 = this.w;
                if (b3 != 0) {
                    if (b3 == 1) {
                        js2.o(obj);
                    } else {
                        if (b3 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    return og5Var;
                }
                js2.o(obj);
                this.w = (byte) 1;
                if (b65Var.z(this) == px0Var) {
                    return px0Var;
                }
                fp3 fp3VarX = b65Var.x();
                if (fp3VarX != null) {
                    String str = (String) fp3VarX.j;
                    long j = ((u75) fp3VarX.t).g;
                    mt3 mt3Var = b65Var.t;
                    if (mt3Var != null) {
                        this.w = (byte) 2;
                        rt3 rt3Var = (rt3) mt3Var;
                        Object objF0 = (str.length() == 0 || u75.r(j)) ? og5Var : m50.f0(rt3Var.g, new n10(rt3Var, new ot3(j, (mu0) null, rt3Var, str), (mu0) null), this);
                        if (objF0 != px0Var) {
                            objF0 = og5Var;
                        }
                        if (objF0 == px0Var) {
                            return px0Var;
                        }
                    }
                }
                return og5Var;
            default:
                byte b4 = this.w;
                if (b4 == 0) {
                    js2.o(obj);
                    bi0 bi0Var = b65Var.l;
                    if (bi0Var != null) {
                        this.w = (byte) 1;
                        ClipData primaryClip = ((g9) bi0Var).g.g().getPrimaryClip();
                        ai0Var = primaryClip != null ? new ai0(primaryClip) : null;
                        if (ai0Var == px0Var) {
                            return px0Var;
                        }
                    }
                    return og5Var;
                }
                if (b4 == 1) {
                    js2.o(obj);
                    ai0Var = obj;
                } else {
                    if (b4 != 2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    cjVar = obj;
                }
                cjVar2 = (cj) cjVar;
                if (cjVar2 != null && b65Var.j()) {
                    aj ajVar = new aj(mu5.q(b65Var.q(), b65Var.q().g.t.length()));
                    ajVar.g(cjVar2);
                    cj cjVarV = ajVar.v();
                    cj cjVarM = mu5.m(b65Var.q(), b65Var.q().g.t.length());
                    aj ajVar2 = new aj(cjVarV);
                    ajVar2.g(cjVarM);
                    cj cjVarV2 = ajVar2.v();
                    int length = cjVar2.t.length() + u75.x(b65Var.q().y);
                    b65Var.r.a(b65.y(cjVarV2, sp2.y(length, length)));
                    b65Var.p(r42.j);
                    b65Var.g.v = true;
                }
                return og5Var;
                ai0 ai0Var2 = (ai0) ai0Var;
                if (ai0Var2 != null) {
                    this.w = (byte) 2;
                    int i2 = 0;
                    ClipData.Item itemAt = ai0Var2.g.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        cjVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i3 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i3];
                                if (yf2.p(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i2);
                                    parcelObtain.unmarshall(bArrDecode, i2, bArrDecode.length);
                                    parcelObtain.setDataPosition(i2);
                                    long j2 = jj0.j;
                                    long j3 = j2;
                                    long jO = n85.r;
                                    long jO2 = jO;
                                    qv1 qv1Var = null;
                                    lv1 lv1Var = null;
                                    mv1 mv1Var = null;
                                    String string = null;
                                    ry ryVar = null;
                                    n65 n65Var = null;
                                    l45 l45Var = null;
                                    ym4 ym4Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > b2) {
                                            byte b5 = parcelObtain.readByte();
                                            if (b5 != b2) {
                                                i2 = i2;
                                                spanned = spanned;
                                                if (b5 == 2) {
                                                    if (parcelObtain.dataAvail() >= 5) {
                                                        byte b6 = parcelObtain.readByte();
                                                        long j4 = b6 == b2 ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                        jO = o85.g(j4, 0L) ? n85.r : kq2.O(parcelObtain.readFloat(), j4);
                                                        b2 = 1;
                                                    }
                                                } else if (b5 == 3) {
                                                    if (parcelObtain.dataAvail() >= 4) {
                                                        qv1Var = new qv1(parcelObtain.readInt());
                                                        b2 = 1;
                                                        i2 = i2;
                                                    }
                                                } else if (b5 == 4) {
                                                    b2 = 1;
                                                    if (parcelObtain.dataAvail() >= 1) {
                                                        byte b7 = parcelObtain.readByte();
                                                        lv1 lv1Var2 = new lv1((b7 != 0 && b7 == 1) ? 1 : i2);
                                                        i2 = i2;
                                                        lv1Var = lv1Var2;
                                                        spanned = spanned;
                                                    }
                                                } else if (b5 != 5) {
                                                    if (b5 == 6) {
                                                        string = parcelObtain.readString();
                                                    } else if (b5 == 7) {
                                                        if (parcelObtain.dataAvail() >= 5) {
                                                            byte b8 = parcelObtain.readByte();
                                                            long j5 = b8 == 1 ? 4294967296L : b8 == 2 ? 8589934592L : 0L;
                                                            jO2 = o85.g(j5, 0L) ? n85.r : kq2.O(parcelObtain.readFloat(), j5);
                                                        }
                                                    } else if (b5 == 8) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            ryVar = new ry(parcelObtain.readFloat());
                                                            b2 = 1;
                                                            spanned = spanned;
                                                        }
                                                    } else if (b5 == 9) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            n65Var = new n65(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                            b2 = 1;
                                                            i2 = i2;
                                                        }
                                                    } else if (b5 == 10) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            int i4 = jj0.t;
                                                            long j6 = parcelObtain.readLong();
                                                            long j7 = j6 & 63;
                                                            if (j7 >= 16) {
                                                                j6 = (j6 & (-64)) | (j7 + 1);
                                                            }
                                                            j3 = j6;
                                                        }
                                                    } else if (b5 != 11) {
                                                        if (b5 == 12) {
                                                            if (parcelObtain.dataAvail() >= 20) {
                                                                int i5 = jj0.t;
                                                                long j8 = parcelObtain.readLong();
                                                                long j9 = j8 & 63;
                                                                if (j9 >= 16) {
                                                                    j8 = (j8 & (-64)) | (j9 + 1);
                                                                }
                                                                ym4Var = new ym4(j8, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L), parcelObtain.readFloat());
                                                            }
                                                        }
                                                        b2 = 1;
                                                    } else if (parcelObtain.dataAvail() >= 4) {
                                                        int i6 = parcelObtain.readInt();
                                                        int i7 = (i6 & 2) != 0 ? 1 : i2;
                                                        int i8 = (i6 & 1) != 0 ? 1 : i2;
                                                        l45 l45Var2 = l45.n;
                                                        l45 l45Var3 = l45.r;
                                                        if (i7 != 0 && i8 != 0) {
                                                            List listD = pw5.d(l45Var2, l45Var3);
                                                            Integer numValueOf = Integer.valueOf(i2);
                                                            int size = listD.size();
                                                            for (int i9 = i2; i9 < size; i9++) {
                                                                numValueOf = Integer.valueOf(numValueOf.intValue() | ((l45) listD.get(i9)).g);
                                                            }
                                                            l45Var2 = new l45(numValueOf.intValue());
                                                        } else if (i7 == 0) {
                                                            l45Var = i8 != 0 ? l45Var3 : l45.y;
                                                        }
                                                        l45Var = l45Var2;
                                                    }
                                                    b2 = 1;
                                                } else if (parcelObtain.dataAvail() >= 1) {
                                                    byte b9 = parcelObtain.readByte();
                                                    if (b9 == 0) {
                                                        i = i2;
                                                    } else if (b9 == 1) {
                                                        i = 65535;
                                                    } else if (b9 == 3) {
                                                        i = 2;
                                                    } else if (b9 == 2) {
                                                        i = 1;
                                                    } else {
                                                        i = i2;
                                                    }
                                                    mv1Var = new mv1(i);
                                                    b2 = 1;
                                                    spanned = spanned;
                                                }
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i10 = jj0.t;
                                                long j10 = parcelObtain.readLong();
                                                long j11 = j10 & 63;
                                                j2 = j11 < 16 ? j10 : (j10 & (-64)) | (j11 + 1);
                                            }
                                        }
                                        i2 = i2;
                                        spanned = spanned;
                                    }
                                    arrayList.add(new bj(spanStart, spanEnd, new ju4(j2, jO, qv1Var, lv1Var, mv1Var, (lu1) null, string, jO2, ryVar, n65Var, (tx2) null, j3, l45Var, ym4Var, 49152)));
                                } else {
                                    i2 = i2;
                                    spanned = spanned;
                                }
                                if (i3 != length2) {
                                    i3++;
                                    i2 = i2;
                                    spanned = spanned;
                                    b2 = 1;
                                }
                            }
                        }
                        String string2 = text.toString();
                        cj cjVar3 = dj.g;
                        cjVar = new cj(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        cjVar = new cj(text.toString());
                    }
                    if (cjVar == px0Var) {
                        return px0Var;
                    }
                    cjVar2 = (cj) cjVar;
                    if (cjVar2 != null) {
                        aj ajVar3 = new aj(mu5.q(b65Var.q(), b65Var.q().g.t.length()));
                        ajVar3.g(cjVar2);
                        cj cjVarV3 = ajVar3.v();
                        cj cjVarM2 = mu5.m(b65Var.q(), b65Var.q().g.t.length());
                        aj ajVar4 = new aj(cjVarV3);
                        ajVar4.g(cjVarM2);
                        cj cjVarV4 = ajVar4.v();
                        int length3 = cjVar2.t.length() + u75.x(b65Var.q().y);
                        b65Var.r.a(b65.y(cjVarV4, sp2.y(length3, length3)));
                        b65Var.p(r42.j);
                        b65Var.g.v = true;
                    }
                }
                return og5Var;
        }
    }
}
