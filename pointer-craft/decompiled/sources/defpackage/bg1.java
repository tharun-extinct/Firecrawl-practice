package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class bg1 {
    public static Boolean l = null;
    public static pi6 m = null;
    public static String n = null;
    public static vi6 q = null;
    public static Boolean r = null;
    public static boolean v = false;
    public static int x = -1;
    public final Context g;
    public static final ThreadLocal j = new ThreadLocal();
    public static final t01 t = new t01((byte) 2);
    public static final ug5 a = new ug5((byte) 4);
    public static final vg5 y = new vg5();

    public bg1(Context context) {
        this.g = context;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0214 A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0225 A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x023b A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0244 A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x024c A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0256 A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0264  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ee A[Catch: all -> 0x00ac, TryCatch #6 {all -> 0x00ac, blocks: (B:5:0x0042, B:9:0x00a5, B:16:0x00b1, B:19:0x00b7, B:31:0x00dc, B:119:0x0271, B:120:0x0278, B:128:0x0287, B:130:0x02af, B:132:0x02be, B:142:0x02e6, B:143:0x02ed, B:123:0x027b, B:124:0x027c, B:125:0x0283, B:144:0x02ee, B:145:0x030e, B:146:0x030f, B:147:0x0354), top: B:163:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b7 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #6 {all -> 0x00ac, blocks: (B:5:0x0042, B:9:0x00a5, B:16:0x00b1, B:19:0x00b7, B:31:0x00dc, B:119:0x0271, B:120:0x0278, B:128:0x0287, B:130:0x02af, B:132:0x02be, B:142:0x02e6, B:143:0x02ed, B:123:0x027b, B:124:0x027c, B:125:0x0283, B:144:0x02ee, B:145:0x030e, B:146:0x030f, B:147:0x0354), top: B:163:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:34:0x00e1, B:36:0x00e7, B:37:0x00e9), top: B:159:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TRY_ENTER, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TRY_ENTER, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6 A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2 A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ea A[Catch: all -> 0x0155, yf1 -> 0x015a, RemoteException -> 0x015f, TRY_LEAVE, TryCatch #11 {RemoteException -> 0x015f, yf1 -> 0x015a, all -> 0x0155, blocks: (B:33:0x00e0, B:39:0x00ec, B:41:0x00f3, B:42:0x0116, B:46:0x011c, B:48:0x0124, B:50:0x0128, B:51:0x0134, B:58:0x013f, B:66:0x0179, B:68:0x0181, B:69:0x0188, B:70:0x018f, B:65:0x0164, B:73:0x0192, B:74:0x0193, B:75:0x019a, B:76:0x019b, B:77:0x01a2, B:80:0x01a5, B:81:0x01a6, B:83:0x01cf, B:85:0x01e2, B:87:0x01ea, B:43:0x0117, B:44:0x0119, B:52:0x0135, B:56:0x013c), top: B:164:0x00e0, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0206 A[Catch: all -> 0x01fd, yf1 -> 0x0200, RemoteException -> 0x0203, TryCatch #10 {RemoteException -> 0x0203, yf1 -> 0x0200, all -> 0x01fd, blocks: (B:89:0x01ee, B:102:0x0235, B:104:0x023b, B:105:0x0244, B:106:0x024b, B:96:0x0206, B:97:0x020f, B:100:0x0214, B:101:0x0225, B:107:0x024c, B:108:0x0255, B:109:0x0256, B:110:0x025f, B:118:0x0270), top: B:164:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0210  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [vg5] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v26 */
    public static bg1 g(Context context, vg5 vg5Var) throws yf1 {
        ?? r5;
        int i;
        bg1 bg1Var;
        Cursor cursor;
        int i2;
        Boolean bool;
        pi6 pi6VarX;
        int i3;
        j92 j92VarX;
        Object objJ;
        vg6 vg6Var;
        vi6 vi6Var;
        vg6 vg6Var2;
        boolean z;
        j92 j92VarX2;
        Cursor cursor2;
        String str = " and remote module com.google.android.gms.providerinstaller.dynamite:";
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new yf1("null application Context");
        }
        ThreadLocal threadLocal = j;
        vg6 vg6Var3 = (vg6) threadLocal.get();
        vg6 vg6Var4 = new vg6();
        threadLocal.set(vg6Var4);
        t01 t01Var = t;
        Long l2 = (Long) t01Var.get();
        long jLongValue = l2.longValue();
        try {
            t01Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            ag1 ag1VarY = vg5Var.y(context, a);
            int i4 = ag1VarY.g;
            int i5 = ag1VarY.y;
            StringBuilder sb = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 26 + String.valueOf(i4).length() + 19 + "com.google.android.gms.providerinstaller.dynamite".length() + 1 + String.valueOf(i5).length());
            sb.append("Considering local module com.google.android.gms.providerinstaller.dynamite:");
            sb.append(i4);
            sb.append(" and remote module com.google.android.gms.providerinstaller.dynamite:");
            sb.append(i5);
            Log.i("DynamiteModule", sb.toString());
            int i6 = ag1VarY.r;
            if (i6 != 0) {
                if (i6 != -1) {
                    if (i6 == 1 || ag1VarY.y != 0) {
                        if (i6 == -1) {
                            Log.i("DynamiteModule", "Selected local version of com.google.android.gms.providerinstaller.dynamite");
                            bg1 bg1Var2 = new bg1(applicationContext);
                            if (jLongValue == 0) {
                                t01Var.remove();
                            } else {
                                t01Var.set(l2);
                            }
                            cursor2 = vg6Var4.g;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(vg6Var3);
                            return bg1Var2;
                        }
                        if (i6 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i6);
                            throw new yf1(sb2.toString());
                        }
                        try {
                            try {
                                i2 = ag1VarY.y;
                                try {
                                    try {
                                        try {
                                            synchronized (bg1.class) {
                                                try {
                                                    if (r(context)) {
                                                        throw new yf1("Remote loading disabled");
                                                    }
                                                    bool = r;
                                                    if (bool != null) {
                                                        throw new yf1("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 40 + String.valueOf(i2).length());
                                                        sb3.append("Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= ");
                                                        sb3.append(i2);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (bg1.class) {
                                                            vi6Var = q;
                                                        }
                                                        if (vi6Var != null) {
                                                            throw new yf1("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        vg6Var2 = (vg6) threadLocal.get();
                                                        if (vg6Var2 != null || vg6Var2.g == null) {
                                                            throw new yf1("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = vg6Var2.g;
                                                        new pi3(null);
                                                        synchronized (bg1.class) {
                                                            z = x >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            j92VarX2 = vi6Var.l(new pi3(applicationContext2), i2, new pi3(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            j92VarX2 = vi6Var.x(new pi3(applicationContext2), i2, new pi3(cursor3));
                                                        }
                                                        Context context2 = (Context) pi3.j(j92VarX2);
                                                        if (context2 == null) {
                                                            throw new yf1("Failed to get module context");
                                                        }
                                                        bg1Var = new bg1(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 40 + String.valueOf(i2).length());
                                                        sb4.append("Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= ");
                                                        sb4.append(i2);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        pi6VarX = x(context);
                                                        if (pi6VarX != null) {
                                                            throw new yf1("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelN = pi6VarX.n(pi6VarX.v(), 6);
                                                        i3 = parcelN.readInt();
                                                        parcelN.recycle();
                                                        if (i3 >= 3) {
                                                            vg6Var = (vg6) threadLocal.get();
                                                            if (vg6Var != null) {
                                                                throw new yf1("No cached result cursor holder");
                                                            }
                                                            j92VarX = pi6VarX.t(new pi3(context), i2, new pi3(vg6Var.g));
                                                        } else if (i3 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            j92VarX = pi6VarX.l(new pi3(context), i2);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            j92VarX = pi6VarX.x(new pi3(context), i2);
                                                        }
                                                        objJ = pi3.j(j92VarX);
                                                        if (objJ != null) {
                                                            throw new yf1("Failed to load remote module.");
                                                        }
                                                        bg1Var = new bg1((Context) objJ);
                                                    }
                                                    if (jLongValue == 0) {
                                                        t.remove();
                                                    } else {
                                                        t.set(l2);
                                                    }
                                                    cursor = vg6Var4.g;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    j.set(vg6Var3);
                                                    return bg1Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (RemoteException e) {
                                        e = e;
                                        throw new yf1("Failed to load remote module.", e);
                                    } catch (yf1 e2) {
                                        throw e2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new yf1("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    throw new yf1("Failed to load remote module.", e);
                                } catch (yf1 e4) {
                                    throw e4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw new yf1("Failed to load remote module.", th);
                                }
                            } catch (yf1 e5) {
                                e = e5;
                                r5 = str;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i = ag1VarY.g;
                                if (i != 0 || vg5Var.y(r5, new th6(i)).r != -1) {
                                    throw new yf1("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of com.google.android.gms.providerinstaller.dynamite");
                                bg1Var = new bg1(applicationContext);
                            }
                        } catch (yf1 e6) {
                            e = e6;
                            r5 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i = ag1VarY.g;
                            if (i != 0) {
                            }
                            throw new yf1("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (ag1VarY.g != 0) {
                    i6 = -1;
                    if (i6 == 1) {
                    }
                    if (i6 == -1) {
                        Log.i("DynamiteModule", "Selected local version of com.google.android.gms.providerinstaller.dynamite");
                        bg1 bg1Var3 = new bg1(applicationContext);
                        if (jLongValue == 0) {
                            t01Var.remove();
                        } else {
                            t01Var.set(l2);
                        }
                        cursor2 = vg6Var4.g;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(vg6Var3);
                        return bg1Var3;
                    }
                    if (i6 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i6).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i6);
                        throw new yf1(sb7.toString());
                    }
                    i2 = ag1VarY.y;
                    synchronized (bg1.class) {
                        if (r(context)) {
                            throw new yf1("Remote loading disabled");
                        }
                        bool = r;
                        if (bool != null) {
                            throw new yf1("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 40 + String.valueOf(i2).length());
                            sb8.append("Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= ");
                            sb8.append(i2);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (bg1.class) {
                                vi6Var = q;
                                if (vi6Var != null) {
                                    throw new yf1("DynamiteLoaderV2 was not cached.");
                                }
                                vg6Var2 = (vg6) threadLocal.get();
                                if (vg6Var2 != null) {
                                }
                                throw new yf1("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 40 + String.valueOf(i2).length());
                        sb9.append("Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= ");
                        sb9.append(i2);
                        Log.i("DynamiteModule", sb9.toString());
                        pi6VarX = x(context);
                        if (pi6VarX != null) {
                            throw new yf1("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelN2 = pi6VarX.n(pi6VarX.v(), 6);
                        i3 = parcelN2.readInt();
                        parcelN2.recycle();
                        if (i3 >= 3) {
                            vg6Var = (vg6) threadLocal.get();
                            if (vg6Var != null) {
                                throw new yf1("No cached result cursor holder");
                            }
                            j92VarX = pi6VarX.t(new pi3(context), i2, new pi3(vg6Var.g));
                        } else if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            j92VarX = pi6VarX.l(new pi3(context), i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            j92VarX = pi6VarX.x(new pi3(context), i2);
                        }
                        objJ = pi3.j(j92VarX);
                        if (objJ != null) {
                            throw new yf1("Failed to load remote module.");
                        }
                        bg1Var = new bg1((Context) objJ);
                        if (jLongValue == 0) {
                            t.remove();
                        } else {
                            t.set(l2);
                        }
                        cursor = vg6Var4.g;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(vg6Var3);
                        return bg1Var;
                    }
                }
            }
            int i7 = ag1VarY.g;
            int i8 = ag1VarY.y;
            StringBuilder sb10 = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb10.append("No acceptable module com.google.android.gms.providerinstaller.dynamite found. Local version is ");
            sb10.append(i7);
            sb10.append(" and remote version is ");
            sb10.append(i8);
            sb10.append(".");
            throw new yf1(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                t.remove();
            } else {
                t.set(l2);
            }
            Cursor cursor4 = vg6Var4.g;
            if (cursor4 != null) {
                cursor4.close();
            }
            j.set(vg6Var3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int n(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) t.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (bg1.class) {
                                    try {
                                        n = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            x = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            v = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                vg6 vg6Var = (vg6) j.get();
                                if (vg6Var == null || vg6Var.g != null) {
                                    z4 = false;
                                } else {
                                    vg6Var.g = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new yf1("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof yf1) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new yf1(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new yf1("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    public static boolean r(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (m32.y.y(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            l = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                v = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static void v(ClassLoader classLoader) throws yf1 {
        try {
            vi6 vi6Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                vi6Var = iInterfaceQueryLocalInterface instanceof vi6 ? (vi6) iInterfaceQueryLocalInterface : new vi6(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 1);
            }
            q = vi6Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new yf1("Failed to instantiate dynamite loader", e);
        }
    }

    public static pi6 x(Context context) {
        pi6 pi6Var;
        synchronized (bg1.class) {
            pi6 pi6Var2 = m;
            if (pi6Var2 != null) {
                return pi6Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    pi6Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    pi6Var = iInterfaceQueryLocalInterface instanceof pi6 ? (pi6) iInterfaceQueryLocalInterface : new pi6(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 1);
                }
                if (pi6Var != null) {
                    m = pi6Var;
                    return pi6Var;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #13 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:152:0x002b, inners: #6 }] */
    public static int y(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i;
        Cursor cursor;
        try {
            synchronized (bg1.class) {
                Boolean bool = r;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        v(classLoader);
                                    } catch (yf1 unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!r(context)) {
                                        return 0;
                                    }
                                    if (v) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iN = n(context, str, z, true);
                                                String str2 = n;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderV = ny5.v();
                                                    if (classLoaderV == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            ev.y();
                                                            String str3 = n;
                                                            jr2.m(str3);
                                                            classLoaderV = ev.g(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = n;
                                                            jr2.m(str4);
                                                            classLoaderV = new q26(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    v(classLoaderV);
                                                    declaredField.set(null, classLoaderV);
                                                    r = bool2;
                                                    return iN;
                                                }
                                                return iN;
                                            } catch (yf1 unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                r = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String string = e.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return n(context, str, z, false);
                    } catch (yf1 e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                pi6 pi6VarX = x(context);
                try {
                    if (pi6VarX == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelN = pi6VarX.n(pi6VarX.v(), 6);
                        int i2 = parcelN.readInt();
                        parcelN.recycle();
                        if (i2 >= 3) {
                            ThreadLocal threadLocal = j;
                            vg6 vg6Var = (vg6) threadLocal.get();
                            if (vg6Var != null && (cursor = vg6Var.g) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) pi3.j(pi6VarX.j(new pi3(context), str, z, ((Long) t.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i = cursor3.getInt(0);
                                        if (i > 0) {
                                            vg6 vg6Var2 = (vg6) threadLocal.get();
                                            if (vg6Var2 == null || vg6Var2.g != null) {
                                                z2 = false;
                                            } else {
                                                vg6Var2.g = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e3) {
                                    remoteException = e3;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            pi3 pi3Var = new pi3(context);
                            Parcel parcelV = pi6VarX.v();
                            h06.y(parcelV, pi3Var);
                            parcelV.writeString(str);
                            parcelV.writeInt(z ? 1 : 0);
                            Parcel parcelN2 = pi6VarX.n(parcelV, 5);
                            i = parcelN2.readInt();
                            parcelN2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            pi3 pi3Var2 = new pi3(context);
                            Parcel parcelV2 = pi6VarX.v();
                            h06.y(parcelV2, pi3Var2);
                            parcelV2.writeString(str);
                            parcelV2.writeInt(z ? 1 : 0);
                            Parcel parcelN3 = pi6VarX.n(parcelV2, 3);
                            i = parcelN3.readInt();
                            parcelN3.recycle();
                        }
                        return i;
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                jr2.m(context);
                throw th5;
            } catch (Exception e5) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
                throw th5;
            }
        }
    }
}
