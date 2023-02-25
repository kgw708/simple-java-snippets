package snippets.miniapp.converter;

import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;

public class HiraganaToRomaji {
    
    private static final Map<String, String> HIRAGANA_ROMAJI_MAP;
    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("あ", "A");
        map.put("い", "I");
        map.put("う", "U");
        map.put("え", "E");
        map.put("お", "O");
        map.put("か", "KA");
        map.put("き", "KI");
        map.put("く", "KU");
        map.put("け", "KE");
        map.put("こ", "KO");
        map.put("さ", "SA");
        map.put("し", "SHI");
        map.put("す", "SU");
        map.put("せ", "SE");
        map.put("そ", "SO");
        map.put("た", "TA");
        map.put("ち", "CHI");
        map.put("つ", "TU");
        map.put("て", "TE");
        map.put("と", "TO");
        map.put("な", "NA");
        map.put("に", "NI");
        map.put("ぬ", "NU");
        map.put("ね", "NE");
        map.put("の", "NO");
        map.put("は", "HA");
        map.put("ひ", "HI");
        map.put("ふ", "FU");
        map.put("へ", "HE");
        map.put("ほ", "HO");
        map.put("ま", "MA");
        map.put("み", "MI");
        map.put("む", "MU");
        map.put("め", "ME");
        map.put("も", "MO");
        map.put("や", "YA");
        map.put("ゆ", "YU");
        map.put("よ", "YO");
        map.put("ら", "RA");
        map.put("り", "RI");
        map.put("る", "RU");
        map.put("れ", "RE");
        map.put("ろ", "RO");
        map.put("わ", "WA");
        map.put("を", "WO");
        map.put("ん", "N");
        map.put("が", "GA");
        map.put("ぎ", "GI");
        map.put("ぐ", "GU");
        map.put("げ", "GE");
        map.put("ご", "GO");
        map.put("ざ", "ZA");
        map.put("じ", "ZI");
        map.put("ず", "ZU");
        map.put("ぜ", "ZE");
        map.put("ぞ", "ZO");
        map.put("だ", "DA");
        map.put("ぢ", "DI");
        map.put("づ", "DU");
        map.put("で", "DE");
        map.put("ど", "DO");
        map.put("ば", "BA");
        map.put("び", "BI");
        map.put("ぶ", "BU");
        map.put("べ", "BE");
        map.put("ぼ", "BO");
        map.put("ぱ", "PA");
        map.put("ぴ", "PI");
        map.put("ぷ", "PU");
        map.put("ぺ", "PE");
        map.put("ぽ", "PO");
        map.put("きゃ", "KYA");
        map.put("きゅ", "KYU");
        map.put("きょ", "KYO");
        map.put("しゃ", "SYA");
        map.put("しゅ", "SYU");
        map.put("しょ", "SYO");
        map.put("ちゃ", "CHA");
        map.put("ちゅ", "CHU");
        map.put("ちょ", "CHO");
        map.put("にゃ", "NYA");
        map.put("にゅ", "NYU");
        map.put("にょ", "NYO");
        map.put("ひゃ", "HYA");
        map.put("ひゅ", "HYU");
        map.put("ひょ", "HYO");
        map.put("りゃ", "RYA");
        map.put("りゅ", "RYU");
        map.put("りょ", "RYO");
        map.put("ぎゃ", "GYA");
        map.put("ぎゅ", "GYU");
        map.put("ぎょ", "GYO");
        map.put("じゃ", "JA");
        map.put("じゅ", "JU");
        map.put("じょ", "JO");
        map.put("ぢゃ", "DYA");
        map.put("ぢゅ", "DYU");
        map.put("ぢょ", "DYO");
        map.put("びゃ", "BYA");
        map.put("びゅ", "BYU");
        map.put("びょ", "BYO");
        map.put("ぴゃ", "PYA");
        map.put("ぴゅ", "PYU");
        map.put("ぴょ", "PYO");
        map.put("ぁ", "A");
        map.put("ぃ", "I");
        map.put("ぅ", "U");
        map.put("ぇ", "E");
        map.put("ぉ", "O");
        map.put("ー", "-");
        HIRAGANA_ROMAJI_MAP = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        String[] strArr = {
            "ごはん",
            "みそしる",
            "つけもの",
            "こってりらーめん",
            "ちゃーしゅーめん"
        };

        for (String s : strArr) {
            System.out.println(s + " -> " + kana2roma(s));
        }
    }

    private static String kana2roma(String s) {
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2) {
                if (HIRAGANA_ROMAJI_MAP.containsKey(s.substring(i, i + 2))) {
                    t.append(HIRAGANA_ROMAJI_MAP.get(s.substring(i, i + 2)));
                    i++;
                } else if (HIRAGANA_ROMAJI_MAP.containsKey(s.substring(i, i + 1))) {
                    t.append(HIRAGANA_ROMAJI_MAP.get(s.substring(i, i + 1)));
                } else if (s.charAt(i) == 'っ') {
                    t.append(HIRAGANA_ROMAJI_MAP.get(s.substring(i + 1, i + 2)).charAt(0));
                } else {
                    t.append(s.charAt(i));
                }
            } else {
                if (HIRAGANA_ROMAJI_MAP.containsKey(s.substring(i, i + 1))) {
                    t.append(HIRAGANA_ROMAJI_MAP.get(s.substring(i, i + 1)));
                } else {
                    // 変換せず空文字を返す
                    t.append("");
                }
            }
        }
        return t.toString();
    }
}
