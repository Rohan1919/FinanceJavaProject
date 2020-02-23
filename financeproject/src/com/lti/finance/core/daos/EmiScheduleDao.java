package com.lti.finance.core.daos;

import java.util.List;

import com.lti.finance.core.entities.EmiSchedule;
import com.lti.finance.core.exception.FinanceException;


public interface EmiScheduleDao {

	boolean setEmiSchedule(List<EmiSchedule> emiSchedule) throws FinanceException;

}
