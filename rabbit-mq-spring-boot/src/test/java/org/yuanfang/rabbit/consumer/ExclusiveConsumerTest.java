package org.yuanfang.rabbit.consumer;

import lombok.SneakyThrows;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;
import org.yuanfang.BaseTest;
import org.yuanfang.rabbit.common.constant.SpringConstant;

/**
 * @Author: chenfangzhi
 * @Description:
 * @Date: 2018/9/25-22:08
 * @ModifiedBy:
 */
@ActiveProfiles(SpringConstant.CONSUMER_EXCLUSIVE_PROFILE)
public class ExclusiveConsumerTest extends BaseTest {

    @Test
    @SneakyThrows
    public void test() {
        System.in.read();
    }
}