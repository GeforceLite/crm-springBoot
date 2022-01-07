package com.cc.crm.workbench.service;

import com.cc.crm.workbench.domain.Clue;
import com.cc.crm.workbench.domain.Tran;

public interface ClueService {
    boolean save(Clue clue);

    Clue detail(String id);

    boolean unbund(String id);

    boolean bund(String[] aid, String cid);

    boolean convert(String clueId, Tran t, String createBy);
}
