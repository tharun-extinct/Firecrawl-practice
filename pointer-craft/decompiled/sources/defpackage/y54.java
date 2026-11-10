package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y54 implements Serializable {
    public final Pattern j;

    public y54(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.j = patternCompile;
    }

    public static f12 g(y54 y54Var, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new f12(new o82((Object) y54Var, (Object) charSequence, (byte) 10), x54.i);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    public final boolean n(CharSequence charSequence) {
        charSequence.getClass();
        return this.j.matcher(charSequence).matches();
    }

    public final c23 r(String str) {
        str.getClass();
        Matcher matcher = this.j.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new c23(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String string = this.j.toString();
        string.getClass();
        return string;
    }

    public final c23 y(String str, int i) {
        Matcher matcherRegion = this.j.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new c23(matcherRegion, str);
        }
        return null;
    }

    public y54(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.j = patternCompile;
    }
}
