package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class rk4 implements qd1, kt0, vt4, ua0, ny4, jj3, oh4, xj3, n64 {
    public static rk4 m;
    public static final vl3 q = new vl3();
    public static final ul3 w = new ul3();
    public Object a;
    public final /* synthetic */ byte j;
    public Object t;

    public rk4(ArrayList arrayList, ArrayList arrayList2) {
        this.j = (byte) 14;
        int size = arrayList.size();
        this.t = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.t)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public static rk4 U(ContentCaptureSession contentCaptureSession, View view) {
        return new rk4((Object) contentCaptureSession, (Object) view, (byte) 8);
    }

    public static synchronized rk4 f() {
        rk4 rk4Var;
        rk4Var = m;
        if (rk4Var == null) {
            rk4Var = new rk4((byte) 0, false);
            rk4Var.t = null;
            rk4Var.a = null;
            m = rk4Var;
        }
        return rk4Var;
    }

    public boolean A(Context context) {
        if (((Boolean) this.a) == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.t).booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.a).booleanValue();
    }

    public boolean B(Context context) {
        Boolean boolValueOf = (Boolean) this.t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.t = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.t).booleanValue();
    }

    public boolean C(View view) {
        jk5 jk5Var = (jk5) this.a;
        kk5 kk5Var = (kk5) this.t;
        int iH = kk5Var.h();
        int iL = kk5Var.l();
        int iM = kk5Var.m(view);
        int iF = kk5Var.f(view);
        jk5Var.y = iH;
        jk5Var.r = iL;
        jk5Var.n = iM;
        jk5Var.v = iF;
        jk5Var.g = 24579;
        return jk5Var.g();
    }

    public nj6 D(Activity activity, s84 s84Var) {
        if (((dw5) s84Var).t) {
            return br2.s(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", ((dw5) s84Var).j);
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        x25 x25Var = new x25();
        intent.putExtra("result_receiver", new j06((Handler) this.a, x25Var));
        activity.startActivity(intent);
        return x25Var.g;
    }

    public AutofillId E(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionX = b2.x(this.t);
        q64 q64VarP = jr2.p((View) this.a);
        Objects.requireNonNull(q64VarP);
        return sj.l(contentCaptureSessionX, y8.r(q64VarP.t), j);
    }

    public s25 F(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new s25(sj.j(b2.x(this.t), autofillId, j));
        }
        return null;
    }

    public void G(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            sj.t(b2.x(this.t), viewStructure);
        }
    }

    public void H(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            sj.a(b2.x(this.t), autofillId);
        }
    }

    public void I(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            sj.m(b2.x(this.t), autofillId, str);
        }
    }

    public void J(cv1 cv1Var) {
        f74 f74Var = (f74) this.a;
        ha5 ha5Var = (ha5) this.t;
        int i = cv1Var.y;
        if (i == 0) {
            f74Var.execute(new i26((Object) ha5Var, (Object) cv1Var.g, (byte) 5));
        } else {
            f74Var.execute(new xa0(ha5Var, i, (byte) 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public Enum K(ou0 ou0Var) throws Throwable {
        n62 n62Var;
        Context context = (Context) this.t;
        if (ou0Var instanceof n62) {
            n62Var = (n62) ou0Var;
            int i = n62Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                n62Var.w = i - Integer.MIN_VALUE;
            } else {
                n62Var = new n62(this, ou0Var);
            }
        } else {
            n62Var = new n62(this, ou0Var);
        }
        Object objE = n62Var.m;
        int i2 = n62Var.w;
        v52 v52Var = v52.m;
        try {
            if (i2 == 0) {
                js2.o(objE);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 28) {
                    return v52.t;
                }
                if (i3 >= 31 && ue5.D(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
                    return v52Var;
                }
                BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(BluetoothManager.class);
                mu0 mu0Var = null;
                BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                if (adapter != null && adapter.isEnabled()) {
                    aj6 aj6Var = mf1.j;
                    long jL = ye6.l(1500L, pf1.MILLISECONDS);
                    c cVar = new c((bz1) this.a, context, adapter, mu0Var, (byte) 26);
                    n62Var.w = 1;
                    objE = br2.E(yf2.a0(jL), cVar, n62Var);
                    px0 px0Var = px0.j;
                    if (objE == px0Var) {
                        return px0Var;
                    }
                }
                return v52Var;
            }
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objE);
            v52 v52Var2 = (v52) objE;
            return v52Var2 == null ? v52.a : v52Var2;
        } catch (SecurityException unused) {
        }
        return v52Var;
    }

    public nj6 L() {
        String str;
        ja6 ja6Var = (ja6) this.t;
        String str2 = ja6Var.y;
        at0 at0Var = ja6.r;
        at0Var.n("requestInAppReview (%s)", str2);
        jj6 jj6Var = ja6Var.g;
        if (jj6Var != null) {
            x25 x25Var = new x25();
            jj6Var.g().post(new wf6(jj6Var, x25Var, x25Var, new x56(ja6Var, x25Var, x25Var)));
            return x25Var.g;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", at0.l(at0Var.j, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = ew5.g;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) ew5.y.get(-1)) + ")";
        } else {
            str = "";
        }
        return br2.b(new l74(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
    }

    public void M(ArrayList arrayList) {
        this.t = arrayList;
    }

    public void N(byte[] bArr) {
        this.a = bArr;
    }

    public void O(kg3 kg3Var) {
        this.a = kg3Var;
    }

    public void P() {
        this.a = null;
    }

    public void Q(lg3 lg3Var) {
        this.t = lg3Var;
    }

    public void R(String str) {
        if (TextUtils.isEmpty(str)) {
            l0.u("offerToken can not be empty");
        } else {
            this.a = str;
        }
    }

    public void S(jz3 jz3Var) {
        this.t = jz3Var;
        if (jz3Var.g() != null) {
            jz3Var.g().getClass();
            String str = jz3Var.g().n;
            if (str != null) {
                this.a = str;
            }
        }
    }

    public void T(zb6 zb6Var) {
        boolean z;
        ka3 ka3Var = (ka3) this.t;
        synchronized (ka3Var.g) {
            z = ka3Var.x == ka3.m;
            ka3Var.x = zb6Var;
        }
        if (z) {
            tq tqVarK = tq.K();
            y9 y9Var = ka3Var.a;
            u31 u31Var = tqVarK.y;
            if (u31Var.n == null) {
                synchronized (u31Var.y) {
                    try {
                        if (u31Var.n == null) {
                            u31Var.n = u31.K(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            u31Var.n.post(y9Var);
        }
        if (zb6Var instanceof vl3) {
            ((ol4) this.a).a((vl3) zb6Var);
        } else if (zb6Var instanceof tl3) {
            ((ol4) this.a).m(((tl3) zb6Var).y);
        }
    }

    public void V(Object obj) {
        vw4 vw4VarE;
        synchronized (this) {
            Object obj2 = ((AtomicReference) this.a).get();
            obj2.getClass();
            vw4VarE = e(obj2, obj);
            if (vw4VarE instanceof uw4) {
                ((AtomicReference) this.a).set(((uw4) vw4VarE).r);
            }
        }
        Iterator it = ((pw4) this.t).r.iterator();
        while (it.hasNext()) {
            ((xy1) it.next()).a(vw4VarE);
        }
        if (vw4VarE instanceof uw4) {
            uw4 uw4Var = (uw4) vw4VarE;
            Object obj3 = uw4Var.g;
            ArrayList arrayList = h(obj3).y;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList.get(i2);
                i2++;
                ((bz1) obj4).l(obj3, obj);
            }
            Object obj5 = uw4Var.r;
            ArrayList arrayList2 = h(obj5).g;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj6 = arrayList2.get(i);
                i++;
                ((bz1) obj6).l(obj5, obj);
            }
        }
    }

    @Override // defpackage.ua0
    public void a(l34 l34Var, IOException iOException) {
        x25 x25Var = (x25) this.t;
        if (iOException instanceof InterruptedIOException) {
            t32 t32Var = ap1.j;
            x25Var.g(new bp1("DEADLINE_EXCEEDED", iOException));
        } else {
            t32 t32Var2 = ap1.j;
            x25Var.g(new bp1("INTERNAL", iOException));
        }
    }

    @Override // defpackage.n64
    public void accept(Object obj, Object obj2) {
        pv5 pv5Var = new pv5((zv5) this.t, (x25) obj2, (byte) 0);
        fv5 fv5Var = (fv5) ((bw5) obj).j();
        bk bkVar = (bk) this.a;
        Parcel parcelG = fv5Var.g();
        int i = yu5.g;
        parcelG.writeStrongBinder(pv5Var);
        yu5.y(parcelG, bkVar);
        fv5Var.y(parcelG, 1);
    }

    @Override // defpackage.ny4
    public oy4 apply() {
        return ((in2) this.t).r(this.a);
    }

    @Override // defpackage.vt4
    public bq4 b() {
        return (rl1) this.t;
    }

    public du c() {
        String str = ((ArrayList) this.t) == null ? " events" : "";
        if (str.isEmpty()) {
            return new du((ArrayList) this.t, (byte[]) this.a);
        }
        l0.z("Missing required properties:".concat(str));
        return null;
    }

    public ArrayList d(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        ba4 ba4VarX = ba4.x("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ba4VarX.a();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ba4VarX.a();
            throw th;
        }
    }

    public vw4 e(Object obj, Object obj2) {
        for (Map.Entry entry : h(obj).r.entrySet()) {
            sw4 sw4Var = (sw4) entry.getKey();
            bz1 bz1Var = (bz1) entry.getValue();
            if (sw4Var.g(obj2)) {
                return new uw4(obj, obj2, ((nw4) bz1Var.l(obj, obj2)).g);
            }
        }
        return new tw4(obj, obj2);
    }

    @Override // defpackage.vt4
    public hu4 g() {
        return (sl1) this.a;
    }

    public ow4 h(Object obj) {
        Map map = ((pw4) this.t).y;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((sw4) entry.getKey()).g(obj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((ow4) ((Map.Entry) it.next()).getValue());
        }
        ow4 ow4Var = (ow4) cj0.l0(arrayList);
        if (ow4Var != null) {
            return ow4Var;
        }
        throw new IllegalStateException(("Missing definition for state " + obj.getClass().getSimpleName() + "!").toString());
    }

    public tu i() {
        return new tu((lg3) this.t, (kg3) this.a);
    }

    @Override // defpackage.ny4
    public boolean j(qm3 qm3Var) {
        return true;
    }

    public List k() {
        return (ArrayList) this.t;
    }

    @Override // defpackage.oh4
    public int l(int i) {
        CharSequence charSequence = (CharSequence) this.t;
        do {
            i = ((aq3) this.a).a(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.oh4
    public int m(int i) {
        do {
            i = ((aq3) this.a).m(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.t).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.oh4
    public int n(int i) {
        do {
            i = ((aq3) this.a).a(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.t).charAt(i - 1)));
        return i;
    }

    public ArrayList o(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        ba4 ba4VarX = ba4.x("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ba4VarX.a();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ba4VarX.a();
            throw th;
        }
    }

    public z10 p() {
        if (((jz3) this.t) != null) {
            return new z10(this);
        }
        l0.q("ProductDetails is required for constructing ProductDetailsParams.");
        return null;
    }

    public void q(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        ((ArrayList) this.t).add(sb.toString());
    }

    @Override // defpackage.ua0
    public void r(l34 l34Var, z74 z74Var) throws Throwable {
        ap1 ap1VarValueOf;
        Throwable th;
        String strN;
        Object objOpt;
        Charset charsetG;
        bi6 bi6Var = ((zo1) this.a).r;
        x25 x25Var = (x25) this.t;
        t32 t32Var = ap1.j;
        int i = z74Var.m;
        t32Var.getClass();
        if (i == 200) {
            ap1VarValueOf = ap1.t;
        } else if (i == 409) {
            ap1VarValueOf = ap1.s;
        } else if (i == 429) {
            ap1VarValueOf = ap1.b;
        } else if (i == 400) {
            ap1VarValueOf = ap1.q;
        } else if (i == 401) {
            ap1VarValueOf = ap1.h;
        } else if (i == 403) {
            ap1VarValueOf = ap1.i;
        } else if (i == 404) {
            ap1VarValueOf = ap1.c;
        } else if (i == 503) {
            ap1VarValueOf = ap1.z;
        } else if (i != 504) {
            switch (i) {
                case 499:
                    ap1VarValueOf = ap1.a;
                    break;
                case 500:
                    ap1VarValueOf = ap1.u;
                    break;
                case 501:
                    ap1VarValueOf = ap1.p;
                    break;
                default:
                    ap1VarValueOf = ap1.m;
                    break;
            }
        } else {
            ap1VarValueOf = ap1.w;
        }
        b84 b84Var = z74Var.c;
        b84Var.getClass();
        r70 r70VarT = b84Var.t();
        try {
            e43 e43VarX = b84Var.x();
            if (e43VarX == null || (charsetG = e43.g(e43VarX)) == null) {
                charsetG = od0.g;
            }
            strN = r70VarT.N(ws5.l(r70VarT, charsetG));
            try {
                r70VarT.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (r70VarT != null) {
                try {
                    r70VarT.close();
                } catch (Throwable th4) {
                    kf6.g(th3, th4);
                }
            }
            th = th3;
            strN = null;
        }
        if (th != null) {
            throw th;
        }
        int i2 = bp1.t;
        bi6Var.getClass();
        String strName = ap1VarValueOf.name();
        try {
            JSONObject jSONObject = new JSONObject(strN == null ? "" : strN).getJSONObject("error");
            if (jSONObject.opt("status") instanceof String) {
                String string = jSONObject.getString("status");
                string.getClass();
                ap1VarValueOf = ap1.valueOf(string);
                strName = ap1VarValueOf.name();
            }
            if (jSONObject.opt("message") instanceof String) {
                String string2 = jSONObject.getString("message");
                string2.getClass();
                if (string2.length() > 0) {
                    strName = jSONObject.getString("message");
                }
            }
            objOpt = jSONObject.opt("details");
            if (objOpt != null) {
                try {
                    objOpt = bi6.p(objOpt);
                } catch (IllegalArgumentException unused) {
                    ap1VarValueOf = ap1.u;
                    strName = "INTERNAL";
                } catch (JSONException unused2) {
                }
            }
        } catch (IllegalArgumentException unused3) {
            objOpt = null;
        } catch (JSONException unused4) {
            objOpt = null;
        }
        bp1 bp1Var = ap1VarValueOf == ap1.t ? null : new bp1(strName, ap1VarValueOf, objOpt);
        if (bp1Var != null) {
            x25Var.g(bp1Var);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strN);
            Object objOpt2 = jSONObject2.opt("data");
            if (objOpt2 == null) {
                objOpt2 = jSONObject2.opt("result");
            }
            if (objOpt2 == null) {
                x25Var.g(new bp1("Response is missing data field.", ap1.u, null));
            } else {
                bi6Var.getClass();
                x25Var.y(new c92(bi6.p(objOpt2)));
            }
        } catch (JSONException e) {
            t32 t32Var2 = ap1.j;
            x25Var.g(new bp1("Response is not valid JSON object.", e));
        }
    }

    @Override // defpackage.xj3
    public void s(nj6 nj6Var) {
        bt5 bt5Var = (bt5) this.t;
        x25 x25Var = (x25) this.a;
        synchronized (bt5Var.x) {
            bt5Var.v.remove(x25Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    @Override // defpackage.jj3
    public tp5 t(View view, tp5 tp5Var) {
        boolean z;
        b20 b20Var = (b20) this.t;
        ag1 ag1Var = (ag1) this.a;
        int i = ag1Var.g;
        int i2 = ag1Var.y;
        int i3 = ag1Var.r;
        pp5 pp5Var = tp5Var.g;
        nd2 nd2VarT = pp5Var.t(519);
        nd2 nd2VarT2 = pp5Var.t(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) b20Var.g;
        int i4 = nd2VarT.y;
        int i5 = nd2VarT.r;
        int i6 = nd2VarT.g;
        bottomSheetBehavior.k = i4;
        boolean z2 = true;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.b;
        if (z4) {
            int iG = tp5Var.g();
            bottomSheetBehavior.f = iG;
            paddingBottom = iG + i3;
        }
        if (bottomSheetBehavior.s) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.p) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i7 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.z || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.h && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.o) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = nd2VarT.y;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
        boolean z5 = b20Var.y;
        if (z5) {
            bottomSheetBehavior.c = nd2VarT2.n;
        }
        if (!z4 && !z5) {
            return tp5Var;
        }
        bottomSheetBehavior.L();
        return tp5Var;
    }

    public String toString() {
        switch (this.j) {
            case 17:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.a.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.t;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        jk5 jk5Var = (jk5) this.a;
        kk5 kk5Var = (kk5) this.t;
        int iH = kk5Var.h();
        int iL = kk5Var.l();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewU = kk5Var.u(i);
            int iM = kk5Var.m(viewU);
            int iF = kk5Var.f(viewU);
            jk5Var.y = iH;
            jk5Var.r = iL;
            jk5Var.n = iM;
            jk5Var.v = iF;
            if (i3 != 0) {
                jk5Var.g = i3;
                if (jk5Var.g()) {
                    return viewU;
                }
            }
            if (i4 != 0) {
                jk5Var.g = i4;
                if (jk5Var.g()) {
                    view = viewU;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // defpackage.qd1
    public Object v(s3 s3Var, n10 n10Var) {
        Object objG = ((p8) this.a).g(ub3.t, new n8(this, s3Var, null), n10Var);
        return objG == px0.j ? objG : og5.g;
    }

    public k65 w(List list) {
        ug1 ug1Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            ug1Var = null;
            while (i < size) {
                try {
                    ug1 ug1Var2 = (ug1) list.get(i);
                    try {
                        ug1Var2.g((vg1) this.a);
                        i++;
                        ug1Var = ug1Var2;
                    } catch (Exception e2) {
                        e = e2;
                        ug1Var = ug1Var2;
                        StringBuilder sb = new StringBuilder();
                        int iR = ((aq3) ((vg1) this.a).w).r();
                        u75 u75VarR = ((vg1) this.a).r();
                        vg1 vg1Var = (vg1) this.a;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iR + ", composition=" + u75VarR + ", selection=" + u75.j(sp2.y(vg1Var.t, vg1Var.a)) + "):");
                        sb.append('\n');
                        cj0.p0(list, sb, new h(ug1Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            vg1 vg1Var2 = (vg1) this.a;
            vg1Var2.getClass();
            cj cjVar = new cj(((aq3) vg1Var2.w).toString());
            vg1 vg1Var3 = (vg1) this.a;
            long jY = sp2.y(vg1Var3.t, vg1Var3.a);
            u75 u75Var = u75.l(((k65) this.t).y) ? null : new u75(jY);
            k65 k65Var = new k65(cjVar, u75Var != null ? u75Var.g : sp2.y(u75.v(jY), u75.x(jY)), ((vg1) this.a).r());
            this.t = k65Var;
            return k65Var;
        } catch (Exception e4) {
            ug1Var = null;
            e = e4;
        }
    }

    @Override // defpackage.ny4
    public boolean x() {
        return true;
    }

    @Override // defpackage.oh4
    public int y(int i) {
        do {
            i = ((aq3) this.a).m(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.t).charAt(i)));
        return i;
    }

    public void z() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionX = b2.x(this.t);
            q64 q64VarP = jr2.p((View) this.a);
            Objects.requireNonNull(q64VarP);
            sj.q(contentCaptureSessionX, y8.r(q64VarP.t), new long[]{Long.MIN_VALUE});
        }
    }

    @Override // defpackage.ny4
    public void cancel() {
    }

    public rk4(ml mlVar, AlertDialog alertDialog) {
        this.j = (byte) 27;
        this.t = alertDialog;
        this.a = mlVar;
    }

    public /* synthetic */ rk4(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    public /* synthetic */ rk4(Object obj) {
        this.j = (byte) 17;
        this.a = obj;
        this.t = new ArrayList();
    }

    public rk4(String str, mu5 mu5Var, aj6 aj6Var) {
        this.j = (byte) 3;
        this.a = str;
        this.t = mu5Var;
    }

    public rk4(ja6 ja6Var) {
        this.j = (byte) 29;
        this.a = new Handler(Looper.getMainLooper());
        this.t = ja6Var;
    }

    public rk4(pw4 pw4Var) {
        this.j = (byte) 20;
        this.t = pw4Var;
        this.a = new AtomicReference(pw4Var.g);
    }

    public rk4(WorkDatabase_Impl workDatabase_Impl, byte b) {
        this.j = b;
        switch (b) {
            case 25:
                this.t = workDatabase_Impl;
                this.a = new s51(workDatabase_Impl, (byte) 2);
                break;
            default:
                this.t = workDatabase_Impl;
                this.a = new s51(workDatabase_Impl, (byte) 0);
                break;
        }
    }

    public rk4(byte b) {
        this.j = b;
        switch (b) {
            case 19:
                this.t = new LinkedHashMap();
                this.a = new LinkedHashMap();
                break;
            default:
                this.t = new ka3();
                this.a = new ol4();
                T(w);
                break;
        }
    }

    public rk4(kk5 kk5Var) {
        this.j = (byte) 22;
        this.t = kk5Var;
        jk5 jk5Var = new jk5();
        jk5Var.g = 0;
        this.a = jk5Var;
    }

    public rk4(tl1 tl1Var) {
        this.j = (byte) 11;
        vl1 vl1Var = tl1Var.r;
        this.t = new rl1(tl1Var, vl1Var.v().b(), -1L, true);
        this.a = new sl1(tl1Var, vl1Var.v().g(), -1L, true);
    }

    public rk4(Animation animation) {
        this.j = (byte) 13;
        this.t = animation;
        this.a = null;
    }

    public rk4(Animator animator) {
        this.j = (byte) 13;
        this.t = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        animatorSet.play(animator);
    }

    public /* synthetic */ rk4(byte b, boolean z) {
        this.j = b;
    }

    public rk4(int i, int i2) {
        this.j = (byte) 14;
        this.t = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public rk4(int i, int i2, int i3) {
        this.j = (byte) 14;
        this.t = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public rk4(p8 p8Var) {
        this.j = (byte) 2;
        this.a = p8Var;
        this.t = new o8(p8Var, (byte) 0);
    }
}
