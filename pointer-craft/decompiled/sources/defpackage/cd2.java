package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class cd2 implements ub4, hk3, ny4, cm3, nu0, nt5, n64, xj3 {
    public static final int[] m = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object a;
    public final /* synthetic */ byte j;
    public Object t;

    public cd2(Context context, int i) {
        String str;
        this.j = (byte) 7;
        this.t = new SparseArray();
        this.a = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            hs0 hs0Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                D(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                hs0 hs0Var2 = new hs0(context, xml);
                                ((SparseArray) this.t).put(hs0Var2.t, hs0Var2);
                                hs0Var = hs0Var2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                is0 is0Var = new is0(context, xml);
                                if (hs0Var != null) {
                                    ((ArrayList) hs0Var.m).add(is0Var);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }

    public static cd2 N(WindowInsetsAnimation.Bounds bounds) {
        return new cd2(bounds);
    }

    public static int u(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static cd2 y(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new cd2((byte) 8, channel, fileLockLock, false);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    public boolean A(d4 d4Var, Menu menu) {
        return ((ty) this.t).q(d4Var, menu);
    }

    public void B(d4 d4Var) {
        ty tyVar = (ty) this.t;
        ((ActionMode.Callback) tyVar.t).onDestroyActionMode(tyVar.t(d4Var));
        tl tlVar = (tl) this.a;
        if (tlVar.C != null) {
            tlVar.u.getDecorView().removeCallbacks(tlVar.D);
        }
        if (tlVar.B != null) {
            bm5 bm5Var = tlVar.E;
            if (bm5Var != null) {
                bm5Var.y();
            }
            bm5 bm5VarG = xk5.g(tlVar.B);
            bm5VarG.g(0.0f);
            tlVar.E = bm5VarG;
            bm5VarG.n(new ll(this, (byte) 2));
        }
        tlVar.A = null;
        ViewGroup viewGroup = tlVar.G;
        WeakHashMap weakHashMap = xk5.g;
        viewGroup.requestApplyInsets();
        tlVar.G();
    }

    public boolean C(d4 d4Var, Menu menu) {
        ViewGroup viewGroup = ((tl) this.a).G;
        WeakHashMap weakHashMap = xk5.g;
        viewGroup.requestApplyInsets();
        ty tyVar = (ty) this.t;
        ActionMode.Callback callback = (ActionMode.Callback) tyVar.t;
        zy4 zy4VarT = tyVar.t(d4Var);
        sp4 sp4Var = (sp4) tyVar.q;
        Menu i53Var = (Menu) sp4Var.get(menu);
        if (i53Var == null) {
            i53Var = new i53((Context) tyVar.a, (i43) menu);
            sp4Var.put(menu, i53Var);
        }
        return callback.onPrepareActionMode(zy4VarT, i53Var);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void D(Context context, XmlResourceParser xmlResourceParser) {
        rs0 rs0Var = new rs0();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    ms0 ms0VarN = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (ms0VarN == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        ms0VarN.n.g(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (ms0VarN == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        ms0VarN.r.g(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        ms0VarN = rs0.n(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (ms0VarN == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        ms0VarN.y.g(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (ms0VarN == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        ms0VarN.v.g(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        ms0VarN = rs0.n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        ms0VarN.n.g = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (ms0VarN != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        bs0.g(context, xmlResourceParser, ms0VarN.x);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        ms0VarN = rs0.n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        ms0VarN.n.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (ms0VarN != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        bs0.g(context, xmlResourceParser, ms0VarN.x);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        ms0VarN = rs0.n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        rs0Var.y.put(Integer.valueOf(ms0VarN.g), ms0VarN);
                                        ms0VarN = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        rs0Var.y.put(Integer.valueOf(ms0VarN.g), ms0VarN);
                                        ms0VarN = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        rs0Var.y.put(Integer.valueOf(ms0VarN.g), ms0VarN);
                                        ms0VarN = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.a).put(identifier, rs0Var);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                ((SparseArray) this.a).put(identifier, rs0Var);
                return;
            }
        }
    }

    public u44 E(n54 n54Var, int i) {
        jl5 jl5Var;
        u44 u44Var;
        sp4 sp4Var = (sp4) this.t;
        int iN = sp4Var.n(n54Var);
        if (iN >= 0 && (jl5Var = (jl5) sp4Var.t(iN)) != null) {
            int i2 = jl5Var.g;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                jl5Var.g = i3;
                if (i == 4) {
                    u44Var = jl5Var.y;
                } else if (i == 8) {
                    u44Var = jl5Var.r;
                } else {
                    l0.u("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    sp4Var.l(iN);
                    jl5Var.g = 0;
                    jl5Var.y = null;
                    jl5Var.r = null;
                    jl5.n.a(jl5Var);
                }
                return u44Var;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hi, java.lang.Object] */
    public void F() {
        if (((hi) this.t) == null) {
            ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: hi
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    ((ki) this.g.a).l = f;
                }
            };
            this.t = r0;
            ValueAnimator.registerDurationScaleChangeListener(r0);
        }
    }

    public void G() {
        try {
            ((FileLock) this.a).release();
            ((FileChannel) this.t).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void H(n54 n54Var) {
        jl5 jl5Var = (jl5) ((sp4) this.t).get(n54Var);
        if (jl5Var == null) {
            return;
        }
        jl5Var.g &= -2;
    }

    public void I(n54 n54Var) {
        uy2 uy2Var = (uy2) this.a;
        for (int iL = uy2Var.l() - 1; iL >= 0; iL--) {
            if (n54Var == uy2Var.j(iL)) {
                Object[] objArr = uy2Var.a;
                Object obj = objArr[iL];
                Object obj2 = pc6.g;
                if (obj == obj2) {
                    break;
                }
                objArr[iL] = obj2;
                uy2Var.j = true;
                break;
            }
        }
        jl5 jl5Var = (jl5) ((sp4) this.t).remove(n54Var);
        if (jl5Var != null) {
            jl5Var.g = 0;
            jl5Var.y = null;
            jl5Var.r = null;
            jl5.n.a(jl5Var);
        }
    }

    public void J(cu cuVar) {
        this.a = cuVar;
    }

    public void K() {
        this.t = xh0.j;
    }

    public Drawable L(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.a) == null) {
                this.a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = L(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public WindowInsetsAnimation.Bounds M() {
        c2.b();
        return c2.t(((nd2) this.t).v(), ((nd2) this.a).v());
    }

    public void O() {
        ValueAnimator.unregisterDurationScaleChangeListener((hi) this.t);
        this.t = null;
    }

    public void P(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.t;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.a;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                uo1.B();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((x25) entry2.getKey()).r(new ak(status));
            }
        }
    }

    public gu a() {
        return new gu((xh0) this.t, (cu) this.a);
    }

    @Override // defpackage.n64
    public void accept(Object obj, Object obj2) {
        pv5 pv5Var = new pv5((zv5) this.t, (x25) obj2, (byte) 1);
        fv5 fv5Var = (fv5) ((bw5) obj).j();
        bk bkVar = (bk) this.a;
        Parcel parcelG = fv5Var.g();
        int i = yu5.g;
        parcelG.writeStrongBinder(pv5Var);
        yu5.y(parcelG, bkVar);
        parcelG.writeStrongBinder(null);
        fv5Var.y(parcelG, 2);
    }

    @Override // defpackage.ny4
    public oy4 apply() {
        in2 in2Var = (in2) this.t;
        an2 an2VarP = p();
        if (an2VarP != null) {
            in2Var.g(an2VarP, false);
        }
        return in2Var.r(this.a);
    }

    public nd2 b() {
        return (nd2) this.t;
    }

    public Object c(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(0);
        fa5 fa5Var = new fa5(toolType, motionEvent.getSource());
        HashMap map = (HashMap) this.t;
        Object obj = map.get(fa5Var);
        if (obj == null) {
            obj = map.get(new fa5(toolType));
        }
        return obj != null ? obj : this.a;
    }

    @Override // defpackage.ny4
    public void cancel() {
        an2 an2VarP = p();
        if ((an2VarP != null ? an2VarP.x : null) != null) {
            ((in2) this.t).j(this.a);
        }
    }

    public void d(int i, int i2) {
        int[] iArr = (int[]) this.t;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        w(i3);
        int[] iArr2 = (int[]) this.t;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.t, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ev4 ev4Var = (ev4) ((ArrayList) this.a).get(size);
            int i4 = ev4Var.j;
            if (i4 >= i) {
                ev4Var.j = i4 + i2;
            }
        }
    }

    public void e(int i, int i2) {
        int[] iArr = (int[]) this.t;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        w(i3);
        int[] iArr2 = (int[]) this.t;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.t;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ev4 ev4Var = (ev4) ((ArrayList) this.a).get(size);
            int i4 = ev4Var.j;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.a).remove(size);
                } else {
                    ev4Var.j = i4 - i2;
                }
            }
        }
    }

    public void f(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.t;
        ro roVarP = ro.P(i, 0, absSeekBar.getContext(), attributeSet, m);
        Drawable drawableO = roVarP.o(0);
        if (drawableO != null) {
            if (drawableO instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableO;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableL = L(animationDrawable.getFrame(i2), true);
                    drawableL.setLevel(10000);
                    animationDrawable2.addFrame(drawableL, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableO = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableO);
        }
        Drawable drawableO2 = roVarP.o(1);
        if (drawableO2 != null) {
            absSeekBar.setProgressDrawable(L(drawableO2, false));
        }
        roVarP.S();
    }

    @Override // defpackage.nt5
    public Object g() {
        return new jt5((Context) ((k2) this.t).j, (fu5) ((lt5) this.a).g(), new vg5());
    }

    public void h() {
        ((SparseIntArray) this.t).clear();
    }

    public InputMethodManager i() {
        return (InputMethodManager) ((wp2) this.a).getValue();
    }

    @Override // defpackage.ny4
    public boolean j(qm3 qm3Var) {
        an2 an2VarP = p();
        ir3 ir3Var = an2VarP != null ? an2VarP.x : null;
        if (ir3Var == null || ir3Var.x()) {
            return true;
        }
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            boolean zA = ir3Var.a(qm3Var);
            js2.z(at4VarM, at4VarB, xy1VarV);
            return zA;
        } catch (Throwable th) {
            try {
                an2VarP.getClass();
                throw th;
            } catch (Throwable th2) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th2;
            }
        }
    }

    public void k() throws IOException {
        String str = (String) this.t;
        if (((FileChannel) this.a) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.a = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.a;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.a = null;
            throw new IllegalStateException(du4.i("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // defpackage.cm3
    public boolean l() {
        return ((cm3) this.t).l();
    }

    @Override // defpackage.ub4
    public boolean m() {
        return ((ub4) this.t).m();
    }

    @Override // defpackage.cm3
    public List n(Integer num) {
        List listN = ((cm3) this.t).n(null);
        pr4 pr4Var = (pr4) this.a;
        int i = pr4Var.o;
        return i < 0 ? listN : cj0.w0(xc6.n(pr4Var, num, i, Integer.valueOf(pr4Var.D(pr4Var.y, i))), listN);
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) {
        ji jiVar = (ji) this.t;
        Pair pair = (Pair) this.a;
        synchronized (jiVar) {
            ((mr) jiVar.a).remove(pair);
        }
        return nj6Var;
    }

    public an2 p() {
        in2 in2Var = (in2) this.t;
        um2 um2Var = (um2) in2Var.s.l(this.a);
        if (um2Var != null) {
            return (an2) in2Var.w.l(um2Var);
        }
        return null;
    }

    public void q() {
        int[] iArr = (int[]) this.t;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.a = null;
    }

    @Override // defpackage.ub4
    public tb4 r(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        t51 t51Var = (t51) this.a;
        if (!str.equals(":memory:")) {
            str = ((q01) t51Var.r).g.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        yl1 yl1Var = new yl1(str, (t51Var.g || t51Var.y || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = yl1Var.g;
        reentrantLock.lock();
        cd2 cd2Var = yl1Var.y;
        if (cd2Var != null) {
            try {
                cd2Var.k();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (t51Var.y) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                tb4 tb4VarR = ((ub4) this.t).r(str);
                if (t51Var.g) {
                    t51.v(tb4VarR);
                    if (((q01) t51Var.r).l == w94.t) {
                        zq2.m(tb4VarR, "PRAGMA synchronous = NORMAL");
                    } else {
                        zq2.m(tb4VarR, "PRAGMA synchronous = FULL");
                    }
                    ((z94) t51Var.n).n(tb4VarR);
                } else {
                    try {
                        t51Var.y = true;
                        t51Var.x(tb4VarR);
                        t51Var.y = false;
                    } catch (Throwable th2) {
                        t51Var.y = false;
                        throw th2;
                    }
                }
                if (cd2Var != null && (fileChannel2 = (FileChannel) cd2Var.a) != null) {
                    try {
                        fileChannel2.close();
                        cd2Var.a = null;
                    } catch (Throwable th3) {
                        cd2Var.a = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return tb4VarR;
            } catch (Throwable th4) {
                if (cd2Var != null && (fileChannel = (FileChannel) cd2Var.a) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        cd2Var.a = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // defpackage.xj3
    public void s(nj6 nj6Var) {
        ((Map) ((cd2) this.a).a).remove((x25) this.t);
    }

    public void t(n54 n54Var, u44 u44Var) {
        sp4 sp4Var = (sp4) this.t;
        jl5 jl5VarG = (jl5) sp4Var.get(n54Var);
        if (jl5VarG == null) {
            jl5VarG = jl5.g();
            sp4Var.put(n54Var, jl5VarG);
        }
        jl5VarG.r = u44Var;
        jl5VarG.g |= 8;
    }

    public String toString() {
        switch (this.j) {
            case 23:
                return "Bounds{lower=" + ((nd2) this.t) + " upper=" + ((nd2) this.a) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hk3
    public void v(Object obj) {
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.t;
        lz2 lz2Var = (lz2) this.a;
        firebaseInstanceId.getClass();
        String str = ((ae2) obj).g;
        if (lz2Var == null || !str.equals((String) lz2Var.y)) {
            Iterator it = firebaseInstanceId.j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                uo1.B();
            }
        }
    }

    public void w(int i) {
        int[] iArr = (int[]) this.t;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.t = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.t = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.t;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // defpackage.ny4
    public boolean x() {
        ir3 ir3Var;
        an2 an2VarP = p();
        if (an2VarP == null || (ir3Var = an2VarP.x) == null) {
            return true;
        }
        return ir3Var.x();
    }

    public nd2 z() {
        return (nd2) this.a;
    }

    public /* synthetic */ cd2(byte b, boolean z) {
        this.j = b;
    }

    public cd2(k2 k2Var, lt5 lt5Var, ug5 ug5Var) {
        this.j = (byte) 25;
        this.t = k2Var;
        this.a = lt5Var;
    }

    public /* synthetic */ cd2(Object obj, Object obj2, byte b) {
        this.j = b;
        this.a = obj;
        this.t = obj2;
    }

    public cd2(cd2 cd2Var, x25 x25Var) {
        this.j = (byte) 28;
        this.t = x25Var;
        Objects.requireNonNull(cd2Var);
        this.a = cd2Var;
    }

    public cd2(WorkDatabase_Impl workDatabase_Impl) {
        this.j = (byte) 24;
        this.t = workDatabase_Impl;
        this.a = new s51(workDatabase_Impl, (byte) 1);
    }

    public cd2(byte b) {
        this.j = b;
        switch (b) {
            case 13:
                this.t = new SparseIntArray();
                this.a = new SparseIntArray();
                break;
            case 22:
                this.t = new sp4(0);
                this.a = new uy2((Object) null);
                break;
            case 26:
                this.t = Collections.synchronizedMap(new WeakHashMap());
                this.a = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.t = new xj5(true);
                this.a = new xj5(true);
                break;
        }
    }

    public cd2(String str) {
        this.j = (byte) 11;
        this.t = str.concat(".lck");
    }

    public /* synthetic */ cd2(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    public cd2(AbsSeekBar absSeekBar) {
        this.j = (byte) 1;
        this.t = absSeekBar;
    }

    public cd2(Object obj) {
        this.j = (byte) 20;
        this.t = new HashMap();
        this.a = obj;
    }

    public cd2(View view) {
        this.j = (byte) 0;
        this.t = view;
        this.a = v13.u(bt2.t, new qd((Object) this, (byte) 19));
    }

    public cd2(t51 t51Var, ub4 ub4Var) {
        this.j = (byte) 5;
        ub4Var.getClass();
        this.a = t51Var;
        this.t = ub4Var;
    }

    public cd2(WindowInsetsAnimation.Bounds bounds) {
        this.j = (byte) 23;
        this.t = nd2.n(bounds.getLowerBound());
        this.a = nd2.n(bounds.getUpperBound());
    }

    public cd2(ki kiVar) {
        this.j = (byte) 2;
        this.a = kiVar;
    }
}
