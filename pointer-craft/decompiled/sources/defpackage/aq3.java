package defpackage;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class aq3 {
    public final /* synthetic */ byte g;
    public Object n;
    public int r;
    public Object v;
    public int y;

    public aq3(CharSequence charSequence, int i, Locale locale) {
        this.g = (byte) 2;
        this.n = charSequence;
        if (charSequence.length() < 0) {
            nc2.g("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            nc2.g("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.v = wordInstance;
        this.y = Math.max(0, -50);
        this.r = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new nd0(charSequence, i));
    }

    public int a(int i) {
        y(i);
        int iFollowing = ((BreakIterator) this.v).following(i);
        return (j(iFollowing + (-1)) && j(iFollowing) && !l(iFollowing)) ? a(iFollowing) : iFollowing;
    }

    public void c(int i) {
        this.r = i;
    }

    public yv3 g() {
        return new yv3((TextPaint) this.n, (TextDirectionHeuristic) this.v, this.y, this.r);
    }

    public void i(TextDirectionHeuristic textDirectionHeuristic) {
        this.v = textDirectionHeuristic;
    }

    public boolean j(int i) {
        CharSequence charSequence = (CharSequence) this.n;
        int i2 = this.y;
        if (i >= this.r || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!ph1.n()) {
                return false;
            }
            ph1 ph1VarG = ph1.g();
            if (ph1VarG.r() != 1 || ph1VarG.y(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean l(int i) {
        CharSequence charSequence = (CharSequence) this.n;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (yf2.p(unicodeBlockOf, unicodeBlock) && yf2.p(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return yf2.p(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && yf2.p(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public int m(int i) {
        y(i);
        int iPreceding = ((BreakIterator) this.v).preceding(i);
        return (j(iPreceding) && n(iPreceding) && !l(iPreceding)) ? m(iPreceding) : iPreceding;
    }

    public boolean n(int i) {
        CharSequence charSequence = (CharSequence) this.n;
        int i2 = this.y + 1;
        if (i > this.r || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!ph1.n()) {
                    return false;
                }
                ph1 ph1VarG = ph1.g();
                if (ph1VarG.r() != 1 || ph1VarG.y(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void q(int i, int i2, String str) {
        if (i > i2) {
            nc2.g("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            nc2.g("start must be non-negative, but was " + i);
        }
        si0 si0Var = (si0) this.v;
        if (si0Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.n).length() - i2, 64);
            String str2 = (String) this.n;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.n;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            si0 si0Var2 = new si0((byte) 1);
            si0Var2.y = iMax;
            si0Var2.v = cArr;
            si0Var2.r = length;
            si0Var2.n = i4;
            this.v = si0Var2;
            this.y = i3;
            this.r = i5;
            return;
        }
        int i6 = this.y;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > si0Var.y - si0Var.n()) {
            this.n = toString();
            this.v = null;
            this.y = -1;
            this.r = -1;
            q(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > si0Var.n()) {
            int iN = length2 - si0Var.n();
            int i9 = si0Var.y;
            do {
                i9 *= 2;
            } while (i9 - si0Var.y < iN);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) si0Var.v, 0, cArr2, 0, si0Var.r);
            int i10 = si0Var.y;
            int i11 = si0Var.n;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) si0Var.v, i11, cArr2, i13, (i12 + i11) - i11);
            si0Var.v = cArr2;
            si0Var.y = i9;
            si0Var.n = i13;
        }
        int i14 = si0Var.r;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) si0Var.v;
            System.arraycopy(cArr3, i8, cArr3, si0Var.n - i15, i15);
            si0Var.r = i7;
            si0Var.n -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iN2 = si0Var.n() + i7;
            int iN3 = si0Var.n() + i8;
            int i16 = si0Var.n;
            int i17 = iN2 - i16;
            char[] cArr4 = (char[]) si0Var.v;
            System.arraycopy(cArr4, i16, cArr4, si0Var.r, i17);
            i7 = si0Var.r + i17;
            si0Var.r = i7;
            si0Var.n = iN3;
        } else {
            si0Var.n = si0Var.n() + i8;
            si0Var.r = i7;
        }
        str.getChars(0, str.length(), (char[]) si0Var.v, i7);
        si0Var.r = str.length() + si0Var.r;
    }

    public int r() {
        si0 si0Var = (si0) this.v;
        String str = (String) this.n;
        if (si0Var == null) {
            return str.length();
        }
        return (si0Var.y - si0Var.n()) + (str.length() - (this.r - this.y));
    }

    public boolean t(int i) {
        int i2 = this.y;
        if (i >= this.r || i2 > i) {
            return false;
        }
        return bc6.n(Character.codePointAt((CharSequence) this.n, i));
    }

    public String toString() {
        switch (this.g) {
            case 0:
                si0 si0Var = (si0) this.v;
                String str = (String) this.n;
                if (si0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.y);
                sb.append((char[]) si0Var.v, 0, si0Var.r);
                char[] cArr = (char[]) si0Var.v;
                int i = si0Var.n;
                sb.append(cArr, i, si0Var.y - i);
                String str2 = (String) this.n;
                sb.append((CharSequence) str2, this.r, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean v(int i) {
        int i2 = this.y + 1;
        if (i > this.r || i2 > i) {
            return false;
        }
        return bc6.n(Character.codePointBefore((CharSequence) this.n, i));
    }

    public void w(int i) {
        this.y = i;
    }

    public boolean x(int i) {
        y(i);
        if (!((BreakIterator) this.v).isBoundary(i)) {
            return false;
        }
        if (j(i) && j(i - 1) && j(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.n).length() - 1 || !(l(i) || l(i + 1));
    }

    public void y(int i) {
        int i2 = this.y;
        int i3 = this.r;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbS = du4.s(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbS.append(i3);
        sbS.append("]");
        nc2.g(sbS.toString());
    }

    public /* synthetic */ aq3() {
        this.g = (byte) 0;
    }

    public aq3(TextPaint textPaint) {
        this.g = (byte) 1;
        this.n = textPaint;
        this.y = 1;
        this.r = 1;
        this.v = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
