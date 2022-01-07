package com.cc.crm.workbench.service;

import com.cc.crm.workbench.domain.Activity;
import com.cc.crm.workbench.domain.ActivityRemark;
import com.cc.crm.vo.PaginationVo;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    boolean save(Activity at);

    PaginationVo<Activity> pageList(Map<String, Object> map);

    boolean delete(String[] ids);

    Map<String, Object> getUserListAndActivity(String id);

    boolean update(Activity at);

    Activity detail(String id);

    List<ActivityRemark> getRemarkListByAid(String id);

    boolean deleteRemark(String id);

    boolean saveRemark(ActivityRemark ar);

    boolean updateRemark(ActivityRemark ar);

    List<Activity> getActivityListByClueId(String clueId);

    List<Activity> getActivityListByNameAndNotByClueId(Map<String, Object> map);

    List<Activity> getActivityListByName(String aname);
}
