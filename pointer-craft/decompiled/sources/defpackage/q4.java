package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q4 implements Parcelable.Creator {
    public final /* synthetic */ byte g;

    public /* synthetic */ q4(byte b) {
        this.g = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kq0 kq0Var = null;
        xv5 xv5Var = null;
        ArrayList arrayListN = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayListN2 = null;
        int iJ = 0;
        int iJ2 = 0;
        boolean zL = false;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        boolean zL2 = false;
        switch (this.g) {
            case 0:
                parcel.getClass();
                return new r4(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                qm qmVar = new qm(parcel);
                qmVar.j = parcel.readByte() != 0;
                return qmVar;
            case 2:
                return new gw(parcel);
            case 3:
                return new hw(parcel);
            case 4:
                return new qa0((u73) parcel.readParcelable(u73.class.getClassLoader()), (u73) parcel.readParcelable(u73.class.getClassLoader()), (v01) parcel.readParcelable(v01.class.getClassLoader()), (u73) parcel.readParcelable(u73.class.getClassLoader()), parcel.readInt());
            case 5:
                return new v01(parcel.readLong());
            case 6:
                yp1 yp1Var = new yp1(-2, -2);
                yp1Var.q = 0.0f;
                yp1Var.w = 1.0f;
                yp1Var.c = -1;
                yp1Var.i = -1.0f;
                yp1Var.p = 16777215;
                yp1Var.u = 16777215;
                yp1Var.q = parcel.readFloat();
                yp1Var.w = parcel.readFloat();
                yp1Var.c = parcel.readInt();
                yp1Var.i = parcel.readFloat();
                yp1Var.b = parcel.readInt();
                yp1Var.s = parcel.readInt();
                yp1Var.p = parcel.readInt();
                yp1Var.u = parcel.readInt();
                yp1Var.z = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) yp1Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) yp1Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) yp1Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) yp1Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) yp1Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) yp1Var).width = parcel.readInt();
                return yp1Var;
            case 7:
                aq1 aq1Var = new aq1();
                aq1Var.j = parcel.readInt();
                aq1Var.t = parcel.readInt();
                return aq1Var;
            case 8:
                gx1 gx1Var = new gx1();
                gx1Var.j = parcel.readString();
                gx1Var.t = parcel.readInt();
                return gx1Var;
            case 9:
                lx1 lx1Var = new lx1();
                lx1Var.q = null;
                lx1Var.w = new ArrayList();
                lx1Var.c = new ArrayList();
                lx1Var.j = parcel.createStringArrayList();
                lx1Var.t = parcel.createStringArrayList();
                lx1Var.a = (gw[]) parcel.createTypedArray(gw.CREATOR);
                lx1Var.m = parcel.readInt();
                lx1Var.q = parcel.readString();
                lx1Var.w = parcel.createStringArrayList();
                lx1Var.c = parcel.createTypedArrayList(hw.CREATOR);
                lx1Var.i = parcel.createTypedArrayList(gx1.CREATOR);
                return lx1Var;
            case 10:
                parcel.getClass();
                return new mz1(oz1.valueOf(parcel.readString()), parcel.readBundle(mz1.class.getClassLoader()));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new te2((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 12:
                iv2 iv2Var = new iv2();
                iv2Var.j = parcel.readInt();
                iv2Var.t = parcel.readInt();
                iv2Var.a = parcel.readInt() == 1;
                return iv2Var;
            case 13:
                return u73.r(parcel.readInt(), parcel.readInt());
            case 14:
                gg3 gg3Var = new gg3(parcel);
                gg3Var.j = parcel.readInt();
                return gg3Var;
            case kq2.x /* 15 */:
                return new ParcelImpl(parcel);
            case 16:
                ev4 ev4Var = new ev4();
                ev4Var.j = parcel.readInt();
                ev4Var.t = parcel.readInt();
                ev4Var.m = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    ev4Var.a = iArr;
                    parcel.readIntArray(iArr);
                }
                return ev4Var;
            case 17:
                fv4 fv4Var = new fv4();
                fv4Var.j = parcel.readInt();
                fv4Var.t = parcel.readInt();
                int i2 = parcel.readInt();
                fv4Var.a = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    fv4Var.m = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                fv4Var.q = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    fv4Var.w = iArr3;
                    parcel.readIntArray(iArr3);
                }
                fv4Var.i = parcel.readInt() == 1;
                fv4Var.b = parcel.readInt() == 1;
                fv4Var.s = parcel.readInt() == 1;
                fv4Var.c = parcel.readArrayList(ev4.class.getClassLoader());
                return fv4Var;
            case 18:
                int iM = df6.m(parcel);
                int iJ6 = 0;
                while (parcel.dataPosition() < iM) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        zL2 = df6.l(parcel, i4);
                    } else if (c != 2) {
                        df6.a(parcel, i4);
                    } else {
                        iJ6 = df6.j(parcel, i4);
                    }
                }
                df6.v(parcel, iM);
                return new p73(zL2, iJ6);
            case 19:
                int iM2 = df6.m(parcel);
                while (parcel.dataPosition() < iM2) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        iJ5 = df6.j(parcel, i5);
                    } else if (c2 != 2) {
                        df6.a(parcel, i5);
                    } else {
                        arrayListN2 = df6.n(parcel, i5, y53.CREATOR);
                    }
                }
                df6.v(parcel, iM2);
                return new e35(iJ5, arrayListN2);
            case 20:
                int iM3 = df6.m(parcel);
                while (parcel.dataPosition() < iM3) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        df6.a(parcel, i6);
                    } else {
                        pendingIntent = (PendingIntent) df6.g(parcel, i6, PendingIntent.CREATOR);
                    }
                }
                df6.v(parcel, iM3);
                return new q73(pendingIntent);
            case 21:
                int iM4 = df6.m(parcel);
                int iJ7 = 0;
                while (parcel.dataPosition() < iM4) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        iJ4 = df6.j(parcel, i7);
                    } else if (c3 == 2) {
                        iJ7 = df6.j(parcel, i7);
                    } else if (c3 != 3) {
                        df6.a(parcel, i7);
                    } else {
                        intent = (Intent) df6.g(parcel, i7, Intent.CREATOR);
                    }
                }
                df6.v(parcel, iM4);
                return new nu5(iJ4, iJ7, intent);
            case 22:
                int iM5 = df6.m(parcel);
                long j = 0;
                String strY = null;
                String strY2 = null;
                String strY3 = null;
                String strY4 = null;
                Uri uri = null;
                String strY5 = null;
                String strY6 = null;
                ArrayList arrayListN3 = null;
                String strY7 = null;
                String strY8 = null;
                while (parcel.dataPosition() < iM5) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strY = df6.y(parcel, i8);
                            break;
                        case 3:
                            strY2 = df6.y(parcel, i8);
                            break;
                        case 4:
                            strY3 = df6.y(parcel, i8);
                            break;
                        case 5:
                            strY4 = df6.y(parcel, i8);
                            break;
                        case 6:
                            uri = (Uri) df6.g(parcel, i8, Uri.CREATOR);
                            break;
                        case 7:
                            strY5 = df6.y(parcel, i8);
                            break;
                        case '\b':
                            df6.q(parcel, i8, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            strY6 = df6.y(parcel, i8);
                            break;
                        case '\n':
                            arrayListN3 = df6.n(parcel, i8, Scope.CREATOR);
                            break;
                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            strY7 = df6.y(parcel, i8);
                            break;
                        case '\f':
                            strY8 = df6.y(parcel, i8);
                            break;
                        default:
                            df6.a(parcel, i8);
                            break;
                    }
                }
                df6.v(parcel, iM5);
                return new GoogleSignInAccount(strY, strY2, strY3, strY4, uri, strY5, j, strY6, arrayListN3, strY7, strY8);
            case 23:
                int iM6 = df6.m(parcel);
                long j2 = 0;
                String strY9 = null;
                int iJ8 = 0;
                int iJ9 = 0;
                boolean zL3 = false;
                while (parcel.dataPosition() < iM6) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        iJ8 = df6.j(parcel, i9);
                    } else if (c4 == 2) {
                        strY9 = df6.y(parcel, i9);
                    } else if (c4 == 3) {
                        df6.q(parcel, i9, 8);
                        j2 = parcel.readLong();
                    } else if (c4 == 4) {
                        iJ9 = df6.j(parcel, i9);
                    } else if (c4 != 5) {
                        df6.a(parcel, i9);
                    } else {
                        zL3 = df6.l(parcel, i9);
                    }
                }
                df6.v(parcel, iM6);
                return new pu5(iJ8, strY9, j2, iJ9, zL3);
            case 24:
                int iM7 = df6.m(parcel);
                boolean zL4 = false;
                while (parcel.dataPosition() < iM7) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        iJ3 = df6.j(parcel, i10);
                    } else if (c5 != 2) {
                        df6.a(parcel, i10);
                    } else {
                        zL4 = df6.l(parcel, i10);
                    }
                }
                df6.v(parcel, iM7);
                return new r73(iJ3, zL4);
            case 25:
                int iM8 = df6.m(parcel);
                String strY10 = null;
                String strY11 = null;
                while (parcel.dataPosition() < iM8) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        arrayListN = df6.n(parcel, i11, tn1.CREATOR);
                    } else if (c6 == 2) {
                        zL = df6.l(parcel, i11);
                    } else if (c6 == 3) {
                        strY10 = df6.y(parcel, i11);
                    } else if (c6 != 4) {
                        df6.a(parcel, i11);
                    } else {
                        strY11 = df6.y(parcel, i11);
                    }
                }
                df6.v(parcel, iM8);
                return new bk(arrayListN, zL, strY10, strY11);
            case 26:
                int iM9 = df6.m(parcel);
                ArrayList<String> arrayList = null;
                String strY12 = null;
                while (parcel.dataPosition() < iM9) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        int iT = df6.t(parcel, i12);
                        int iDataPosition = parcel.dataPosition();
                        if (iT == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iT);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c7 != 2) {
                        df6.a(parcel, i12);
                    } else {
                        strY12 = df6.y(parcel, i12);
                    }
                }
                df6.v(parcel, iM9);
                return new jv5(strY12, arrayList);
            case 27:
                int iM10 = df6.m(parcel);
                while (parcel.dataPosition() < iM10) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        iJ2 = df6.j(parcel, i13);
                    } else if (c8 != 2) {
                        df6.a(parcel, i13);
                    } else {
                        xv5Var = (xv5) df6.g(parcel, i13, xv5.CREATOR);
                    }
                }
                df6.v(parcel, iM10);
                return new mv5(iJ2, xv5Var);
            case 28:
                int iM11 = df6.m(parcel);
                aw5 aw5Var = null;
                while (parcel.dataPosition() < iM11) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iJ = df6.j(parcel, i14);
                    } else if (c9 == 2) {
                        kq0Var = (kq0) df6.g(parcel, i14, kq0.CREATOR);
                    } else if (c9 != 3) {
                        df6.a(parcel, i14);
                    } else {
                        aw5Var = (aw5) df6.g(parcel, i14, aw5.CREATOR);
                    }
                }
                df6.v(parcel, iM11);
                return new tv5(iJ, kq0Var, aw5Var);
            default:
                int iM12 = df6.m(parcel);
                int iJ10 = -1;
                long j3 = 0;
                long j4 = 0;
                String strY13 = null;
                String strY14 = null;
                int iJ11 = 0;
                int iJ12 = 0;
                int iJ13 = 0;
                int iJ14 = 0;
                while (parcel.dataPosition() < iM12) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iJ11 = df6.j(parcel, i15);
                            break;
                        case 2:
                            iJ12 = df6.j(parcel, i15);
                            break;
                        case 3:
                            iJ13 = df6.j(parcel, i15);
                            break;
                        case 4:
                            df6.q(parcel, i15, 8);
                            j3 = parcel.readLong();
                            break;
                        case 5:
                            df6.q(parcel, i15, 8);
                            j4 = parcel.readLong();
                            break;
                        case 6:
                            strY13 = df6.y(parcel, i15);
                            break;
                        case 7:
                            strY14 = df6.y(parcel, i15);
                            break;
                        case '\b':
                            iJ14 = df6.j(parcel, i15);
                            break;
                        case '\t':
                            iJ10 = df6.j(parcel, i15);
                            break;
                        default:
                            df6.a(parcel, i15);
                            break;
                    }
                }
                df6.v(parcel, iM12);
                return new y53(iJ11, iJ12, iJ13, j3, j4, strY13, strY14, iJ14, iJ10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.g) {
            case 0:
                return new r4[i];
            case 1:
                return new qm[i];
            case 2:
                return new gw[i];
            case 3:
                return new hw[i];
            case 4:
                return new qa0[i];
            case 5:
                return new v01[i];
            case 6:
                return new yp1[i];
            case 7:
                return new aq1[i];
            case 8:
                return new gx1[i];
            case 9:
                return new lx1[i];
            case 10:
                return new mz1[i];
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new te2[i];
            case 12:
                return new iv2[i];
            case 13:
                return new u73[i];
            case 14:
                return new gg3[i];
            case kq2.x /* 15 */:
                return new ParcelImpl[i];
            case 16:
                return new ev4[i];
            case 17:
                return new fv4[i];
            case 18:
                return new p73[i];
            case 19:
                return new e35[i];
            case 20:
                return new q73[i];
            case 21:
                return new nu5[i];
            case 22:
                return new GoogleSignInAccount[i];
            case 23:
                return new pu5[i];
            case 24:
                return new r73[i];
            case 25:
                return new bk[i];
            case 26:
                return new jv5[i];
            case 27:
                return new mv5[i];
            case 28:
                return new tv5[i];
            default:
                return new y53[i];
        }
    }
}
