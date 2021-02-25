package biz.uoray.cucp.constant;

import lombok.Getter;

@Getter
public enum PointStyle {

    CIRCLE("circle"),
    CROSS("cross"),
    CROSS_ROT("crossRot"),
    DASH("dash"),
    LINE("line"),
    RECT("rect"),
    RECT_ROUNDED("rectRounded"),
    RECT_ROT("rectRot"),
    STAR("star"),
    TRIANGLE("triangle");

    private final String style;

    PointStyle(String style) {
        this.style = style;
    }

}
