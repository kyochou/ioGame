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
package com.iohao.game.widget.light.room;

import lombok.Data;

/**
 * 创建房间信息
 *
 * @author 渔民小镇
 * @date 2022-03-31
 */
@Data
public class CreateRoomInfo {
    /** 玩法规则信息 - (创建房间时添加) */
    RuleInfo ruleInfo;
    /** 游戏 id */
    long gameId;
    /** 房间可供几个人玩 */
    int spaceSize;
    /** 创建的玩家 id */
    int createUserId;
}
