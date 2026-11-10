package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class ph1 {
    public static final Object a = new Object();
    public static volatile ph1 m;
    public final ReentrantReadWriteLock g;
    public final boolean j;
    public final hi0 l;
    public final Handler n;
    public volatile byte r;
    public final v11 t;
    public final lh1 v;
    public final oh1 x;
    public final or y;

    public ph1(zu1 zu1Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.g = reentrantReadWriteLock;
        this.r = (byte) 3;
        oh1 oh1Var = zu1Var.g;
        this.x = oh1Var;
        boolean z = zu1Var.y;
        this.j = z;
        this.t = zu1Var.r;
        this.n = new Handler(Looper.getMainLooper());
        this.y = new or(0);
        this.l = new hi0((byte) 11);
        lh1 lh1Var = new lh1(this);
        this.v = lh1Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.r = (byte) 0;
            } catch (Throwable th) {
                this.g.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (r() == 0) {
            try {
                oh1Var.g(new kh1(lh1Var));
            } catch (Throwable th2) {
                x(th2);
            }
        }
    }

    public static ph1 g() {
        ph1 ph1Var;
        synchronized (a) {
            ph1Var = m;
            xs2.a("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", ph1Var != null);
        }
        return ph1Var;
    }

    public static boolean n() {
        return m != null;
    }

    public final void j(mh1 mh1Var) {
        this.g.writeLock().lock();
        try {
            if (this.r == 1 || this.r == 2) {
                this.n.post(new nh1(Arrays.asList(mh1Var), this.r, null));
            } else {
                this.y.add(mh1Var);
            }
        } finally {
            this.g.writeLock().unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence l(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        gf5[] gf5VarArr;
        int spanStart;
        xs2.a("Not initialized yet", r() == 1);
        xg5 xg5Var = null;
        if (i < 0) {
            l0.u("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            l0.u("end cannot be negative");
            return null;
        }
        xs2.x("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        xs2.x("start should be < than charSequence length", i <= charSequence.length());
        xs2.x("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        ro roVar = this.v.y;
        roVar.getClass();
        boolean z2 = charSequence instanceof mu4;
        if (z2) {
            ((mu4) charSequence).g();
        }
        if (z2) {
            xg5Var = new xg5((Spannable) charSequence);
            if (xg5Var != null) {
                for (gf5 gf5Var : gf5VarArr) {
                    spanStart = xg5Var.t.getSpanStart(gf5Var);
                    int spanEnd = xg5Var.t.getSpanEnd(gf5Var);
                    if (spanStart != i2) {
                        xg5Var.removeSpan(gf5Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((mu4) charSequence2).y();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    xg5Var = new xg5((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((mu4) charSequence2).y();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, gf5.class) <= i2) {
                xg5Var = new xg5();
                xg5Var.j = false;
                xg5Var.t = new SpannableString(charSequence);
            }
            if (xg5Var != null && (gf5VarArr = (gf5[]) xg5Var.t.getSpans(i, i2, gf5.class)) != null && gf5VarArr.length > 0) {
                while (i < r2) {
                    spanStart = xg5Var.t.getSpanStart(gf5Var);
                    int spanEnd2 = xg5Var.t.getSpanEnd(gf5Var);
                    if (spanStart != i2) {
                        xg5Var.removeSpan(gf5Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    xg5 xg5Var2 = (xg5) roVar.R(charSequence2, i4, i5, Integer.MAX_VALUE, z, new ji((Object) xg5Var, roVar.t, (byte) 7));
                    if (xg5Var2 != null) {
                        Spannable spannable = xg5Var2.t;
                        if (z2) {
                            ((mu4) charSequence2).y();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((mu4) charSequence2).y();
                    throw th;
                }
            }
            ((mu4) charSequence2).y();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((mu4) charSequence2).y();
        throw th;
    }

    public final int r() {
        this.g.readLock().lock();
        try {
            return this.r;
        } finally {
            this.g.readLock().unlock();
        }
    }

    public final void t(EditorInfo editorInfo) {
        if (r() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        lh1 lh1Var = this.v;
        lh1Var.getClass();
        Bundle bundle = editorInfo.extras;
        w53 w53Var = (w53) lh1Var.r.j;
        int iG = w53Var.g(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iG != 0 ? ((ByteBuffer) w53Var.m).getInt(iG + w53Var.j) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public final void v() {
        xs2.a("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.j);
        if (r() == 1) {
            return;
        }
        this.g.writeLock().lock();
        try {
            if (this.r == 0) {
                this.g.writeLock().unlock();
                return;
            }
            this.r = (byte) 0;
            this.g.writeLock().unlock();
            lh1 lh1Var = this.v;
            ph1 ph1Var = lh1Var.g;
            try {
                ph1Var.x.g(new kh1(lh1Var));
            } catch (Throwable th) {
                ph1Var.x(th);
            }
        } catch (Throwable th2) {
            this.g.writeLock().unlock();
            throw th2;
        }
    }

    public final void x(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.g.writeLock().lock();
        try {
            this.r = (byte) 2;
            arrayList.addAll(this.y);
            this.y.clear();
            this.g.writeLock().unlock();
            this.n.post(new nh1(arrayList, this.r, th));
        } catch (Throwable th2) {
            this.g.writeLock().unlock();
            throw th2;
        }
    }

    public final int y(CharSequence charSequence, int i) {
        xs2.a("Not initialized yet", r() == 1);
        xs2.t(charSequence, "charSequence cannot be null");
        ro roVar = this.v.y;
        roVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            gf5[] gf5VarArr = (gf5[]) spanned.getSpans(i, i + 1, gf5.class);
            if (gf5VarArr.length > 0) {
                return spanned.getSpanStart(gf5VarArr[0]);
            }
        }
        return ((bi1) roVar.R(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new bi1(i))).t;
    }
}
