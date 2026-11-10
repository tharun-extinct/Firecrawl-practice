package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class c23 {
    public final Matcher g;
    public a23 n;
    public final b23 r;
    public final CharSequence y;

    public c23(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.g = matcher;
        this.y = charSequence;
        this.r = new b23(this);
    }

    public final me2 g() {
        Matcher matcher = this.g;
        return xs2.K(matcher.start(), matcher.end());
    }

    public final c23 y() {
        Matcher matcher = this.g;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.y;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return mq2.n(matcher2, iEnd, charSequence);
    }
}
