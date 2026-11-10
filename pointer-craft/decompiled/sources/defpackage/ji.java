package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ji implements ai1, sy4, jb0, ys4, md4 {
    public Object a;
    public final /* synthetic */ byte j;
    public Object t;

    public ji(EditText editText, byte b) {
        this.j = b;
        switch (b) {
            case 6:
                this.t = editText;
                hi1 hi1Var = new hi1(editText);
                this.a = hi1Var;
                editText.addTextChangedListener(hi1Var);
                if (uh1.y == null) {
                    synchronized (uh1.g) {
                        try {
                            if (uh1.y == null) {
                                uh1 uh1Var = new uh1();
                                try {
                                    uh1.r = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, uh1.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                uh1.y = uh1Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(uh1.y);
                return;
            default:
                this.t = editText;
                this.a = new q64(editText);
                return;
        }
    }

    public static q04 K(InputStream inputStream) {
        Object g84Var;
        byte[] byteArray;
        try {
            BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, bufferedInputStream.available()));
                byte[] bArr = new byte[8192];
                int i = bufferedInputStream.read(bArr);
                long j = 0;
                while (true) {
                    if (i < 0) {
                        byteArray = byteArrayOutputStream.toByteArray();
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    j += (long) i;
                    if (j > 1048576) {
                        byteArray = null;
                        break;
                    }
                    i = bufferedInputStream.read(bArr);
                }
                bufferedInputStream.close();
                g84Var = byteArray != null ? eg6.n(byteArray) : null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gp4.C(bufferedInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            g84Var = new g84(th3);
        }
        return (q04) (g84Var instanceof g84 ? null : g84Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void w(um2 um2Var) {
        if (um2Var.W > 0) {
            if (um2Var.N.n == qm2.q && !um2Var.s() && !um2Var.p() && !um2Var.X && um2Var.K()) {
                i73 i73Var = um2Var.M.x;
                if ((i73Var.m & 256) != 0) {
                    while (i73Var != null) {
                        if ((i73Var.a & 256) != 0) {
                            ?? Q = i73Var;
                            ?? rb3Var = 0;
                            while (Q != 0) {
                                if (Q instanceof a32) {
                                    a32 a32Var = (a32) Q;
                                    a32Var.o(k33.T(a32Var, 256));
                                } else if ((Q.a & 256) != 0 && (Q instanceof p41)) {
                                    i73 i73Var2 = ((p41) Q).f;
                                    int i = 0;
                                    Q = Q;
                                    rb3Var = rb3Var;
                                    while (i73Var2 != null) {
                                        if ((i73Var2.a & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                rb3Var = rb3Var;
                                                Q = i73Var2;
                                            } else {
                                                if (rb3Var == 0) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var.y(i73Var2);
                                            }
                                        }
                                        i73Var2 = i73Var2.w;
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                Q = k33.Q(rb3Var);
                            }
                        }
                        if ((i73Var.m & 256) == 0) {
                            break;
                        } else {
                            i73Var = i73Var.w;
                        }
                    }
                }
            }
            um2Var.V = false;
            rb3 rb3VarB = um2Var.B();
            Object[] objArr = rb3VarB.j;
            int i2 = rb3VarB.a;
            for (int i3 = 0; i3 < i2; i3++) {
                w((um2) objArr[i3]);
            }
        }
    }

    public void A(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.A(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory B(String str) {
        Bundle bundle;
        Object obj;
        Map map = (Map) this.a;
        if (map == null) {
            Context context = (Context) this.t;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.a = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.a = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public File C() {
        if (((File) this.t) == null) {
            synchronized (this) {
                try {
                    if (((File) this.t) == null) {
                        String str = "PersistedInstallation." + ((ro1) this.a).n() + ".json";
                        ro1 ro1Var = (ro1) this.a;
                        ro1Var.g();
                        File file = new File(ro1Var.g.getNoBackupFilesDir(), str);
                        this.t = file;
                        if (file.exists()) {
                            return (File) this.t;
                        }
                        ro1 ro1Var2 = (ro1) this.a;
                        ro1Var2.g();
                        File file2 = new File(ro1Var2.g.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.t)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.t;
    }

    public KeyListener D(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof zh1)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new zh1(keyListener);
    }

    public Long E(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        ba4 ba4VarX = ba4.x("SELECT long_value FROM Preference where `key`=?", 1);
        ba4VarX.G(str, 1);
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            ba4VarX.a();
        }
    }

    public t33 F() {
        return (t33) ((tp3) this.a).getValue();
    }

    public AutofillManager G() {
        AutofillManager autofillManager = (AutofillManager) this.a;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerN = al0.n(((Context) this.t).getSystemService(al0.A()));
        if (autofillManagerN != null) {
            this.a = autofillManagerN;
            return autofillManagerN;
        }
        l0.z("Could not locate AutofillManager from context");
        return null;
    }

    public fd4 H(String str) {
        fd4 fd4Var;
        hd4 hd4Var = (hd4) this.t;
        synchronized (hd4Var.r) {
            fd4Var = (fd4) hd4Var.n.l(str);
        }
        return fd4Var;
    }

    public void I(wu wuVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", wuVar.n());
            jSONObject.put("Status", du4.D(wuVar.l()));
            jSONObject.put("AuthToken", wuVar.y());
            jSONObject.put("RefreshToken", wuVar.x());
            jSONObject.put("TokenCreationEpochInSecs", wuVar.j());
            jSONObject.put("ExpiresInSecs", wuVar.r());
            jSONObject.put("FisError", wuVar.v());
            ro1 ro1Var = (ro1) this.a;
            ro1Var.g();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ro1Var.g.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(C())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void J(lw3 lw3Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        workDatabase_Impl.y();
        workDatabase_Impl.r();
        try {
            ((mw3) this.a).b(lw3Var);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(String str, ou0 ou0Var) {
        q12 q12Var;
        Object g84Var;
        if (ou0Var instanceof q12) {
            q12Var = (q12) ou0Var;
            int i = q12Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                q12Var.w = i - Integer.MIN_VALUE;
            } else {
                q12Var = new q12(this, ou0Var);
            }
        } else {
            q12Var = new q12(this, ou0Var);
        }
        Object objG = q12Var.m;
        int i2 = q12Var.w;
        if (i2 == 0) {
            js2.o(objG);
            if (ay4.P(str, "content://", false)) {
                try {
                    g84Var = ((Context) this.t).getContentResolver().openInputStream(Uri.parse(str));
                } catch (Throwable th) {
                    g84Var = new g84(th);
                }
                if (g84Var instanceof g84) {
                    g84Var = null;
                }
                InputStream inputStream = (InputStream) g84Var;
                if (inputStream != null) {
                    return K(inputStream);
                }
            } else {
                gp2 gp2Var = (gp2) ((qb1) this.a).get();
                q12Var.w = 1;
                objG = gp2Var.g(str, q12Var);
                px0 px0Var = px0.j;
                if (objG == px0Var) {
                    return px0Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(objG);
        go4 go4Var = (go4) objG;
        if (go4Var != null) {
            return eg6.n(go4Var.g());
        }
        return null;
    }

    public void M(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.t).getContext().obtainStyledAttributes(attributeSet, r24.t, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            V(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void N(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ny5.r(i, view, G(), z);
        }
    }

    public wh1 O(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        q64 q64Var = (q64) this.a;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            ji jiVar = (ji) q64Var.t;
            if (!(inputConnection instanceof wh1)) {
                inputConnection = new wh1(editorInfo, inputConnection, (EditText) jiVar.t);
            }
            inputConnection2 = inputConnection;
        }
        return (wh1) inputConnection2;
    }

    public void P() {
        ((hd4) this.t).g();
    }

    public void Q(Bundle bundle) {
        hd4 hd4Var = (hd4) this.t;
        id4 id4Var = hd4Var.g;
        if (!hd4Var.v) {
            hd4Var.g();
        }
        if (id4Var.a().t.compareTo(wt2.m) >= 0) {
            uo1.p(id4Var.a().t, "performRestore cannot be called when owner is ");
            return;
        }
        if (hd4Var.l) {
            l0.z("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                gf6.n("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        hd4Var.x = bundle2;
        hd4Var.l = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[LOOP:0: B:10:0x002b->B:23:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[EDGE_INSN: B:34:0x0073->B:24:0x0073 BREAK  A[LOOP:0: B:10:0x002b->B:23:0x0070], SYNTHETIC] */
    public void R(Bundle bundle) {
        hd4 hd4Var = (hd4) this.t;
        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        Bundle bundle2 = hd4Var.x;
        if (bundle2 != null) {
            bundleN.putAll(bundle2);
        }
        synchronized (hd4Var.r) {
            hb3 hb3Var = hd4Var.n;
            Object[] objArr = hb3Var.y;
            Object[] objArr2 = hb3Var.r;
            long[] jArr = hb3Var.g;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                String str = (String) objArr[i4];
                                Bundle bundleG = ((fd4) objArr2[i4]).g();
                                str.getClass();
                                bundleN.putBundle(str, bundleG);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (bundleN.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleN);
    }

    public wu S() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(C());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        vu vuVarG = wu.g();
        vuVarG.n(strOptString);
        vuVarG.l(ei3._values()[iOptInt]);
        vuVarG.y(strOptString2);
        vuVarG.x(strOptString3);
        vuVarG.j(jOptLong);
        vuVarG.r(jOptLong2);
        vuVarG.v(strOptString4);
        return vuVarG.g();
    }

    public void T(String str, fd4 fd4Var) {
        hd4 hd4Var = (hd4) this.t;
        synchronized (hd4Var.r) {
            if (hd4Var.n.y(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            hd4Var.n.c(str, fd4Var);
        }
    }

    public void U() {
        if (!((hd4) this.t).j) {
            l0.z("Can not perform this action after onSaveInstanceState");
            return;
        }
        i44 i44Var = (i44) this.a;
        if (i44Var == null) {
            i44Var = new i44(this);
        }
        this.a = i44Var;
        try {
            kt2.class.getDeclaredConstructor(null);
            i44 i44Var2 = (i44) this.a;
            if (i44Var2 != null) {
                i44Var2.y(kt2.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + kt2.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void V(boolean z) {
        hi1 hi1Var = (hi1) ((ji) ((q64) this.a).t).a;
        if (hi1Var.a != z) {
            if (hi1Var.t != null) {
                ph1 ph1VarG = ph1.g();
                gi1 gi1Var = hi1Var.t;
                ph1VarG.getClass();
                xs2.t(gi1Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = ph1VarG.g;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ph1VarG.y.remove(gi1Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            hi1Var.a = z;
            if (z) {
                hi1.g(hi1Var.j, ph1.g().r());
            }
        }
    }

    public void W(int i, int i2, int i3, int i4) {
        xb0 xb0Var = (xb0) this.a;
        xb0Var.m.set(i, i2, i3, i4);
        Rect rect = xb0Var.a;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public Bundle a(String str) {
        Bundle bundle;
        hd4 hd4Var = (hd4) this.t;
        if (!hd4Var.l) {
            l0.z("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = hd4Var.x;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                gf6.n(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            hd4Var.x = null;
        }
        return bundle;
    }

    public void b(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.b(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void c(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.c(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.jb0
    public void cancel() {
        if (((bs) this.a).compareAndSet(1, 1)) {
            return;
        }
        ((un) this.t).g();
    }

    public void d(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.d(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void e(pw1 pw1Var, View view, boolean z) {
        view.getClass();
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.e(pw1Var, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void f(pw1 pw1Var, Bundle bundle, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.f(pw1Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.ai1
    public Object g() {
        return (xg5) this.t;
    }

    public void h(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.h(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void i(pw1 pw1Var, boolean z) {
        kx1 kx1Var = (kx1) this.t;
        yk ykVar = kx1Var.f.k;
        pw1 pw1Var2 = kx1Var.d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.i(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.md4
    public Object j(pc4 pc4Var, Object obj) {
        return ((bz1) this.t).l(pc4Var, obj);
    }

    public void k(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.k(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.ys4
    public float l(float f) {
        u21 u21Var = (u21) this.t;
        d52 d52Var = u21Var.q().c;
        List list = u21Var.q().g;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            w33 w33Var = (w33) list.get(i);
            gc6.g(u21Var.q());
            int i2 = u21Var.q().x;
            int i3 = u21Var.q().n;
            int i4 = u21Var.q().y;
            int i5 = w33Var.a;
            u21Var.w();
            d52Var.getClass();
            float f4 = i5 - 0.0f;
            if (f4 <= 0.0f && f4 > f2) {
                f2 = f4;
            }
            if (f4 >= 0.0f && f4 < f3) {
                f3 = f4;
            }
        }
        if (f2 == Float.NEGATIVE_INFINITY) {
            f2 = f3;
        }
        if (f3 == Float.POSITIVE_INFINITY) {
            f3 = f2;
        }
        if (!u21Var.r()) {
            if (sp2.o(u21Var, f)) {
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
        }
        if (!u21Var.g()) {
            f2 = 0.0f;
            if (!sp2.o(u21Var, f)) {
                f3 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) ((bb4) this.a).x(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            pc2.r("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList m() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        q64 q64Var = (q64) this.a;
        Context context = (Context) this.t;
        Class cls = (Class) q64Var.t;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new fm0((String) it.next(), (byte) 0));
        }
        return arrayList2;
    }

    @Override // defpackage.ys4
    public float n(float f, float f2) {
        u21 u21Var = (u21) this.t;
        int iC = u21Var.c();
        tp3 tp3Var = u21Var.w;
        int i = ((mo3) tp3Var.getValue()).r + iC;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = u21Var.v;
        if (f < 0.0f) {
            i2++;
        }
        int iW = xs2.w(((int) (f2 / i)) + i2, 0, u21Var.w());
        u21Var.c();
        int i3 = ((mo3) tp3Var.getValue()).r;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((xs2.w(xs2.w(iW, i4, (int) j3), 0, u21Var.w()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }

    public void o(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.o(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void p(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.p(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q() {
        Object[] objArr;
        rb3 rb3Var = (rb3) this.t;
        Arrays.sort(rb3Var.j, 0, rb3Var.a, ek3.y);
        int i = rb3Var.a;
        um2[] um2VarArr = (um2[]) this.a;
        if (um2VarArr == null || um2VarArr.length < i) {
            objArr = um2VarArr;
            objArr = new um2[Math.max(16, i)];
        }
        objArr = um2VarArr;
        this.a = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = rb3Var.j[i2];
        }
        rb3Var.j();
        while (true) {
            i--;
            if (-1 >= i) {
                this.a = objArr;
                return;
            }
            um2 um2Var = objArr[i];
            um2Var.getClass();
            if (um2Var.V) {
                w(um2Var);
            }
            objArr[i] = 0;
        }
    }

    @Override // defpackage.md4
    public Object r(Object obj) {
        return ((xy1) this.a).a(obj);
    }

    public void s(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.s(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public g24 t() {
        String str = (String) this.a;
        if ("first_party".equals(str)) {
            l0.u("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (((String) this.t) == null) {
            l0.u("Product id must be provided.");
            return null;
        }
        if (str != null) {
            return new g24(this);
        }
        l0.u("Product type must be provided.");
        return null;
    }

    public String toString() {
        switch (this.j) {
            case 24:
                String str = "[ ";
                if (((eu4) this.t) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((eu4) this.t).i[i] + " ";
                    }
                }
                return str + "] " + ((eu4) this.t);
            default:
                return super.toString();
        }
    }

    public void u(pw1 pw1Var, boolean z) {
        pw1 pw1Var2 = ((kx1) this.t).d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.u(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            fj.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.ai1
    public boolean v(CharSequence charSequence, int i, int i2, ff5 ff5Var) {
        if ((ff5Var.r & 4) > 0) {
            return true;
        }
        if (((xg5) this.t) == null) {
            this.t = new xg5(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((hi0) this.a).getClass();
        ((xg5) this.t).setSpan(new gf5(ff5Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.sy4
    public boolean x(Object obj, Object obj2) {
        wq2 wq2Var = (wq2) this.t;
        return yf2.p(wq2Var.y(obj), wq2Var.y(obj2));
    }

    @Override // defpackage.sy4
    public void y(ry4 ry4Var) {
        ta3 ta3Var = (ta3) this.a;
        ta3Var.g();
        ya3 ya3Var = ry4Var.j;
        Object[] objArr = ya3Var.y;
        long[] jArr = ya3Var.r;
        int i = ya3Var.v;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objY = ((wq2) this.t).y(obj);
            int iN = ta3Var.n(objY);
            int i3 = iN >= 0 ? ta3Var.r[iN] : 0;
            if (i3 == 7) {
                ry4Var.remove(obj);
            } else {
                ta3Var.l(i3 + 1, objY);
            }
            i = i2;
        }
    }

    public void z(pw1 pw1Var, boolean z) {
        kx1 kx1Var = (kx1) this.t;
        yk ykVar = kx1Var.f.k;
        pw1 pw1Var2 = kx1Var.d;
        if (pw1Var2 != null) {
            pw1Var2.w().i.z(pw1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public /* synthetic */ ji(byte b, boolean z) {
        this.j = b;
    }

    public /* synthetic */ ji(Object obj, byte b) {
        this.j = b;
        this.a = obj;
    }

    public /* synthetic */ ji(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    public ji(ThreadPoolExecutor threadPoolExecutor) {
        this.j = (byte) 26;
        this.a = new mr(0);
        this.t = threadPoolExecutor;
    }

    public ji(Context context, qb1 qb1Var) {
        this.j = (byte) 9;
        context.getClass();
        this.t = context;
        this.a = qb1Var;
    }

    public ji(hd4 hd4Var) {
        this.j = (byte) 28;
        this.t = hd4Var;
        this.a = new ji((byte) 27, (Object) hd4Var, false);
    }

    public ji(kx1 kx1Var) {
        this.j = (byte) 8;
        this.t = kx1Var;
        this.a = new CopyOnWriteArrayList();
    }

    public ji(WorkDatabase_Impl workDatabase_Impl) {
        this.j = (byte) 23;
        this.t = workDatabase_Impl;
        this.a = new mw3(workDatabase_Impl, (byte) 0);
    }

    public ji(um2 um2Var, t33 t33Var) {
        this.j = (byte) 12;
        this.t = um2Var;
        this.a = kq2.M(t33Var);
    }

    public ji(u21 u21Var, bb4 bb4Var, po3 po3Var) {
        this.j = (byte) 20;
        this.t = u21Var;
        this.a = bb4Var;
    }

    public ji(un unVar) {
        this.j = (byte) 19;
        this.t = unVar;
        this.a = new bs(0);
    }

    public /* synthetic */ ji(byte b, Object obj, boolean z) {
        this.j = b;
        this.t = obj;
    }

    public ji(Context context) {
        this.j = (byte) 15;
        this.a = null;
        this.t = context;
    }

    public ji(wq2 wq2Var) {
        this.j = (byte) 13;
        this.t = wq2Var;
        ta3 ta3Var = mi3.g;
        this.a = new ta3();
    }

    public ji(byte b) {
        this.j = b;
        switch (b) {
            case 17:
                this.t = new hb3();
                this.a = new hb3();
                break;
            case 18:
                this.t = new rb3(new um2[16]);
                break;
            default:
                this.t = Choreographer.getInstance();
                this.a = Looper.myLooper();
                break;
        }
    }
}
