package xyz.kbws.model.enums;

import lombok.Getter;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: 短链状态
 */
@Getter
public enum ShortLinkStatusEnum {
    DRAFT("草稿", 0),
    PUBLISH("发布", 1),
    BAN("禁止", 2);

    private final String text;

    private final Integer value;

    ShortLinkStatusEnum(String text, Integer value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值
     * 获取值列表
     *
     * @return {@link List}<{@link String}>
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 按值获取枚举
     * 根据 value 获取枚举
     *
     * @param value 价值
     * @return {@link ShortLinkStatusEnum}
     */
    public static ShortLinkStatusEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ShortLinkStatusEnum anEnum : ShortLinkStatusEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
