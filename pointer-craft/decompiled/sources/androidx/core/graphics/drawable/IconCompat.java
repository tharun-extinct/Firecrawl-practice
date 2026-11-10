package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.l0;
import defpackage.uo1;
import defpackage.ym;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode m = PorterDuff.Mode.SRC_IN;
    public String a;
    public int g;
    public Object y;
    public byte[] r = null;
    public Parcelable n = null;
    public int v = 0;
    public int x = 0;
    public ColorStateList l = null;
    public PorterDuff.Mode j = m;
    public String t = null;

    public IconCompat(int i) {
        this.g = i;
    }

    public static Bitmap g(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat n(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            l0.u("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.v = i;
        if (resources != null) {
            try {
                iconCompat.y = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                l0.u("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.y = str;
        }
        iconCompat.a = str;
        return iconCompat;
    }

    public static IconCompat r(Context context, int i) {
        context.getClass();
        return n(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat y(Bitmap bitmap) {
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.y = bitmap;
        return iconCompat;
    }

    public final Uri j() {
        int i = this.g;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.y);
            }
            uo1.j(this, "called getUri() on ");
            return null;
        }
        Object obj = this.y;
        if (Build.VERSION.SDK_INT >= 28) {
            return ym.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public final int l() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        Object obj = this.y;
        if (Build.VERSION.SDK_INT >= 28) {
            return ym.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    public final String toString() {
        String str;
        if (this.g == -1) {
            return String.valueOf(this.y);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.g) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.g) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.y).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.y).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.a);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(x())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.v);
                if (this.x != 0) {
                    sb.append(" off=");
                    sb.append(this.x);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.y);
                break;
        }
        if (this.l != null) {
            sb.append(" tint=");
            sb.append(this.l);
        }
        if (this.j != m) {
            sb.append(" mode=");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Bitmap v() {
        int i = this.g;
        if (i == -1) {
            Object obj = this.y;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.y;
        }
        if (i == 5) {
            return g((Bitmap) this.y, true);
        }
        uo1.j(this, "called getBitmap() on ");
        return null;
    }

    public final int x() {
        int i = this.g;
        if (i != -1) {
            if (i == 2) {
                return this.v;
            }
            uo1.j(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.y;
        if (Build.VERSION.SDK_INT >= 28) {
            return ym.x(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
