package snippets.miniapp;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConvKatakanaToRomaji {

    private static final Map<String, String> KANA_ROMAJI_MAP;
    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("ア", "A");
        map.put("イ", "I");
        map.put("ウ", "U");
        map.put("エ", "E");
        map.put("オ", "O");
        map.put("カ", "KA");
        map.put("キ", "KI");
        map.put("ク", "KU");
        map.put("ケ", "KE");
        map.put("コ", "KO");
        map.put("サ", "SA");
        map.put("シ", "SHI");
        map.put("ス", "SU");
        map.put("セ", "SE");
        map.put("ソ", "SO");
        map.put("タ", "TA");
        map.put("チ", "CHI");
        map.put("ツ", "TU");
        map.put("テ", "TE");
        map.put("ト", "TO");
        map.put("ナ", "NA");
        map.put("ニ", "NI");
        map.put("ヌ", "NU");
        map.put("ネ", "NE");
        map.put("ノ", "NO");
        map.put("ハ", "HA");
        map.put("ヒ", "HI");
        map.put("フ", "FU");
        map.put("ヘ", "HE");
        map.put("ホ", "HO");
        map.put("マ", "MA");
        map.put("ミ", "MI");
        map.put("ム", "MU");
        map.put("メ", "ME");
        map.put("モ", "MO");
        map.put("ヤ", "YA");
        map.put("ユ", "YU");
        map.put("ヨ", "YO");
        map.put("ラ", "RA");
        map.put("リ", "RI");
        map.put("ル", "RU");
        map.put("レ", "RE");
        map.put("ロ", "RO");
        map.put("ワ", "WA");
        map.put("ヲ", "WO");
        map.put("ン", "N");
        map.put("ガ", "GA");
        map.put("ギ", "GI");
        map.put("グ", "GU");
        map.put("ゲ", "GE");
        map.put("ゴ", "GO");
        map.put("ザ", "ZA");
        map.put("ジ", "ZI");
        map.put("ズ", "ZU");
        map.put("ゼ", "ZE");
        map.put("ゾ", "ZO");
        map.put("ダ", "DA");
        map.put("ヂ", "DI");
        map.put("ヅ", "DU");
        map.put("デ", "DE");
        map.put("ド", "DO");
        map.put("バ", "BA");
        map.put("ビ", "BI");
        map.put("ブ", "BU");
        map.put("ベ", "BE");
        map.put("ボ", "BO");
        map.put("パ", "PA");
        map.put("ピ", "PI");
        map.put("プ", "PU");
        map.put("ペ", "PE");
        map.put("ポ", "PO");
        map.put("キャ", "KYA");
        map.put("キュ", "KYU");
        map.put("キョ", "KYO");
        map.put("シャ", "SYA");
        map.put("シュ", "SYU");
        map.put("ショ", "SYO");
        map.put("チャ", "CHA");
        map.put("チュ", "CHU");
        map.put("チョ", "CHO");
        map.put("ニャ", "NYA");
        map.put("ニュ", "NYU");
        map.put("ニョ", "NYO");
        map.put("ヒャ", "HYA");
        map.put("ヒュ", "HYU");
        map.put("ヒョ", "HYO");
        map.put("リャ", "RYA");
        map.put("リュ", "RYU");
        map.put("リョ", "RYO");
        map.put("ギャ", "GYA");
        map.put("ギュ", "GYU");
        map.put("ギョ", "GYO");
        map.put("ジャ", "JA");
        map.put("ジュ", "JU");
        map.put("ジョ", "JO");
        map.put("ヂャ", "DYA");
        map.put("ヂュ", "DYU");
        map.put("ヂョ", "DYO");
        map.put("ビャ", "BYA");
        map.put("ビュ", "BYU");
        map.put("ビョ", "BYO");
        map.put("ピャ", "PYA");
        map.put("ピュ", "PYU");
        map.put("ピョ", "PYO");
        map.put("ァ", "A");
        map.put("ィ", "I");
        map.put("ゥ", "U");
        map.put("ェ", "E");
        map.put("ォ", "O");
        map.put("ー", "-");
        KANA_ROMAJI_MAP = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        String[] strArr = {
            "ハンチャーハン",
            "チャーシューメン",
            "スパゲティーミートソース",
            "クロワッサン",
            "キウイフルーツ",
            "ロイヤルミルクティー",
            "ヘーゼルナッツ",
            "ドヤッ"
        };

        for (String s : strArr) {
            System.out.println(s + " -> " + kana2roma(s));
        }
    }

    private static String kana2roma(String s) {
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2) {
                if (KANA_ROMAJI_MAP.containsKey(s.substring(i, i + 2))) {
                    t.append(KANA_ROMAJI_MAP.get(s.substring(i, i + 2)));
                    i++;
                } else if (KANA_ROMAJI_MAP.containsKey(s.substring(i, i + 1))) {
                    t.append(KANA_ROMAJI_MAP.get(s.substring(i, i + 1)));
                } else if (s.charAt(i) == 'ッ') {
                    t.append(KANA_ROMAJI_MAP.get(s.substring(i + 1, i + 2)).charAt(0));
                } else {
                    t.append(s.charAt(i));
                }
            } else {
                if (KANA_ROMAJI_MAP.containsKey(s.substring(i, i + 1))) {
                    t.append(KANA_ROMAJI_MAP.get(s.substring(i, i + 1)));
                } else {
                    // 変換せず空文字を返す
                    t.append("");
                }
            }
        }
        return t.toString();
    }
}
