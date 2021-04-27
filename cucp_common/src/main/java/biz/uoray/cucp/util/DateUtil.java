package biz.uoray.cucp.util;

import biz.uoray.cucp.constant.Constants;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DateUtil {

    private DateUtil() {

    }

    /**
     * グラフの日付ラベル設定用
     *
     * @param dateList
     * @return
     */
    public static List<String> getLDTList(List<Date> dateList) {

        List<String> ldtList = dateList.stream()
                .map(d -> {
                    LocalDateTime ldt = LocalDateTime.ofInstant(d.toInstant(), Constants.DEFAULT_ZONE_ID);
                    return ldt.format(Constants.DATE_FORMAT);
                })
                .collect(Collectors.toList());

        return ldtList;
    }

    /**
     * 販売価格一覧の日付データ用
     *
     * @param date
     * @return
     */
    public static String getLDT(Date date) {

        LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), Constants.DEFAULT_ZONE_ID);
        return ldt.format(Constants.DATE_FORMAT);

    }

    /**
     * Date型を指定の文字列に変換する
     *
     * @param date 元のDate型
     * @param pattern 変換したい文字列
     * @return 変換後の文字列
     */
    public static String convertDateToString(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
