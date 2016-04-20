//package com.yhyw.erp.timetask.sales;
//
//import java.text.MessageFormat;
//import java.util.List;
//import java.util.concurrent.CountDownLatch;
//
//import javax.annotation.Resource;
//
//import org.apache.commons.lang.exception.ExceptionUtils;
//import org.springframework.stereotype.Component;
//
//import com.yao.log.util.YaoLogger;
//import com.yhyw.erp.business.sd.ChildOrderService;
//import com.yhyw.erp.business.sd.OrderInterfaceService;
//import com.yhyw.erp.business.sd.OrderRelatedService;
//import com.yhyw.erp.common.config.CommonConstant;
//import com.yhyw.erp.common.config.ModuleConstant;
//import com.yhyw.erp.common.threads.MoreThreadJobBaseManager;
//import com.yhyw.erp.constant.JobDataConstant;
//import com.yhyw.erp.sd.model.po.SdChildSalesOrderPO;
//
///**
// * 定时推送订单转DO
// */
//@Component
//public class SysPushOrderToDoManager extends MoreThreadJobBaseManager<SdChildSalesOrderPO>{
//    protected final static YaoLogger logger = YaoLogger.getLogger(ModuleConstant.OMS_CODE, ModuleConstant.MODULE_ORDER, SysPushOrderToDoManager.class);
//    @Resource
//    private OrderRelatedService orderRelatedService;
//    @Resource
//    private OrderInterfaceService orderInterfaceService;
//    @Resource
//    private ChildOrderService childOrderService;
//
//    @Override
//    protected Runnable dispose(CountDownLatch lotch,List<SdChildSalesOrderPO> list) {
//        /**
//         * 返回处理程序
//         */
//        return new SysPushOrderToDoThread(lotch,list);
//    }
//
//    @Override
//    protected List<SdChildSalesOrderPO> getData() {
//        List<SdChildSalesOrderPO> list = childOrderService.queryNeedPush2WmsOrderList(JobDataConstant.LIMIT_COUNT_2000);
//        if(list == null || list.size() <= 0){
//            throw new RuntimeException("暂无满足推送要求的数据...");
//        }
//        return list;
//    }
//
//    @Override
//    protected YaoLogger getLogger() {
//        return logger;
//    }
//
//    @Override
//    protected String taskDescribe() {
//        return "系统定时推送订单转DO";
//    }
//
//    private class SysPushOrderToDoThread extends Thread {
//        /**
//         * 计数器
//         */
//        private CountDownLatch lotch;
//
//        private List<SdChildSalesOrderPO> list ;
//
//        public SysPushOrderToDoThread(CountDownLatch lotch,List<SdChildSalesOrderPO> list) {
//            super();
//            this.lotch = lotch;
//            this.list = list;
//        }
//
//        private void afterDispose(){
//            lotch.countDown();
//        }
//
//        public void run() {
//            long begin = System.currentTimeMillis();
//            for(SdChildSalesOrderPO childPO : list){
//                try {
//                    int rs = childOrderService.updateChildOrderDealFlag(childPO.getChildOrderKey(), 1, childPO.getUpdateTime());
//                    if(rs == 1){
//                        orderRelatedService.doSysPushOrder2Do(childPO.getChildSalesOrderId());
//                    }
//                } catch (Exception e) {
//                    try {
//                        childOrderService.pushDOFailureCountAddSelf(childPO.getChildSalesOrderId());
//                        logger.error(true, childPO.getChildSalesOrderId(), "系统定时推送订单转DO异常,信息:"+e.getMessage(),e);
//                        orderInterfaceService.doAddOrderExceptionLog(childPO.getChildSalesOrderId(), 0, "订单转DO", CommonConstant.SYS_NAME, "信息:"+ ExceptionUtils.getStackTrace(e));
//                    } catch (Exception e2) {
//                        logger.debug(true,childPO.getChildSalesOrderId(),"推DO失败次数自增 or 添加订单异常信息失败...",e2);
//                    }
//                }finally {
//                    childOrderService.updateChildOrderDealFlag(childPO.getChildOrderKey(), 0, null);
//                }
//            }
//
//            logger.error(MessageFormat.format("子线程【{0}】系统定时推送订单转DO：耗时-> {1}", new Object[]{
//                    Thread.currentThread().getName(),System.currentTimeMillis()-begin
//            }));
//            this.afterDispose(/*计数统计相关操作*/);
//        }
//    }
//}
