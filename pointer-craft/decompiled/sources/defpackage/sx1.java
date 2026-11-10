package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.graphics.Color;
import android.os.CancellationSignal;
import io.appground.blek.R;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx1 implements my1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ sx1(byte b) {
        this.j = b;
    }

    private final Object n() {
        String str = "ar";
        String str2 = "az";
        String str3 = "bg";
        String str4 = "N’Ko";
        String str5 = "bn";
        String str6 = "bo";
        String str7 = "chr";
        String str8 = "cs";
        String str9 = "de";
        String str10 = "Belgian (Period)";
        String str11 = "Belgian (Comma)";
        String str12 = "dsb";
        String str13 = "dv";
        String str14 = "el";
        String str15 = "en";
        String str16 = "es";
        String str17 = "fa";
        String str18 = "fi";
        String str19 = "fr";
        String str20 = "ga";
        String str21 = "he";
        String str22 = "hi";
        String str23 = "hu";
        String str24 = "hy";
        String str25 = "it";
        String str26 = "iu";
        String str27 = "ka";
        String str28 = "khb";
        String str29 = "km";
        String str30 = "ko";
        String str31 = "lis";
        String str32 = "lt";
        String str33 = "lv";
        String str34 = "mk";
        String str35 = "mn";
        String str36 = "mt";
        String str37 = "nb";
        String str38 = "nl";
        String str39 = "pl";
        String str40 = "pt";
        String str41 = "ro";
        String str42 = "ru";
        String str43 = "se";
        String str44 = "Sami Extended Finland-Sweden";
        String str45 = "si";
        String str46 = "sk";
        String str47 = "sr";
        String str48 = "sv";
        String str49 = "syr";
        String str50 = "th";
        String str51 = "tmh";
        String str52 = "tr";
        String str53 = "tt";
        String str54 = "ug";
        String str55 = "uk";
        String str56 = "zh";
        return new hm2[]{new hm2(str, "Arabic (102)", "ar-t-k0-windows-102key"), new hm2(str, "Arabic (102) AZERTY", "ar-t-k0-windows-azerty"), new hm2(str, "Arabic (101)", "ar-t-k0-windows"), new hm2("as", "Assamese - INSCRIPT", "as-t-k0-windows"), new hm2(str2, "Azeri Cyrillic", "az-Cyrl-t-k0-windows"), new hm2(str2, "Azerbaijani (Standard)", "az-t-k0-windows-extended"), new hm2(str2, "Azeri Latin", "az-t-k0-windows"), new hm2("ba", "Bashkir", "ba-t-k0-windows"), new hm2("be", "Belarusian", "be-t-k0-windows"), new hm2(str3, "Bulgarian (Latin)", "bg-Latn-t-k0-windows"), new hm2(str3, "Bulgarian (Typewriter)", "bg-t-k0-windows-legacy"), new hm2(str3, "Bulgarian (Phonetic Traditional)", "bg-t-k0-windows-qwerty-legacy"), new hm2(str3, "Bulgarian (Phonetic)", "bg-t-k0-windows-qwerty"), new hm2(str3, "Bulgarian", "bg-t-k0-windows"), new hm2("bm", str4, "bm-t-k0-windows"), new hm2(str5, "Bengali - INSCRIPT (Legacy)", "bn-t-k0-windows-legacy"), new hm2(str5, "Bengali", "bn-t-k0-windows-qwerty"), new hm2(str5, "Bengali - INSCRIPT", "bn-t-k0-windows"), new hm2(str6, "Tibetan (PRC) - Updated", "bo-t-k0-windows-extended"), new hm2(str6, "Tibetan (PRC)", "bo-t-k0-windows"), new hm2("bs", "Bosnian (Cyrillic)", "bs-Cyrl-t-k0-windows"), new hm2("bug", "Buginese", "bug-t-k0-windows"), new hm2(str7, "Cherokee Phonetic", "chr-t-k0-windows-phonetic"), new hm2(str7, "Cherokee Nation", "chr-t-k0-windows"), new hm2("ckb", "Central Kurdish", "ckb-t-k0-windows"), new hm2(str8, "Czech Programmers", "cs-t-k0-windows-extended"), new hm2(str8, "Czech (QWERTY)", "cs-t-k0-windows-qwerty"), new hm2(str8, "Czech", "cs-t-k0-windows"), new hm2("da", "Danish", "da-t-k0-windows"), new hm2(str9, str10, "de-BE-t-k0-windows-var"), new hm2(str9, str11, "de-BE-t-k0-windows"), new hm2(str9, "Swiss German", "de-CH-t-k0-windows"), new hm2(str9, "German (IBM)", "de-t-k0-windows-extended"), new hm2(str9, "German", "de-t-k0-windows"), new hm2(str12, "Sorbian Extended", "dsb-t-k0-windows-extended"), new hm2(str12, "Sorbian Standard (Legacy)", "dsb-t-k0-windows-legacy"), new hm2(str12, "Sorbian Standard", "dsb-t-k0-windows"), new hm2(str13, "Divehi Typewriter", "dv-t-k0-windows-legacy"), new hm2(str13, "Divehi Phonetic", "dv-t-k0-windows"), new hm2("dyu", str4, "dyu-t-k0-windows"), new hm2("dz", "Dzongkha", "dz-t-k0-windows"), new hm2(str14, "Greek (220) Latin", "el-Latn-t-k0-windows-el220"), new hm2(str14, "Greek (319) Latin", "el-Latn-t-k0-windows-el319"), new hm2(str14, "Greek Latin", "el-Latn-t-k0-windows"), new hm2(str14, "Greek Polytonic", "el-POLYTON-t-k0-windows"), new hm2(str14, "Greek (220)", "el-t-k0-windows-el220"), new hm2(str14, "Greek (319)", "el-t-k0-windows-el319"), new hm2(str14, "Greek", "el-t-k0-windows"), new hm2(str15, "English US", "en-t-k0-windows"), new hm2(str15, "English UK", "en-GB-t-k0-windows"), new hm2(str15, "English UK Extended", "en-GB-t-k0-windows-extended"), new hm2(str15, "English (India)", "en-IN-t-k0-windows"), new hm2(str15, "United States-Dvorak", "en-t-k0-windows-dvorak"), new hm2(str15, "United States-Dvorak for left hand", "en-t-k0-windows-dvorakl"), new hm2(str15, "United States-Dvorak for right hand", "en-t-k0-windows-dvorakr"), new hm2(str15, "United States-International", "en-t-k0-windows-extended"), new hm2(str15, "US English Table for IBM Arabic 238_L", "en-t-k0-windows-var"), new hm2(str16, "Latin American", "es-419-t-k0-windows"), new hm2(str16, "Spanish Variation", "es-t-k0-windows-extended"), new hm2(str16, "Spanish", "es-t-k0-windows"), new hm2("et", "Estonian", "et-t-k0-windows"), new hm2(str17, "Persian (Standard)", "fa-t-k0-windows-extended"), new hm2(str17, "Persian", "fa-t-k0-windows"), new hm2(str18, "Finnish with Sami", "fi-t-k0-windows-extended"), new hm2(str18, "Finnish", "fi-t-k0-windows"), new hm2("fo", "Faeroese", "fo-t-k0-windows"), new hm2(str19, str10, "fr-BE-t-k0-windows-var"), new hm2(str19, "Belgian French", "fr-BE-t-k0-windows"), new hm2(str19, "Canadian French (Legacy)", "fr-CA-t-k0-windows-legacy"), new hm2(str19, "Canadian French", "fr-CA-t-k0-windows-var"), new hm2(str19, "Canadian Multilingual Standard", "fr-CA-t-k0-windows"), new hm2(str19, "Swiss French", "fr-CH-t-k0-windows"), new hm2(str19, "French", "fr-t-k0-windows"), new hm2(str20, "Ogham", "ga-Ogam-t-k0-windows"), new hm2(str20, "Irish", "ga-t-k0-windows"), new hm2("gd", "Scottish Gaelic", "gd-t-k0-windows"), new hm2("gn", "Guarani", "gn-t-k0-windows"), new hm2("got", "Gothic", "got-t-k0-windows"), new hm2("gu", "Gujarati", "gu-t-k0-windows"), new hm2("ha", "Hausa", "ha-t-k0-windows"), new hm2("haw", "Hawaiian", "haw-t-k0-windows"), new hm2(str21, "Hebrew (Standard)", "he-t-k0-windows-extended"), new hm2(str21, "Hebrew", "he-t-k0-windows"), new hm2(str22, "Hindi Traditional", "hi-t-k0-windows-legacy"), new hm2(str22, "Devanagari - INSCRIPT", "hi-t-k0-windows"), new hm2(str23, "Hungarian 101-key", "hu-t-k0-windows-101key"), new hm2(str23, "Hungarian", "hu-t-k0-windows"), new hm2(str24, "Armenian Western (Legacy)", "hy-AREVMDA-t-k0-windows"), new hm2(str24, "Armenian Eastern (Legacy)", "hy-t-k0-windows-legacy"), new hm2(str24, "Armenian Phonetic", "hy-t-k0-windows-phonetic"), new hm2(str24, "Armenian Typewriter", "hy-t-k0-windows"), new hm2("ig", "Igbo", "ig-t-k0-windows"), new hm2("is", "Icelandic", "is-t-k0-windows"), new hm2(str25, "Italian (142)", "it-t-k0-windows-var"), new hm2(str25, "Italian", "it-t-k0-windows"), new hm2(str26, "Inuktitut - Latin", "iu-t-k0-windows-var"), new hm2(str26, "Inuktitut - Naqittaut", "iu-t-k0-windows"), new hm2("ja", "Japanese", "ja-t-k0-windows"), new hm2("jv", "Javanese", "jv-t-k0-windows"), new hm2(str27, "Georgian (Old Alphabets)", "ka-t-k0-windows-legacy-var"), new hm2(str27, "Georgian (Legacy)", "ka-t-k0-windows-legacy"), new hm2(str27, "Georgian (QWERTY)", "ka-t-k0-windows-qwerty"), new hm2(str27, "Georgian (Ergonomic)", "ka-t-k0-windows-var"), new hm2(str27, "Georgian (MES)", "ka-t-k0-windows"), new hm2(str28, "Tai Le", "khb-Tale-t-k0-windows"), new hm2(str28, "New Tai Lue", "khb-t-k0-windows"), new hm2("kk", "Kazakh", "kk-t-k0-windows"), new hm2("kl", "Greenlandic", "kl-t-k0-windows"), new hm2(str29, "Khmer (NIDA)", "km-t-k0-windows-extended"), new hm2(str29, "Khmer", "km-t-k0-windows"), new hm2("kn", "Kannada", "kn-t-k0-windows"), new hm2(str30, "Korean", "ko-t-k0-windows"), new hm2(str30, "Korean - Dubeolsik", "ko-t-k0-windows-dubeolsik"), new hm2("ky", "Kyrgyz Cyrillic", "ky-t-k0-windows"), new hm2("la", "Old Italic", "la-Ital-t-k0-windows"), new hm2("lb", "Luxembourgish", "lb-t-k0-windows"), new hm2(str31, "Lisu (Standard)", "lis-t-k0-windows-extended"), new hm2(str31, "Lisu (Basic)", "lis-t-k0-windows"), new hm2("lo", "Lao", "lo-t-k0-windows"), new hm2(str32, "Lithuanian IBM", "lt-t-k0-windows-lt1205"), new hm2(str32, "Lithuanian Standard", "lt-t-k0-windows-lt1582"), new hm2(str32, "Lithuanian", "lt-t-k0-windows"), new hm2(str33, "Latvian (Standard)", "lv-t-k0-windows-extended"), new hm2(str33, "Latvian (QWERTY)", "lv-t-k0-windows-qwerty"), new hm2(str33, "Latvian", "lv-t-k0-windows"), new hm2("man", str4, "man-t-k0-windows"), new hm2("mi", "Maori", "mi-t-k0-windows"), new hm2(str34, "Macedonian (FYROM)", "mk-t-k0-windows-legacy"), new hm2(str34, "Macedonian (FYROM) - Standard", "mk-t-k0-windows"), new hm2("ml", "Malayalam", "ml-t-k0-windows"), new hm2(str35, "Traditional Mongolian (Standard)", "mn-Mong-t-k0-windows-extended"), new hm2(str35, "Mongolian (Mongolian Script)", "mn-Mong-t-k0-windows"), new hm2(str35, "Phags-pa", "mn-Phag-t-k0-windows"), new hm2(str35, "Mongolian Cyrillic", "mn-t-k0-windows"), new hm2("mr", "Marathi", "mr-t-k0-windows"), new hm2(str36, "Maltese 47-Key", "mt-t-k0-windows-101key"), new hm2(str36, "Maltese 48-Key", "mt-t-k0-windows"), new hm2("my", "Myanmar", "my-t-k0-windows"), new hm2(str37, "Norwegian with Sami", "nb-t-k0-windows-extended"), new hm2(str37, "Norwegian", "nb-t-k0-windows"), new hm2("ne", "Nepali", "ne-t-k0-windows"), new hm2(str38, str10, "nl-BE-t-k0-windows-var"), new hm2(str38, str11, "nl-BE-t-k0-windows"), new hm2(str38, "Dutch", "nl-t-k0-windows"), new hm2("non", "Futhark", "non-t-k0-windows"), new hm2("nso", "Sesotho sa Leboa", "nso-t-k0-windows"), new hm2("or", "Odia", "or-t-k0-windows"), new hm2("pa", "Punjabi", "pa-t-k0-windows"), new hm2(str39, "Polish (Programmers)", "pl-t-k0-windows-extended"), new hm2(str39, "Polish (214)", "pl-t-k0-windows"), new hm2("ps", "Pashto (Afghanistan)", "ps-t-k0-windows"), new hm2(str40, "Portuguese", "pt-PT-t-k0-windows"), new hm2(str40, "Portuguese (Brazil ABNT2)", "pt-t-k0-windows-var"), new hm2(str40, "Portuguese (Brazil ABNT)", "pt-t-k0-windows"), new hm2(str41, "Romanian (Programmers)", "ro-t-k0-windows-extended"), new hm2(str41, "Romanian (Legacy)", "ro-t-k0-windows-legacy"), new hm2(str41, "Romanian (Standard)", "ro-t-k0-windows"), new hm2(str42, "Russian (Typewriter)", "ru-t-k0-windows-legacy"), new hm2(str42, "Russian - Mnemonic", "ru-t-k0-windows-phonetic"), new hm2(str42, "Russian", "ru-t-k0-windows"), new hm2("sah", "Sakha", "sah-t-k0-windows"), new hm2("sat", "Ol Chiki", "sat-t-k0-windows"), new hm2(str43, str44, "se-FI-t-k0-windows"), new hm2(str43, str44, "se-SE-t-k0-windows"), new hm2(str43, "Sami Extended Norway", "se-t-k0-windows"), new hm2(str45, "Sinhala", "si-t-k0-windows-legacy"), new hm2(str45, "Sinhala - Wij 9", "si-t-k0-windows"), new hm2(str46, "Slovak (QWERTY)", "sk-t-k0-windows-qwerty"), new hm2(str46, "Slovak", "sk-t-k0-windows"), new hm2("sl", "Slovenian", "sl-t-k0-windows"), new hm2("so", "Osmanya", "so-Osma-t-k0-windows"), new hm2("sq", "Albanian", "sq-t-k0-windows"), new hm2(str47, "Serbian (Latin)", "sr-Latn-t-k0-windows"), new hm2(str47, "Serbian (Cyrillic)", "sr-t-k0-windows"), new hm2("srb", "Sora", "srb-t-k0-windows"), new hm2(str48, "Swedish with Sami", "sv-t-k0-windows-extended"), new hm2(str48, "Swedish", "sv-t-k0-windows"), new hm2(str49, "Syriac Phonetic", "syr-t-k0-windows-qwerty"), new hm2(str49, "Syriac", "syr-t-k0-windows"), new hm2("ta", "Tamil", "ta-t-k0-windows"), new hm2("te", "Telugu", "te-t-k0-windows"), new hm2("tg", "Tajik", "tg-t-k0-windows"), new hm2(str50, "Thai Pattachote (non-ShiftLock)", "th-t-k0-windows-patta-var"), new hm2(str50, "Thai Pattachote", "th-t-k0-windows-patta"), new hm2(str50, "Thai Kedmanee (non-ShiftLock)", "th-t-k0-windows-var"), new hm2(str50, "Thai Kedmanee", "th-t-k0-windows"), new hm2("tk", "Turkmen", "tk-t-k0-windows"), new hm2(str51, "Tifinagh (Extended)", "tmh-t-k0-windows-extended"), new hm2(str51, "Tifinagh (Basic)", "tmh-t-k0-windows"), new hm2("tn", "Setswana", "tn-t-k0-windows"), new hm2(str52, "Turkish F", "tr-t-k0-windows-legacy"), new hm2(str52, "Turkish Q", "tr-t-k0-windows"), new hm2(str53, "Tatar (Legacy)", "tt-t-k0-windows-legacy"), new hm2(str53, "Tatar", "tt-t-k0-windows"), new hm2("tzm", "Central Atlas Tamazight", "tzm-t-k0-windows"), new hm2(str54, "Uyghur (Legacy)", "ug-t-k0-windows-legacy"), new hm2(str54, "Uyghur", "ug-t-k0-windows"), new hm2(str55, "Ukrainian (Enhanced)", "uk-t-k0-windows-extended"), new hm2(str55, "Ukrainian", "uk-t-k0-windows"), new hm2("ur", "Urdu", "ur-t-k0-windows"), new hm2("uz", "Uzbek Cyrillic", "uz-t-k0-windows"), new hm2("vi", "Vietnamese", "vi-t-k0-windows"), new hm2("wo", "Wolof", "wo-t-k0-windows"), new hm2("yo", "Yoruba", "yo-t-k0-windows"), new hm2(str56, "Chinese (Traditional, Hong Kong S.A.R.) - US", "zh-HK-t-k0-windows"), new hm2(str56, "Chinese (Traditional) - US", "zh-Hant-t-k0-windows"), new hm2(str56, "Chinese (Traditional, Macao S.A.R.) - US", "zh-MO-t-k0-windows"), new hm2(str56, "Chinese (Simplified, Singapore) - US", "zh-SG-t-k0-windows"), new hm2(str56, "Chinese (Simplified) - US", "zh-t-k0-windows")};
    }

    @Override // defpackage.my1
    public final Object g() {
        Class<?> returnType;
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return new qx1(kq2.M(null));
            case 1:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                try {
                    Method method = (Method) zx1.a.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 3:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 4:
                vf1 vf1Var = db2.g;
                return k11.g;
            case 5:
                return null;
            case 6:
                return new vb1(48.0f);
            case 7:
            case 8:
                return og5Var;
            case 9:
                return new um2(3);
            case 10:
                p04 p04Var = new p04();
                p04Var.m = 2;
                p04Var.i = 0;
                p04Var.q = 2;
                p04Var.w = 4;
                p04Var.c = 2;
                int[] iArr = {rp2.w};
                qi2 qi2Var = qi2.t;
                r04 r04VarN = rp2.n(0.0f, 0, false, R.string.menu_show_media_control_buttons, new r04[]{rp2.r(qi2Var, "Vol-", iArr, 0, c33.u, 1.0f, 408), rp2.r(qi2Var, "Vol+", new int[]{rp2.q}, 0, c33.p, 1.0f, 408), rp2.r(qi2Var, "Mute", new int[]{rp2.m}, 0, c33.z, 1.0f, 408), rp2.r(qi2Var, "Play/Pause", new int[]{rp2.a}, 0, null, 1.0f, 440)}, 100, 15);
                r04 r04Var = new r04();
                s04 s04Var = new s04();
                s04Var.a = 2.0f;
                s04Var.m = -1;
                r04Var.q = s04Var;
                v04 v04Var = new v04();
                v04Var.s = true;
                r04Var.t = (byte) 3;
                r04Var.a = v04Var;
                qi2 qi2Var2 = qi2.j;
                p04Var.a = new r04[]{r04VarN, r04Var, rp2.n(0.0f, 0, false, R.string.menu_show_shortcuts_buttons, new r04[]{rp2.r(qi2Var2, "Undo", new int[]{113, 54}, 0, null, 1.0f, 440), rp2.r(qi2Var2, "Redo", new int[]{113, 53}, 0, null, 1.0f, 440), rp2.r(qi2Var2, "Copy", new int[]{113, 31}, 0, null, 1.0f, 440), rp2.r(qi2Var2, "Paste", new int[]{113, 50}, 0, null, 1.0f, 440), rp2.r(qi2Var2, "←", new int[]{21}, 0, null, 1.0f, 312), rp2.r(qi2Var2, "→", new int[]{22}, 0, null, 1.0f, 440)}, 101, 46), rp2.n(0.0f, 0, false, R.string.menu_show_android_navigation_buttons, new r04[]{rp2.r(qi2Var2, "Back", new int[]{4}, Color.parseColor("#607d8b"), null, 1.0f, 168), rp2.r(qi2Var, "Home", new int[]{rp2.c}, Color.parseColor("#607d8b"), null, 1.0f, 424), rp2.r(qi2Var, "Menu", new int[]{rp2.i}, Color.parseColor("#607d8b"), null, 1.0f, 424)}, 102, 46)};
                return p04Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                p04 p04Var2 = new p04();
                p04Var2.m = 2;
                p04Var2.i = 0;
                p04Var2.q = 2;
                p04Var2.w = 4;
                p04Var2.c = 2;
                r04 r04VarR = rp2.r(qi2.a, "Speech input", new int[]{0}, Color.parseColor("#607d8b"), c33.o, 1.0f, 392);
                int[] iArr2 = {rp2.m};
                qi2 qi2Var3 = qi2.t;
                r04 r04VarN2 = rp2.n(0.25f, 0, false, 0, new r04[]{r04VarR, rp2.r(qi2Var3, "Mute", iArr2, 0, c33.z, 1.0f, 408), rp2.r(qi2Var3, "Vol-", new int[]{rp2.w}, 0, c33.u, 1.0f, 408), rp2.r(qi2Var3, "Vol+", new int[]{rp2.q}, 0, c33.p, 1.0f, 408), rp2.r(qi2Var3, "Power", new int[]{rp2.b}, Color.parseColor("#f44336"), c33.k, 1.0f, 392)}, 0, 186);
                r04 r04VarN3 = rp2.n(0.25f, 0, false, 0, new r04[]{rp2.r(qi2Var3, "Prev", new int[]{rp2.t}, 0, c33.s, 1.0f, 280), rp2.r(qi2Var3, "Next", new int[]{rp2.j}, 0, c33.b, 1.0f, 408), rp2.r(qi2Var3, "Rewind", new int[]{rp2.l}, 0, c33.i, 1.0f, 408), rp2.r(qi2Var3, "Fast Forward", new int[]{rp2.x}, 0, c33.c, 1.0f, 408)}, 0, 186);
                r04 r04Var2 = new r04();
                s04 s04Var2 = new s04();
                s04Var2.a = 2.0f;
                s04Var2.m = -1;
                r04Var2.q = s04Var2;
                v04 v04Var2 = new v04();
                v04Var2.a = true;
                v04Var2.b = true;
                r04Var2.t = (byte) 3;
                r04Var2.a = v04Var2;
                qi2 qi2Var4 = qi2.j;
                p04Var2.a = new r04[]{r04VarN2, r04VarN3, r04Var2, rp2.n(1.0f, 0, false, 0, new r04[]{rp2.r(qi2Var4, "↑", new int[]{19}, 0, c33.q, 0.0f, 472), rp2.r(qi2Var4, "←", new int[]{21}, 0, c33.a, 0.0f, 344), rp2.r(qi2Var4, "OK", new int[]{66}, 0, null, 0.0f, 504), rp2.r(qi2Var4, "→", new int[]{22}, 0, c33.m, 0.0f, 472), rp2.r(qi2Var4, "↓", new int[]{20}, 0, c33.w, 0.0f, 344)}, 0, 190), rp2.n(0.5f, 0, false, 0, new r04[]{rp2.r(qi2Var3, "Play/Pause", new int[]{rp2.a}, Color.parseColor("#8BC34A"), null, 1.0f, 424)}, 0, 190), rp2.n(0.0f, 0, false, 0, new r04[]{rp2.r(qi2Var4, "Back", new int[]{4}, Color.parseColor("#000000"), null, 1.0f, 424), rp2.r(qi2Var3, "Home", new int[]{rp2.c}, Color.parseColor("#000000"), null, 1.0f, 424), rp2.r(qi2Var3, "Menu", new int[]{rp2.i}, Color.parseColor("#000000"), null, 1.0f, 424)}, 0, 190)};
                return p04Var2;
            case 12:
                p04 p04Var3 = new p04();
                p04Var3.m = 2;
                p04Var3.i = 0;
                p04Var3.q = 2;
                p04Var3.w = 4;
                p04Var3.c = 5;
                int color = Color.parseColor("#403E3D");
                qi2 qi2Var5 = qi2.j;
                r04 r04VarR2 = rp2.r(qi2Var5, "Black screen", new int[]{56}, color, c33.h, 1.0f, 392);
                n04 n04Var = new n04();
                l04 l04Var = new l04();
                l04Var.t = new int[]{135};
                n04Var.t = (byte) 2;
                n04Var.a = l04Var;
                n04 n04Var2 = new n04();
                l04 l04Var2 = new l04();
                l04Var2.t = new int[]{111};
                n04Var2.t = (byte) 2;
                n04Var2.a = l04Var2;
                n04[] n04VarArr = {n04Var, n04Var2};
                int color2 = Color.parseColor("#8BC34A");
                r04 r04Var3 = new r04();
                int i = rp2.g;
                rp2.g = i + 1;
                r04Var3.m = i;
                s04 s04Var3 = new s04();
                s04Var3.a = 1.0f;
                s04Var3.t = false;
                s04Var3.m = 4;
                r04Var3.q = s04Var3;
                o04 o04Var = new o04();
                o04Var.a = 0;
                o04Var.m = "Start presentation";
                o04Var.q = color2;
                o04Var.w = 12;
                o04Var.t = n04VarArr;
                r04Var3.t = (byte) 2;
                r04Var3.a = o04Var;
                r04 r04VarN4 = rp2.n(0.5f, 0, false, 0, new r04[]{r04VarR2, r04Var3}, 0, 190);
                r04 r04VarN5 = rp2.n(3.0f, 0, false, 0, new r04[]{rp2.r(qi2Var5, "Prev", new int[]{92}, 0, c33.a, 1.0f, 408), rp2.r(qi2Var5, "Next", new int[]{93}, 0, c33.m, 1.0f, 408)}, 0, 190);
                r04 r04Var4 = new r04();
                s04 s04Var4 = new s04();
                s04Var4.a = 2.0f;
                s04Var4.m = -1;
                r04Var4.q = s04Var4;
                v04 v04Var3 = new v04();
                v04Var3.a = true;
                v04Var3.b = true;
                r04Var4.t = (byte) 3;
                r04Var4.a = v04Var3;
                p04Var3.a = new r04[]{r04VarN4, r04VarN5, r04Var4};
                return p04Var3;
            case 13:
                p04 p04Var4 = new p04();
                p04Var4.m = 0;
                p04Var4.i = 0;
                p04Var4.q = 2;
                p04Var4.w = 4;
                p04Var4.c = 5;
                qi2 qi2Var6 = qi2.j;
                p04Var4.a = new r04[]{rp2.n(2.0f, 0, false, 0, new r04[]{rp2.n(1.0f, 0, false, 0, new r04[]{rp2.r(qi2Var6, "NUM", new int[]{143}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "/", new int[]{154}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "*", new int[]{155}, 0, null, 1.0f, 432)}, 0, 176), rp2.n(1.0f, 0, true, 0, new r04[]{rp2.r(qi2Var6, "7", new int[]{151}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "8", new int[]{152}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "9", new int[]{153}, 0, null, 1.0f, 432)}, 0, 176), rp2.n(1.0f, 0, true, 0, new r04[]{rp2.r(qi2Var6, "4", new int[]{148}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "5", new int[]{149}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "6", new int[]{150}, 0, null, 1.0f, 432)}, 0, 176), rp2.n(1.0f, 0, true, 0, new r04[]{rp2.r(qi2Var6, "1", new int[]{145}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "2", new int[]{146}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "3", new int[]{147}, 0, null, 1.0f, 432)}, 0, 176), rp2.n(1.0f, 0, true, 0, new r04[]{rp2.r(qi2Var6, "0", new int[]{144}, 0, null, 1.0f, 432), rp2.r(qi2Var6, "=", new int[]{161}, 0, null, 1.0f, 432), rp2.r(qi2Var6, ".", new int[]{158}, 0, null, 1.0f, 432)}, 0, 176)}, 0, 190), rp2.n(1.0f, 2, false, 0, new r04[]{rp2.r(qi2Var6, "⌫", new int[]{67}, 0, null, 0.2f, 432), rp2.r(qi2Var6, "-", new int[]{156}, 0, null, 0.2f, 432), rp2.r(qi2Var6, "+", new int[]{157}, 0, null, 0.2f, 432), rp2.r(qi2Var6, "Enter", new int[]{160}, 0, null, 0.49f, 432)}, 0, 184)};
                return p04Var4;
            case 14:
                return n();
            case kq2.x /* 15 */:
                return new ss2(0, 0);
            case 16:
                return null;
            case 17:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 18:
                throw new IllegalStateException("NavigationHandlers not provided");
            case 19:
                return null;
            case 20:
                vf1 vf1Var2 = px2.g;
                return hi0.A;
            case 21:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 22:
                return e83.g;
            case 23:
                p04 p04Var5 = new p04();
                p04Var5.m = 0;
                p04Var5.i = 0;
                p04Var5.q = 2;
                p04Var5.w = 4;
                p04Var5.c = 2;
                int[] iArr3 = {rp2.m};
                qi2 qi2Var7 = qi2.t;
                p04Var5.a = new r04[]{rp2.r(qi2Var7, "Mute", iArr3, 0, c33.z, 1.0f, 408), rp2.r(qi2Var7, "Vol-", new int[]{rp2.w}, 0, c33.u, 1.0f, 408), rp2.r(qi2Var7, "Vol+", new int[]{rp2.q}, 0, c33.p, 1.0f, 408), rp2.r(qi2Var7, "Play/Pause", new int[]{rp2.a}, 0, c33.e, 1.0f, 408)};
                return p04Var5;
            case 24:
                return rp2.r(qi2.t, "Play/Pause", new int[]{rp2.a}, 0, c33.e, 1.0f, 408);
            case 25:
                return rp2.r(qi2.t, "Mute", new int[]{rp2.m}, 0, c33.z, 1.0f, 408);
            case 26:
                return rp2.r(qi2.t, "Vol-", new int[]{rp2.w}, 0, c33.u, 1.0f, 408);
            case 27:
                return rp2.r(qi2.t, "Vol+", new int[]{rp2.q}, 0, c33.p, 1.0f, 408);
            case 28:
                return rp2.r(qi2.t, "Prev", new int[]{rp2.t}, 0, c33.s, 1.0f, 408);
            default:
                return rp2.r(qi2.t, "Next", new int[]{rp2.j}, 0, c33.b, 1.0f, 408);
        }
    }
}
