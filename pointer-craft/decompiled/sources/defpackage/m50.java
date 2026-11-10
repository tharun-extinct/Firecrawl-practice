package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.RemoteViews;
import io.appground.blek.R;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class m50 {
    public static final float A = 80.0f;
    public static ha2 B = null;
    public static final float d = 12.0f;
    public static final float e = 20.0f;
    public static ha2 f = null;
    public static final float k = 16.0f;
    public static final nm0 n;
    public static ha2 o;
    public static final f73 q;
    public static final nm0 r;
    public static final te5 s;
    public static final te5 w;
    public static final nm0 x;
    public static final te5 z;
    public static final mu0[] g = new mu0[0];
    public static final nm0 y = new nm0(1300577350, false, new rm0(0));
    public static final nm0 v = new nm0(-454471275, false, new gg((byte) 20));
    public static final Object l = new Object();
    public static final float[] j = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] t = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final pf3 a = new pf3(true);
    public static final StackTraceElement[] m = new StackTraceElement[0];
    public static final te5 c = new te5(new qc5(3), new qc5(4));
    public static final te5 i = new te5(new qc5(5), new qc5(6));
    public static final te5 b = new te5(new qc5(7), new qc5(8));
    public static final te5 p = new te5(new qc5(11), new qc5(12));
    public static final te5 u = new te5(new qc5(13), new qc5(14));
    public static final te5 h = new te5(new qc5(17), new qc5(18));

    static {
        byte b2 = 9;
        r = new nm0(243229322, false, new hn0(b2));
        byte b3 = 19;
        n = new nm0(-1854833012, false, new gg(b3));
        byte b4 = 10;
        x = new nm0(1379170989, false, new hn0(b4));
        byte b5 = 15;
        q = new f73(b5);
        w = new te5(new qc5((byte) 2), new qc5(b3));
        s = new te5(new qc5(b2), new qc5(b4));
        z = new te5(new qc5(b5), new qc5((byte) 16));
    }

    public static final void A(Context context, RemoteViews remoteViews, k52 k52Var, int i2) {
        x91 x91Var = k52Var.g;
        int i3 = Build.VERSION.SDK_INT;
        t91 t91Var = t91.g;
        w91 w91Var = w91.g;
        if (i3 < 31) {
            if (pw5.d(w91Var, u91.g, t91Var).contains(ip2.v(x91Var, context))) {
                return;
            }
            t94.r(x91Var, " requires a complex layout before API 31", "Using a height of ");
        } else if (i3 >= 33 || !pw5.d(w91Var, t91Var).contains(x91Var)) {
            nq.v(remoteViews, i2, x91Var);
        }
    }

    public static final void B(Context context, RemoteViews remoteViews, go5 go5Var, int i2) {
        x91 x91Var = go5Var.g;
        int i3 = Build.VERSION.SDK_INT;
        t91 t91Var = t91.g;
        w91 w91Var = w91.g;
        if (i3 < 31) {
            if (pw5.d(w91Var, u91.g, t91Var).contains(ip2.v(x91Var, context))) {
                return;
            }
            t94.r(x91Var, " requires a complex layout before API 31", "Using a width of ");
        } else if (i3 >= 33 || !pw5.d(w91Var, t91Var).contains(x91Var)) {
            nq.x(remoteViews, i2, x91Var);
        }
    }

    public static final k44 D(bl2 bl2Var) {
        bl2 bl2VarM = bl2Var.m();
        return bl2VarM != null ? bl2VarM.H(bl2Var, true) : new k44(0.0f, 0.0f, (int) (bl2Var.L() >> 32), (int) (bl2Var.L() & 4294967295L));
    }

    public static final k44 E(bl2 bl2Var, boolean z2) {
        bl2 bl2VarK = K(bl2Var);
        float fL = (int) (bl2VarK.L() >> 32);
        float fL2 = (int) (bl2VarK.L() & 4294967295L);
        k44 k44VarH = bl2VarK.H(bl2Var, z2);
        float f2 = k44VarH.g;
        if (z2) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fL) {
                f2 = fL;
            }
        }
        float f3 = k44VarH.y;
        if (z2) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fL2) {
                f3 = fL2;
            }
        }
        float f4 = k44VarH.r;
        if (z2) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= fL) {
                fL = f4;
            }
            f4 = fL;
        }
        float f5 = k44VarH.n;
        if (z2) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= fL2) {
                fL2 = f6;
            }
            f5 = fL2;
        }
        if (f2 == f4 || f3 == f5) {
            return k44.v;
        }
        long jT = bl2VarK.t((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jT2 = bl2VarK.t((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jT3 = bl2VarK.t((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long jT4 = bl2VarK.t((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jT >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jT2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jT4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jT3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jT & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jT2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jT4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jT3 & 4294967295L));
        return new k44(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static j73 F(j73 j73Var, cz1 cz1Var) {
        return j73Var.n(new no0(cz1Var));
    }

    public static final File H(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final boolean I(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean J(long j2, long j3) {
        return j2 == j3;
    }

    public static final bl2 K(bl2 bl2Var) {
        bl2 bl2Var2;
        bl2 bl2VarM = bl2Var.m();
        while (true) {
            bl2 bl2Var3 = bl2VarM;
            bl2Var2 = bl2Var;
            bl2Var = bl2Var3;
            if (bl2Var == null) {
                break;
            }
            bl2VarM = bl2Var.m();
        }
        gh3 gh3Var = bl2Var2 instanceof gh3 ? (gh3) bl2Var2 : null;
        if (gh3Var == null) {
            return bl2Var2;
        }
        gh3 gh3Var2 = gh3Var.D;
        while (true) {
            gh3 gh3Var3 = gh3Var2;
            gh3 gh3Var4 = gh3Var;
            gh3Var = gh3Var3;
            if (gh3Var == null) {
                return gh3Var4;
            }
            gh3Var2 = gh3Var.D;
        }
    }

    public static final ha2 L() {
        ha2 ha2Var = o;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(19.0f, 13.0f);
        kq3Var.v(-6.0f);
        kq3Var.w(6.0f);
        kq3Var.v(-2.0f);
        kq3Var.w(-6.0f);
        kq3Var.n(5.0f);
        kq3Var.w(-2.0f);
        kq3Var.v(6.0f);
        kq3Var.q(5.0f);
        kq3Var.v(2.0f);
        kq3Var.w(6.0f);
        kq3Var.v(6.0f);
        kq3Var.w(2.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        o = ha2VarY;
        return ha2VarY;
    }

    public static final View M(i73 i73Var) {
        fl5 fl5Var = k33.V(i73Var.j).o;
        View interopView = fl5Var != null ? fl5Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        l0.z("Could not fetch interop view");
        return null;
    }

    public static final ha2 N() {
        ha2 ha2Var = B;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Fullscreen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(7.0f, 14.0f);
        kq3Var.x(5.0f, 14.0f);
        kq3Var.w(5.0f);
        kq3Var.v(5.0f);
        kq3Var.w(-2.0f);
        kq3Var.x(7.0f, 17.0f);
        kq3Var.w(-3.0f);
        kq3Var.g();
        kq3Var.j(5.0f, 10.0f);
        kq3Var.v(2.0f);
        kq3Var.x(7.0f, 7.0f);
        kq3Var.v(3.0f);
        kq3Var.x(10.0f, 5.0f);
        kq3Var.x(5.0f, 5.0f);
        kq3Var.w(5.0f);
        kq3Var.g();
        du4.e(kq3Var, 17.0f, 17.0f, -3.0f, 2.0f);
        kq3Var.v(5.0f);
        kq3Var.w(-5.0f);
        kq3Var.v(-2.0f);
        kq3Var.w(3.0f);
        kq3Var.g();
        kq3Var.j(14.0f, 5.0f);
        kq3Var.w(2.0f);
        kq3Var.v(3.0f);
        kq3Var.w(3.0f);
        kq3Var.v(2.0f);
        kq3Var.x(19.0f, 5.0f);
        kq3Var.v(-5.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        B = ha2VarY;
        return ha2VarY;
    }

    public static final Object O(db3 db3Var, rw3 rw3Var, Serializable serializable) {
        db3Var.getClass();
        rw3Var.getClass();
        Object objR = db3Var.r(rw3Var);
        return objR == null ? serializable : objR;
    }

    public static ac2 Q(nf1 nf1Var, int i2) {
        return new ac2(nf1Var, y64.j);
    }

    public static final boolean R(x91 x91Var) {
        if ((x91Var instanceof s91) || (x91Var instanceof v91)) {
            return true;
        }
        if (!yf2.p(x91Var, t91.g) && !yf2.p(x91Var, u91.g) && !yf2.p(x91Var, w91.g) && x91Var != null) {
            uo1.g();
        }
        return false;
    }

    public static final iv4 S(ox0 ox0Var, fx0 fx0Var, rx0 rx0Var, bz1 bz1Var) throws Throwable {
        fx0 fx0VarR = yf2.R(ox0Var, fx0Var);
        rx0Var.getClass();
        iv4 zs2Var = rx0Var == rx0.t ? new zs2(fx0VarR, bz1Var) : new iv4(fx0VarR, true);
        zs2Var.t0(rx0Var, zs2Var, bz1Var);
        return zs2Var;
    }

    public static iv4 T(ox0 ox0Var, fx0 fx0Var, bz1 bz1Var, int i2) {
        if ((i2 & 1) != 0) {
            fx0Var = ni1.j;
        }
        return S(ox0Var, fx0Var, (i2 & 2) != 0 ? rx0.j : rx0.m, bz1Var);
    }

    public static final j73 U(jq2 jq2Var, y22 y22Var, um3 um3Var) {
        return new fq2(jq2Var, y22Var, um3Var);
    }

    public static final j73 V(h02 h02Var, j73 j73Var) {
        if (j73Var.y(new l1((byte) 27))) {
            return j73Var;
        }
        h02Var.Y(1219399079);
        j73 j73Var2 = (j73) j73Var.g(new f(h02Var, (byte) 11), g73.g);
        h02Var.b(false);
        return j73Var2;
    }

    public static final j73 W(h02 h02Var, j73 j73Var) {
        h02Var.X(439770924);
        j73 j73VarV = V(h02Var, j73Var);
        h02Var.b(false);
        return j73VarV;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0216  */
    public static final long X(int i2, int i3, String str) {
        char cCharAt;
        int i4;
        long j2;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        char c4;
        int i10;
        int i11;
        int i12;
        int i13;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i14 = i4;
        long j5 = 0;
        while (true) {
            if (i14 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i15 = cCharAt - '0';
            if (((char) i15) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + ((long) i15);
            i14++;
            cCharAt = i14 < length ? str.charAt(i14) : (char) 0;
            j4 = j2;
        }
        int i16 = i14 - i4;
        char c5 = '0';
        if (i14 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i14;
            i6 = i5;
            i7 = 0;
        } else {
            int i17 = i14 + 1;
            c2 = ' ';
            i5 = i17;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i13 = i17;
                    break;
                }
                i13 = i17;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j6 = jCharAt - 13511005043687472L;
                int i18 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i18 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + ((long) i18);
                i5 += 4;
                i17 = i13;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i5 == i3) {
                        break loop2;
                    }
                    int i19 = cCharAt - '0';
                    if (((char) i19) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + ((long) i19);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i13 - i5;
            i16 -= i7;
            i6 = i13;
        }
        if (i16 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j2);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i12 = i7;
                    break;
                }
                int i20 = cCharAt5 - c5;
                i12 = i7;
                if (((char) i20) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i20;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i12;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i12 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i21 = 19;
        if (i16 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i22 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i21;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i16--;
                }
                i22++;
                cCharAt6 = i22 < length ? str.charAt(i22) : (char) 0;
                i21 = 19;
            }
            if (i16 > i10) {
                char cCharAt7 = str.charAt(i4);
                long j7 = 0;
                while (true) {
                    i11 = i4;
                    if (i4 == i14 || Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j7 = (j7 * 10) + ((long) (cCharAt7 - '0'));
                    i4 = i11 + 1;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                if (Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i7 = (i14 - i11) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i23 = i6;
                    while (i23 != i5 && Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j7 = (j7 * 10) + ((long) (cCharAt8 - '0'));
                        i23++;
                        cCharAt8 = i23 < length ? str.charAt(i23) : (char) 0;
                    }
                    i7 = (i6 - i23) + i9;
                }
                j3 = j7;
                c4 = c3;
            } else {
                j3 = j5;
                c4 = 0;
            }
        } else {
            j3 = j5;
            c4 = 0;
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compare(j3 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
            float f2 = j3;
            float[] fArr = j;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z2) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j2);
        }
        if (j3 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z2 ? -0.0f : 0.0f)) & j2);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long jG = uf5.g(t, i7 + 325);
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
        long j8 = j3 << iNumberOfLeadingZeros;
        long j9 = j8 & j2;
        long j10 = j8 >>> c2;
        long j11 = jG & j2;
        long j12 = jG >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j2)) >>> c2) + (j14 >>> c2);
        int i24 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i24 + 9);
        int i25 = iNumberOfLeadingZeros + (i24 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i25--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i25);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z2 ? Long.MIN_VALUE : 0L)))) & j2);
    }

    public static void Y(jd3 jd3Var, String str) {
        jd3Var.getClass();
        str.getClass();
        ad3 ad3VarJ = jd3Var.y.j();
        String str2 = ad3VarJ != null ? (String) ad3VarJ.t.v : null;
        if (yf2.p(str2, str)) {
            return;
        }
        jd3Var.n(str, new oz(str2, (byte) 7));
    }

    public static void Z(ed3 ed3Var, bf4 bf4Var, List list, List list2, jd3 jd3Var, nm0 nm0Var, int i2) {
        int i3 = i2 & 2;
        pi1 pi1Var = pi1.j;
        List list3 = i3 != 0 ? pi1Var : list;
        List list4 = (i2 & 8) != 0 ? null : list2;
        ed3Var.getClass();
        bf4Var.getClass();
        jd3Var.getClass();
        boolean zIsEmpty = list3.isEmpty();
        String strQ0 = bf4Var.g;
        if (!zIsEmpty) {
            strQ0 = cj0.q0(list3, "&", strQ0 + "?", null, new pc3((byte) 17), 28);
        }
        boolean z2 = bf4Var.v;
        xq2.j(ed3Var, strQ0, list3, pi1Var, z2 ? new pc3((byte) 10) : null, z2 ? new pc3((byte) 11) : null, new nm0(-1853401880, true, new z61(strQ0, bf4Var, list4, jd3Var, nm0Var)), 224);
    }

    public static final void a(qr0 qr0Var, h02 h02Var, int i2) {
        h02 h02Var2;
        qr0Var.getClass();
        h02Var.Z(-385541780);
        int i3 = (h02Var.j(qr0Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            h02Var2 = h02Var;
            ra.y((uk1) v13.l(qr0Var.E, null, h02Var, 48, 2).getValue(), 500L, ue5.m0(127594594, new qn((nf3) h02Var.a(nx2.g), qr0Var, (Context) h02Var.a(sa.y), b2), h02Var), h02Var2, 440, 0);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new f(qr0Var, i2, (byte) 5);
        }
    }

    public static zs4 a0() {
        return new zs4(0);
    }

    public static final void b(wm4 wm4Var, jd3 jd3Var, h02 h02Var, int i2) {
        int i3;
        jd3 jd3Var2;
        h02Var.Z(136514943);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? h02Var.x(wm4Var) : h02Var.j(wm4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(jd3Var) ? 32 : 16;
        }
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            tp3 tp3Var = wm4Var.c;
            Object obj = (String) tp3Var.getValue();
            if (obj == null) {
                h02Var.X(-417155163);
                h02Var.b(false);
                jd3Var2 = jd3Var;
            } else {
                h02Var.X(-417155162);
                boolean zJ = h02Var.j(jd3Var) | h02Var.x(obj) | h02Var.x(tp3Var);
                Object objK = h02Var.K();
                if (zJ || objK == oo0.g) {
                    jd3Var2 = jd3Var;
                    Object moVar = new mo(jd3Var2, obj, tp3Var, null, (byte) 0);
                    h02Var.i0(moVar);
                    objK = moVar;
                } else {
                    jd3Var2 = jd3Var;
                }
                k33.b((bz1) objK, h02Var, obj);
                h02Var.b(false);
            }
        } else {
            jd3Var2 = jd3Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk(b2, i2, wm4Var, jd3Var2);
        }
    }

    public static zu4 b0(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new zu4(f2, f3, obj);
    }

    public static final void c(my1 my1Var, j73 j73Var, cn4 cn4Var, long j2, long j3, nq1 nq1Var, nm0 nm0Var, h02 h02Var, int i2) {
        my1 my1Var2;
        int i3;
        cn4 cn4Var2;
        h02Var.Z(748201188);
        if ((i2 & 6) == 0) {
            my1Var2 = my1Var;
            i3 = (h02Var.j(my1Var2) ? 4 : 2) | i2;
        } else {
            my1Var2 = my1Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            cn4Var2 = cn4Var;
            i3 |= h02Var.x(cn4Var2) ? 256 : 128;
        } else {
            cn4Var2 = cn4Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.v(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= h02Var.v(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= h02Var.x(nq1Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= h02Var.x(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= h02Var.j(nm0Var) ? 8388608 : 4194304;
        }
        if (h02Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            h02Var.S();
            if ((i2 & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            int i4 = i3 << 9;
            i(my1Var2, of5.g(ue5.m, h02Var), pw5.l, j73Var, cn4Var2, j2, j3, nq1Var, nm0Var, h02Var, (i3 & 14) | 3456 | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i3 >> 21) & 14);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tq1(my1Var, j73Var, cn4Var, j2, j3, nq1Var, nm0Var, i2, (byte) 0);
        }
    }

    public static String c0(long j2) {
        if (I(j2, 12884901888L)) {
            return "Rgb";
        }
        if (I(j2, 12884901889L)) {
            return "Xyz";
        }
        if (I(j2, 12884901890L)) {
            return "Lab";
        }
        return I(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static void d(defpackage.us0 r40, defpackage.kv2 r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m50.d(us0, kv2, java.util.ArrayList, int):void");
    }

    public static String d0(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? du4.i("CornerRadius.circular(", et2.v(Float.intBitsToFloat(i2)), ")") : xi3.a("CornerRadius.elliptical(", et2.v(Float.intBitsToFloat(i2)), ", ", et2.v(Float.intBitsToFloat(i3)), ")");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0224  */
    /* JADX WARN: Code duplicated, block: B:102:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x023b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0247  */
    /* JADX WARN: Code duplicated, block: B:110:0x024e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0269  */
    /* JADX WARN: Code duplicated, block: B:116:0x026c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0271  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275  */
    /* JADX WARN: Code duplicated, block: B:123:0x027c  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0186  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:97:0x021c  */
    public static final void e(final ad5 ad5Var, final RemoteViews remoteViews, o22 o22Var, final kd2 kd2Var) {
        int i2;
        u54 u54Var;
        u54 u54Var2;
        u54 u54Var3;
        u54 u54Var4;
        e4 e4Var;
        x91 x91Var;
        xn3 xn3Var;
        int i3;
        Object obj;
        zi1 zi1Var;
        bj4 bj4Var;
        int iOrdinal;
        Object obj2;
        List list;
        float fH;
        float fH2;
        boolean z2;
        float f2;
        final Context context = ad5Var.g;
        final u54 u54Var5 = new u54();
        final u54 u54Var6 = new u54();
        final u54 u54Var7 = new u54();
        final u54 u54Var8 = new u54();
        final u54 u54Var9 = new u54();
        u54Var9.j = xm5.j;
        final u54 u54Var10 = new u54();
        final u54 u54Var11 = new u54();
        final u54 u54Var12 = new u54();
        final u54 u54Var13 = new u54();
        o22Var.g(new bz1(u54Var5, u54Var6, context, remoteViews, kd2Var, u54Var7, u54Var9, u54Var8, ad5Var, u54Var12, u54Var11, u54Var13) { // from class: oq
            public final /* synthetic */ u54 a;
            public final /* synthetic */ u54 b;
            public final /* synthetic */ u54 c;
            public final /* synthetic */ u54 i;
            public final /* synthetic */ Context m;
            public final /* synthetic */ RemoteViews q;
            public final /* synthetic */ u54 s;
            public final /* synthetic */ u54 t;
            public final /* synthetic */ kd2 w;

            {
                this.i = u54Var8;
                this.b = u54Var11;
                this.s = u54Var13;
            }

            @Override // defpackage.bz1
            public final Object l(Object obj3, Object obj4) {
                xn3 xn3Var2;
                n22 n22Var = (n22) obj4;
                if (n22Var instanceof e4) {
                    u54 u54Var14 = this.j;
                    if (u54Var14.j != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    u54Var14.j = n22Var;
                } else if (n22Var instanceof go5) {
                    this.t.j = n22Var;
                } else if (n22Var instanceof k52) {
                    this.a.j = n22Var;
                } else if (n22Var instanceof ow) {
                    ow owVar = (ow) n22Var;
                    int i4 = this.w.g;
                    boolean z3 = owVar instanceof nw;
                    RemoteViews remoteViews2 = this.q;
                    if (z3) {
                        remoteViews2.setInt(i4, "setBackgroundResource", ((nw) owVar).g.g);
                    } else {
                        if (!(owVar instanceof mw)) {
                            uo1.g();
                            return null;
                        }
                        qj0 qj0Var = ((mw) owVar).g;
                        if (qj0Var instanceof np1) {
                            remoteViews2.setInt(i4, "setBackgroundColor", ra.U(((np1) qj0Var).g));
                        } else if (qj0Var instanceof o74) {
                            int i5 = ((o74) qj0Var).g;
                            if (Build.VERSION.SDK_INT >= 31) {
                                r64.n(remoteViews2, i4, "setBackgroundColor", i5);
                            } else {
                                remoteViews2.setInt(i4, "setBackgroundResource", i5);
                            }
                        } else if (!(qj0Var instanceof w01)) {
                            Log.w("GlanceAppWidget", "Unexpected background color modifier: " + qj0Var);
                        } else if (Build.VERSION.SDK_INT >= 31) {
                            w01 w01Var = (w01) qj0Var;
                            r64.x(remoteViews2, i4, "setBackgroundColor", ra.U(w01Var.g), ra.U(w01Var.y));
                        } else {
                            remoteViews2.setInt(i4, "setBackgroundColor", ra.U(((w01) qj0Var).g(this.m)));
                        }
                    }
                } else if (n22Var instanceof xn3) {
                    u54 u54Var15 = this.c;
                    xn3 xn3Var3 = (xn3) u54Var15.j;
                    if (xn3Var3 != null) {
                        xn3 xn3Var4 = (xn3) n22Var;
                        xn3Var2 = new xn3(xn3Var3.g.g(xn3Var4.g), xn3Var3.y.g(xn3Var4.y), xn3Var3.r.g(xn3Var4.r), xn3Var3.n.g(xn3Var4.n), xn3Var3.v.g(xn3Var4.v), xn3Var3.x.g(xn3Var4.x));
                    } else {
                        xn3Var2 = (xn3) n22Var;
                    }
                    u54Var15.j = xn3Var2;
                } else if (n22Var instanceof ax0) {
                    this.i.j = ((ax0) n22Var).g;
                } else if (!(n22Var instanceof jp) && !(n22Var instanceof c7)) {
                    if (n22Var instanceof zi1) {
                        this.b.j = n22Var;
                    } else if (n22Var instanceof bj4) {
                        this.s.j = n22Var;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + n22Var + "', nothing done.");
                    }
                }
                return og5.g;
            }
        }, og5.g);
        go5 go5Var = (go5) u54Var5.j;
        k52 k52Var = (k52) u54Var6.j;
        Context context2 = ad5Var.g;
        Map map = ip2.g;
        int i4 = kd2Var.y;
        int i5 = kd2Var.g;
        int i6 = 0;
        if (i4 != -1) {
            if (Build.VERSION.SDK_INT >= 31) {
                l0.z("There is currently no valid use case where a complex view is used on Android S");
                return;
            }
            x91 x91Var2 = go5Var != null ? go5Var.g : null;
            x91 x91Var3 = k52Var != null ? k52Var.g : null;
            if (R(x91Var2) || R(x91Var3)) {
                boolean z3 = (x91Var2 instanceof u91) || (x91Var2 instanceof t91);
                boolean z4 = (x91Var3 instanceof u91) || (x91Var3 instanceof t91);
                if (z3 && z4) {
                    i2 = R.layout.size_match_match;
                } else if (z3) {
                    i2 = R.layout.size_match_wrap;
                } else {
                    i2 = z4 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap;
                }
                int iS = v13.s(remoteViews, ad5Var, R.id.sizeViewStub, i2, null);
                boolean z5 = x91Var2 instanceof s91;
                w91 w91Var = w91.g;
                u54Var = u54Var9;
                u91 u91Var = u91.g;
                u54Var2 = u54Var13;
                t91 t91Var = t91.g;
                if (z5) {
                    u54Var4 = u54Var11;
                    u54Var3 = u54Var12;
                    remoteViews.setInt(iS, "setWidth", (int) TypedValue.applyDimension(1, ((s91) x91Var2).g, context2.getResources().getDisplayMetrics()));
                } else {
                    u54Var3 = u54Var12;
                    u54Var4 = u54Var11;
                    if (x91Var2 instanceof v91) {
                        remoteViews.setInt(iS, "setWidth", context2.getResources().getDimensionPixelSize(((v91) x91Var2).g));
                    } else if (!yf2.p(x91Var2, t91Var) && !yf2.p(x91Var2, u91Var) && !yf2.p(x91Var2, w91Var) && x91Var2 != null) {
                        uo1.g();
                        return;
                    }
                }
                if (x91Var3 instanceof s91) {
                    remoteViews.setInt(iS, "setHeight", (int) TypedValue.applyDimension(1, ((s91) x91Var3).g, context2.getResources().getDisplayMetrics()));
                } else if (x91Var3 instanceof v91) {
                    remoteViews.setInt(iS, "setHeight", context2.getResources().getDimensionPixelSize(((v91) x91Var3).g));
                } else if (!yf2.p(x91Var3, t91Var) && !yf2.p(x91Var3, u91Var) && !yf2.p(x91Var3, w91Var) && x91Var3 != null) {
                    uo1.g();
                    return;
                }
            }
            e4Var = (e4) u54Var10.j;
            if (e4Var != null) {
                tx5.g(ad5Var, remoteViews, e4Var.g, i5);
            }
            x91Var = (x91) u54Var8.j;
            if (x91Var != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    nq.y(remoteViews, i5, x91Var);
                } else {
                    Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                }
            }
            xn3Var = (xn3) u54Var7.j;
            if (xn3Var != null) {
                Resources resources = context.getResources();
                vn3 vn3Var = xn3Var.g;
                float fH3 = lr2.H(vn3Var.y, resources) + vn3Var.g;
                vn3 vn3Var2 = xn3Var.y;
                fH = lr2.H(vn3Var2.y, resources) + vn3Var2.g;
                vn3 vn3Var3 = xn3Var.r;
                float fH4 = lr2.H(vn3Var3.y, resources) + vn3Var3.g;
                vn3 vn3Var4 = xn3Var.n;
                float fH5 = lr2.H(vn3Var4.y, resources) + vn3Var4.g;
                vn3 vn3Var5 = xn3Var.v;
                fH2 = lr2.H(vn3Var5.y, resources) + vn3Var5.g;
                vn3 vn3Var6 = xn3Var.x;
                float fH6 = lr2.H(vn3Var6.y, resources) + vn3Var6.g;
                z2 = ad5Var.r;
                if (z2) {
                    f2 = fH2;
                } else {
                    f2 = fH;
                }
                float f3 = fH3 + f2;
                if (!z2) {
                    fH = fH2;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                i3 = 1;
                obj = null;
                remoteViews.setViewPadding(kd2Var.g, (int) TypedValue.applyDimension(1, f3, displayMetrics), (int) TypedValue.applyDimension(1, fH4, displayMetrics), (int) TypedValue.applyDimension(1, fH5 + fH, displayMetrics), (int) TypedValue.applyDimension(1, fH6, displayMetrics));
            } else {
                i3 = 1;
                obj = null;
            }
            if (u54Var3.j == null) {
                uo1.B();
                return;
            }
            zi1Var = (zi1) u54Var4.j;
            if (zi1Var != null) {
                remoteViews.setBoolean(i5, "setEnabled", zi1Var.g);
            }
            bj4Var = (bj4) u54Var2.j;
            if (bj4Var != null) {
                obj2 = bj4Var.g.g.get(q);
                if (obj2 == null) {
                    obj2 = obj;
                }
                list = (List) obj2;
                if (list != null) {
                    remoteViews.setContentDescription(i5, cj0.q0(list, null, null, null, null, 63));
                }
            }
            iOrdinal = ((xm5) u54Var.j).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != i3) {
                    i6 = 4;
                } else {
                    if (iOrdinal == 2) {
                        uo1.g();
                        return;
                    }
                    i6 = 8;
                }
            }
            remoteViews.setViewVisibility(i5, i6);
        }
        if (go5Var != null) {
            B(context2, remoteViews, go5Var, i5);
        }
        if (k52Var != null) {
            A(context2, remoteViews, k52Var, i5);
        }
        u54Var = u54Var9;
        u54Var3 = u54Var12;
        u54Var4 = u54Var11;
        u54Var2 = u54Var13;
        e4Var = (e4) u54Var10.j;
        if (e4Var != null) {
            tx5.g(ad5Var, remoteViews, e4Var.g, i5);
        }
        x91Var = (x91) u54Var8.j;
        if (x91Var != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                nq.y(remoteViews, i5, x91Var);
            } else {
                Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
            }
        }
        xn3Var = (xn3) u54Var7.j;
        if (xn3Var != null) {
            Resources resources2 = context.getResources();
            vn3 vn3Var7 = xn3Var.g;
            float fH7 = lr2.H(vn3Var7.y, resources2) + vn3Var7.g;
            vn3 vn3Var8 = xn3Var.y;
            fH = lr2.H(vn3Var8.y, resources2) + vn3Var8.g;
            vn3 vn3Var9 = xn3Var.r;
            float fH8 = lr2.H(vn3Var9.y, resources2) + vn3Var9.g;
            vn3 vn3Var10 = xn3Var.n;
            float fH9 = lr2.H(vn3Var10.y, resources2) + vn3Var10.g;
            vn3 vn3Var11 = xn3Var.v;
            fH2 = lr2.H(vn3Var11.y, resources2) + vn3Var11.g;
            vn3 vn3Var12 = xn3Var.x;
            float fH10 = lr2.H(vn3Var12.y, resources2) + vn3Var12.g;
            z2 = ad5Var.r;
            if (z2) {
                f2 = fH2;
            } else {
                f2 = fH;
            }
            float f4 = fH7 + f2;
            if (!z2) {
                fH = fH2;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            i3 = 1;
            obj = null;
            remoteViews.setViewPadding(kd2Var.g, (int) TypedValue.applyDimension(1, f4, displayMetrics2), (int) TypedValue.applyDimension(1, fH8, displayMetrics2), (int) TypedValue.applyDimension(1, fH9 + fH, displayMetrics2), (int) TypedValue.applyDimension(1, fH10, displayMetrics2));
        } else {
            i3 = 1;
            obj = null;
        }
        if (u54Var3.j == null) {
            uo1.B();
            return;
        }
        zi1Var = (zi1) u54Var4.j;
        if (zi1Var != null) {
            remoteViews.setBoolean(i5, "setEnabled", zi1Var.g);
        }
        bj4Var = (bj4) u54Var2.j;
        if (bj4Var != null) {
            obj2 = bj4Var.g.g.get(q);
            if (obj2 == null) {
                obj2 = obj;
            }
            list = (List) obj2;
            if (list != null) {
                remoteViews.setContentDescription(i5, cj0.q0(list, null, null, null, null, 63));
            }
        }
        iOrdinal = ((xm5) u54Var.j).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != i3) {
                i6 = 4;
            } else {
                if (iOrdinal == 2) {
                    uo1.g();
                    return;
                }
                i6 = 8;
            }
        }
        remoteViews.setViewVisibility(i5, i6);
    }

    public static qe5 e0(int i2, int i3, cg1 cg1Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            cg1Var = dg1.g;
        }
        return new qe5(i2, i3, cg1Var);
    }

    public static final void f(wm4 wm4Var, qr0 qr0Var, jd3 jd3Var, h02 h02Var, int i2) {
        int i3;
        jd3 jd3Var2;
        wm4 wm4Var2;
        boolean z2;
        byte b2;
        h02Var.Z(-275140224);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.x(e60.g) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? h02Var.x(wm4Var) : h02Var.j(wm4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? h02Var.x(qr0Var) : h02Var.j(qr0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            jd3Var2 = jd3Var;
            i3 |= h02Var.j(jd3Var2) ? 2048 : 1024;
        } else {
            jd3Var2 = jd3Var;
        }
        int i4 = i3;
        byte b3 = 1;
        if (h02Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            tp3 tp3Var = wm4Var.m;
            tp3 tp3Var2 = wm4Var.q;
            Object objK = h02Var.K();
            mu0 mu0Var = null;
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(null);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            Object[] objArr = new Object[0];
            Object objK2 = h02Var.K();
            byte b4 = 14;
            if (objK2 == l76Var) {
                objK2 = new y4(b4);
                h02Var.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) xq2.f(objArr, (my1) objK2, h02Var);
            nm3 nm3Var = (nm3) tp3Var2.getValue();
            boolean zX = h02Var.x(tp3Var2);
            Object objK3 = h02Var.K();
            if (zX || objK3 == l76Var) {
                objK3 = new ko(tp3Var2, ob3Var, mu0Var, b3);
                h02Var.i0(objK3);
            }
            k33.b((bz1) objK3, h02Var, nm3Var);
            if (((Boolean) tp3Var.getValue()).booleanValue()) {
                h02Var.X(-1904164669);
                st4 st4Var = wm4Var.t;
                tp3 tp3Var3 = wm4Var.a;
                xl4 xl4Var = (xl4) ob3Var2.getValue();
                if (!cj0.f0((List) tp3Var3.getValue(), xl4Var)) {
                    xl4Var = null;
                }
                if (xl4Var == null) {
                    xl4Var = (xl4) cj0.l0((List) tp3Var3.getValue());
                }
                tj2 tj2Var = (tj2) qr0Var.s.getValue();
                String str = tj2Var != null ? tj2Var.g.g : "";
                if (xl4Var != null) {
                    h02Var.X(-1903764118);
                    Object obj = (my1) h02Var.a(gp0.v);
                    boolean zX2 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && h02Var.j(wm4Var))) | h02Var.x(obj);
                    Object objK4 = h02Var.K();
                    if (zX2 || objK4 == l76Var) {
                        objK4 = new rg((Object) wm4Var, obj, (byte) 2);
                        h02Var.i0(objK4);
                    }
                    ho hoVar = new ho(xl4Var, ob3Var2, wm4Var, tp3Var, jd3Var2, st4Var, str, tp3Var3);
                    wm4Var2 = wm4Var;
                    m((my1) objK4, ue5.m0(-163608766, hoVar, h02Var), h02Var, 48);
                    z2 = false;
                    h02Var.b(false);
                } else {
                    wm4Var2 = wm4Var;
                    z2 = false;
                    h02Var.X(-1902357214);
                    h02Var.b(false);
                }
                h02Var.b(z2);
            } else {
                wm4Var2 = wm4Var;
                ob3Var = ob3Var;
                l76Var = l76Var;
                z2 = false;
                h02Var.X(-1902351262);
                h02Var.b(false);
            }
            if (((nm3) tp3Var2.getValue()) != null) {
                z2 = true;
            }
            boolean zX3 = h02Var.x(tp3Var2);
            Object objK5 = h02Var.K();
            if (zX3 || objK5 == l76Var) {
                b2 = 1;
                objK5 = new ln(tp3Var2, b2);
                h02Var.i0(objK5);
            } else {
                b2 = 1;
            }
            v70.n(z2, (my1) objK5, null, ue5.m0(1672574998, new qn(tp3Var2, wm4Var2, ob3Var, b2), h02Var), h02Var, (i4 & 14) | 24576);
        } else {
            wm4Var2 = wm4Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg((Object) wm4Var2, (Object) qr0Var, (Object) jd3Var, i2, (byte) 2);
        }
    }

    public static final Object f0(fx0 fx0Var, bz1 bz1Var, mu0 mu0Var) {
        Unsafe unsafe;
        long j2;
        fx0 fx0VarV = mu0Var.v();
        fx0 fx0VarB = !((Boolean) fx0Var.d(new on0((byte) 7), Boolean.FALSE)).booleanValue() ? fx0VarV.b(fx0Var) : yf2.E(fx0VarV, fx0Var, false);
        v70.s(fx0VarB);
        if (fx0VarB == fx0VarV) {
            re4 re4Var = new re4(mu0Var, fx0VarB);
            return lr2.G(re4Var, true, re4Var, bz1Var);
        }
        f73 f73Var = f73.t;
        if (yf2.p(fx0VarB.h(f73Var), fx0VarV.h(f73Var))) {
            gg5 gg5Var = new gg5(mu0Var, fx0VarB);
            fx0 fx0Var2 = gg5Var.m;
            Object objW = pw5.W(fx0Var2, null);
            try {
                return lr2.G(gg5Var, true, gg5Var, bz1Var);
            } finally {
                pw5.J(fx0Var2, objW);
            }
        }
        ja1 ja1Var = new ja1(mu0Var, fx0VarB);
        try {
            pw5.K(pw5.o(pw5.q(ja1Var, ja1Var, bz1Var)), og5.g);
            do {
                unsafe = qr.g;
                j2 = ja1.w;
                int intVolatile = unsafe.getIntVolatile(ja1Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        l0.z("Already suspended");
                        return null;
                    }
                    Object objV = gp4.V(ja1Var.Y());
                    if (objV instanceof hl0) {
                        throw ((hl0) objV).g;
                    }
                    return objV;
                }
            } while (!unsafe.compareAndSwapInt(ja1Var, j2, 0, 1));
            return px0.j;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof ha1) {
                th2 = ((ha1) th2).j;
            }
            ja1Var.j(new g84(th2));
            throw th2;
        }
    }

    public static final void g(jd3 jd3Var, wm4 wm4Var, final ik ikVar, h02 h02Var, int i2) {
        int i3;
        h02 h02Var2 = h02Var;
        h02Var2.Z(153199494);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (h02Var2.j(jd3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? h02Var2.x(wm4Var) : h02Var2.j(wm4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? h02Var2.x(ikVar) : h02Var2.j(ikVar) ? 256 : 128;
        }
        final byte b3 = 1;
        final byte b4 = 0;
        if (!h02Var2.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var2.Q();
        } else if (yf2.p(ikVar, ek.g)) {
            h02Var2.X(-1583931487);
            y(jd3Var, h02Var2, i3 & 14);
            h02Var2.b(false);
        } else if (ikVar instanceof gk) {
            h02Var2.X(-1583834302);
            n(wm4Var, ((gk) ikVar).g, h02Var2, ((i3 >> 3) & 14) | 8);
            h02Var2.b(false);
        } else if (ikVar instanceof fk) {
            h02Var2.X(-1583705993);
            r(jd3Var, (fk) ikVar, h02Var2, ((i3 >> 3) & 112) | (i3 & 14));
            h02Var2.b(false);
        } else {
            boolean z2 = ikVar instanceof dk;
            l76 l76Var = oo0.g;
            if (z2) {
                h02Var2.X(-1583590766);
                if ((i3 & 896) != 256 && ((i3 & 512) == 0 || !h02Var2.j(ikVar))) {
                    b3 = 0;
                }
                Object objK = h02Var2.K();
                if (b3 != 0 || objK == l76Var) {
                    objK = new my1() { // from class: on
                        @Override // defpackage.my1
                        public final Object g() {
                            byte b5 = b4;
                            og5 og5Var = og5.g;
                            ik ikVar2 = ikVar;
                            switch (b5) {
                                case 0:
                                    ((dk) ikVar2).y.g();
                                    break;
                                default:
                                    ((hk) ikVar2).g().g();
                                    break;
                            }
                            return og5Var;
                        }
                    };
                    h02Var2.i0(objK);
                }
                k33.w(kq2.R((my1) objK, h02Var2), null, false, null, null, ue5.m0(663217987, new f(ikVar, b2), h02Var2), h02Var, 1572864, 62);
                h02Var2 = h02Var;
                h02Var2.b(false);
            } else {
                if (!(ikVar instanceof hk)) {
                    h02Var2.X(1195830657);
                    h02Var2.b(false);
                    uo1.g();
                    return;
                }
                h02Var2.X(-1583260678);
                boolean z3 = (i3 & 896) == 256 || ((i3 & 512) != 0 && h02Var2.j(ikVar));
                Object objK2 = h02Var2.K();
                if (z3 || objK2 == l76Var) {
                    objK2 = new my1() { // from class: on
                        @Override // defpackage.my1
                        public final Object g() {
                            byte b5 = b3;
                            og5 og5Var = og5.g;
                            ik ikVar2 = ikVar;
                            switch (b5) {
                                case 0:
                                    ((dk) ikVar2).y.g();
                                    break;
                                default:
                                    ((hk) ikVar2).g().g();
                                    break;
                            }
                            return og5Var;
                        }
                    };
                    h02Var2.i0(objK2);
                }
                c93.s(kq2.R((my1) objK2, h02Var2), null, false, null, null, null, ue5.m0(472758913, new ab4(ikVar, b3), h02Var2), h02Var2, 805306368, 510);
                h02Var2.b(false);
            }
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new hg((Object) jd3Var, (Object) wm4Var, (Object) ikVar, i2, (byte) 1);
        }
    }

    public static final int g0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void h(qr0 qr0Var, g61 g61Var, h02 h02Var, int i2) {
        boolean zBooleanValue;
        qr0Var.getClass();
        h02Var.Z(-1155929881);
        int i3 = (h02Var.j(qr0Var) ? 4 : 2) | i2 | (h02Var.j(g61Var) ? 32 : 16);
        boolean z2 = true;
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) h02Var.a(sa.y);
            ob3 ob3VarL = v13.l(qr0Var.E, null, h02Var, 48, 2);
            nf3 nf3Var = (nf3) h02Var.a(nx2.g);
            if (((Boolean) qr0Var.d.getValue()).booleanValue() && ((uk1) ob3VarL.getValue()) == null) {
                h02Var.X(1547928307);
                WeakHashMap weakHashMap = yp5.k;
                zBooleanValue = ((Boolean) v13.t(h02Var).r.n.getValue()).booleanValue();
                h02Var.b(false);
            } else {
                h02Var.X(741138498);
                h02Var.b(false);
                zBooleanValue = false;
            }
            boolean z3 = zBooleanValue && g61Var != null && g61Var.l();
            int i4 = i3 & 14;
            boolean z4 = i4 == 4 || h02Var.j(qr0Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z4 || objK == l76Var) {
                objK = new rn(qr0Var, (byte) 3);
                h02Var.i0(objK);
            }
            my1 my1VarR = kq2.R((my1) objK, h02Var);
            if (i4 != 4 && !h02Var.j(qr0Var)) {
                z2 = false;
            }
            boolean zJ = h02Var.j(context) | z2 | h02Var.j(nf3Var);
            Object objK2 = h02Var.K();
            if (zJ || objK2 == l76Var) {
                objK2 = new un(qr0Var, context, nf3Var, b2);
                h02Var.i0(objK2);
            }
            z(z3, my1VarR, kq2.R((my1) objK2, h02Var), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vn(b2, i2, qr0Var, g61Var);
        }
    }

    public static final void i(final my1 my1Var, final k85 k85Var, final float f2, final j73 j73Var, final cn4 cn4Var, final long j2, final long j3, final nq1 nq1Var, final nm0 nm0Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        nm0 nm0Var2;
        int i5;
        h02Var.Z(121669932);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.x(k85Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var.r(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var.r(56.0f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= h02Var.x(j73Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= h02Var.x(cn4Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= h02Var.v(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= h02Var.v(j3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= h02Var.x(nq1Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= h02Var.x(null) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            nm0Var2 = nm0Var;
            i5 = i3 | (h02Var.j(nm0Var2) ? 4 : 2);
        } else {
            nm0Var2 = nm0Var;
            i5 = i3;
        }
        if (h02Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            h02Var.S();
            if ((i2 & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            h02Var.X(-282833393);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = du4.n(h02Var);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var.b(false);
            Object objK2 = h02Var.K();
            byte b2 = 10;
            if (objK2 == obj) {
                objK2 = new q21(b2);
                h02Var.i0(objK2);
            }
            j73 j73VarG = dj4.g(j73Var, false, (xy1) objK2);
            float f3 = nq1Var.g;
            int i6 = i4 >> 21;
            int i7 = i6 & 112;
            boolean zX = h02Var.x(ja3Var);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = new qq1(nq1Var.g, nq1Var.y, nq1Var.n, nq1Var.r);
                h02Var.i0(objK3);
            }
            qq1 qq1Var = (qq1) objK3;
            boolean zJ = h02Var.j(qq1Var) | (((i7 ^ 48) > 32 && h02Var.x(nq1Var)) || (i6 & 48) == 32);
            Object objK4 = h02Var.K();
            if (zJ || objK4 == obj) {
                objK4 = new op(qq1Var, nq1Var, null, (byte) 8);
                h02Var.i0(objK4);
            }
            k33.b((bz1) objK4, h02Var, nq1Var);
            boolean zX2 = h02Var.x(ja3Var) | h02Var.j(qq1Var);
            Object objK5 = h02Var.K();
            if (zX2 || objK5 == obj) {
                objK5 = new zh(ja3Var, qq1Var, null, (byte) 10);
                h02Var.i0(objK5);
            }
            k33.b((bz1) objK5, h02Var, ja3Var);
            int i8 = i4 >> 6;
            uz4.n(my1Var, j73VarG, false, cn4Var, j2, j3, f3, ((vb1) qq1Var.v.r.t.getValue()).j, null, ja3Var, ue5.m0(-1779603465, new yq1(j3, k85Var, f2, nm0Var2), h02Var), h02Var, (i4 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: uq1
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(i2 | 1);
                    int iJ2 = aq2.J(i3);
                    m50.i(my1Var, k85Var, f2, j73Var, cn4Var, j2, j3, nq1Var, nm0Var, (h02) obj2, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }

    public static final void j(jd3 jd3Var, qr0 qr0Var, wm4 wm4Var, j73 j73Var, h02 h02Var, int i2) {
        j73 j73Var2;
        jd3Var.getClass();
        qr0Var.getClass();
        wm4Var.getClass();
        h02Var.Z(-1937420597);
        int i3 = i2 | (h02Var.j(jd3Var) ? 4 : 2) | (h02Var.j(qr0Var) ? 32 : 16) | (h02Var.j(wm4Var) ? 256 : 128);
        boolean z2 = true;
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            WeakHashMap weakHashMap = yp5.k;
            Boolean bool = (Boolean) v13.t(h02Var).r.n.getValue();
            boolean zBooleanValue = bool.booleanValue();
            int i4 = i3 & 896;
            boolean zL = (i4 == 256 || h02Var.j(wm4Var)) | h02Var.l(zBooleanValue);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zL || objK == l76Var) {
                objK = new of3(wm4Var, zBooleanValue, (mu0) null);
                h02Var.i0(objK);
            }
            k33.b((bz1) objK, h02Var, bool);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                List list = ri5.y;
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                int i5 = sharedPreferences.getInt("start_screen", -1);
                objK2 = (String) ((i5 < 0 || i5 >= list.size()) ? (String) cj0.j0(list) : list.get(i5));
                h02Var.i0(objK2);
            }
            String str = (String) objK2;
            h02Var.X(-1925561001);
            h02Var.b(false);
            ra.K(h02Var);
            j73Var2 = j73Var;
            j73 j73VarD0 = yf2.d0(j73Var2, new su2(v13.t(h02Var).y, 16));
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new pc3((byte) 9);
                h02Var.i0(objK3);
            }
            xy1 xy1Var = (xy1) objK3;
            Object objK4 = h02Var.K();
            if (objK4 == l76Var) {
                objK4 = new pc3((byte) 13);
                h02Var.i0(objK4);
            }
            xy1 xy1Var2 = (xy1) objK4;
            Object objK5 = h02Var.K();
            byte b2 = 14;
            if (objK5 == l76Var) {
                objK5 = new pc3(b2);
                h02Var.i0(objK5);
            }
            xy1 xy1Var3 = (xy1) objK5;
            Object objK6 = h02Var.K();
            if (objK6 == l76Var) {
                objK6 = new pc3((byte) 15);
                h02Var.i0(objK6);
            }
            xy1 xy1Var4 = (xy1) objK6;
            boolean zJ = h02Var.j(jd3Var) | ((i3 & 112) == 32 || h02Var.j(qr0Var));
            if (i4 != 256 && !h02Var.j(wm4Var)) {
                z2 = false;
            }
            boolean z3 = zJ | z2;
            Object objK7 = h02Var.K();
            if (z3 || objK7 == l76Var) {
                cc2 cc2Var = new cc2(jd3Var, qr0Var, wm4Var, str, (byte) 3);
                h02Var.i0(cc2Var);
                objK7 = cc2Var;
            }
            br2.r(jd3Var, str, j73VarD0, null, xy1Var, xy1Var2, xy1Var3, xy1Var4, null, null, (xy1) objK7, h02Var, (i3 & 14) | 115015728);
        } else {
            j73Var2 = j73Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new k71(jd3Var, qr0Var, wm4Var, j73Var2, i2, (byte) 4);
        }
    }

    public static final void k(j73 j73Var, final float f2, final long j2, h02 h02Var, final int i2) {
        h02Var.Z(-1534852205);
        int i3 = i2 | 182;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                f2 = fb1.g;
                j2 = tj0.v(v70.a, h02Var);
                j73Var = g73.g;
            } else {
                h02Var.Q();
            }
            h02Var.s();
            j73 j73VarQ = mq4.q(j73Var.n(mq4.y), f2);
            boolean zV = h02Var.v(j2);
            Object objK = h02Var.K();
            if (zV || objK == oo0.g) {
                objK = new xy1() { // from class: gb1
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        xd1 xd1Var = (xd1) obj;
                        float f3 = f2;
                        float fE = xd1Var.e(f3);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(xd1Var.e(f3) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        float fE2 = xd1Var.e(f3) / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L));
                        xd1.S(xd1Var, j2, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE2)) << 32), fE, 0, 496);
                        return og5.g;
                    }
                };
                h02Var.i0(objK);
            }
            ue5.v(j73VarQ, (xy1) objK, h02Var, 0);
        } else {
            h02Var.Q();
        }
        final j73 j73Var2 = j73Var;
        final float f3 = f2;
        final long j3 = j2;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(f3, j3, i2) { // from class: hb1
                public final /* synthetic */ long a;
                public final /* synthetic */ float t;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    m50.k(this.j, this.t, this.a, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void l(jd3 jd3Var, qr0 qr0Var, wm4 wm4Var, ga1 ga1Var, boolean z2, h02 h02Var, int i2) {
        h02Var.Z(-570855206);
        int i3 = i2 | (h02Var.j(jd3Var) ? 4 : 2) | (h02Var.j(qr0Var) ? 32 : 16) | (h02Var.j(wm4Var) ? 256 : 128) | (h02Var.x(ga1Var) ? 2048 : 1024) | (h02Var.l(z2) ? 16384 : 8192);
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ho1 ho1Var = mq4.r;
            t33 t33VarR = z50.r(hi0.t, false);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = W(h02Var, ho1Var);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            j(jd3Var, qr0Var, wm4Var, ho1Var, h02Var, (i3 & 896) | (i3 & 14) | 3136 | (i3 & 112) | 512);
            f(wm4Var, qr0Var, jd3Var, h02Var, ((i3 >> 3) & 112) | 582 | ((i3 << 3) & 896) | ((i3 << 9) & 7168));
            s(wm4Var, h02Var, ((i3 >> 6) & 14) | 8);
            e60 e60Var = e60.g;
            if (z2) {
                h02Var.X(-1725108175);
                o(e60Var.g(jf6.r(), hi0.b), h02Var, 0);
                h02Var.b(false);
            } else {
                h02Var.X(-1724926546);
                h02Var.b(false);
            }
            yf2.q(ga1Var, e60Var.g(g73.g, hi0.a), h02Var, (i3 >> 9) & 14);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new eo(jd3Var, qr0Var, wm4Var, ga1Var, z2, i2);
        }
    }

    public static final void m(my1 my1Var, nm0 nm0Var, h02 h02Var, int i2) {
        int i3;
        my1Var.getClass();
        h02Var.Z(-977401241);
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var.j(my1Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            b73.g(my1Var, null, b73.x(6, 2, h02Var), 0.0f, false, null, ((rj0) h02Var.a(tj0.g)).F, 0L, 0L, null, null, null, nm0Var, h02Var, i3 & 14, 3072, 8122);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zn((Object) my1Var, (bz1) nm0Var, i2, (byte) 0);
        }
    }

    public static final void n(wm4 wm4Var, List list, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(1271065973);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? h02Var.x(wm4Var) : h02Var.j(wm4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? h02Var.x(list) : h02Var.j(list) ? 32 : 16;
        }
        boolean z2 = false;
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = (i3 & 14) == 4 || ((i3 & 8) != 0 && h02Var.j(wm4Var));
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && h02Var.j(list))) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objK = h02Var.K();
            if (z4 || objK == oo0.g) {
                objK = new rg(wm4Var, list, b2);
                h02Var.i0(objK);
            }
            k33.w((my1) objK, null, false, null, null, ra.m, h02Var, 1572864, 62);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk(b2, i2, wm4Var, list);
        }
    }

    public static final void o(j73 j73Var, h02 h02Var, int i2) {
        h02Var.Z(891754559);
        int i3 = (h02Var.x(j73Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            fb6.g(ue5.i0(j73Var, 8.0f, 0.0f, 8.0f, 8.0f, 2), na4.y(16.0f), null, null, null, ue5.m0(-1575261263, new tn((Context) h02Var.a(sa.y), b2), h02Var), h02Var, 196608, 28);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xn(j73Var, i2, b2);
        }
    }

    public static final void p(j73 j73Var, float f2, long j2, h02 h02Var, final int i2, final int i3) {
        j73 j73Var2;
        int i4;
        final float f3;
        final j73 j73Var3;
        j73 j73Var4;
        final float f4;
        h02Var.Z(75144485);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            j73Var2 = j73Var;
        } else if ((i2 & 6) == 0) {
            j73Var2 = j73Var;
            i4 = i2 | (h02Var.x(j73Var2) ? 4 : 2);
        } else {
            j73Var2 = j73Var;
            i4 = i2;
        }
        final long jV = j2;
        int i6 = i4 | 48 | (((i3 & 4) == 0 && h02Var.v(jV)) ? 256 : 128);
        boolean z2 = true;
        if (h02Var.N(i6 & 1, (i6 & 147) != 146)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                j73Var4 = i5 != 0 ? g73.g : j73Var2;
                f4 = fb1.g;
                if ((i3 & 4) != 0) {
                    jV = tj0.v(v70.a, h02Var);
                    i6 &= -897;
                }
            } else {
                h02Var.Q();
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                }
                j73Var4 = j73Var2;
                f4 = f2;
            }
            h02Var.s();
            j73 j73VarN = mq4.n(mq4.r(j73Var4, 1.0f), f4);
            if ((((i6 & 896) ^ 384) <= 256 || !h02Var.v(jV)) && (i6 & 384) != 256) {
                z2 = false;
            }
            Object objK = h02Var.K();
            if (z2 || objK == oo0.g) {
                objK = new xy1() { // from class: ib1
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        xd1 xd1Var = (xd1) obj;
                        float f5 = f4;
                        float fE = xd1Var.e(f5);
                        float fE2 = xd1Var.e(f5) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() >> 32));
                        float fE3 = xd1Var.e(f5) / 2.0f;
                        xd1.S(xd1Var, jV, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fE3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fE, 0, 496);
                        return og5.g;
                    }
                };
                h02Var.i0(objK);
            }
            ue5.v(j73VarN, (xy1) objK, h02Var, 0);
            j73Var3 = j73Var4;
            f3 = f4;
        } else {
            h02Var.Q();
            f3 = f2;
            j73Var3 = j73Var2;
        }
        final long j3 = jV;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: jb1
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m50.p(j73Var3, f3, j3, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void q(nm0 nm0Var, nm0 nm0Var2, final my1 my1Var, j73 j73Var, boolean z2, cn4 cn4Var, long j2, long j3, nq1 nq1Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        j73 j73Var2;
        int i5;
        final boolean z3;
        int i6;
        nm0 nm0Var3;
        nm0 nm0Var4;
        final cn4 cn4Var2;
        final long j4;
        final long j5;
        final nq1 nq1Var2;
        final j73 j73Var3;
        nq1 nq1Var3;
        int i7;
        cn4 cn4Var3;
        j73 j73Var4;
        long j6;
        boolean z4;
        long j7;
        h02Var.Z(-1161000600);
        if ((i2 & 384) == 0) {
            i4 = (h02Var.j(my1Var) ? 256 : 128) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
            j73Var2 = j73Var;
        } else {
            j73Var2 = j73Var;
            i5 = i4 | (h02Var.x(j73Var2) ? 2048 : 1024);
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i6 = i5 | 24576;
            z3 = z2;
        } else {
            z3 = z2;
            i6 = i5 | (h02Var.l(z3) ? 16384 : 8192);
        }
        int i10 = i6 | 843644928;
        if (h02Var.N(i10 & 1, (306783379 & i10) != 306783378)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                if (i8 != 0) {
                    j73Var2 = g73.g;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                cn4 cn4VarY = vn4.y(ue5.a, h02Var);
                long jV = tj0.v(ra.b, h02Var);
                long jY = tj0.y(jV, h02Var);
                nq1Var3 = new nq1(ra.s, ra.z, ra.p, ra.u);
                i7 = i10 & (-268369921);
                j73 j73Var5 = j73Var2;
                cn4Var3 = cn4VarY;
                j73Var4 = j73Var5;
                j6 = jV;
                z4 = z3;
                j7 = jY;
            } else {
                h02Var.Q();
                i7 = i10 & (-268369921);
                j6 = j2;
                nq1Var3 = nq1Var;
                j73Var4 = j73Var2;
                z4 = z3;
                cn4Var3 = cn4Var;
                j7 = j3;
            }
            h02Var.s();
            nm0Var3 = nm0Var;
            nm0Var4 = nm0Var2;
            int i11 = i7 >> 6;
            c(my1Var, j73Var4, cn4Var3, j6, j7, nq1Var3, ue5.m0(632971498, new wq1(z4, nm0Var4, nm0Var3), h02Var), h02Var, 1572864 | (i11 & 112) | (i11 & 14) | 12582912);
            j5 = j7;
            z3 = z4;
            cn4Var2 = cn4Var3;
            nq1Var2 = nq1Var3;
            j4 = j6;
            j73Var3 = j73Var4;
        } else {
            nm0Var3 = nm0Var;
            nm0Var4 = nm0Var2;
            h02Var.Q();
            cn4Var2 = cn4Var;
            j4 = j2;
            j5 = j3;
            nq1Var2 = nq1Var;
            j73Var3 = j73Var2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final nm0 nm0Var5 = nm0Var3;
            final nm0 nm0Var6 = nm0Var4;
            u34VarP.n = new bz1() { // from class: rq1
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i2 | 1);
                    m50.q(nm0Var5, nm0Var6, my1Var, j73Var3, z3, cn4Var2, j4, j5, nq1Var2, (h02) obj, iJ, i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void r(jd3 jd3Var, fk fkVar, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(-1058397484);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(jd3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? h02Var.x(fkVar) : h02Var.j(fkVar) ? 32 : 16;
        }
        boolean z2 = false;
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean zJ = h02Var.j(jd3Var);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && h02Var.j(fkVar))) {
                z2 = true;
            }
            boolean z3 = zJ | z2;
            Object objK = h02Var.K();
            if (z3 || objK == oo0.g) {
                objK = new p2(jd3Var, fkVar, (byte) 7);
                h02Var.i0(objK);
            }
            k33.w(kq2.R((my1) objK, h02Var), null, false, null, null, ra.a, h02Var, 1572864, 62);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ej(b2, i2, jd3Var, fkVar);
        }
    }

    public static final void s(wm4 wm4Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(-1932218279);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? h02Var.x(wm4Var) : h02Var.j(wm4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            tp3 tp3Var = wm4Var.w;
            if (((Boolean) tp3Var.getValue()).booleanValue()) {
                h02Var.X(-1562900143);
                boolean zX = h02Var.x(tp3Var);
                Object objK = h02Var.K();
                if (zX || objK == oo0.g) {
                    objK = new ln(tp3Var, b2);
                    h02Var.i0(objK);
                }
                ah6.g((my1) objK, h02Var, 48);
                h02Var.b(false);
            } else {
                h02Var.X(-1562723319);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new pn(wm4Var, i2, b2);
        }
    }

    public static final void t(we1 we1Var, List list, mc3 mc3Var, jd3 jd3Var, my1 my1Var, nm0 nm0Var, h02 h02Var, int i2) {
        h02Var.Z(-2109986011);
        int i3 = i2 | (h02Var.x(we1Var) ? 4 : 2) | (h02Var.x(list) ? 32 : 16) | (h02Var.j(mc3Var) ? 256 : 128) | (h02Var.j(jd3Var) ? 2048 : 1024) | (h02Var.j(my1Var) ? 16384 : 8192);
        if (h02Var.N(i3 & 1, (74899 & i3) != 74898)) {
            ef3.n(ue5.m0(-382370498, new fo(we1Var, list, mc3Var, jd3Var, my1Var), h02Var), null, we1Var, we1Var.r(), 0L, nm0Var, h02Var, ((i3 << 6) & 896) | 196614);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new go(we1Var, list, mc3Var, jd3Var, my1Var, nm0Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void u(cp3 cp3Var, j73 j73Var, u6 u6Var, yt0 yt0Var, float f2, h02 h02Var, int i2, int i3) {
        yt0 yt0Var2;
        int i4;
        boolean z2;
        u6 u6Var2;
        float f3;
        yt0 yt0Var3;
        u34 u34VarP;
        Object objK;
        h02Var.Z(1142754848);
        int i5 = (h02Var.j(cp3Var) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i5 |= h02Var.x(j73Var) ? 256 : 128;
        }
        int i6 = i5 | 3072;
        int i7 = i3 & 16;
        if (i7 == 0) {
            if ((i2 & 24576) == 0) {
                yt0Var2 = yt0Var;
                i6 |= h02Var.x(yt0Var2) ? 16384 : 8192;
            }
            i4 = i6 | 1769472;
            if ((599187 & i4) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i4 & 1, z2)) {
                u6Var2 = hi0.w;
                if (i7 != 0) {
                    yt0Var2 = wt0.g;
                }
                h02Var.X(1899381698);
                h02Var.b(false);
                yt0 yt0Var4 = yt0Var2;
                j73 j73VarD = pw5.D(y94.o(j73Var.n(g73.g)), cp3Var, yt0Var4, 1.0f, null, 2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = y50.v;
                    h02Var.i0(objK);
                }
                t33 t33Var = (t33) objK;
                int iHashCode = Long.hashCode(h02Var.T);
                j73 j73VarW = W(h02Var, j73VarD);
                tr3 tr3VarQ = h02Var.q();
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, t33Var);
                xs2.E(tg1.q, h02Var, tr3VarQ);
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                h02Var.b(true);
                yt0Var3 = yt0Var4;
                f3 = 1.0f;
            } else {
                h02Var.Q();
                u6Var2 = u6Var;
                f3 = f2;
                yt0Var3 = yt0Var2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new ba2(cp3Var, j73Var, u6Var2, yt0Var3, f3, i2, i3);
            }
        }
        i6 = i5 | 27648;
        yt0Var2 = yt0Var;
        i4 = i6 | 1769472;
        if ((599187 & i4) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i4 & 1, z2)) {
            u6Var2 = hi0.w;
            if (i7 != 0) {
                yt0Var2 = wt0.g;
            }
            h02Var.X(1899381698);
            h02Var.b(false);
            yt0 yt0Var5 = yt0Var2;
            j73 j73VarD2 = pw5.D(y94.o(j73Var.n(g73.g)), cp3Var, yt0Var5, 1.0f, null, 2);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = y50.v;
                h02Var.i0(objK);
            }
            t33 t33Var2 = (t33) objK;
            int iHashCode2 = Long.hashCode(h02Var.T);
            j73 j73VarW2 = W(h02Var, j73VarD2);
            tr3 tr3VarQ2 = h02Var.q();
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33Var2);
            xs2.E(tg1.q, h02Var, tr3VarQ2);
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW2);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode2));
            h02Var.b(true);
            yt0Var3 = yt0Var5;
            f3 = 1.0f;
        } else {
            h02Var.Q();
            u6Var2 = u6Var;
            f3 = f2;
            yt0Var3 = yt0Var2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ba2(cp3Var, j73Var, u6Var2, yt0Var3, f3, i2, i3);
        }
    }

    public static final void v(List list, jd3 jd3Var, wm4 wm4Var, h02 h02Var, int i2) {
        jd3Var.getClass();
        wm4Var.getClass();
        h02Var.Z(1976201814);
        int i3 = (h02Var.x(list) ? 4 : 2) | i2 | (h02Var.j(jd3Var) ? 32 : 16) | (h02Var.j(wm4Var) ? 256 : 128);
        if (!h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var.Q();
        } else if (list == null) {
            h02Var.X(1911665077);
            h02Var.b(false);
        } else {
            h02Var.X(1911665078);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i4 = i3 >> 3;
                g(jd3Var, wm4Var, (ik) it.next(), h02Var, (i4 & 112) | (i4 & 14) | 64 | 512);
            }
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nn(list, jd3Var, wm4Var, i2, (byte) 0);
        }
    }

    public static final void w(final my1 my1Var, j73 j73Var, cn4 cn4Var, long j2, long j3, nq1 nq1Var, nm0 nm0Var, h02 h02Var, final int i2) {
        nm0 nm0Var2;
        final j73 j73Var2;
        final cn4 cn4Var2;
        final long j4;
        final long j5;
        final nq1 nq1Var2;
        cn4 cn4VarY;
        long jV;
        long jY;
        nq1 nq1Var3;
        int i3;
        j73 j73Var3;
        h02Var.Z(1039585610);
        int i4 = i2 | (h02Var.j(my1Var) ? 4 : 2) | 1647792;
        byte b2 = 1;
        if (h02Var.N(i4 & 1, (4793491 & i4) != 4793490)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                cn4VarY = vn4.y(ue5.a, h02Var);
                jV = tj0.v(ra.b, h02Var);
                jY = tj0.y(jV, h02Var);
                nq1Var3 = new nq1(ra.s, ra.z, ra.p, ra.u);
                i3 = i4 & (-524161);
                j73Var3 = g73.g;
            } else {
                h02Var.Q();
                cn4VarY = cn4Var;
                jV = j2;
                jY = j3;
                nq1Var3 = nq1Var;
                i3 = i4 & (-524161);
                j73Var3 = j73Var;
            }
            h02Var.s();
            nm0Var2 = nm0Var;
            int i5 = 14155824 | (i3 & 14);
            long j6 = jY;
            long j7 = jV;
            nq1 nq1Var4 = nq1Var3;
            c(my1Var, j73Var3, cn4VarY, j7, j6, nq1Var4, ue5.m0(-1233936436, new wb0(nm0Var2, b2), h02Var), h02Var, i5);
            nq1Var2 = nq1Var4;
            j5 = j6;
            j4 = j7;
            j73Var2 = j73Var3;
            cn4Var2 = cn4VarY;
        } else {
            nm0Var2 = nm0Var;
            h02Var.Q();
            j73Var2 = j73Var;
            cn4Var2 = cn4Var;
            j4 = j2;
            j5 = j3;
            nq1Var2 = nq1Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final nm0 nm0Var3 = nm0Var2;
            u34VarP.n = new bz1(j73Var2, cn4Var2, j4, j5, nq1Var2, nm0Var3, i2) { // from class: sq1
                public final /* synthetic */ cn4 a;
                public final /* synthetic */ nm0 c;
                public final /* synthetic */ long m;
                public final /* synthetic */ long q;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ nq1 w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(12582913);
                    m50.w(this.j, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02d8  */
    public static final void x(final qr0 qr0Var, final ao2 ao2Var, final wm4 wm4Var, final boolean z2, jd3 jd3Var, final boolean z3, h02 h02Var, final int i2) {
        Object joVar;
        int i3;
        mu0 mu0Var;
        jd3 jd3Var2;
        boolean z4;
        boolean zJ;
        Object objK;
        g61 g61Var;
        boolean z5;
        wm4 wm4Var2 = wm4Var;
        jd3 jd3Var3 = jd3Var;
        qr0Var.getClass();
        ao2Var.getClass();
        wm4Var2.getClass();
        jd3Var3.getClass();
        h02Var.Z(1180209259);
        int i4 = i2 | (h02Var.j(qr0Var) ? 4 : 2) | (h02Var.j(ao2Var) ? 32 : 16) | (h02Var.j(wm4Var2) ? 256 : 128) | (h02Var.l(z2) ? 2048 : 1024) | (h02Var.j(jd3Var3) ? 16384 : 8192) | (h02Var.l(z3) ? 131072 : 65536);
        if (h02Var.N(i4 & 1, (74899 & i4) != 74898)) {
            Context context = (Context) h02Var.a(sa.y);
            Object objK2 = h02Var.K();
            Object obj = oo0.g;
            if (objK2 == obj) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            ox0 ox0Var = (ox0) objK2;
            we1 we1VarT = ef3.t(h02Var);
            int i5 = (i4 >> 12) & 14;
            ob3 ob3VarL = v13.l(new d34(jd3Var3.y.e), null, h02Var, 48, 2);
            boolean zX = h02Var.x((mc3) ob3VarL.getValue());
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = Boolean.valueOf(jd3Var3.y() == null);
                h02Var.i0(objK3);
            }
            boolean zBooleanValue = ((Boolean) objK3).booleanValue();
            mc3 mc3Var = (mc3) ob3VarL.getValue();
            int i6 = i4 & 896;
            boolean zX2 = h02Var.x(ob3VarL) | (i6 == 256 || h02Var.j(wm4Var2)) | ((i4 & 112) == 32 || h02Var.j(ao2Var));
            Object objK4 = h02Var.K();
            if (zX2 || objK4 == obj) {
                objK4 = new io(wm4Var2, ob3VarL, ao2Var, (mu0) null);
                h02Var.i0(objK4);
            }
            k33.b((bz1) objK4, h02Var, mc3Var);
            h02Var.X(1013355274);
            ob3 ob3VarS = og0.s(ao2Var.t, h02Var);
            h02Var.b(false);
            ob3 ob3VarJ = v13.j(qr0Var.m, h02Var);
            g61 g61Var2 = (g61) ob3VarJ.getValue();
            String str = g61Var2 != null ? g61Var2.t : null;
            boolean zX3 = h02Var.x(ob3VarJ) | h02Var.j(jd3Var3) | ((i4 & 458752) == 131072) | (i6 == 256 || h02Var.j(wm4Var2));
            Object objK5 = h02Var.K();
            if (zX3 || objK5 == obj) {
                i3 = i6;
                mu0Var = null;
                jd3Var2 = jd3Var;
                joVar = new jo(ob3VarJ, jd3Var2, z3, wm4Var2, null);
                ob3VarJ = ob3VarJ;
                wm4Var2 = wm4Var2;
                h02Var.i0(joVar);
            } else {
                joVar = objK5;
                jd3Var2 = jd3Var;
                i3 = i6;
                mu0Var = null;
            }
            k33.b((bz1) joVar, h02Var, str);
            xe1 xe1Var = (xe1) r24.y.t.getValue();
            boolean zX4 = h02Var.x(r24) | (i3 == 256 || h02Var.j(wm4Var2));
            Object objK6 = h02Var.K();
            if (zX4 || objK6 == obj) {
                objK6 = new ko(r24, wm4Var2, mu0Var, (byte) 0);
                h02Var.i0(objK6);
            }
            k33.b((bz1) objK6, h02Var, xe1Var);
            b(wm4Var2, jd3Var2, h02Var, ((i4 >> 6) & 14) | 8 | ((i4 >> 9) & 112));
            boolean zJ2 = h02Var.j(jd3Var2);
            Object objK7 = h02Var.K();
            if (zJ2 || objK7 == obj) {
                objK7 = new wn(jd3Var2, (byte) 1);
                h02Var.i0(objK7);
            }
            Object obj2 = (my1) objK7;
            Object objK8 = h02Var.K();
            if (objK8 == obj) {
                objK8 = kq2.M(Boolean.TRUE);
                h02Var.i0(objK8);
            }
            ob3 ob3Var = (ob3) objK8;
            if (Build.VERSION.SDK_INT >= 31) {
                h02Var.X(1481156116);
                aa3 aa3VarF = sp2.f(pw5.d("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE"), h02Var, 6);
                Boolean boolValueOf = Boolean.valueOf(aa3VarF.v());
                boolean zX5 = h02Var.x(aa3VarF);
                Object objK9 = h02Var.K();
                if (zX5 || objK9 == obj) {
                    objK9 = new ko(ob3Var, aa3VarF, null, (byte) 2);
                    h02Var.i0(objK9);
                }
                k33.b((bz1) objK9, h02Var, boolValueOf);
                if (aa3VarF.v()) {
                    z5 = false;
                    h02Var.X(1481711388);
                    h02Var.b(false);
                } else {
                    h02Var.X(1481595107);
                    boolean zX6 = h02Var.x(obj2);
                    Object objK10 = h02Var.K();
                    if (zX6 || objK10 == obj) {
                        objK10 = new ko(obj2, (mu0) null, (byte) 3);
                        h02Var.i0(objK10);
                    }
                    k33.b((bz1) objK10, h02Var, og5.g);
                    z5 = false;
                    h02Var.b(false);
                }
                h02Var.b(z5);
            } else {
                h02Var.X(1481717340);
                h02Var.b(false);
            }
            ga1 ga1VarV = yf2.V(h02Var);
            if (!zBooleanValue || (g61Var = (g61) ob3VarJ.getValue()) == null) {
                z4 = true;
            } else {
                z4 = true;
                boolean z6 = g61Var.l();
                boolean zX7 = h02Var.x(ob3VarJ);
                if ((i4 & 14) != 4 && !h02Var.j(qr0Var)) {
                    z4 = false;
                }
                zJ = z4 | zX7 | h02Var.j(context);
                objK = h02Var.K();
                if (zJ || objK == obj) {
                    objK = new un(context, ob3VarJ, qr0Var);
                    h02Var.i0(objK);
                }
                yf2.l(z6, ga1VarV, (my1) objK, h02Var, 0);
                gp4.b(r24, h02Var, 0);
                jd3 jd3Var4 = jd3Var2;
                jd3Var3 = jd3Var4;
                nx2.g(jd3Var3, ((Boolean) ob3Var.getValue()).booleanValue(), ue5.m0(1022695656, new ao(we1VarT, ob3VarS, jd3Var4, ox0Var, ob3VarL, qr0Var, wm4Var, ga1VarV, z2, (byte) 0), h02Var), h02Var, i5 | 384);
            }
            boolean zX8 = h02Var.x(ob3VarJ);
            if ((i4 & 14) != 4) {
                z4 = false;
            }
            zJ = z4 | zX8 | h02Var.j(context);
            objK = h02Var.K();
            if (zJ) {
                objK = new un(context, ob3VarJ, qr0Var);
                h02Var.i0(objK);
            } else {
                objK = new un(context, ob3VarJ, qr0Var);
                h02Var.i0(objK);
            }
            yf2.l(z6, ga1VarV, (my1) objK, h02Var, 0);
            gp4.b(r24, h02Var, 0);
            jd3 jd3Var5 = jd3Var2;
            jd3Var3 = jd3Var5;
            nx2.g(jd3Var3, ((Boolean) ob3Var.getValue()).booleanValue(), ue5.m0(1022695656, new ao(we1VarT, ob3VarS, jd3Var5, ox0Var, ob3VarL, qr0Var, wm4Var, ga1VarV, z2, (byte) 0), h02Var), h02Var, i5 | 384);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final jd3 jd3Var6 = jd3Var3;
            u34VarP.n = new bz1(ao2Var, wm4Var, z2, jd3Var6, z3, i2) { // from class: bo
                public final /* synthetic */ wm4 a;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ jd3 q;
                public final /* synthetic */ ao2 t;
                public final /* synthetic */ boolean w;

                @Override // defpackage.bz1
                public final Object l(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iJ = aq2.J(585);
                    m50.x(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj3, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void y(jd3 jd3Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(-1426561031);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(jd3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            boolean zJ = h02Var.j(jd3Var);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new wn(jd3Var, b2);
                h02Var.i0(objK);
            }
            k33.i(kq2.R((my1) objK, h02Var), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new pn(jd3Var, i2, b3);
        }
    }

    public static final void z(boolean z2, my1 my1Var, my1 my1Var2, h02 h02Var, int i2) {
        h02Var.Z(1601725833);
        byte b2 = 2;
        int i3 = (h02Var.l(z2) ? 4 : 2) | i2 | (h02Var.j(my1Var) ? 32 : 16) | (h02Var.j(my1Var2) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            gp4.n(z2, mq4.r(g73.g, 1.0f), null, null, null, ue5.m0(-705129887, new bb4(my1Var, my1Var2, b2), h02Var), h02Var, (i3 & 14) | 196656, 28);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new qk(z2, my1Var, my1Var2, i2);
        }
    }

    public void C(cc4 cc4Var, Object obj) {
        h61 h61Var = (h61) obj;
        cc4Var.getClass();
        String str = h61Var.g;
        cc4Var.m(str, 1);
        cc4Var.n(2, h61Var.y);
        cc4Var.n(3, h61Var.r);
        cc4Var.n(4, h61Var.n);
        cc4Var.m(h61Var.v, 5);
        cc4Var.n(6, h61Var.x);
        cc4Var.n(7, h61Var.l);
        cc4Var.m(h61Var.j, 8);
        cc4Var.n(9, h61Var.t.getTime());
        cc4Var.n(10, h61Var.a.getTime());
        cc4Var.m(str, 11);
    }

    public String G() {
        return "UPDATE `DeviceConfig` SET `macAddress` = ?,`mousePointerSpeed` = ?,`airMouseSpeed` = ?,`scrollSpeed` = ?,`mouseJiggleMode` = ?,`layoutScreen` = ?,`layoutScreenLayoutId` = ?,`keyboardLanguageLayout` = ?,`lastUsedDate` = ?,`addedDate` = ? WHERE `macAddress` = ?";
    }

    public void P(tb4 tb4Var, Object obj) {
        cc4 cc4VarO = tb4Var.O(G());
        try {
            C(cc4VarO, obj);
            cc4VarO.H();
            c93.h(cc4VarO, null);
            br2.k(tb4Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }
}
