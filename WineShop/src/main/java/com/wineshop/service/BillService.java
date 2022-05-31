package com.wineshop.service;

import java.util.List;

import com.wineshop.entity.Bill;
import com.wineshop.entity.BillDetail;
import com.wineshop.entity.BillStatus;

public interface BillService {
	public long countTotalRecordsBill();
	public List<Bill> getAllBill(int start, int limit);
	public List<BillStatus> getAllBillStatus();
	public boolean updateBillStatus(int id);
	public boolean removeBill(int id);
	
	public List<BillDetail> getBillDetail(int idBill);
	public Bill getOneBill(int idBill);
}
