package defpackage;

import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import android.system.Os;
import android.util.Log;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class y22 implements nt0, z65, s4, l84, ux0 {
    public static volatile y22 a;
    public static final y22 m;
    public static final w02 q;
    public final /* synthetic */ byte j;
    public Object t;

    static {
        byte b = 1;
        m = new y22(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, b);
        q = new w02(b);
    }

    public y22(byte b) {
        l53 l53Var;
        this.j = b;
        switch (b) {
            case 2:
                b14 b14Var = b14.r;
                try {
                    l53Var = (l53) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    l53Var = q;
                }
                l53[] l53VarArr = {w02.y, l53Var};
                a13 a13Var = new a13();
                a13Var.g = l53VarArr;
                Charset charset = gf2.g;
                this.t = a13Var;
                break;
            case 3:
                if (Build.VERSION.SDK_INT < 26) {
                    this.t = new n2(this);
                } else {
                    this.t = new o2(this);
                }
                break;
            case 7:
                this.t = new AtomicReference(null);
                break;
            case kq2.x /* 15 */:
                this.t = new fu4(y94.l);
                break;
            case 21:
                this.t = new rb3(new eq2[16]);
                break;
            case 22:
                y03 y03Var = new y03();
                this.t = y03Var;
                if (!y03Var.t) {
                    if (y03Var.a) {
                        bw3.g("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    y03Var.g();
                    y03Var.a = true;
                    break;
                }
                break;
            case 25:
                this.t = Build.VERSION.SDK_INT >= 28 ? new d52((byte) 14) : new aj6((byte) 24);
                break;
            case 29:
                this.t = kq2.M(Boolean.FALSE);
                break;
            default:
                this.t = new HashSet();
                break;
        }
    }

    public static int a(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static void b(String str, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(i(str, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i2 = i + 1;
                    if (i2 != str.length()) {
                        char cCharAt2 = str.charAt(i2);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    uo1.a("Unpaired surrogate at index ", i - 1);
                    return;
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i++;
        }
    }

    public static int i(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int length = str.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length && (i3 = i5 + i) < i4 && (cCharAt = str.charAt(i5)) < 128) {
            bArr[i3] = (byte) cCharAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i6 = i + i5;
        while (i5 < length) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 128 && i6 < i4) {
                bArr[i6] = (byte) cCharAt2;
                i6++;
            } else if (cCharAt2 < 2048 && i6 <= i4 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> 6) | 960);
                i6 += 2;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i4 - 3) {
                    if (i6 > i4 - 4) {
                        l0.l(cCharAt2, i6);
                        return 0;
                    }
                    int i8 = i5 + 1;
                    if (i8 != str.length()) {
                        char cCharAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i6 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i9 = i6 + 3;
                            bArr[i6 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i6 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i5 = i8;
                        } else {
                            i5 = i8;
                        }
                    }
                    uo1.a("Unpaired surrogate at index ", i5 - 1);
                    return 0;
                }
                bArr[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i10 = i6 + 2;
                bArr[i6 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i6 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i5++;
        }
        return i6;
    }

    public static int j(int i, int i2) {
        return (i2 >= 0 ? a(i2) : 10) + q(i);
    }

    public static int l(int i) {
        return q(i) + 1;
    }

    public static int m(String str, int i) {
        int iQ = q(i);
        int iS = s(str);
        return a(iS) + iS + iQ;
    }

    public static int q(int i) {
        return a(i << 3);
    }

    public static int s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                l0.u(xi3.j("Unpaired surrogate at index ", i));
                                return 0;
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        t94.y(((long) i2) + 4294967296L);
        return 0;
    }

    public static int t(int i, np3 np3Var) {
        int iQ = q(i);
        int iR = np3Var.r();
        np3Var.j = iR;
        return a(iR) + iR + iQ;
    }

    public void A(float f, float f2, long j) {
        nb0 nb0VarB = ((ro) this.t).b();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        nb0VarB.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        nb0VarB.y(f, f2);
        nb0VarB.l(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void B(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            l0.u("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g24 g24Var = (g24) obj;
            if (!"play_pass_subs".equals(g24Var.y)) {
                hashSet.add(g24Var.y);
            }
        }
        if (hashSet.size() <= 1) {
            this.t = a06.m(arrayList);
        } else {
            l0.u("All products should be of the same product type.");
        }
    }

    public void C(Runnable runnable, String str) {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Object obj = mi1.j;
        TimeUnit timeUnit = TimeUnit.DAYS;
        nr3 nr3Var = nr3.r;
        q21 q21Var = nr3Var.g;
        if (Boolean.FALSE.booleanValue()) {
            yy3 yy3Var = nr3Var.y;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            b95 b95VarX = yy3Var.q;
            b95 b95Var = yy3Var.w;
            if (b95VarX == null || b95VarX.m != id) {
                if (b95Var == null || b95Var.m != id) {
                    b95VarX = yy3Var.x(id, Os.gettid(), threadCurrentThread.getName());
                    yy3Var.w = yy3Var.q;
                    yy3Var.q = b95VarX;
                } else {
                    b95VarX = b95Var;
                }
            }
            b95VarX.a.getClass();
            b95VarX.a.getClass();
            pw1 pw1Var = (pw1) this.t;
            pw1Var.q.getClass();
            int i = pw1Var.E;
            if (i != 0) {
                Integer.toHexString(i);
            }
        }
        boolean z = false;
        try {
            runnable.run();
            if (obj instanceof AutoCloseable) {
                return;
            }
            if (!(obj instanceof ExecutorService)) {
                t94.g();
                return;
            }
            ExecutorService executorService = (ExecutorService) obj;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            while (!zIsTerminated2) {
                try {
                    zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                str.concat(".exception");
                ny5.n(nr3Var, th);
                throw null;
            } catch (Throwable th2) {
                if (obj instanceof AutoCloseable) {
                    throw th2;
                }
                if (!(obj instanceof ExecutorService)) {
                    t94.g();
                    return;
                }
                ExecutorService executorService2 = (ExecutorService) obj;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    throw th2;
                }
                executorService2.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused2) {
                        if (!z) {
                            executorService2.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    throw th2;
                }
                Thread.currentThread().interrupt();
                throw th2;
            }
        }
    }

    public void D(float f, float f2) {
        ((ro) this.t).b().l(f, f2);
    }

    public void E(int i, boolean z) throws ui0 {
        N(i, 0);
        J(z ? 1 : 0);
    }

    public void F(int i, byte[] bArr) throws ui0 {
        N(i, 2);
        K(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.t;
        if (byteBuffer.remaining() < length) {
            throw new ui0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void G(int i, float f) throws ui0 {
        N(i, 5);
        int iFloatToIntBits = Float.floatToIntBits(f);
        ByteBuffer byteBuffer = (ByteBuffer) this.t;
        if (byteBuffer.remaining() < 4) {
            throw new ui0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    public void H(int i, int i2) throws ui0 {
        N(i, 0);
        if (i2 >= 0) {
            K(i2);
        } else {
            L(i2);
        }
    }

    public void I(int i, np3 np3Var) throws ui0 {
        N(i, 2);
        if (np3Var.j < 0) {
            np3Var.j = np3Var.r();
        }
        K(np3Var.j);
        np3Var.b(this);
    }

    public void J(int i) throws ui0 {
        byte b = (byte) i;
        ByteBuffer byteBuffer = (ByteBuffer) this.t;
        if (!byteBuffer.hasRemaining()) {
            throw new ui0(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b);
    }

    public void K(int i) throws ui0 {
        while ((i & (-128)) != 0) {
            J((i & 127) | 128);
            i >>>= 7;
        }
        J(i);
    }

    public void L(long j) throws ui0 {
        while (((-128) & j) != 0) {
            J((((int) j) & 127) | 128);
            j >>>= 7;
        }
        J((int) j);
    }

    public void M(String str, int i) throws ui0 {
        N(i, 2);
        ByteBuffer byteBuffer = (ByteBuffer) this.t;
        try {
            int iA = a(str.length());
            if (iA != a(str.length() * 3)) {
                K(s(str));
                b(str, byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (byteBuffer.remaining() < iA) {
                throw new ui0(iPosition + iA, byteBuffer.limit());
            }
            byteBuffer.position(iPosition + iA);
            b(str, byteBuffer);
            int iPosition2 = byteBuffer.position();
            byteBuffer.position(iPosition);
            K((iPosition2 - iPosition) - iA);
            byteBuffer.position(iPosition2);
        } catch (BufferOverflowException e) {
            ui0 ui0Var = new ui0(byteBuffer.position(), byteBuffer.limit());
            ui0Var.initCause(e);
            throw ui0Var;
        }
    }

    public void N(int i, int i2) throws ui0 {
        K((i << 3) | i2);
    }

    public void c() {
        ((to0) this.t).getClass();
    }

    public boolean d(um2 um2Var) {
        if (!um2Var.J()) {
            mc2.y("DepthSortedSet.remove called on an unattached node");
        }
        return ((fu4) this.t).remove(um2Var);
    }

    public void e(float f, long j) {
        nb0 nb0VarB = ((ro) this.t).b();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        nb0VarB.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        nb0VarB.r(f);
        nb0VarB.l(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void f(int i) {
        gy gyVar = (gy) this.t;
        qr0 qr0VarT = gyVar.T();
        qr0VarT.getClass();
        m50.T(v70.d(qr0VarT), null, new d40((Object) qr0VarT, i, (mu0) null, (byte) 1), 3);
        vl vlVar = gyVar.k0;
        if (vlVar == null) {
            yf2.Y("popupWindowManager");
            throw null;
        }
        iv4 iv4Var = (iv4) vlVar.v;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        ((PopupWindow) vlVar.r).dismiss();
        StringBuffer stringBuffer = (StringBuffer) vlVar.n;
        stringBuffer.delete(0, stringBuffer.length());
    }

    public void g(um2 um2Var) {
        if (!um2Var.J()) {
            mc2.y("DepthSortedSet.add called on an unattached node");
        }
        ((fu4) this.t).add(um2Var);
    }

    public void h() {
        ((rw1) this.t).e.U();
    }

    public boolean k(int i, int i2, Bundle bundle) {
        return false;
    }

    public void o(x20 x20Var, List list) {
        el0 el0Var = (el0) this.t;
        x20Var.getClass();
        list.getClass();
        el0Var.f0(new a24(x20Var, list));
    }

    public m2 p(int i) {
        return null;
    }

    @Override // defpackage.s4
    public void r(Object obj) {
        r4 r4Var = (r4) obj;
        kx1 kx1Var = (kx1) this.t;
        gx1 gx1Var = (gx1) kx1Var.F.pollLast();
        if (gx1Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = gx1Var.j;
        int i = gx1Var.t;
        pw1 pw1VarB = kx1Var.r.b(str);
        if (pw1VarB != null) {
            pw1VarB.f(i, r4Var.j, r4Var.t);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    public String toString() {
        switch (this.j) {
            case 1:
                return "Bradford";
            case kq2.x /* 15 */:
                return ((fu4) this.t).toString();
            default:
                return super.toString();
        }
    }

    public bw4 u() {
        ph1 ph1VarG = ph1.g();
        if (ph1VarG.r() == 1) {
            return new na2(true);
        }
        tp3 tp3VarM = kq2.M(Boolean.FALSE);
        ph1VarG.j(new a21(tp3VarM, this));
        return tp3VarM;
    }

    public bx0 v(bx0 bx0Var) {
        return bx0Var instanceof e64 ? bx0Var : new u5(-((g33) this.t).a(), bx0Var);
    }

    public m2 w(int i) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void x(hd0 hd0Var, ou0 ou0Var) {
        si3 si3Var;
        if (ou0Var instanceof si3) {
            si3Var = (si3) ou0Var;
            int i = si3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                si3Var.w = i - Integer.MIN_VALUE;
            } else {
                si3Var = new si3(this, ou0Var);
            }
        } else {
            si3Var = new si3(this, ou0Var);
        }
        Object obj = si3Var.m;
        int i2 = si3Var.w;
        if (i2 == 0) {
            js2.o(obj);
            ew4 ew4Var = (ew4) this.t;
            si3Var.w = 1;
            ew4Var.r(hd0Var, si3Var);
            return;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
        } else {
            js2.o(obj);
            l0.x();
        }
    }

    @Override // defpackage.ux0
    public Object y(tx0 tx0Var) {
        return ((zg2) this.t).a(tx0Var);
    }

    public void z(float f, float f2, float f3, float f4) {
        ro roVar = (ro) this.t;
        nb0 nb0VarB = roVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roVar.G() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (roVar.G() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            lc2.g("Width and height must be greater than or equal to zero");
        }
        roVar.b0(jFloatToRawIntBits);
        nb0VarB.l(f, f2);
    }

    public /* synthetic */ y22(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    public /* synthetic */ y22(byte b, char c) {
        this.j = b;
    }

    public y22(boolean z) {
        this.j = (byte) 6;
        this.t = new AtomicBoolean(z);
    }

    public y22(int i, byte[] bArr) {
        this.j = (byte) 11;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        this.t = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public y22(TextView textView) {
        this.j = (byte) 16;
        this.t = new fi1(textView);
    }

    public y22(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
        this.j = (byte) 20;
        this.t = componentName2;
    }

    public y22(int i) {
        this.j = (byte) 24;
        this.t = y94.w(new int[i]);
    }

    public void n(int i, m2 m2Var, String str, Bundle bundle) {
    }
}
