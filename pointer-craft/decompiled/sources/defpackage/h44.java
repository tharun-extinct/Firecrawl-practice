package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class h44 implements InputConnection {
    public final fa4 g;
    public int j;
    public k65 l;
    public final b65 n;
    public final mt2 r;
    public boolean t;
    public final bl5 v;
    public int x;
    public final boolean y;
    public final ArrayList a = new ArrayList();
    public boolean m = true;

    public h44(k65 k65Var, fa4 fa4Var, boolean z, mt2 mt2Var, b65 b65Var, bl5 bl5Var) {
        this.g = fa4Var;
        this.y = z;
        this.r = mt2Var;
        this.n = b65Var;
        this.v = bl5Var;
        this.l = k65Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.m;
        if (!z) {
            return z;
        }
        this.x++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.m;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.a.clear();
        this.x = 0;
        this.m = false;
        ArrayList arrayList = ((nt2) this.g.t).a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (yf2.p(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.m;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.m;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.m;
        return z ? this.y : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.m;
        if (z) {
            g(new rk0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.m;
        if (!z) {
            return z;
        }
        g(new e51(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.m;
        if (!z) {
            return z;
        }
        g(new f51(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return y();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.m;
        if (!z) {
            return z;
        }
        g(new mo1());
        return true;
    }

    public final void g(ug1 ug1Var) {
        this.x++;
        try {
            this.a.add(ug1Var);
        } finally {
            y();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        k65 k65Var = this.l;
        return TextUtils.getCapsMode(k65Var.g.t, u75.x(k65Var.y), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.t = z;
        if (z) {
            this.j = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ne6.g(this.l);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (u75.r(this.l.y)) {
            return null;
        }
        return mu5.a(this.l).t;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return mu5.m(this.l, i).t;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return mu5.q(this.l, i).t;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.m;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    g(new ml4(0, this.l.g.t.length()));
                    break;
                case R.id.cut:
                    r(277);
                    return false;
                case R.id.copy:
                    r(278);
                    return false;
                case R.id.paste:
                    r(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.m;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((nt2) this.g.t).n.a(new la2(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x026e  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        cj cjVar;
        long j;
        int i;
        int i2;
        int i3;
        String string;
        k75 k75VarN;
        k75 k75VarN2;
        i75 i75Var;
        if (Build.VERSION.SDK_INT >= 34) {
            ll2 ll2Var = new ll2(this, (byte) 12);
            mt2 mt2Var = this.r;
            int iY = 3;
            if (mt2Var != null && (cjVar = mt2Var.a) != null) {
                k75 k75VarN3 = mt2Var.n();
                if (cjVar.equals((k75VarN3 == null || (i75Var = k75VarN3.g.g) == null) ? null : i75Var.g)) {
                    boolean zS = oc.s(handwritingGesture);
                    b65 b65Var = this.n;
                    if (zS) {
                        SelectGesture selectGestureQ = oc.q(handwritingGesture);
                        long jX = qg6.x(mt2Var, oe6.x(selectGestureQ.getSelectionArea()), selectGestureQ.getGranularity() != 1 ? 0 : 1);
                        if (u75.r(jX)) {
                            iY = pg6.y(w42.w(selectGestureQ), ll2Var);
                        } else {
                            ll2Var.a(new ml4((int) (jX >> 32), (int) (jX & 4294967295L)));
                            if (b65Var != null) {
                                b65Var.v(true);
                            }
                            iY = 1;
                        }
                    } else if (w42.e(handwritingGesture)) {
                        DeleteGesture deleteGestureM = w42.m(handwritingGesture);
                        int i4 = deleteGestureM.getGranularity() != 1 ? 0 : 1;
                        long jX2 = qg6.x(mt2Var, oe6.x(deleteGestureM.getDeletionArea()), i4);
                        if (u75.r(jX2)) {
                            iY = pg6.y(w42.w(deleteGestureM), ll2Var);
                        } else {
                            pg6.r(jX2, cjVar, i4 == 1, ll2Var);
                            iY = 1;
                        }
                    } else if (w42.B(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureI = w42.i(handwritingGesture);
                        long jL = qg6.l(mt2Var, oe6.x(selectRangeGestureI.getSelectionStartArea()), oe6.x(selectRangeGestureI.getSelectionEndArea()), selectRangeGestureI.getGranularity() != 1 ? 0 : 1);
                        if (u75.r(jL)) {
                            iY = pg6.y(w42.w(selectRangeGestureI), ll2Var);
                        } else {
                            ll2Var.a(new ml4((int) (jL >> 32), (int) (jL & 4294967295L)));
                            if (b65Var != null) {
                                b65Var.v(true);
                            }
                            iY = 1;
                        }
                    } else if (w42.C(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureQ = w42.q(handwritingGesture);
                        int i5 = deleteRangeGestureQ.getGranularity() != 1 ? 0 : 1;
                        long jL2 = qg6.l(mt2Var, oe6.x(deleteRangeGestureQ.getDeletionStartArea()), oe6.x(deleteRangeGestureQ.getDeletionEndArea()), i5);
                        if (u75.r(jL2)) {
                            iY = pg6.y(w42.w(deleteRangeGestureQ), ll2Var);
                        } else {
                            pg6.r(jL2, cjVar, i5 == 1, ll2Var);
                            iY = 1;
                        }
                    } else {
                        boolean z = w42.z(handwritingGesture);
                        bl5 bl5Var = this.v;
                        if (z) {
                            JoinOrSplitGesture joinOrSplitGestureC = w42.c(handwritingGesture);
                            if (bl5Var == null) {
                                iY = pg6.y(w42.k(joinOrSplitGestureC), ll2Var);
                            } else {
                                int iV = qg6.v(mt2Var, qg6.q(joinOrSplitGestureC.getJoinOrSplitPoint()), bl5Var);
                                if (iV == -1 || ((k75VarN2 = mt2Var.n()) != null && qg6.j(k75VarN2.g, iV))) {
                                    iY = pg6.y(w42.w(joinOrSplitGestureC), ll2Var);
                                } else {
                                    int iCharCount = iV;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(cjVar, iCharCount);
                                        if (!qg6.a(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iV < cjVar.t.length()) {
                                        int iCodePointAt = Character.codePointAt(cjVar, iV);
                                        if (!qg6.a(iCodePointAt)) {
                                            break;
                                        } else {
                                            iV += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jY = sp2.y(iCharCount, iV);
                                    if (u75.r(jY)) {
                                        int i6 = (int) (jY >> 32);
                                        ll2Var.a(new x42(new ug1[]{new ml4(i6, i6), new rk0(" ", 1)}));
                                    } else {
                                        pg6.r(jY, cjVar, false, ll2Var);
                                    }
                                    iY = 1;
                                }
                            }
                        } else if (oc.o(handwritingGesture)) {
                            InsertGesture insertGestureA = oc.a(handwritingGesture);
                            if (bl5Var == null) {
                                iY = pg6.y(w42.k(insertGestureA), ll2Var);
                            } else {
                                int iV2 = qg6.v(mt2Var, qg6.q(insertGestureA.getInsertionPoint()), bl5Var);
                                if (iV2 == -1 || ((k75VarN = mt2Var.n()) != null && qg6.j(k75VarN.g, iV2))) {
                                    iY = pg6.y(w42.w(insertGestureA), ll2Var);
                                } else {
                                    ll2Var.a(new x42(new ug1[]{new ml4(iV2, iV2), new rk0(insertGestureA.getTextToInsert(), 1)}));
                                    iY = 1;
                                }
                            }
                        } else if (oc.k(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM = oc.m(handwritingGesture);
                            k75 k75VarN4 = mt2Var.n();
                            j75 j75Var = k75VarN4 != null ? k75VarN4.g : null;
                            long jQ = qg6.q(removeSpaceGestureM.getStartPoint());
                            long jQ2 = qg6.q(removeSpaceGestureM.getEndPoint());
                            bl2 bl2VarR = mt2Var.r();
                            if (j75Var != null) {
                                h93 h93Var = j75Var.y;
                                if (bl2VarR == null) {
                                    j = u75.y;
                                } else {
                                    long jH = bl2VarR.h(jQ);
                                    long jH2 = bl2VarR.h(jQ2);
                                    int iN = qg6.n(h93Var, jH, bl5Var);
                                    int iN2 = qg6.n(h93Var, jH2, bl5Var);
                                    if (iN != -1) {
                                        if (iN2 != -1) {
                                            iN = Math.min(iN, iN2);
                                        }
                                        iN2 = iN;
                                    } else if (iN2 == -1) {
                                        j = u75.y;
                                    }
                                    float fY = (h93Var.y(iN2) + h93Var.x(iN2)) / 2.0f;
                                    int i7 = (int) (jH >> 32);
                                    int i8 = (int) (jH2 >> 32);
                                    j = h93Var.j(new k44(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fY - 0.1f, Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fY + 0.1f), 0, aj6.b);
                                }
                            } else {
                                j = u75.y;
                            }
                            if (u75.r(j)) {
                                iY = pg6.y(w42.w(removeSpaceGestureM), ll2Var);
                            } else {
                                String str = cjVar.subSequence(u75.x(j), u75.v(j)).t;
                                Pattern patternCompile = Pattern.compile("\\s+");
                                patternCompile.getClass();
                                str.getClass();
                                Matcher matcher = patternCompile.matcher(str);
                                matcher.getClass();
                                c23 c23VarN = mq2.n(matcher, 0, str);
                                if (c23VarN == null) {
                                    string = str.toString();
                                    i2 = -1;
                                    i = -1;
                                } else {
                                    int length = str.length();
                                    StringBuilder sb = new StringBuilder(length);
                                    i = -1;
                                    int i9 = 0;
                                    while (true) {
                                        sb.append((CharSequence) str, i9, c23VarN.g().j);
                                        if (i == -1) {
                                            i = c23VarN.g().j;
                                        }
                                        i2 = c23VarN.g().t + 1;
                                        sb.append((CharSequence) "");
                                        i3 = c23VarN.g().t + 1;
                                        c23VarN = c23VarN.y();
                                        if (i3 >= length || c23VarN == null) {
                                            break;
                                        } else {
                                            i9 = i3;
                                        }
                                    }
                                    if (i3 < length) {
                                        sb.append((CharSequence) str, i3, length);
                                    }
                                    string = sb.toString();
                                }
                                if (i == -1 || i2 == -1) {
                                    iY = pg6.y(w42.w(removeSpaceGestureM), ll2Var);
                                } else {
                                    int i10 = (int) (j >> 32);
                                    ll2Var.a(new x42(new ug1[]{new ml4(i10 + i, i10 + i2), new rk0(string.substring(i, string.length() - (u75.n(j) - i2)), 1)}));
                                    iY = 1;
                                }
                            }
                        } else {
                            iY = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new xj(intConsumer, iY, (byte) 0));
            } else {
                intConsumer.accept(iY);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.m;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        mt2 mt2Var;
        cj cjVar;
        i75 i75Var;
        if (Build.VERSION.SDK_INT >= 34 && (mt2Var = this.r) != null && (cjVar = mt2Var.a) != null) {
            k75 k75VarN = mt2Var.n();
            if (cjVar.equals((k75VarN == null || (i75Var = k75VarN.g.g) == null) ? null : i75Var.g)) {
                boolean zS = oc.s(previewableHandwritingGesture);
                byte b = 1;
                r42 r42Var = r42.j;
                b65 b65Var = this.n;
                if (zS) {
                    SelectGesture selectGestureQ = oc.q(previewableHandwritingGesture);
                    if (b65Var != null) {
                        long jX = qg6.x(mt2Var, oe6.x(selectGestureQ.getSelectionArea()), selectGestureQ.getGranularity() != 1 ? 0 : 1);
                        mt2 mt2Var2 = b65Var.n;
                        if (mt2Var2 != null) {
                            mt2Var2.x(jX);
                        }
                        mt2 mt2Var3 = b65Var.n;
                        if (mt2Var3 != null) {
                            mt2Var3.v(u75.y);
                        }
                        if (!u75.r(jX)) {
                            b65Var.h(false);
                            b65Var.p(r42Var);
                        }
                    }
                } else if (w42.e(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM = w42.m(previewableHandwritingGesture);
                    if (b65Var != null) {
                        long jX2 = qg6.x(mt2Var, oe6.x(deleteGestureM.getDeletionArea()), deleteGestureM.getGranularity() != 1 ? 0 : 1);
                        mt2 mt2Var4 = b65Var.n;
                        if (mt2Var4 != null) {
                            mt2Var4.v(jX2);
                        }
                        mt2 mt2Var5 = b65Var.n;
                        if (mt2Var5 != null) {
                            mt2Var5.x(u75.y);
                        }
                        if (!u75.r(jX2)) {
                            b65Var.h(false);
                            b65Var.p(r42Var);
                        }
                    }
                } else if (w42.B(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureI = w42.i(previewableHandwritingGesture);
                    if (b65Var != null) {
                        long jL = qg6.l(mt2Var, oe6.x(selectRangeGestureI.getSelectionStartArea()), oe6.x(selectRangeGestureI.getSelectionEndArea()), selectRangeGestureI.getGranularity() != 1 ? 0 : 1);
                        mt2 mt2Var6 = b65Var.n;
                        if (mt2Var6 != null) {
                            mt2Var6.x(jL);
                        }
                        mt2 mt2Var7 = b65Var.n;
                        if (mt2Var7 != null) {
                            mt2Var7.v(u75.y);
                        }
                        if (!u75.r(jL)) {
                            b65Var.h(false);
                            b65Var.p(r42Var);
                        }
                    }
                } else if (w42.C(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureQ = w42.q(previewableHandwritingGesture);
                    if (b65Var != null) {
                        long jL2 = qg6.l(mt2Var, oe6.x(deleteRangeGestureQ.getDeletionStartArea()), oe6.x(deleteRangeGestureQ.getDeletionEndArea()), deleteRangeGestureQ.getGranularity() != 1 ? 0 : 1);
                        mt2 mt2Var8 = b65Var.n;
                        if (mt2Var8 != null) {
                            mt2Var8.v(jL2);
                        }
                        mt2 mt2Var9 = b65Var.n;
                        if (mt2Var9 != null) {
                            mt2Var9.x(u75.y);
                        }
                        if (!u75.r(jL2)) {
                            b65Var.h(false);
                            b65Var.p(r42Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new fo0(b65Var, b));
                }
                return true;
            }
        }
        return false;
    }

    public final void r(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ht2 ht2Var;
        boolean z4 = this.m;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            ht2Var = ((nt2) this.g.t).w;
            synchronized (ht2Var.r) {
                try {
                    ht2Var.x = z2;
                    ht2Var.l = z3;
                    ht2Var.j = z5;
                    ht2Var.t = z;
                    if (z6) {
                        ht2Var.v = true;
                        if (ht2Var.a != null) {
                            ht2Var.g();
                        }
                    }
                    ht2Var.n = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        ht2Var = ((nt2) this.g.t).w;
        synchronized (ht2Var.r) {
            ht2Var.x = z2;
            ht2Var.l = z3;
            ht2Var.j = z5;
            ht2Var.t = z;
            if (z6) {
                ht2Var.v = true;
                if (ht2Var.a != null) {
                    ht2Var.g();
                }
            }
            ht2Var.n = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.m;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((nt2) this.g.t).m.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.m;
        if (z) {
            g(new kl4(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.m;
        if (z) {
            g(new ll4(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.m;
        if (!z) {
            return z;
        }
        g(new ml4(i, i2));
        return true;
    }

    public final boolean y() {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty()) {
                ((nt2) this.g.t).r.a(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.x > 0;
    }
}
