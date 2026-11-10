package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class yv5 implements Parcelable.Creator {
    public final /* synthetic */ byte g;

    public /* synthetic */ yv5(byte b) {
        this.g = b;
    }

    public static void g(p12 p12Var, Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        int i2 = p12Var.j;
        ef6.x(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = p12Var.t;
        ef6.x(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = p12Var.a;
        ef6.x(parcel, 3, 4);
        parcel.writeInt(i4);
        ef6.r(parcel, 4, p12Var.m);
        IBinder iBinder = p12Var.q;
        if (iBinder != null) {
            int iL2 = ef6.l(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            ef6.j(parcel, iL2);
        }
        ef6.n(parcel, 6, p12Var.w, i);
        Bundle bundle = p12Var.c;
        if (bundle != null) {
            int iL3 = ef6.l(parcel, 7);
            parcel.writeBundle(bundle);
            ef6.j(parcel, iL3);
        }
        ef6.y(parcel, 8, p12Var.i, i);
        ef6.n(parcel, 10, p12Var.b, i);
        ef6.n(parcel, 11, p12Var.s, i);
        boolean z = p12Var.p;
        ef6.x(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = p12Var.u;
        ef6.x(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = p12Var.z;
        ef6.x(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ef6.r(parcel, 15, p12Var.h);
        ef6.j(parcel, iL);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = 0;
        Account account = null;
        String strY = null;
        String strY2 = null;
        String strY3 = null;
        String strY4 = null;
        String strY5 = null;
        String strY6 = null;
        String strY7 = null;
        switch (this.g) {
            case 0:
                int iM = df6.m(parcel);
                int iJ2 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iJ = df6.j(parcel, i);
                    } else if (c == 2) {
                        account = (Account) df6.g(parcel, i, Account.CREATOR);
                    } else if (c == 3) {
                        iJ2 = df6.j(parcel, i);
                    } else if (c != 4) {
                        df6.a(parcel, i);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) df6.g(parcel, i, GoogleSignInAccount.CREATOR);
                    }
                }
                df6.v(parcel, iM);
                return new xv5(iJ, account, iJ2, googleSignInAccount);
            case 1:
                int iM2 = df6.m(parcel);
                int iJ3 = 0;
                boolean zL = false;
                boolean zL2 = false;
                IBinder iBinder = null;
                kq0 kq0Var = null;
                while (parcel.dataPosition() < iM2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iJ3 = df6.j(parcel, i2);
                    } else if (c2 == 2) {
                        int iT = df6.t(parcel, i2);
                        int iDataPosition = parcel.dataPosition();
                        if (iT == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition + iT);
                            iBinder = strongBinder;
                        }
                    } else if (c2 == 3) {
                        kq0Var = (kq0) df6.g(parcel, i2, kq0.CREATOR);
                    } else if (c2 == 4) {
                        zL = df6.l(parcel, i2);
                    } else if (c2 != 5) {
                        df6.a(parcel, i2);
                    } else {
                        zL2 = df6.l(parcel, i2);
                    }
                }
                df6.v(parcel, iM2);
                return new aw5(iJ3, iBinder, kq0Var, zL, zL2);
            case 2:
                int iM3 = df6.m(parcel);
                int iJ4 = 0;
                int iJ5 = 0;
                PendingIntent pendingIntent = null;
                String strY8 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iM3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iJ4 = df6.j(parcel, i3);
                    } else if (c3 == 2) {
                        iJ5 = df6.j(parcel, i3);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) df6.g(parcel, i3, PendingIntent.CREATOR);
                    } else if (c3 == 4) {
                        strY8 = df6.y(parcel, i3);
                    } else if (c3 != 5) {
                        df6.a(parcel, i3);
                    } else {
                        int iT2 = df6.t(parcel, i3);
                        if (iT2 == 0) {
                            numValueOf = null;
                        } else {
                            if (iT2 != 4) {
                                String hexString = Integer.toHexString(iT2);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iT2).length() + 4 + 1);
                                sb.append("Expected size ");
                                sb.append(4);
                                sb.append(" got ");
                                sb.append(iT2);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new il0(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                df6.v(parcel, iM3);
                return new kq0(iJ4, iJ5, pendingIntent, strY8, numValueOf);
            case 3:
                int iM4 = df6.m(parcel);
                int iJ6 = 0;
                boolean zL3 = false;
                boolean zL4 = false;
                int iJ7 = 0;
                int iJ8 = 0;
                while (parcel.dataPosition() < iM4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        iJ6 = df6.j(parcel, i4);
                    } else if (c4 == 2) {
                        zL3 = df6.l(parcel, i4);
                    } else if (c4 == 3) {
                        zL4 = df6.l(parcel, i4);
                    } else if (c4 == 4) {
                        iJ7 = df6.j(parcel, i4);
                    } else if (c4 != 5) {
                        df6.a(parcel, i4);
                    } else {
                        iJ8 = df6.j(parcel, i4);
                    }
                }
                df6.v(parcel, iM4);
                return new ga4(iJ6, zL3, zL4, iJ7, iJ8);
            case 4:
                return new dw5((PendingIntent) parcel.readParcelable(s84.class.getClassLoader()), parcel.readInt() != 0);
            case 5:
                int iM5 = df6.m(parcel);
                int iJ9 = 0;
                boolean zL5 = false;
                String strY9 = null;
                long j = -1;
                while (parcel.dataPosition() < iM5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        strY9 = df6.y(parcel, i5);
                    } else if (c5 == 2) {
                        iJ9 = df6.j(parcel, i5);
                    } else if (c5 == 3) {
                        df6.q(parcel, i5, 8);
                        j = parcel.readLong();
                    } else if (c5 != 4) {
                        df6.a(parcel, i5);
                    } else {
                        zL5 = df6.l(parcel, i5);
                    }
                }
                df6.v(parcel, iM5);
                return new tn1(strY9, iJ9, j, zL5);
            case 6:
                return new iw5(parcel.readStrongBinder());
            case 7:
                int iM6 = df6.m(parcel);
                while (parcel.dataPosition() < iM6) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        iJ = df6.j(parcel, i6);
                    } else if (c6 != 2) {
                        df6.a(parcel, i6);
                    } else {
                        strY7 = df6.y(parcel, i6);
                    }
                }
                df6.v(parcel, iM6);
                return new Scope(strY7, iJ);
            case 8:
                int iM7 = df6.m(parcel);
                PendingIntent pendingIntent2 = null;
                kq0 kq0Var2 = null;
                while (parcel.dataPosition() < iM7) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 1) {
                        iJ = df6.j(parcel, i7);
                    } else if (c7 == 2) {
                        strY6 = df6.y(parcel, i7);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) df6.g(parcel, i7, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        df6.a(parcel, i7);
                    } else {
                        kq0Var2 = (kq0) df6.g(parcel, i7, kq0.CREATOR);
                    }
                }
                df6.v(parcel, iM7);
                return new Status(iJ, strY6, pendingIntent2, kq0Var2);
            case 9:
                int iM8 = df6.m(parcel);
                Bundle bundle = null;
                tn1[] tn1VarArr = null;
                pq0 pq0Var = null;
                while (parcel.dataPosition() < iM8) {
                    int i8 = parcel.readInt();
                    char c8 = (char) i8;
                    if (c8 == 1) {
                        int iT3 = df6.t(parcel, i8);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iT3 == 0) {
                            bundle = null;
                        } else {
                            Bundle bundle2 = parcel.readBundle();
                            parcel.setDataPosition(iDataPosition2 + iT3);
                            bundle = bundle2;
                        }
                    } else if (c8 == 2) {
                        tn1VarArr = (tn1[]) df6.r(parcel, i8, tn1.CREATOR);
                    } else if (c8 == 3) {
                        iJ = df6.j(parcel, i8);
                    } else if (c8 != 4) {
                        df6.a(parcel, i8);
                    } else {
                        pq0Var = (pq0) df6.g(parcel, i8, pq0.CREATOR);
                    }
                }
                df6.v(parcel, iM8);
                tb6 tb6Var = new tb6();
                tb6Var.j = bundle;
                tb6Var.t = tn1VarArr;
                tb6Var.a = iJ;
                tb6Var.m = pq0Var;
                return tb6Var;
            case 10:
                int iM9 = df6.m(parcel);
                boolean zL6 = false;
                boolean zL7 = false;
                int iJ10 = 0;
                ga4 ga4Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iM9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            ga4Var = (ga4) df6.g(parcel, i9, ga4.CREATOR);
                            break;
                        case 2:
                            zL6 = df6.l(parcel, i9);
                            break;
                        case 3:
                            zL7 = df6.l(parcel, i9);
                            break;
                        case 4:
                            int iT4 = df6.t(parcel, i9);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iT4 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iT4);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iJ10 = df6.j(parcel, i9);
                            break;
                        case 6:
                            int iT5 = df6.t(parcel, i9);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iT5 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition4 + iT5);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            df6.a(parcel, i9);
                            break;
                    }
                }
                df6.v(parcel, iM9);
                return new pq0(ga4Var, zL6, zL7, iArr, iJ10, iArr2);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                int iM10 = df6.m(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = p12.o;
                tn1[] tn1VarArr2 = p12.f;
                tn1[] tn1VarArr3 = tn1VarArr2;
                int iJ11 = 0;
                int iJ12 = 0;
                int iJ13 = 0;
                boolean zL8 = false;
                int iJ14 = 0;
                boolean zL9 = false;
                String strY10 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String strY11 = null;
                while (parcel.dataPosition() < iM10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iJ11 = df6.j(parcel, i10);
                            break;
                        case 2:
                            iJ12 = df6.j(parcel, i10);
                            break;
                        case 3:
                            iJ13 = df6.j(parcel, i10);
                            break;
                        case 4:
                            strY10 = df6.y(parcel, i10);
                            break;
                        case 5:
                            int iT6 = df6.t(parcel, i10);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iT6 != 0) {
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition5 + iT6);
                                iBinder2 = strongBinder2;
                            } else {
                                iBinder2 = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) df6.r(parcel, i10, Scope.CREATOR);
                            break;
                        case 7:
                            int iT7 = df6.t(parcel, i10);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iT7 != 0) {
                                Bundle bundle4 = parcel.readBundle();
                                parcel.setDataPosition(iDataPosition6 + iT7);
                                bundle3 = bundle4;
                            } else {
                                bundle3 = null;
                            }
                            break;
                        case '\b':
                            account2 = (Account) df6.g(parcel, i10, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            df6.a(parcel, i10);
                            break;
                        case '\n':
                            tn1VarArr2 = (tn1[]) df6.r(parcel, i10, tn1.CREATOR);
                            break;
                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            tn1VarArr3 = (tn1[]) df6.r(parcel, i10, tn1.CREATOR);
                            break;
                        case '\f':
                            zL8 = df6.l(parcel, i10);
                            break;
                        case '\r':
                            iJ14 = df6.j(parcel, i10);
                            break;
                        case 14:
                            zL9 = df6.l(parcel, i10);
                            break;
                        case kq2.x /* 15 */:
                            strY11 = df6.y(parcel, i10);
                            break;
                    }
                }
                df6.v(parcel, iM10);
                return new p12(iJ11, iJ12, iJ13, strY10, iBinder2, scopeArr, bundle3, account2, tn1VarArr2, tn1VarArr3, zL8, iJ14, zL9, strY11);
            case 12:
                int iM11 = df6.m(parcel);
                while (true) {
                    String[] strArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM11) {
                            df6.v(parcel, iM11);
                            return new ci6(iJ, strArr);
                        }
                        int i11 = parcel.readInt();
                        char c9 = (char) i11;
                        if (c9 == 1) {
                            iJ = df6.j(parcel, i11);
                        } else if (c9 != 2) {
                            df6.a(parcel, i11);
                        } else {
                            int iT8 = df6.t(parcel, i11);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iT8 == 0) {
                            }
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition7 + iT8);
                            strArr = strArrCreateStringArray;
                        }
                        break;
                    }
                }
                break;
            case 13:
                int iM12 = df6.m(parcel);
                int iJ15 = 0;
                int iJ16 = 0;
                String strY12 = null;
                String strY13 = null;
                byte[] bArr = null;
                Point[] pointArr = null;
                hi6 hi6Var = null;
                ki6 ki6Var = null;
                li6 li6Var = null;
                ni6 ni6Var = null;
                mi6 mi6Var = null;
                ii6 ii6Var = null;
                ei6 ei6Var = null;
                fi6 fi6Var = null;
                gi6 gi6Var = null;
                while (parcel.dataPosition() < iM12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iJ15 = df6.j(parcel, i12);
                            break;
                        case 2:
                            strY12 = df6.y(parcel, i12);
                            break;
                        case 3:
                            strY13 = df6.y(parcel, i12);
                            break;
                        case 4:
                            int iT9 = df6.t(parcel, i12);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iT9 != 0) {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition8 + iT9);
                                bArr = bArrCreateByteArray;
                            } else {
                                bArr = null;
                            }
                            break;
                        case 5:
                            pointArr = (Point[]) df6.r(parcel, i12, Point.CREATOR);
                            break;
                        case 6:
                            iJ16 = df6.j(parcel, i12);
                            break;
                        case 7:
                            hi6Var = (hi6) df6.g(parcel, i12, hi6.CREATOR);
                            break;
                        case '\b':
                            ki6Var = (ki6) df6.g(parcel, i12, ki6.CREATOR);
                            break;
                        case '\t':
                            li6Var = (li6) df6.g(parcel, i12, li6.CREATOR);
                            break;
                        case '\n':
                            ni6Var = (ni6) df6.g(parcel, i12, ni6.CREATOR);
                            break;
                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            mi6Var = (mi6) df6.g(parcel, i12, mi6.CREATOR);
                            break;
                        case '\f':
                            ii6Var = (ii6) df6.g(parcel, i12, ii6.CREATOR);
                            break;
                        case '\r':
                            ei6Var = (ei6) df6.g(parcel, i12, ei6.CREATOR);
                            break;
                        case 14:
                            fi6Var = (fi6) df6.g(parcel, i12, fi6.CREATOR);
                            break;
                        case kq2.x /* 15 */:
                            gi6Var = (gi6) df6.g(parcel, i12, gi6.CREATOR);
                            break;
                        default:
                            df6.a(parcel, i12);
                            break;
                    }
                }
                df6.v(parcel, iM12);
                return new oi6(iJ15, strY12, strY13, bArr, pointArr, iJ16, hi6Var, ki6Var, li6Var, ni6Var, mi6Var, ii6Var, ei6Var, fi6Var, gi6Var);
            case 14:
                int iM13 = df6.m(parcel);
                int iJ17 = 0;
                int iJ18 = 0;
                int iJ19 = 0;
                int iJ20 = 0;
                int iJ21 = 0;
                int iJ22 = 0;
                boolean zL10 = false;
                String strY14 = null;
                while (parcel.dataPosition() < iM13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iJ17 = df6.j(parcel, i13);
                            break;
                        case 2:
                            iJ18 = df6.j(parcel, i13);
                            break;
                        case 3:
                            iJ19 = df6.j(parcel, i13);
                            break;
                        case 4:
                            iJ20 = df6.j(parcel, i13);
                            break;
                        case 5:
                            iJ21 = df6.j(parcel, i13);
                            break;
                        case 6:
                            iJ22 = df6.j(parcel, i13);
                            break;
                        case 7:
                            zL10 = df6.l(parcel, i13);
                            break;
                        case '\b':
                            strY14 = df6.y(parcel, i13);
                            break;
                        default:
                            df6.a(parcel, i13);
                            break;
                    }
                }
                df6.v(parcel, iM13);
                return new di6(iJ17, iJ18, iJ19, iJ20, iJ21, iJ22, zL10, strY14);
            case kq2.x /* 15 */:
                int iM14 = df6.m(parcel);
                String strY15 = null;
                String strY16 = null;
                String strY17 = null;
                String strY18 = null;
                String strY19 = null;
                di6 di6Var = null;
                di6 di6Var2 = null;
                while (parcel.dataPosition() < iM14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strY15 = df6.y(parcel, i14);
                            break;
                        case 2:
                            strY16 = df6.y(parcel, i14);
                            break;
                        case 3:
                            strY17 = df6.y(parcel, i14);
                            break;
                        case 4:
                            strY18 = df6.y(parcel, i14);
                            break;
                        case 5:
                            strY19 = df6.y(parcel, i14);
                            break;
                        case 6:
                            di6Var = (di6) df6.g(parcel, i14, di6.CREATOR);
                            break;
                        case 7:
                            di6Var2 = (di6) df6.g(parcel, i14, di6.CREATOR);
                            break;
                        default:
                            df6.a(parcel, i14);
                            break;
                    }
                }
                df6.v(parcel, iM14);
                return new ei6(strY15, strY16, strY17, strY18, strY19, di6Var, di6Var2);
            case 16:
                int iM15 = df6.m(parcel);
                ji6 ji6Var = null;
                String strY20 = null;
                String strY21 = null;
                ki6[] ki6VarArr = null;
                hi6[] hi6VarArr = null;
                String[] strArr2 = null;
                ci6[] ci6VarArr = null;
                while (parcel.dataPosition() < iM15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            ji6Var = (ji6) df6.g(parcel, i15, ji6.CREATOR);
                            break;
                        case 2:
                            strY20 = df6.y(parcel, i15);
                            break;
                        case 3:
                            strY21 = df6.y(parcel, i15);
                            break;
                        case 4:
                            ki6VarArr = (ki6[]) df6.r(parcel, i15, ki6.CREATOR);
                            break;
                        case 5:
                            hi6VarArr = (hi6[]) df6.r(parcel, i15, hi6.CREATOR);
                            break;
                        case 6:
                            int iT10 = df6.t(parcel, i15);
                            int iDataPosition9 = parcel.dataPosition();
                            if (iT10 != 0) {
                                String[] strArrCreateStringArray2 = parcel.createStringArray();
                                parcel.setDataPosition(iDataPosition9 + iT10);
                                strArr2 = strArrCreateStringArray2;
                            } else {
                                strArr2 = null;
                            }
                            break;
                        case 7:
                            ci6VarArr = (ci6[]) df6.r(parcel, i15, ci6.CREATOR);
                            break;
                        default:
                            df6.a(parcel, i15);
                            break;
                    }
                }
                df6.v(parcel, iM15);
                return new fi6(ji6Var, strY20, strY21, ki6VarArr, hi6VarArr, strArr2, ci6VarArr);
            case 17:
                int iM16 = df6.m(parcel);
                String strY22 = null;
                String strY23 = null;
                String strY24 = null;
                String strY25 = null;
                String strY26 = null;
                String strY27 = null;
                String strY28 = null;
                String strY29 = null;
                String strY30 = null;
                String strY31 = null;
                String strY32 = null;
                String strY33 = null;
                String strY34 = null;
                String strY35 = null;
                while (parcel.dataPosition() < iM16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strY22 = df6.y(parcel, i16);
                            break;
                        case 2:
                            strY23 = df6.y(parcel, i16);
                            break;
                        case 3:
                            strY24 = df6.y(parcel, i16);
                            break;
                        case 4:
                            strY25 = df6.y(parcel, i16);
                            break;
                        case 5:
                            strY26 = df6.y(parcel, i16);
                            break;
                        case 6:
                            strY27 = df6.y(parcel, i16);
                            break;
                        case 7:
                            strY28 = df6.y(parcel, i16);
                            break;
                        case '\b':
                            strY29 = df6.y(parcel, i16);
                            break;
                        case '\t':
                            strY30 = df6.y(parcel, i16);
                            break;
                        case '\n':
                            strY31 = df6.y(parcel, i16);
                            break;
                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            strY32 = df6.y(parcel, i16);
                            break;
                        case '\f':
                            strY33 = df6.y(parcel, i16);
                            break;
                        case '\r':
                            strY34 = df6.y(parcel, i16);
                            break;
                        case 14:
                            strY35 = df6.y(parcel, i16);
                            break;
                        default:
                            df6.a(parcel, i16);
                            break;
                    }
                }
                df6.v(parcel, iM16);
                return new gi6(strY22, strY23, strY24, strY25, strY26, strY27, strY28, strY29, strY30, strY31, strY32, strY33, strY34, strY35);
            case 18:
                int iM17 = df6.m(parcel);
                String strY36 = null;
                String strY37 = null;
                while (parcel.dataPosition() < iM17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        iJ = df6.j(parcel, i17);
                    } else if (c10 == 2) {
                        strY5 = df6.y(parcel, i17);
                    } else if (c10 == 3) {
                        strY36 = df6.y(parcel, i17);
                    } else if (c10 != 4) {
                        df6.a(parcel, i17);
                    } else {
                        strY37 = df6.y(parcel, i17);
                    }
                }
                df6.v(parcel, iM17);
                return new hi6(iJ, strY5, strY36, strY37);
            case 19:
                int iM18 = df6.m(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < iM18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        df6.q(parcel, i18, 8);
                        d = parcel.readDouble();
                    } else if (c11 != 2) {
                        df6.a(parcel, i18);
                    } else {
                        df6.q(parcel, i18, 8);
                        d2 = parcel.readDouble();
                    }
                }
                df6.v(parcel, iM18);
                return new ii6(d, d2);
            case 20:
                int iM19 = df6.m(parcel);
                String strY38 = null;
                String strY39 = null;
                String strY40 = null;
                String strY41 = null;
                String strY42 = null;
                String strY43 = null;
                String strY44 = null;
                while (parcel.dataPosition() < iM19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strY38 = df6.y(parcel, i19);
                            break;
                        case 2:
                            strY39 = df6.y(parcel, i19);
                            break;
                        case 3:
                            strY40 = df6.y(parcel, i19);
                            break;
                        case 4:
                            strY41 = df6.y(parcel, i19);
                            break;
                        case 5:
                            strY42 = df6.y(parcel, i19);
                            break;
                        case 6:
                            strY43 = df6.y(parcel, i19);
                            break;
                        case 7:
                            strY44 = df6.y(parcel, i19);
                            break;
                        default:
                            df6.a(parcel, i19);
                            break;
                    }
                }
                df6.v(parcel, iM19);
                return new ji6(strY38, strY39, strY40, strY41, strY42, strY43, strY44);
            case 21:
                int iM20 = df6.m(parcel);
                while (parcel.dataPosition() < iM20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iJ = df6.j(parcel, i20);
                    } else if (c12 != 2) {
                        df6.a(parcel, i20);
                    } else {
                        strY4 = df6.y(parcel, i20);
                    }
                }
                df6.v(parcel, iM20);
                return new ki6(strY4, iJ);
            case 22:
                int iM21 = df6.m(parcel);
                String strY45 = null;
                while (parcel.dataPosition() < iM21) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        strY3 = df6.y(parcel, i21);
                    } else if (c13 != 2) {
                        df6.a(parcel, i21);
                    } else {
                        strY45 = df6.y(parcel, i21);
                    }
                }
                df6.v(parcel, iM21);
                return new li6(strY3, strY45);
            case 23:
                int iM22 = df6.m(parcel);
                String strY46 = null;
                while (parcel.dataPosition() < iM22) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        strY2 = df6.y(parcel, i22);
                    } else if (c14 != 2) {
                        df6.a(parcel, i22);
                    } else {
                        strY46 = df6.y(parcel, i22);
                    }
                }
                df6.v(parcel, iM22);
                return new mi6(strY2, strY46);
            default:
                int iM23 = df6.m(parcel);
                String strY47 = null;
                while (parcel.dataPosition() < iM23) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        strY = df6.y(parcel, i23);
                    } else if (c15 == 2) {
                        strY47 = df6.y(parcel, i23);
                    } else if (c15 != 3) {
                        df6.a(parcel, i23);
                    } else {
                        iJ = df6.j(parcel, i23);
                    }
                }
                df6.v(parcel, iM23);
                return new ni6(iJ, strY, strY47);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.g) {
            case 0:
                return new xv5[i];
            case 1:
                return new aw5[i];
            case 2:
                return new kq0[i];
            case 3:
                return new ga4[i];
            case 4:
                return new s84[i];
            case 5:
                return new tn1[i];
            case 6:
                return new iw5[i];
            case 7:
                return new Scope[i];
            case 8:
                return new Status[i];
            case 9:
                return new tb6[i];
            case 10:
                return new pq0[i];
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new p12[i];
            case 12:
                return new ci6[i];
            case 13:
                return new oi6[i];
            case 14:
                return new di6[i];
            case kq2.x /* 15 */:
                return new ei6[i];
            case 16:
                return new fi6[i];
            case 17:
                return new gi6[i];
            case 18:
                return new hi6[i];
            case 19:
                return new ii6[i];
            case 20:
                return new ji6[i];
            case 21:
                return new ki6[i];
            case 22:
                return new li6[i];
            case 23:
                return new mi6[i];
            default:
                return new ni6[i];
        }
    }
}
