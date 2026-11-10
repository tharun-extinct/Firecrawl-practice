package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m00 {
    public static final m00 n;
    public static final String r;
    public static final m00 v;
    public static final String y;
    public final boolean g;

    static {
        sv1 sv1Var = q45.r;
        y = Character.toString((char) 8206);
        r = Character.toString((char) 8207);
        n = new m00(false);
        v = new m00(true);
    }

    public m00(boolean z) {
        sv1 sv1Var = q45.g;
        this.g = z;
    }

    public static int g(CharSequence charSequence) {
        byte directionality;
        l00 l00Var = new l00(charSequence);
        l00Var.r = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = l00Var.r;
            if (i4 < l00Var.y && i == 0) {
                CharSequence charSequence2 = l00Var.g;
                char cCharAt = charSequence2.charAt(i4);
                l00Var.n = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = l00Var.r;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    l00Var.r = Character.charCount(iCodePointAt) + l00Var.r;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    l00Var.r = i5 + 1;
                    char c = l00Var.n;
                    directionality = c < 1792 ? l00.v[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case kq2.x /* 15 */:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (l00Var.r > 0) {
                    switch (l00Var.g()) {
                        case 14:
                        case kq2.x /* 15 */:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static m00 r() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? v : n;
    }

    public static int y(CharSequence charSequence) {
        l00 l00Var = new l00(charSequence);
        l00Var.r = l00Var.y;
        int i = 0;
        while (true) {
            int i2 = i;
            while (l00Var.r > 0) {
                byte bG = l00Var.g();
                if (bG == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bG == 1 || bG == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bG != 9) {
                    switch (bG) {
                        case 14:
                        case kq2.x /* 15 */:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder n(CharSequence charSequence) {
        String str;
        sv1 sv1Var = q45.r;
        if (charSequence == null) {
            return null;
        }
        boolean zY = sv1Var.y(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zY2 = (zY ? q45.y : q45.g).y(charSequence, charSequence.length());
        String str2 = "";
        String str3 = r;
        String str4 = y;
        boolean z = this.g;
        if (z || !(zY2 || g(charSequence) == 1)) {
            str = (!z || (zY2 && g(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zY != z) {
            spannableStringBuilder.append(zY ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zY3 = (zY ? q45.y : q45.g).y(charSequence, charSequence.length());
        if (!z && (zY3 || y(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zY3 || y(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public final String v(String str) {
        sv1 sv1Var = q45.g;
        if (str == null) {
            return null;
        }
        return n(str).toString();
    }
}
