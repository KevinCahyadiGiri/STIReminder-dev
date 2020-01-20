/*
 * Copyright 2018 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.example.bot.spring;

import static java.util.Arrays.asList;

import java.util.function.Supplier;

import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Filler;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.component.Text.TextWeight;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.container.BubbleStyles;
import com.linecorp.bot.model.message.flex.unit.FlexAlign;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;
import com.linecorp.bot.model.message.flex.unit.FlexMarginSize;

public class TugasUI implements Supplier<FlexMessage> {
    @Override
    public FlexMessage get() {
        final BubbleStyles styletugas = createStyle();
        final Box kepalanya = createHeader();
        final Box bodyBlock = createBodyBlock();
        final Bubble bubble =
                Bubble.builder()
                        .header(kepalanya)
                        .styles(styletugas)
                        .body(bodyBlock)
                        .build();

        return new FlexMessage("ALT", bubble);
    }

    private Box createHeader() {
        final Text title =
                Text.builder()
                        .text("Semangat STI !")
                        .weight(TextWeight.BOLD)
                        .size(FlexFontSize.XL)
                        .color("#000000")
                        .align(FlexAlign.CENTER)
                        .build();

        return Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(title)
                .height("50px")
                .paddingTop("10px")
                .paddingBottom("15px")
                .build();
    }

    private BubbleStyles createStyle() {
        final BubbleStyles.BlockStyle p = BubbleStyles.BlockStyle.builder().backgroundColor("#f8c414").build();
        final BubbleStyles.BlockStyle b = BubbleStyles.BlockStyle.builder().backgroundColor("#ffffff").build();
        final BubbleStyles akhiran =
                    BubbleStyles.builder()
                        .header(p)
                        .body(b)
                        .build();
        return akhiran;
    }

    private Box createBodyBlock() {

        final Box totalTask = createTotalTaskBox();

        final Box namaTugas = createNamaTugasBox();

        return Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(asList(totalTask, namaTugas))
                .build();
    }

    private Box createNamaTugasBox() {
        final Box nama1 = Box
                .builder()
                .layout(FlexLayout.BASELINE)
                .spacing(FlexMarginSize.SM)
                .contents(asList(
                        Text.builder()
                                .text("NA")
                                .color("#aaaaaa")
                                .size(FlexFontSize.Md)
                                .flex(1)
                                .build(),
                        Text.builder()
                                .text("Sistem Embedded")
                                .wrap(true)
                                .color("#292929")
                                .weight(TextWeight.BOLD)
                                .size(FlexFontSize.Md)
                                .flex(5)
                                .build()
                ))
                .build();
        final Box desc1 =
                Box.builder()
                        .layout(FlexLayout.BASELINE)
                        .spacing(FlexMarginSize.SM)
                        .contents(asList(
                                Filler.builder()
                                        .flex(1)
                                        .build(),
                                Text.builder()
                                        .text("Beli ESP32")
                                        .wrap(true)
                                        .color("#464E51")
                                        .size(FlexFontSize.SM)
                                        .flex(5)
                                        .build()
                        ))
                        .build();
        final Box nama2 = Box
                .builder()
                .layout(FlexLayout.BASELINE)
                .spacing(FlexMarginSize.SM)
                .contents(asList(
                        Text.builder()
                                .text("NA")
                                .color("#aaaaaa")
                                .size(FlexFontSize.Md)
                                .flex(1)
                                .build(),
                        Text.builder()
                                .text("Jaringan Komputer")
                                .wrap(true)
                                .color("#292929")
                                .weight(TextWeight.BOLD)
                                .size(FlexFontSize.Md)
                                .flex(5)
                                .build()
                ))
                .build();
        final Box desc2 =
                Box.builder()
                        .layout(FlexLayout.BASELINE)
                        .spacing(FlexMarginSize.SM)
                        .contents(asList(
                                Filler.builder()
                                        .flex(1)
                                        .build(),
                                Text.builder()
                                        .text("Install Ms Office 365 \n Install Cisco Packet Tracer")
                                        .wrap(true)
                                        .color("#464E51")
                                        .size(FlexFontSize.SM)
                                        .flex(5)
                                        .build()
                        ))
                        .build();
        final Box nama3 = Box
                .builder()
                .layout(FlexLayout.BASELINE)
                .spacing(FlexMarginSize.SM)
                .contents(asList(
                        Text.builder()
                                .text("NA")
                                .color("#aaaaaa")
                                .size(FlexFontSize.Md)
                                .flex(1)
                                .build(),
                        Text.builder()
                                .text("OOP")
                                .wrap(true)
                                .color("#292929")
                                .weight(TextWeight.BOLD)
                                .size(FlexFontSize.Md)
                                .flex(5)
                                .build()
                ))
                .build();
        final Box desc3 =
                Box.builder()
                        .layout(FlexLayout.BASELINE)
                        .spacing(FlexMarginSize.SM)
                        .contents(asList(
                                Filler.builder()
                                        .flex(1)
                                        .build(),
                                Text.builder()
                                        .text("Install Java Compiler")
                                        .wrap(true)
                                        .color("#464E51")
                                        .size(FlexFontSize.SM)
                                        .flex(5)
                                        .build()
                        ))
                        .build();

        return Box.builder()
                .layout(FlexLayout.VERTICAL)
                .margin(FlexMarginSize.LG)
                .spacing(FlexMarginSize.SM)
                .contents(asList(nama1, desc1, nama2, desc2, nama3, desc3))
                .build();
    }

    private Box createTotalTaskBox() {
        final Text point =
                Text.builder()
                        .text("3 ongoing tasks")
                        .size(FlexFontSize.SM)
                        .color("#999999")
                        .align(FlexAlign.START)
                        .build();

        return Box.builder()
                .layout(FlexLayout.BASELINE)
                .margin(FlexMarginSize.XS)
                .contents(point)
                .build();
    }
}
