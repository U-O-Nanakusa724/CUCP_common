package biz.uoray.cucp.constant;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class Constants {

    public static final String UTC = "UTC";

    public static final String JST = "Asia/Tokyo";

    public static final ZoneId DEFAULT_ZONE_ID = ZoneId.of(UTC);

    public static final ZoneId JST_ZONE_ID = ZoneId.of(JST);

    public static final String MODEL_YEAR_FORMAT = "yyyy";

    public static final String PRICE_FORMAT = "yyyy/MM/dd";

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM月dd日");

}
