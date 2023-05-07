/*
 * ioGame
 * Copyright (C) 2021 - 2023  渔民小镇 （262610965@qq.com、luoyizhu@gmail.com） . All Rights Reserved.
 * # iohao.com . 渔民小镇
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General  License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General  License for more details.
 *
 * You should have received a copy of the GNU General  License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.iohao.game.common.kit;


import lombok.experimental.UtilityClass;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 集合相关工具
 *
 * @author 渔民小镇
 * @date 2022-01-14
 */
@UtilityClass
public class CollKit {
    /**
     * 分组统计
     * <pre>
     *     key is 元素下标
     *     value is 元素下标对应的数量
     * </pre>
     *
     * <pre>
     *     示例
     *     handCards: [11, 11, 11, 21, 46, 33,33, 18, 18, 18, 18]
     *
     *     得到的 map {
     *         11 : 3
     *         18 : 4
     *         21 : 1
     *         33 : 2
     *         46 : 1
     *     }
     * </pre>
     *
     * @param list 元素列表
     * @return map
     */
    public Map<Integer, Integer> groupCounting(List<Integer> list) {
        return list.stream().
                collect(
                        Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1))
                );
    }

    public boolean notEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

}
