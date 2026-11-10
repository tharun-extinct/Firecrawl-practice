package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gh6 {
    public static final void g(cj3 cj3Var, u6 u6Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(cj3Var) : h02Var.j(cj3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(u6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(nm0Var) ? 256 : 128;
        }
        boolean z = true;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !h02Var.x(cj3Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK = h02Var.K();
            if (z3 || objK == oo0.g) {
                objK = new q42(u6Var, cj3Var);
                h02Var.i0(objK);
            }
            de.g((q42) objK, null, new wv3(false, ch4.j, false, 0), nm0Var, h02Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(cj3Var, u6Var, nm0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final nc n(ja0 ja0Var, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        nc ncVarN = ng6.g;
        c9 c9Var = ng6.y;
        pb0 pb0Var = ng6.r;
        if (ncVarN == null || c9Var == null) {
            ncVarN = pw5.n(iCeil, iCeil, 1);
            ng6.g = ncVarN;
            Canvas canvas = d9.g;
            c9Var = new c9();
            c9Var.g = new Canvas(y94.b(ncVarN));
            ng6.y = c9Var;
        } else {
            Bitmap bitmap = ncVarN.g;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                ncVarN = pw5.n(iCeil, iCeil, 1);
                ng6.g = ncVarN;
                Canvas canvas2 = d9.g;
                c9Var = new c9();
                c9Var.g = new Canvas(y94.b(ncVarN));
                ng6.y = c9Var;
            }
        }
        nc ncVar = ncVarN;
        c9 c9Var2 = c9Var;
        if (pb0Var == null) {
            pb0Var = new pb0();
            ng6.r = pb0Var;
        }
        pb0 pb0Var2 = pb0Var;
        ob0 ob0Var = pb0Var2.j;
        fl2 layoutDirection = ja0Var.j.getLayoutDirection();
        Bitmap bitmap2 = ncVar.g;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        j51 j51Var = ob0Var.g;
        fl2 fl2Var = ob0Var.y;
        nb0 nb0Var = ob0Var.r;
        long j = ob0Var.n;
        ob0Var.g = ja0Var;
        ob0Var.y = layoutDirection;
        ob0Var.r = c9Var2;
        ob0Var.n = jFloatToRawIntBits;
        c9Var2.q();
        xd1.B(pb0Var2, jj0.y, 0L, pb0Var2.n(), 0.0f, 58);
        xd1.B(pb0Var2, ra.v(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, 120);
        xd1.F(pb0Var2, ra.v(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        c9Var2.t();
        ob0Var.g = j51Var;
        ob0Var.y = fl2Var;
        ob0Var.r = nb0Var;
        ob0Var.n = j;
        return ncVar;
    }

    public static final void r(j73 j73Var, my1 my1Var, boolean z, h02 h02Var, int i) {
        int i2;
        h02Var.Z(2111672474);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (h02Var.j(my1Var) ? 32 : 16) | (h02Var.l(z) ? 256 : 128);
        byte b = 0;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            mj4 mj4Var = si4.g;
            mq2.y(h02Var, m50.F(mq4.t(j73Var, 25.0f, 25.0f), new re(my1Var, z, b)));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new qe(j73Var, my1Var, z, i);
        }
    }

    public static Icon v(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i = iconCompat.g;
        String strL = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.y;
            case 0:
            default:
                l0.u("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.y);
                break;
            case 2:
                if (i == -1) {
                    Object obj = iconCompat.y;
                    if (Build.VERSION.SDK_INT >= 28) {
                        strL = ym.l(obj);
                    } else {
                        try {
                            strL = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else {
                    if (i != 2) {
                        uo1.j(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str = iconCompat.a;
                    strL = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.y).split(":", -1)[0] : iconCompat.a;
                }
                iconCreateWithBitmap = Icon.createWithResource(strL, iconCompat.v);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.y, iconCompat.v, iconCompat.x);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.y);
                break;
            case 5:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = iconCompat.y;
                iconCreateWithBitmap = i2 < 26 ? Icon.createWithBitmap(IconCompat.g((Bitmap) obj2, false)) : tm.y((Bitmap) obj2);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = g2.g(iconCompat.j());
                } else {
                    if (context == null) {
                        t94.j(iconCompat.j(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriJ = iconCompat.j();
                    String scheme = uriJ.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriJ);
                        } catch (Exception e4) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriJ, e4);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.y));
                        } catch (FileNotFoundException e5) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriJ, e5);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        t94.n(iconCompat.j(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.g(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = tm.y(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.l;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.j;
        if (mode != IconCompat.m) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static void x(Status status, Object obj, x25 x25Var) {
        if (status.j <= 0) {
            x25Var.g.q(obj);
        } else {
            x25Var.r(status.a != null ? new l74(status) : new ak(status));
        }
    }

    public static final void y(final cj3 cj3Var, final boolean z, final n74 n74Var, final boolean z2, long j, final float f, final j73 j73Var, h02 h02Var, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        h02Var.Z(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(cj3Var) : h02Var.j(cj3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.n(n74Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.x(j73Var) ? 1048576 : 524288;
        }
        if (h02Var.N(i2 & 1, (533651 & i2) != 533650)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                h02Var.Q();
                i3 = i2 & (-57345);
                j3 = j;
            }
            h02Var.s();
            n74 n74Var2 = n74.t;
            n74 n74Var3 = n74.j;
            if (z) {
                mj4 mj4Var = si4.g;
                z3 = (n74Var == n74Var3 && !z2) || (n74Var == n74Var2 && z2);
            } else {
                mj4 mj4Var2 = si4.g;
                z3 = (n74Var != n74Var3 || z2) && !(n74Var == n74Var2 && z2);
            }
            h00 h00Var = z3 ? x52.y : x52.g;
            int i4 = i3 & 14;
            boolean zL = (i4 == 4 || ((i3 & 8) != 0 && h02Var.j(cj3Var))) | ((i3 & 112) == 32) | h02Var.l(z3);
            Object objK = h02Var.K();
            if (zL || objK == oo0.g) {
                objK = new xy1() { // from class: le
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        nj4 nj4Var = (nj4) obj;
                        long jG = cj3Var.g();
                        nj4Var.g(si4.g, new ri4(z ? p42.t : p42.a, jG, z3 ? qi4.j : qi4.a, (9223372034707292159L & jG) != 9205357640488583168L));
                        return og5.g;
                    }
                };
                h02Var.i0(objK);
            }
            final j73 j73VarG = dj4.g(j73Var, false, (xy1) objK);
            final bl5 bl5Var = (bl5) h02Var.a(hp0.z);
            long j4 = j3;
            h00 h00Var2 = h00Var;
            j2 = j4;
            g(cj3Var, h00Var2, ue5.m0(1365123137, new bz1() { // from class: me
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    h02 h02Var2 = (h02) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        m14 m14VarG = hp0.z.g(bl5Var);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final j73 j73Var2 = j73VarG;
                        final cj3 cj3Var2 = cj3Var;
                        og0.y(m14VarG, ue5.m0(1260045569, new bz1() { // from class: oe
                            @Override // defpackage.bz1
                            public final Object l(Object obj3, Object obj4) {
                                h02 h02Var3 = (h02) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final byte b = 1;
                                final byte b2 = 0;
                                if (h02Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    j73 j73Var3 = j73Var2;
                                    final cj3 cj3Var3 = cj3Var2;
                                    l76 l76Var = oo0.g;
                                    if (j6 != 9205357640488583168L) {
                                        h02Var3.X(3458246);
                                        xq xqVar = z5 ? ix5.y : ix5.g;
                                        j73 j73VarL = mq4.l(j73Var3, yb1.y(j6), yb1.g(j6), 0.0f, 0.0f, 12);
                                        kb4 kb4VarG = jb4.g(xqVar, hi0.p, h02Var3, 0);
                                        int iHashCode = Long.hashCode(h02Var3.T);
                                        tr3 tr3VarQ = h02Var3.q();
                                        j73 j73VarW = m50.W(h02Var3, j73VarL);
                                        jo0.n.getClass();
                                        h02Var3.b0();
                                        if (h02Var3.S) {
                                            h02Var3.m(um2.Z);
                                        } else {
                                            h02Var3.l0();
                                        }
                                        xs2.E(tg1.w, h02Var3, kb4VarG);
                                        xs2.E(tg1.q, h02Var3, tr3VarQ);
                                        xs2.E(tg1.c, h02Var3, Integer.valueOf(iHashCode));
                                        xs2.D(h02Var3);
                                        xs2.E(tg1.m, h02Var3, j73VarW);
                                        boolean zJ = h02Var3.j(cj3Var3);
                                        Object objK2 = h02Var3.K();
                                        if (zJ || objK2 == l76Var) {
                                            objK2 = new my1() { // from class: pe
                                                @Override // defpackage.my1
                                                public final Object g() {
                                                    byte b3 = b2;
                                                    cj3 cj3Var4 = cj3Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & cj3Var4.g()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & cj3Var4.g()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            h02Var3.i0(objK2);
                                        }
                                        gh6.r(g73.g, (my1) objK2, z5, h02Var3, 6);
                                        h02Var3.b(true);
                                        h02Var3.b(false);
                                    } else {
                                        h02Var3.X(4389176);
                                        boolean zJ2 = h02Var3.j(cj3Var3);
                                        Object objK3 = h02Var3.K();
                                        if (zJ2 || objK3 == l76Var) {
                                            objK3 = new my1() { // from class: pe
                                                @Override // defpackage.my1
                                                public final Object g() {
                                                    byte b3 = b;
                                                    cj3 cj3Var4 = cj3Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & cj3Var4.g()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & cj3Var4.g()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            h02Var3.i0(objK3);
                                        }
                                        gh6.r(j73Var3, (my1) objK3, z5, h02Var3, 0);
                                        h02Var3.b(false);
                                    }
                                } else {
                                    h02Var3.Q();
                                }
                                return og5.g;
                            }
                        }, h02Var2), h02Var2, 56);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, i4 | 384);
        } else {
            h02Var.Q();
            j2 = j;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final long j5 = j2;
            u34VarP.n = new bz1() { // from class: ne
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gh6.y(cj3Var, z, n74Var, z2, j5, f, j73Var, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
