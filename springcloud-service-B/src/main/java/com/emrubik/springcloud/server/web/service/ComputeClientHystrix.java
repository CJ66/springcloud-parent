/*******************************************************************************
 * @(#)ComputeClientHystrix.java 2017年2月14日
 *
 * Copyright 2017 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.springcloud.server.web.service;

import org.springframework.stereotype.Component;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2017年2月14日 下午4:27:11
 */
@Component
public class ComputeClientHystrix implements ComputeClient  {

    /** 
     * add TODO 这里请补充overriding方法的简要说明
     * @param a
     * @param b
     * @return TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see com.didispace.service.ComputeClient#add(java.lang.Integer, java.lang.Integer)
     */
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }

}
