package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class vp2 {
    public static final o05 g = new o05(new sx1((byte) 14));

    public static final String g(db3 db3Var, Context context) {
        db3Var.getClass();
        context.getClass();
        rw3 rw3Var = yl4.g;
        String str = (String) db3Var.r(yl4.y);
        return str == null ? r(context) : str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final wi2 n(String str) {
        switch (str.hashCode()) {
            case -2140702863:
                if (str.equals("el-POLYTON-t-k0-osx")) {
                    return new st5((byte) 8);
                }
                break;
            case -2119555682:
                if (str.equals("fi-t-k0-windows")) {
                    return new ut5((byte) 21, (char) 0);
                }
                break;
            case -2098571519:
                if (str.equals("de-CH-t-k0-osx")) {
                    return new pt5((byte) 24, 0);
                }
                break;
            case -2095593157:
                if (str.equals("ne-t-k0-osx")) {
                    return new bu5((byte) 25, false, false);
                }
                break;
            case -2087621451:
                if (str.equals("bn-t-k0-windows")) {
                    return new xi2((byte) 27, false, false);
                }
                break;
            case -2007013329:
                if (str.equals("be-t-k0-osx")) {
                    return new xi2((byte) 15, (char) 0);
                }
                break;
            case -1992232277:
                if (str.equals("uk-t-k0-windows")) {
                    return new ju5((byte) 0);
                }
                break;
            case -1983108211:
                if (str.equals("th-t-k0-windows")) {
                    return new gu5((byte) 10);
                }
                break;
            case -1982658348:
                if (str.equals("en-t-k0-windows-dvorak")) {
                    return new ut5((byte) 0);
                }
                break;
            case -1978546178:
                if (str.equals("sv-t-k0-windows")) {
                    return new eu5((byte) 29, false, false);
                }
                break;
            case -1977860336:
                if (str.equals("it-t-k0-windows-var")) {
                    return new xt5((byte) 18, (char) 0);
                }
                break;
            case -1973984145:
                if (str.equals("se-t-k0-windows")) {
                    return new eu5((byte) 8);
                }
                break;
            case -1955602773:
                if (str.equals("lis-t-k0-windows")) {
                    return new yt5((byte) 19, (char) 0);
                }
                break;
            case -1940843250:
                if (str.equals("en-t-k0-osx-colemak")) {
                    return new st5((byte) 22, (char) 0);
                }
                break;
            case -1910115683:
                if (str.equals("ko-t-k0-windows")) {
                    return new yt5((byte) 14, (char) 0);
                }
                break;
            case -1902298555:
                if (str.equals("ka-t-k0-windows-var")) {
                    return new yt5((byte) 2);
                }
                break;
            case -1896120594:
                if (str.equals("fa-t-k0-osx-qwerty")) {
                    return new ut5((byte) 15, (char) 0);
                }
                break;
            case -1879804352:
                if (str.equals("iu-t-k0-osx-var")) {
                    return new xt5((byte) 22, (char) 0);
                }
                break;
            case -1870768958:
                if (str.equals("lt-t-k0-windows-lt1205")) {
                    return new yt5((byte) 24, (char) 0);
                }
                break;
            case -1870765830:
                if (str.equals("lt-t-k0-windows-lt1582")) {
                    return new yt5((byte) 25, false, false);
                }
                break;
            case -1870680286:
                if (str.equals("hr-t-k0-osx-var")) {
                    return new xt5((byte) 1);
                }
                break;
            case -1864001390:
                if (str.equals("bo-t-k0-windows-extended")) {
                    return new pt5((byte) 3);
                }
                break;
            case -1859933320:
                if (str.equals("en-t-k0-windows")) {
                    return new st5((byte) 29, false, false);
                }
                break;
            case -1851960156:
                if (str.equals("te-t-k0-osx-qwerty")) {
                    return new gu5((byte) 5);
                }
                break;
            case -1842420024:
                if (str.equals("lv-t-k0-osx")) {
                    return new yt5((byte) 26, false, false);
                }
                break;
            case -1832561122:
                if (str.equals("be-t-k0-windows")) {
                    return new xi2((byte) 16, (char) 0);
                }
                break;
            case -1828784830:
                if (str.equals("he-t-k0-windows-extended")) {
                    return new vt5((byte) 25, 0);
                }
                break;
            case -1827999089:
                if (str.equals("as-t-k0-windows")) {
                    return new xi2((byte) 9);
                }
                break;
            case -1789641601:
                if (str.equals("bn-t-k0-osx-qwerty")) {
                    return new xi2((byte) 26, false, false);
                }
                break;
            case -1771209703:
                if (str.equals("chr-t-k0-windows-phonetic")) {
                    return new pt5((byte) 9);
                }
                break;
            case -1763806396:
                if (str.equals("en-GB-t-k0-windows-extended")) {
                    return new st5((byte) 19, (char) 0);
                }
                break;
            case -1755635389:
                if (str.equals("et-t-k0-osx")) {
                    return new ut5((byte) 10);
                }
                break;
            case -1700713065:
                if (str.equals("fi-t-k0-osx-extended")) {
                    return new ut5((byte) 19, (char) 0);
                }
                break;
            case -1692269377:
                if (str.equals("zh-HK-t-k0-windows")) {
                    return new ju5((byte) 10);
                }
                break;
            case -1691551618:
                if (str.equals("or-t-k0-windows")) {
                    return new du5((byte) 6);
                }
                break;
            case -1689974358:
                if (str.equals("ga-Ogam-t-k0-windows")) {
                    return new vt5((byte) 8);
                }
                break;
            case -1674236333:
                if (str.equals("ml-t-k0-osx")) {
                    return new bu5((byte) 6);
                }
                break;
            case -1673303486:
                if (str.equals("ml-t-k0-windows")) {
                    return new bu5((byte) 8);
                }
                break;
            case -1670151495:
                if (str.equals("nb-t-k0-windows-extended")) {
                    return new bu5((byte) 24, 0);
                }
                break;
            case -1657454808:
                if (str.equals("ar-t-k0-windows-azerty")) {
                    return new xi2((byte) 8);
                }
                break;
            case -1653722316:
                if (str.equals("hi-t-k0-osx-qwerty")) {
                    return new vt5((byte) 27, false, false);
                }
                break;
            case -1615781512:
                if (str.equals("ga-t-k0-osx")) {
                    return new vt5((byte) 9);
                }
                break;
            case -1596802783:
                if (str.equals("gu-t-k0-osx-qwerty")) {
                    return new vt5((byte) 16, 0);
                }
                break;
            case -1582062826:
                if (str.equals("bm-t-k0-windows")) {
                    return new xi2((byte) 24, (char) 0);
                }
                break;
            case -1560757818:
                if (str.equals("de-t-k0-windows-extended")) {
                    return new pt5((byte) 27, false, false);
                }
                break;
            case -1559121884:
                if (str.equals("es-t-k0-osx")) {
                    return new ut5((byte) 6);
                }
                break;
            case -1536177649:
                if (str.equals("sv-t-k0-osx")) {
                    return new eu5((byte) 26, false, false);
                }
                break;
            case -1528213453:
                if (str.equals("mk-t-k0-windows-legacy")) {
                    return new bu5((byte) 5);
                }
                break;
            case -1527731949:
                if (str.equals("zh-t-k0-windows")) {
                    return new ju5((byte) 14, (char) 0);
                }
                break;
            case -1506052642:
                if (str.equals("nb-t-k0-osx")) {
                    return new bu5((byte) 20, 0);
                }
                break;
            case -1498198233:
                if (str.equals("ug-t-k0-windows-legacy")) {
                    return new gu5((byte) 28, false, false);
                }
                break;
            case -1477722828:
                if (str.equals("mk-t-k0-osx")) {
                    return new bu5((byte) 3);
                }
                break;
            case -1477549586:
                if (str.equals("tg-t-k0-windows")) {
                    return new gu5((byte) 7);
                }
                break;
            case -1456875088:
                if (str.equals("syr-t-k0-windows-qwerty")) {
                    return new gu5((byte) 2);
                }
                break;
            case -1449393014:
                if (str.equals("lt-t-k0-osx")) {
                    return new yt5((byte) 22, (char) 0);
                }
                break;
            case -1445615355:
                if (str.equals("pl-t-k0-windows")) {
                    return new du5((byte) 12);
                }
                break;
            case -1438803279:
                if (str.equals("tr-t-k0-osx-qwerty")) {
                    return new gu5((byte) 19, 0);
                }
                break;
            case -1430249197:
                if (str.equals("tr-t-k0-windows-legacy")) {
                    return new gu5((byte) 22, 0);
                }
                break;
            case -1429834406:
                if (str.equals("bg-t-k0-windows-legacy")) {
                    return new xi2((byte) 21, (char) 0);
                }
                break;
            case -1424670109:
                if (str.equals("zh-Hant-t-k0-windows")) {
                    return new ju5((byte) 11);
                }
                break;
            case -1422805190:
                if (str.equals("mt-t-k0-windows")) {
                    return new bu5((byte) 16, 0);
                }
                break;
            case -1411037869:
                if (str.equals("khb-Tale-t-k0-windows")) {
                    return new yt5((byte) 3);
                }
                break;
            case -1404557058:
                if (str.equals("kn-t-k0-windows")) {
                    return new yt5((byte) 13, (char) 0);
                }
                break;
            case -1390938193:
                if (str.equals("fi-t-k0-osx")) {
                    return new ut5((byte) 18, (char) 0);
                }
                break;
            case -1384513900:
                if (str.equals("ko-t-k0-windows-dubeolsik")) {
                    return new yt5((byte) 15, (char) 0);
                }
                break;
            case -1380931021:
                if (str.equals("es-t-k0-windows-extended")) {
                    return new ut5((byte) 9);
                }
                break;
            case -1377184860:
                if (str.equals("he-t-k0-windows")) {
                    return new vt5((byte) 24, 0);
                }
                break;
            case -1365720800:
                if (str.equals("mt-t-k0-windows-101key")) {
                    return new bu5((byte) 17, 0);
                }
                break;
            case -1332866536:
                if (str.equals("en-t-k0-windows-dvorakl")) {
                    return new ut5((byte) 1);
                }
                break;
            case -1332866530:
                if (str.equals("en-t-k0-windows-dvorakr")) {
                    return new ut5((byte) 2);
                }
                break;
            case -1324964213:
                if (str.equals("sk-t-k0-osx-qwerty")) {
                    return new eu5((byte) 14, (char) 0);
                }
                break;
            case -1322440464:
                if (str.equals("ar-t-k0-windows")) {
                    return new xi2((byte) 6);
                }
                break;
            case -1321850888:
                if (str.equals("uz-Arab-t-k0-osx")) {
                    return new ju5((byte) 4);
                }
                break;
            case -1305948751:
                if (str.equals("de-t-k0-osx")) {
                    return new pt5((byte) 26, false, false);
                }
                break;
            case -1300538002:
                if (str.equals("lv-t-k0-windows-qwerty")) {
                    return new yt5((byte) 29, false, false);
                }
                break;
            case -1294351125:
                if (str.equals("si-t-k0-windows-legacy")) {
                    return new eu5((byte) 12, (char) 0);
                }
                break;
            case -1270107991:
                if (str.equals("bg-t-k0-windows-qwerty")) {
                    return new xi2((byte) 22, (char) 0);
                }
                break;
            case -1263921114:
                if (str.equals("hy-t-k0-windows-legacy")) {
                    return new xt5((byte) 10);
                }
                break;
            case -1256837195:
                if (str.equals("bs-Cyrl-t-k0-windows")) {
                    return new pt5((byte) 4);
                }
                break;
            case -1253366029:
                if (str.equals("fr-CA-t-k0-osx")) {
                    return new ut5((byte) 28, false, false);
                }
                break;
            case -1251084316:
                if (str.equals("gu-t-k0-osx")) {
                    return new vt5((byte) 15, 0);
                }
                break;
            case -1246917515:
                if (str.equals("cs-t-k0-windows-extended")) {
                    return new pt5((byte) 15, 0);
                }
                break;
            case -1236175356:
                if (str.equals("ur-t-k0-windows")) {
                    return new ju5((byte) 3);
                }
                break;
            case -1219280899:
                if (str.equals("en-t-k0-osx-extended")) {
                    return new st5((byte) 27, false, false);
                }
                break;
            case -1217927224:
                if (str.equals("sl-t-k0-windows")) {
                    return new eu5((byte) 18, (char) 0);
                }
                break;
            case -1207473326:
                if (str.equals("en-t-k0-windows-var")) {
                    return new ut5((byte) 4);
                }
                break;
            case -1195117059:
                if (str.equals("pt-t-k0-windows")) {
                    return new du5((byte) 20, 0);
                }
                break;
            case -1167744861:
                if (str.equals("mk-t-k0-windows")) {
                    return new bu5((byte) 4);
                }
                break;
            case -1146672958:
                if (str.equals("es-t-k0-osx-extended")) {
                    return new ut5((byte) 7);
                }
                break;
            case -1118172126:
                if (str.equals("nb-t-k0-osx-extended-var")) {
                    return new bu5((byte) 22, 0);
                }
                break;
            case -1111213149:
                if (str.equals("haw-t-k0-windows")) {
                    return new vt5((byte) 20, 0);
                }
                break;
            case -1093546586:
                if (str.equals("hy-AREVMDA-t-k0-osx")) {
                    return new xt5((byte) 6);
                }
                break;
            case -1090190300:
                if (str.equals("da-t-k0-windows")) {
                    return new pt5((byte) 19, 0);
                }
                break;
            case -1084695818:
                if (str.equals("mi-t-k0-osx")) {
                    return new bu5((byte) 1);
                }
                break;
            case -1071942168:
                if (str.equals("az-t-k0-windows")) {
                    return new xi2((byte) 12);
                }
                break;
            case -1015051176:
                if (str.equals("ru-t-k0-windows-legacy")) {
                    return new eu5((byte) 1);
                }
                break;
            case -1010680696:
                if (str.equals("fi-t-k0-windows-extended")) {
                    return new ut5((byte) 22, (char) 0);
                }
                break;
            case -1007547371:
                if (str.equals("tt-t-k0-windows-legacy")) {
                    return new gu5((byte) 24, 0);
                }
                break;
            case -999363159:
                if (str.equals("wo-t-k0-windows")) {
                    return new ju5((byte) 8);
                }
                break;
            case -989487234:
                if (str.equals("az-t-k0-windows-extended")) {
                    return new xi2((byte) 13, (char) 0);
                }
                break;
            case -985677060:
                if (str.equals("uz-t-k0-windows")) {
                    return new ju5((byte) 5);
                }
                break;
            case -962982468:
                if (str.equals("fr-CA-t-k0-windows-var")) {
                    return new vt5((byte) 1);
                }
                break;
            case -944433653:
                if (str.equals("tr-t-k0-osx-qwerty-var")) {
                    return new gu5((byte) 20, 0);
                }
                break;
            case -921808598:
                if (str.equals("ne-t-k0-windows")) {
                    return new bu5((byte) 26, false, false);
                }
                break;
            case -915445925:
                if (str.equals("sat-t-k0-windows")) {
                    return new eu5((byte) 4);
                }
                break;
            case -898998433:
                if (str.equals("km-t-k0-windows")) {
                    return new yt5((byte) 9);
                }
                break;
            case -880750301:
                if (str.equals("ig-t-k0-windows")) {
                    return new xt5((byte) 12, (char) 0);
                }
                break;
            case -876188268:
                if (str.equals("hu-t-k0-windows")) {
                    return new xt5((byte) 4);
                }
                break;
            case -876069826:
                if (str.equals("ar-t-k0-osx-qwerty-var")) {
                    return new xi2((byte) 4);
                }
                break;
            case -862830861:
                if (str.equals("de-AT-t-k0-osx")) {
                    return new pt5((byte) 20, 0);
                }
                break;
            case -862502169:
                if (str.equals("ga-t-k0-windows")) {
                    return new vt5((byte) 11);
                }
                break;
            case -858696541:
                if (str.equals("en-t-k0-osx-dvorak")) {
                    return new st5((byte) 23, (char) 0);
                }
                break;
            case -857940136:
                if (str.equals("fo-t-k0-windows")) {
                    return new ut5((byte) 24, false, false);
                }
                break;
            case -849788887:
                if (str.equals("en-t-k0-osx-dvorakl")) {
                    return new st5((byte) 25, false, false);
                }
                break;
            case -849788881:
                if (str.equals("en-t-k0-osx-dvorakr")) {
                    return new st5((byte) 26, false, false);
                }
                break;
            case -848816070:
                if (str.equals("el-t-k0-windows")) {
                    return new st5((byte) 11);
                }
                break;
            case -844254037:
                if (str.equals("dz-t-k0-windows")) {
                    return new st5((byte) 4);
                }
                break;
            case -813693129:
                if (str.equals("sv-t-k0-osx-extended")) {
                    return new eu5((byte) 27, false, false);
                }
                break;
            case -805470157:
                if (str.equals("la-Ital-t-k0-windows")) {
                    return new yt5((byte) 17, (char) 0);
                }
                break;
            case -776678365:
                if (str.equals("se-FI-t-k0-windows")) {
                    return new eu5((byte) 5);
                }
                break;
            case -771953324:
                if (str.equals("cs-t-k0-windows-qwerty")) {
                    return new pt5((byte) 16, 0);
                }
                break;
            case -764669214:
                if (str.equals("fr-CA-t-k0-windows")) {
                    return new ut5((byte) 29, false, false);
                }
                break;
            case -761405344:
                if (str.equals("fa-t-k0-osx-isiri")) {
                    return new ut5((byte) 14, (char) 0);
                }
                break;
            case -750123629:
                if (str.equals("sr-t-k0-osx")) {
                    return new eu5((byte) 23, (char) 0);
                }
                break;
            case -748408810:
                if (str.equals("or-t-k0-osx-qwerty")) {
                    return new du5((byte) 5);
                }
                break;
            case -721492665:
                if (str.equals("tn-t-k0-windows")) {
                    return new gu5((byte) 17, 0);
                }
                break;
            case -712368599:
                if (str.equals("sk-t-k0-windows")) {
                    return new eu5((byte) 15, (char) 0);
                }
                break;
            case -711922884:
                if (str.equals("sk-t-k0-windows-qwerty")) {
                    return new eu5((byte) 16, (char) 0);
                }
                break;
            case -703977451:
                if (str.equals("hy-AREVMDA-t-k0-windows")) {
                    return new xt5((byte) 7);
                }
                break;
            case -689873615:
                if (str.equals("hi-t-k0-osx")) {
                    return new vt5((byte) 26, false, false);
                }
                break;
            case -689558434:
                if (str.equals("ps-t-k0-windows")) {
                    return new du5((byte) 15, 0);
                }
                break;
            case -661623833:
                if (str.equals("km-t-k0-windows-extended")) {
                    return new yt5((byte) 10);
                }
                break;
            case -634814038:
                if (str.equals("ja-t-k0-windows")) {
                    return new xt5((byte) 25, false, false);
                }
                break;
            case -631106828:
                if (str.equals("se-SE-t-k0-windows")) {
                    return new eu5((byte) 6);
                }
                break;
            case -608474559:
                if (str.equals("pa-t-k0-osx")) {
                    return new du5((byte) 7);
                }
                break;
            case -598317774:
                if (str.equals("et-t-k0-windows")) {
                    return new ut5((byte) 11);
                }
                break;
            case -590816608:
                if (str.equals("fr-t-k0-osx-var")) {
                    return new vt5((byte) 6);
                }
                break;
            case -581939938:
                if (str.equals("th-t-k0-osx")) {
                    return new gu5((byte) 8);
                }
                break;
            case -576554359:
                if (str.equals("en-t-k0-osx")) {
                    return new st5((byte) 21, (char) 0);
                }
                break;
            case -550019738:
                if (str.equals("iu-t-k0-osx")) {
                    return new xt5((byte) 19, (char) 0);
                }
                break;
            case -546748290:
                if (str.equals("srb-t-k0-windows")) {
                    return new eu5((byte) 25, false, false);
                }
                break;
            case -531421439:
                if (str.equals("dyu-t-k0-windows")) {
                    return new st5((byte) 3);
                }
                break;
            case -519894731:
                if (str.equals("da-t-k0-osx")) {
                    return new pt5((byte) 18, 0);
                }
                break;
            case -515878568:
                if (str.equals("ckb-t-k0-osx")) {
                    return new pt5((byte) 10);
                }
                break;
            case -471712128:
                if (str.equals("zh-MO-t-k0-windows")) {
                    return new ju5((byte) 12, (char) 0);
                }
                break;
            case -466432336:
                if (str.equals("te-t-k0-windows")) {
                    return new gu5((byte) 6);
                }
                break;
            case -458701327:
                if (str.equals("fi-t-k0-osx-extended-var")) {
                    return new ut5((byte) 20, (char) 0);
                }
                break;
            case -436331904:
                if (str.equals("bo-t-k0-osx-qwerty")) {
                    return new pt5((byte) 1);
                }
                break;
            case -411687940:
                if (str.equals("mr-t-k0-windows")) {
                    return new bu5((byte) 13, 0);
                }
                break;
            case -402563874:
                if (str.equals("lo-t-k0-windows")) {
                    return new yt5((byte) 21, (char) 0);
                }
                break;
            case -393439808:
                if (str.equals("kl-t-k0-windows")) {
                    return new yt5((byte) 7);
                }
                break;
            case -387556168:
                if (str.equals("so-Osma-t-k0-windows")) {
                    return new eu5((byte) 19, (char) 0);
                }
                break;
            case -364692225:
                if (str.equals("fr-t-k0-osx-qwerty")) {
                    return new vt5((byte) 5);
                }
                break;
            case -353506233:
                if (str.equals("it-t-k0-osx")) {
                    return new xt5((byte) 15, (char) 0);
                }
                break;
            case -350568426:
                if (str.equals("hi-t-k0-windows-legacy")) {
                    return new vt5((byte) 29, false, false);
                }
                break;
            case -315132765:
                if (str.equals("cs-t-k0-osx-qwerty")) {
                    return new pt5((byte) 13, 0);
                }
                break;
            case -266834162:
                if (str.equals("zh-SG-t-k0-windows")) {
                    return new ju5((byte) 13, (char) 0);
                }
                break;
            case -242468690:
                if (str.equals("fr-BE-t-k0-osx")) {
                    return new ut5((byte) 25, false, false);
                }
                break;
            case -213652356:
                if (str.equals("ka-t-k0-osx")) {
                    return new xt5((byte) 27, false, false);
                }
                break;
            case -204519319:
                if (str.equals("nl-BE-t-k0-windows-var")) {
                    return new bu5((byte) 29, false, false);
                }
                break;
            case -200183956:
                if (str.equals("el-Latn-t-k0-windows")) {
                    return new st5((byte) 5);
                }
                break;
            case -183527349:
                if (str.equals("el-t-k0-osx")) {
                    return new st5((byte) 10);
                }
                break;
            case -179437776:
                if (str.equals("pa-t-k0-windows")) {
                    return new du5((byte) 9);
                }
                break;
            case -165751677:
                if (str.equals("nl-t-k0-windows")) {
                    return new du5((byte) 1);
                }
                break;
            case -156992728:
                if (str.equals("is-t-k0-osx")) {
                    return new xt5((byte) 13, (char) 0);
                }
                break;
            case -156627611:
                if (str.equals("mi-t-k0-windows")) {
                    return new bu5((byte) 2);
                }
                break;
            case -129593609:
                if (str.equals("ar-t-k0-osx-azerty")) {
                    return new xi2((byte) 2);
                }
                break;
            case -92759149:
                if (str.equals("es-t-k0-windows")) {
                    return new ut5((byte) 8);
                }
                break;
            case -77388865:
                if (str.equals("vi-t-k0-osx")) {
                    return new ju5((byte) 6);
                }
                break;
            case -62206240:
                if (str.equals("chr-t-k0-osx-qwerty")) {
                    return new pt5((byte) 7);
                }
                break;
            case -49059051:
                if (str.equals("ur-t-k0-osx")) {
                    return new ju5((byte) 2);
                }
                break;
            case -47263858:
                if (str.equals("pt-t-k0-osx")) {
                    return new du5((byte) 18, 0);
                }
                break;
            case -41878279:
                if (str.equals("az-t-k0-osx")) {
                    return new xi2((byte) 11);
                }
                break;
            case -18508572:
                if (str.equals("es-419-t-k0-windows")) {
                    return new ut5((byte) 5);
                }
                break;
            case -8612293:
                if (str.equals("fr-CH-t-k0-windows")) {
                    return new vt5((byte) 3);
                }
                break;
            case 511773:
                if (str.equals("fr-BE-t-k0-windows")) {
                    return new ut5((byte) 26, false, false);
                }
                break;
            case 6498260:
                if (str.equals("non-t-k0-windows")) {
                    return new du5((byte) 2);
                }
                break;
            case 7600577:
                if (str.equals("te-t-k0-osx")) {
                    return new gu5((byte) 4);
                }
                break;
            case 28881582:
                if (str.equals("dsb-t-k0-windows")) {
                    return new pt5((byte) 28, false, false);
                }
                break;
            case 30002223:
                if (str.equals("ug-t-k0-windows")) {
                    return new gu5((byte) 27, false, false);
                }
                break;
            case 43688322:
                if (str.equals("sr-t-k0-windows")) {
                    return new eu5((byte) 24, false, false);
                }
                break;
            case 49621985:
                if (str.equals("bn-t-k0-windows-legacy")) {
                    return new xi2((byte) 28, false, false);
                }
                break;
            case 52812388:
                if (str.equals("ro-t-k0-windows")) {
                    return new du5((byte) 24, 0);
                }
                break;
            case 61520022:
                if (str.equals("el-t-k0-windows-el220")) {
                    return new st5((byte) 12, (char) 0);
                }
                break;
            case 61520961:
                if (str.equals("el-t-k0-windows-el319")) {
                    return new st5((byte) 13, (char) 0);
                }
                break;
            case 66055398:
                if (str.equals("my-t-k0-osx")) {
                    return new bu5((byte) 18, 0);
                }
                break;
            case 89437242:
                if (str.equals("en-AU-t-k0-osx")) {
                    return new st5((byte) 14, (char) 0);
                }
                break;
            case 96180405:
                if (str.equals("he-t-k0-osx")) {
                    return new vt5((byte) 21, 0);
                }
                break;
            case 112118817:
                if (str.equals("kk-t-k0-windows")) {
                    return new yt5((byte) 6);
                }
                break;
            case 149249647:
                if (str.equals("ps-t-k0-osx")) {
                    return new du5((byte) 14, 0);
                }
                break;
            case 181169847:
                if (str.equals("fa-t-k0-osx")) {
                    return new ut5((byte) 13, (char) 0);
                }
                break;
            case 188167287:
                if (str.equals("fr-BE-t-k0-windows-var")) {
                    return new ut5((byte) 27, false, false);
                }
                break;
            case 189673378:
                if (str.equals("ba-t-k0-windows")) {
                    return new xi2((byte) 14, (char) 0);
                }
                break;
            case 209348400:
                if (str.equals("bn-t-k0-windows-qwerty")) {
                    return new xi2((byte) 29, false, false);
                }
                break;
            case 263383689:
                if (str.equals("si-t-k0-osx-qwerty")) {
                    return new eu5((byte) 10);
                }
                break;
            case 267563664:
                if (str.equals("pl-t-k0-osx-extended")) {
                    return new du5((byte) 11);
                }
                break;
            case 287920355:
                if (str.equals("de-BE-t-k0-osx")) {
                    return new pt5((byte) 21, 0);
                }
                break;
            case 298748651:
                if (str.equals("si-t-k0-windows")) {
                    return new eu5((byte) 11);
                }
                break;
            case 315640940:
                if (str.equals("mn-Mong-t-k0-windows-extended")) {
                    return new bu5((byte) 10);
                }
                break;
            case 320303222:
                if (str.equals("ru-t-k0-osx-qwerty")) {
                    return new du5((byte) 29, false, false);
                }
                break;
            case 322818917:
                if (str.equals("bo-t-k0-osx")) {
                    return new pt5((byte) 0);
                }
                break;
            case 325702244:
                if (str.equals("ar-t-k0-osx-qwerty")) {
                    return new xi2((byte) 3);
                }
                break;
            case 343812962:
                if (str.equals("en-GB-t-k0-windows")) {
                    return new st5((byte) 18, (char) 0);
                }
                break;
            case 344368981:
                if (str.equals("my-t-k0-windows")) {
                    return new bu5((byte) 19, 0);
                }
                break;
            case 351270382:
                if (str.equals("ga-t-k0-osx-extended")) {
                    return new vt5((byte) 10);
                }
                break;
            case 353493047:
                if (str.equals("lv-t-k0-windows")) {
                    return new yt5((byte) 27, false, false);
                }
                break;
            case 363231210:
                if (str.equals("th-t-k0-windows-patta-var")) {
                    return new gu5((byte) 12);
                }
                break;
            case 369855813:
                if (str.equals("pt-PT-t-k0-osx")) {
                    return new du5((byte) 16, 0);
                }
                break;
            case 406614543:
                if (str.equals("he-t-k0-osx-var")) {
                    return new vt5((byte) 23, 0);
                }
                break;
            case 425804624:
                if (str.equals("en-CA-t-k0-osx")) {
                    return new st5((byte) 15, (char) 0);
                }
                break;
            case 428957401:
                if (str.equals("sl-t-k0-osx")) {
                    return new eu5((byte) 17, (char) 0);
                }
                break;
            case 434389995:
                if (str.equals("ka-t-k0-windows-legacy")) {
                    return new xt5((byte) 29, false, false);
                }
                break;
            case 439602967:
                if (str.equals("ru-t-k0-osx-extended")) {
                    return new du5((byte) 28, false, false);
                }
                break;
            case 445976966:
                if (str.equals("hu-t-k0-windows-101key")) {
                    return new xt5((byte) 5);
                }
                break;
            case 457287215:
                if (str.equals("ru-t-k0-osx")) {
                    return new du5((byte) 27, false, false);
                }
                break;
            case 460877601:
                if (str.equals("hy-t-k0-osx")) {
                    return new xt5((byte) 8);
                }
                break;
            case 461358939:
                if (str.equals("ar-t-k0-osx-var")) {
                    return new xi2((byte) 5);
                }
                break;
            case 473746971:
                if (str.equals("uk-t-k0-windows-extended")) {
                    return new ju5((byte) 1);
                }
                break;
            case 500167776:
                if (str.equals("el-POLYTON-t-k0-windows")) {
                    return new st5((byte) 9);
                }
                break;
            case 519332422:
                if (str.equals("bn-t-k0-osx")) {
                    return new xi2((byte) 25, (char) 0);
                }
                break;
            case 526436782:
                if (str.equals("vi-t-k0-windows")) {
                    return new ju5((byte) 7);
                }
                break;
            case 540122881:
                if (str.equals("tt-t-k0-windows")) {
                    return new gu5((byte) 23, 0);
                }
                break;
            case 546885749:
                if (str.equals("got-t-k0-windows")) {
                    return new vt5((byte) 14, 0);
                }
                break;
            case 549246947:
                if (str.equals("sq-t-k0-windows")) {
                    return new eu5((byte) 20, (char) 0);
                }
                break;
            case 582009872:
                if (str.equals("th-t-k0-windows-patta")) {
                    return new gu5((byte) 11);
                }
                break;
            case 594116410:
                if (str.equals("ka-t-k0-windows-qwerty")) {
                    return new yt5((byte) 1);
                }
                break;
            case 594867277:
                if (str.equals("nb-t-k0-windows")) {
                    return new bu5((byte) 23, 0);
                }
                break;
            case 616715243:
                if (str.equals("iu-t-k0-osx-nutaaq")) {
                    return new xt5((byte) 20, (char) 0);
                }
                break;
            case 625470906:
                if (str.equals("sk-t-k0-osx")) {
                    return new eu5((byte) 13, (char) 0);
                }
                break;
            case 631363541:
                if (str.equals("iu-t-k0-windows")) {
                    return new xt5((byte) 23, (char) 0);
                }
                break;
            case 645049640:
                if (str.equals("ha-t-k0-windows")) {
                    return new vt5((byte) 18, 0);
                }
                break;
            case 668525567:
                if (str.equals("it-t-k0-osx-extended")) {
                    return new xt5((byte) 16, (char) 0);
                }
                break;
            case 697817319:
                if (str.equals("th-t-k0-windows-var")) {
                    return new gu5((byte) 13, 0);
                }
                break;
            case 700771159:
                if (str.equals("pt-t-k0-windows-var")) {
                    return new du5((byte) 21, 0);
                }
                break;
            case 704019807:
                if (str.equals("iu-t-k0-osx-qwerty")) {
                    return new xt5((byte) 21, (char) 0);
                }
                break;
            case 719578426:
                if (str.equals("mn-Mong-t-k0-windows")) {
                    return new bu5((byte) 9);
                }
                break;
            case 727277944:
                if (str.equals("dsb-t-k0-windows-extended")) {
                    return new pt5((byte) 29, false, false);
                }
                break;
            case 778310959:
                if (str.equals("ru-t-k0-windows-phonetic")) {
                    return new eu5((byte) 2);
                }
                break;
            case 795183210:
                if (str.equals("tk-t-k0-windows")) {
                    return new gu5((byte) 14, 0);
                }
                break;
            case 823779604:
                if (str.equals("nl-t-k0-osx")) {
                    return new du5((byte) 0);
                }
                break;
            case 855699804:
                if (str.equals("cy-t-k0-osx")) {
                    return new pt5((byte) 17, 0);
                }
                break;
            case 856290279:
                if (str.equals("sah-t-k0-windows")) {
                    return new eu5((byte) 3);
                }
                break;
            case 872737771:
                if (str.equals("ka-t-k0-windows")) {
                    return new xt5((byte) 28, false, false);
                }
                break;
            case 886143591:
                if (str.equals("man-t-k0-windows")) {
                    return new bu5((byte) 0);
                }
                break;
            case 895547936:
                if (str.equals("hi-t-k0-windows")) {
                    return new vt5((byte) 28, false, false);
                }
                break;
            case 939996232:
                if (str.equals("nb-t-k0-osx-extended")) {
                    return new bu5((byte) 21, 0);
                }
                break;
            case 953680778:
                if (str.equals("bg-Latn-t-k0-windows")) {
                    return new xi2((byte) 17, (char) 0);
                }
                break;
            case 985181166:
                if (str.equals("en-t-k0-windows-extended")) {
                    return new ut5((byte) 3);
                }
                break;
            case 1018057764:
                if (str.equals("pa-t-k0-osx-qwerty")) {
                    return new du5((byte) 8);
                }
                break;
            case 1018497916:
                if (str.equals("si-t-k0-osx")) {
                    return new eu5((byte) 9);
                }
                break;
            case 1048622923:
                if (str.equals("mt-t-k0-osx")) {
                    return new bu5((byte) 15, 0);
                }
                break;
            case 1083943951:
                if (str.equals("nl-BE-t-k0-windows")) {
                    return new bu5((byte) 28, false, false);
                }
                break;
            case 1087363124:
                if (str.equals("haw-t-k0-osx")) {
                    return new vt5((byte) 19, 0);
                }
                break;
            case 1132359636:
                if (str.equals("tmh-t-k0-windows-extended")) {
                    return new gu5((byte) 16, 0);
                }
                break;
            case 1135407558:
                if (str.equals("fr-t-k0-osx")) {
                    return new vt5((byte) 4);
                }
                break;
            case 1136922166:
                if (str.equals("it-t-k0-windows")) {
                    return new xt5((byte) 17, (char) 0);
                }
                break;
            case 1147019834:
                if (str.equals("tzm-t-k0-windows")) {
                    return new gu5((byte) 25, false, false);
                }
                break;
            case 1155170298:
                if (str.equals("gn-t-k0-windows")) {
                    return new vt5((byte) 13, 0);
                }
                break;
            case 1158713925:
                if (str.equals("ka-t-k0-windows-legacy-var")) {
                    return new yt5((byte) 0);
                }
                break;
            case 1177980463:
                if (str.equals("dv-t-k0-windows")) {
                    return new st5((byte) 1);
                }
                break;
            case 1182542496:
                if (str.equals("de-t-k0-windows")) {
                    return new rt5();
                }
                break;
            case 1187104529:
                if (str.equals("cs-t-k0-windows")) {
                    return new pt5((byte) 14, 0);
                }
                break;
            case 1193446153:
                if (str.equals("ar-t-k0-windows-102key")) {
                    return new xi2((byte) 7);
                }
                break;
            case 1211466897:
                if (str.equals("ro-t-k0-osx-extended")) {
                    return new du5((byte) 23, 0);
                }
                break;
            case 1236179575:
                if (str.equals("nso-t-k0-windows")) {
                    return new du5((byte) 3);
                }
                break;
            case 1245136428:
                if (str.equals("ms-t-k0-osx")) {
                    return new bu5((byte) 14, 0);
                }
                break;
            case 1246931621:
                if (str.equals("hu-t-k0-osx")) {
                    return new xt5((byte) 2);
                }
                break;
            case 1256508626:
                if (str.equals("tmh-t-k0-windows")) {
                    return new gu5((byte) 15, 0);
                }
                break;
            case 1314427934:
                if (str.equals("ru-t-k0-windows")) {
                    return new eu5((byte) 0);
                }
                break;
            case 1320034607:
                if (str.equals("iu-t-k0-windows-var")) {
                    return new xt5((byte) 24, false, false);
                }
                break;
            case 1326535484:
                if (str.equals("uk-t-k0-osx")) {
                    return new gu5((byte) 29, false, false);
                }
                break;
            case 1346908924:
                if (str.equals("khb-t-k0-windows")) {
                    return new yt5((byte) 4);
                }
                break;
            case 1358857858:
                if (str.equals("ro-t-k0-windows-extended")) {
                    return new du5((byte) 25, false, false);
                }
                break;
            case 1363903175:
                if (str.equals("ckb-t-k0-windows")) {
                    return new pt5((byte) 11);
                }
                break;
            case 1364610297:
                if (str.equals("lt-t-k0-windows")) {
                    return new yt5((byte) 23, (char) 0);
                }
                break;
            case 1396544528:
                if (str.equals("hy-t-k0-windows")) {
                    return new xt5((byte) 9);
                }
                break;
            case 1415267880:
                if (str.equals("sv-t-k0-windows-extended")) {
                    return new gu5((byte) 0);
                }
                break;
            case 1443556296:
                if (str.equals("dsb-t-k0-windows-legacy")) {
                    return new st5((byte) 0);
                }
                break;
            case 1451288924:
                if (str.equals("bg-t-k0-windows")) {
                    return new xi2((byte) 20, (char) 0);
                }
                break;
            case 1516717996:
                if (str.equals("de-BE-t-k0-windows-var")) {
                    return new pt5((byte) 23, 0);
                }
                break;
            case 1521377864:
                if (str.equals("el-Latn-t-k0-windows-el220")) {
                    return new st5((byte) 6);
                }
                break;
            case 1521378803:
                if (str.equals("el-Latn-t-k0-windows-el319")) {
                    return new st5((byte) 7);
                }
                break;
            case 1522973488:
                if (str.equals("he-t-k0-osx-qwerty")) {
                    return new vt5((byte) 22, 0);
                }
                break;
            case 1524844182:
                if (str.equals("pl-t-k0-osx")) {
                    return new du5((byte) 10);
                }
                break;
            case 1526639375:
                if (str.equals("kn-t-k0-osx")) {
                    return new yt5((byte) 11);
                }
                break;
            case 1530229761:
                if (str.equals("ar-t-k0-osx")) {
                    return new xi2((byte) 1);
                }
                break;
            case 1537160535:
                if (str.equals("en-t-k0-osx-extended-var")) {
                    return new st5((byte) 28, false, false);
                }
                break;
            case 1537260429:
                if (str.equals("bug-t-k0-windows")) {
                    return new pt5((byte) 5);
                }
                break;
            case 1551240131:
                if (str.equals("tr-t-k0-windows")) {
                    return new gu5((byte) 21, 0);
                }
                break;
            case 1551300661:
                if (str.equals("sr-Latn-t-k0-osx")) {
                    return new eu5((byte) 21, (char) 0);
                }
                break;
            case 1555802164:
                if (str.equals("ta-t-k0-windows")) {
                    return new gu5((byte) 3);
                }
                break;
            case 1572375536:
                if (str.equals("de-CH-t-k0-windows")) {
                    return new pt5((byte) 25, false, false);
                }
                break;
            case 1581499602:
                if (str.equals("de-BE-t-k0-windows")) {
                    return new pt5((byte) 22, 0);
                }
                break;
            case 1582845293:
                if (str.equals("bg-t-k0-windows-qwerty-legacy")) {
                    return new xi2((byte) 23, (char) 0);
                }
                break;
            case 1587180376:
                if (str.equals("en-IN-t-k0-windows")) {
                    return new st5((byte) 20, (char) 0);
                }
                break;
            case 1610546560:
                if (str.equals("mn-t-k0-windows")) {
                    return new bu5((byte) 12);
                }
                break;
            case 1622092408:
                if (str.equals("bg-t-k0-osx-qwerty")) {
                    return new xi2((byte) 19, (char) 0);
                }
                break;
            case 1624232659:
                if (str.equals("ky-t-k0-windows")) {
                    return new yt5((byte) 16, (char) 0);
                }
                break;
            case 1631420275:
                if (str.equals("en-GB-t-k0-osx")) {
                    return new st5((byte) 16, (char) 0);
                }
                break;
            case 1633356725:
                if (str.equals("jv-t-k0-windows")) {
                    return new xt5((byte) 26, false, false);
                }
                break;
            case 1636368245:
                if (str.equals("ro-t-k0-osx")) {
                    return new du5((byte) 22, 0);
                }
                break;
            case 1637211636:
                if (str.equals("chr-t-k0-windows")) {
                    return new pt5((byte) 8);
                }
                break;
            case 1639975127:
                if (str.equals("mn-Phag-t-k0-windows")) {
                    return new bu5((byte) 11);
                }
                break;
            case 1642480791:
                if (str.equals("is-t-k0-windows")) {
                    return new xt5((byte) 14, (char) 0);
                }
                break;
            case 1645699611:
                if (str.equals("lis-t-k0-windows-extended")) {
                    return new yt5((byte) 20, (char) 0);
                }
                break;
            case 1666006732:
                if (str.equals("fr-CH-t-k0-osx")) {
                    return new vt5((byte) 2);
                }
                break;
            case 1701092160:
                if (str.equals("hu-t-k0-osx-qwerty")) {
                    return new xt5((byte) 3);
                }
                break;
            case 1701787220:
                if (str.equals("bo-t-k0-windows")) {
                    return new pt5((byte) 2);
                }
                break;
            case 1715812306:
                if (str.equals("ml-t-k0-osx-qwerty")) {
                    return new bu5((byte) 7);
                }
                break;
            case 1723152880:
                if (str.equals("km-t-k0-osx")) {
                    return new yt5((byte) 8);
                }
                break;
            case 1724948073:
                if (str.equals("fo-t-k0-osx")) {
                    return new ut5((byte) 23, (char) 0);
                }
                break;
            case 1730759429:
                if (str.equals("chr-t-k0-osx")) {
                    return new pt5((byte) 6);
                }
                break;
            case 1732228321:
                if (str.equals("th-t-k0-osx-patta")) {
                    return new gu5((byte) 9);
                }
                break;
            case 1747892308:
                if (str.equals("tr-t-k0-osx")) {
                    return new gu5((byte) 18, 0);
                }
                break;
            case 1768447648:
                if (str.equals("nl-BE-t-k0-osx")) {
                    return new bu5((byte) 27, false, false);
                }
                break;
            case 1804551936:
                if (str.equals("se-t-k0-osx")) {
                    return new eu5((byte) 7);
                }
                break;
            case 1830618525:
                if (str.equals("az-Cyrl-t-k0-windows")) {
                    return new xi2((byte) 10);
                }
                break;
            case 1836472136:
                if (str.equals("hr-t-k0-osx")) {
                    return new xt5((byte) 0);
                }
                break;
            case 1874730955:
                if (str.equals("lb-t-k0-windows")) {
                    return new yt5((byte) 18, (char) 0);
                }
                break;
            case 1884315151:
                if (str.equals("lv-t-k0-windows-extended")) {
                    return new yt5((byte) 28, false, false);
                }
                break;
            case 1888004372:
                if (str.equals("fr-CA-t-k0-windows-legacy")) {
                    return new vt5((byte) 0);
                }
                break;
            case 1894347556:
                if (str.equals("sr-Latn-t-k0-windows")) {
                    return new eu5((byte) 22, (char) 0);
                }
                break;
            case 1894926957:
                if (str.equals("bg-t-k0-osx")) {
                    return new xi2((byte) 18, (char) 0);
                }
                break;
            case 1898993538:
                if (str.equals("en-t-k0-osx-dvorak-qwerty")) {
                    return new st5((byte) 24, false, false);
                }
                break;
            case 1911227219:
                if (str.equals("gu-t-k0-windows")) {
                    return new vt5((byte) 17, 0);
                }
                break;
            case 1915789252:
                if (str.equals("gd-t-k0-windows")) {
                    return new vt5((byte) 12);
                }
                break;
            case 1916105344:
                if (str.equals("fa-t-k0-windows-extended")) {
                    return new ut5((byte) 17, (char) 0);
                }
                break;
            case 1917176373:
                if (str.equals("syr-t-k0-windows")) {
                    return new gu5((byte) 1);
                }
                break;
            case 1920351285:
                if (str.equals("fr-t-k0-windows")) {
                    return new vt5((byte) 7);
                }
                break;
            case 1924913318:
                if (str.equals("fa-t-k0-windows")) {
                    return new ut5((byte) 16, (char) 0);
                }
                break;
            case 1959284007:
                if (str.equals("dv-t-k0-windows-legacy")) {
                    return new st5((byte) 2);
                }
                break;
            case 1963786292:
                if (str.equals("pt-PT-t-k0-windows")) {
                    return new du5((byte) 17, 0);
                }
                break;
            case 1967247249:
                if (str.equals("sv-t-k0-osx-extended-var")) {
                    return new eu5((byte) 28, false, false);
                }
                break;
            case 2011810642:
                if (str.equals("ro-t-k0-windows-legacy")) {
                    return new du5((byte) 26, false, false);
                }
                break;
            case 2015740459:
                if (str.equals("yo-t-k0-windows")) {
                    return new ju5((byte) 9);
                }
                break;
            case 2034780834:
                if (str.equals("cs-t-k0-osx")) {
                    return new pt5((byte) 12);
                }
                break;
            case 2050852987:
                if (str.equals("fa-AF-t-k0-osx")) {
                    return new ut5((byte) 12, (char) 0);
                }
                break;
            case 2053545217:
                if (str.equals("pl-t-k0-windows-extended")) {
                    return new du5((byte) 13, 0);
                }
                break;
            case 2101723288:
                if (str.equals("pt-t-k0-osx-extended")) {
                    return new du5((byte) 19, 0);
                }
                break;
            case 2112589504:
                if (str.equals("ug-t-k0-osx")) {
                    return new gu5((byte) 26, false, false);
                }
                break;
            case 2116179890:
                if (str.equals("kk-t-k0-osx")) {
                    return new yt5((byte) 5);
                }
                break;
            case 2121609110:
                if (str.equals("kn-t-k0-osx-qwerty")) {
                    return new yt5((byte) 12, (char) 0);
                }
                break;
            case 2127612365:
                if (str.equals("en-GB-t-k0-osx-var")) {
                    return new st5((byte) 17, (char) 0);
                }
                break;
            case 2132469117:
                if (str.equals("hy-t-k0-windows-phonetic")) {
                    return new xt5((byte) 11);
                }
                break;
            case 2142714511:
                if (str.equals("or-t-k0-osx")) {
                    return new du5((byte) 4);
                }
                break;
        }
        return new st5((byte) 29, false, false);
    }

    public static final String r(Context context) {
        Object obj;
        hm2 hm2Var;
        String str;
        context.getClass();
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        Object next = null;
        String string = sharedPreferences.getString("keyboard_layout", null);
        if (string != null) {
            return y(string);
        }
        int i = 0;
        Locale localeY = jz5.y(context).y(0);
        if (localeY == null) {
            return "en-t-k0-windows";
        }
        hm2[] hm2VarArr = (hm2[]) g.getValue();
        ArrayList arrayList = new ArrayList();
        for (hm2 hm2Var2 : hm2VarArr) {
            if (yf2.p(hm2Var2.g, localeY.getLanguage()) && tx4.Q(hm2Var2.r, "windows", false)) {
                arrayList.add(hm2Var2);
            }
        }
        if (yf2.p(localeY.getLanguage(), "ko")) {
            int size = arrayList.size();
            do {
                if (i >= size) {
                    l0.s("Collection contains no element matching the predicate.");
                    return null;
                }
                Object obj2 = arrayList.get(i);
                i++;
                hm2Var = (hm2) obj2;
            } while (!yf2.p(hm2Var.r, "ko-t-k0-windows-dubeolsik"));
        } else if (yf2.p(localeY.getLanguage(), "pl")) {
            int size2 = arrayList.size();
            do {
                if (i >= size2) {
                    l0.s("Collection contains no element matching the predicate.");
                    return null;
                }
                Object obj3 = arrayList.get(i);
                i++;
                hm2Var = (hm2) obj3;
            } while (!yf2.p(hm2Var.r, "pl-t-k0-windows-extended"));
        } else {
            List listD = pw5.d(localeY.getCountry(), localeY.getScript());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : listD) {
                String str2 = (String) obj4;
                str2.getClass();
                if (str2.length() > 0) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList(dj0.Y(arrayList2, 10));
            int size3 = arrayList2.size();
            int i2 = 0;
            while (i2 < size3) {
                Object obj5 = arrayList2.get(i2);
                i2++;
                String str3 = (String) obj5;
                ArrayList arrayList4 = new ArrayList();
                int size4 = arrayList.size();
                int i3 = 0;
                while (i3 < size4) {
                    Object obj6 = arrayList.get(i3);
                    i3++;
                    if (ay4.P(((hm2) obj6).r, localeY.getLanguage() + "-" + str3 + "-", true)) {
                        arrayList4.add(obj6);
                    }
                }
                arrayList3.add(arrayList4);
            }
            int size5 = arrayList3.size();
            do {
                if (i >= size5) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i);
                i++;
            } while (((List) obj).isEmpty());
            List list = (List) obj;
            List list2 = arrayList;
            if (list != null) {
                list2 = list;
            }
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int length = ((hm2) next).r.length();
                    do {
                        Object next2 = it.next();
                        int length2 = ((hm2) next2).r.length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            hm2Var = (hm2) next;
        }
        return (hm2Var == null || (str = hm2Var.r) == null) ? "en-t-k0-windows" : str;
    }

    public static final Set v(db3 db3Var, Context context) {
        db3Var.getClass();
        context.getClass();
        Set set = (Set) db3Var.r(yl4.g);
        if (set != null) {
            return set;
        }
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        Set setJ0 = null;
        Set<String> stringSet = sharedPreferences.getStringSet("keyboard_layout_selection", null);
        if (stringSet != null) {
            Set<String> set2 = stringSet;
            ArrayList arrayList = new ArrayList(dj0.Y(set2, 10));
            for (String str : set2) {
                str.getClass();
                arrayList.add(y(str));
            }
            setJ0 = cj0.J0(arrayList);
        }
        return setJ0 == null ? js2.h(g(db3Var, context)) : setJ0;
    }

    public static final String y(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2104526122:
                return !str.equals("azerbaijani") ? "en-t-k0-windows" : "az-t-k0-windows-extended";
            case -2067299335:
                return !str.equals("spanish_latin") ? "en-t-k0-windows" : "es-419-t-k0-windows";
            case -2011831052:
                return !str.equals("spanish") ? "en-t-k0-windows" : "es-t-k0-windows";
            case -1954201007:
                return !str.equals("estonian") ? "en-t-k0-windows" : "et-t-k0-windows";
            case -1808030821:
                return !str.equals("swedish") ? "en-t-k0-windows" : "sv-t-k0-windows";
            case -1770216797:
                return !str.equals("russian_mac") ? "en-t-k0-windows" : "ru-t-k0-windows";
            case -1731128688:
                return !str.equals("icelandic") ? "en-t-k0-windows" : "is-t-k0-windows";
            case -1409670996:
                return !str.equals("arabic") ? "en-t-k0-windows" : "ar-t-k0-windows-102key";
            case -1339089075:
                return !str.equals("danish") ? "en-t-k0-windows" : "da-t-k0-windows";
            case -1266394726:
                return !str.equals("french") ? "en-t-k0-windows" : "fr-t-k0-windows";
            case -1249385082:
                return !str.equals("german") ? "en-t-k0-windows" : "de-t-k0-windows";
            case -1221227649:
                return !str.equals("hebrew") ? "en-t-k0-windows" : "he-t-k0-windows-extended";
            case -1217326391:
                return !str.equals("croatian_and_slovenian") ? "en-t-k0-windows" : "sl-t-k0-windows";
            case -1125640956:
                return !str.equals("korean") ? "en-t-k0-windows" : "ko-t-k0-windows-dubeolsik";
            case -982669551:
                return !str.equals("polish") ? "en-t-k0-windows" : "pl-t-k0-windows";
            case -965571132:
                return !str.equals("turkish") ? "en-t-k0-windows" : "tr-t-k0-windows";
            case -899451350:
                return !str.equals("slovak") ? "en-t-k0-windows" : "sk-t-k0-windows";
            case -852875301:
                return !str.equals("finnish") ? "en-t-k0-windows" : "fi-t-k0-windows";
            case -797182285:
                return !str.equals("thai_kedmanee") ? "en-t-k0-windows" : "th-t-k0-windows";
            case -678447200:
                return !str.equals("persian") ? "en-t-k0-windows" : "fa-t-k0-windows-extended";
            case -438404246:
                return !str.equals("brazilian") ? "en-t-k0-windows" : "pt-t-k0-windows-var";
            case -322075963:
                return !str.equals("english_uk") ? "en-t-k0-windows" : "en-GB-t-k0-windows";
            case -322075955:
                str2 = "english_us";
                break;
            case -224495464:
                return !str.equals("belgian") ? "en-t-k0-windows" : "fr-BE-t-k0-windows";
            case -172459741:
                return !str.equals("french_ca") ? "en-t-k0-windows" : "fr-CA-t-k0-windows-var";
            case 95163315:
                return !str.equals("czech") ? "en-t-k0-windows" : "cs-t-k0-windows";
            case 98619136:
                return !str.equals("greek") ? "en-t-k0-windows" : "el-t-k0-windows";
            case 270294240:
                str2 = "english_us_colemak";
                break;
            case 525617983:
                return !str.equals("vietnamese") ? "en-t-k0-windows" : "vi-t-k0-windows";
            case 526445166:
                return !str.equals("norwegian") ? "en-t-k0-windows" : "nb-t-k0-windows";
            case 636717247:
                return !str.equals("hungarian") ? "en-t-k0-windows" : "hu-t-k0-windows";
            case 837788213:
                return !str.equals("portuguese") ? "en-t-k0-windows" : "pt-PT-t-k0-windows";
            case 846218551:
                str2 = "english_us_workman";
                break;
            case 854508312:
                return !str.equals("latvian_qwerty") ? "en-t-k0-windows" : "lv-t-k0-windows-qwerty";
            case 1003431845:
                return !str.equals("lithuanian") ? "en-t-k0-windows" : "lt-t-k0-windows";
            case 1116502071:
                return !str.equals("bulgarian") ? "en-t-k0-windows" : "bg-t-k0-windows";
            case 1150375055:
                return !str.equals("english_us_intl") ? "en-t-k0-windows" : "en-t-k0-windows-extended";
            case 1555550099:
                return !str.equals("russian") ? "en-t-k0-windows" : "ru-t-k0-windows";
            case 1567935121:
                return !str.equals("english_us_dvorak") ? "en-t-k0-windows" : "en-t-k0-windows-dvorak";
            case 1751920364:
                return !str.equals("ukrainian") ? "en-t-k0-windows" : "uk-t-k0-windows";
            case 2014651252:
                return !str.equals("swiss_french") ? "en-t-k0-windows" : "fr-CH-t-k0-windows";
            case 2031660896:
                return !str.equals("swiss_german") ? "en-t-k0-windows" : "de-CH-t-k0-windows";
            case 2112490496:
                return !str.equals("italian") ? "en-t-k0-windows" : "it-t-k0-windows";
            default:
                return "en-t-k0-windows";
        }
        str.equals(str2);
        return "en-t-k0-windows";
    }
}
