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
package com.iohao.game.widget.light.domain.event.disruptor;

import com.iohao.game.widget.light.domain.event.message.DomainEventHandler;
import com.lmax.disruptor.EventHandler;

/**
 * @author 渔民小镇
 * @date 2021-12-26
 */
public record ConsumeEventHandler(DomainEventHandler<?> eventHandler) implements EventHandler<EventDisruptor> {

    @Override
    public void onEvent(EventDisruptor event, long sequence, boolean endOfBatch) {
        if (event.isEventSource()) {
            eventHandler.onEvent(event.getDomainEventSource(), sequence, endOfBatch);
        } else {
            eventHandler.onEvent(event.getValue(), sequence, endOfBatch);
        }
    }
}
