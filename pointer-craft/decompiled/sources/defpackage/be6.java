package defpackage;

import android.app.Application;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.view.inputmethod.CursorAnchorInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class be6 {
    public static Boolean a;
    public static String j;
    public static final sj0 l;
    public static final sj0 n;
    public static int t;
    public static final sj0 v;
    public static final sj0 x;
    public static final sj0 g = sj0.e;
    public static final float y = 56.0f;
    public static final in4 r = in4.q;

    static {
        sj0 sj0Var = sj0.i;
        n = sj0Var;
        v = sj0Var;
        sj0 sj0Var2 = sj0.b;
        x = sj0Var2;
        l = sj0Var2;
    }

    public static final CursorAnchorInfo g(CursorAnchorInfo.Builder builder, k65 k65Var, aj3 aj3Var, j75 j75Var, Matrix matrix, k44 k44Var, k44 k44Var2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        long j2 = k65Var.y;
        u75 u75Var = k65Var.r;
        int iX = u75.x(j2);
        builder.setSelectionRange(iX, u75.v(k65Var.y));
        n74 n74Var = n74.t;
        if (z && iX >= 0) {
            int iJ = aj3Var.j(iX);
            k44 k44VarR = j75Var.r(iJ);
            float fQ = xs2.q(k44VarR.g, 0.0f, (int) (j75Var.r >> 32));
            boolean zY = y(k44Var, fQ, k44VarR.y);
            boolean zY2 = y(k44Var, fQ, k44VarR.n);
            boolean z5 = j75Var.g(iJ) == n74Var;
            int i = (zY || zY2) ? 1 : 0;
            if (!zY || !zY2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = k44VarR.y;
            float f2 = k44VarR.n;
            builder.setInsertionMarkerLocation(fQ, f, f2, f2, i);
        }
        if (z2) {
            int iX2 = u75Var != null ? u75.x(u75Var.g) : -1;
            int iV = u75Var != null ? u75.v(u75Var.g) : -1;
            if (iX2 >= 0 && iX2 < iV) {
                builder.setComposingText(iX2, k65Var.g.t.subSequence(iX2, iV));
                int iJ2 = aj3Var.j(iX2);
                int iJ3 = aj3Var.j(iV);
                float[] fArr = new float[(iJ3 - iJ2) * 4];
                j75Var.y.g(sp2.y(iJ2, iJ3), fArr);
                for (int i2 = iX2; i2 < iV; i2++) {
                    int iJ4 = aj3Var.j(i2);
                    int i3 = (iJ4 - iJ2) * 4;
                    float f3 = fArr[i3];
                    float f4 = fArr[i3 + 1];
                    float f5 = fArr[i3 + 2];
                    float f6 = fArr[i3 + 3];
                    int i4 = (k44Var.g < f5 ? 1 : 0) & (f3 < k44Var.r ? 1 : 0) & (k44Var.y < f6 ? 1 : 0) & (f4 < k44Var.n ? 1 : 0);
                    if (!y(k44Var, f3, f4) || !y(k44Var, f5, f6)) {
                        i4 |= 2;
                    }
                    if (j75Var.g(iJ4) == n74Var) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            h2.w(builder, k44Var2);
        }
        if (i5 >= 34 && z4 && !k44Var.x()) {
            h93 h93Var = j75Var.y;
            int i6 = h93Var.x - 1;
            if (i6 < 0) {
                i6 = 0;
            }
            int iW = xs2.w(h93Var.v(k44Var.y), 0, i6);
            int iW2 = xs2.w(h93Var.v(k44Var.n), 0, i6);
            if (iW <= iW2) {
                while (true) {
                    builder.addVisibleLineBounds(j75Var.v(iW), h93Var.x(iW), j75Var.x(iW), h93Var.y(iW));
                    if (iW == iW2) {
                        break;
                    }
                    iW++;
                }
            }
        }
        return builder.build();
    }

    public static String r() throws Throwable {
        BufferedReader bufferedReader;
        String str = j;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            j = processName;
            return processName;
        }
        int iMyPid = t;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            t = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        strTrim = null;
        try {
            if (iMyPid > 0) {
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                    sb.append("/proc/");
                    sb.append(iMyPid);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader.readLine();
                            jr2.m(line);
                            strTrim = line.trim();
                            bufferedReader.close();
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            j = strTrim;
                            return strTrim;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException unused4) {
        }
        j = strTrim;
        return strTrim;
    }

    public static final boolean y(k44 k44Var, float f, float f2) {
        float f3 = k44Var.g;
        if (f > k44Var.r || f3 > f) {
            return false;
        }
        return f2 <= k44Var.n && k44Var.y <= f2;
    }
}
