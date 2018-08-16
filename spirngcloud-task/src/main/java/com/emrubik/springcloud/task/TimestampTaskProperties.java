/*******************************************************************************
 * @(#)TimestampTaskProperties.java 2017年3月20日
 *
 * Copyright 2017 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.springcloud.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.Assert;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2017年3月20日 上午9:59:47
 */
@ConfigurationProperties
public class TimestampTaskProperties {
    /**
     * The timestamp format, "yyyy-MM-dd HH:mm:ss.SSS" by default.
     */
    private String format = "yyyy-MM-dd HH:mm:ss.SSS";

    public String getFormat() {
        Assert.hasText(format, "format must not be empty nor null");
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
