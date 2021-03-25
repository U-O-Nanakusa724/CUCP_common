package biz.uoray.cucp.util;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class ObjectUtil {

    /**
     * オブジェクトを指定クラスに変換する.
     *
     * @param object オブジェクト
     * @param <T>    ジェネリクス
     * @return 型指定後のクラス
     */
    public static <T> T convertObjectToClass(Object object) throws ClassCastException {
        return (T) object;
    }

    /**
     * リスト型オブジェクトを指定リストに変換する.
     *
     * @param object オブジェクト
     * @param <T>    ジェネリクス
     * @return 型指定後のリスト
     */
    public static <T> List<T> convertObjectToList(Object object) throws ClassCastException {
        return (List<T>) object;
    }

    /**
     * @param object オブジェクト
     * @param <T>    ジェネリクス
     * @param <E>    ジェネリクス
     * @return 型指定後のマップ
     */
    public static <T, E> Map<T, E> convertObjectToMap(Object object) throws ClassCastException {
        return (Map<T, E>) object;
    }
}
