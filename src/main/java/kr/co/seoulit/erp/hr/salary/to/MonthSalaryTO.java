package kr.co.seoulit.erp.hr.salary.to;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(MonthSalaryPKcombine.class)
@Table(name = "MONTH_SALARY")
public class MonthSalaryTO implements Serializable {
	@Id
	private String empCode;
	@Id
	private String applyYearMonth;
	private String deptCode;
	private String salary, totalExtSal, totalPayment, totalDeduction, realSalary, bonus, finalizeStatus;
	private String mealAllowance, ownerCarSub, totalTaxSal;
	private String empName;
//	private ArrayList<MonthDeductionTO> monthDeductionList;
//	private ArrayList<MonthExtSalTO> monthExtSalList;
}
