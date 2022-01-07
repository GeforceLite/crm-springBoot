package com.cc.crm.workbench.service;

import com.cc.crm.workbench.domain.Tran;
import com.cc.crm.workbench.domain.TranHistory;

import java.util.List;

public interface TranService {
    boolean save(Tran t, String customerName);

    Tran detail(String id);

    List<TranHistory> getHistoryListByTranId(String TranId);

    boolean changeStage(Tran t);
}
