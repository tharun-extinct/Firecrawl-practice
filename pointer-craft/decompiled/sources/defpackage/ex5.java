package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ex5 implements ki3 {
    public OutputStream g;
    public final h14 n = new h14(this, (byte) 1);
    public final HashMap r;
    public final HashMap y;
    public static final Charset v = Charset.forName("UTF-8");
    public static final un1 x = new un1("key", fj.l(ei3.n(ax5.class, new nw5(1))));
    public static final un1 l = new un1("value", fj.l(ei3.n(ax5.class, new nw5(2))));
    public static final cx5 j = cx5.y;

    public ex5(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.g = byteArrayOutputStream;
        this.y = map;
        this.r = map2;
    }

    public static int x(un1 un1Var) {
        ax5 ax5Var = (ax5) ((Annotation) un1Var.y.get(ax5.class));
        if (ax5Var != null) {
            return ax5Var.zza();
        }
        throw new ej1("Field has no @Protobuf config");
    }

    @Override // defpackage.ki3
    public final ki3 g(un1 un1Var, Object obj) {
        y(un1Var, obj, true);
        return this;
    }

    public final void j(int i) throws IOException {
        while (true) {
            long j2 = i & (-128);
            OutputStream outputStream = this.g;
            if (j2 == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void l(ji3 ji3Var, un1 un1Var, Object obj, boolean z) throws IOException {
        ot2 ot2Var = new ot2((byte) 1);
        ot2Var.t = 0L;
        try {
            OutputStream outputStream = this.g;
            this.g = ot2Var;
            try {
                ji3Var.g(obj, this);
                this.g = outputStream;
                long j2 = ot2Var.t;
                ot2Var.close();
                if (z && j2 == 0) {
                    return;
                }
                j((x(un1Var) << 3) | 2);
                t(j2);
                ji3Var.g(obj, this);
            } catch (Throwable th) {
                this.g = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                ot2Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    @Override // defpackage.ki3
    public final /* synthetic */ ki3 n(un1 un1Var, long j2) throws IOException {
        v(un1Var, j2, true);
        return this;
    }

    public final void r(un1 un1Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        ax5 ax5Var = (ax5) ((Annotation) un1Var.y.get(ax5.class));
        if (ax5Var == null) {
            throw new ej1("Field has no @Protobuf config");
        }
        int iOrdinal = ax5Var.zzb().ordinal();
        if (iOrdinal == 0) {
            j(ax5Var.zza() << 3);
            j(i);
        } else if (iOrdinal == 1) {
            j(ax5Var.zza() << 3);
            j((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((ax5Var.zza() << 3) | 5);
            this.g.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void t(long j2) throws IOException {
        while (true) {
            long j3 = (-128) & j2;
            OutputStream outputStream = this.g;
            if (j3 == 0) {
                outputStream.write(((int) j2) & 127);
                return;
            } else {
                outputStream.write((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    }

    public final void v(un1 un1Var, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return;
        }
        ax5 ax5Var = (ax5) ((Annotation) un1Var.y.get(ax5.class));
        if (ax5Var == null) {
            throw new ej1("Field has no @Protobuf config");
        }
        int iOrdinal = ax5Var.zzb().ordinal();
        if (iOrdinal == 0) {
            j(ax5Var.zza() << 3);
            t(j2);
        } else if (iOrdinal == 1) {
            j(ax5Var.zza() << 3);
            t((j2 >> 63) ^ (j2 + j2));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((ax5Var.zza() << 3) | 1);
            this.g.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j2).array());
        }
    }

    public final void y(un1 un1Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            j((x(un1Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(v);
            j(bytes.length);
            this.g.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                y(un1Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(j, un1Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            j((x(un1Var) << 3) | 1);
            this.g.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            j((x(un1Var) << 3) | 5);
            this.g.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            v(un1Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            r(un1Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            j((x(un1Var) << 3) | 2);
            j(bArr.length);
            this.g.write(bArr);
            return;
        }
        ji3 ji3Var = (ji3) this.y.get(obj.getClass());
        if (ji3Var != null) {
            l(ji3Var, un1Var, obj, z);
            return;
        }
        mi5 mi5Var = (mi5) this.r.get(obj.getClass());
        if (mi5Var != null) {
            h14 h14Var = this.n;
            h14Var.y = false;
            h14Var.n = un1Var;
            h14Var.r = z;
            mi5Var.g(obj, h14Var);
            return;
        }
        if (obj instanceof uw5) {
            r(un1Var, ((uw5) obj).zza(), true);
        } else if (obj instanceof Enum) {
            r(un1Var, ((Enum) obj).ordinal(), true);
        } else {
            l(cx5.r, un1Var, obj, z);
        }
    }
}
