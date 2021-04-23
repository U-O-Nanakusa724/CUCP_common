package biz.uoray.cucp.constant;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class Constants {

    public static final String UTC = "UTC";

    public static final String JST = "Asia/Tokyo";

    public static final ZoneId DEFAULT_ZONE_ID = ZoneId.of(UTC);

    public static final ZoneId JST_ZONE_ID = ZoneId.of(JST);

    public static final String MODEL_YEAR_FORMAT = "yyyy";

    public static final String SIMPLE_DATE_FORMAT = "yyyy/MM/dd";

    public static final String SIMPLE_DATETIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM月dd日");

}
